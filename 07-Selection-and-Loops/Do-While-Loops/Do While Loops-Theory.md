# Do-While Loops

## 1. Overview

A `do-while` loop is a control structure that repeats a block of code while a specified condition remains true.

It is similar to a `while` loop, but there is one important difference:

**A `do-while` loop executes its body at least once because the condition is checked after the loop body.**

This makes it useful when a program must perform an action before deciding whether to repeat it.

Examples include:
- Displaying a menu at least once.
- Asking the user to enter information before checking whether it is valid.
- Repeating a calculation while a condition is true.
- Giving the user the option to repeat an operation.

## 2. Learning Objectives

By the end of this topic, you should be able to:

- Explain how a `do-while` loop works.
- Write a `do-while` loop using correct Java syntax.
- Explain the difference between `while` and `do-while` loops.
- Use a `do-while` loop with counters and conditions.
- Use a `do-while` loop to validate user input.
- Trace the execution of a `do-while` loop.
- Identify and correct common errors.

## 3. IEB Curriculum Alignment

This topic supports Grade 10 IEB Information Technology programming requirements relating to:

- Iteration and control structures.
- Boolean expressions and relational operators.
- Condition-controlled repetition.
- Input, processing and output.
- Algorithm development and problem-solving.
- Tracing, testing and debugging programs.

The examples focus on foundational Grade 10 Java programming.

## 4. Understanding the `do-while` Loop

### 4.1 Basic syntax

The syntax of a `do-while` loop is:

```java
do
{
    // Statements to repeat
}
while (condition);
```

Notice the semicolon after the condition. It is required in Java.

The loop works as follows:

1. Java executes the statements inside the `do` block.
2. Java evaluates the condition after the block has executed.
3. If the condition is `true`, the loop repeats.
4. If the condition is `false`, the loop ends.

### 4.2 Example: Display a message three times

```java
int count = 1;

do
{
    System.out.println("Hello");
    count++;
}
while (count <= 3);
```

**Output:**

```text
Hello
Hello
Hello
```

The variable `count` starts at 1. After each message, it increases by 1. Once `count` becomes 4, the condition is false and the loop stops.

### 4.3 The three important parts

| Component | Code | Purpose |
|---|---|---|
| Initialisation | `int count = 1;` | Sets the starting value. |
| Loop body | `System.out.println("Hello");` | Performs the action. |
| Update | `count++;` | Changes the counter. |
| Condition | `count <= 3` | Determines whether another iteration occurs. |

Initialisation happens before the loop. The body executes before the condition is checked.

## 5. The Difference Between `while` and `do-while`

The most important difference is when the condition is checked.

### Example 1: A `while` loop

```java
int number = 10;

while (number < 5)
{
    System.out.println(number);
}
```

**Output:** No output.

The condition is false before the loop begins, so the body is skipped.

### Example 2: A `do-while` loop

```java
int number = 10;

do
{
    System.out.println(number);
}
while (number < 5);
```

**Output:**

```text
10
```

The message is displayed before Java checks the condition. The condition is false, so the loop ends immediately afterwards.

### Comparison table

| Feature | `while` | `do-while` |
|---|---|---|
| Condition checked | Before the loop body | After the loop body |
| Minimum executions | Zero | One |
| Semicolon after condition | No | Yes |
| Useful when | The action may not need to happen | The action must happen at least once |

**Exam tip:** If a question asks which loop guarantees at least one execution, the answer is `do-while`.

## 6. Counting with a `do-while` Loop

A `do-while` loop can count upwards or downwards.

### Example 1: Count from 1 to 5

```java
int count = 1;

do
{
    System.out.println(count);
    count++;
}
while (count <= 5);
```

**Output:**

```text
1
2
3
4
5
```

### Example 2: Count backwards

```java
int count = 5;

do
{
    System.out.println(count);
    count--;
}
while (count >= 1);

System.out.println("Finished!");
```

**Output:**

```text
5
4
3
2
1
Finished!
```

The counter decreases during each iteration until the condition becomes false.

## 7. Using a `do-while` Loop with User Input

A common use of a `do-while` loop is to ask the user for input at least once and then check whether the input meets a requirement.

### Example: Accept a positive number

```java
import javax.swing.JOptionPane;

public class DoWhileInputExample
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

            if (number <= 0)
            {
                JOptionPane.showMessageDialog(
                    null,
                    "Invalid number. Please try again."
                );
            }
        }
        while (number <= 0);

        JOptionPane.showMessageDialog(
            null,
            "Accepted number: " + number
        );
    }
}
```

### How the program works

1. The `do` block executes and requests a number.
2. The input is converted from a `String` to an `int`.
3. If the number is less than or equal to 0, an error message is displayed.
4. Java checks the condition `number <= 0`.
5. If the condition is true, the user is asked to enter another number.
6. When the user enters a positive number, the condition becomes false and the loop ends.
7. The accepted number is displayed.

This is an example of **input validation using a `do-while` loop**.

**Important:** This example assumes that the user enters a valid whole number. It does not handle non-numeric input or cancellation of the input dialog.

## 8. Using a `do-while` Loop to Repeat a Task

A program can use a `do-while` loop to repeat a task based on a user's response.

### Example: Repeat a simple calculation

```java
import javax.swing.JOptionPane;

public class RepeatCalculation
{
    public static void main(String[] args)
    {
        int number;
        int square;
        String answer;

        do
        {
            number = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Enter a whole number:"
                )
            );

            square = number * number;

            JOptionPane.showMessageDialog(
                null,
                "The square of " + number + " is " + square
            );

            answer = JOptionPane.showInputDialog(
                "Would you like to calculate another square? (yes/no)"
            );

        }
        while (answer.equalsIgnoreCase("yes"));
    }
}
```

