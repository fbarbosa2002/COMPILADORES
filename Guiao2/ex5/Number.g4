grammar Number;

stat : line* EOF;

line : Num '-' ID '\n';

Num: [0-9]+;
ID: [a-z]+;
WS: [ \t\r] -> skip;