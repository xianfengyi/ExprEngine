package com.github.pioneer.ee.tree;

import java.util.Collections;
import java.util.Map;

public abstract class Predicate extends Expression<Boolean> {

    @Override
    public Boolean evaluate() {
        return evaluate(Collections.EMPTY_MAP);
    }

    @Override
    public abstract Boolean evaluate(Map<String, Object> parameters);
}
