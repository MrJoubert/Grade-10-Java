# Arithmetic Operators

## Learning objectives

By the end of this lesson, you should be able to:

- Explain what an arithmetic operator is.
- Use addition, subtraction, multiplication and division in Java.
- Store calculation results in variables.
- Use arithmetic operators to solve school-related problems.
- Display the results of calculations.

## 1. What is an arithmetic operator?

An **arithmetic operator** is a symbol that tells Java to perform a mathematical calculation.

Java supports several arithmetic operators. In this lesson, we will focus on the four basic operations.

| Operator | Operation | Example | Result |
|---|---|---|---:|
| `+` | Addition | `12 + 8` | `20` |
| `-` | Subtraction | `12 - 8` | `4` |
| `*` | Multiplication | `12 * 8` | `96` |
| `/` | Division | `12.0 / 8` | `1.5` |

Notice that Java uses `*` for multiplication rather than the × symbol, and `/` for division rather than the ÷ symbol.

## 2. Addition (`+`)

Addition combines two or more values.

Imagine that a Student receives 35 marks for one assessment and 42 marks for another.

```java
int testOneMark = 35;
int testTwoMark = 42;

int totalMarks = testOneMark + testTwoMark;
```

The calculation adds the two assessment marks and stores the result in `totalMarks`.

The result is `77`.

The calculation does not change the original marks. It stores the answer in a separate variable.

## 3. Subtraction (`-`)

Subtraction calculates the difference between values.

Suppose an assessment is worth 100 marks and a Student has already earned 77 marks.

```java
int maximumMarks = 100;
int totalMarks = 77;

int marksRemaining = maximumMarks - totalMarks;
```

The result is `23`, meaning that 23 marks remain between the current total and the maximum.

Subtraction can also produce a negative result if the second value is greater than the first.

## 4. Multiplication (`*`)

Multiplication is used when a value must be multiplied by another value.

Suppose a Student completes four homework activities, each worth 5 marks.

```java
int numberOfActivities = 4;
int marksPerActivity = 5;

int totalPossibleMarks = numberOfActivities * marksPerActivity;
```

The result is `20`.

The multiplication operator is particularly useful for repeated quantities, totals and calculations involving rates.

## 5. Division (`/`)

Division divides one value by another.

Suppose a Student earns a total of 77 marks across two assessments and we want to calculate the average.

```java
double totalMarks = 77.0;
int numberOfAssessments = 2;

double averageMark = totalMarks / numberOfAssessments;
```

The result is `38.5`.

In this example, the total is stored as a `double`, so the calculation can produce a decimal result.

**Important:** If both operands of `/` are integers, Java performs integer division. The fractional part is discarded. Integer division will be explored in the next concept.

Also, division by zero is not permitted for integer arithmetic and causes an `ArithmeticException` at runtime.

## 6. Storing calculation results

A calculation can be assigned directly to a variable.

For example:

```java
int firstMark = 35;
int secondMark = 42;
int totalMarks = firstMark + secondMark;
```

The variable `totalMarks` stores the result of the addition.

We can display the answer using:

```java
System.out.println("Total marks: " + totalMarks);
```

Output:

```text
Total marks: 77
```

The variables make the calculation easier to read because their names describe what each value represents.

## 7. Following the Java program

Open `ArithmeticOperators.java` in NetBeans.

### Step 1: Examine the assessment marks

The program stores two assessment marks in separate integer variables.

### Step 2: Calculate the total

The addition operator combines the marks and stores the result in `totalMarks`.

### Step 3: Calculate the difference

The subtraction operator calculates how many marks separate the current total from the maximum possible total.

### Step 4: Calculate the possible homework total

The multiplication operator multiplies the number of homework activities by the marks available for each activity.

### Step 5: Calculate the average

The division operator divides the total assessment marks by the number of assessments.

### Step 6: Examine the output

Run the program and compare the results with the expected output below.

## 8. Common mistakes

### Mistake 1: Using the wrong multiplication symbol

Incorrect:

```java
int total = 4 × 5;
```

Correct:

```java
int total = 4 * 5;
```

Java uses `*` for multiplication.

### Mistake 2: Forgetting to store the result

This statement performs a calculation but does not save the result in a variable:

```java
firstMark + secondMark;
```

For this simple example, the statement is not a valid standalone Java statement.

Instead, assign the result to a variable:

```java
int totalMarks = firstMark + secondMark;
```

### Mistake 3: Dividing by zero

Incorrect:

```java
int result = 10 / 0;
```

Integer division by zero causes an `ArithmeticException` at runtime.

### Mistake 4: Assuming division always produces a decimal

```java
int result = 7 / 2;
```

The result is `3`, not `3.5`, because both operands are integers.

The next lesson explains integer division and the remainder operator in more detail.

## 9. Practice activities

### Activity 1: Calculate assessment totals

Create variables for three assessment marks:

- Test 1: 25
- Test 2: 30
- Test 3: 35

Calculate and display the total.

### Activity 2: Calculate remaining marks

Assume an assessment is worth 150 marks and a Student has earned 112.

Calculate and display how many marks separate the current result from the maximum.

### Activity 3: Calculate homework marks

A Student completes six homework activities, each worth 10 marks.

Calculate and display the total possible marks.

### Activity 4: Calculate an average

A Student earns 72 marks and 81 marks in two assessments.

Calculate the average using a suitable data type and display the result.

### Activity 5: Extend the program

Modify `ArithmeticOperators.java` to include another assessment.

Update the total and average calculations to include all three assessments.

Check that the output matches your calculations.

## Summary

Java uses `+`, `-`, `*` and `/` for addition, subtraction, multiplication and division. These operators can be combined with variables to solve practical problems.

Always consider the data types used in a calculation, particularly when division may produce a decimal result.

**Next lesson:** Integer Division and Remainder — understanding how Java handles whole-number division and calculates remainders.
