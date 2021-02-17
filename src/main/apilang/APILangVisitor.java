// Generated from src/main/apilang/APILang.g4 by ANTLR 4.9.1
package apilang;
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
	 * Visit a parse tree produced by the {@code modelPackageName}
	 * labeled alternative in {@link APILangParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelPackageName(APILangParser.ModelPackageNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modelName}
	 * labeled alternative in {@link APILangParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelName(APILangParser.ModelNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modelProperties}
	 * labeled alternative in {@link APILangParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelProperties(APILangParser.ModelPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propertyDef}
	 * labeled alternative in {@link APILangParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDef(APILangParser.PropertyDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constraintsDef}
	 * labeled alternative in {@link APILangParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintsDef(APILangParser.ConstraintsDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeDef}
	 * labeled alternative in {@link APILangParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDef(APILangParser.TypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link APILangParser#constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraints(APILangParser.ConstraintsContext ctx);
}