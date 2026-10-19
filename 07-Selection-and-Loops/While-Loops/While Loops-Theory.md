# While Loops

## 1. Overview

A `while` loop is a control structure that repeats a block of code **while a specified condition remains true**.

Unlike a `for` loop, which is often used when the number of repetitions is known, a `while` loop is particularly useful when the number of repetitions is not known in advance.

For example, a program might need to:
- Count from 1 to 10.
- Continue processing while a condition is true.
- Ask for input until the user enters an acceptable value.
- Calculate a running total.
- Repeat an operation until a stopping condition is reached.

The `while` loop checks its condition **before** executing the loop body. Therefore, if the condition is false at the beginning, the loop body will not execute at all.

## 2. Learning Objectives

By the end of this topic, you should be able to:

- Explain how a `while` loop works.
- Write a `while` loop using correct Java syntax.
- Identify the initialisation, condition and update statements.
- Use a loop to count and calculate totals.
- Use a condition to control how long a loop executes.
- Trace the execution of a `while` loop.
- Identify and correct common loop errors.
- Select an appropriate loop for a given problem.

## 3. IEB Curriculum Alignment

This topic supports Grade 10 IEB Information Technology programming requirements relating to:

- Selection and iteration control structures.
- Boolean expressions and relational operators.
- Condition-controlled repetition.
- Algorithm development and problem-solving.
- Calculations using variables and operators.
- Tracing program execution.
- Testing and debugging programs.

The examples in this section focus on foundational Grade 10 Java programming.

## 4. Understanding the `while` Loop

### 4.1 Basic syntax

A `while` loop follows this structure:

```java
while (condition)
{
    // Statements to repeat
}
```

The condition must evaluate to either `true` or `false`.

- If the condition is `true`, the loop body executes.
- After the loop body executes, Java checks the condition again.
- If the condition is still `true`, the loop repeats.
- If the condition is `false`, the loop ends.

### 4.2 The three important parts

Consider the following example:

```java
int count = 1;

while (count <= 5)
{
    System.out.println(count);
    count++;
}
```

There are three important components:

| Component | Code | Purpose |
|---|---|---|
| Initialisation | `int count = 1;` | Sets the starting value. |
| Condition | `count <= 5` | Determines whether the loop continues. |
| Update | `count++;` | Changes the value so the loop can eventually end. |

**Important:** The initialisation happens before the loop. The condition is checked before every iteration, and the update happens inside the loop body.

### 4.3 Program output

```text
1
2
3
4
5
```

The loop starts with `count` equal to 1. It prints the value, increases it by 1 and checks the condition again.

When `count` becomes 6, the condition `count <= 5` is false, so the loop ends.

## 5. Counting with a `while` Loop

A counting loop repeats a task while a counter remains within a specified range.

### Example 1: Count from 1 to 10

```java
int count = 1;

while (count <= 10)
{
    System.out.println(count);
    count++;
}
```

**Output:**

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

### Example 2: Count backwards

```java
int count = 5;

while (count >= 1)
{
    System.out.println(count);
    count--;
}

System.out.println("Blast off!");
```

**Output:**

```text
5
4
3
2
1
Blast off!
```

Notice that `count--` decreases the counter by 1 during each iteration.

### Example 3: Count in steps of 2

```java
int count = 2;

while (count <= 10)
{
    System.out.println(count);
    count += 2;
}
```

**Output:**

```text
2
4
6
8
10
```

The statement `count += 2;` increases `count` by 2 each time.

## 6. Calculating a Running Total

A running total is a value that accumulates as a loop executes.

For example, a program can calculate the sum of the numbers from 1 to 5.

```java
int count = 1;
int total = 0;

while (count <= 5)
{
    total = total + count;
    count++;
}

System.out.println("Total: " + total);
```

**Output:**

```text
Total: 15
```

### Understanding the calculation

The variable `total` starts at 0. During each iteration, the current value of `count` is added to `total`.

| Iteration | `count` | `total` after addition |
|---|---:|---:|
| 1 | 1 | 1 |
| 2 | 2 | 3 |
| 3 | 3 | 6 |
| 4 | 4 | 10 |
| 5 | 5 | 15 |

After the fifth iteration, `count` becomes 6. The condition is false, and the loop ends.

**Remember:** Initialise an accumulating variable such as `total` to 0 before the loop when you are calculating a sum.

## 7. Using a `while` Loop with User Input

A `while` loop can repeat a calculation or request for input while a condition remains true.

The following example asks the user to enter a number and continues asking while the number is negative.

### Example: Accept a non-negative number

```java
import javax.swing.JOptionPane;

public class WhileInputExample
{
    public static void main(String[] args)
    {
        int number;

        number = Integer.parseInt(
            JOptionPane.showInputDialog("Enter a non-negative number:")
        );

        while (number < 0)
        {
            number = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Invalid number. Enter a non-negative number:"
                )
            );
        }

        JOptionPane.showMessageDialog(
            null,
            "Accepted number: " + number
        );
    }
}
```

### How the program works

1. The program asks the user to enter a number.
2. The input is converted from a `String` to an `int`.
3. Java checks whether `number < 0`.
4. If the number is negative, the loop asks for another number.
5. The loop continues until the user enters a number greater than or equal to 0.
6. The program displays the accepted number.

This is an example of **input validation using a condition-controlled loop**.

