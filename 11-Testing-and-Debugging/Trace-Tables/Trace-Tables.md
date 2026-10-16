# Trace Tables

## Overview

A trace table is a tool used to follow an algorithm step by step and record how the values of variables change during execution.

When a Java program runs, variables may be updated repeatedly through calculations, selection statements and loops. A trace table helps you understand these changes and determine the final output without necessarily running the program.

Trace tables are particularly useful when studying algorithms, testing programs and identifying logical errors.

In Grade 10 Information Technology, you should be able to trace simple Java code, record variable values in the correct order and determine the output produced by an algorithm.

## Learning Objectives

By the end of this section, you should be able to:

- Explain the purpose of a trace table.
- Identify the variables that need to be tracked.
- Record variable values as statements execute.
- Trace calculations and assignment statements.
- Trace `if`, `if-else` and loop structures.
- Determine the output of a Java program.
- Use trace tables to identify logical errors.

---

## 1. What Is a Trace Table?

A trace table is a table that records how variables change while a program executes.

Consider this code:

```java
int number = 5;
int total = number + 3;

System.out.println(total);
```

The variable `number` is assigned the value `5`. The next statement calculates `number + 3` and stores the result in `total`.

The trace table is:

| Statement | `number` | `total` |
|---|---:|---:|
| `int number = 5;` | 5 | — |
| `int total = number + 3;` | 5 | 8 |

Output:

```text
8
```

The dash indicates that `total` has not yet been assigned a value at that stage.

A trace table helps you follow the execution of each statement and understand how the final result is produced.

## 2. Tracing Variable Assignment

An assignment statement stores a value in a variable.

Consider the following program:

```java
int number = 10;
number = number + 5;
number = number * 2;

System.out.println(number);
```

Work through the statements in order.

1. `number` is assigned `10`.
2. `number + 5` is calculated, giving `15`.
3. The value `15` is multiplied by `2`, giving `30`.

Trace table:

| Statement | `number` |
|---|---:|
| `int number = 10;` | 10 |
| `number = number + 5;` | 15 |
| `number = number * 2;` | 30 |

Output:

```text
30
```

**Important:** The equals sign in an assignment statement does not mean that the value on the right must be the same as the original value of the variable. Java calculates the right-hand expression first and then assigns the result to the variable.

For example:

```java
number = number + 5;
```

means that the current value of `number` is increased by 5.

## 3. Tracing Calculations

Trace tables can be used to follow calculations involving several variables.

Consider this program:

```java
int firstNumber = 8;
int secondNumber = 3;

int total = firstNumber + secondNumber;
int difference = firstNumber - secondNumber;
int product = firstNumber * secondNumber;

System.out.println(total);
System.out.println(difference);
System.out.println(product);
```

Trace table:

| Statement | `firstNumber` | `secondNumber` | `total` | `difference` | `product` |
|---|---:|---:|---:|---:|---:|
| First assignment | 8 | — | — | — | — |
| Second assignment | 8 | 3 | — | — | — |
| Calculate total | 8 | 3 | 11 | — | — |
| Calculate difference | 8 | 3 | 11 | 5 | — |
| Calculate product | 8 | 3 | 11 | 5 | 24 |

Output:

```text
11
5
24
```

Each variable stores its own value. Calculating `difference` does not change `firstNumber` or `secondNumber`.

## 4. Tracing If Statements

A trace table can help you determine which branch of a selection statement executes.

Consider the following code:

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

The condition is:

```java
mark >= 50
```

Substituting the value of `mark` gives:

```text
65 >= 50
```

This condition is `true`, so the first branch executes.

Trace table:

| Variable | Value |
|---|---:|
| `mark` | 65 |
| Condition `mark >= 50` | `true` |
| Output | `Pass` |

Output:

```text
Pass
```

### Example: A failing mark

If `mark` is changed to `35`, the condition becomes false.

| Variable | Value |
|---|---:|
| `mark` | 35 |
| Condition `mark >= 50` | `false` |
| Output | `Fail` |

A trace table makes it easier to follow the decision made by the program.

## 5. Tracing For Loops

Loops require careful tracing because variables can change repeatedly.

Consider this code:

```java
int total = 0;

for (int count = 1; count <= 4; count++)
{
    total = total + count;
}

System.out.println(total);
```

The loop starts with `count = 1` and continues while `count <= 4`.

During each iteration, the current value of `count` is added to `total`.

### Step-by-step trace

| Iteration | `count` | `total` before addition | `total` after addition |
|---:|---:|---:|---:|
| Initial | — | — | 0 |
| 1 | 1 | 0 | 1 |
| 2 | 2 | 1 | 3 |
| 3 | 3 | 3 | 6 |
| 4 | 4 | 6 | 10 |

After the fourth iteration, `count` increases to `5`. The condition `count <= 4` is now false, so the loop ends.

