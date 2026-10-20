# Algorithm Practice

## Overview

An algorithm is a sequence of logical steps used to solve a problem. Before writing Java code, it is important to understand the problem, identify the required inputs, determine the processing steps and establish the expected output.

In Grade 10 Information Technology, algorithmic problem-solving involves breaking problems into smaller tasks, recognising patterns, selecting appropriate calculations and translating solutions into working Java programs.

This topic combines variables, operators, selection, loops, methods and input/output to solve common programming problems.

## Learning Objectives

By the end of this topic, you should be able to:

- Explain what an algorithm is.
- Identify the inputs, processing and outputs of a problem.
- Break a problem into smaller steps.
- Translate a written problem into a logical sequence of instructions.
- Use variables to store intermediate results.
- Develop algorithms involving calculations and selection.
- Use loops to solve repetitive problems.
- Calculate totals, averages, minimums and maximums.
- Swap variable values.
- Isolate digits from an integer.
- Test an algorithm using different inputs.
- Identify and correct logic errors.

---

## 1. Understanding Algorithms

An algorithm is a logical, ordered sequence of steps used to solve a problem.

Before writing a program, ask yourself:

1. What information must the program receive?
2. What calculations or decisions must it perform?
3. What information must it display?
4. What conditions or unusual situations must be considered?

A useful way to organise your thinking is the **Input-Processing-Output (IPO) cycle**.

| Stage | Purpose | Example |
|---|---|---|
| Input | Obtain the necessary information | Enter two numbers |
| Processing | Perform calculations or decisions | Calculate their sum |
| Output | Display the result | Display the total |

### Example: Adding two numbers

**Problem:** Create a program that obtains two integers and displays their sum.

**Algorithm:**

1. Obtain the first number.
2. Obtain the second number.
3. Add the numbers together.
4. Display the result.

**Java implementation:**

```java
int firstNumber = 12;
int secondNumber = 8;

int total = firstNumber + secondNumber;

System.out.println("Total: " + total);
```

**Output:**

```text
Total: 20
```

The algorithm describes the solution, while the Java code implements it.

## 2. Calculating a Total and an Average

Many programming problems involve calculating a total and then using that total to calculate an average.

The formulas are:

\[
\text{Total}=\text{mark1}+\text{mark2}+\text{mark3}
\]

\[
\text{Average}=\frac{\text{Total}}{3}
\]

### Java implementation

```java
int mark1 = 70;
int mark2 = 80;
int mark3 = 90;

int total = mark1 + mark2 + mark3;
double average = total / 3.0;

System.out.println("Total: " + total);
System.out.println("Average: " + average);
```

**Output:**

```text
Total: 240
Average: 80.0
```

The total is calculated first and stored in a variable. That value is then used to calculate the average.

Using `3.0` ensures that the division produces a decimal result when necessary.

## 3. Finding the Smallest and Largest Values

An algorithm may need to determine which of two values is smaller or larger.

### Example: Finding the largest of two numbers

**Algorithm:**

1. Store two numbers.
2. Compare the numbers.
3. Display the larger number.
4. If the numbers are equal, report that they are equal.

**Java implementation:**

```java
int firstNumber = 25;
int secondNumber = 40;

if (firstNumber > secondNumber) {
    System.out.println("Largest: " + firstNumber);
} else if (secondNumber > firstNumber) {
    System.out.println("Largest: " + secondNumber);
} else {
    System.out.println("The numbers are equal.");
}
```

**Output:**

```text
Largest: 40
```

The algorithm uses selection to determine which result to display.

### Finding the smallest of three numbers

```java
int firstNumber = 15;
int secondNumber = 8;
int thirdNumber = 20;

int smallest = firstNumber;

if (secondNumber < smallest) {
    smallest = secondNumber;
}

if (thirdNumber < smallest) {
    smallest = thirdNumber;
}

System.out.println("Smallest: " + smallest);
```

**Output:**

```text
Smallest: 8
```

The variable `smallest` initially stores the first number. Each subsequent number is compared with the current smallest value. If a smaller value is found, the variable is updated.

The same approach can be adapted to find the largest value by using the `>` operator instead of `<`.

## 4. Calculating a Sum Using a Loop

Loops are useful when a calculation must be repeated.

