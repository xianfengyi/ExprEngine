package com.github.pioneer.ee.tree.invoke;

import com.github.pioneer.ee.BaseTest;
import com.github.pioneer.ee.tree.Expression;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ParamTest extends BaseTest {

    @Test
    public void evaluate() {
        String expr = "$$A+$$B";
        Expression expression = parser.createExpression(expr);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("A", 3);
        parameters.put("B", 6);
        Number result = (Number) expression.evaluate(parameters);
        Assert.assertEquals(9, result);
    }
}