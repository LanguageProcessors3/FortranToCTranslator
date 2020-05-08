grammar FortranToC ;

@members {
    ArrayList<Constant> constants = new ArrayList<>();
    ArrayList<Header> headers = new ArrayList<>();
    ArrayList<Variable> variables = new ArrayList<>();
    ArrayList<String> statements = new ArrayList<>();
}

// Token combination rules in parser
// Main

prg
    : 'PROGRAM' IDENT ';' dcllist cabecera { System.out.println("void main (void) {") ; } sent sentlist { System.out.println("}") ; } 'END'
    'PROGRAM' IDENT subproglist {  }
    ;

dcllist
    : dcl dcllist
    |
    ;

cabecera
    : 'INTERFACE' cablist 'END' 'INTERFACE'
    |
    ;

cablist
    : decproc decsubprog
    | decfun decsubprog
    ;

decsubprog
    : decproc decsubprog
    | decfun decsubprog
    |
    ;

sentlist
    : sent sentlist
    |
    ;

// VAR and CONST Declaration area

// dcl : defcte | defvar ; CHANGED FOR FIXING LEFT RECURSION LLK -> LL1

dcl
    : tipo ',' 'PARAMETER' '::' IDENT '=' simpvalue { constants.add(new Constant($IDENT.text, $simpvalue.value)) ; } ctelist ';' defcte
    | tipo '::' varlist[$tipo.value, $tipo.size] ';' defvar
    ; // LL1

defcte
    : tipo ',' 'PARAMETER' '::' IDENT '=' simpvalue { constants.add(new Constant($IDENT.text, $simpvalue.value)) ; } ctelist ';' defcte
    |
    ;

ctelist
    : ',' IDENT '=' simpvalue { constants.add(new Constant($IDENT.text, $simpvalue.value)) ; } ctelist
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

defvar : tipo '::' varlist[$tipo.value, $tipo.size] ';' defvar
    |
    ;

tipo returns [String value, String size]
    : 'INTEGER' { $value = "int" ; $size = "" ; }
    | 'REAL' { $value = "float" ; $size = "" ; }
    | 'CHARACTER' charlength { $value = "char" ; $size = $charlength.num_const ; }
    ;

charlength returns [String num_const]
    : '(' NUM_INT_CONST ')' { $num_const = "[" + $NUM_INT_CONST.text + "]" ; }
    | { $num_const = "" ; }
    ;

varlist[String type, String size]
    : IDENT init { statements.add($type + " " + $IDENT.text + $size + $init.value + ";") ; }
    | IDENT init { statements.add($type + " " + $IDENT.text + $size + $init.value + ";") ; } ',' varlist[$type, $size]
    ; // LLK -> ANTLR produces LL1 checking the longest production first

init returns [String value]
    : '=' simpvalue { $value = " = " + $simpvalue.value ; }
    | { $value = "" ; }
    ;

// Function Declaration area

decproc
    : 'SUBROUTINE' id1=IDENT formal_paramlist
    dec_s_paramlist
    'END' 'SUBROUTINE' id2=IDENT { Header h = new Header("void", $id1.text, $id2.text);
                                   h.setParameters(variables);
                                   variables.clear();
                                   headers.add(h);
                                 }
    ;

formal_paramlist
    :
    | '(' nomparamlist ')'
    ;

nomparamlist
    : IDENT
    | IDENT ',' nomparamlist
    ; // LL1

dec_s_paramlist
    : tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';'
    { variables.add(new Variable($tipo.value, $tipoparam.value + $IDENT.text, $tipo.size)); }
    dec_s_paramlist
    |
    ;

tipoparam returns [String value]
    : 'IN' { $value = ""; }
    | 'OUT' { $value = "*"; }
    | 'INOUT' { $value = "*"; }
    ;

decfun
    : 'FUNCTION' id1=IDENT '(' nomparamlist ')'
    tipo '::' id2=IDENT ';'
    dec_f_paramlist { Header h = new Header($tipo.value, $id1.text, $id2.text);
                      h.setParameters(variables);
                      variables.clear();
                      headers.add(h);
                    }
    'END' 'FUNCTION' IDENT
    ;

