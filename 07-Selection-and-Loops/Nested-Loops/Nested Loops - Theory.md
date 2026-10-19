# Nested Loops

## 1. Overview

A **nested loop** is a loop placed inside another loop. The outer loop controls the overall repetition, while the inner loop executes its instructions each time the outer loop runs.

Nested loops are useful when a problem requires repetition within repetition.

Examples include:

- Displaying patterns of stars or numbers.
- Printing tables of values.
- Repeating an operation for every row and column.
- Generating multiplication tables.
- Solving problems that require two counters.

In Grade 10 Java programming, nested loops help you develop a deeper understanding of iteration, algorithm design and tracing program execution.

## 2. Learning Objectives

By the end of this topic, you should be able to:

- Explain what a nested loop is.
- Identify the outer and inner loops.
- Write nested `for` loops.
- Use nested `while` loops where appropriate.
- Display patterns using nested loops.
- Calculate how many times statements inside nested loops execute.
- Trace nested loops using tables.
- Identify and correct common nested-loop errors.

## 3. IEB Curriculum Alignment

This topic supports Grade 10 IEB Information Technology programming requirements relating to:

- Iteration using `for` and `while` loops.
- Counters and condition-controlled repetition.
- Algorithm development and problem-solving.
- Tracing program execution.
- Testing and debugging.
- Developing logical solutions to programming problems.

Nested loops should be used where the problem requires one repetition process to occur inside another.

## 4. Understanding Nested Loops

### 4.1 Basic structure

Consider the following example:

```java
for (int row = 1; row <= 3; row++)
{
    for (int column = 1; column <= 2; column++)
    {
        System.out.println("Row: " + row
            + ", Column: " + column);
    }
}
```

The first loop is the **outer loop**. It controls the variable `row`.

The second loop is the **inner loop**. It controls the variable `column`.

For every value of `row`, the inner loop runs from beginning to end.

### 4.2 Output

```text
Row: 1, Column: 1
Row: 1, Column: 2
Row: 2, Column: 1
Row: 2, Column: 2
Row: 3, Column: 1
Row: 3, Column: 2
```

Notice that the inner loop completes both iterations before the outer loop moves to the next row.

### 4.3 How the loops execute

The execution order is:

1. The outer loop starts with `row = 1`.
2. The inner loop starts with `column = 1`.
3. The inner loop executes while its condition is true.
4. When the inner loop finishes, the outer loop updates `row`.
5. The inner loop starts again from its initial value.
6. The process continues until the outer loop condition becomes false.

**Important:** The inner loop normally starts from its initial value every time the outer loop begins a new iteration.

## 5. Nested `for` Loops

Nested `for` loops are particularly useful when the number of repetitions is known.

### Example 1: Display a rectangle of stars

The following program displays three rows of four stars.

```java
for (int row = 1; row <= 3; row++)
{
    for (int column = 1; column <= 4; column++)
    {
        System.out.print("* ");
    }

    System.out.println();
}
```

**Output:**

```text
* * * *
* * * *
* * * *
```

The outer loop controls the three rows.

The inner loop prints four stars on each row. After the inner loop finishes, `System.out.println();` moves the cursor to the next line.

### Example 2: Display a number pattern

```java
for (int row = 1; row <= 4; row++)
{
    for (int column = 1; column <= row; column++)
    {
        System.out.print(row + " ");
    }

    System.out.println();
}
```

**Output:**

```text
1
2 2
3 3 3
4 4 4 4
```

The inner loop condition is `column <= row`.

This means the number of repetitions in the inner loop depends on the current value of `row`.

- Row 1 prints the number once.
- Row 2 prints the number twice.
- Row 3 prints the number three times.
- Row 4 prints the number four times.

### Example 3: Display a multiplication table

```java
for (int row = 1; row <= 3; row++)
{
    for (int column = 1; column <= 5; column++)
    {
        System.out.println(
            row + " x " + column + " = " + (row * column)
        );
    }

    System.out.println();
}
```

**Output:**

```text
1 x 1 = 1
1 x 2 = 2
1 x 3 = 3
1 x 4 = 4
1 x 5 = 5

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10

3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
```

The outer loop selects the number being multiplied. The inner loop multiplies it by the numbers from 1 to 5.

## 6. Understanding the Total Number of Iterations

When the number of inner-loop iterations is constant, the total number of executions can be calculated by multiplying the number of outer-loop iterations by the number of inner-loop iterations.

Consider:

```java
for (int row = 1; row <= 4; row++)
{
    for (int column = 1; column <= 3; column++)
    {
        System.out.println("Hello");
    }
}
```

The outer loop executes 4 times.

The inner loop executes 3 times for each outer-loop iteration.

Therefore:

\[
4 \times 3 = 12
\]

The statement `System.out.println("Hello");` executes **12 times**.

This multiplication method applies when the inner loop executes the same number of times for every outer-loop iteration.

If the inner-loop condition depends on the outer-loop variable, as in `column <= row`, the number of inner iterations changes. In such cases, calculate the total by considering each outer-loop iteration separately.

## 7. Nested `while` Loops

Nested loops do not have to use `for` loops. A `while` loop can also contain another `while` loop.

### Example: Display a rectangle of stars

```java
int row = 1;

while (row <= 3)
{
    int column = 1;

    while (column <= 4)
    {
        System.out.print("* ");
        column++;
    }

    System.out.println();
    row++;
}
```

**Output:**

