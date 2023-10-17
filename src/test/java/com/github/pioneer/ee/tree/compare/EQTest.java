package com.github.pioneer.ee.tree.compare;

import com.github.pioneer.ee.BaseTest;
import com.github.pioneer.ee.tree.Expression;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class EQTest extends BaseTest {

    @Test
    public void evaluate_true() {
        Expression leftExpr = parser.createExpression( "3+1");
        Expression rightExpr = parser.createExpression(  "2+2");

        EQ eq = new EQ(leftExpr,rightExpr);
        Boolean result = (Boolean) eq.evaluate(new HashMap<>());
        Assert.assertTrue(result);
    }

    @Test
    public void evaluate_false() {
        Expression leftExpr = parser.createExpression( "3+1");
        Expression rightExpr = parser.createExpression(  "2+3");

        EQ eq = new EQ(leftExpr,rightExpr);
        Boolean result = (Boolean) eq.evaluate(new HashMap<>());
        Assert.assertFalse(result);
    }
}