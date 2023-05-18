// Lexical Mode grammar example

lexer grammar ModLexer;

OPEN_BRACE: '{' -> pushMode(INSIDE) ;
OTHER: ~[{]+;

mode INSIDE;

CLOSE_BRACE: '}' -> popMode;
OPEN_BRACE_INSIDE: '{' -> pushMode(INSIDE) ;

OTHER_INSIDE: ~[{}]+ ;
