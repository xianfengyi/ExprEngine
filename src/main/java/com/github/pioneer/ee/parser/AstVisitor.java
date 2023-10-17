package com.github.pioneer.ee.parser;

import com.github.pioneer.ee.tree.Expression;
import com.github.pioneer.ee.tree.Operator;
import com.github.pioneer.ee.tree.Predicate;
import com.github.pioneer.ee.tree.arith.Add;
import com.github.pioneer.ee.tree.arith.Div;
import com.github.pioneer.ee.tree.arith.Mul;
import com.github.pioneer.ee.tree.arith.Sub;
import com.github.pioneer.ee.tree.compare.*;
import com.github.pioneer.ee.tree.conditional.CashWhen;
import com.github.pioneer.ee.tree.invoke.Param;
import com.github.pioneer.ee.tree.literal.BooleanLiteral;
import com.github.pioneer.ee.tree.literal.NumericLiteral;
import com.github.pioneer.ee.tree.literal.StringLiteral;
import com.github.pioneer.ee.tree.logic.And;
import com.github.pioneer.ee.tree.logic.NotExpr;
import com.github.pioneer.ee.tree.logic.Or;
import com.github.pioneer.ee.tree.match.Like;
import gen.antlr.ExprEngineParser;
import gen.antlr.ExprEngineVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.List;
import java.util.stream.Collectors;

