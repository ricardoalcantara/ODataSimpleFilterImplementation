grammar Filter;

filter  :     expr+ ;

expr    :   expr op='and' expr                                                                  # And
        |   expr op='or' expr                                                                   # Or
        |   ID op=('eq'|'ne') STRING                                                            # StringOp
        |   ID op=('eq'|'ne'|'gt'|'ge'|'lt'|'le') INT                                           # IntOp
        |   func=('endswith'|'startswith'|'substringof') '(' ID ',' STRING ')'                  # FuncOp
        |   '(' expr ')'                                                                        # Parens
        ;

OR : 'or';
AND : 'and';

EQ  :   'eq';
NE  :   'ne';
GT  :   'gt';
GE  :   'ge';
LT  :   'lt';
LE  :   'le';

ENDSWITH : 'endswith';
STARTSWITH : 'startswith';
SUBSTRINGOF: 'substringof';

STRING : '\''.+?'\'';
ID  :   [a-zA-Z]+ ;      // match identifiers
INT :   [0-9]+ ;         // match integers
NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace