# Operators and Calculations

## Overview

Operators allow a Java program to perform calculations, compare values and manipulate data. They are essential to almost every programming task, from calculating a Student's average mark to determining the total cost of a purchase.

An **operator** is a symbol that tells Java to perform a particular operation. The values on which an operator acts are called **operands**.

For example, in the expression `total = price + tax;`, the `+` operator adds the values stored in `price` and `tax`, while the `=` operator assigns the result to `total`.

Understanding how operators work is particularly important when writing algorithms. A program may contain correct variables and values but still produce an incorrect result if the wrong operator is used or if the calculation is evaluated in an unexpected order.

This topic develops the knowledge required to perform arithmetic calculations accurately, understand Java's division rules, apply operator precedence and identify common calculation errors.

The material is intended for **Grade 10 Information Technology Students studying Java according to the IEB curriculum**.

---

## Learning Objectives

By completing this topic, you should be able to:

- Identify and use Java's basic arithmetic operators.
- Write arithmetic expressions using variables, constants and numeric literals.
- Distinguish between integer division and floating-point division.
- Use the remainder operator, `%`, to calculate remainders.
- Explain and apply operator precedence.
- Use brackets to control the order of calculations.
- Predict the results of arithmetic expressions.
- Identify common errors involving division, data types and calculation order.
- Develop simple algorithms that use arithmetic operations.
- Test calculations using different input values and verify that the results are correct.

---

## Curriculum Alignment

This topic supports Grade 10 Java programming concepts associated with arithmetic operators, numeric calculations, integer division, remainder calculations, real division and operator precedence.

These skills also contribute to algorithm design and problem-solving, where calculations form part of a sequence of processing steps.

The six subtopics provide focused explanations and practical examples for each area.

**Curriculum note:** This repository is a supplementary learning resource. Students should use these notes alongside prescribed course material, practical activities and official IEB assessment guidance.

---

## Topic Structure

Work through the following subtopics in order.

| Subtopic | What You Will Learn |
|---|---|
| [Arithmetic Operators](Arithmetic-Operators/README.md) | Use addition, subtraction, multiplication, division and remainder operators in Java expressions. |
| [Integer Division and Remainder](Integer-Division-and-Remainder/README.md) | Understand how integer division works and use `%` to determine remainders. |
| [Real Division](Real-Division/README.md) | Perform floating-point division and understand how operand types affect the result. |
| [Operator Precedence](Operator-Precedence/README.md) | Understand the order in which Java evaluates arithmetic expressions. |
| [Brackets and Calculations](Brackets-and-Calculations/README.md) | Use brackets to make calculations clearer and control evaluation order. |
| [Common Calculation Errors](Common-Calculation-Errors/README.md) | Identify, explain and correct frequent mistakes in Java calculations. |

---

## 1. Arithmetic Operators

Java provides several arithmetic operators for numerical calculations.

| Operator | Name | Example | Result |
|---|---|---|---:|
| `+` | Addition | `10 + 4` | `14` |
| `-` | Subtraction | `10 - 4` | `6` |
| `*` | Multiplication | `10 * 4` | `40` |
| `/` | Division | `10 / 4` | Depends on operand types |
| `%` | Remainder | `10 % 4` | `2` |

The result of an expression depends on the operator, the operand values and their data types.

### Example

```java
int firstNumber = 12;
int secondNumber = 4;

int sum = firstNumber + secondNumber;
int difference = firstNumber - secondNumber;
int product = firstNumber * secondNumber;
int quotient = firstNumber / secondNumber;

System.out.println(sum);
System.out.println(difference);
System.out.println(product);
System.out.println(quotient);
```

Output:

```text
16
8
48
3
```

Each expression performs a different operation on the same two variables.

---

## 2. Integer Division and Real Division

One of the most important concepts in Java calculations is the difference between integer division and floating-point division.

Consider the expression:

```java
System.out.println(7 / 2);
```

Output:

```text
3
```

Both operands are integers. Java therefore performs integer division, and the fractional part of the result is discarded.

Now consider:

```java
System.out.println(7 / 2.0);
```

Output:

```text
3.5
```

The second expression contains a `double` operand. Java performs floating-point division, producing a decimal result.

This distinction is especially important when calculating averages, percentages and measurements.

For example:

```java
int total = 17;
int numberOfMarks = 4;

double average = total / (double) numberOfMarks;

System.out.println(average);
```

Output:

```text
4.25
```

Casting `numberOfMarks` to `double` ensures that the division is performed using floating-point arithmetic.

**Important:** Assigning an integer-division result to a `double` does not restore the discarded fractional part.

```java
double result = 7 / 2;
System.out.println(result);
```

Output:

```text
3.0
```

The division produces `3` first, which is then stored as `3.0`.

---

## 3. The Remainder Operator

The remainder operator, `%`, calculates the remainder after division.

For example:

```java
int result = 17 % 5;

System.out.println(result);
```

Output:

```text
2
```

This is because \(17 = 5 \times 3 + 2\).

The remainder operator is useful for many programming problems, including:

- Determining whether a number is even or odd.
- Checking whether one number is divisible by another.
- Extracting individual digits from a whole number.
- Repeating a sequence of operations.
- Determining remainders in mathematical algorithms.

### Example: Even or Odd

```java
int number = 14;

if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

Output:

```text
Even
```

If a number divided by `2` has a remainder of `0`, it is even. Otherwise, it is odd.

The `if` statement in this example is introduced in the Selection and Loops topic.

---

## 4. Operator Precedence

An arithmetic expression may contain several operators. Java follows established precedence rules to determine which operations are performed first.

For the arithmetic operators introduced here, multiplication, division and remainder generally have higher precedence than addition and subtraction.

For example:

```java
int result = 10 + 4 * 3;

