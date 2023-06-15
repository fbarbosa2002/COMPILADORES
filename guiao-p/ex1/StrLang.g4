grammar StrLang ;

program: (stat*) EOF;

stat:   'print' expr            #StatPrint
        | ID ':' expr         #StatAssign
        ;

expr:   'input' '(' expr ')'                 #ExprInput
        | expr op=('+'|'-') expr             #ExprSum
        | 'trim' expr                        #ExprTrim
        | expr '/' expr '/' expr             #ExprSwitch
        | '(' expr ')'                       #ExprParent
        | STRING                             #ExprString
        | ID                                 #ExprID
        ;

STRING: '"' .*? '"';
ID: [a-zA-Z][a-zA-Z_0-9]* ;
COMMENT: '//' .*? '\n' -> skip;
WS: [\t\n\r ]+ -> skip;