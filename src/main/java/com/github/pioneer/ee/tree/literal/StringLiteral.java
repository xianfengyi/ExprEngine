package com.github.pioneer.ee.tree.literal;

import com.github.pioneer.ee.tree.Expression;
import com.github.pioneer.ee.tree.Node;
import com.google.common.collect.ImmutableList;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class StringLiteral extends Expression<String> {

    private String value;

    public StringLiteral(String text) {
        this.value = text;
    }

    @Override
    public String evaluate() {
        return evaluate(Collections.EMPTY_MAP);
    }

    @Override
    public String evaluate(Map<String, Object> parameters) {
        return value;
    }

    @Override
    public List<? extends Node> children() {
        return ImmutableList.of();
    }
}