dec_f_paramlist
    : tipo ',' 'INTENT' '(' 'IN' ')' IDENT ';'
    { variables.add(new Variable($tipo.value, $IDENT.text, $tipo.size));}
    dec_f_paramlist
    |
    ;

// Statement area

// Optional part added to sent
sent
    : IDENT '=' exp ';'
    | proc_call ';'
    | 'IF' '(' expcond ')' sent
    | 'IF' '(' expcond ')' 'THEN' sentlist 'ENDIF'
    | 'IF' '(' expcond ')' 'THEN' sentlist 'ELSE' sentlist 'ENDIF'
    | 'DO' 'WHILE' '(' expcond ')' sentlist 'ENDDO'
    | 'DO' IDENT '=' doval ',' doval ',' doval sentlist 'ENDDO'
    | 'SELECT' 'CASE' '(' exp ')' casos 'END' 'SELECT'
    ;

doval
    : NUM_INT_CONST
    | IDENT
    ; // Optional included

casos
    : 'CASE' '(' etiquetas ')' sentlist casos // Optional included
    | 'CASE' 'DEFAULT' sentlist
    |
    ;

etiquetas
    : simpvalue listaetiqetas // Optional included
    | simpvalue ':' simpvalue
    | ':' simpvalue
    | simpvalue ':'
    ;

listaetiqetas
    : ',' simpvalue
    |
    ; // Optional included

// Optional finished

// exp : exp op exp | factor CHANGED TO BE LL1 with expAux

exp returns [String value]
    : factor expAux { $value = $factor.value + $expAux.value ; }
    ;

expAux returns [String value]
    : op exp expAux { $value = $op.value + $ exp.value + $expAux.value ; }
    | { $value = "" ; }
    ;

op returns [String value]
    : oparit { $value = $oparit.value ; }
    ;

oparit returns [String value]
    : '+' { $value = " + " ; }
    | '-' { $value = " - " ; }
    | '*' { $value = " * " ; }
    | '/' { $value = " / " ; }
    ;

factor
    : simpvalue
    | '(' exp ')'
    | IDENT '(' exp explist ')'
    | IDENT
    ;

explist
    : ',' exp explist
    |
    ;

proc_call returns [String value]
    : 'CALL' IDENT subpparamlist { $value  = $IDENT.text + " ( " + $subpparamlist.value + " ) ;" ; } ;

subpparamlist returns [String value]
    : '(' exp explist ')' { $value = $exp.value + $explist.value ; }
    | { $value = "" ; }
    ;

// Function Implementation area

subproglist
    : codproc subproglist
    | codfun subproglist
    |
    ;

codproc
    : 'SUBROUTINE' IDENT { variables.clear() ; } formal_paramlist
    dec_s_paramlist { statements.add("void " + $IDENT.text + " (" + varListToString(variables) + ") {") ; }
    dcllist sent sentlist
    'END' 'SUBROUTINE' IDENT { statements.add("}") ; }
    ;

codfun : 'FUNCTION' IDENT '(' nomparamlist ')'
    tipo '::' IDENT ';' { variables.clear() ; }
    dec_f_paramlist { statements.add($tipo.value + " " + $IDENT.text + " (" + varListToString(variables) + ") {") ; }
    dcllist sent sentlist
    IDENT '=' exp ';' { statements.add("return " + $exp.value) ; }
    'END' 'FUNCTION' IDENT { statements.add("}") ; }
    ;

// Optional parser implementation
// Flow control statements

expcond
    : expcond oplog expcond
    | factorcond
    ;

oplog
    : '.OR.'
    | '.AND.'
    | '.EQV.'
    | '.NEQV.'
    ;

factorcond
    : exp opcomp exp
    | '(' expcond ')'
    | '.NOT.' factorcond
    | '.TRUE.'
    | '.FALSE.'
    ;

opcomp
    : '<'
    | '>'
    | '<='
    | '>='
    | '=='
    | '/='
    ;


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
