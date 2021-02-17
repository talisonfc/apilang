package apilang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import apilang.templates.TemplateUtil;

public class Eval extends APILangBaseVisitor<String> {

  String currentModel = null;
  List<Property> currentProperties = null;
  String dependencies = "";
  Map<String, String> mapConstraint = new HashMap<String, String>();
  Map<String, String> mapDependency = new HashMap<String, String>();

  public Eval(){
    mapConstraint.put("unique", "@Column(unique = true)");
    mapConstraint.put("required", "@NotNull");
    mapConstraint.put("oneToMany", "@OnToMany()");
    mapConstraint.put("manyToMany", "@ManyToMany()");
    mapConstraint.put("manyToOne", "@ManyToMany()");

    mapDependency.put("required", "import javax.validation.constraints.NotNull;");
    mapDependency.put("oneToMany", "import javax.persistence.OneToMany;");
    mapDependency.put("manyToMany", "import javax.persistence.ManyToMany;");
    mapDependency.put("manyToOne", "import javax.persistence.ManyToOne;");
    mapDependency.put("List", "import java.util.List;");
  }

  public String visitProg(APILangParser.ProgContext ctx) {
    String prog = "";
    for (APILangParser.ModelContext model : ctx.model()) {
      prog += visit(model);
    }
    return prog;
  }
	
  public String visitModelName(APILangParser.ModelNameContext ctx) { 
    String modelTemplate = TemplateUtil.readFile("src/main/apilang/templates/ModelTemplate.java");
    String controllerTemplate = TemplateUtil.readFile("src/main/apilang/templates/ControllerTemplate.java");
    String serviceTemplate = TemplateUtil.readFile("src/main/apilang/templates/ServiceTemplate.java");
    String repositoryTemplate = TemplateUtil.readFile("src/main/apilang/templates/RepositoryTemplate.java");

    String controllerDef = "";
    String serviceDef = "";
    String repositoryDef = "";

    String modelName = ctx.NAME().getText();
    currentModel = modelName;

    modelTemplate = modelTemplate.replace("ModelTemplate", modelName + "Model");

    // TemplateUtil.writeFile(modelTemplate, String.format("src/resources/output/%sModel.java", modelName));
    // TemplateUtil.writeFile(controllerTemplate, String.format("src/resources/output/%sController.java", modelName));
    // TemplateUtil.writeFile(serviceTemplate, String.format("src/resources/output/%sService.java", modelName));
    // TemplateUtil.writeFile(repositoryTemplate, String.format("src/resources/output/%sRepository.java", modelName));

    return modelTemplate;
  }

  public String visitModelPackageName(APILangParser.ModelPackageNameContext ctx) { 
    String packageName = String.format("package %s;\n", ctx.PACKAGE_NAME().getText());
    return packageName + visit(ctx.model());
  }

  public String visitModelTableName(APILangParser.ModelTableNameContext ctx) { 
    String modelTemplate = visit(ctx.model());
    modelTemplate = modelTemplate.replace("tableName", ctx.NAME().getText());
    return modelTemplate; 
  }

  public String visitModelSchemaName(APILangParser.ModelSchemaNameContext ctx) { 
    String modelTemplate = visit(ctx.model());
    modelTemplate = modelTemplate.replace("schemaName", ctx.NAME().getText());
    return modelTemplate; 
  }

  public String visitModelPrimaryKeyName(APILangParser.ModelPrimaryKeyNameContext ctx) { 
    String modelTemplate = visit(ctx.model());
    modelTemplate = modelTemplate.replace("primaryKeyName", ctx.NAME().getText());
    return modelTemplate; 
  }
	
  public String visitModelProperties(APILangParser.ModelPropertiesContext ctx) { 
    currentProperties = new ArrayList<Property>();
    dependencies = "";
    String props = "";
    
    for (APILangParser.PropertyContext prop : ctx.property()) {
      props += visit(prop) + "\n";
    }

    String gettersAndSetters = String.join("\n\n", generateGettersAndSetters());

    String modelTemplate = visit(ctx.model());
    modelTemplate = modelTemplate.replace("//dependencies", dependencies);
    modelTemplate = modelTemplate.replace("//properties", props);
    modelTemplate = modelTemplate.replace("//methods", gettersAndSetters);

    String BASE_DIR_TMP = System.getProperty("BASE_DIR");
    String BASE_DIR = BASE_DIR_TMP != null && !BASE_DIR_TMP.isEmpty() ? BASE_DIR_TMP : "src/resources/output/";

    TemplateUtil.writeFile(modelTemplate, String.format("%s%sModel.java", BASE_DIR, currentModel));
    return modelTemplate;
  }

  public String visitPropertyDef(APILangParser.PropertyDefContext ctx) {
    return ctx.NAME().getText();
  }

  public String visitPrimitiveTypeDef(APILangParser.PrimitiveTypeDefContext ctx) {
    String propName = visit(ctx.property());
    String type = ctx.TYPE() != null ? ctx.TYPE().getText() : "String";

    if(type.startsWith("List")){
      addDependency("List");
      type = type.replace(">", "Model>");
    }

    currentProperties.add(new Property(propName, type));
    return "\t" + String.format("private %s %s;\n", type, propName);
  }

  public String visitDefinedModelDef(APILangParser.DefinedModelDefContext ctx) { 
    String propName = visit(ctx.property());
    return "\t" + String.format("private %sModel %s;\n", ctx.NAME().getText(), propName);
  }

  public String visitConstraintsDef(APILangParser.ConstraintsDefContext ctx){

    String constraints = "";

    int i = 0;
    for(APILangParser.ConstraintsContext contraint: ctx.constraints()){
      addDependency(contraint.getText());
      constraints += "\t" + mapConstraint.get(contraint.getText()) + "\n";
    }

    return constraints + visit(ctx.property());
  }

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

  public void addDependency(String name){
    if(mapDependency.get(name) != null){
      dependencies += mapDependency.get(name) + "\n";
    }
  }
}