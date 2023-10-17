package com.github.pioneer.ee.tree.conditional;

import com.github.pioneer.ee.BaseTest;
import com.github.pioneer.ee.tree.Expression;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;

public class CashWhenTest extends BaseTest {

    @Test
    public void evaluate() {
        String expr = "CASE WHEN 70>60 THEN 1 ELSE 0 END";
        Expression res = parser.createExpression(expr);
        Assert.assertEquals(new BigDecimal(1), res.evaluate(new HashMap<>()));
    }
}