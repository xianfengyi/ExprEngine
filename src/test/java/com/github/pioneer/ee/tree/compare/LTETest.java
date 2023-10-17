package com.github.pioneer.ee.tree.compare;

import com.github.pioneer.ee.BaseTest;
import com.github.pioneer.ee.tree.Expression;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LTETest extends BaseTest {

    @Test
    public void evaluate_lt_true() {
        Expression leftExpr = parser.createExpression( "1+1");
        Expression rightExpr = parser.createExpression(  "2+2");

        LTE lte = new LTE(leftExpr,rightExpr);
        Boolean result = (Boolean) lte.evaluate(new HashMap<>());
        Assert.assertTrue(result);
    }

    @Test
    public void evaluate_eq_true() {
        Expression leftExpr = parser.createExpression( "1+3");
        Expression rightExpr = parser.createExpression(  "3+1");

        LTE lte = new LTE(leftExpr,rightExpr);
        Boolean result = (Boolean) lte.evaluate(new HashMap<>());
        Assert.assertTrue(result);
    }

    @Test
    public void evaluate_lt_false() {
        Expression leftExpr = parser.createExpression( "4+1");
        Expression rightExpr = parser.createExpression(  "2+2");

        LTE lte = new LTE(leftExpr,rightExpr);
        Boolean result = (Boolean) lte.evaluate(new HashMap<>());
        Assert.assertFalse(result);
    }
}