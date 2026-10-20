# Algorithm Evaluation and Efficiency

## Overview

When developing a program, it is not enough for the algorithm to produce the correct answer. You should also consider whether the algorithm is clear, reliable and suitable for solving the problem.

**Algorithm evaluation** involves examining an algorithm to determine whether it solves the problem correctly and efficiently.

In Grade 10 Information Technology, you should be able to follow algorithms, test their results, identify errors and explain whether an algorithm is appropriate for a given problem.

Efficiency can be considered in terms of the number of steps an algorithm performs, the amount of repetition involved and how easily another programmer can understand and maintain the solution.

## Learning Objectives

By the end of this section, you should be able to:

- Explain what algorithm evaluation means.
- Determine whether an algorithm produces the expected result.
- Identify unnecessary steps in an algorithm.
- Compare two algorithms that solve the same problem.
- Use test data to evaluate an algorithm.
- Trace the execution of an algorithm.
- Explain why readable, reliable code is important.

---

## 1. What Is Algorithm Evaluation?

An algorithm is a sequence of instructions designed to solve a problem.

Evaluating an algorithm means examining its instructions and results to determine whether it is suitable for the task.

Consider the following problem:

**Problem:** Calculate the sum of two integers.

Algorithm A:

```java
int firstNumber = 12;
int secondNumber = 8;
int total = firstNumber + secondNumber;

System.out.println(total);
```

Output:

```text
20
```

Algorithm B:

```java
int firstNumber = 12;
int secondNumber = 8;

int temporary = firstNumber;
int total = temporary + secondNumber;

System.out.println(total);
```

Output:

```text
20
```

Both algorithms produce the correct result. However, Algorithm B introduces an unnecessary variable, `temporary`, because its value is not needed for any other purpose.

For this particular problem, Algorithm A is simpler and easier to follow.

This demonstrates that **two algorithms can produce the same answer while differing in clarity and the number of steps required**.

## 2. Characteristics of a Good Algorithm

When evaluating an algorithm, consider the following characteristics.

### 2.1 Correctness

An algorithm must produce the expected result for valid inputs.

For example, an algorithm that calculates the average of two numbers should add the numbers and divide the total by two.

```java
int firstNumber = 10;
int secondNumber = 20;

double average = (firstNumber + secondNumber) / 2.0;

System.out.println(average);
```

Output:

```text
15.0
```

Using `2.0` ensures that the calculation uses real-number division, allowing decimal answers when necessary.

### 2.2 Clarity

An algorithm should be easy to understand.

Meaningful variable names make it easier to determine what the program is doing.

Less clear:

```java
int a = 75;
int b = 60;
int c = (a + b) / 2;
```

Clearer:

```java
int firstMark = 75;
int secondMark = 60;
int averageMark = (firstMark + secondMark) / 2;
```

The second version communicates the purpose of each variable more effectively.

### 2.3 Efficiency

An algorithm should avoid unnecessary calculations, repetition and instructions.

Consider the following two examples.

```java
int number = 5;
int result = number * 2;
System.out.println(result);
```

Compared with:

```java
int number = 5;
int result = number + number;
System.out.println(result);
```

Both calculate the same result. Neither approach is inherently problematic for such a simple calculation, but the multiplication version communicates the operation more directly.

Do not assume that fewer lines of code always mean a more efficient algorithm. The logic, number of operations and clarity of the solution also matter.

### 2.4 Reliability

An algorithm should behave correctly for the range of inputs it is expected to handle.

For example, a program that calculates an average should consider whether the values are valid and whether integer division could produce an inaccurate result.

An algorithm that works for one example but fails for other valid inputs is not sufficiently reliable.

### 2.5 Maintainability

An algorithm should be organised so that another programmer can understand, test and modify it.

Meaningful variable names, consistent indentation and methods that perform clearly defined tasks help make programs easier to maintain.

---

## 3. Evaluating an Algorithm Using Test Data

One way to evaluate an algorithm is to test it with different inputs and compare the actual results with the expected results.

Consider an algorithm that determines whether a student has passed a test. A mark of 50 or higher is a pass.

```java
int mark = 65;

if (mark >= 50)
{
    System.out.println("Pass");
}
else
{
    System.out.println("Fail");
}
```

Output:

```text
Pass
```

The algorithm works for a mark of 65. However, testing only one input does not prove that the algorithm works correctly in every situation.

Use a range of test values.

| Input mark | Expected result |
|---:|---|
| 80 | Pass |
| 50 | Pass |
| 49 | Fail |
| 0 | Fail |
| 100 | Pass |

The mark of 50 is particularly important because it tests the exact boundary between a pass and a fail.

If the condition were accidentally written as `mark > 50`, a mark of 50 would incorrectly produce `Fail`.

This illustrates why carefully selected test data is important when evaluating an algorithm.

