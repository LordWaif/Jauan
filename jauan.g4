grammar jauan;

prog: (funcao* main);

funcao: comando+;

main: ('main' ':' var comando+ 'end'); //Duvida: O main deve conter obrigatoriamente var? e comando?

var: ('var' ':' declaracao+);

declaracao: ('const' ID '=' VALUE ';'
            |ID (',' ID)* ':' TIPO ';'
            |ID '=' VALUE ':' TIPO ';'
            );
comando: ifElse+ | 'print'; //Fazer os comandos

ifElse: 'if' '(' expr ')' ':' comando+ ('[' 'else' ':' comando+ ']')? 'end';

expr: (( VALUE | ID ) OPERADOR ( VALUE | ID )) | 'true' | 'false' ;

TIPO: 'int'
      |'str'
      |'float';

VALUE: [0-9]+
        |'true'
        |'false'
        |'"'[A-Z]+'"'
        |DIGITO+ '.' DIGITO+; //Isso ta sendo o valor float, verificar se é isso mesmo.

ID: LETRA (LETRA | DIGITO)*;

LETRA: [a-zA-Z];
DIGITO: [0-9];

OPERADOR: ('!'
          |'-'
          |'+'
          |'*'
          |'/'
          |'=='
          |'!='
          |'>='
          |'<='
          |'>'
          |'<');

WS: [ \f\t\r\n] -> skip;