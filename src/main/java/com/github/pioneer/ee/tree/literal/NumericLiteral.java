package com.github.pioneer.ee.tree.literal;

import com.github.pioneer.ee.tree.Expression;
import com.github.pioneer.ee.tree.Node;
import com.google.common.collect.ImmutableList;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class NumericLiteral extends Expression<Number> {

    private static final int RADIX_TEN = 10;

    /**
     * the numeric literal number
     */
    private BigDecimal decimal;

    public NumericLiteral(BigDecimal decimal) {
        this.decimal = decimal;
    }

    public NumericLiteral(String numericSymbol) {
        this(numericSymbol, 10);
    }

    public NumericLiteral(String numericSymbol, int radix) {
        if (radix != RADIX_TEN) {
            this.decimal = new BigDecimal(Long.parseLong(numericSymbol, radix));
        } else {
            this.decimal = new BigDecimal(numericSymbol);
        }
    }

    @Override
    public Number evaluate() {
        return evaluate(Collections.EMPTY_MAP);
    }

    @Override
    public Number evaluate(Map<String, Object> parameters) {
        return decimal;
    }

    @Override
    public List<? extends Node> children() {
        return ImmutableList.of();
    }
}

