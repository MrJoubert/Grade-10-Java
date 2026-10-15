# Selection and Loops

## Overview

Control structures determine the order in which statements in a program are executed. They allow a program to make decisions, repeat instructions and respond differently to different situations.

Without control structures, a program would generally execute its statements sequentially, from top to bottom. Selection statements allow a program to choose between alternative paths, while loops allow instructions to be repeated.

For example, a program may determine whether a Student has passed an examination, display a different message depending on a mark, or calculate the total of several numbers using repetition.

In Java, the fundamental control structures include `if`, `if-else`, `switch`, `for`, `while` and `do-while`. These structures can also be combined to solve more complex problems.

This topic develops the knowledge required to design, implement, trace and evaluate control structures in introductory Java programs.

The content is intended for **Grade 10 Information Technology Students studying Java according to the IEB curriculum**.

---

## Learning Objectives

By completing this topic, you should be able to:

- Explain the purpose of selection and iteration.
- Use `if` statements to execute code conditionally.
- Use `if-else` statements to select between alternative paths.
- Construct nested selection structures.
- Use `switch` statements to select between multiple alternatives.
- Write `for` loops for repetition.
- Write `while` loops for condition-controlled repetition.
- Write `do-while` loops for repetition that must execute at least once.
- Distinguish between counting-controlled and condition-controlled loops.
- Construct nested loops for problems involving repeated operations.
- Select an appropriate control structure for a given problem.
- Trace the execution of selection statements and loops.
- Identify and correct common control-structure errors.

---

## Curriculum Alignment

This topic supports the Grade 10 Java programming concepts associated with selection, iteration and algorithm construction in the IEB Information Technology Subject Assessment Guidelines (SAGS).

The topic includes:

- `if` and `if-else` statements.
- `switch` and `case` selection.
- `for`, `while` and `do-while` loops.
- Nested selection and nested loops.
- Counting-controlled and condition-controlled repetition.
- Choosing between different control structures.
- Using control structures to implement algorithms.

The focus is on understanding how control structures work, selecting an appropriate structure and applying it correctly to solve programming problems.

**Curriculum note:** This repository is a supplementary learning resource. Students should use these notes alongside prescribed course material, practical activities and official IEB assessment guidance.

---

## Topic Structure

Work through the following ten subtopics in order.

| Subtopic | What You Will Learn |
|---|---|
| [If Statements](If-Statements/README.md) | Execute statements only when a specified condition is true. |
| [If-Else Statements](If-Else-Statements/README.md) | Choose between two alternative execution paths. |
| [Nested Selection](Nested-Selection/README.md) | Place selection statements inside other selection statements. |
| [Switch Statements](Switch-Statements/README.md) | Select between multiple alternatives using a `switch` statement. |
| [For Loops](For-Loops/README.md) | Repeat instructions using initialisation, a condition and an update. |
| [While Loops](While-Loops/README.md) | Repeat instructions while a condition remains true. |
| [Do-While Loops](Do-While-Loops/README.md) | Execute a block at least once before checking the loop condition. |
| [Counting and Condition-Controlled Loops](Counting-and-Condition-Controlled-Loops/README.md) | Compare repetition based on a known count with repetition based on a condition. |
| [Nested Loops](Nested-Loops/README.md) | Place one loop inside another to solve problems involving repeated sequences. |
| [Choosing the Right Control Structure](Choosing-the-Right-Control-Structure/README.md) | Select a suitable selection or iteration structure for a programming problem. |

---

## 1. Selection: Making Decisions

Selection allows a program to choose which statements to execute based on a condition.

The condition is evaluated as either `true` or `false`. The program then follows the appropriate execution path.

### Example: If Statement

```java
int mark = 75;

if (mark >= 50) {
    System.out.println("Pass");
}
```

Output:

```text
Pass
```

The message is displayed because the condition `mark >= 50` evaluates to `true`.

If the mark were `40`, the condition would be false and the message would not be displayed.

### Example: If-Else Statement

```java
int mark = 42;

if (mark >= 50) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

Output:

```text
Fail
```

The `if-else` structure provides two alternative paths. One path executes when the condition is true, and the other executes when it is false.

---

## 2. Selecting Between Multiple Alternatives

Some problems require a program to choose between several possible options.

A `switch` statement is useful when a value is compared against several discrete alternatives.

### Example

```java
int choice = 2;

