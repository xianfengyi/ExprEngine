package com.github.pioneer.ee.tree;

import java.util.Map;

/**
 * the base expression.
 */
public abstract class Expression<T> extends Node {

    /**
     * evaluate the expression
     *
     * @return eval result
     */
    public abstract T evaluate();

    /**
     * evaluate the expression
     *
     * @return eval result
     */
    public abstract T evaluate(Map<String, Object> parameters);
}
