package com.github.pioneer.ee.tree.invoke;

import com.github.pioneer.ee.tree.Expression;
import com.github.pioneer.ee.tree.Node;
import com.google.common.collect.ImmutableList;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Param extends Expression<Object> {
    public static final String GET = "get";

    private String name;

    public Param(String name) {
        this.name = name;
    }

    @Override
    public Object evaluate() {
        return evaluate(Collections.EMPTY_MAP);
    }

    @Override
    public Object evaluate(Map<String, Object> parameters) {
        if (!name.contains(".")) {
            // it is base type
            return parameters.get(name);
        }
        String[] nameSplits = name.split("\\.");
        if (nameSplits.length != 2) {
            throw new UnsupportedOperationException("param is illegal " + name);
        }
        String classInstanceName = nameSplits[0];
        if (parameters.get(classInstanceName) == null) {
            throw new RuntimeException("no param value" + classInstanceName);
        }
        Class<?> clazz = parameters.get(classInstanceName).getClass();
        try {
            Method method = getMethod(clazz, nameSplits[1]);
            return method.invoke(parameters.get(classInstanceName));
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private Method getMethod(Class<?> clazz, String methodName) throws NoSuchMethodException {
        // if is class member variable, return getter method, otherwise return method directly
        try {
            StringBuilder getMethodName = new StringBuilder();
            getMethodName.append(GET);
            getMethodName.append(methodName.substring(0, 1).toUpperCase() + methodName.substring(1));
            return clazz.getMethod(getMethodName.toString());
        } catch (NoSuchMethodException exp) {
            return clazz.getMethod(methodName);
        }
    }

    @Override
    public List<? extends Node> children() {
        return ImmutableList.of();
    }

    public String symbol() {
        return "$$" + name;
    }
}
