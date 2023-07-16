grammar jauan;

prog: (declar_funcao* main);

//--------------------Funções--------------------//

//or e and || ou && vai entrar?
declar_funcao: ID '('args_formal')' ':' ((TIPO var? comando+ retorno)|('void' var? comando+))'end';
args_formal : (parametro (',' parametro)*)?;
parametro: TIPO ID;

TIPO: 'int'|'str'|'float'|'bool';
retorno: 'return' (value|expr) ';';

main: ('main' ':' var? comando* 'end');

var: ('var' ':' declaracao+);

declaracao: ('const' ID '=' value
            |ID (',' ID)* ':' TIPO
            |ID '=' value ':' TIPO
            )';';


comando: ifElse+ | while | ((print | scanf | comando_atribuicao | inst_funcao | break)';') ; //Fazer os comandos
comando_atribuicao: ID '=' (
                    op_algebrico
                    |value
                    );

break: 'break';

op_algebrico : (ADD|SUB) op_algebrico
        |'(' op_algebrico ')'
        | op_algebrico (MUL|DIV) op_algebrico
        | op_algebrico (ADD|SUB) op_algebrico
        | (ID|num);
/*
op_algebrico: t e1;
e1: ADD t e1 | SUB t e1 | ;
t: g t1;
t1: MUL g t1 | DIV g t1 | ;
g: (ADD|SUB) g | (ID|num) | '('op_algebrico')';*/

ifElse: 'if' '(' expr ')' ':' comando+ ('else' ':' comando+)?'end';

while: 'while' '(' expr ')' ':' (comando*
        | 'break'?) 'end';

scanf: 'scanf' '('(ID (',' ID)*)')';

print: 'print''(' ( args_real) ')';
STRING : '"' (ESC|.)*? '"'; // Permite aspas duplas com escape
ESC : '\\"' | '\\\\' ;

inst_funcao : ID '(' args_real ')';
args_real : ((expr|value|inst_funcao) (',' (expr|value|inst_funcao))*)?;

expr: '('expr')' expr1 | '!'expr expr1 | value expr1 | op_algebrico expr1;
expr1 : OPERADOR expr expr1 | ;

value: (num |'true'
        |'false'
        |STRING
        |ID);

num: INT | FLOAT;

INT: DIGITO+;
FLOAT: DIGITO+ '.' DIGITO+;

ID: (LETRA (LETRA | DIGITO)*); // Adicionar underline

LETRA: [a-zA-Z];
DIGITO: [0-9];

MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';

OPERADOR: ('!'
          |'=='
          |'!='
          |'>='
          |'<='
          |'>'
          |'<');

WS: [ \f\t\r\n] -> skip;
LINE_COMMENT : '//' .*? '\r'? '\n' -> skip; // Dá match e ignora "//" qualquer coisa '\n'
COMMENT : '/*' .*? '*/' -> skip;  // Dá match e ignora /* qualquer coisa */