System.out.println(result);
```

Output:

```text
22
```

Java performs the multiplication first:

1. Calculate `4 * 3`, which gives `12`.
2. Calculate `10 + 12`, which gives `22`.

The expression is not evaluated strictly from left to right.

### Precedence Summary

| Priority | Operators | Description |
|---|---|---|
| Higher | `*`, `/`, `%` | Multiplication, division and remainder. |
| Lower | `+`, `-` | Addition and subtraction. |

Operators at the same precedence level are generally evaluated from left to right for these arithmetic operations.

For example:

```java
int result = 20 / 5 * 2;

System.out.println(result);
```

Output:

```text
8
```

Java evaluates `20 / 5` first, obtaining `4`, and then calculates `4 * 2`.

---

## 5. Using Brackets in Calculations

Brackets can change the order in which an expression is evaluated. They can also make complicated calculations easier to read and understand.

Compare the following expressions:

```java
int firstResult = 10 + 4 * 3;
int secondResult = (10 + 4) * 3;

System.out.println(firstResult);
System.out.println(secondResult);
```

Output:

```text
22
42
```

In the first expression, multiplication is performed before addition.

In the second expression, the calculation inside the brackets is performed first:

1. Calculate `10 + 4`, which gives `14`.
2. Calculate `14 * 3`, which gives `42`.

### Practical Example: Average

Suppose a Student obtains three marks: `70`, `80` and `90`.

The total is calculated by adding the three marks. The average is then calculated by dividing the total by the number of marks.

```java
int mark1 = 70;
int mark2 = 80;
int mark3 = 90;

double average = (mark1 + mark2 + mark3) / 3.0;

System.out.println(average);
```

Output:

```text
80.0
```

The brackets ensure that the three marks are added before division is performed.

---

## 6. Common Calculation Errors

### Error 1: Expecting integer division to produce decimals

Incorrect for a decimal average:

```java
int total = 15;
int count = 2;

double average = total / count;
```

The division produces `7`, which is then stored as `7.0`.

A suitable correction is:

```java
double average = total / (double) count;
```

The result is `7.5`.

### Error 2: Ignoring operator precedence

Consider:

```java
int result = 5 + 3 * 2;
```

The answer is `11`, not `16`, because multiplication is performed before addition.

If addition must happen first, use:

```java
int result = (5 + 3) * 2;
```

### Error 3: Using the wrong operator

The `*` operator performs multiplication, while `%` calculates a remainder. They are not interchangeable.

### Error 4: Dividing by zero

Division by zero is not valid for Java's integer and floating-point arithmetic in the same way.

- Integer division by zero throws an `ArithmeticException`.
- Floating-point division by zero follows IEEE 754 rules and may produce infinity or `NaN`, depending on the expression.

Programs should handle values that could result in division by zero when those values are possible.

### Error 5: Using integer variables for values that require fractional results

A calculation involving whole-number operands may discard the fractional part even when the final result is assigned to a `double`.

Always check the types of the operands, not only the type of the destination variable.

### Error 6: Writing unnecessarily complicated expressions

Expressions can become difficult to read when too many operations are combined. Use meaningful intermediate variables and brackets where they improve clarity.

---

## 7. Practical Applications

Arithmetic operators are used in many real-world programming tasks.

### Calculating a Total

```java
double price1 = 49.99;
double price2 = 25.50;
double total = price1 + price2;

System.out.println(total);
```

### Calculating a Percentage

```java
double mark = 42;
double maximumMark = 50;

double percentage = mark / maximumMark * 100;

System.out.println(percentage);
```

Output:

```text
84.0
```

### Calculating a Remainder

```java
int items = 23;
int itemsPerBox = 5;

int remainder = items % itemsPerBox;

System.out.println(remainder);
```

Output:

```text
3
```

Three items remain after filling as many complete boxes of five as possible.

These examples demonstrate how arithmetic operators can be combined with variables to solve practical problems.

---

## 8. Recommended Study Approach

For each subtopic:

1. Learn the purpose of each operator.
2. Trace arithmetic expressions one operation at a time.
3. Predict results before running code.
4. Test expressions with both integer and floating-point operands.
5. Use brackets to make calculation order explicit.
6. Test calculations using small values that make errors easy to identify.
7. Explain why Java produces a particular result instead of simply memorising the answer.

When practising, pay particular attention to the difference between integer division and floating-point division, as well as operator precedence.

---

## 9. Practical Challenge

Create a Java program called `CalculationPractice` that performs the following tasks:

1. Declare two integer variables and assign them whole-number values.
2. Display their sum, difference and product.
3. Display the result of integer division.
4. Display the remainder after division.
5. Calculate a decimal quotient using floating-point division.
6. Calculate an average using a suitable data type.
7. Include an expression that uses brackets to change the order of operations.
8. Display all results with descriptive output messages.

Test your program using different values, including values that produce remainders and decimal quotients.

**Extension:** Explain the difference between the results of `7 / 2`, `7 / 2.0` and `(double) 7 / 2`.

---

## 10. Key Takeaways

By the end of this topic, you should understand that:

- Arithmetic operators allow Java programs to perform calculations.
- The `%` operator returns a remainder.
- Integer division discards the fractional part of the quotient.
- Floating-point division can produce a decimal result.
- The types of the operands affect the result of a calculation.
- Operator precedence determines the order of evaluation.
- Brackets can change calculation order and improve readability.
- Testing calculations with different values helps identify errors.

These concepts are essential for writing reliable algorithms and solving programming problems.

---

## Navigation

[**← Previous: Variables and Data Types**](../01-Variables-and-Data-Types/README.md)

[**Next: Input and Output →**](../03-Input-and-Output/README.md)

[Return to the Grade 10 Java repository](../README.md)
