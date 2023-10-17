package com.github.pioneer.ee.parser;

import gen.antlr.ExprEngineLexer;
import gen.antlr.ExprEngineParser;
import com.github.pioneer.ee.tree.Expression;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class AstParser {

    public Expression createExpression(String expr) {
        return invokeParser(expr);
    }

    private Expression invokeParser(String expr) {
        ExprEngineLexer lexer = new ExprEngineLexer(CharStreams.fromString(expr));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ExprEngineParser parser = new ExprEngineParser(tokenStream);

        ExprEngineParser.ExpressionContext tree = null;
        try {
            tree = parser.expression();
        } catch (Exception exp) {
            parser.reset();
        }
        return new AstVisitor().visit(tree);
    }
}
