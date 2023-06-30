grammar jauan;

prog: (funcao* main);

funcao: ID '('declaracao+')' ':' TIPO comando+ 'return' ( value | ID ) ';' 'end';

main: ('main' ':' var comando+ 'end'); //Duvida: O main deve conter obrigatoriamente var? e comando?

var: ('var' ':' (declaracao ';')+);

declaracao: ('const' ID '=' value
            |ID (',' ID)* ':' TIPO
            |ID '=' value ':' TIPO
            );
comando: ifElse+ | print | scanf | while; //Fazer os comandos

ifElse: 'if' '(' expr ')' ':' comando+ ('[' 'else' ':' comando+ ']' 'end')?;

while: 'while' '(' expr ')' ':' (comando+ | 'break'?) 'end'; //break em qualquer lugar? quantas vezes puder? obrigado a ter um comando?

scanf: 'scanf' '('(ID | ID (',' ID)+)')'';';

print: 'print';

expr: (( value | ID ) OPERADOR ( value | ID )) | 'true' | 'false' ;

TIPO: 'int'
      |'str'
      |'float';

value: (DIGITO+ |'true'
        |'false'
        |'"'LETRA+'"'
        |DIGITO+ '.' DIGITO+); //Isso ta sendo o valor float, verificar se é isso mesmo.

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