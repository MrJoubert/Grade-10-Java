# Counting and Condition-Controlled Loops

## 1. Overview

Loops allow a program to repeat instructions without requiring the same code to be written multiple times. In Java, loops can be used to count, calculate totals, process input and repeat actions while a condition remains true.

Two important approaches to repetition are **count-controlled loops** and **condition-controlled loops**.

- **Count-controlled loops** repeat a task a specific number of times or while a counter moves through a defined range.
- **Condition-controlled loops** repeat a task while a Boolean condition remains true.

A `for` loop is commonly used for count-controlled repetition. A `while` loop or `do-while` loop is often used when repetition depends on a condition. However, these are guidelines rather than strict rules: the best loop depends on the problem.

Understanding these approaches will help you choose the correct control structure when solving programming problems.

## 2. Learning Objectives

By the end of this topic, you should be able to:

- Explain the difference between count-controlled and condition-controlled repetition.
- Identify situations where a `for`, `while` or `do-while` loop is appropriate.
- Use counters to control repetition.
- Use Boolean conditions to determine when a loop ends.
- Calculate totals using accumulators.
- Recognise the importance of initialisation, conditions and updates.
- Trace loops and identify their stopping conditions.
- Test loops to ensure that they execute the correct number of times.

## 3. IEB Curriculum Alignment

This topic supports Grade 10 IEB Information Technology programming requirements relating to:

- Iteration and repetition.
- `for`, `while` and `do-while` loops.
- Boolean expressions and relational operators.
- Algorithm development and problem-solving.
- Calculations using counters and accumulators.
- Trace tables, testing and debugging.

The examples focus on foundational Grade 10 Java programming.

## 4. Count-Controlled Loops

A count-controlled loop repeats a task according to a counter or a defined number of repetitions.

For example, a program may need to:
- Display the numbers from 1 to 10.
- Print a message five times.
- Calculate the total of the first 20 positive integers.
- Display the multiples of a number within a specified range.

A `for` loop is often the clearest choice when the number of repetitions is known.

### Example 1: Display a message five times

```java
for (int count = 1; count <= 5; count++)
{
    System.out.println("Welcome to Java!");
}
```

**Output:**

```text
Welcome to Java!
Welcome to Java!
Welcome to Java!
Welcome to Java!
Welcome to Java!
```

The loop uses three components:

| Component | Code | Purpose |
|---|---|---|
| Initialisation | `int count = 1` | Sets the starting value. |
| Condition | `count <= 5` | Determines whether the loop continues. |
| Update | `count++` | Increases the counter after each iteration. |

The loop ends when `count` becomes 6.

### Example 2: Calculate a total

The following program calculates the sum of the integers from 1 to 10.

```java
int total = 0;

for (int count = 1; count <= 10; count++)
{
    total = total + count;
}

System.out.println("Total: " + total);
```

**Output:**

```text
Total: 55
```

The variable `total` is an accumulator. It stores the running total as each new number is added.

The counter controls how many numbers are added, while the accumulator stores the result.

## 5. Condition-Controlled Loops

A condition-controlled loop continues while a specified condition is true.

The number of repetitions may not be known before the program starts.

For example:
- Continue asking for input while a number is invalid.
- Repeat a task while the user chooses to continue.
- Process values until a stopping condition is reached.

A `while` loop is useful when the condition must be checked before each iteration. A `do-while` loop is useful when the body must execute at least once.

### Example 1: Continue while a condition is true

```java
int number = 1;

while (number <= 20)
{
    System.out.println(number);
    number += 3;
}
```

**Output:**

```text
1
4
7
10
13
16
19
```

The loop continues while `number <= 20` is true. The value increases by 3 during each iteration.

Although the loop uses a counter, it is controlled by a Boolean condition. This illustrates that the two approaches can overlap.

### Example 2: Repeat until the user enters a positive number

```java
import javax.swing.JOptionPane;

public class ConditionControlledExample
{
    public static void main(String[] args)
    {
        int number;

        do
        {
            number = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Enter a positive whole number:"
                )
            );
        }
        while (number <= 0);

        JOptionPane.showMessageDialog(
            null,
            "Accepted number: " + number
        );
    }
}
```

The program requests input at least once. If the user enters zero or a negative number, the condition remains true and another input is requested.

When the user enters a positive number, the condition becomes false and the loop ends.

This example assumes that the input is a valid whole number. It does not handle non-numeric input or cancellation of the dialog.

## 6. Choosing the Appropriate Loop

Use the problem requirements to decide which loop is most appropriate.

| Requirement | Possible choice | Reason |
|---|---|---|
| Repeat a known number of times | `for` | The counter and range are easy to manage in one statement. |
| Repeat while a condition is true | `while` | The condition is checked before each iteration. |
| Execute once before checking whether to repeat | `do-while` | The body always executes at least once. |
| Ask for input until it meets a condition | `while` or `do-while` | The choice depends on whether input must be requested at least once. |
| Count through a range and calculate a total | `for` or `while` | Both can perform the required repetition. |

There is often more than one correct solution. Your goal is to choose a loop that makes the algorithm clear, correct and easy to maintain.

## 7. Counters and Accumulators

Counters and accumulators are commonly used inside loops, but they have different purposes.

### 7.1 Counter

A counter tracks the number of times something happens or controls the progress of a loop.

```java
int count = 0;

count++;
```

After this statement, `count` has increased by 1.

### 7.2 Accumulator

