parser grammar SeparatorParser;

options {tokenVocab = SeparatorLexer; }
all : sequence* EOF;

sequence : INT elements[$INT.int] ;
// {$n > $size}? is an example of a semantic predicate
elements[int size] locals [int n = 0]
        : ({$n < $size}? INT {$n++;})* ;
