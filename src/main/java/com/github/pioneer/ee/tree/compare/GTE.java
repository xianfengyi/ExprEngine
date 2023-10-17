package com.github.pioneer.ee.tree.compare;

import com.github.pioneer.ee.tree.Expression;
import com.github.pioneer.ee.tree.Node;
import com.google.common.collect.ImmutableList;
import org.apache.velocity.tools.generic.MathTool;

import java.util.List;
import java.util.Map;

public class GTE extends Comparer {
    protected static MathTool mathTool = new MathTool();

    private Expression<?> left;
    private Expression<?> right;

    public GTE(Expression<?> left, Expression<?> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public List<? extends Node> children() {
        return ImmutableList.of(left, right);
    }

    @Override
    public Boolean evaluate(Map<String, Object> parameters) {
        Object leftObj = left.evaluate(parameters);
        Object rightObj = right.evaluate(parameters);

        boolean isNumber = (leftObj instanceof Number) && (rightObj instanceof Number);
        if (!isNumber) {
            throw new RuntimeException("expr is not number");
        }
        Number ret = mathTool.sub(((Number) leftObj).doubleValue(), ((Number) rightObj).doubleValue()).doubleValue();
        return ret.doubleValue() >= 0.0;
    }
}
