package com.github.pioneer.ee.tree.match;

import com.github.pioneer.ee.BaseTest;
import com.github.pioneer.ee.tree.Expression;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LikeTest extends BaseTest {

    @Test
    public void evaluate_true() {
        String expr = "abcdef like abc%";
        Expression expression = parser.createExpression(expr);
        Boolean result = (Boolean) expression.evaluate(new HashMap<>());
        Assert.assertEquals(true, result);
    }

}