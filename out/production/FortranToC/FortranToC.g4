grammar FortranToC ;

// Token combination rules in parser
// Main

prg : 'PROGRAM' IDENT ';' dcllist cabecera sent sentlist 'END'
    'PROGRAM' IDENT subproglist ;

dcllist : dcl dcllist | ;

cabecera : 'INTERFACE' cablist 'END' 'INTERFACE' | ;

cablist : decproc decsubprog | decfun decsubprog ;

decsubprog : decproc decsubprog | decfun decsubprog | ;

sentlist: sent sentlist | ;

// VAR and CONST Declaration area

// dcl : defcte | defvar ; CHANGED FOR FIXING LEFT RECURSION LLK -> LL1

dcl : tipo ',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';'
    defcte | tipo '::' varlist ';' defvar ; // LL1

defcte : tipo ',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';'
    defcte
    | ;

ctelist : ',' IDENT '=' simpvalue ctelist | ;

simpvalue : NUM_INT_CONST | NUM_REAL_CONST | STRING_CONST | NUM_INT_CONST_B | NUM_INT_CONST_O | NUM_INT_CONST_H ; // Optional included

defvar : tipo '::' varlist ';' defvar | ;

tipo : 'INTEGER' | 'REAL' | 'CHARACTER' charlength ;

charlength : '(' NUM_INT_CONST ')' | ;

varlist : IDENT init | IDENT init ',' varlist ; // LLK -> ANTLR produces LL1 checking the longest production first

init : '=' simpvalue | ;

// Function Declaration area

decproc : 'SUBROUTINE' IDENT formal_paramlist
    dec_s_paramlist
    'END' 'SUBROUTINE' IDENT ;

formal_paramlist : | '(' nomparamlist ')' ;

nomparamlist : IDENT | IDENT ',' nomparamlist ; // LL1

dec_s_paramlist : tipo ',' 'INTENT' '(' tipoparam ')' IDENT ';'
    dec_s_paramlist
    | ;

tipoparam : 'IN' | 'OUT' | 'INOUT' ;

decfun : 'FUNCTION' IDENT '(' nomparamlist ')'
    tipo '::' IDENT ';'
    dec_f_paramlist
    'END' 'FUNCTION' IDENT ;

dec_f_paramlist : tipo ',' 'INTENT' '(' 'IN' ')' IDENT ';'
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

factor : simpvalue | '(' exp ')' | IDENT '(' exp explist ')' | IDENT ;

explist : ',' exp explist | ;

proc_call : 'CALL' IDENT subpparamlist ;

subpparamlist : '(' exp explist ')' | ;

// Function Implementation area

subproglist : codproc subproglist | codfun subproglist | ;

codproc : 'SUBROUTINE' IDENT formal_paramlist
    dec_s_paramlist
    dcllist sent sentlist
    'END' 'SUBROUTINE' IDENT ;

codfun : 'FUNCTION' IDENT '(' nomparamlist ')'
    tipo '::' IDENT ';'
    dec_f_paramlist
    dcllist sent sentlist
    IDENT '=' exp ';'
    'END' 'FUNCTION' IDENT ;

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
