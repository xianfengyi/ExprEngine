grammar ExprEngine;

expression
 : predicate
 ;

predicate
 : left=predicate logicalOperator right=predicate             #logicalPredicate
 | left=predicate comparisonOperator right=predicate          #comparisonPredicate
 | expressionAtom notOperator=NOT? LIKE expressionAtom        #likePredicate
 | expressionAtom                                             #exprAtomPredicate
 ;

expressionAtom
 : constant                                                   #constantExprAtom
 | param                                                      #paramExprAtom
 | caseWhen                                                   #caseWhenExprAtom
 | '(' expression ')'                                         #bracketExprAtom
 | left=expressionAtom mathMdOperator right=expressionAtom    #mathMDExprAtom
 | left=expressionAtom mathPmOperator right=expressionAtom    #mathPMExprAtom
 ;

logicalOperator
 : AND | '&' '&' | OR | '|' '|'
 ;

comparisonOperator
 : '=' | '>' | '<' | '<' '=' | '>' '='
 | '<' '>' | '!' '=' | '<' '=' '>'
 ;

caseWhen
 : CASE caseItem+ (ELSE elseArg=expressionAtom)? END
 ;

caseItem
 : WHEN condition=predicate THEN consequent=expressionAtom
 ;

constant
 : stringLiteral | decimalLiteral | floatLiteral | '-' decimalLiteral
 | booleanLiteral
 | IDENTIFIER
 ;

stringLiteral
 : (STRING_LITERAL) STRING_LITERAL+
 | STRING_LITERAL
 ;

floatLiteral
 : decimalLiteral DOT decimalLiteral
 ;

decimalLiteral
 : DECIMAL_LITERAL
 ;

booleanLiteral
 : TRUE | FALSE
 ;

param
 : '$$' name=paramIdentifier
 ;

paramIdentifier : IDENTIFIER (. IDENTIFIER)* ;

mathPmOperator : PLUS | MINUS ;

mathMdOperator : MUL | DIV ;

AND:                                 'AND'|'and';
CASE:                                'CASE'|'case';
DECIMAL_LITERAL:                     DEC_DIGIT+;
DIV                                  : '/' ;
DOT:                                 '.';
ELSE:                                'ELSE'|'else';
END:                                 'END'|'end';
FALSE:                               'FALSE'|'false';
LIKE:                                'LIKE'|'like';
MINUS                                : '-' ;
MUL                                  : '*' ;
NOT:                                 'NOT'|'not';
OR:                                  'OR'|'or';
PLUS                                 : '+' ;
STRING_LITERAL:                      DQUOTA_STRING | SQUOTA_STRING | BQUOTA_STRING;
THEN:                                'THEN'|'then';
TRUE:                                'TRUE'|'true';
WHEN:                                'WHEN'|'when';
IDENTIFIER:                          [A-Z0-9a-z_]+;


fragment DQUOTA_STRING:              '"' ( '\\'. | '""' | ~('"'| '\\') )* '"';
fragment SQUOTA_STRING:              '\'' ('\\'. | '\'\'' | ~('\'' | '\\'))* '\'';
fragment BQUOTA_STRING:              '`' ( '\\'. | '``' | ~('`'|'\\'))* '`';
fragment HEX_DIGIT:                  [0-9A-F];
fragment DEC_DIGIT:                  [0-9];