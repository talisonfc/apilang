
public class Eval extends APILangBaseVisitor<String>{
  
  public String visitProg(APILangParser.ProgContext ctx){
    String prog = "";
    for(APILangParser.ModelContext model: ctx.model()){
      prog += visit(model);
    }
    return prog;
  }
	
	public String visitModel(APILangParser.ModelContext ctx){
    String classDef = "public class %s { \n%s \n}";
    String props = "";

    for(APILangParser.PropertyContext prop: ctx.property()){
      props += "\t" + visit(prop) + "\n";
    }
    return String.format(classDef, ctx.NAME().getText(), props);
  }
	
	public String visitProperty(APILangParser.PropertyContext ctx){
    String type = "String";
    return String.format("private %s %s;", type, ctx.NAME().getText());
  }
}
