# Choosing the Right Control Structure

## 1. Overview

Control structures determine the order in which a program's instructions execute. In Java, they allow a program to make decisions, repeat instructions and respond to different situations.

The three main control structure categories covered in this topic are:

- **Sequence:** Instructions execute one after another, in order.
- **Selection:** A decision determines which instructions execute.
- **Iteration:** Instructions repeat while a condition is satisfied or for a specified number of repetitions.

Choosing the correct control structure is an important programming skill. A problem may be solved in several ways, but the best solution is one that is correct, clear and appropriate for the requirements.

This topic brings together the selection and loop structures covered in Grade 10 Java.

## 2. Learning Objectives

By the end of this topic, you should be able to:

- Explain sequence, selection and iteration.
- Distinguish between `if`, `if-else` and `switch` statements.
- Choose between `for`, `while` and `do-while` loops.
- Identify when nested selection or nested loops are appropriate.
- Translate problem requirements into suitable Java control structures.
- Trace and test programs that use different control structures.
- Identify common errors when choosing or combining control structures.

## 3. IEB Curriculum Alignment

This topic supports Grade 10 IEB Information Technology programming requirements relating to:

- Algorithm development and problem-solving.
- Selection using `if`, `if-else` and `switch`.
- Iteration using `for`, `while` and `do-while`.
- Boolean expressions, relational operators and logical operators.
- Combining control structures to solve problems.
- Tracing, testing and debugging algorithms.

The examples focus on foundational Grade 10 Java programming.

## 4. Sequence: Instructions in Order

Sequence is the simplest control structure. Statements execute one after another, from top to bottom, unless a control structure changes the flow.

### Example: Calculate the area of a rectangle

```java
int length = 8;
int width = 4;
int area;

area = length * width;

System.out.println("Area: " + area);
```

**Output:**

```text
Area: 32
```

The program follows a sequence:

1. Store the length.
2. Store the width.
3. Calculate the area.
4. Display the result.

Use sequence when instructions must execute in a specific order and no decision or repetition is required.

## 5. Selection: Making Decisions

Selection allows a program to choose which instructions to execute.

### 5.1 Use `if` for a single condition

Use an `if` statement when an action should happen only if a condition is true.

```java
int mark = 75;

if (mark >= 50)
{
    System.out.println("Pass");
}
```

**Output:**

```text
Pass
```

If the mark is below 50, the message is not displayed.

### 5.2 Use `if-else` for two alternatives

Use `if-else` when one action should occur if a condition is true and another action should occur if it is false.

```java
int mark = 42;

if (mark >= 50)
{
    System.out.println("Pass");
}
else
{
    System.out.println("Fail");
}
```

**Output:**

```text
Fail
```

Exactly one of the two branches executes.

### 5.3 Use `else-if` for multiple conditions

An `else-if` structure is appropriate when several conditions must be checked in order.

```java
int mark = 78;

if (mark >= 80)
{
    System.out.println("Distinction");
}
else if (mark >= 70)
{
    System.out.println("Good result");
}
else if (mark >= 50)
{
    System.out.println("Pass");
}
else
{
    System.out.println("Fail");
}
```

**Output:**

```text
Good result
```

The order of the conditions matters. Once a condition is true, Java executes its block and skips the remaining branches.

### 5.4 Use `switch` for discrete choices

A `switch` statement is useful when one expression is compared with several specific values.

```java
int choice = 2;

switch (choice)
{
    case 1:
        System.out.println("Start");
        break;

    case 2:
        System.out.println("Settings");
        break;

    case 3:
        System.out.println("Exit");
        break;

    default:
        System.out.println("Invalid choice");
}
```

**Output:**

```text
Settings
```

Use `switch` when the alternatives are specific values, such as menu choices. Use `if-else` when the decision depends on ranges or more complex Boolean conditions.

## 6. Iteration: Repeating Instructions

Iteration allows instructions to execute repeatedly.

The correct loop depends on whether the number of repetitions is known and whether the loop body must execute at least once.

### 6.1 Use `for` when the repetition count is known