**Note:** This example assumes the user enters a valid whole number. Handling non-numeric input requires additional validation and exception handling.

## 8. A `while` Loop Can Execute Zero Times

Because a `while` loop checks its condition before executing the body, it is possible for the loop to execute zero times.

Consider this example:

```java
int number = 10;

while (number < 5)
{
    System.out.println(number);
    number++;
}

System.out.println("Loop finished.");
```

**Output:**

```text
Loop finished.
```

The condition `number < 5` is false because `number` is 10. Therefore, Java skips the loop body completely.

This is an important difference between a `while` loop and a `do-while` loop.

## 9. Tracing a `while` Loop

Tracing means following a program step by step to determine how variable values change and what output is produced.

Consider the following code:

```java
int x = 2;

while (x <= 8)
{
    System.out.println(x);
    x += 2;
}
```

### Trace table

| Step | Value of `x` before condition | Condition `x <= 8` | Output | Value of `x` after update |
|---|---:|---|---:|---:|
| 1 | 2 | `true` | 2 | 4 |
| 2 | 4 | `true` | 4 | 6 |
| 3 | 6 | `true` | 6 | 8 |
| 4 | 8 | `true` | 8 | 10 |
| 5 | 10 | `false` | None | Loop ends |

**Output:**

```text
2
4
6
8
```

When answering a tracing question, always pay attention to:
- The starting value of each variable.
- The condition before each iteration.
- The order of statements inside the loop.
- The update statement.
- The value that causes the loop to stop.

## 10. Common Mistakes

### Mistake 1: Forgetting to update the counter

Incorrect:

```java
int count = 1;

while (count <= 5)
{
    System.out.println(count);
}
```

The value of `count` never changes. The condition remains true, so the loop continues indefinitely.

Correct:

```java
int count = 1;

while (count <= 5)
{
    System.out.println(count);
    count++;
}
```

### Mistake 2: Using the wrong condition

Incorrect:

```java
int count = 1;

while (count >= 5)
{
    System.out.println(count);
    count++;
}
```

The condition is false immediately, so the loop never executes.

Correct:

```java
int count = 1;

while (count <= 5)
{
    System.out.println(count);
    count++;
}
```

### Mistake 3: Updating in the wrong direction

Incorrect:

```java
int count = 5;

while (count >= 1)
{
    System.out.println(count);
    count++;
}
```

The counter increases instead of decreasing. The condition remains true as the counter increases, causing an infinite loop.

Correct:

```java
int count = 5;

while (count >= 1)
{
    System.out.println(count);
    count--;
}
```

### Mistake 4: Placing the semicolon after the condition

Incorrect:

```java
while (count <= 5);
{
    System.out.println(count);
    count++;
}
```

The semicolon creates an empty loop body. The following block is not part of the loop. Depending on the value of `count`, this can cause an infinite loop or prevent the intended output.

Correct:

```java
while (count <= 5)
{
    System.out.println(count);
    count++;
}
```

### Mistake 5: Confusing assignment and comparison

Incorrect:

```java
while (count = 5)
```

In Java, `=` assigns a value; it does not test equality. This statement is also invalid because the assignment expression produces an integer rather than a Boolean condition.

To test equality, use:

```java
while (count == 5)
```

Only use this condition when equality is genuinely the condition required by the algorithm.

## 11. Testing and Debugging

When testing a `while` loop, consider the following questions:

- Does the loop execute the correct number of times?
- Does the condition use the correct comparison operator?
- Is the counter or controlling variable initialised correctly?
- Does the variable change during each iteration?
- Will the loop eventually stop?
- What happens if the condition is false at the beginning?
- Are the calculations and displayed results correct?

Test your program with standard values, boundary values and values that should cause the loop to execute zero times.

For a counting loop intended to display numbers from 1 to 5, check that the output includes both 1 and 5, without displaying 0 or 6.

## 12. Practical Challenge

Create a Java program that uses a `while` loop to calculate the total of the numbers from 1 to a positive whole number entered by the user.

### Requirements

1. Ask the user to enter a positive whole number using `JOptionPane`.
2. If the number is less than 1, ask the user to enter another number.
3. Use a `while` loop to calculate the total from 1 up to the accepted number.
4. Display the final total using `JOptionPane`.
5. Use meaningful variable names.
6. Ensure that the program terminates correctly.

### Example

If the user enters `4`, the program must calculate:

`1 + 2 + 3 + 4 = 10`

The program should display:

```text
The total from 1 to 4 is 10
```

### Extension challenge

Modify the program to count how many numbers between 1 and the entered number are divisible by 3.

Test your program with several different inputs and check your results manually.

## 13. Key Takeaways

- A `while` loop repeats statements while a condition is true.
- The condition is checked before the loop body executes.
- A `while` loop can execute zero times.
- The loop must update its controlling variable when necessary to ensure termination.
- A counter controls repetition, while an accumulator stores a running result.
- `while` loops are useful when the number of repetitions is not known in advance.
- Trace tables help you understand and debug loops.
- Always test your loop to ensure that it produces the correct result and eventually terminates.

## 14. Navigation

- [Grade 10 Java Code Library](../../README.md)
- [Previous: For Loops](../For-Loops/README.md)
- **Current: While Loops**
- [Next: Do-While Loops](../Do-While-Loops/README.md)
- [Back to Selection and Loops](../README.md)
