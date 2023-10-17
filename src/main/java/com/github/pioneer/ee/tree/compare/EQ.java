package com.github.pioneer.ee.tree.compare;

import com.github.pioneer.ee.tree.Expression;
import com.github.pioneer.ee.tree.Node;
import com.google.common.collect.ImmutableList;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class EQ extends Comparer {

    private Expression<?> left;
    private Expression<?> right;

    public EQ(Expression<?> left, Expression<?> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Boolean evaluate(Map<String, Object> parameters) {
        Object leftObj = left.evaluate(parameters);
        Object rightObj = right.evaluate(parameters);
        if (leftObj instanceof Number && rightObj instanceof Number) {
            return Objects
                    .equals(((Number) leftObj).doubleValue(), ((Number) rightObj).doubleValue());
        }
        return Objects.equals(leftObj, rightObj) || StringUtils
                .equals(String.valueOf(leftObj), String.valueOf(rightObj));
    }

    @Override
    public List<? extends Node> children() {
        return ImmutableList.of(left, right);
    }
}
