# Operator Precedence

## Learning Objectives

By the end of this topic, you should be able to:

- Explain what operator precedence means.
- Identify the order in which Java evaluates arithmetic operators.
- Apply operator precedence to calculations involving addition, subtraction, multiplication and division.
- Evaluate expressions containing operators with the same precedence.
- Use brackets to make calculations clearer.

## 1. What Is Operator Precedence?

Operator precedence determines the order in which Java evaluates operators in an expression.

Consider this calculation:

```java
int result = 4 + 3 * 5;
```

You might calculate from left to right and obtain:

\[
(4 + 3) \times 5 = 35
\]

However, Java performs multiplication before addition.

Therefore:

\[
4 + (3 \times 5) = 19
\]

The value of `result` is `19`.

**Important:** Java does not simply calculate every expression from left to right. Operator precedence determines which operations happen first.

## 2. The Order of Arithmetic Operators

For the arithmetic operators covered in this topic, use the following order:

| Priority | Operators | Description |
|---|---|---|
| 1 | `()` | Expressions inside brackets |
| 2 | `*`, `/`, `%` | Multiplication, division and remainder |
| 3 | `+`, `-` | Addition and subtraction |

Operators at the same priority are generally evaluated from left to right.

For example, multiplication and division have the same precedence. Addition and subtraction also have the same precedence.

## 3. Multiplication Before Addition

Consider this Java statement:

```java
int total = 10 + 4 * 3;
```

Step 1: Calculate the multiplication.

\[
4 \times 3 = 12
\]

Step 2: Add the remaining value.

\[
10 + 12 = 22
\]

The result is `22`.

### School example

A Student completes 4 homework activities, earning 3 marks for each activity, and receives another 10 marks for a project.

```java
int projectMark = 10;
int homeworkActivities = 4;
int marksPerActivity = 3;

int totalMarks = projectMark + homeworkActivities * marksPerActivity;
```

The result is `22`.

Java multiplies the number of activities by the marks per activity before adding the project mark.

## 4. Division Before Addition

Consider:

```java
int result = 18 + 20 / 5;
```

Division takes place before addition.

Step 1:

\[
20 \div 5 = 4
\]

Step 2:

\[
18 + 4 = 22
\]

The result is `22`.

Remember that because both operands of `20 / 5` are integers, Java performs integer division.

## 5. Operators with the Same Precedence

When operators have the same precedence, Java generally evaluates them from left to right.

For example:

```java
int result = 20 / 5 * 2;
```

Division and multiplication have the same precedence.

Step 1:

\[
20 \div 5 = 4
\]

Step 2:

\[
4 \times 2 = 8
\]

The result is `8`.

Do not automatically perform multiplication before division simply because multiplication appears earlier in a precedence list.

Another example:

```java
int result = 20 - 6 + 2;
```

Addition and subtraction have the same precedence.

Java evaluates the expression from left to right:

\[
20 - 6 + 2 = 14 + 2 = 16
\]

The result is `16`.

## 6. The Effect of Brackets

Brackets allow you to control the order of calculations.

Compare these two statements:

```java
int firstResult = 5 + 3 * 4;
int secondResult = (5 + 3) * 4;
```

For `firstResult`, multiplication occurs first:

\[
5 + (3 \times 4) = 17
\]

For `secondResult`, the brackets are evaluated first:

\[
(5 + 3) \times 4 = 32
\]

The results are different because the brackets change the order of evaluation.

### School example

Suppose a Student's total score includes a test mark and a project mark. The combined score is then multiplied by a weighting factor.

```java
int testMark = 60;
int projectMark = 20;
int weightingFactor = 2;

int weightedTotal = (testMark + projectMark) * weightingFactor;
```

The result is `160`.

The brackets ensure that the two marks are added before the total is multiplied by the weighting factor.

## 7. Operator Precedence and Real Division

Operator precedence also affects calculations involving `double` values.

Consider:

```java
double result = 10 + 9 / 2.0;
```

Division takes place before addition:

\[
10 + (9 \div 2.0) = 10 + 4.5 = 14.5
\]

The result is `14.5`.

Now consider:

```java
double result = (10 + 9) / 2.0;
```

The brackets are evaluated first:

\[
(10 + 9) \div 2.0 = 9.5
\]

The result is `9.5`.

## 8. Common Mistakes

### Mistake 1: Calculating everything from left to right

Incorrect approach:

```java
int result = 6 + 2 * 5;
```

Do not add `6 + 2` first.

Correct evaluation:

\[
6 + (2 \times 5) = 16
\]

### Mistake 2: Always doing multiplication before division

Consider:

```java
int result = 24 / 4 * 3;
```

Multiplication and division have the same precedence, so evaluate from left to right:

\[
24 \div 4 \times 3 = 6 \times 3 = 18
\]

The result is `18`.

### Mistake 3: Forgetting the effect of brackets

```java
int result = (6 + 2) * 5;
```

The result is `40`, not `16`, because the addition takes place first.

### Mistake 4: Ignoring integer division

```java
double result = 10 + 9 / 2;
```

The division is integer division because both operands are integers.

The result is:

\[
10 + 4.0 = 14.0
\]

To preserve the fractional part, use:

```java
double result = 10 + 9 / 2.0;
```

The result is `14.5`.

## 9. Practice Activities

Complete these activities in NetBeans. Predict each result before running your code.

### Activity 1: Basic Precedence

Calculate the results of these expressions:

```java
int resultOne = 5 + 4 * 3;
int resultTwo = 18 - 8 / 2;
int resultThree = 6 * 2 + 7;
int resultFour = 24 / 4 * 2;
```

Display each result.

### Activity 2: Brackets

Calculate:

```java
int resultOne = (5 + 4) * 3;
int resultTwo = 18 - (8 / 2);
int resultThree = (6 * 2) + 7;
int resultFour = 24 / (4 * 2);
```

Compare the results with Activity 1. Explain why some answers differ.

### Activity 3: Assessment Calculation

A Student receives 30 marks for a project and 4 marks for each of 5 homework activities.

1. Declare suitable variables.
2. Calculate the total using operator precedence.
3. Rewrite the calculation using brackets.
4. Display the result.

### Activity 4: Find the Error

A Student's average is calculated as follows:

```java
int testOne = 40;
int testTwo = 35;
int testThree = 45;

double average = testOne + testTwo + testThree / 3.0;
```

1. Explain the order in which Java evaluates this expression.
2. Explain why the result is not the average of the three tests.
3. Rewrite the expression correctly using brackets.

## 10. Summary

- Operator precedence determines the order in which operators are evaluated.
- Brackets are evaluated first.
- Multiplication, division and remainder have higher precedence than addition and subtraction.
- Operators at the same precedence are generally evaluated from left to right.
- Brackets can change the result of an expression.
- Consider both operator precedence and data types when calculating averages and other values.