Suppose a program must calculate the sum of the integers from 1 to 10.

**Algorithm:**

1. Initialise a total to zero.
2. Start with the number 1.
3. Add the current number to the total.
4. Increase the number by one.
5. Repeat until the number exceeds 10.
6. Display the total.

**Java implementation:**

```java
int total = 0;

for (int number = 1; number <= 10; number++) {
    total = total + number;
}

System.out.println("Total: " + total);
```

**Output:**

```text
Total: 55
```

The variable `total` is an accumulator. It stores the running sum as the loop executes.

### Important distinction

This statement:

```java
total = total + number;
```

adds the current number to the existing total.

It is different from:

```java
total = number;
```

The second statement replaces the total with the current number instead of accumulating a sum.

## 5. Counting Values That Meet a Condition

Algorithms often need to count how many values satisfy a particular condition.

For example, a program may count the even numbers between 1 and 20.

**Java implementation:**

```java
int count = 0;

for (int number = 1; number <= 20; number++) {
    if (number % 2 == 0) {
        count++;
    }
}

System.out.println("Even numbers: " + count);
```

**Output:**

```text
Even numbers: 10
```

The `%` operator returns the remainder after division. An integer is even when its remainder after division by 2 is zero.

The counter increases only when the condition is true.

## 6. Swapping Two Values

Swapping means exchanging the values stored in two variables.

Suppose:

```java
int firstNumber = 10;
int secondNumber = 20;
```

The required result is:

```text
firstNumber = 20
secondNumber = 10
```

### Using a temporary variable

A temporary variable preserves one value while the other variable is updated.

```java
int firstNumber = 10;
int secondNumber = 20;

int temporary = firstNumber;

firstNumber = secondNumber;
secondNumber = temporary;

System.out.println("First: " + firstNumber);
System.out.println("Second: " + secondNumber);
```

**Output:**

```text
First: 20
Second: 10
```

Without the temporary variable, assigning `secondNumber` to `firstNumber` would overwrite the original value of `firstNumber`.

The temporary variable ensures that the original value is not lost before it is assigned to the other variable.

## 7. Isolating Digits in an Integer

Mathematical operators can be used to extract individual digits from a positive integer.

Two useful operators are:

- Integer division `/`, which discards the fractional part when both operands are integers.
- Remainder `%`, which returns the remainder after division.

### Example: Extracting the last digit

```java
int number = 347;

int lastDigit = number % 10;

System.out.println("Last digit: " + lastDigit);
```

**Output:**

```text
Last digit: 7
```

When a positive integer is divided by 10, the remainder is its last digit.

### Removing the last digit

```java
int number = 347;

int remainingDigits = number / 10;

System.out.println(remainingDigits);
```

**Output:**

```text
34
```

Integer division by 10 removes the last digit from a positive integer.

### Extracting the tens digit

```java
int number = 347;

int tensDigit = (number / 10) % 10;

System.out.println("Tens digit: " + tensDigit);
```

**Output:**

```text
Tens digit: 4
```

First, integer division by 10 produces `34`. Taking the remainder after division by 10 then isolates `4`.

These examples demonstrate digit manipulation for non-negative integers. Negative numbers require additional consideration because Java's remainder and integer division rules affect the results.

## 8. Using Methods to Organise an Algorithm

Methods allow a larger problem to be divided into smaller tasks.

Consider a program that calculates the area of a rectangle.

\[
\text{Area}=\text{length}\times\text{width}
\]

The program can use one method to display a heading and another to perform the calculation.

```java
public class RectangleProgram {
    public static void main(String[] args) {
        displayHeading();
        calculateArea();
    }

    public static void displayHeading() {
        System.out.println("RECTANGLE AREA");
        System.out.println("==============");
    }

    public static void calculateArea() {
        int length = 8;
        int width = 5;

        int area = length * width;

        System.out.println("Area: " + area);
    }
}
```

**Output:**

```text
RECTANGLE AREA
==============
Area: 40
```

The program is modular because each method performs a specific task.

## 9. Translating a Problem into an Algorithm

Before writing Java code, practise expressing the solution as a series of clear steps.

### Example: Determining whether a number is positive, negative or zero

**Problem:** Create a program that determines whether an integer is positive, negative or zero.

**Algorithm:**

