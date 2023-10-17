// Generated from /Users/bytedance/Project/pioneeryi/ExprEngine/src/main/resources/antlr/ExprEngine.g4 by ANTLR 4.13.1
package gen.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprEngineParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprEngineVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprEngineParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ExprEngineParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAtomPredicate}
	 * labeled alternative in {@link ExprEngineParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAtomPredicate(ExprEngineParser.ExprAtomPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonPredicate}
	 * labeled alternative in {@link ExprEngineParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonPredicate(ExprEngineParser.ComparisonPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalPredicate}
	 * labeled alternative in {@link ExprEngineParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalPredicate(ExprEngineParser.LogicalPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link ExprEngineParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikePredicate(ExprEngineParser.LikePredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketExprAtom}
	 * labeled alternative in {@link ExprEngineParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExprAtom(ExprEngineParser.BracketExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramExprAtom}
	 * labeled alternative in {@link ExprEngineParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamExprAtom(ExprEngineParser.ParamExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathMDExprAtom}
	 * labeled alternative in {@link ExprEngineParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathMDExprAtom(ExprEngineParser.MathMDExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantExprAtom}
	 * labeled alternative in {@link ExprEngineParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExprAtom(ExprEngineParser.ConstantExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseWhenExprAtom}
	 * labeled alternative in {@link ExprEngineParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseWhenExprAtom(ExprEngineParser.CaseWhenExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathPMExprAtom}
	 * labeled alternative in {@link ExprEngineParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathPMExprAtom(ExprEngineParser.MathPMExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprEngineParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(ExprEngineParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprEngineParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(ExprEngineParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprEngineParser#caseWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseWhen(ExprEngineParser.CaseWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprEngineParser#caseItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseItem(ExprEngineParser.CaseItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprEngineParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(ExprEngineParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprEngineParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(ExprEngineParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprEngineParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(ExprEngineParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprEngineParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(ExprEngineParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprEngineParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(ExprEngineParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprEngineParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(ExprEngineParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprEngineParser#paramIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamIdentifier(ExprEngineParser.ParamIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprEngineParser#mathPmOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathPmOperator(ExprEngineParser.MathPmOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprEngineParser#mathMdOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathMdOperator(ExprEngineParser.MathMdOperatorContext ctx);
}