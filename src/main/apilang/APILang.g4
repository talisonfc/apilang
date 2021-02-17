grammar APILang;

prog: model+ EOF ;

model: 'model' NAME                           # modelName
  | model 'package' PACKAGE_NAME              # modelPackageName
  | model '{' property+ '}'                   # modelProperties
  ;

property: 'property' NAME                     # propertyDef
  | property 'of type' TYPE                   # typeDef
  | property 'with constraint' constraints+   # constraintsDef
  ;

constraints: 'required' | 'unique' | 'oneToMany' | 'manyToMany' | 'manyToOne' ;

TYPE: 'String' | 'Integer' | 'Boolean' | 'List<'NAME'>';

NAME: [a-zA-Z]+ ;

PACKAGE_NAME: [a-zA-Z.]+ ;

WS : [ \t\r\n]+ -> skip ;