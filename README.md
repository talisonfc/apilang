# apilang
APILang it's a DSL to create REST API from description model written in natural language


Compilar

```java
  javac -d classes -cp classes:libs/antlr-4.9.1-complete.jar src/main/apilang/EvalVisitor.java
```

Executar EvalVisitor

```java
  java -cp classes apilang.EvalVisitor ./src/main/apilang/templates/ModelTemplate.java
```