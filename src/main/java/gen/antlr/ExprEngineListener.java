// Generated from /Users/bytedance/Project/pioneeryi/ExprEngine/src/main/resources/antlr/ExprEngine.g4 by ANTLR 4.13.1
package gen.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprEngineParser}.
 */
public interface ExprEngineListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ExprEngineParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprEngineParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ExprEngineParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAtomPredicate}
	 * labeled alternative in {@link ExprEngineParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterExprAtomPredicate(ExprEngineParser.ExprAtomPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAtomPredicate}
	 * labeled alternative in {@link ExprEngineParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitExprAtomPredicate(ExprEngineParser.ExprAtomPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonPredicate}
	 * labeled alternative in {@link ExprEngineParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterComparisonPredicate(ExprEngineParser.ComparisonPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonPredicate}
	 * labeled alternative in {@link ExprEngineParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitComparisonPredicate(ExprEngineParser.ComparisonPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalPredicate}
	 * labeled alternative in {@link ExprEngineParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLogicalPredicate(ExprEngineParser.LogicalPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalPredicate}
	 * labeled alternative in {@link ExprEngineParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLogicalPredicate(ExprEngineParser.LogicalPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link ExprEngineParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLikePredicate(ExprEngineParser.LikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link ExprEngineParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLikePredicate(ExprEngineParser.LikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketExprAtom}
	 * labeled alternative in {@link ExprEngineParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterBracketExprAtom(ExprEngineParser.BracketExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketExprAtom}
	 * labeled alternative in {@link ExprEngineParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitBracketExprAtom(ExprEngineParser.BracketExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramExprAtom}
	 * labeled alternative in {@link ExprEngineParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterParamExprAtom(ExprEngineParser.ParamExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramExprAtom}
	 * labeled alternative in {@link ExprEngineParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitParamExprAtom(ExprEngineParser.ParamExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathMDExprAtom}
	 * labeled alternative in {@link ExprEngineParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterMathMDExprAtom(ExprEngineParser.MathMDExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathMDExprAtom}
	 * labeled alternative in {@link ExprEngineParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitMathMDExprAtom(ExprEngineParser.MathMDExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExprAtom}
	 * labeled alternative in {@link ExprEngineParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterConstantExprAtom(ExprEngineParser.ConstantExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExprAtom}
	 * labeled alternative in {@link ExprEngineParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitConstantExprAtom(ExprEngineParser.ConstantExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseWhenExprAtom}
	 * labeled alternative in {@link ExprEngineParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterCaseWhenExprAtom(ExprEngineParser.CaseWhenExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseWhenExprAtom}
	 * labeled alternative in {@link ExprEngineParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitCaseWhenExprAtom(ExprEngineParser.CaseWhenExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathPMExprAtom}
	 * labeled alternative in {@link ExprEngineParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterMathPMExprAtom(ExprEngineParser.MathPMExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathPMExprAtom}
	 * labeled alternative in {@link ExprEngineParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitMathPMExprAtom(ExprEngineParser.MathPMExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprEngineParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(ExprEngineParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprEngineParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(ExprEngineParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprEngineParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(ExprEngineParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprEngineParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(ExprEngineParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprEngineParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void enterCaseWhen(ExprEngineParser.CaseWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprEngineParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void exitCaseWhen(ExprEngineParser.CaseWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprEngineParser#caseItem}.
	 * @param ctx the parse tree
	 */
	void enterCaseItem(ExprEngineParser.CaseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprEngineParser#caseItem}.
	 * @param ctx the parse tree
	 */
	void exitCaseItem(ExprEngineParser.CaseItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprEngineParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(ExprEngineParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprEngineParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(ExprEngineParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprEngineParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(ExprEngineParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprEngineParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(ExprEngineParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprEngineParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(ExprEngineParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprEngineParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(ExprEngineParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprEngineParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(ExprEngineParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprEngineParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(ExprEngineParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprEngineParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(ExprEngineParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprEngineParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(ExprEngineParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprEngineParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(ExprEngineParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprEngineParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(ExprEngineParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprEngineParser#paramIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterParamIdentifier(ExprEngineParser.ParamIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprEngineParser#paramIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitParamIdentifier(ExprEngineParser.ParamIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprEngineParser#mathPmOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathPmOperator(ExprEngineParser.MathPmOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprEngineParser#mathPmOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathPmOperator(ExprEngineParser.MathPmOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprEngineParser#mathMdOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathMdOperator(ExprEngineParser.MathMdOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprEngineParser#mathMdOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathMdOperator(ExprEngineParser.MathMdOperatorContext ctx);
}