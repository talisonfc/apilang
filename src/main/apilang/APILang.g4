grammar APILang;

prog: model+ EOF ;

model: 'model' NAME                           # modelName
  | model 'package' PACKAGE_NAME              # modelPackageName
  | model 'table' NAME                        # modelTableName
  | model 'schema' NAME                       # modelSchemaName
  | model 'primary key' NAME                  # modelPrimaryKeyName
  | model '{' property+ '}'                   # modelProperties
  ;

property: 'property' NAME                     # propertyDef
  | property 'of type' TYPE                   # primitiveTypeDef
  | property 'of model' NAME                  # definedModelDef
  | property 'with constraint' constraints+   # constraintsDef
  ;

constraints: 'required' | 'unique' | 'oneToMany' | 'manyToMany' | 'manyToOne' ;

TYPE: 'String' | 'Integer' | 'Boolean' | 'Double' | 'List<'NAME'>' ;

NAME: [a-zA-Z_]+ ;

PACKAGE_NAME: [a-zA-Z.]+ ;

WS : [ \t\r\n]+ -> skip ;