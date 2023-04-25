grammar CalcFrac;

program: stat* EOF;

stat:   print NEWLINE           #StatPrin
    |   assignment NEWLINE      #StatAssign
    |   NEWLINE                 #StatNew
    ;

print: 'print' expr ';'
    ;


assignment: expr '->' ID;

expr: 'reduce' expr                 #ExprReduce   
    | 'read' Text                   #ExprRead
    | expr op=('*' | '/') expr      #ExprMulDiv
    | expr op=('+' | '-') expr      #ExprAddSub
    | '(' expr ')'                  #ExprParent
    | Number '/' Number             #ExprNumbarNum
    | Number                        #ExprNum
    | ID                            #ExprId
    ;

Number: [0-9]+;
ID: [a-zA-Z_]+;

Text: '"' .*? '"';
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
