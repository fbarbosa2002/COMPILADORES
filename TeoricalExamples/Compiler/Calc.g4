grammar Calc;

main : stat* EOF;

stat: expr;

expr returns [String var = null ]:
     e1=expr op=('*' | '/') e2=expr  #ExprMultDiv
    | e1=expr op=('+' | '-') e2=expr  #ExprAddSub
    | '(' expr ')'              #ExprParent
    | Number                    #ExprNumber
    ;

Number: [0-9]+ ;
WS: [ \t\n\r]+ -> skip;
ERROR : .;