An accumulator stores a value that changes as calculations are performed.

```java
int total = 0;

total = total + 5;
total = total + 3;
```

The final value of `total` is 8.

### 7.3 Using both together

```java
int count = 1;
int total = 0;

while (count <= 4)
{
    total = total + count;
    count++;
}

System.out.println("Count: " + (count - 1));
System.out.println("Total: " + total);
```

**Output:**

```text
Count: 4
Total: 10
```

The counter controls the loop, while the accumulator calculates the sum.

Notice that `count` becomes 5 when the loop ends. The expression `count - 1` is used to display the last number processed.

## 8. Using a Sentinel Value

A sentinel value is a special value that signals when a process should stop.

For example, a program may accept numbers until the user enters `-1`. The sentinel value is used to stop the loop and is not included in the total.

### Example: Calculate a total until `-1` is entered

```java
import javax.swing.JOptionPane;

public class SentinelExample
{
    public static void main(String[] args)
    {
        int number;
        int total = 0;

        number = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Enter a number (-1 to stop):"
            )
        );

        while (number != -1)
        {
            total = total + number;

            number = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Enter another number (-1 to stop):"
                )
            );
        }

        JOptionPane.showMessageDialog(
            null,
            "Total: " + total
        );
    }
}
```

### Example interaction

Suppose the user enters:

```text
5
8
2
-1
```

The program calculates:

\[
5 + 8 + 2 = 15
\]

The final output is:

```text
Total: 15
```

The value `-1` is not added because the loop condition is checked before the loop body executes.

**Important:** This example assumes that the user enters valid integers. If the first value is `-1`, the loop executes zero times and the total remains 0.

## 9. Common Loop Errors

### Mistake 1: Incorrect initialisation

If a counter starts at the wrong value, the loop may execute too many or too few times.

```java
int count = 0;

while (count <= 5)
{
    System.out.println(count);
    count++;
}
```

This displays six numbers: 0, 1, 2, 3, 4 and 5.

If the intention is to display numbers from 1 to 5, initialise `count` to 1.

### Mistake 2: Incorrect condition

```java
int count = 1;

while (count < 5)
{
    System.out.println(count);
    count++;
}
```

This displays 1 to 4, not 1 to 5.

Use `count <= 5` if the value 5 must also be included.

### Mistake 3: Forgetting the update

```java
int count = 1;

while (count <= 5)
{
    System.out.println(count);
}
```

Because `count` never changes, the condition remains true and the loop does not terminate.

Always check whether the controlling variable changes appropriately.

### Mistake 4: Incorrect accumulator initialisation

```java
int total = 1;
```

If the program is calculating a sum that should start at zero, this initialisation produces an incorrect result.

For a normal running total, use:

```java
int total = 0;
```

### Mistake 5: Including the sentinel value

If `-1` is intended to stop input, do not add it to the total. Check the condition before processing the value, as shown in the sentinel example.

## 10. Testing and Tracing

Testing confirms that a loop behaves as expected. Tracing allows you to follow the values of variables as the program executes.

Consider the following program:

```java
int count = 1;
int total = 0;

while (count <= 3)
{
    total = total + count;
    count++;
}

System.out.println(total);
```

### Trace table

| Iteration | `count` before addition | `total` after addition | `count` after update |
|---|---:|---:|---:|
| 1 | 1 | 1 | 2 |
| 2 | 2 | 3 | 3 |
| 3 | 3 | 6 | 4 |

When `count` becomes 4, the condition `count <= 3` is false.

**Output:**

```text
6
```

When testing loops, consider:
- The first value that should be processed.
- The last value that should be processed.
- Whether the loop should execute zero times.
- Whether the controlling variable changes correctly.
- Whether the accumulator produces the expected result.
- Whether the stopping condition is handled correctly.

## 11. Practical Challenge

Create a Java program that calculates the average of a series of positive whole numbers entered by the user. The user must enter `-1` to stop.

### Requirements

1. Use `JOptionPane` to request the first number.
2. Use a condition-controlled loop to process numbers until `-1` is entered.
3. Add each accepted number to a running total.
4. Count how many numbers were entered.
5. Do not include `-1` in the total or count.
6. Calculate and display the average.
7. If the user enters `-1` immediately, display a suitable message instead of attempting to divide by zero.

### Example

If the user enters:

```text
10
20
30
-1
```

The program should calculate:

\[
\text{Average} = \frac{10+20+30}{3} = 20
\]

Expected result:

```text
Average: 20.0
```

### Extension challenge

Modify the program to display the largest number entered as well as the average.

Test your program with:
- One number followed by `-1`.
- Several different numbers followed by `-1`.
- `-1` as the first input.

## 12. Key Takeaways

- Count-controlled repetition uses a counter or defined range to control progress.
- Condition-controlled repetition continues while a Boolean condition remains true.
- `for`, `while` and `do-while` loops can all solve many repetition problems.
- A counter tracks progress or occurrences.
- An accumulator stores a running calculation.
- A sentinel value can indicate when input or processing should stop.
- Initialisation, conditions and updates must be correct.
- Testing and trace tables help identify logic errors and incorrect stopping conditions.

## 13. Navigation

- [Grade 10 Java Code Library](../../README.md)
- [Previous: Do-While Loops](../Do-While-Loops/README.md)
- **Current: Counting and Condition-Controlled Loops**
- [Next: Nested Loops](../Nested-Loops/README.md)
- [Back to Selection and Loops](../README.md)
