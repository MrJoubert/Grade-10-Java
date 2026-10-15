# Boolean Logic

## Overview

Boolean logic is a fundamental part of programming. It allows a program to evaluate conditions and determine whether statements are true or false.

Programs frequently need to make decisions. For example, a program may determine whether a Student has passed an examination, whether a user is old enough to register or whether a number falls within a specified range.

Java uses the `boolean` data type to represent logical values. A Boolean expression evaluates to either `true` or `false`, and these results can be used in conditions, calculations involving logical operators and decision-making structures.

Understanding Boolean logic is essential for developing reliable algorithms, writing selection statements and controlling the execution of a program.

This topic is intended for **Grade 10 Information Technology Students studying Java according to the IEB curriculum**.

---

## Learning Objectives

By completing this topic, you should be able to:

- Explain the meaning of Boolean values and Boolean expressions.
- Declare and use variables of type `boolean`.
- Use relational operators to compare values.
- Distinguish between the logical operators `&&`, `||` and `!`.
- Evaluate compound Boolean expressions.
- Apply operator precedence when evaluating conditions.
- Construct and interpret truth tables.
- Understand truth tables involving up to three Boolean variables.
- Combine multiple conditions to solve programming problems.
- Identify common errors involving comparisons and logical operators.
- Use Boolean logic to control the execution of Java programs.

---

## Curriculum Alignment

This topic supports the Grade 10 Boolean logic concepts covered in the IEB Information Technology Subject Assessment Guidelines (SAGS), including:

- Boolean values and expressions.
- Relational operators.
- Logical operators.
- Operator precedence in Boolean expressions.
- Truth tables involving up to three variables.
- Combining conditions to evaluate more complex expressions.

These concepts are essential for selection statements, loops, algorithm design and the evaluation of conditions in Java programs.

**Curriculum note:** This repository is a supplementary learning resource. Students should use these notes alongside prescribed course material, practical activities and official IEB assessment guidance.

---

## Topic Structure

Work through the following six subtopics in order.

| Subtopic | What You Will Learn |
|---|---|
| [Boolean Values and Expressions](Boolean-Values-and-Expressions/README.md) | Understand `true`, `false`, Boolean variables and expressions that produce logical results. |
| [Relational Operators](Relational-Operators/README.md) | Compare values using operators such as `>`, `<`, `>=`, `<=`, `==` and `!=`. |
| [Logical AND, OR and NOT](Logical-AND-OR-NOT/README.md) | Combine or reverse Boolean expressions using `&&`, `||` and `!`. |
| [Operator Precedence in Conditions](Operator-Precedence-in-Conditions/README.md) | Determine the order in which Java evaluates comparisons and logical operators. |
| [Truth Tables](Truth-Tables/README.md) | Evaluate logical expressions systematically using truth tables. |
| [Combining Conditions](Combining-Conditions/README.md) | Construct compound conditions for practical programming problems. |

---

## 1. Understanding Boolean Values

A Boolean value represents one of two possible logical states:

- `true`
- `false`

In Java, Boolean variables are declared using the `boolean` data type.

```java
boolean passed = true;
boolean registered = false;
boolean schoolOpen = true;
```

These variables can represent the results of decisions or conditions.

For example:

```java
int mark = 75;

boolean passed = mark >= 50;

System.out.println(passed);
```

Output:

```text
true
```

The expression `mark >= 50` checks whether the mark is at least 50. Since `75` is greater than or equal to `50`, the expression evaluates to `true`.

A Boolean expression can be stored in a variable or used directly in a selection statement.

---

## 2. Relational Operators

Relational operators compare two values and produce a Boolean result.

| Operator | Meaning | Example | Result |
|---|---|---|---|
| `>` | Greater than | `8 > 5` | `true` |
| `<` | Less than | `3 < 7` | `true` |
| `>=` | Greater than or equal to | `5 >= 5` | `true` |
| `<=` | Less than or equal to | `4 <= 3` | `false` |
| `==` | Equal to | `6 == 6` | `true` |
| `!=` | Not equal to | `9 != 2` | `true` |

### Example

```java
int age = 18;

System.out.println(age >= 18);
System.out.println(age < 18);
System.out.println(age == 18);
```

