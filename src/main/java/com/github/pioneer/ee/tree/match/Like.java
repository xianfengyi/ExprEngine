package com.github.pioneer.ee.tree.match;

import com.github.pioneer.ee.tree.Expression;
import com.github.pioneer.ee.tree.Node;
import com.github.pioneer.ee.tree.Predicate;
import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Map;

public class Like extends Predicate {

    private Expression<?> left;
    private Expression<?> right;

    public Like(Expression<?> left, Expression<?> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public List<? extends Node> children() {
        return ImmutableList.of(left, right);
    }

    @Override
    public Boolean evaluate(Map<String, Object> parameters) {
        String leftStr = (String) left.evaluate(parameters);
        String rightStr = (String) right.evaluate(parameters);

        // remove %
        String rightStrBare = rightStr.replaceAll("%", "");
        int index = leftStr.indexOf(rightStrBare, 0);
        if (index == -1) {
            return false;
        }
        if (rightStr.startsWith("%") && !rightStr.endsWith("%")) {
            // like pioneeryi%
            if (index != 0) {
                return false;
            }
        } else if (!rightStr.startsWith("%") && rightStr.endsWith("%")) {
            // like %pioneeryi
            if (index != leftStr.length() - rightStrBare.length()) {
                return false;
            }
        }
        return true;
    }
}
