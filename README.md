# OverView

Provides support for evaluating arbitrary artithmetic/logical/string expressions.

# How to use?
You create a new ExprExecutor, then call "execute" on it.
```java
String expr = "(3+7)/2*3";
int res = (Integer) executor.execute(expr);
// result is 15
```
Cool, how about logical compare.
```java
String expr = "(7>3)&&(10>8)";
boolean res = (Boolean) executor.execute(expr, new HashMap<>());

// result is true
```
That cool, But in addition to simple expressions, conditional branch judgments are possible, there is a case: Grades for student achievement
> a score greater than 80 is outstanding, a score greater than 60 is a pass, and a score less than 60 is a fail

we can use this express:
```java
String expr = "case when $$grade>80 then '优秀' when $$grade>60 then '及格' ELSE '不及格' END";
Map<String, Object> parameters = new HashMap<>();
parameters.put("grade", 70);
String res = (String) executor.execute(expr, parameters);

// result is '及格'
```

# Operators support
* Arithmetic: + - * /
* Comparators: > >= < <= == !=
* Logical operator: || &&
* CaseWhen: SQL like case when statement
* Param: simple type and complex class type

# How to expand？
## Fist Step: expand grammar
If you wand to expand the expression engine, you first should design you grammar and expand the Antlr4 grammar file.

## Second step: Implements AstVisitor
After grammar design, you should use ANLTR Plugin to auto generate code, then implement the new method.