grammar FortranToC ;

@members {
    void printConst(String ident, String value) {
        System.out.println("#defines " + ident + " " + value + ";");
    }

    FunctionDeclarationTranslator fdt = new FunctionDeclarationTranslator();
}

// Token combination rules in parser
// Main

prg
    : 'PROGRAM' IDENT ';' dcllist cabecera {System.out.println("void main (void)\n{");}sent sentlist {System.out.println("}");} 'END'
    'PROGRAM' IDENT subproglist {  } ;

dcllist
    : dcl dcllist {  }
    |
    ;

cabecera : 'INTERFACE' cablist 'END' 'INTERFACE' | ;

cablist : decproc decsubprog | decfun decsubprog ;

decsubprog : decproc decsubprog | decfun decsubprog | ;

sentlist: sent sentlist | ;

// VAR and CONST Declaration area

// dcl : defcte | defvar ; CHANGED FOR FIXING LEFT RECURSION LLK -> LL1

dcl
    : tipo ',' 'PARAMETER' '::' IDENT '=' simpvalue { printConst($IDENT.text, $simpvalue.value); } ctelist ';' defcte
    | tipo '::' varlist ';' defvar {}
    ; // LL1

defcte
    : tipo ',' 'PARAMETER' '::' IDENT '=' simpvalue { printConst($IDENT.text, $simpvalue.value); } ctelist ';' defcte
    |
    ;

ctelist
    : ',' IDENT '=' simpvalue { printConst($IDENT.text, $simpvalue.value); } ctelist
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
    : 'SUBROUTINE' IDENT formal_paramlist
    dec_s_paramlist
    'END' 'SUBROUTINE' IDENT { fdt.printProcHeader($IDENT.text) ; } ;

formal_paramlist
    :
    | '(' nomparamlist ')' ;

nomparamlist
    : IDENT { fdt.getIdents().add($IDENT.text) ; }
    | IDENT ',' nomparamlist { fdt.getIdents().add($IDENT.text) ; } ; // LL1

dec_s_paramlist
    : tipo { fdt.getTypes().add($tipo.type) ; } ',' 'INTENT' '(' tipoparam ')' IDENT ';'
    dec_s_paramlist
    | ;

tipoparam : 'IN' | 'OUT' | 'INOUT' ;

decfun : 'FUNCTION' IDENT '(' nomparamlist ')'
    tipo '::' IDENT ';' { fdt.getTypes().add($tipo.type) ; }
    dec_f_paramlist
    'END' 'FUNCTION' IDENT { fdt.printFuncHeader($IDENT.text) ; } ;

dec_f_paramlist : tipo { fdt.getTypes().add($tipo.type) ; } ',' 'INTENT' '(' 'IN' ')' IDENT ';'
    dec_f_paramlist
    | ;

// Statement area

// Optional part added to sent
sent : IDENT '=' exp ';' | proc_call ';'
    | 'IF' '(' expcond ')' sent
    | 'IF' '(' expcond ')' 'THEN' sentlist 'ENDIF'
    | 'IF' '(' expcond ')' 'THEN' sentlist 'ELSE' sentlist 'ENDIF'
    | 'DO' 'WHILE' '(' expcond ')' sentlist 'ENDDO'
    | 'DO' IDENT '=' doval ',' doval ',' doval sentlist 'ENDDO'
    | 'SELECT' 'CASE' '(' exp ')' casos 'END' 'SELECT' ;

doval : NUM_INT_CONST | IDENT ; // Optional included

casos : 'CASE' '(' etiquetas ')' sentlist casos // Optional included
    | 'CASE' 'DEFAULT' sentlist
    | ;

etiquetas : simpvalue listaetiqetas // Optional included
    | simpvalue ':' simpvalue
    | ':' simpvalue
    | simpvalue ':' ;

listaetiqetas : ',' simpvalue | ; // Optional included

// Optional finished

// exp : exp op exp | factor CHANGED TO BE LL1 with expAux

exp : factor expAux ;

expAux : op exp expAux | ;

op : oparit ;

oparit : '+' | '-' | '*' | '/' ;

factor
    : simpvalue
    | '(' exp ')'
    | IDENT '(' exp explist ')' { fdt.getFactors().add($IDENT.text); }
    | IDENT { fdt.getFactors().add($IDENT.text); } ;

explist : ',' exp explist | ;

proc_call
    : 'CALL' IDENT subpparamlist { fdt.printSubprogram($IDENT.text); } ;

subpparamlist : '(' exp explist ')' | ;

// Function Implementation area

subproglist
    : codproc subproglist
    | codfun subproglist
    |
    ;

codproc
    : 'SUBROUTINE' IDENT formal_paramlist
    dec_s_paramlist { fdt.printProcImplementation($IDENT.text) ; }
    dcllist sent sentlist
    'END' 'SUBROUTINE' IDENT { System.out.println("}"); } ;

codfun
    : 'FUNCTION' IDENT '(' nomparamlist ')'
    tipo '::' IDENT ';'
    dec_f_paramlist
    dcllist sent sentlist
    IDENT '=' exp ';' {  }
    'END' 'FUNCTION' IDENT { System.out.println("}"); } ;

// Optional parser implementation
// Flow control statements

expcond : expcond oplog expcond | factorcond ;

oplog : '.OR.' | '.AND.' | '.EQV.' | '.NEQV.' ;

factorcond : exp opcomp exp | '(' expcond ')' | '.NOT.' factorcond | '.TRUE.' | '.FALSE.' ;

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
