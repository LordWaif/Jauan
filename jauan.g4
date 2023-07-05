grammar jauan;

prog: (declar_funcao* main);

//--------------------Funções--------------------//
//Função pode ser sem parâmetros?
//Uma função sempre deve ter pelo menos um comando?
declar_funcao: ID '('parametro (',' parametro)*')' ':' tipo_funcao var? comando+ retorno 'end';
parametro: TIPO ID;
//Quais os tipos de função? bool é um tipo válido?
tipo_funcao: TIPO|'void';
TIPO: 'int'|'str'|'float'|'bool';
retorno: 'return' (DIGITO|ID) ';';

main: ('main' ':' var{,1} comando+ 'end'); //Duvida: O main deve conter obrigatoriamente comando?

var: ('var' ':' declaracao+);

declaracao: ('const' ID '=' value
            |ID (',' ID)* ':' TIPO
            |ID '=' value ':' TIPO
            )';';

comando: ifElse+ | print | scanf | while | op_algebrico | comando_atribuicao | inst_funcao ; //Fazer os comandos

comando_atribuicao: ID '=' (
                    op_algebrico
                    |ID
                    |value
                    )';';

// Unário tá certo?
op_algebrico: t e1;
e1: ADD t e1 | SUB t e1 | ;
t: g t1;
t1: MUL g t1 | DIV g t1 | ;
g: (ADD|SUB) g | (ID|value) | '('op_algebrico')';

ifElse: 'if' '(' expr ')' ':' comando+ ('[' 'else' ':' comando+ ']' 'end')?;

while: 'while' '(' expr ')' ':' (comando+
        | 'break'?) 'end'; //break em qualquer lugar? quantas vezes puder? obrigado a ter um comando?

scanf: 'scanf' '('(ID | ID (',' ID)+)')'';';

print: 'print''(' (STRING | inst_funcao | expr2 | ) ')'';';
STRING : '"' (~["])* '"'; // String é só com aspas duplas ou pode aspas simples também?

inst_funcao : ID '(' args ')';
args : (ID (',' expr2)*)?;

expr2: ID; // nome temporário. A ideia é abranger qualquer expressão que possa ter em um print. Ex: 1+2; a+b; a+1, funcao()...

expr: (( value|'('value')' | ID|'('ID')' ) OPERADOR ( value|'('value')'| ID |'('ID')' )) | 'true' | 'false' | '('expr')';

value: (num |'true' // Esse value tá certo. Em operação algébrica pode true + false?
        |'false'
        |'"'LETRA+'"');

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