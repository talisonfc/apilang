grammar APILang;

prog: model+ EOF ;

model: 'model' NAME '{' property+ '}' ;

property: 'property' NAME;

NAME: [a-zA-Z]+ ;

WS : [ \t\r\n]+ -> skip ;