import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Eval extends APILangBaseVisitor<String> {

  String currentModel = null;
  List<Property> currentProperties = null;

  public String visitProg(APILangParser.ProgContext ctx) {
    String prog = "";
    for (APILangParser.ModelContext model : ctx.model()) {
      prog += visit(model);
    }
    return prog;
  }

  public String visitModel(APILangParser.ModelContext ctx) {
    String classDef = "public class %s {\n\n%s\n%s\n\n}";
    String props = "";

    String modelName = ctx.NAME().getText();
    currentModel = modelName;
    currentProperties = new ArrayList<Property>();

    for (APILangParser.PropertyContext prop : ctx.property()) {
      props += visit(prop) + "\n";
    }

    String gettersAndSetters = String.join("\n\n", generateGettersAndSetters());

    return String.format(classDef, modelName, props, gettersAndSetters);
  }

  public String visitPropertyDef(APILangParser.PropertyDefContext ctx) {
    return ctx.NAME().getText();
  }

  public String visitTypeDef(APILangParser.TypeDefContext ctx) {
    String propName = visit(ctx.property());
    String type = ctx.TYPE() != null ? ctx.TYPE().getText() : "String";
    currentProperties.add(new Property(propName, type));
    return "\t" + String.format("private %s %s;\n", type, propName);
  }

  public String visitConstraintsDef(APILangParser.ConstraintsDefContext ctx){

    String constraints = "";

    int i = 0;
    for(APILangParser.ConstraintsContext contraint: ctx.constraints()){
      constraints += "\t@" + contraint.getText() + "\n";
    }

    return constraints + visit(ctx.property());
  }

  // public String visitConstraints(APILangParser.ConstraintsContext ctx) { 
  //   String constraints = "";
  //   for(APILangParser.ConstraintsContext)
  //   return visitChildren(ctx); 
  // }

  public List<String> generateGettersAndSetters() {

    return currentProperties.stream().map((prop) -> {
      String getter = String.format("\tpublic %s get%s(){\n\t\treturn this.%s;\n\t}", prop.getType(), capitalize(prop.getName()), prop.getName());
      String setter = String.format("\tpublic void set%s(%s %s){\n\t\tthis.%s = %s;\n\t}", capitalize(prop.getName()), prop.getType(), prop.getName(), prop.getName(), prop.getName());
      return getter + "\n\n" + setter;
    }).collect(Collectors.toList());

  }

  public String capitalize(String str) {
    return str.substring(0, 1).toUpperCase() + str.substring(1);
  }
}