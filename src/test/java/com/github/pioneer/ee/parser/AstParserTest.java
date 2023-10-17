package com.github.pioneer.ee.parser;

import com.github.pioneer.ee.tree.Expression;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class AstParserTest {
    private AstParser parser = new AstParser();

    @Test
    public void testAdd() {
        String expr = "3+2";
        Expression expression = parser.createExpression(expr);
        int result = (int) expression.evaluate(new HashMap<>());
        Assert.assertEquals(5,result);
    }

    @Test
    public void testPlus() {
        String expr = "3-2";
        Expression expression = parser.createExpression(expr);
        int result = (int) expression.evaluate(new HashMap<>());
        Assert.assertEquals(1,result);
    }

    @Test
    public void testMulti() {
        String expr = "3*2";
        Expression expression = parser.createExpression(expr);
        int result = (int) expression.evaluate(new HashMap<>());
        Assert.assertEquals(6,result);
    }

    @Test
    public void testDivide() {
        String expr = "4/2";
        Expression expression = parser.createExpression(expr);
        int result = (int) expression.evaluate(new HashMap<>());
        Assert.assertEquals(2,result);
    }

    @Test
    public void testHybridArith() {
        String expr = "(4+4)/2*3";
        Expression expression = parser.createExpression(expr);
        int result = (int) expression.evaluate(new HashMap<>());
        Assert.assertEquals(12,result);
    }
}