public class AstVisitor extends AbstractParseTreeVisitor<Expression<?>> implements ExprEngineVisitor<Expression<?>> {
    @Override
    public Expression<?> visitExpression(ExprEngineParser.ExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Expression<?> visitExprAtomPredicate(ExprEngineParser.ExprAtomPredicateContext ctx) {
        return visit(ctx.expressionAtom());
    }

    @Override
    public Expression<?> visitComparisonPredicate(ExprEngineParser.ComparisonPredicateContext ctx) {
        Expression left = visit(ctx.left);
        Expression right = visit(ctx.right);
        Operator operator = (Operator) visit(ctx.comparisonOperator());
        if (operator.getOp().equals(Operator.eqOp)) {
            return new EQ(left, right);
        } else if (operator.getOp().equals(Operator.gtOp)) {
            return new GT(left, right);
        } else if (operator.getOp().equals(Operator.gteOp)) {
            return new GTE(left, right);
        } else if (operator.getOp().equals(Operator.ltOp)) {
            return new LT(left, right);
        } else if (operator.getOp().equals(Operator.lteOp)) {
            return new LTE(left, right);
        }
        throw new UnsupportedOperationException("not support this operator: " + operator.getOp());
    }

    @Override
    public Expression<?> visitLogicalPredicate(ExprEngineParser.LogicalPredicateContext ctx) {
        Expression left = visit(ctx.left);
        Expression right = visit(ctx.right);
        Operator operator = (Operator) visit(ctx.logicalOperator());
        if (operator.getOp().equals(Operator.and)) {
            return new And(left, right);
        } else if (operator.getOp().equals(Operator.or)) {
            return new Or(left, right);
        }
        throw new UnsupportedOperationException("not support this operator: " + operator.getOp());
    }

    @Override
    public Expression<?> visitLikePredicate(ExprEngineParser.LikePredicateContext ctx) {
        if (ctx.notOperator == null) {
            return new Like(visit(ctx.expressionAtom(0)), visit(ctx.expressionAtom(1)));
        }
        return new NotExpr(new Like(visit(ctx.expressionAtom(0)), visit(ctx.expressionAtom(1))));
    }

    @Override
    public Expression<?> visitParamExprAtom(ExprEngineParser.ParamExprAtomContext ctx) {
        return visit(ctx.param());
    }

    @Override
    public Expression<?> visitMathMDExprAtom(ExprEngineParser.MathMDExprAtomContext ctx) {
        Expression left = visit(ctx.left);
        Expression right = visit(ctx.right);
        Operator operator = (Operator) visit(ctx.mathMdOperator());
        if (operator.getOp().equals(Operator.multiOp)) {
            return new Mul(left, right);
        } else if (operator.getOp().equals(Operator.divOp)) {
            return new Div(left, right);
        }
        throw new UnsupportedOperationException("not support this operator: " + operator.getOp());
    }

    @Override
    public Expression<?> visitConstantExprAtom(ExprEngineParser.ConstantExprAtomContext ctx) {
        return visit(ctx.constant());
    }

    @Override
    public Expression<?> visitCaseWhenExprAtom(ExprEngineParser.CaseWhenExprAtomContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Expression<?> visitMathPMExprAtom(ExprEngineParser.MathPMExprAtomContext ctx) {
        Expression left = visit(ctx.left);
        Expression right = visit(ctx.right);
        Operator operator = (Operator) visit(ctx.mathPmOperator());
        if (operator.getOp().equals(Operator.plusOp)) {
            return new Add(left, right);
        } else if (operator.getOp().equals(Operator.minusOp)) {
            return new Sub(left, right);
        }
        throw new UnsupportedOperationException("not support this operator: " + operator.getOp());
    }

    @Override
    public Expression<?> visitBracketExprAtom(ExprEngineParser.BracketExprAtomContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Expression<?> visitLogicalOperator(ExprEngineParser.LogicalOperatorContext ctx) {
        return new Operator(ctx.getText());
    }

    @Override
    public Expression<?> visitComparisonOperator(ExprEngineParser.ComparisonOperatorContext ctx) {
        return new Operator(ctx.getText());
    }

    @Override
    public Expression<?> visitCaseWhen(ExprEngineParser.CaseWhenContext ctx) {
        List conditions = ctx.caseItem().stream().map(this::visit).collect(Collectors.toList());
        return new CashWhen(conditions, ctx.elseArg == null ? null : visit(ctx.elseArg));
    }

    @Override
    public Expression<?> visitCaseItem(ExprEngineParser.CaseItemContext ctx) {
        Predicate predicate = (Predicate) visit(ctx.condition);
        return new CashWhen.CaseItem(predicate, visit(ctx.consequent));
    }

    @Override
    public Expression<?> visitConstant(ExprEngineParser.ConstantContext ctx) {
        if (ctx.stringLiteral() != null) {
            return visit(ctx.stringLiteral());
        } else if (ctx.decimalLiteral() != null) {
            return new NumericLiteral(ctx.getText());
        } else if (ctx.booleanLiteral() != null) {
            return visit(ctx.booleanLiteral());
        } else if (ctx.IDENTIFIER() != null) {
            return new StringLiteral(ctx.IDENTIFIER().getText());
        }
        return null;
    }

    @Override
    public Expression<?> visitStringLiteral(ExprEngineParser.StringLiteralContext ctx) {
        String txt = ctx.getText();
        return new StringLiteral(txt);
    }

    @Override
    public Expression<?> visitFloatLiteral(ExprEngineParser.FloatLiteralContext ctx) {
        return new NumericLiteral(ctx.getText());
    }

    @Override
    public Expression<?> visitDecimalLiteral(ExprEngineParser.DecimalLiteralContext ctx) {
        return new NumericLiteral(ctx.getText());
    }

    @Override
    public Expression<?> visitBooleanLiteral(ExprEngineParser.BooleanLiteralContext ctx) {
        return new BooleanLiteral(Boolean.parseBoolean(ctx.getText()));
    }

    @Override
    public Expression<?> visitParam(ExprEngineParser.ParamContext ctx) {
        return new Param((String) visit(ctx.name).evaluate());
    }

    @Override
    public Expression<?> visitParamIdentifier(ExprEngineParser.ParamIdentifierContext ctx) {
        return new StringLiteral(ctx.getText());
    }

    @Override
    public Expression<?> visitMathPmOperator(ExprEngineParser.MathPmOperatorContext ctx) {
        return new Operator(ctx.getText());
    }

    @Override
    public Expression<?> visitMathMdOperator(ExprEngineParser.MathMdOperatorContext ctx) {
        return new Operator(ctx.getText());
    }
}
