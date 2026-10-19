# Casting Real and Integer Values

## Learning Objectives

By the end of this section, you should be able to:

- Explain the difference between integer and real-number values.
- Use an explicit cast to convert a `double` into an `int`.
- Explain how casting affects decimal values.
- Convert an integer to a `double`.
- Understand how casting affects division and calculations.
- Distinguish between casting and rounding.

## 1. Integer and Real-Number Values

Java uses different data types for whole numbers and decimal numbers.

### Integer values

An `int` stores whole numbers without a decimal component.

```java
int studentMark = 85;
int totalMarks = 235;
```

### Real-number values

A `double` stores floating-point values, including decimal values.

```java
double averageMark = 78.5;
double percentage = 82.75;
```

The choice of data type affects the results of calculations.

## 2. Casting a double to an int

An explicit cast tells Java to convert a value into another data type.

Use `(int)` to cast a `double` to an `int`.

```java
double averageMark = 78.9;

int wholeNumberMark = (int) averageMark;

System.out.println(wholeNumberMark);
```

Output:

```text
78
```

The decimal portion is discarded. Java does not round the value to the nearest whole number.

More examples:

| Original `double` | Result after `(int)` |
|---:|---:|
| `78.9` | `78` |
| `78.1` | `78` |
| `78.0` | `78` |
| `-78.9` | `-78` |

For negative values, the fractional portion is discarded towards zero.

## 3. Casting an int to a double

You can also cast an integer to a double.

```java
int studentMark = 85;

double decimalMark = (double) studentMark;

System.out.println(decimalMark);
```

Output:

```text
85.0
```

Java can perform this conversion automatically, so the cast is not required in this example.

However, explicitly using `(double)` can be useful when you want a calculation to use floating-point arithmetic.

## 4. Casting Before Division

Casting is particularly useful when calculating averages and percentages.

Consider this example:

```java
int totalMarks = 235;
int numberOfAssessments = 3;

double averageMark = totalMarks / numberOfAssessments;

System.out.println(averageMark);
```

Output:

```text
78.0
```

Both operands are integers, so Java performs integer division first. The decimal portion is discarded before the result is assigned to the `double`.

To retain the decimal portion, cast one operand before dividing:

```java
double averageMark = (double) totalMarks / numberOfAssessments;

System.out.println(averageMark);
```

Output:

```text
78.33333333333333
```

**Key principle:** Casting the result after integer division cannot restore the discarded decimal portion. The cast must affect the calculation before the division takes place.

## 5. Calculating a Percentage

Suppose a Student obtains 37 marks out of 45.

The percentage is calculated as:

\[
\text{Percentage}=\frac{\text{Mark obtained}}{\text{Maximum mark}}\times100
\]

Java example:

```java
int markObtained = 37;
int maximumMark = 45;

double percentage = (double) markObtained / maximumMark * 100;

System.out.println(percentage);
```

Output:

```text
82.22222222222221
```

The cast converts `markObtained` to a `double` before the division. The calculation therefore retains the fractional result.

The example assumes that `maximumMark` is greater than zero.

## 6. Casting Is Not Rounding

Casting and rounding produce different results.

### Casting

```java
double averageMark = 78.9;
int result = (int) averageMark;
```

Result: `78`

### Rounding

```java
double averageMark = 78.9;
int result = (int) Math.round(averageMark);
```

Result: `79`

The `Math.round()` method rounds the value to the nearest whole number and returns a `long` for a `double` argument. The explicit cast converts that result into an `int`.

Use casting when the decimal portion should be discarded. Use rounding when the nearest whole number is required.

## 7. Common Mistakes

### Mistake 1: Casting after integer division

```java
int totalMarks = 235;
int numberOfAssessments = 3;

double averageMark = (double) (totalMarks / numberOfAssessments);
```

The result is `78.0` because integer division takes place before the cast.

Correct:

```java
double averageMark = (double) totalMarks / numberOfAssessments;
```

### Mistake 2: Expecting a cast to round

```java
double value = 64.8;
int result = (int) value;
```

The result is `64`, not `65`.

### Mistake 3: Assuming the result's data type determines how the calculation works

```java
double result = 7 / 2;
```

The result is `3.0`, not `3.5`, because both operands are integers.

Correct:

```java
double result = (double) 7 / 2;
```

The result is `3.5`.

## 8. Practice Exercises

1. Cast the value `86.7` from a `double` to an `int`. State the result.
2. Cast the value `92` from an `int` to a `double`. State the result.
3. Calculate the average of 72, 81 and 88 using floating-point division.
4. Explain why `double average = 235 / 3;` produces `78.0`.
5. Rewrite the previous calculation so that the decimal portion is retained.
6. Explain the difference between `(int) 76.9` and `(int) Math.round(76.9)`.

## Summary

- An `int` stores whole numbers; a `double` stores floating-point values.
- Use `(int)` to explicitly cast a value to an integer.
- Casting a `double` to an `int` discards the fractional portion towards zero.
- Cast an operand before division when floating-point division is required.
- Casting is not the same as rounding.
- The data types of the operands determine how a calculation is performed.