Output:

```text
10
```

The program calculates:

\[
1+2+3+4=10
\]

**Important:** The loop counter changes after each iteration. When tracing a loop, remember to check the condition again after the update.

## 6. Tracing While Loops

A `while` loop checks its condition before executing the loop body.

Consider the following code:

```java
int number = 3;

while (number > 0)
{
    System.out.println(number);
    number = number - 1;
}
```

The loop continues while `number` is greater than zero.

Trace table:

| Iteration | `number` before output | Condition | Output | `number` after update |
|---:|---:|---|---:|---:|
| 1 | 3 | `true` | 3 | 2 |
| 2 | 2 | `true` | 2 | 1 |
| 3 | 1 | `true` | 1 | 0 |
| End | 0 | `false` | — | 0 |

Output:

```text
3
2
1
```

When `number` becomes zero, the condition is false and the loop ends.

Notice that the value `0` is not displayed because the condition is checked before the body executes.

## 7. Tracing Nested Selection and Loops

A trace table can also help you follow code containing more than one control structure.

Consider this example:

```java
for (int count = 1; count <= 3; count++)
{
    if (count % 2 == 0)
    {
        System.out.println("Even");
    }
    else
    {
        System.out.println("Odd");
    }
}
```

The loop processes the values `1`, `2` and `3`. The selection statement determines whether each value is even or odd.

Trace table:

| `count` | `count % 2` | Condition `count % 2 == 0` | Output |
|---:|---:|---|---|
| 1 | 1 | `false` | Odd |
| 2 | 0 | `true` | Even |
| 3 | 1 | `false` | Odd |

Output:

```text
Odd
Even
Odd
```

This example demonstrates how a trace table can record both the loop counter and the outcome of a condition.

## 8. How to Construct a Trace Table

Follow this procedure when tracing Java code.

1. Read the code carefully before starting.
2. Identify the variables that are declared.
3. Create a column for each variable that needs to be tracked.
4. Follow the statements in the order they execute.
5. Record each variable's value when it changes.
6. Evaluate conditions as `true` or `false`.
7. Record output whenever a display statement executes.
8. For loops, record each iteration separately.
9. Check the final values and output.

You do not need to create a separate row for every statement if a shorter table clearly records all the relevant changes. The important requirement is that the table accurately reflects the execution of the code.

## 9. Common Mistakes

### Mistake 1: Recording the wrong variable value

When a statement updates a variable, the new value replaces the previous value.

**Improvement:** Calculate the expression using the current values before recording the new value.

### Mistake 2: Skipping a loop iteration

A loop may execute several times, and each iteration can change multiple variables.

**Improvement:** Record each iteration separately.

### Mistake 3: Forgetting to evaluate the condition

A selection statement executes a branch only when its condition is satisfied.

**Improvement:** Evaluate each condition using the current variable values.

### Mistake 4: Forgetting the loop update

In a `for` loop, the update expression executes after the loop body. In a `while` loop, the update usually appears in the loop body.

**Improvement:** Follow the exact execution order of the statements.

### Mistake 5: Recording output incorrectly

A variable's value is not automatically displayed. Output occurs only when an appropriate output statement executes.

**Improvement:** Record output separately from variable values.

### Mistake 6: Stopping the loop too early

A loop condition is checked at specific points during execution.

**Improvement:** Check the condition before each iteration and after any required updates.

---

## 10. Practical Challenge

Study the following Java program.

```java
int number = 2;
int total = 0;

for (int count = 1; count <= 4; count++)
{
    total = total + number;
    number = number + 1;
}

System.out.println(total);
System.out.println(number);
```

Create a trace table containing the following columns:

- `count`
- `number` before the loop body
- `total` before the loop body
- `total` after the calculation
- `number` after the calculation

Answer these questions:

1. What is the value of `total` after the first iteration?
2. What is the value of `number` after the third iteration?
3. How many times does the loop execute?
4. What is the final value of `total`?
5. What is the final value of `number`?
6. What output does the program display?

### Extension challenge

Change the loop condition to:

```java
count < 4
```

Create a new trace table and explain how the final output changes.

---

## Key Takeaways

- A trace table records how variable values change during program execution.
- Assignment statements can replace the previous value stored in a variable.
- Conditions must be evaluated using the current values.
- Loops require a separate record for each iteration.
- Output statements should be traced when they execute.
- Trace tables can help identify logical errors and explain algorithm behaviour.
- Following the exact execution order is essential for an accurate trace.

---

## Navigation

- [Previous: Test Cases and Expected Results](../Test-Cases-and-Expected-Results/README.md)
- [Next: Syntax, Runtime and Logic Errors](../Syntax-Runtime-and-Logic-Errors/README.md)
- [Back to Testing and Debugging](../README.md)
- [Back to Grade 10 Java](../../README.md)
