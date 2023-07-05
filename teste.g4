grammar teste;

prog: e;

expr: expr (MUL | DIV) expr
| expr (ADD | SUB) expr
| number | '('expr')';

e: t e1;
e1: ADD t e1 | SUB t e1 | ;
t: g t1;
t1: MUL g t1 | DIV g t1 | ;
g: number | '('e')';

INT: DIGIT+;
FLOAT: DIGIT+ '.' DIGIT+;

number: INT | FLOAT;

DIGIT: [0-9];

MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';