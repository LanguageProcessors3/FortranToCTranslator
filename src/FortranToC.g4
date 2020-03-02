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

dcl : tipo ',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';'
    defcte | tipo '::' varlist ';' defvar ; // LL1

defcte : tipo ',' 'PARAMETER' '::' IDENT '=' simpvalue ctelist ';'
    defcte
    | ;

ctelist : ',' IDENT '=' simpvalue ctelist | ;

simpvalue : NUM_INT_CONST | NUM_REAL_CONST | STRING_CONST ;

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

sent : IDENT '=' exp ';' | proc_call ';' ;

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

// Token Recognition in lexer

IDENT : ALPHA(ALPHA | '_' | DIGIT)* ;

NUM_INT_CONST : '-'?DIGIT+ ;

NUM_REAL_CONST : '-'?DIGIT+(('.'DIGIT+)?[Ee]'-'? | '.')DIGIT+ ;

STRING_CONST : ('"'(ALPHA | DIGIT | PUNCTUATION | SIGNS)+'"' | '\''(ALPHA | DIGIT | PUNCTUATION | SIGNS)+'\'')+ ;

COMMENT : '!'(ALPHA | DIGIT | PUNCTUATION | SIGNS)+ -> skip ;

S : SCAPES+ -> skip ;

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
