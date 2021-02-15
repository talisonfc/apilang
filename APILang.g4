grammar APILang;

prog: model+ EOF ;

model: 'model' NAME '{' property+ '}' ;

property: 'property' NAME                     # propertyDef
  | property 'of type' TYPE                   # typeDef
  | property 'with constraint' constraints+   # constraintsDef
  ;

constraints: 'required' | 'unique' ;

TYPE: 'String' | 'Integer' | 'Boolean';

NAME: [a-zA-Z]+ ;

WS : [ \t\r\n]+ -> skip ;