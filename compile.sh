javac -d classes src/main/apilang/templates/TemplateUtil.java
javac -d classes src/main/apilang/Property.java

# antlr4 src/main/apilang/APILang.g4 -package apilang -visitor

javac -d classes src/main/apilang/APILang*.java

# javac -d classes -cp classes:libs/antlr-4.9.1-complete.jar src/main/apilang/Eval.java 
# javac -d classes -cp classes:libs/antlr-4.9.1-complete.jar src/main/apilang/EvalVisitor.java

# java -cp classes:libs/antlr-4.9.1-complete.jar apilang.EvalVisitor ./src/main/apilang/templates/ModelTemplat.java src/resources/api1.api