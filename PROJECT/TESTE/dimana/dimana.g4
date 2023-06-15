grammar dimana;

program: (use | stat)* EOF;

use: 'use' STRING ';';

stat:
    'for' ID '=' expr 'to' expr 'do' stat* 'end' ';'  #statFor
  | op=('write'|'writeln') expr (',' expr)* ';'       #statWrite
  | declare ('=' expr)? ';'                           #statDeclare
  | ID '=' expr ';'                                   #statAssign
  | expr '>>' ID ';'                                  #statAppend
  ;

declare:
    'list' '[' type=('integer' | 'real' | 'string' | ID) ']' var=ID                     #declareList
  | 'unit' var=ID '[' ID ',' ID ']'                                                     #declareUnit
  | 'dimension' type=('integer' | 'real') var=ID ('[' ID (',' ID)? ']')? ('=' '*''/')?  #declareDimension
  | type=('integer' | 'real' | 'string') var=ID                                         #declarePrimitiveVariable
  | ID var=ID                                                                           #declareDimensionVariable
  ;

expr:
    'new' 'list' '[' type=('integer' | 'real' | 'string' | ID) ']'  #exprNewList
  | ID '[' expr ']'                                                 #exprIndex
  | type=('integer' | 'real') '(' expr ')'                          #exprCast
  | 'read' STRING                                                   #exprRead
  | 'length' '(' expr ')'                                           #exprLength
  | 'string' '(' expr (',' expr)?')'                                #exprStringFormat
  | expr op=('*' | '/') expr                                        #exprMulDiv
  | expr op=('+' | '-') expr                                        #exprAddSub
  | STRING                                                          #exprString
  | NUMBER                                                          #exprNumber
  | ID                                                              #exprID
  ;

STRING: '"' .*? '"';
NUMBER: [0-9]+('.'[0-9]+)?;
ID: [a-zA-Z_]+;

COMMENT: '#' .*? '\n' -> skip;
WS: [ \t\r\n]+ -> skip;