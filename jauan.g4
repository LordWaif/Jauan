grammar jauan;

prog: (declar_funcao* main);

//--------------------Funções--------------------//
//Função pode ser sem parâmetros?
//Uma função sempre deve ter pelo menos um comando?
//Posso fazer true*3, isso é pra ser igual a 3?
//or e and || ou && vai entrar?
declar_funcao: ID '('args_formal')' ':' ((TIPO var? comando+ retorno)|('void' var? comando+))'end';
args_formal : (parametro (',' parametro)*)?;
parametro: TIPO ID;
//Quais os tipos de função? bool é um tipo válido?
TIPO: 'int'|'str'|'float'|'bool';
retorno: 'return' (value|expr) ';';

main: ('main' ':' var{,1} comando+ 'end'); //Duvida: O main deve conter obrigatoriamente comando?

var: ('var' ':' declaracao+);

declaracao: ('const' ID '=' value
            |ID (',' ID)* ':' TIPO
            |ID '=' value ':' TIPO
            )';';


comando: ifElse+ | while | ((print | scanf | op_algebrico | comando_atribuicao | inst_funcao)';') ; //Fazer os comandos
comand_break : (ifBreak | comando | 'break' ';');
comando_atribuicao: ID '=' (
                    op_algebrico
                    |value
                    );

// Unário tá certo?
op_algebrico: t e1;
e1: ADD t e1 | SUB t e1 | ;
t: g t1;
t1: MUL g t1 | DIV g t1 | ;
g: (ADD|SUB) g | (ID|num) | '('op_algebrico')';

ifElse: 'if' '(' expr ')' ':' comando+ ('else' ':' comando+)?'end';
ifBreak: 'if' '(' expr ')' ':' comand_break+ ('else' ':' comand_break+)?'end';

while: 'while' '(' expr ')' ':' (comand_break+|comando+
        | 'break'?) 'end'; //break em qualquer lugar? quantas vezes puder? obrigado a ter um comando?

scanf: 'scanf' '('(ID (',' ID)*)')';

print: 'print''(' ( args_real) ')';
STRING : '"' (~["])* '"'; // String é só com aspas duplas ou pode aspas simples também?

inst_funcao : ID '(' args_real ')';
args_real : ((expr|value|inst_funcao) (',' (expr|value|inst_funcao))*)?;

expr: '('expr')' expr1 | '!'expr expr1 | value expr1 | op_algebrico expr1;
expr1 : OPERADOR expr expr1 | ;

value: (num |'true' // Esse value tá certo. Em operação algébrica pode true + false?
        |'false'
        |STRING
        |ID);

num: INT | FLOAT;

INT: DIGITO+;
FLOAT: DIGITO+ '.' DIGITO+;

ID: (LETRA (LETRA | DIGITO)*); // Adicionar underline ("_")

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