package com.github.pioneer.ee.tree.logic;

import com.github.pioneer.ee.BaseTest;
import com.github.pioneer.ee.tree.Expression;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class OrTest extends BaseTest {

    @Test
    public void evaluate_true() {
        String expr = "true||false";
        Expression expression = parser.createExpression(expr);
        Boolean result = (Boolean) expression.evaluate(new HashMap<>());
        Assert.assertEquals(true, result);
    }

    @Test
    public void evaluate_false() {
        String expr = "false||false";
        Expression expression = parser.createExpression(expr);
        Boolean result = (Boolean) expression.evaluate(new HashMap<>());
        Assert.assertEquals(false, result);
    }
}