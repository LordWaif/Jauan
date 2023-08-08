grammar jauan;

//Lembrar do return das funções, deve ser obrigatório ter retorno, mas o retorno pode aparecer em qualquer lugar da função, inclusive dentro de um if ou while.

prog: (declar_funcao* main);

main: ('main' ':' bloco 'end');

declar_funcao: ID '(' args_formal ')' ':' TIPO bloco 'end';

args_formal: (parametro (',' parametro)*)?;

bloco: var? comando*;

comando:
	ifElse+
	| while
	| (
		(
			print
			| scanf
			| comando_atribuicao
			| inst_funcao
			| break
			| retorno
		) ';'
	);

retorno:
	'return' (
		value
		| ID
		| exprAlgebrica
		| exprRelacionalBinaria
		| exprRelacionalUnaria
	)*;

parametro: TIPO ID;

var: 'var' ':' declaracao+;

declaracao:
	CONST ID '=' value (',' ID '=' value)* ';'	# declaraConstante
	| ID (',' ID)* ':' TIPO ';'					# declaraVariavel;

comando_atribuicao: ID '=' (op_algebrico | value | ID);

op_algebrico:
	SUB op_algebrico								# unario
	| '(' op_algebrico ')'							# parenteses
	| op_algebrico op = (MUL | DIV) op_algebrico	# multDiv
	| op_algebrico op = (ADD | SUB) op_algebrico	# addSub
	| (ID | num)									# operando;

ifElse:
	'if' '(' (exprRelacionalBinaria | exprRelacionalUnaria) ')' ':' comando+ (
		'else' ':' comando+
	)? 'end';
while:
	'while' '(' (exprRelacionalBinaria | exprRelacionalUnaria) ')' ':' comando+ 'end';
scanf: 'scanf' '(' (ID (',' ID)*) ')';
print: 'print' '(' args_real ')';
break: 'break';

inst_funcao: ID '(' args_real ')';
args_real: (
		(
			ID
			| value
			| exprAlgebrica
			| exprRelacionalBinaria
			| exprRelacionalUnaria
			| inst_funcao
		) (
			',' (
				ID
				| value
				| exprAlgebrica
				| exprRelacionalBinaria
				| exprRelacionalUnaria
				| inst_funcao
			)
		)*
	)?;

exprRelacionalBinaria: (op_relacional OPERADOR op_relacional);
op_relacional: (ID | value | exprRelacionalUnaria);
exprRelacionalUnaria: ('!' (ID | value));
exprAlgebrica: op_algebrico;

//expr: '('expr')' expr1 | '!'expr expr1 | value expr1 | op_algebrico expr1; expr1 : OPERADOR expr
// expr1 | ;

value: num | TRUE | FALSE | STRING;
num: INT | FLOAT;

TRUE: 'true';
FALSE: 'false';
INT: DIGITO+;
CONST: 'const';
FLOAT: DIGITO+ '.' DIGITO+;
TIPO: 'int' | 'str' | 'float' | 'bool' | 'void';
ID: (ID_LETTER (ID_LETTER | DIGITO)*);
ID_LETTER: [a-zA-Z_];
DIGITO: [0-9];
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
//Separar a exclamação (NOT) para funcionar somente em operadores unários, exemplo: !a > b.
OPERADOR: ('==' | '!=' | '>=' | '<=' | '>' | '<');
STRING: '"' (ESC | .)*? '"'; // Permite aspas duplas com escape
ESC: '\\"' | '\\\\';
WS: [ \f\t\r\n] -> skip;
LINE_COMMENT:
	'//' .*? '\r'? '\n' -> skip; // Dá match e ignora "//" qualquer coisa '\n'
COMMENT:
	'/*' .*? '*/' -> skip; // Dá match e ignora /* qualquer coisa */