package com.github.pioneer.ee.tree.arith;


import com.github.pioneer.ee.tree.Expression;
import org.apache.velocity.tools.generic.MathTool;

import java.util.Collections;
import java.util.Map;

public abstract class Arithmetic extends Expression<Number> {

    protected static MathTool mathTool = new MathTool();

    @Override
    public Number evaluate() {
        return evaluate(Collections.EMPTY_MAP);
    }

    @Override
    public abstract Number evaluate(Map<String, Object> parameters);

}

