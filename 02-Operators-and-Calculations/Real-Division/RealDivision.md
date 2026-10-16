# Real Division

## Learning Objectives

By the end of this topic, you should be able to:

- Explain how real division differs from integer division.
- Use `double` values in division calculations.
- Identify why integer division can produce an incorrect average.
- Calculate averages, percentages and other values that require decimal places.
- Display the results of real division.

## 1. What Is Real Division?

Real division is division that allows the answer to contain a fractional part.

In Java, real division can be performed when at least one operand is a floating-point value, such as a `double`.

For example:

```java
double result = 17.0 / 5;
```

The result is:

```text
3.4
```

The decimal part is retained because one of the operands is a `double`.

Compare this with integer division:

```java
int result = 17 / 5;
```

The result is `3`, because both operands are integers. Java discards the fractional part.

**Remember:** The data types of the operands determine how Java performs the division.

## 2. Using `double` Values

A `double` variable can store a number with a fractional part.

For example:

```java
double averageMark = 78.5;
double lessonDuration = 1.5;
double distanceInKilometres = 2.75;
```

When performing division, you can use a decimal value in the calculation:

```java
double result = 17.0 / 5;
```

Alternatively, you can use a `double` variable:

```java
double totalMarks = 77.0;
double numberOfTests = 2.0;

double averageMark = totalMarks / numberOfTests;
```

The result is `38.5`.

## 3. Calculating a Student's Average

Suppose a Student receives 41 marks in one assessment and 36 marks in another. Each assessment is marked out of 50.

First, calculate the total:

```java
int testOneMark = 41;
int testTwoMark = 36;

int totalMarks = testOneMark + testTwoMark;
```

Then calculate the average using real division:

```java
double averageMark = totalMarks / 2.0;
```

The average is `38.5`.

The calculation is:

\[
\text{Average} = \frac{41 + 36}{2} = 38.5
\]

Using `2.0` ensures that the division is performed using a floating-point operand.

### A common mistake

Consider this code:

```java
int totalMarks = 77;
double averageMark = totalMarks / 2;
```

The result is `38.0`, not `38.5`.

Why?

1. `totalMarks` is an `int`.
2. The value `2` is also an `int`.
3. Java performs integer division, producing `38`.
4. The result is then stored in the `double` variable as `38.0`.

Assigning the result to a `double` does not change the division that has already taken place.

The correct version is:

```java
double averageMark = totalMarks / 2.0;
```

## 4. Calculating Percentages

Real division is also useful when calculating percentages.

Suppose a Student receives 37 out of 45 marks.

The percentage formula is:

\[
\text{Percentage} =
\frac{\text{Mark Obtained}}{\text{Maximum Mark}} \times 100
\]

In Java:

```java
int markObtained = 37;
int maximumMark = 45;

double percentage = markObtained / (double) maximumMark * 100;
```

The result is approximately `82.22222222222221`.

The expression `(double) maximumMark` converts the maximum mark to a `double` before the division takes place.

This is called **casting**. Type conversion and casting are covered in more detail in the Type Conversion and Casting section.

## 5. Calculating Average Marks Across Several Assessments

Suppose a Student receives three marks:

- Test 1: 72
- Test 2: 81
- Test 3: 76

Calculate the total and divide by the number of tests:

```java
int testOne = 72;
int testTwo = 81;
int testThree = 76;

int totalMarks = testOne + testTwo + testThree;
double averageMark = totalMarks / 3.0;
```

The total is `229`, and the average is approximately `76.33333333333333`.

Java's `double` type can store many fractional values, but its output may contain more decimal places than you want to display.

Formatting output can be used to control how many decimal places appear.

## 6. Important Rules

1. Use `double` when a calculation needs to preserve a fractional part.
2. Make sure at least one operand is a floating-point value when you need real division.
3. Do not assume that storing an answer in a `double` will automatically make integer division produce a decimal answer.
4. Use brackets when necessary to make the intended order of calculations clear.
5. Check that the divisor is not zero before performing a division that could receive a zero value.

## 7. Common Mistakes

### Mistake 1: Dividing integers when calculating an average

```java
double average = 77 / 2;
```

Result: `38.0`.

Correct version:

```java
double average = 77 / 2.0;
```

Result: `38.5`.

### Mistake 2: Using the wrong formula for a percentage

Incorrect:

```java
double percentage = markObtained / maximumMark * 100;
```

If both variables are integers, the division happens before multiplication, and the fractional part is discarded.

Correct:

```java
double percentage = markObtained / (double) maximumMark * 100;
```

### Mistake 3: Expecting a `double` to display a fixed number of decimal places

A `double` stores a numeric value, not a display format. The number of decimal places displayed can vary.

For formatted output, Java provides methods such as `System.out.printf()`.

## 8. Practice Activities

Complete these activities in NetBeans.

### Activity 1: Assessment Average

A Student receives 43 marks and 38 marks in two assessments.

1. Declare two integer variables for the marks.
2. Calculate the total.
3. Calculate the average using real division.
4. Display the total and average.

### Activity 2: Calculate a Percentage

A Student receives 42 out of 48 marks.

1. Declare variables for the mark obtained and the maximum mark.
2. Calculate the percentage using real division.
3. Display the percentage.
4. Explain why integer division would be unsuitable for this calculation.

### Activity 3: Average of Three Tests

A Student receives 68, 74 and 83 marks in three tests.

1. Calculate the total.
2. Calculate the average using real division.
3. Display both values.
4. Predict the average before running the program.

### Activity 4: Identify the Error

Study this code:

```java
int totalMarks = 95;
int numberOfTests = 2;

double averageMark = totalMarks / numberOfTests;
```

1. Predict the value of `averageMark`.
2. Explain why the result is incorrect if the intention is to calculate an exact average.
3. Rewrite the calculation to preserve the fractional part.

## 9. Summary

- Real division allows a calculation to produce a fractional result.
- Use a floating-point operand, such as `2.0`, to ensure that division is performed using real values.
- Assigning an integer division result to a `double` does not restore the discarded fractional part.
- Real division is particularly useful for calculating averages, percentages and other values that may contain decimal places.
- Use appropriate formatting when displaying a result to a specific number of decimal places.