Output:

```text
true
false
true
```

Each expression compares `age` with a different value or condition and produces a Boolean result.

### Important: `=` Versus `==`

These operators have different purposes.

- `=` assigns a value to a variable.
- `==` compares two values for equality.

For example:

```java
int number = 10;

boolean result = number == 10;
```

The first statement assigns `10` to `number`. The second checks whether `number` is equal to `10`.

---

## 3. Logical Operators

Logical operators allow multiple Boolean expressions to be combined or reversed.

Java uses three fundamental logical operators.

| Operator | Name | Meaning |
|---|---|---|
| `&&` | AND | True only when both conditions are true. |
| `||` | OR | True when at least one condition is true. |
| `!` | NOT | Reverses a Boolean value. |

### Logical AND

The `&&` operator evaluates to `true` only when both conditions are true.

```java
int age = 20;
boolean hasPermission = true;

boolean allowed = age >= 18 && hasPermission;

System.out.println(allowed);
```

Output:

```text
true
```

Both conditions are true, so the overall result is true.

If either condition is false, the overall result is false.

### Logical OR

The `||` operator evaluates to `true` when at least one condition is true.

```java
int mark = 85;

boolean qualifies = mark >= 90 || mark >= 80;

System.out.println(qualifies);
```

Output:

```text
true
```

The second condition is true, so the complete expression evaluates to true.

### Logical NOT

The `!` operator reverses a Boolean value.

```java
boolean isAbsent = false;

System.out.println(!isAbsent);
```

Output:

```text
true
```

Since `isAbsent` is false, `!isAbsent` evaluates to true.

---

## 4. Operator Precedence in Conditions

A compound Boolean expression may contain comparisons and several logical operators. Java follows operator precedence rules to determine the order of evaluation.

For the operators introduced in this topic, the general order is:

1. Parentheses.
2. Relational and equality comparisons.
3. Logical NOT (`!`).
4. Logical AND (`&&`).
5. Logical OR (`||`).

When operators have the same precedence, Java's associativity rules determine how they are grouped.

### Example

```java
boolean result = true || false && false;

System.out.println(result);
```

Output:

```text
true
```

The `&&` operator has higher precedence than `||`.

Java first evaluates:

```java
false && false
```

The result is `false`.

The expression then becomes:

```java
true || false
```

The final result is `true`.

### Using Parentheses

Parentheses can make the intended logic clearer or change the evaluation order.

```java
boolean firstResult = true || false && false;
boolean secondResult = (true || false) && false;

System.out.println(firstResult);
System.out.println(secondResult);
```

Output:

```text
true
false
```

In the second expression, the parentheses force the OR operation to be evaluated first.

---

## 5. Truth Tables

A truth table lists the possible combinations of Boolean inputs and the result of a logical expression.

Truth tables are useful for understanding logical operators, testing compound conditions and checking whether an expression behaves as expected.

### AND Truth Table

| A | B | A `&&` B |
|---|---|---|
| `false` | `false` | `false` |
| `false` | `true` | `false` |
| `true` | `false` | `false` |
| `true` | `true` | `true` |

The AND expression is true only when both inputs are true.

### OR Truth Table

| A | B | A `||` B |
|---|---|---|
| `false` | `false` | `false` |
| `false` | `true` | `true` |
| `true` | `false` | `true` |
| `true` | `true` | `true` |

The OR expression is false only when both inputs are false.

### NOT Truth Table

| A | `!A` |
|---|---|
| `false` | `true` |
| `true` | `false` |

The NOT operator reverses the input value.

### Extending Truth Tables

With three Boolean variables, there are eight possible input combinations because each variable can be either true or false.

The number of combinations is calculated as:

\[
2^n
\]

where \(n\) is the number of Boolean variables.

For three variables:

\[
2^3 = 8
\]

Truth tables involving up to three variables are useful for evaluating more complex expressions.

---

## 6. Combining Conditions

Compound conditions allow a program to evaluate multiple requirements together.

For example, suppose a Student qualifies for a certificate if the Student has passed the examination and completed the required practical assessment.

