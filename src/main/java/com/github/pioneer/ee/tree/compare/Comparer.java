package com.github.pioneer.ee.tree.compare;

import com.github.pioneer.ee.tree.Predicate;

import java.util.Collections;

public abstract class Comparer extends Predicate {

    @Override
    public Boolean evaluate() {
        return evaluate(Collections.EMPTY_MAP);
    }
}
