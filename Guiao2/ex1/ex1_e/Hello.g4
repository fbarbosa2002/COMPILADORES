grammar Hello;

// parser part with 'hello' and ID 
program : greetings* EOF;
greetings : ('hello' | 'bye' ) ID+;


// lexer part
ID: [a-zA-Z]    + ;    // 1 or more repetitions of a to z
WS: [ \t\n\r]+ -> skip ;