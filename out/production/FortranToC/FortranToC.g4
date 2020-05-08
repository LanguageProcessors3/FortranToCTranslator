grammar FortranToC ;

@members {
    ConstTranslator ct = new ConstTranslator();
    HeaderTranslator hdt = new HeaderTranslator();
    SentTranslator st = new SentTranslator();
    ImplementationsTranslator imt = new ImplementationsTranslator();
}

// Token combination rules in parser
// Main

prg
    : 'PROGRAM' IDENT ';' dcllist cabecera { System.out.println("void main (void) {") ; } sent[true] sentlist[true] { System.out.println("}") ; } 'END'
    'PROGRAM' IDENT subproglist {  } ;

dcllist
    : dcl dcllist {  }
    |
    ;

cabecera : 'INTERFACE' cablist 'END' 'INTERFACE' | ;

cablist : decproc decsubprog | decfun decsubprog ;

decsubprog : decproc decsubprog | decfun decsubprog | ;

sentlist[boolean isIsolated]
    : sent[$isIsolated] sentlist[$isIsolated]
    | ;

// VAR and CONST Declaration area

// dcl : defcte | defvar ; CHANGED FOR FIXING LEFT RECURSION LLK -> LL1

dcl
    : tipo ',' 'PARAMETER' '::' IDENT '=' simpvalue { ct.saveConst($IDENT.text, $simpvalue.value) ; } ctelist ';' defcte
    | tipo '::' varlist ';' defvar {}
    ; // LL1

defcte
    : tipo ',' 'PARAMETER' '::' IDENT '=' simpvalue { ct.saveConst($IDENT.text, $simpvalue.value) ; } ctelist ';' defcte
    |
    ;

ctelist
    : ',' IDENT '=' simpvalue { ct.saveConst($IDENT.text, $simpvalue.value) ; } ctelist
    |
    ;

simpvalue returns [String value]
    : NUM_INT_CONST { $value = $NUM_INT_CONST.text ; } // #define int value
    | NUM_REAL_CONST { $value = $NUM_REAL_CONST.text ; } // #define float value
    | STRING_CONST { $value = $STRING_CONST.text ; } // #define char[] value
    | NUM_INT_CONST_B { $value = $NUM_INT_CONST_B.text ; } // #define 0b value
    | NUM_INT_CONST_O { $value = $NUM_INT_CONST_O.text ; } // #define 0o value
    | NUM_INT_CONST_H { $value = $NUM_INT_CONST_H.text ; } // #define 0x value
    ; // Optional included

defvar : tipo '::' varlist ';' defvar {}
    |
    ;

tipo returns [String type]
    : 'INTEGER' { $type = "int" ; }
    | 'REAL' { $type = "float" ; }
    | 'CHARACTER' charlength { $type = "char" + $charlength.num_const ; }
    ;

charlength returns [String num_const]
    : '(' NUM_INT_CONST ')' { $num_const = "[" + $NUM_INT_CONST.text + "]" ; }
    | { $num_const = "" ; }
    ;

varlist : IDENT init {}
    | IDENT init ',' varlist {}
    ; // LLK -> ANTLR produces LL1 checking the longest production first

init : '=' simpvalue {}
    |
    ;

// Function Declaration area

decproc
    : 'SUBROUTINE' IDENT formal_paramlist[true]
    dec_s_paramlist[true]
    'END' 'SUBROUTINE' IDENT { hdt.saveProcHeader($IDENT.text) ; } ;

formal_paramlist[boolean isHeader]
    :
    | '(' nomparamlist[$isHeader] ')' ;

nomparamlist[boolean isHeader]
    : IDENT { if (isHeader) hdt.getIdents().add($IDENT.text) ; else imt.getIdents().add($IDENT.text) ; }
    | IDENT ',' nomparamlist[$isHeader] { if (isHeader) hdt.getIdents().add($IDENT.text) ; else imt.getIdents().add($IDENT.text) ; } ; // LL1

dec_s_paramlist[boolean isHeader]
    : tipo { if (isHeader) hdt.getTypes().add($tipo.type) ; else imt.getTypes().add($tipo.type) ; } ',' 'INTENT' '(' tipoparam ')' IDENT ';'
    dec_s_paramlist[$isHeader]
    | ;

tipoparam : 'IN' | 'OUT' | 'INOUT' ;

decfun : 'FUNCTION' IDENT '(' nomparamlist[true] ')'
    tipo '::' IDENT ';' { hdt.getTypes().add($tipo.type) ; }
    dec_f_paramlist[true]
    'END' 'FUNCTION' IDENT { hdt.saveFuncHeader($IDENT.text) ; } ;

dec_f_paramlist[boolean isHeader]
    : tipo { if (isHeader) hdt.getTypes().add($tipo.type) ; else imt.getTypes().add($tipo.type) ; } ',' 'INTENT' '(' 'IN' ')' IDENT ';'
    dec_f_paramlist[$isHeader]
    | ;

// Statement area

