grammar Mangcalua;
//language used Java8 based from https://github.com/antlr/grammars-v4/tree/master/java/java8

compilationUnit
    : functionDeclaration* mainDeclaration EOF
    ;

mainDeclaration
    :  Void Main LeftParen RightParen blockStmt
    ;

variableDeclaration 
    : ConstantKeyword? dataType variableDeclarationInitialize Semi
    ;

dataType
    : Int
    | Bool
    | String
    | Float
    ;

arrayDataType
    : dataType LeftBracket RightBracket
    ;

variableDeclarationInitialize
    : Identifier
    | Identifier Assign simpleExpression
    ;

scopedVariableDeclaration
    : variableDeclaration
    | arrayVariableDeclaration
    ;

arrayVariableDeclaration
    : ConstantKeyword? arrayDataType arrayVariableDeclarationInitialize Semi
    ;

arrayVariableDeclarationInitialize
    : Identifier
    | Identifier Assign createArrayExpression
    | Identifier Assign mutable
    ;

dataTypeSelector
    : dataType
    | arrayDataType
    ;

functionDeclaration
    : Func (dataType | arrayDataType | Void) Identifier LeftParen params RightParen blockStmt
    ;

params
    : parameter (Comma parameter)*
    |
    ;

parameter
    : dataTypeSelector Identifier
    ;

statement
    : expressionStmt
    | scanStmt
    | printStmt
    | selectionStmt
    | iterationStmt
    | returnStmt
    ;

expressionStmt
    : (assignmentStandaloneExpression|call) Semi
    ;

blockStmt
    : LeftBrace (blockStmtBody)* RightBrace
    ;

blockStmtBody
    : scopedVariableDeclaration
    | statement
    ;

printStmt
    : Print LeftParen printParams RightParen Semi
    | Print LeftParen ((StringLiteral | Identifier) (StringLiteral | Identifier)+) {notifyErrorListeners("Missing quotation marks for these print parameters.");} RightParen Semi
    ;

printParams
    : printParamsSelector (Plus printParamsSelector)*
    | printParamsSelector Plus (printParamsSelector Plus)+ {notifyErrorListeners("Extra '+' symbols found.");}
    |
    ;

printParamsSelector
    : StringLiteral
    | call
    | Identifier
    | LeftParen simpleExpression RightParen
    ;

scanStmt
    : Scan LeftParen StringLiteral Comma Identifier RightParen Semi
    ;

selectionStmt
    :  If LeftParen simpleExpression RightParen Then blockStmt elseSelector?
    ;

elseSelector
    : Else Then blockStmt
    | Else selectionStmt
    ;

iterationStmt
    : whileStatement
    | forStatement
    ;

whileStatement
    : While Identifier iterationToStatement simpleExpression blockStmt
    ;

forStatement
    : For loopDeclaration iterationToStatement simpleExpression blockStmt
    ;

iterationToStatement
    : Upto
    | Downto
    | g=(Up|Down) {notifyErrorListeners("Missing 'to' after " + $g.text + ".");}
    | To {notifyErrorListeners("Missing 'up' or 'down' in iteration statement.");}
    | StringLiteral {notifyErrorListeners("Incorrect iterator. Should be 'up to' or 'down to");}
    ;

loopDeclaration
    : Int Identifier Assign simpleExpression
    | Int Identifier {notifyErrorListeners("Newly declared variables in loops needs to be assigned to a value immediately.");}
    | Identifier Assign simpleExpression
    | Identifier
    ;

simpleExpression
    : andExpression
    | simpleExpression OrOr andExpression
    | simpleExpression simpleExpression+ {notifyErrorListeners("Missing valid operators.");}
    ;

returnStmt
    : Return simpleExpression Semi
    ;

assignmentStandaloneExpression
    : mutable Assign (simpleExpression | createArrayExpression)
    ;

createArrayExpression
    : Create dataType LeftBracket simpleExpression RightBracket
    ;

andExpression
    : unaryRelExpression
    | andExpression AndAnd unaryRelExpression
    ;

unaryRelExpression
    : Not unaryRelExpression 
    | relExpression
    ;

