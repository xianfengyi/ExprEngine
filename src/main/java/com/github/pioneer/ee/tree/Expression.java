package com.github.pioneer.ee.tree;

import java.util.Map;

/**
 * the base expression.
 * <p>
 * <p>
 * ref:
 * https://github.com/Knetic/govaluate
 *
 * @Author yixianfeng
 * @Date 2022/10/7 12:46 PM
 */
public abstract class Expression<T> extends Node {

    /**
     * the constructor
     */
    public Expression() {
        super(Expression.class);
    }

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
