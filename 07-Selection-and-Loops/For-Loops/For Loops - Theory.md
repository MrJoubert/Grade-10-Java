# For Loops in Java

## Overview

Programs often need to repeat instructions. For example, a program might display the numbers from 1 to 10, calculate a total from several values or repeat a calculation a specified number of times.

In Java, a `for` loop is a repetition structure that allows a block of code to execute repeatedly while a condition remains true.

A `for` loop is particularly useful when you know how many times an instruction must repeat or when you can control the repetition using a counting variable.

Understanding `for` loops is essential for developing algorithms that involve counting, repeated calculations and processing sequences of values.

## Learning Objectives

By the end of this topic, you should be able to:

- Explain the purpose of a `for` loop.
- Identify the three main components of a `for` loop.
- Write the correct syntax for a `for` loop.
- Use a counting variable to control repetition.
- Trace the execution of a `for` loop.
- Use `for` loops to calculate totals and averages.
- Combine `for` loops with selection statements.
- Identify and correct common loop errors.
- Test loops using different starting values, conditions and update expressions.

## IEB Curriculum Alignment

This topic supports Grade 10 IEB Information Technology programming requirements involving repetition, algorithm development, counting, calculations and the implementation of solutions in Java.

The examples focus on introductory `for` loops and their use in common algorithms. This resource is intended for student learning and is not an official IEB publication.

## 1. What Is a For Loop?

A `for` loop repeats a block of code according to a specified initial value, condition and update.

Consider this example:

```java
for (int number = 1; number <= 5; number++) {
    System.out.println(number);
}
```

Output:

```text
1
2
3
4
5
```

The loop displays the numbers from 1 to 5.

Instead of writing five separate `System.out.println()` statements, you write the instruction once and allow the loop to repeat it.

This makes the code shorter, easier to maintain and less likely to contain repeated mistakes.

## 2. The Syntax of a For Loop

The general structure of a `for` loop is:

```java
for (initialisation; condition; update) {
    // Instructions repeated by the loop
}
```

The three components have different purposes.

| Component | Purpose | Example |
|---|---|---|
| Initialisation | Establishes the starting value of the counting variable. | `int number = 1` |
| Condition | Determines whether the loop should execute. | `number <= 5` |
| Update | Changes the counting variable after each iteration. | `number++` |

The three components are separated by semicolons.

### Understanding the example

```java
for (int number = 1; number <= 5; number++) {
    System.out.println(number);
}
```

- `int number = 1` creates the variable and sets its starting value to `1`.
- `number <= 5` checks whether the loop may execute.
- `number++` increases the value of `number` by one after each iteration.
- `System.out.println(number)` displays the current value.

The loop continues until the condition becomes false.

## 3. Understanding the Execution Order

A `for` loop follows a specific sequence.

Consider:

```java
for (int number = 1; number <= 3; number++) {
    System.out.println(number);
}
```

The execution proceeds as follows:

1. The variable `number` is initialised to `1`.
2. Java checks whether `number <= 3`.
3. The condition is true, so the loop body executes and displays `1`.
4. Java updates `number` to `2`.
5. Java checks the condition again.
6. The process repeats until `number` becomes `4`.
7. The condition `4 <= 3` is false, so the loop ends.

Output:

```text
1
2
3
```

**Important:** The update happens after the loop body executes, not before it.

## 4. Counting Upwards

A `for` loop can count upwards by increasing the counting variable.

For example, display the numbers from 1 to 10:

```java
for (int number = 1; number <= 10; number++) {
    System.out.println(number);
}
```

Output:

```text
1
2
3
4
5
6
7
8
9
10
```

The condition `number <= 10` includes the value `10`.

If you changed the condition to `number < 10`, the loop would stop after displaying `9`.

### Choosing the correct condition

| Condition | Values displayed |
|---|---|
| `number < 5` | 1, 2, 3, 4 |
| `number <= 5` | 1, 2, 3, 4, 5 |
| `number < 1` | No values, if the initial value is 1 |
| `number <= 1` | 1 |

Pay close attention to whether a question says *less than* or *less than or equal to*.

## 5. Counting Downwards

A `for` loop can also count downwards by decreasing the counting variable.

For example, count down from 5 to 1:

```java
for (int number = 5; number >= 1; number--) {
    System.out.println(number);
}
```

Output:

```text
5
4
3
2
1
```

