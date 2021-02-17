// Generated from src/main/apilang/APILang.g4 by ANTLR 4.9.1
package apilang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link APILangParser}.
 */
public interface APILangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link APILangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(APILangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link APILangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(APILangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modelPackageName}
	 * labeled alternative in {@link APILangParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModelPackageName(APILangParser.ModelPackageNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modelPackageName}
	 * labeled alternative in {@link APILangParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModelPackageName(APILangParser.ModelPackageNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modelName}
	 * labeled alternative in {@link APILangParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModelName(APILangParser.ModelNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modelName}
	 * labeled alternative in {@link APILangParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModelName(APILangParser.ModelNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modelProperties}
	 * labeled alternative in {@link APILangParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModelProperties(APILangParser.ModelPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modelProperties}
	 * labeled alternative in {@link APILangParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModelProperties(APILangParser.ModelPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propertyDef}
	 * labeled alternative in {@link APILangParser#property}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDef(APILangParser.PropertyDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propertyDef}
	 * labeled alternative in {@link APILangParser#property}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDef(APILangParser.PropertyDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constraintsDef}
	 * labeled alternative in {@link APILangParser#property}.
	 * @param ctx the parse tree
	 */
	void enterConstraintsDef(APILangParser.ConstraintsDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constraintsDef}
	 * labeled alternative in {@link APILangParser#property}.
	 * @param ctx the parse tree
	 */
	void exitConstraintsDef(APILangParser.ConstraintsDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDef}
	 * labeled alternative in {@link APILangParser#property}.
	 * @param ctx the parse tree
	 */
	void enterTypeDef(APILangParser.TypeDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDef}
	 * labeled alternative in {@link APILangParser#property}.
	 * @param ctx the parse tree
	 */
	void exitTypeDef(APILangParser.TypeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link APILangParser#constraints}.
	 * @param ctx the parse tree
	 */
	void enterConstraints(APILangParser.ConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link APILangParser#constraints}.
	 * @param ctx the parse tree
	 */
	void exitConstraints(APILangParser.ConstraintsContext ctx);
}