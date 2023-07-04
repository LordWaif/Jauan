grammar jauan;

prog: (declar_funcao* main);

//--------------------Funções--------------------//
//Função pode ser sem parâmetros?
//Uma função sempre deve ter pelo menos um comando?
declar_funcao: ID '('parametro (',' parametro)*')' ':' tipo_funcao var? comando+ retorno 'end';
parametro: TIPO ID;
//Quais os tipos de função? bool é um tipo válido?
tipo_funcao: TIPO|'void';
//Existe o tipo bool para variáveis?
TIPO: 'int'|'str'|'float'|'bool';
retorno: 'return' (DIGITO|ID) ';';

main: ('main' ':' var comando+ 'end'); //Duvida: O main deve conter obrigatoriamente var? e comando?

var: ('var' ':' declaracao+);

declaracao: ('const' ID '=' value
            |ID (',' ID)* ':' TIPO
            |ID '=' value ':' TIPO
            )';';

comando: ifElse+ | print | scanf | while | operacao_algebrica | comando_atribuicao | inst_funcao ; //Fazer os comandos

comando_atribuicao: ID '=' (
                    operacao_algebrica
                    |ID
                    |value
                    )';';

//Corrigir para aceitar parenteses.
operacao_algebrica: (ID|value) (OPERADOR_ALGEBRICO (ID|value))+;

ifElse: 'if' '(' expr ')' ':' comando+ ('[' 'else' ':' comando+ ']' 'end')?;

while: 'while' '(' expr ')' ':' (comando+
        | 'break'?) 'end'; //break em qualquer lugar? quantas vezes puder? obrigado a ter um comando?

scanf: 'scanf' '('(ID | ID (',' ID)+)')'';';

print: 'print(' (STRING | inst_funcao | expr2) ')'';';
STRING : '"' (~["])* '"';

inst_funcao : ID '(' args ')';
args : (ID (',' expr2)*)?;

expr2: ID; // nome temporário. A ideia é abranger qualquer expressão que possa ter em um print. Ex: 1+2; a+b; a+1, funcao()...

expr: (( value|'('value')' | ID|'('ID')' ) OPERADOR ( value|'('value')'| ID |'('ID')' )) | 'true' | 'false' | '('expr')';

value: (DIGITO+ |'true'
        |'false'
        |'"'LETRA+'"'
        |DIGITO+ '.' DIGITO+); //Isso ta sendo o valor float, verificar se é isso mesmo.

ID: (LETRA (LETRA | DIGITO)*);

LETRA: [a-zA-Z];
DIGITO: [0-9];

OPERADOR_ALGEBRICO: ('-'
                    |'+'
                    |'*'
                    |'/');
OPERADOR: ('!'
          |'=='
          |'!='
          |'>='
          |'<='
          |'>'
          |'<');

WS: [ \f\t\r\n] -> skip;