The update expression `number--` decreases the variable by one.

The condition `number >= 1` allows the loop to continue while the value is at least `1`.

### Counting in steps

You can increase or decrease the counting variable by more than one.

For example, display the even numbers from 2 to 10:

```java
for (int number = 2; number <= 10; number += 2) {
    System.out.println(number);
}
```

Output:

```text
2
4
6
8
10
```

The update expression `number += 2` adds two to the current value after each iteration.

## 6. Using a For Loop to Calculate a Total

A common algorithm involves adding a sequence of numbers.

Consider a program that calculates the sum of the numbers from 1 to 5.

```java
int total = 0;

for (int number = 1; number <= 5; number++) {
    total = total + number;
}

System.out.println("Total: " + total);
```

Output:

```text
Total: 15
```

### How it works

The variable `total` starts at `0`.

During each iteration, the current value of `number` is added to `total`.

| Iteration | `number` | `total` before addition | `total` after addition |
|---:|---:|---:|---:|
| 1 | 1 | 0 | 1 |
| 2 | 2 | 1 | 3 |
| 3 | 3 | 3 | 6 |
| 4 | 4 | 6 | 10 |
| 5 | 5 | 10 | 15 |

The final total is `15`.

### Understanding the accumulator

An **accumulator** is a variable that stores a running result, such as a total.

In this example:

```java
total = total + number;
```

The current value of `total` is added to `number`, and the result is stored back in `total`.

A common mistake is forgetting to initialise the accumulator before the loop.

## 7. Calculating an Average Using a For Loop

A loop can be used to calculate a total, which can then be used to calculate an average.

Consider a program that calculates the average of five marks stored in separate variables.

```java
int mark1 = 60;
int mark2 = 70;
int mark3 = 80;
int mark4 = 90;
int mark5 = 100;

double total = mark1 + mark2 + mark3 + mark4 + mark5;

double average = total / 5.0;

System.out.println("Average: " + average);
```

Output:

```text
Average: 80.0
```

This example demonstrates the calculation, but it does not use a loop because the marks are stored in separate variables.

A `for` loop becomes particularly useful when values are obtained one at a time and each value must be added to a running total.

For example, the following program asks the user to enter five marks and calculates their average.

```java
import javax.swing.JOptionPane;

public class AverageMarks {

    public static void main(String[] args) {

        double total = 0;

        for (int count = 1; count <= 5; count++) {

            String input = JOptionPane.showInputDialog(
                "Enter mark " + count + ":"
            );

            double mark = Double.parseDouble(input);

            total = total + mark;
        }

        double average = total / 5.0;

        JOptionPane.showMessageDialog(
            null,
            "Average: " + average
        );
    }
}
```

The loop executes five times. Each entered mark is added to `total`, after which the average is calculated.

This example assumes that the user enters numeric values. A more robust program would validate the input.

## 8. Combining For Loops with If Statements

Loops and selection can be combined to solve more complex problems.

Consider a program that displays the numbers from 1 to 10 and identifies which are even.

```java
for (int number = 1; number <= 10; number++) {

    if (number % 2 == 0) {
        System.out.println(number + " is even.");
    }
}
```

Output:

```text
2 is even.
4 is even.
6 is even.
8 is even.
10 is even.
```

The loop generates each number. The `if` statement checks whether the number is even.

The condition:

```java
number % 2 == 0
```

is true when the remainder after division by two is zero.

This combination is useful when you need to examine a sequence of values and perform an action only for values that meet a particular condition.

## 9. Nested For Loops

A nested loop is a loop placed inside another loop.

Consider:

```java
for (int row = 1; row <= 3; row++) {

    for (int column = 1; column <= 2; column++) {
        System.out.println(
            "Row " + row + ", Column " + column
        );
    }
}
```

Output:

```text
Row 1, Column 1
Row 1, Column 2
Row 2, Column 1
Row 2, Column 2
Row 3, Column 1
Row 3, Column 2
```

For each iteration of the outer loop, the inner loop executes fully.

The outer loop controls the rows, while the inner loop controls the columns.

Nested loops are useful for tasks involving rows and columns, repeated patterns and combinations of values.

They can also be more difficult to trace, so make sure you understand the execution order of each loop.

## 10. Trace Tables for For Loops

A trace table helps you follow the values of variables during loop execution.

Consider:

