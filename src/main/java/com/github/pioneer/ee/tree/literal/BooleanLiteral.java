package com.github.pioneer.ee.tree.literal;

import com.github.pioneer.ee.tree.Expression;
import com.github.pioneer.ee.tree.Node;
import com.google.common.collect.ImmutableList;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class BooleanLiteral extends Expression<Boolean> {
    private Boolean value;

    public BooleanLiteral(Boolean value) {
        this.value = value;
    }

    @Override
    public Boolean evaluate() {
        return evaluate(Collections.EMPTY_MAP);
    }

    @Override
    public Boolean evaluate(Map<String, Object> parameters) {
        return value;
    }

    @Override
    public List<? extends Node> children() {
        return ImmutableList.of();
    }
}
