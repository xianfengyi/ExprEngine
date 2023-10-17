package com.github.pioneer.ee.tree.logic;

import com.github.pioneer.ee.tree.Expression;
import com.github.pioneer.ee.tree.Node;
import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Map;

public class Or extends Logic {

    private Expression<?> left;
    private Expression<?> right;

    public Or(Expression<?> left, Expression<?> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Boolean evaluate(Map<String, Object> parameters) {
        return (Boolean) left.evaluate(parameters) || (Boolean) right.evaluate(parameters);
    }

    @Override
    public List<? extends Node> children() {
        return ImmutableList.of(left, right);
    }
}
