package com.github.pioneer.ee.exec;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ExprExecutorTest {

    private ExprExecutor executor = new ExprExecutor();

    @Test
    public void execute_arith() {
        String expr = "(3+7)/2*3";
        int res = (Integer) executor.execute(expr, new HashMap<>());
        Assert.assertEquals(15, res);
    }

    @Test
    public void execute_logical() {
        String expr = "(7>3)&&(10>8)";
        boolean res = (Boolean) executor.execute(expr, new HashMap<>());
        Assert.assertTrue(res);
    }


    @Test
    public void execute_casewhen1() {
        String expr = "case when $$grade>80 then '优秀' when $$grade>60 then '及格' ELSE '不及格' END";
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("grade", 70);
        String res = (String) executor.execute(expr, parameters);
        Assert.assertEquals("'及格'", res);
    }

    @Test
    public void execute_casewhen2() {
        String expr = "case when $$grade>80 then '优秀' when $$grade>60 then '及格' ELSE '不及格' END";
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("grade", 30);
        String res = (String) executor.execute(expr, parameters);
        Assert.assertEquals("'不及格'", res);
    }

    @Test
    public void execute_classParam() {
        String expr = "case when $$user.age>60 then '老人' when $$user.age>20 then '成年' ELSE '青年' END";
        Map<String, Object> parameters = new HashMap<>();
        User user = new User("pioneeryi",30);
        parameters.put("user", user);
        String res = (String) executor.execute(expr, parameters);
        Assert.assertEquals("'成年'", res);
    }

    public class User{
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}