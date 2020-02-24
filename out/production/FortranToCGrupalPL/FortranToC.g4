grammar FortranToC ;

//Regular expression for language recognition and tokenization
prg : (IDENT | NUM_INT_CONST | NUM_REAL_CONST | STRING_CONST)+ ;

//Token Recognition in lexer
IDENT : ALPHA(ALPHA | '_' | DIGIT)* ;

NUM_INT_CONST : '-'?DIGIT+ ;

NUM_REAL_CONST : '-'?DIGIT+(('.'DIGIT+)?[Ee]'-'? | '.')DIGIT+ ;

STRING_CONST : ('"'(ALPHA | DIGIT | PUNCTUATION | SIGNS)+'"' | '\''(ALPHA | DIGIT | PUNCTUATION | SIGNS)+'\'')+ ;
/*{ Processing in Translator
    if (getText().charAt(0) == '"') {
        setText(getText().replaceAll("\"\"","\""));
    }
    else { // first char is '\''
        setText(getText().replaceAll("\'\'","\'"));
    }

    setText(getText().substring(1, getText().length()-1));
    System.out.println(getText());
};*/

COMMENT : '!'(ALPHA | DIGIT | PUNCTUATION | SIGNS)+ -> skip ;

S : SCAPES+ -> skip ;

//Fragmets
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
