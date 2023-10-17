package com.github.pioneer.ee.tree.arith;

import com.github.pioneer.ee.tree.Expression;
import com.github.pioneer.ee.tree.Node;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.Immutable;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Sub extends Arithmetic {
    private Expression<?> left;
    private Expression<?> right;

    public Sub(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public List<? extends Node> children() {
        return ImmutableList.of(left, right);
    }

    @Override
    public Number evaluate(Map<String, Object> parameters) {
        return mathTool.sub(left.evaluate(parameters), right.evaluate(parameters));
    }
}