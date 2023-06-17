grammar FracLang;

program: (stat ';' )*  EOF;

stat:   'display' expr          #StatDisplay
        | ID '<=' expr          #StatAssignment
        ;
expr:     expr op=('*' | ':') expr  #ExprMulDiv
        | expr op=('+'| '-') expr   #ExprSumLess
        | '-' expr                  #ExprNegative
        | 'reduce' expr             #ExprReduce
        | 'read' STRING             #ExprRead
        | '(' expr ')'              #ExprParent
        | NUMBER '/' NUMBER         #ExprFraction
        | NUMBER                    #ExprNumber
        | ID                        #ExprID
        ;

NUMBER: [0-9]+ ;
ID: [a-z_]+ ;
STRING: '"' .*? '"';
WS: [ \t\n\r]+ -> skip;
COMMENT: '--' .*? '\n' -> skip;