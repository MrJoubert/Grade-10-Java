# Common Calculation Errors

## Learning Objectives

By the end of this topic, you should be able to:

- Identify common mistakes in Java arithmetic calculations.
- Explain how integer division affects calculation results.
- Recognise errors involving operator precedence and brackets.
- Choose suitable data types for calculations.
- Correct calculation errors and test the results.

## 1. Why Do Calculation Errors Occur?

A Java program can compile and run successfully while producing an incorrect answer.

These errors are often called **logic errors**. The program follows the instructions written by the programmer, but those instructions do not produce the intended result.

For example:

```java
int testOneMark = 40;
int testTwoMark = 35;

double averageMark = testOneMark + testTwoMark / 2.0;
```

The intended calculation is the average of the two marks.

However, Java divides `testTwoMark` by `2.0` before adding `testOneMark`.

The result is:

\[
40 + (35 \div 2.0) = 57.5
\]

The correct average is:

\[
\frac{40 + 35}{2} = 37.5
\]

The program runs, but the calculation is incorrect because the expression is missing brackets.

## 2. Error 1: Integer Division

Integer division occurs when both operands are integers.

For example:

```java
int totalMarks = 77;
double averageMark = totalMarks / 2;
```

The result is `38.0`, not `38.5`.

This happens because Java performs integer division first. The fractional part is discarded before the result is stored in the `double` variable.

### Correcting the error

Use a floating-point operand:

```java
double averageMark = totalMarks / 2.0;
```

The result is `38.5`.

**Remember:** Assigning an integer calculation to a `double` does not restore a fractional part that has already been discarded.

## 3. Error 2: Incorrect Operator Precedence

Java evaluates multiplication, division and remainder before addition and subtraction.

Consider:

```java
int testOneMark = 40;
int testTwoMark = 30;
int testThreeMark = 20;

double averageMark = testOneMark + testTwoMark + testThreeMark / 3.0;
```

Java evaluates the division first:

\[
40 + 30 + (20 \div 3.0)
\]

The result is approximately `76.66666666666667`.

### Correcting the error

Group the marks using brackets:

```java
double averageMark = (testOneMark + testTwoMark + testThreeMark) / 3.0;
```

The correct average is `30.0`.

## 4. Error 3: Using the Wrong Formula

Suppose a Student receives 36 out of 45 marks.

The percentage formula is:

\[
\text{Percentage} =
\frac{\text{Mark Obtained}}{\text{Maximum Mark}} \times 100
\]

A common mistake is to multiply by 100 before dividing by the maximum mark:

```java
double percentage = markObtained / 100.0 * maximumMark;
```

This calculates a different expression and does not produce the intended percentage.

### Correcting the error

```java
double percentage = (double) markObtained / maximumMark * 100;
```

The result is `80.0`.

Always identify the correct mathematical formula before translating it into Java code.

## 5. Error 4: Choosing an Unsuitable Data Type

The data type used for a calculation affects the result.

Consider:

```java
int averageMark = 77 / 2;
```

The result is `38`.

If the average must preserve fractional marks, an `int` is not suitable for storing the final value.

### Correcting the error

```java
double averageMark = 77 / 2.0;
```

The result is `38.5`.

Use `int` for whole-number values such as the number of Students or completed groups. Use `double` when a calculation may produce a fractional result.

## 6. Error 5: Incorrect Use of the Remainder Operator

The `%` operator calculates the remainder, not the quotient.

For example:

```java
int numberOfStudents = 23;
int studentsPerGroup = 5;

int groups = numberOfStudents % studentsPerGroup;
```

The variable `groups` contains `3`, not `4`.

This is because `%` returns the remainder.

### Correcting the error

Use `/` to calculate the number of complete groups and `%` to calculate the number of Students remaining:

```java
int groups = numberOfStudents / studentsPerGroup;
int remainingStudents = numberOfStudents % studentsPerGroup;
```

The results are `4` complete groups and `3` Students remaining.

## 7. Error 6: Dividing by Zero

Division by zero is invalid.

For integer division:

```java
int result = 10 / 0;
```

Java throws an `ArithmeticException` when this statement is executed.

A divisor stored in a variable can also be zero:

```java
int numberOfClasses = 0;
int studentsPerClass = 30;

int result = studentsPerClass / numberOfClasses;
```

This also causes an `ArithmeticException` at runtime.

### Correcting the error

Check the divisor before performing the calculation:

```java
if (numberOfClasses != 0) {
    int result = studentsPerClass / numberOfClasses;
    System.out.println(result);
} else {
    System.out.println("The divisor cannot be zero.");
}
```

The calculation only takes place when the divisor is not zero.

## 8. Error 7: Incorrect Brackets

Brackets can change the meaning of an expression.

Compare:

```java
int firstResult = 20 - 4 * 2;
int secondResult = (20 - 4) * 2;
```

The first result is `12`.

The second result is `32`.

Neither calculation is automatically wrong. The correct expression depends on the intended mathematical operation.

Before adding brackets, identify which values should be calculated together.

## 9. A Systematic Approach to Finding Errors

When a calculation produces an unexpected result, follow these steps:

1. **Identify the intention.** Write down what the calculation is supposed to determine.
2. **Check the formula.** Confirm that the mathematical formula is correct.
3. **Check the data types.** Determine whether integer or real division is required.
4. **Check operator precedence.** Identify which operations Java performs first.
5. **Check brackets.** Make sure related values are grouped correctly.
6. **Calculate manually.** Work out the expected result independently.
7. **Run the program.** Compare the actual output with the expected result.
8. **Correct and retest.** Change the expression and test it again.

This process helps you find the cause of an error instead of changing code at random.

## 10. Practice Activities

Complete these activities in NetBeans.

### Activity 1: Correct an Average

The following code is intended to calculate the average of three tests:

```java
int testOne = 60;
int testTwo = 70;
int testThree = 80;

double average = testOne + testTwo + testThree / 3.0;
```

1. Predict the result.
2. Explain the error.
3. Correct the expression.
4. Confirm that the correct average is `70.0`.

### Activity 2: Correct Integer Division

```java
int totalMarks = 89;
double average = totalMarks / 2;
```

1. Predict the result.
2. Explain why the fractional part is lost.
3. Correct the calculation so that the result is `44.5`.

### Activity 3: Correct a Percentage

```java
int markObtained = 42;
int maximumMark = 48;

double percentage = markObtained / maximumMark * 100;
```

1. Predict the result.
2. Explain why integer division causes a problem.
3. Correct the expression.
4. Confirm that the percentage is `87.5`.

### Activity 4: Correct Student Grouping

```java
int numberOfStudents = 29;
int studentsPerGroup = 6;

int groups = numberOfStudents % studentsPerGroup;
int remainingStudents = numberOfStudents / studentsPerGroup;
```

1. Identify the error.
2. Correct the operators.
3. Display the number of complete groups and Students remaining.
4. Confirm that the results are `4` groups and `5` Students remaining.

### Activity 5: Prevent Division by Zero

Write a program that stores the number of Students and the number of groups in variables.

1. Check whether the number of groups is greater than zero.
2. If it is, calculate the number of Students per group using integer division.
3. Otherwise, display a suitable error message.
4. Test your program with both a valid value and zero.

## 11. Summary

- A program can run successfully and still produce an incorrect calculation.
- Integer division discards the fractional part.
- Operator precedence determines the order in which calculations are performed.
- Brackets can group related calculations.
- Choose data types that suit the intended result.
- Use `/` for the quotient and `%` for the remainder.
- Never divide by zero.
- Test calculations using values for which you can independently determine the expected answer.
