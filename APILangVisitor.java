// Generated from APILang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link APILangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface APILangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link APILangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(APILangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link APILangParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(APILangParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link APILangParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(APILangParser.PropertyContext ctx);
}