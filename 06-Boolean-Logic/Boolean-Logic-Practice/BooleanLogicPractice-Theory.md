# Boolean Logic Practice

## Learning Objectives

By the end of this section, you should be able to:

- Use relational operators to compare values.
- Combine conditions using `&&`, `||` and `!`.
- Use brackets to make complex conditions easier to understand.
- Apply Boolean expressions to school-related situations.
- Use De Morgan's Laws to rewrite logical expressions.

## 1. Relational Operators

Relational operators compare two values and produce a Boolean result: `true` or `false`.

| Operator | Meaning | Example |
|---|---|---|
| `==` | Equal to | `mark == 75` |
| `!=` | Not equal to | `mark != 75` |
| `>` | Greater than | `mark > 75` |
| `<` | Less than | `mark < 75` |
| `>=` | Greater than or equal to | `mark >= 50` |
| `<=` | Less than or equal to | `mark <= 50` |

For example:

```java
int mark = 68;

System.out.println(mark >= 50);
```

Output:

```text
true
```

The expression is true because 68 is greater than or equal to 50.

## 2. Logical Operators

Logical operators combine or reverse Boolean expressions.

| Operator | Meaning | Example |
|---|---|---|
| `&&` | AND: both conditions must be true | `mark >= 50 && mark <= 100` |
| `||` | OR: at least one condition must be true | `grade == 10 || grade == 11` |
| `!` | NOT: reverses a Boolean value | `!(mark >= 50)` |

### AND (`&&`)

Both conditions must be true for the entire expression to be true.

```java
int mark = 72;

System.out.println(mark >= 50 && mark <= 100);
```

Output:

```text
true
```

### OR (`||`)

At least one condition must be true.

```java
int grade = 11;

System.out.println(grade == 10 || grade == 11);
```

Output:

```text
true
```

### NOT (`!`)

The NOT operator reverses a Boolean result.

```java
int mark = 42;

System.out.println(!(mark >= 50));
```

Output:

```text
true
```

The original comparison is false because 42 is not at least 50. The `!` reverses that result to true.

## 3. Combining Multiple Conditions

A single Boolean expression can contain several conditions.

```java
int mark = 75;
int attendance = 90;

boolean eligible = mark >= 50 && attendance >= 80;

System.out.println(eligible);
```

Output:

```text
true
```

Both requirements are met: the mark is at least 50 and attendance is at least 80.

### Using brackets

Brackets make the intended grouping clear.

```java
int grade = 11;
int mark = 78;

boolean eligible = (grade == 10 || grade == 11) && mark >= 50;

System.out.println(eligible);
```

Output:

```text
true
```

The Student must be in Grade 10 or Grade 11, and must also have a mark of at least 50.

Without brackets, the expression could be evaluated differently because `&&` has higher precedence than `||`.

## 4. De Morgan's Laws

De Morgan's Laws explain how to negate expressions containing AND and OR.

### First Law

The negation of an AND expression becomes an OR expression, with both conditions negated.

```java
!(A && B)
```

is equivalent to:

```java
!A || !B
```

### Second Law

The negation of an OR expression becomes an AND expression, with both conditions negated.

```java
!(A || B)
```

is equivalent to:

```java
!A && !B
```

For example:

```java
int mark = 45;
int attendance = 90;

boolean first = !(mark >= 50 && attendance >= 80);
boolean second = mark < 50 || attendance < 80;

System.out.println(first);
System.out.println(second);
```

Output:

```text
false
false
```

Both expressions produce the same result because the mark is below 50, but attendance meets the requirement. The original AND expression is false, so its negation is true.

**Correction to the example above:** the expected output for both expressions is `true`, because `mark >= 50 && attendance >= 80` is false, and negating false produces true. The equivalent OR expression is also true because `mark < 50` is true.

## 5. Common Mistakes

- Using `=` instead of `==` when comparing values.
- Using `&` instead of `&&` or `|` instead of `||` when the logical operators are required.
- Forgetting that `&&` requires both conditions to be true.
- Assuming `||` requires both conditions to be true.
- Forgetting to negate every condition when applying De Morgan's Laws.
- Leaving out brackets when they are needed to express the intended grouping.
- Using `!` incorrectly and reversing the wrong part of an expression.

## 6. Practice Exercises

Try these exercises before looking at the answers.

1. A Student has a mark of 64. Write a Boolean expression to determine whether the Student passed, using 50 as the pass mark.
2. A Student may attend an activity if they are in Grade 10 or Grade 11. Write the condition using `||`.
3. A Student qualifies for a certificate if their mark is at least 75 and their attendance is at least 80. Write the condition using `&&`.
4. Rewrite `!(mark >= 50 && attendance >= 80)` using De Morgan's Law.
5. Explain the difference between `&&` and `||`.

## Summary

Boolean logic allows a program to make decisions based on comparisons. Relational operators compare values, logical operators combine or reverse conditions, brackets clarify grouping, and De Morgan's Laws help rewrite negated expressions. Practise evaluating each condition separately before combining the results.
