// Grammar to a semantic predicate example
// List of numbers with rules:
//      First number is the size of the list
//      Next numbers are the list
grammar PredSemant ;

all : sequence* EOF;

sequence : INT elements[$INT.int] ;
// {$n > $size}? is an example of a semantic predicate
elements[int size] locals [int n = 0]
        : ({$n < $size}? INT {$n++;})* ;

INT : [0-9]+ ;
WS: [ \t\n\r]+ -> skip ;