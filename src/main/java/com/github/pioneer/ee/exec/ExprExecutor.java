package com.github.pioneer.ee.exec;

import com.github.pioneer.ee.parser.AstParser;
import com.github.pioneer.ee.tree.Expression;

import java.util.Map;

public class ExprExecutor {

    private final AstParser parser = new AstParser();

    public Object execute(String rule, Map<String, Object> parameters){
        Expression expr= parser.createExpression(rule);
        return expr.evaluate(parameters);
    }
}