### How the program works

1. The user enters a whole number.
2. The program calculates its square.
3. The result is displayed.
4. The program asks whether the user wants to repeat the calculation.
5. If the user enters `yes`, the loop repeats.
6. If the user enters anything else, the loop ends.

The method `equalsIgnoreCase()` compares two strings without distinguishing between uppercase and lowercase letters.

For example, `yes`, `YES` and `Yes` all match `"yes"` when using this method.

## 9. Tracing a `do-while` Loop

Consider the following code:

```java
int x = 4;

do
{
    System.out.println(x);
    x -= 2;
}
while (x > 0);
```

### Trace table

| Iteration | Value of `x` at start | Output | Value after update | Condition |
|---|---:|---:|---:|---|
| 1 | 4 | 4 | 2 | `2 > 0` is true |
| 2 | 2 | 2 | 0 | `0 > 0` is false |

**Output:**

```text
4
2
```

The loop executes twice. After the second iteration, `x` becomes 0, making the condition false.

When tracing a `do-while` loop, remember that the loop body executes before the condition is evaluated.

## 10. Common Mistakes

### Mistake 1: Forgetting the semicolon

Incorrect:

```java
do
{
    System.out.println("Hello");
}
while (count < 5)
```

Correct:

```java
do
{
    System.out.println("Hello");
}
while (count < 5);
```

The semicolon after the condition is required.

### Mistake 2: Forgetting to update the controlling variable

Incorrect:

```java
int count = 1;

do
{
    System.out.println(count);
}
while (count <= 5);
```

The value of `count` never changes. The condition remains true, causing an infinite loop.

Correct:

```java
int count = 1;

do
{
    System.out.println(count);
    count++;
}
while (count <= 5);
```

### Mistake 3: Using the wrong condition

Incorrect:

```java
int count = 1;

do
{
    System.out.println(count);
    count++;
}
while (count >= 5);
```

The body executes once, but the condition becomes false immediately after the first iteration because `count` is 2.

Correct:

```java
int count = 1;

do
{
    System.out.println(count);
    count++;
}
while (count <= 5);
```

### Mistake 4: Assuming the loop can execute zero times

A `do-while` loop always executes its body at least once.

Even if the condition is false initially, the body executes before Java checks the condition.

If an action must only happen when a condition is already true, a `while` loop may be more appropriate.

### Mistake 5: Confusing `=` and `==`

The operator `=` assigns a value, while `==` compares values for equality.

For example:

```java
while (count == 5);
```

This condition checks whether `count` equals 5, although the semicolon here creates an empty loop body if used in this form. Use the correct loop structure and avoid unnecessary semicolons.

## 11. Choosing Between `while` and `do-while`

Before selecting a loop, ask yourself one question:

**Must the action happen at least once before the condition is checked?**

- If **yes**, consider a `do-while` loop.
- If **no**, a `while` loop may be suitable.

Examples:

| Problem | Suitable loop | Reason |
|---|---|---|
| Display a menu before asking what the user wants to do | `do-while` | The menu must appear at least once. |
| Keep asking for a positive number until one is entered | `do-while` | The user must be prompted at least once. |
| Repeat while a counter is less than 10, but possibly not execute | `while` | The condition is checked first. |
| Continue processing while a condition remains true | Either, depending on the requirement | Consider whether the first execution is compulsory. |

There is no rule that every counting task must use a `for` loop or every condition-controlled task must use a `while` loop. Choose the structure that best matches the algorithm.

## 12. Testing and Debugging

When testing a `do-while` loop, check the following:

- Does the body execute at least once?
- Is the condition checked after the body?
- Does the loop repeat when the condition is true?
- Does the loop stop when the condition is false?
- Is the controlling variable updated correctly?
- Is the condition appropriate for the problem?
- Does the program produce the expected output?

For an input-validation loop, test a valid input on the first attempt and an invalid input followed by a valid input.

For example, if the program requires a positive number, test `5` and then test `0`, followed by `5`. The first case should be accepted immediately, while the second should prompt the user again.

## 13. Practical Challenge

Create a Java program that displays a simple menu using `JOptionPane`.

### Requirements

1. Display the following menu at least once:

   - 1 – Calculate the square of a number
   - 2 – Display a greeting
   - 3 – Exit

2. Ask the user to enter a menu choice.
3. Use a `switch` statement to process the choice.
4. If the user selects option 1, ask for a whole number and display its square.
5. If the user selects option 2, display a greeting.
6. If the user selects option 3, end the program.
7. If the user enters an invalid menu choice, display an error message.
8. Repeat the menu until the user selects option 3.

### Hints

- Use a `do-while` loop to ensure that the menu is displayed at least once.
- Store the menu choice in an integer variable.
- Use a condition that keeps the loop running while the choice is not 3.
- Remember that the loop condition is checked after the menu and its selected action have been processed.

### Extension challenge

Add an option that calculates the sum of two numbers. Ensure that the menu continues to appear until the user selects Exit.

## 14. Key Takeaways

- A `do-while` loop repeats while a condition is true.
- The loop body executes before the condition is checked.
- A `do-while` loop always executes at least once.
- A semicolon is required after the `while` condition.
- The controlling variable must be updated where necessary to prevent an infinite loop.
- `do-while` loops are useful for menus, repeated tasks and input validation.
- Trace tables help you follow variable values and determine when a loop ends.
- Always test both valid and invalid conditions.

## 15. Navigation

- [Grade 10 Java Code Library](../../README.md)
- [Previous: While Loops](../While-Loops/README.md)
- **Current: Do-While Loops**
- [Next: Counting and Condition-Controlled Loops](../Counting-and-Condition-Controlled-Loops/README.md)
- [Back to Selection and Loops](../README.md)
