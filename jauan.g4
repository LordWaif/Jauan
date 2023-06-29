grammar jauan;

prog: (funcao* main);

funcao: 'funcao';

main: ('main' ':' var comando+ 'end'); //Duvida: O main deve conter obrigatoriamente var? e comando?

var: ('var' ':' declaracao+);

declaracao: ('const' ID '=' VALUE ';'
            |ID (',' ID)* ':' TIPO ';'
            |ID '=' VALUE ':' TIPO ';'
            );
comando: 'comando'; //Fazer os comandos

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