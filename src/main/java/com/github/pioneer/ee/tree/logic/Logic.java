package com.github.pioneer.ee.tree.logic;

import com.github.pioneer.ee.tree.Predicate;

import java.util.Map;

public abstract class Logic extends Predicate {
    /**
     * generate bool answer
     *
     * @return
     */
    @Override
    public abstract Boolean evaluate(Map<String, Object> parameters);
}
