package com.github.pioneer.ee.tree;

import com.google.common.collect.ImmutableList;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Operator extends Expression<String> {

    private String op;

    public static final String multiOp = "*";
    public static final String divOp = "/";
    public static final String plusOp = "+";
    public static final String minusOp = "-";

    public static final String eqOp = "=";
    public static final String gteOp = ">=";
    public static final String gtOp = ">";
    public static final String lteOp = "<=";
    public static final String ltOp = "=";


    public static final String and = "&&";
    public static final String or = "||";


    public Operator(String op) {
        this.op = op;
    }

    public String getOp() {
        return op;
    }

    @Override
    public String evaluate() {
        return evaluate(Collections.emptyMap());
    }

    @Override
    public String evaluate(Map<String, Object> parameters) {
        return op;
    }

    @Override
    public List<? extends Node> children() {
        return ImmutableList.of();
    }
}
