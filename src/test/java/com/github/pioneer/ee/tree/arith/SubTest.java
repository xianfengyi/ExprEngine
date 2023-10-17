package com.github.pioneer.ee.tree.arith;

import com.github.pioneer.ee.parser.AstParser;
import com.github.pioneer.ee.tree.Expression;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class SubTest {

    private AstParser parser = new AstParser();

    @Test
    public void evaluate() {
        String expr = "3-2";
        Expression expression = parser.createExpression(expr);
        Number result = (Number) expression.evaluate(new HashMap<>());
        Assert.assertEquals(1, result);
    }
}