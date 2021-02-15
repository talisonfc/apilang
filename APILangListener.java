// Generated from APILang.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by {@link APILangParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(APILangParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link APILangParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(APILangParser.ModelContext ctx);
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
}