grammar jauan;

prog: (declar_funcao* main);

//--------------------Funções--------------------//

//or e and || ou && vai entrar?
// Por que void foi separado de TIPO aqui embaixo?
//declar_funcao: ID '('args_formal')' ':' ((TIPO var? comando+ retorno)|('void' var? comando+))'end';

declar_funcao: ID '('args_formal')' ':' TIPO bloco 'end';
bloco: var? comando*;
retorno: 'return' (value|expr)*;

args_formal : (parametro (',' parametro)*)?;
parametro: TIPO ID;

TIPO: 'int'|'str'|'float'|'bool'|'void';

main: ('main' ':' var? comando* 'end');

var: ('var' ':' declaracao+);

declaracao: ('const' ID '=' value
            |ID (',' ID)* ':' TIPO
            |ID '=' value ':' TIPO
            )';';


comando: ifElse+ | while | ((print | scanf | comando_atribuicao | inst_funcao | break | retorno)';') ; //Fazer os comandos
comando_atribuicao: ID '=' (
                    op_algebrico
                    |value
                    );

break: 'break';

op_algebrico : SUB op_algebrico                     # unario
        |'(' op_algebrico ')'                       # parenteses
        | op_algebrico op=(MUL|DIV) op_algebrico    # multDiv
        | op_algebrico op=(ADD|SUB) op_algebrico    # addSub
        | (ID|num)                                  # operando
        ;

ifElse: 'if' '(' expr ')' ':' comando+ ('else' ':' comando+)?'end';

while: 'while' '(' expr ')' ':' (comando*
        | 'break'?) 'end';

scanf: 'scanf' '('(ID (',' ID)*)')';

print: 'print''(' args_real ')';
STRING : '"' (ESC|.)*? '"'; // Permite aspas duplas com escape
ESC : '\\"' | '\\\\' ;

inst_funcao : ID '(' args_real ')';
args_real : ((expr|value|inst_funcao) (',' (expr|value|inst_funcao))*)?;

expr: '('expr')' expr1 | '!'expr expr1 | value expr1 | op_algebrico expr1;
expr1 : OPERADOR expr expr1 | ;

value: num |'true'
        |'false'
        |STRING
        |ID;

num: INT | FLOAT;

INT: DIGITO+;
FLOAT: DIGITO+ '.' DIGITO+;

ID: (ID_LETTER (ID_LETTER | DIGITO)*);

ID_LETTER: [a-zA-Z_];
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