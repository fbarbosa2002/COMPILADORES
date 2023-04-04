grammar Hello;

// parser part with 'hello' and ID tokens
greetings : 'hello' ID;

// lexer part
ID: [a-z]+ ;    // 1 or more repetitions of a to z
WS: [ \t\n\r]+ -> skip ;