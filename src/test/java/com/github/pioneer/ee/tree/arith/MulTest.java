package com.github.pioneer.ee.tree.arith;

import com.github.pioneer.ee.BaseTest;
import com.github.pioneer.ee.tree.Expression;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class MulTest extends BaseTest {

    @Test
    public void evaluate() {
        String expr = "3*6";
        Expression expression = parser.createExpression(expr);
        Number result = (Number) expression.evaluate(new HashMap<>());
        Assert.assertEquals(18, result);
    }
}