1. Obtain an integer.
2. If the integer is greater than zero, display that it is positive.
3. Otherwise, if the integer is less than zero, display that it is negative.
4. Otherwise, display that it is zero.

**Java implementation:**

```java
int number = -5;

if (number > 0) {
    System.out.println("Positive");
} else if (number < 0) {
    System.out.println("Negative");
} else {
    System.out.println("Zero");
}
```

**Output:**

```text
Negative
```

The order of the conditions ensures that the correct classification is selected.

## 10. Common Algorithmic Mistakes

### Mistake 1: Forgetting to initialise an accumulator

An accumulator should begin with the appropriate starting value, commonly zero when calculating a sum.

```java
int total = 0;
```

### Mistake 2: Overwriting a running total

Use addition when accumulating values rather than replacing the total with each new value.

### Mistake 3: Using the wrong comparison operator

Check whether the problem requires `<`, `<=`, `>` or `>=`. Boundary conditions can change the result.

### Mistake 4: Incorrect loop limits

A loop that uses `number < 10` behaves differently from one that uses `number <= 10`.

Trace the first and last iterations to confirm that the correct values are processed.

### Mistake 5: Losing a value when swapping variables

Use a temporary variable to preserve a value before overwriting it.

### Mistake 6: Confusing division and remainder

Use `/` when you need the quotient and `%` when you need the remainder.

### Mistake 7: Writing code before understanding the problem

Identify the inputs, processing steps and outputs before implementing the solution.

## 11. Testing Algorithms

An algorithm should be tested to determine whether it produces the correct result for different inputs.

Suppose an algorithm finds the largest of two integers.

| First number | Second number | Expected result |
|---:|---:|---|
| 10 | 20 | 20 |
| 30 | 15 | 30 |
| 8 | 8 | Both are equal |
| -5 | -2 | -2 |
| 0 | 5 | 5 |

Testing only one case is insufficient. The algorithm should also be tested with equal values, negative numbers and zero where these inputs are permitted.

For each test:

1. Predict the expected result.
2. Run the program.
3. Record the actual result.
4. Compare the results.
5. Correct any errors and repeat the relevant tests.

## 12. Practical Challenges

### Challenge 1: Calculate a total and average

Write a program that stores three marks, calculates their total and calculates their average.

Display both results.

Test your program with marks of 65, 75 and 80.

### Challenge 2: Find the smallest of three numbers

Write a program that stores three integers and determines the smallest value.

Test it using:

- Three different positive numbers.
- Three equal numbers.
- Negative numbers.
- Two equal numbers where the third is smaller.

### Challenge 3: Sum even numbers

Write a program that calculates the sum of all even integers between 1 and 20.

Hint: Use a loop and the condition `number % 2 == 0`.

### Challenge 4: Swap values

Write a program that stores two values, displays them, swaps them using a temporary variable and displays the new values.

### Challenge 5: Isolate digits

Write a program that stores a three-digit positive integer and displays its hundreds, tens and units digits.

For example, if the number is `583`, the output should be:

```text
Hundreds: 5
Tens: 8
Units: 3
```

Hint:

- Hundreds digit: `number / 100`
- Tens digit: `(number / 10) % 10`
- Units digit: `number % 10`

### Challenge 6: Design an algorithm

Write an algorithm and then implement it in Java for a program that accepts a number and determines whether it is divisible by both 3 and 5.

Test your solution with values that are divisible by both, divisible by only one, and divisible by neither.

## 13. Key Takeaways

- An algorithm is a logical sequence of steps for solving a problem.
- The IPO cycle helps identify inputs, processing and outputs.
- Selection allows an algorithm to make decisions.
- Loops repeat calculations and process sequences of values.
- Accumulators store running totals, while counters track occurrences.
- Comparison operators can be used to find minimum and maximum values.
- A temporary variable can be used to swap two values safely.
- Integer division and the remainder operator can isolate digits.
- Methods divide programs into smaller, reusable tasks.
- Testing with a variety of inputs helps identify logic errors.

## Navigation

- [Previous: Methods and Modular Programs](../Methods-and-Modular-Programs/README.md)
- [Next: Exam-Style Questions](../Exam-Style-Questions/README.md)
- [Back to Integrated Examples and Practice](../README.md)
- [Back to Grade 10 Java](../../README.md)
