grammar Calc;

program : stat* EOF;

stat: assignment NEWLINE        #StatAssign
    | expression NEWLINE        #StatExpr
    | NEWLINE                   #StatNewLine
    ;

assignment: Var '=' expr ;

expression: expr;

expr: expr op=('&' | '\\') expr
    | expr op=('+' | '-' ) expr
    | '(' expr ')'
    ; 
Var: [a-zA-Z_]+ ;
COMMENT: '--';
NEWLINE : '\r'? '\n';
WS: [ \t]+ -> skip;