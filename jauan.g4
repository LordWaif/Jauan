grammar jauan;

//Lembrar do return das funções, deve ser obrigatório ter retorno, mas o retorno pode aparecer em qualquer lugar da função, inclusive dentro de um if ou while.

prog: (declar_funcao* main);

main: ('main' ':' bloco 'end');

declar_funcao: ID_L '(' args_formal ')' ':' TIPO bloco 'end';

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
		| id
		| exprAlgebrica
		| exprRelacionalBinaria
		| exprRelacionalUnaria
		| inst_funcao
	)?;

parametro: TIPO ID_L;

var: 'var' ':' declaracao+;

declaracao:
	CONST declConst ';'				# declaraConstante
	| ID_L (',' ID_L)* ':' TIPO ';'	# declaraVariavel;

declConst: ID_L '=' value (',' declConst)*;
comando_atribuicao:
	id '=' (
		value
		| exprRelacionalUnaria
		| exprRelacionalBinaria
		| op_algebrico
		| inst_funcao
		| id
	);

op_algebrico:
	SUB op_algebrico								# unario
	| '(' op_algebrico ')'							# parenteses
	| op_algebrico op = (MUL | DIV) op_algebrico	# multDiv
	| op_algebrico op = (ADD | SUB) op_algebrico	# addSub
	| (id | num | inst_funcao)						# operando;

ifElse:
	'if' '(' (exprRelacionalBinaria | exprRelacionalUnaria | id) ')' ':' (
		comando+ (else)? 'end'
	);
else: 'else' ':' comando+;
while:
	'while' '(' (exprRelacionalBinaria | exprRelacionalUnaria) ')' ':' comando+ 'end';
scanf: 'scanf' '(' (id (',' id)*) ')';
print: 'print' '(' args_real ')';
break: 'break';

inst_funcao: id '(' args_real ')';
args_real: (
		(
			|id
			|inst_funcao
			| value
			| exprAlgebrica
			| exprRelacionalBinaria
			| exprRelacionalUnaria
		) (
			',' (
				id
				| inst_funcao
				| value
				| exprAlgebrica
				| exprRelacionalBinaria
				| exprRelacionalUnaria
			)
		)*
	)?;

exprRelacionalBinaria: (op_relacional OPERADOR op_relacional);
op_relacional: (
		id
		| value
		| exprRelacionalUnaria
		| exprAlgebrica
		| inst_funcao
	);
exprRelacionalUnaria: ('!' (
        term
        )
);
term : '(' (id | value | inst_funcao | exprRelacionalBinaria | exprRelacionalUnaria |term ) ')'
        | (id | value | inst_funcao | exprRelacionalBinaria | exprRelacionalUnaria);
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
id: ID_L;
ID_L: ([a-zA-Z_] ([a-zA-Z_] | DIGITO)*);
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