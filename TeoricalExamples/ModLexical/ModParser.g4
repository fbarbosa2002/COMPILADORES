parser grammar ModParser;

options {tokenVocab = ModLexer ;}

main : (OPEN_BRACE | OTHER | CLOSE_BRACE | OTHER_INSIDE | OPEN_BRACE_INSIDE)* EOF;