// Optional part added to sent
sent[boolean isIsolated]
    : IDENT '=' exp[$isIsolated] ';'
    | proc_call[$isIsolated] ';'
    | 'IF' '(' expcond[$isIsolated] ')' sent[$isIsolated]
    | 'IF' '(' expcond[$isIsolated] ')' 'THEN' sentlist[$isIsolated] 'ENDIF'
    | 'IF' '(' expcond[$isIsolated] ')' 'THEN' sentlist[$isIsolated] 'ELSE' sentlist[$isIsolated] 'ENDIF'
    | 'DO' 'WHILE' '(' expcond[$isIsolated] ')' sentlist[$isIsolated] 'ENDDO'
    | 'DO' IDENT '=' doval ',' doval ',' doval sentlist[$isIsolated] 'ENDDO'
    | 'SELECT' 'CASE' '(' exp[$isIsolated] ')' casos[$isIsolated] 'END' 'SELECT' ;

doval : NUM_INT_CONST | IDENT ; // Optional included

casos[boolean isIsolated]
    : 'CASE' '(' etiquetas ')' sentlist[$isIsolated] casos[$isIsolated] // Optional included
    | 'CASE' 'DEFAULT' sentlist[$isIsolated]
    | ;

etiquetas
    : simpvalue listaetiqetas // Optional included
    | simpvalue ':' simpvalue
    | ':' simpvalue
    | simpvalue ':' ;

listaetiqetas : ',' simpvalue | ; // Optional included

// Optional finished

// exp : exp op exp | factor CHANGED TO BE LL1 with expAux

exp[boolean isIsolated]
    : factor[$isIsolated] expAux[$isIsolated] ;

expAux[boolean isIsolated]
    : op exp[$isIsolated] expAux[$isIsolated]
    | ;

op : oparit ;

oparit
    : '+'
    | '-'
    | '*'
    | '/' ;

factor[boolean isIsolated]
    : simpvalue
    | '(' exp[$isIsolated] ')'
    | IDENT '(' exp[$isIsolated] explist[$isIsolated] ')' { if (isIsolated) st.getFactors().add($IDENT.text) ; else imt.getFactors().add($IDENT.text) ; }
    | IDENT { if (isIsolated) st.getFactors().add($IDENT.text) ; else imt.getFactors().add($IDENT.text) ; } ;

explist[boolean isIsolated]
    : ',' exp[$isIsolated] explist[$isIsolated]
    | ;

proc_call[boolean isIsolated]
    : 'CALL' IDENT subpparamlist[$isIsolated] { if (isIsolated) st.saveCall($IDENT.text) ; else imt.saveSubprogram($IDENT.text) ; } ;

subpparamlist[boolean isIsolated]
    : '(' exp[$isIsolated] explist[$isIsolated] ')'
    | ;

// Function Implementation area

subproglist
    : codproc subproglist
    | codfun subproglist
    |
    ;

codproc
    : 'SUBROUTINE' IDENT formal_paramlist[false]
    dec_s_paramlist[false] { imt.saveProcHeadImplementation($IDENT.text) ; }
    dcllist sent[false] sentlist[false]
    'END' 'SUBROUTINE' IDENT { imt.saveFuncImplementation(false, $IDENT.text); } ;

codfun : 'FUNCTION' IDENT '(' nomparamlist[false] ')'
    tipo '::' IDENT ';' { imt.getTypes().add($tipo.type) ; }
    dec_f_paramlist[false] { imt.saveFuncHeadImplementation($IDENT.text) ; }
    dcllist sent[false] sentlist[false]
    IDENT '=' exp[false] ';' {  }
    'END' 'FUNCTION' IDENT { imt.saveFuncImplementation(true, $IDENT.text) ; } ;

// Optional parser implementation
// Flow control statements

expcond[boolean isIsolated]
    : expcond[$isIsolated] oplog expcond[$isIsolated]
    | factorcond[$isIsolated] ;

oplog : '.OR.' | '.AND.' | '.EQV.' | '.NEQV.' ;

factorcond[boolean isIsolated]
    : exp[$isIsolated] opcomp exp[$isIsolated]
    | '(' expcond[$isIsolated] ')'
    | '.NOT.' factorcond[$isIsolated]
    | '.TRUE.'
    | '.FALSE.' ;

opcomp : '<' | '>' | '<=' | '>=' | '==' | '/=' ;


// Token Recognition in lexer

IDENT : ALPHA(ALPHA | '_' | DIGIT)* ;

NUM_INT_CONST : '-'?DIGIT+ ;

NUM_REAL_CONST : '-'?DIGIT+(('.'DIGIT+)?[Ee]'-'? | '.')DIGIT+ ;

STRING_CONST : (('\''(ALPHA+ | DIGIT+| ' ' | '\'\'' | '"')*'\'' | '"'(ALPHA+ | DIGIT+ | ' ' | '""' | '\'')*'"') (' + ')?)+ ;

COMMENT : '!'(ALPHA | DIGIT | PUNCTUATION | SIGNS)+ -> skip ;

S : SCAPES+ -> skip ;

// Optional lexer implementation

NUM_INT_CONST_B : 'b\''[01]+'\'' ;

NUM_INT_CONST_O : 'o\''[0-7]+'\'' ;

NUM_INT_CONST_H : 'z\''[0-9A-F]+'\'' ;

// Fragmets

fragment
ALPHA : [a-zA-Z] ;
fragment
DIGIT : [0-9] ;
fragment
PUNCTUATION : [.,:;] ;
fragment
SCAPES : [ \t\r\n\u000C] ;
fragment
SIGNS : ~([\t\r\n\u000C] | [,.;:] | [0-9] | [a-zA-Z]) ;
