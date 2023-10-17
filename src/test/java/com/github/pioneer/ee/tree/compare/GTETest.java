package com.github.pioneer.ee.tree.compare;

import com.github.pioneer.ee.BaseTest;
import com.github.pioneer.ee.tree.Expression;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GTETest extends BaseTest {

    @Test
    public void evaluate_gt_true() {
        Expression leftExpr = parser.createExpression( "3+1");
        Expression rightExpr = parser.createExpression(  "1+1");

        GTE gte = new GTE(leftExpr,rightExpr);
        Boolean result = (Boolean) gte.evaluate(new HashMap<>());
        Assert.assertTrue(result);
    }

    @Test
    public void evaluate_eq_true() {
        Expression leftExpr = parser.createExpression( "3+1");
        Expression rightExpr = parser.createExpression(  "3+1");

        GTE gte = new GTE(leftExpr,rightExpr);
        Boolean result = (Boolean) gte.evaluate(new HashMap<>());
        Assert.assertTrue(result);
    }

    @Test
    public void evaluate_false() {
        Expression leftExpr = parser.createExpression( "2+1");
        Expression rightExpr = parser.createExpression(  "2+2");

        GTE gte = new GTE(leftExpr,rightExpr);
        Boolean result = (Boolean) gte.evaluate(new HashMap<>());
        Assert.assertFalse(result);
    }
}