package apilang;

import java.io.File;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class EvalVisitor{

  public static void main(String[] args) throws Exception {

    System.setProperty("BASE_DIR", "/Users/talisoncosta/eclipse-workspace/apilangtest/src/main/java/br/com/fotonica/apilangtest/model/");

    CharStream input;
    if (args.length > 0)
      input = CharStreams.fromFileName(args[0]);
    else
      input = CharStreams.fromStream(System.in);
      
    APILangLexer lexer = new APILangLexer(input);
    APILangParser parse = new APILangParser(new CommonTokenStream(lexer));
    ParseTree tree = parse.prog();
    Eval eval = new Eval();
    System.out.println(eval.visit(tree));

  }
  
}