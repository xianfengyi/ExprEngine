package com.github.pioneer.ee.tree.logic;

import com.github.pioneer.ee.tree.Node;
import com.github.pioneer.ee.tree.Predicate;
import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Map;

public class NotExpr extends Predicate {

    private Predicate successor;

    public NotExpr(Predicate successor) {
        this.successor = successor;
    }

    @Override
    public List<? extends Node> children() {
        return ImmutableList.of(successor);
    }

    @Override
    public Boolean evaluate(Map<String, Object> parameters) {
        return !successor.evaluate(parameters);
    }
}
