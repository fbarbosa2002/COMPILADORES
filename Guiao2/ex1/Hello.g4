grammar Hello;

greetings : Pilas  ID ;
Pilas: 'hello';
// Works with test: 'hello' ID | 'ola' ID
ID : [a-zA-Z0-9]+ ;
WS : [ \t\n\r]+ -> skip ; 