---

## 4. Comparing Algorithms

Two algorithms may solve the same problem using different approaches.

Consider the task of displaying the numbers from 1 to 5.

### Algorithm A: Repeated instructions

```java
System.out.println(1);
System.out.println(2);
System.out.println(3);
System.out.println(4);
System.out.println(5);
```

### Algorithm B: A loop

```java
for (int number = 1; number <= 5; number++)
{
    System.out.println(number);
}
```

Both algorithms produce:

```text
1
2
3
4
5
```

However, Algorithm B uses a loop to avoid repeating the same instruction manually.

If the requirement changes to displaying the numbers from 1 to 100, the loop can be adapted by changing its condition. The first approach would require many more individual instructions.

The loop is therefore easier to extend and maintain for this type of problem.

**Important:** Repetition is not always unnecessary. A loop is useful when an instruction must be performed repeatedly, particularly when the number of repetitions is large or depends on a condition.

---

## 5. Identifying Unnecessary Instructions

When evaluating an algorithm, look for instructions that do not contribute to the final result.

Consider this example:

```java
int number = 10;
int total = number + 5;
int unusedValue = number * 2;

System.out.println(total);
```

Output:

```text
15
```

The variable `unusedValue` is calculated but never used.

Removing the unnecessary calculation simplifies the program:

```java
int number = 10;
int total = number + 5;

System.out.println(total);
```

Both versions produce the same output.

The second version avoids an unnecessary calculation and variable.

When reviewing an algorithm, ask:

- Does every instruction contribute to the solution?
- Are any values calculated but never used?
- Is the same calculation repeated unnecessarily?
- Can a loop replace repetitive instructions?
- Are the variable names meaningful?
- Does the algorithm handle the required inputs correctly?

---

## 6. Tracing an Algorithm

Tracing means following an algorithm instruction by instruction and recording how variable values change.

Consider the following code:

```java
int number = 3;
int total = 0;

for (int count = 1; count <= 3; count++)
{
    total = total + number;
}

System.out.println(total);
```

The loop adds 3 to `total` three times.

| Iteration | `count` | `number` | `total` |
|---:|---:|---:|---:|
| Initial | — | 3 | 0 |
| 1 | 1 | 3 | 3 |
| 2 | 2 | 3 | 6 |
| 3 | 3 | 3 | 9 |

Output:

```text
9
```

A trace table helps you check whether an algorithm behaves as expected. It can also help you identify logical errors that are not detected by the Java compiler.

---

## 7. Common Mistakes

### Mistake 1: Assuming that one successful test proves correctness

An algorithm may work for one input and fail for another.

**Solution:** Test normal values, boundary values and other relevant inputs.

### Mistake 2: Assuming fewer lines always mean greater efficiency

A shorter algorithm is not automatically more efficient or easier to understand.

**Solution:** Consider correctness, the work performed and the clarity of the solution.

### Mistake 3: Ignoring unnecessary calculations

Calculations whose results are never used can make code harder to maintain.

**Solution:** Remove instructions that do not contribute to the required result.

### Mistake 4: Confusing syntax errors with logical errors

A syntax error prevents code from compiling. A logical error occurs when code runs but produces the wrong result.

**Solution:** Compile the program, run it with test data and compare actual results with expected results.

### Mistake 5: Ignoring boundary conditions

A condition that works for values above or below a threshold may fail at the exact threshold.

**Solution:** Include boundary values in the test data.

---

## 8. Practical Challenge

Write a Java program that calculates the total cost of purchasing several identical items.

The program should:

1. Ask the user to enter the price of one item.
2. Ask the user to enter the number of items purchased.
3. Calculate the total cost.
4. Display the result using `JOptionPane`.

After completing the program, evaluate your solution.

Answer these questions:

- Does the program calculate the correct total?
- What happens if the user purchases one item?
- What happens if the user enters zero items?
- What happens if the price contains decimal places?
- Are the variable names meaningful?
- Could any instructions be removed without changing the result?
- What validation would make the program more reliable?

### Extension challenge

Create a second version of your program that uses a separate `void` method to display the result.

Compare both versions in terms of clarity, organisation and ease of maintenance.

---

## Key Takeaways

- Algorithm evaluation determines whether an algorithm is correct, suitable and well organised.
- Correctness should be checked using a range of appropriate test inputs.
- Boundary values are particularly useful when testing conditions.
- Unnecessary instructions can make a program harder to understand and maintain.
- Loops can reduce repetitive instructions when a task must be repeated.
- Trace tables help you follow changes in variable values.
- A good algorithm should be correct, clear, reliable and maintainable.

---

## Navigation

- [Previous: Isolating Digits](../Isolating-Digits/README.md)
- [Back to Algorithms and Problem-Solving](../README.md)
- [Back to Grade 10 Java](../../README.md)