switch (choice) {
    case 1:
        System.out.println("Add");
        break;
    case 2:
        System.out.println("Subtract");
        break;
    case 3:
        System.out.println("Multiply");
        break;
    default:
        System.out.println("Invalid choice");
        break;
}
```

Output:

```text
Subtract
```

The value of `choice` matches `case 2`, so the corresponding statements execute.

The `break` statements prevent execution from continuing into subsequent cases. The `default` section provides an alternative when no case matches.

The suitability of `switch` compared with `if-else` depends on the problem and the types of conditions being evaluated.

---

## 3. Iteration: Repeating Instructions

Iteration allows a program to repeat a set of statements.

Loops are useful when the same operation must be performed several times, such as displaying a sequence of numbers, processing a series of marks or calculating a running total.

### Example: For Loop

```java
for (int count = 1; count <= 5; count++) {
    System.out.println(count);
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

The loop contains three main components:

1. **Initialisation:** `int count = 1` creates and initialises the counter.
2. **Condition:** `count <= 5` determines whether another iteration should execute.
3. **Update:** `count++` increases the counter after each iteration.

The loop stops when the condition becomes false.

---

## 4. While Loops

A `while` loop repeats a block of statements while its condition remains true.

The condition is evaluated before the loop body executes. If the condition is false initially, the body does not execute.

### Example

```java
int count = 1;

while (count <= 5) {
    System.out.println(count);
    count++;
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

The loop begins by checking whether `count` is less than or equal to `5`. If the condition is true, the number is displayed and the counter is increased.

The loop repeats until the condition becomes false.

**Important:** The counter must be updated correctly. If the condition never becomes false, the loop may continue indefinitely.

---

## 5. Do-While Loops

A `do-while` loop executes its body before checking the condition.

This means that the body always executes at least once, even if the condition is false initially.

### Example

```java
int count = 1;

do {
    System.out.println(count);
    count++;
} while (count <= 5);
```

Output:

```text
1
2
3
4
5
```

Notice the semicolon at the end of the `while` condition. This semicolon is required in a Java `do-while` statement.

A `do-while` loop can be useful when an operation must happen at least once, such as displaying a menu before asking whether the user wants to continue.

---

## 6. Counting-Controlled and Condition-Controlled Loops

Loops can be selected according to how repetition is determined.

A **counting-controlled loop** is appropriate when the number of repetitions is known or can be determined in advance.

For example, displaying the numbers from `1` to `10` is a natural use of a `for` loop.

A **condition-controlled loop** is appropriate when repetition depends on a condition that may change during execution.

For example, a program might continue processing values until a specified condition is met.

Both `while` and `do-while` are commonly used for condition-controlled repetition, although a `for` loop can also be used when repetition depends on a condition.

The correct choice depends on the problem being solved, not merely on personal preference.

---

## 7. Nested Selection and Nested Loops

A nested control structure is one that appears inside another control structure.

### Nested Selection

A selection statement can appear inside another selection statement when a decision depends on the outcome of an earlier decision.

For example, a program might first check whether a Student has passed and then determine a result category for Students who have passed.

Nested selection should be used only when it makes the decision process clearer. Where appropriate, compound Boolean conditions may provide a simpler alternative.

### Nested Loops

A loop can contain another loop.

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

For each iteration of the outer loop, the inner loop completes its two iterations.

Nested loops are useful for problems involving rows and columns, repeated combinations or patterns that require more than one level of repetition.

---

## 8. Common Control-Structure Errors

### Error 1: Using assignment instead of comparison

Incorrect:

```java
if (mark = 50) {
    System.out.println("Mark is 50");
}
```

Correct:

```java
if (mark == 50) {
    System.out.println("Mark is 50");
}
```

The `==` operator compares values for equality. The `=` operator assigns a value.

### Error 2: Forgetting to update a loop counter

A loop that never changes the value used in its condition may run indefinitely.

Check that every loop has a valid way to reach its stopping condition.

### Error 3: Incorrect loop boundaries

A condition such as `count < 5` produces a different number of iterations from `count <= 5`.

Always check whether the starting and ending values should be included.

### Error 4: Placing statements outside the intended block

Use braces to make the body of a selection statement or loop clear and to avoid accidentally including or excluding statements.

### Error 5: Incorrectly structured switch cases

Check that each case has the intended statements and that `break` is used appropriately when fall-through is not intended.

### Error 6: Confusing while and do-while

A `while` loop checks its condition before executing the body. A `do-while` loop checks the condition after executing the body.

Choose the structure that matches the problem's requirements.

---

## 9. Recommended Study Approach

For each subtopic:

1. Understand the purpose of the control structure.
2. Identify the condition that controls execution.
3. Trace the program one statement at a time.
4. Predict the output before running the code.
5. Test conditions that are both true and false.
6. Check loop initialisation, condition and update.
7. Use trace tables to record changes in variables during execution.
8. Explain why the program follows a particular execution path.

Tracing code manually is an important skill. It helps you understand the program's behaviour and identify errors before running the code.

---

## 10. Practical Challenge

Create a Java program called `ControlStructuresPractice` that:

1. Uses an `if-else` statement to determine whether a mark is a pass or a fail.
2. Uses a `switch` statement to display a message based on a menu choice.
3. Uses a `for` loop to display the numbers from `1` to `10`.
4. Uses a `while` loop to calculate the sum of the numbers from `1` to `5`.
5. Uses a `do-while` loop to display a message at least once.
6. Uses a nested loop to display a small pattern or sequence.

Test each section separately before combining the code into one program.

**Extension:** Explain why a `do-while` loop is suitable for displaying a menu at least once, and compare it with a `while` loop.

---

## 11. Key Takeaways

By the end of this topic, you should understand that:

- Selection statements allow programs to make decisions.
- `if` and `if-else` handle conditional execution.
- `switch` provides a structure for selecting between multiple alternatives.
- Loops repeat instructions while their stopping conditions permit.
- `for`, `while` and `do-while` loops differ in their structure and behaviour.
- Counting-controlled and condition-controlled repetition serve different purposes.
- Nested control structures allow more complex algorithms to be developed.
- Correct conditions, boundaries and updates are essential for reliable program execution.
- Tracing code helps you understand and debug control structures.

Selection and iteration are among the most important foundations of algorithm development. They allow programs to respond to different situations and solve problems that require repeated processing.

---

## Navigation

[**← Previous: Boolean Logic**](../06-Boolean-Logic/README.md)

[**Next: Methods and Existing Classes →**](../08-Methods-and-Existing-Classes/README.md)

[Return to the Grade 10 Java repository](../README.md)