```java
for (int count = 1; count <= 5; count++)
{
    System.out.println(count);
}
```

**Output:**

```text
1
2
3
4
5
```

A `for` loop is often a suitable choice when counting through a defined range.

### 6.2 Use `while` when the condition is checked first

```java
int count = 1;

while (count <= 3)
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
```

The condition is checked before each iteration. If it is false initially, the loop body does not execute.

### 6.3 Use `do-while` when the body must execute at least once

```java
int count = 1;

do
{
    System.out.println(count);
    count++;
}
while (count <= 3);
```

**Output:**

```text
1
2
3
```

The condition is checked after the loop body executes.

## 7. Comparing the Control Structures

| Structure | Purpose | Choose it when |
|---|---|---|
| Sequence | Execute instructions in order | Every instruction must execute in a defined order. |
| `if` | Make a single decision | An action is needed only when a condition is true. |
| `if-else` | Choose between alternatives | One of two outcomes must be selected. |
| `else-if` | Choose among multiple conditions | Several conditions or ranges must be evaluated. |
| `switch` | Select from discrete choices | One expression is compared with specific values. |
| `for` | Repeat instructions | A counter or defined range controls repetition. |
| `while` | Repeat while a condition is true | The condition must be checked before each iteration. |
| `do-while` | Repeat after executing the body | The body must execute at least once. |
| Nested selection | Make a decision inside another decision | A second decision depends on the first. |
| Nested loops | Repeat a process inside another loop | Repetition is required within repetition. |

These are guidelines, not absolute rules. More than one structure may solve the same problem correctly.

## 8. Combining Selection and Iteration

Real programs often use more than one control structure.

For example, a loop can repeat a calculation while an `if` statement determines how each value should be processed.

### Example: Count positive numbers

```java
int count = 1;
int positiveCount = 0;

while (count <= 5)
{
    int number = count * 2;

    if (number > 0)
    {
        positiveCount++;
    }

    count++;
}

System.out.println("Positive values: " + positiveCount);
```

**Output:**

```text
Positive values: 5
```

The `while` loop repeats five times. During each iteration, the `if` statement checks whether the calculated number is positive.

The loop controls repetition, while the selection statement controls the decision.

## 9. Example: A Menu-Driven Program

A menu-driven program demonstrates how selection and iteration can work together.

The menu should be displayed repeatedly until the user chooses to exit.

```java
import javax.swing.JOptionPane;

public class MenuExample
{
    public static void main(String[] args)
    {
        int choice;

        do
        {
            String menu = "1 - Display a greeting\n"
                + "2 - Display a message\n"
                + "3 - Exit";

            choice = Integer.parseInt(
                JOptionPane.showInputDialog(menu)
            );

            switch (choice)
            {
                case 1:
                    JOptionPane.showMessageDialog(
                        null,
                        "Hello!"
                    );
                    break;

                case 2:
                    JOptionPane.showMessageDialog(
                        null,
                        "Welcome to Java."
                    );
                    break;

                case 3:
                    JOptionPane.showMessageDialog(
                        null,
                        "Goodbye!"
                    );
                    break;

                default:
                    JOptionPane.showMessageDialog(
                        null,
                        "Invalid choice."
                    );
            }
        }
        while (choice != 3);
    }
}
```

### How the program works

1. The `do-while` loop displays the menu at least once.
2. The user enters a menu choice.
3. The `switch` statement determines which action to perform.
4. The `break` statements prevent execution from continuing into the next case.
5. The loop checks whether the user selected option 3.
6. If the choice is not 3, the menu appears again.

This example assumes the user enters an integer. Non-numeric input and cancellation of the input dialog are not handled.

## 10. A Step-by-Step Decision Process

When solving a programming question, use the following process.

### Step 1: Identify the task

Determine what the program must accomplish.

For example: calculate a total, display a message, validate input or repeat a calculation.

### Step 2: Identify the decisions

Ask whether the program must choose between different outcomes.

If it must, determine whether an `if`, `if-else`, `else-if` or `switch` statement is appropriate.

