package com.github.pioneer.ee.tree.conditional;

import com.github.pioneer.ee.tree.Expression;
import com.github.pioneer.ee.tree.Node;
import com.github.pioneer.ee.tree.Predicate;
import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class CashWhen extends Expression<Object> {

    private List<CaseItem> conditions;

    private Expression<?> elseExpr;

    public CashWhen(List<CaseItem> conditions, Expression<?> elseExpr) {
        this.conditions = conditions;
        this.elseExpr = elseExpr;
    }

    @Override
    public Object evaluate() {
        return evaluate(Collections.EMPTY_MAP);
    }

    @Override
    public Object evaluate(Map<String, Object> parameters) {
        for (CaseItem wt : conditions) {
            Object conditionResult = wt.evaluate(parameters);
            if (conditionResult != null) {
                return conditionResult;
            }
        }
        return elseExpr.evaluate(parameters);
    }

    @Override
    public List<? extends Node> children() {
        List<Expression> expressions = new ArrayList<>(conditions);
        expressions.add(elseExpr);
        return expressions;
    }

    public static class CaseItem extends Expression<Object> {
        private Predicate condition;

        //the output expression
        private Expression consequent;

        public CaseItem(Predicate condition, Expression consequent) {
            this.condition = condition;
            this.consequent = consequent;
        }

        @Override
        public Object evaluate() {
            return evaluate(Collections.EMPTY_MAP);
        }

        @Override
        public Object evaluate(Map<String, Object> parameters) {
            if (condition.evaluate(parameters)) {
                return consequent.evaluate(parameters);
            }
            return null;
        }

        @Override
        public List<? extends Node> children() {
            return ImmutableList.of(condition, consequent);
        }
    }
}