```java
int mark = 75;
boolean practicalComplete = true;

boolean qualifies = mark >= 50 && practicalComplete;

System.out.println(qualifies);
```

Output:

```text
true
```

The expression is true because the mark is at least 50 and the practical assessment is complete.

### Checking a Range

A program may need to determine whether a number falls within a particular range.

```java
int mark = 75;

boolean validMark = mark >= 0 && mark <= 100;

System.out.println(validMark);
```

Output:

```text
true
```

Both conditions must be true for the mark to fall between 0 and 100, inclusive.

### Combining Conditions with OR

Suppose a program allows entry when a person is either a registered Student or an authorised staff member.

```java
boolean isStudent = false;
boolean isStaff = true;

boolean allowed = isStudent || isStaff;

System.out.println(allowed);
```

Output:

```text
true
```

Only one of the two conditions needs to be true.

---

## 7. Common Boolean Logic Errors

### Error 1: Confusing assignment and comparison

Incorrect when checking equality:

```java
if (mark = 50) {
    System.out.println("Mark is 50");
}
```

The assignment operator `=` cannot be used as an equality comparison in this context.

Correct:

```java
if (mark == 50) {
    System.out.println("Mark is 50");
}
```

### Error 2: Using `&` instead of `&&`

Java supports both `&` and `&&` in Boolean expressions, but they do not have identical evaluation behaviour.

For ordinary compound conditions, `&&` is generally used for logical AND because it performs short-circuit evaluation.

Similarly, `||` performs short-circuit logical OR.

### Error 3: Writing an incorrect range condition

Incorrect:

```java
boolean valid = mark >= 0 || mark <= 100;
```

For most integer values, at least one of these conditions will be true, even if the mark is outside the intended range.

Correct:

```java
boolean valid = mark >= 0 && mark <= 100;
```

Both conditions must be true for the value to be within the range.

### Error 4: Ignoring operator precedence

A compound expression may produce an unexpected result if the programmer assumes the operators are evaluated strictly from left to right.

Use precedence rules and parentheses to ensure that the expression represents the intended logic.

### Error 5: Reversing a condition incorrectly

Remember that `!` reverses a Boolean result. For example, `!(age >= 18)` is equivalent to `age < 18` for an integer age.

---

## 8. Recommended Study Approach

For each subtopic:

1. Learn the meaning of each operator.
2. Practise evaluating individual Boolean expressions.
3. Construct truth tables for logical operators.
4. Evaluate compound expressions one operation at a time.
5. Pay attention to operator precedence.
6. Use parentheses to make complex conditions clearer.
7. Test expressions using all relevant combinations of true and false values.
8. Explain why each expression produces its result.

Do not rely on intuition alone when evaluating compound conditions. Work through the expression systematically.

---

## 9. Practical Challenge

Create a Java program called `BooleanLogicPractice` that:

1. Declares an integer variable called `mark`.
2. Declares a Boolean variable called `practicalComplete`.
3. Determines whether the mark is at least 50.
4. Determines whether the mark falls between 0 and 100, inclusive.
5. Determines whether the Student has passed and completed the practical assessment.
6. Uses logical OR to determine whether either of two requirements has been met.
7. Displays the result of each Boolean expression.

Test your program using different marks and Boolean values.

**Extension:** Create a truth table for an expression containing three Boolean variables and explain how its output changes for each input combination.

---

## 10. Key Takeaways

By the end of this topic, you should understand that:

- Boolean values are either `true` or `false`.
- Relational operators compare values and produce Boolean results.
- `&&` requires both conditions to be true.
- `||` requires at least one condition to be true.
- `!` reverses a Boolean value.
- Operator precedence determines the evaluation order of compound expressions.
- Truth tables provide a systematic method for evaluating logical expressions.
- Compound conditions allow multiple requirements to be evaluated together.
- Correct Boolean logic is essential for reliable selection statements and loops.

These concepts form the foundation for controlling program flow and solving more complex programming problems.

---

## Navigation

[**← Previous: String Manipulation**](../05-String-Manipulation/README.md)

[**Next: Selection and Loops →**](../07-Selection-and-Loops/README.md)

[Return to the Grade 10 Java repository](../README.md)