### Step 3: Identify the repetition

Ask whether any instructions must execute more than once.

If repetition is required, determine:
- Whether the number of repetitions is known.
- Whether the condition must be checked before the body.
- Whether the body must execute at least once.

### Step 4: Select the structure

Choose the simplest structure that meets the requirements.

### Step 5: Trace the algorithm

Follow the values of the variables and determine which statements execute.

### Step 6: Test the program

Use suitable test values and confirm that the program produces the expected results.

## 11. Common Mistakes

### Mistake 1: Using separate `if` statements instead of an `else-if` structure

If several independent `if` statements are used, more than one block may execute.

When the conditions represent mutually exclusive alternatives, an `if-else` or `else-if` structure may be more appropriate.

### Mistake 2: Using `switch` for a range

A `switch` statement is suited to discrete case values. When checking a range such as `mark >= 50`, an `if-else` structure is generally more suitable.

### Mistake 3: Choosing the wrong loop

A `while` loop may execute zero times, whereas a `do-while` loop executes at least once.

Consider this distinction carefully when the problem requires an initial prompt or menu.

### Mistake 4: Forgetting to update a loop variable

A loop that never reaches its stopping condition may continue indefinitely.

Check that the controlling variable changes appropriately during each iteration.

### Mistake 5: Incorrect condition order

In an `else-if` structure, a broad condition placed before a more specific condition may prevent the specific condition from being reached.

For example, if `mark >= 50` is checked before `mark >= 80`, a mark of 85 will match the first condition and never reach the distinction condition.

### Mistake 6: Forgetting `break` in a traditional `switch`

Without a `break`, execution can continue into subsequent case blocks. Include `break` where the program should stop processing the current case.

## 12. Testing and Debugging

When testing a program that combines control structures, check each decision and repetition process separately.

Ask yourself:

- Does every condition produce the correct outcome?
- Are the boundaries of ranges handled correctly?
- Does the correct `switch` case execute?
- Does each loop execute the correct number of times?
- Does the loop terminate?
- Are nested structures executed in the correct order?
- Does the output match the requirements?

For a program that classifies marks, test values below, at and above each boundary. For a menu, test every valid option and at least one invalid choice.

Trace tables can help you follow changes to variables and determine which branch or loop executes.

## 13. Practical Challenge

Create a Java program that allows a user to calculate the total of a sequence of positive whole numbers.

### Requirements

1. Display a menu using `JOptionPane`.
2. Provide these options:
   - 1 – Calculate a total.
   - 2 – Display instructions.
   - 3 – Exit.
3. Use a `do-while` loop to display the menu repeatedly.
4. Use a `switch` statement to process the menu choice.
5. For option 1, ask the user for five whole numbers and calculate their total using a loop.
6. For option 2, display a short explanation of how the program works.
7. For option 3, display a goodbye message.
8. Display an error message for an invalid menu choice.

### Hints

- Use `do-while` for the menu.
- Use `switch` for the menu options.
- Use a `for` loop to request five numbers.
- Use an accumulator to calculate the total.
- Use meaningful variable names.

### Extension challenge

Add a selection statement inside the number-processing loop to count how many of the five numbers are positive.

Test each menu option and check the total using a manual calculation.

## 14. Key Takeaways

- Sequence executes instructions in order.
- Selection allows a program to make decisions.
- Iteration allows a program to repeat instructions.
- `if`, `if-else`, `else-if` and `switch` serve different decision-making purposes.
- `for`, `while` and `do-while` provide different ways to control repetition.
- Selection and iteration can be combined to solve more complex problems.
- The best control structure is the one that correctly and clearly meets the requirements.
- Tracing, testing and debugging are essential parts of programming.

## 15. Navigation

- [Grade 10 Java Code Library](../../README.md)
- [Previous: Nested Loops](../Nested-Loops/README.md)
- **Current: Choosing the Right Control Structure**
- [Back to Selection and Loops](../README.md)
- [Next main topic: Methods and Existing Classes](../../08-Methods-and-Existing-Classes/README.md)