```text
* * * *
* * * *
* * * *
```

Notice that `column` is initialised to 1 inside the outer loop.

This is important because the inner loop must start again for every new row. If `column` were initialised only before the outer loop, it would retain its final value after the first row and the inner loop would not run again.

## 8. Tracing Nested Loops

Tracing nested loops requires you to follow the values of both the outer and inner loop variables.

Consider:

```java
for (int row = 1; row <= 2; row++)
{
    for (int column = 1; column <= 3; column++)
    {
        System.out.println(row + " " + column);
    }
}
```

### Trace table

| Execution | `row` | `column` | Output |
|---|---:|---:|---|
| 1 | 1 | 1 | `1 1` |
| 2 | 1 | 2 | `1 2` |
| 3 | 1 | 3 | `1 3` |
| 4 | 2 | 1 | `2 1` |
| 5 | 2 | 2 | `2 2` |
| 6 | 2 | 3 | `2 3` |

After the inner loop finishes its third iteration, it ends. The outer loop then increases `row` to 2, and the inner loop starts again with `column = 1`.

**Exam tip:** When tracing nested loops, do not increase the outer-loop variable after every inner-loop iteration. The outer loop only advances after the inner loop has finished.

## 9. Common Mistakes

### Mistake 1: Forgetting to update the inner-loop counter

Incorrect:

```java
int row = 1;

while (row <= 3)
{
    int column = 1;

    while (column <= 4)
    {
        System.out.print("* ");
    }

    row++;
}
```

The inner-loop counter never changes, so the inner loop does not terminate.

Correct:

```java
int row = 1;

while (row <= 3)
{
    int column = 1;

    while (column <= 4)
    {
        System.out.print("* ");
        column++;
    }

    row++;
}
```

### Mistake 2: Initialising the inner counter outside the outer loop

Incorrect:

```java
int column = 1;

for (int row = 1; row <= 3; row++)
{
    while (column <= 4)
    {
        System.out.print("* ");
        column++;
    }

    System.out.println();
}
```

The inner loop finishes during the first outer-loop iteration. The value of `column` is then 5, so the inner condition is false for the remaining rows.

Correct:

```java
for (int row = 1; row <= 3; row++)
{
    int column = 1;

    while (column <= 4)
    {
        System.out.print("* ");
        column++;
    }

    System.out.println();
}
```

### Mistake 3: Using `print` instead of `println` incorrectly

- `System.out.print()` displays output without moving to a new line.
- `System.out.println()` displays output and then moves to a new line.

When creating patterns, use `print()` inside the inner loop and `println()` after the inner loop to finish each row.

### Mistake 4: Using the wrong loop condition

```java
for (int column = 1; column < 4; column++)
```

This executes three times, with values 1, 2 and 3.

If you need four iterations, use:

```java
for (int column = 1; column <= 4; column++)
```

Pay close attention to the difference between `<` and `<=`.

### Mistake 5: Assuming the inner loop runs only once

The inner loop executes fully during every outer-loop iteration, unless its condition prevents it from doing so.

Always count the inner iterations for each outer iteration before determining the total number of executions.

## 10. Testing and Debugging

When testing nested loops, ask yourself:

- Does the outer loop execute the correct number of times?
- Does the inner loop execute the correct number of times for each outer iteration?
- Are both counters initialised correctly?
- Are both counters updated appropriately?
- Does the inner loop restart correctly?
- Is the output arranged in the required rows and columns?
- Can either loop continue indefinitely?

For a pattern-printing program, test a small number of rows and columns first. Compare the output with the expected pattern before increasing the dimensions.

Trace tables are especially useful when the inner loop depends on the outer-loop variable.

## 11. Practical Challenge

Create a Java program that displays a right-angled triangle of stars.

### Requirements

1. Use an outer loop to control the rows.
2. Use an inner loop to control the number of stars in each row.
3. Display five rows.
4. The first row must contain one star, the second row two stars, and so on.
5. Use appropriate loop counters.
6. Ensure that each row starts on a new line.

### Expected output

```text
*
* *
* * *
* * * *
* * * * *
```

### Hints

- Initialise the outer counter to 1.
- Continue while the outer counter is less than or equal to 5.
- Use the outer counter to determine how many stars to print in each row.
- Use `System.out.print("* ");` inside the inner loop.
- Use `System.out.println();` after the inner loop.

### Extension challenge

Modify your program to display the following pattern:

```text
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

Then modify it again to display a multiplication table from 1 to 10.

## 12. Key Takeaways

- A nested loop is a loop inside another loop.
- The outer loop controls the overall repetition.
- The inner loop completes its iterations before the outer loop advances.
- The inner counter must be reset appropriately when using `while` loops.
- Nested loops can be used to create patterns, tables and repeated calculations.
- When the inner loop has a fixed number of iterations, multiply the outer and inner iteration counts to determine the total.
- When the inner loop depends on the outer variable, calculate the iterations separately for each outer iteration.
- Trace tables help you follow the execution of nested loops.
- Always check initialisation, conditions and updates to prevent incorrect output or infinite loops.

## 13. Navigation

- [Grade 10 Java Code Library](../../README.md)
- [Previous: Counting and Condition-Controlled Loops](../Counting-and-Condition-Controlled-Loops/README.md)
- **Current: Nested Loops**
- [Next: Choosing the Right Control Structure](../Choosing-the-Right-Control-Structure/README.md)
- [Back to Selection and Loops](../README.md)
