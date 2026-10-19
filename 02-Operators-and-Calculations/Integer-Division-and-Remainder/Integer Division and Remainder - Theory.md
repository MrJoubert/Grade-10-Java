# Integer Division and Remainder

## Learning Objectives

By the end of this topic, you should be able to:

- Explain the difference between integer division and real division.
- Use the `/` operator to divide numbers.
- Use the `%` operator to calculate a remainder.
- Predict the result of integer division.
- Apply division and remainder to practical school-management problems.

## 1. What Is Integer Division?

Integer division takes place when both operands used in a division calculation are integers.

In Java, dividing one `int` by another `int` produces an integer result. Any fractional part is discarded; Java does not round the answer.

For example:

```java
int result = 17 / 5;
```

Mathematically, \(17 \div 5 = 3.4\). However, the Java result is `3` because both operands are integers.

The fractional part, `.4`, is discarded.

**Important:** Integer division does not automatically produce a `double`, even when the mathematical answer contains a decimal fraction.

## 2. Practical Example: Grouping Students

Suppose a school has 23 Students attending a workshop. Each group can contain 5 Students.

You can calculate the number of complete groups using integer division:

```java
int numberOfStudents = 23;
int studentsPerGroup = 5;

int completeGroups = numberOfStudents / studentsPerGroup;
```

The value of `completeGroups` is `4`.

Four complete groups can be formed, using 20 Students. Three Students remain.

Integer division answers the question: **How many complete groups can be formed?**

## 3. The Remainder Operator (`%`)

The remainder operator, `%`, calculates the remainder after integer division.

Using the same example:

```java
int numberOfStudents = 23;
int studentsPerGroup = 5;

int remainingStudents = numberOfStudents % studentsPerGroup;
```

The result is `3`, because:

- Five Students fit into each complete group.
- Four complete groups accommodate 20 Students.
- Three Students remain.

The two operators can therefore be used together:

```java
int completeGroups = numberOfStudents / studentsPerGroup;
int remainingStudents = numberOfStudents % studentsPerGroup;
```

For positive integers, the relationship is:

\[
\text{Number} =
(\text{Divisor} \times \text{Quotient}) + \text{Remainder}
\]

For this example:

\[
23 = (5 \times 4) + 3
\]

## 4. Another Example: Distributing Assessment Papers

A teacher has 47 assessment papers to distribute equally among 6 classes.

```java
int numberOfPapers = 47;
int numberOfClasses = 6;

int papersPerClass = numberOfPapers / numberOfClasses;
int leftoverPapers = numberOfPapers % numberOfClasses;
```

The results are:

- `papersPerClass` is `7`.
- `leftoverPapers` is `5`.

Each class can receive 7 papers, with 5 papers left over.

## 5. Integer Division vs Real Division

Compare these calculations:

```java
int integerResult = 17 / 5;
double realResult = 17.0 / 5;
```

The results are:

| Variable | Result | Explanation |
|---|---:|---|
| `integerResult` | `3` | Both operands are integers, so the fractional part is discarded. |
| `realResult` | `3.4` | At least one operand is a `double`, so real division takes place. |

You can also write:

```java
double realResult = 17 / 5.0;
```

At least one operand must be a floating-point value for the division to produce a fractional result.

**Common mistake:**

```java
double average = 77 / 2;
```

The result is `38.0`, not `38.5`. The division happens using integers before the answer is assigned to the `double`.

A correct version is:

```java
double average = 77 / 2.0;
```

The result is `38.5`.

## 6. Predicting Results

Before running a Java program, calculate what each expression will produce.

| Expression | Result |
|---|---:|
| `20 / 4` | `5` |
| `23 / 5` | `4` |
| `23 % 5` | `3` |
| `18 / 7` | `2` |
| `18 % 7` | `4` |
| `36 / 6` | `6` |
| `36 % 6` | `0` |

Notice that when a number divides exactly into another number, the remainder is `0`.

## 7. Common Mistakes

### Mistake 1: Expecting a decimal answer

```java
System.out.println(19 / 4);
```

Output:

```text
4
```

The result is an integer because both operands are integers.

### Mistake 2: Confusing `/` and `%`

- `/` calculates the quotient.
- `%` calculates the remainder.

For example, `19 / 4` produces `4`, while `19 % 4` produces `3`.

### Mistake 3: Dividing by zero

Division by zero is invalid. With integer operands, attempting it causes an `ArithmeticException`.

Before dividing by a value that could be zero, make sure the divisor is not zero.

### Mistake 4: Using the wrong data type for an average

If an average may contain a fractional part, use real division rather than integer division.

## 8. Practice Activities

Complete these activities in NetBeans. Try to predict the answers before running your programs.

### Activity 1: Student Groups

A school has 38 Students attending a leadership workshop. Each group must contain 6 Students.

1. Create an integer variable for the number of Students.
2. Create an integer variable for the group size.
3. Calculate the number of complete groups using `/`.
4. Calculate the number of Students left over using `%`.
5. Display both results.

### Activity 2: Classroom Resources

A teacher has 95 exercise books to distribute among 8 classes.

1. Calculate the number of books each class can receive if each class receives the same whole number.
2. Calculate the number of books remaining.
3. Display the results with meaningful labels.

### Activity 3: Assessment Average

A Student receives 41 marks in one test and 36 marks in another.

1. Calculate the total.
2. Calculate the average using integer division.
3. Calculate the average using real division.
4. Display both averages and explain why they may differ.

### Activity 4: Predict the Output

Without running the code, predict the output:

```java
int first = 29 / 6;
int second = 29 % 6;
int third = 40 / 8;
int fourth = 40 % 8;

System.out.println(first);
System.out.println(second);
System.out.println(third);
System.out.println(fourth);
```

Run the program afterwards to check your answers.

## 9. Summary

- The `/` operator divides two numbers.
- When both operands are integers, Java performs integer division and discards the fractional part.
- The `%` operator calculates the remainder.
- Real division produces a fractional result when at least one operand is a floating-point value, such as `double`.
- Integer division and remainder are useful for grouping Students, distributing resources and solving other problems involving whole numbers.
- Never divide by zero.
