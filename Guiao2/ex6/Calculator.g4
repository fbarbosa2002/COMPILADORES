grammar Calculator;

program: 
    stat * EOF
    ;

stat:
    assignment? NEWLINE                 #Assig
|   expr? NEWLINE                       #Exp
    ;
assignment:
    ID '=' expr; 
expr: 
    expr op=('*' | '/' | '%') expr      #ExprMultDivMod
  | expr op=('+' | '-') expr            #ExprAddSub
  | Integer                             #ExprInteger
  | '(' expr ')'                        #ExprParent
  | ID                                  #ExprId
  ;
ID: [a-zA-Z_]+;
Integer:   [0-9]+;                      // implement with long integers
NEWLINE:   '\r'? '\n';
WS:         [ \t]+ -> skip;
COMMENT:    '#' .*? '\n' -> skip;