```java
int total = 0;

for (int number = 1; number <= 3; number++) {
    total = total + number;
}

System.out.println(total);
```

A trace table is:

| Iteration | `number` | `total` after addition |
|---:|---:|---:|
| 1 | 1 | 1 |
| 2 | 2 | 3 |
| 3 | 3 | 6 |

After the third iteration, `number` becomes `4`.

The condition `number <= 3` is then false, so the loop ends.

Output:

```text
6
```

When tracing a `for` loop, remember the order:

1. Initialise the counting variable.
2. Check the condition.
3. Execute the body if the condition is true.
4. Update the counting variable.
5. Check the condition again.

Repeat this process until the condition becomes false.

## 11. Common Mistakes

### Mistake 1: Using the wrong condition

Incorrect:

```java
for (int number = 1; number < 5; number++) {
    System.out.println(number);
}
```

If the requirement is to display numbers from 1 to 5 inclusive, this loop stops at 4.

Correct:

```java
for (int number = 1; number <= 5; number++) {
    System.out.println(number);
}
```

### Mistake 2: Forgetting to update the counting variable

If the update expression does not move the variable towards the stopping condition, the loop may never end.

### Mistake 3: Updating in the wrong direction

Incorrect:

```java
for (int number = 1; number <= 5; number--) {
    System.out.println(number);
}
```

The variable decreases while the condition requires it to remain at or below `5`. Starting at `1`, the condition remains true as the variable becomes smaller, so the loop does not terminate under ordinary integer execution.

### Mistake 4: Forgetting to initialise a total

Incorrect:

```java
int total;

for (int number = 1; number <= 5; number++) {
    total = total + number;
}
```

Java does not allow a local variable to be used before it has been assigned a value.

Correct:

```java
int total = 0;
```

### Mistake 5: Confusing the loop body with the update

The update expression runs after the body, not before it. This affects the values displayed and the number of iterations.

### Mistake 6: Using the wrong accumulator assignment

Incorrect:

```java
total = number;
```

This replaces the previous total with the current number.

Correct:

```java
total = total + number;
```

This adds the current number to the running total.

## 12. Testing For Loops

When testing a loop, check the starting value, condition, update expression and expected number of iterations.

For example:

```java
for (int number = 1; number <= 5; number++) {
    System.out.println(number);
}
```

| Starting value | Condition | Update | Expected values |
|---:|---|---|---|
| 1 | `number <= 5` | `number++` | 1, 2, 3, 4, 5 |
| 1 | `number < 5` | `number++` | 1, 2, 3, 4 |
| 5 | `number >= 1` | `number--` | 5, 4, 3, 2, 1 |
| 2 | `number <= 10` | `number += 2` | 2, 4, 6, 8, 10 |

Before executing a loop, predict how many times it will run and which values will be processed.

## Practical Challenge

Develop a Java program that asks the user to enter five whole numbers.

Your program must:

1. Use `JOptionPane` to obtain each number.
2. Use a `for` loop to repeat the input process five times.
3. Calculate the total of the five numbers.
4. Calculate the average as a decimal value.
5. Count how many of the numbers are even.
6. Display the total, average and number of even values.

### Requirements

- Use a counting variable in the loop.
- Initialise the total and even-number counter before the loop.
- Use the remainder operator to identify even numbers.
- Use meaningful variable names.
- Display clear output messages.

### Extension activities

- Modify the program to accept ten numbers instead of five.
- Count the number of positive values entered.
- Determine the largest of the five values.
- Display all multiples of three between 1 and 100.
- Write pseudocode for the program.
- Draw a flowchart showing the repetition and selection logic.

## Key Takeaways

- A `for` loop repeats instructions while its condition remains true.
- Initialisation establishes the starting value.
- The condition determines whether the loop executes.
- The update changes the counting variable after each iteration.
- The loop body executes before the update expression.
- Accumulators can calculate totals.
- Loops can be combined with selection statements.
- Nested loops allow repetition within repetition.
- Trace tables help you follow loop execution.
- Incorrect conditions and updates can cause missing iterations or non-terminating loops.
- Testing should confirm the starting value, stopping condition and expected number of repetitions.

---

## Navigation

- [Previous: Switch Statements](../Switch-Statements/README.md)
- **Current topic: For Loops**
- [Next: While Loops](../While-Loops/README.md)
- [Back to the Grade 10 Java Library](../../README.md)