relExpression
    : sumExpression relOperator sumExpression
    | sumExpression Assign {notifyErrorListeners("Wrong relational operator '='. Should be '=='.");} sumExpression 
    | sumExpression 
    ;

sumExpression
    : sumExpression sumOperator mulExpression 
    | sumExpression sumOperator g=sumOperator+ mulExpression {notifyErrorListeners("An extra '" + $g.text + "' operator is found. Remove this.");}
    | mulExpression
    ;

mulExpression
    : mulExpression mulOperator unaryExpression
    | mulExpression mulOperator g=mulOperator+ unaryExpression {notifyErrorListeners("An extra '" + $g.text + "' operator is found. Remove this.");}
    | unaryExpression
    ;

unaryExpression
    : unaryOperator unaryExpression
    | factor
    ;

factor
    : immutable
    | mutable
    ;

relOperator
    : LessEqual
    | Less
    | Greater
    | GreaterEqual
    | Equal
    | NotEqual
    ;

sumOperator
    : Plus
    | Minus
    ;

mulOperator
    : Star
    | Div
    | Modulo
    ;

unaryOperator
    : Minus
    ;

mutable
    : Identifier
    | Identifier  LeftBracket simpleExpression RightBracket
    ;

immutable
    : call
    | constant
    | LeftParen simpleExpression RightParen
    ;

call
    : Identifier LeftParen args RightParen
    ;

args
    : simpleExpression (Comma simpleExpression)*
    |
    ;

constant
    : BoolConst
    | IntConst
    | StringLiteral
    | FloatConst
    ;

DoubleQuote
    : '"'
    ;

Bool : 'bool';
ConstantKeyword : 'constant';
Create : 'create';
Do : 'do';
Down : 'down';
Else : 'else';
Float : 'float';
For : 'for';
Func : 'func';
If : 'if';
Int : 'int';
Main: 'main';
Print : 'print';
Return : 'return';
Scan: 'scan';
String : 'String';
Up : 'up';
Then: 'then';
To : 'to';
Void : 'void';
While : 'while';

AndAnd : '&&';
Assign : '=';
Colon : ':';
Comma : ',';
Div : '/';
Dot : '.';
Ellipsis : '...';
Equal : '==';
Greater : '>';
GreaterEqual : '>=';
LeftBrace : '{';
LeftBracket : '[';
LeftParen : '(';
Less : '<';
LessEqual : '<=';
Minus : '-';
Modulo: '%';
Not : '!';
NotEqual : '!=';
OrOr : '||';
Plus : '+';
RightBrace : '}';
RightBracket : ']';
RightParen : ')';
Semi : ';';
Star : '*';

fragment
NonDigit
    : [a-zA-Z_]
    ;

fragment
DoubleQuotation
    : '"'
    ;

fragment
NegativePrefix
    : '-'
    ;

fragment
Digit
    : [0-9]
    ;

fragment
DigitSequence
    : Digit+
    ;
    
fragment
FloatSuffix
    : 'f'
    ;

fragment
FractionalConstant
    :   DigitSequence? '.' DigitSequence
    |   DigitSequence '.'
    ;

fragment
DecimalFloatingConstant
    :   FractionalConstant FloatSuffix
    ;

fragment
EscapeSequence
    :   SimpleEscapeSequence
    ;

fragment
SimpleEscapeSequence
    :   '\\' ['"?abfnrtv\\]
    ;

fragment
SChar
    :   ~["\\\r\n]
    |   EscapeSequence
    |   '\\\n'
    |   '\\\r\n'
    ;

fragment
SCharSequence
    :   SChar+
    ;

fragment
Space
    : [ ]
    ;

Upto
    : Up Space+ To
    ;

Downto
    : Down Space+ To
    ;

StringLiteral
    :   DoubleQuotation SCharSequence* DoubleQuotation
    ;

IntConst
    : NegativePrefix? DigitSequence
    ;

FloatConst
    : DecimalFloatingConstant
    ;

BoolConst
    : 'T'
    | 'F'
    ;

StringConst
    : DoubleQuotation SCharSequence? DoubleQuotation
    ;

Identifier
    :  NonDigit (NonDigit|Digit)*
    ; 

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;

WS 
    : [ \t\r\n]+ -> skip 
    ;