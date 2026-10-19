# Nested Selection in Java

## Overview

In Java, selection statements allow a program to make decisions based on conditions. Sometimes, however, one decision depends on the outcome of another decision.

**Nested selection** occurs when one selection statement is placed inside another selection statement. This allows a program to make a decision and then make an additional decision within one of the possible outcomes.

For example, a program might first determine whether a student has passed an assessment. If the student has passed, the program could then determine whether the mark qualifies for a distinction.

Nested selection is useful when a problem involves multiple levels of decision-making. However, the conditions must be arranged carefully to ensure that the program follows the correct logic.

## Learning Objectives

By the end of this topic, you should be able to:

- Explain what nested selection is.
- Identify nested `if` and `if-else` statements.
- Write Java code containing selection statements inside other selection statements.
- Trace the execution of nested conditions.
- Use nested selection to solve practical problems.
- Distinguish between nested selection and consecutive selection statements.
- Identify common errors involving braces, indentation and conditions.
- Test nested selection using appropriate test data.

## IEB Curriculum Alignment

This topic supports Grade 10 IEB Information Technology programming skills involving selection, Boolean expressions, relational operators and algorithm development.

The examples focus on introductory Java selection structures and the logical organisation of multiple decisions. This resource is intended for student learning and is not an official IEB publication.

## 1. What Is Nested Selection?

Nested selection means placing one selection statement inside another.

Consider this example:

```java
int mark = 85;

if (mark >= 50) {
    System.out.println("Pass");

    if (mark >= 75) {
        System.out.println("Distinction");
    }
}
```

Output:

```text
Pass
Distinction
```

The program first checks whether the mark is at least `50`.

- If the condition is false, neither message is displayed.
- If the condition is true, `Pass` is displayed.
- The program then checks whether the mark is at least `75`.
- If that second condition is true, `Distinction` is displayed.

The second `if` statement is nested inside the first `if` statement.

### Understanding the structure

```java
if (outerCondition) {

    // Instructions for the outer condition

    if (innerCondition) {

        // Instructions for the inner condition

    }
}
```

The inner selection statement is reached only if execution enters the outer block.

**Important:** A nested condition is not automatically evaluated simply because it appears in the code. The program must reach that statement during execution.

## 2. Nested If Statements

A nested `if` statement places an `if` statement inside another `if` statement.

Consider a program that checks whether a number is positive and, if it is positive, whether it is even.

```java
int number = 12;

if (number > 0) {

    System.out.println("The number is positive.");

    if (number % 2 == 0) {
        System.out.println("The number is even.");
    }
}
```

Output:

```text
The number is positive.
The number is even.
```

The outer condition checks whether the number is positive.

The inner condition checks whether the remainder after dividing the number by two is zero.

If the number is negative or zero, the inner condition is never reached.

### What happens if the number is 7?

The output is:

```text
The number is positive.
```

The outer condition is true, but the inner condition is false because `7 % 2` produces `1`.

### What happens if the number is -8?

There is no output.

The outer condition is false, so the program skips the entire outer block, including the inner `if` statement.

## 3. Nested If-Else Statements

Nested selection can also contain `if-else` statements.

Consider a program that determines whether a number is positive, negative or zero.

```java
int number = -5;

if (number >= 0) {

    if (number == 0) {
        System.out.println("The number is zero.");
    } else {
        System.out.println("The number is positive.");
    }

} else {
    System.out.println("The number is negative.");
}
```

Output:

```text
The number is negative.
```

The outer selection separates negative numbers from numbers that are zero or positive.

If the number is at least zero, the inner `if-else` determines whether it is zero or positive.

This structure produces three possible outcomes using nested binary selection.

### Trace the possible outcomes

| Number | Outer condition `number >= 0` | Inner condition `number == 0` | Output |
|---:|---|---|---|
| `-5` | False | Not evaluated | Negative |
| `0` | True | True | Zero |
| `8` | True | False | Positive |

The inner condition is evaluated only when the outer condition is true.

## 4. Nested Selection with User Input

Nested selection can be used in interactive Java programs.

Consider a program that asks the user for a mark and determines whether the student has passed. If the student passes, the program checks whether the mark qualifies for a distinction.

```java
import javax.swing.JOptionPane;

public class StudentResult {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(
            "Enter your mark:"
        );

        int mark = Integer.parseInt(input);

        if (mark >= 50) {

            JOptionPane.showMessageDialog(
                null,
                "You have passed."
            );

            if (mark >= 75) {

                JOptionPane.showMessageDialog(
                    null,
                    "You have achieved a distinction."
                );
            }
        } else {

            JOptionPane.showMessageDialog(
                null,
                "You have not passed."
            );
        }
    }
}
```

### Example outcomes

| Mark | Messages displayed |
|---:|---|
| `35` | You have not passed. |
| `60` | You have passed. |
| `85` | You have passed. You have achieved a distinction. |

This example assumes that the user enters a valid whole number. Input validation can be added when the program needs to handle invalid input.

## 5. Nested Selection and Logical Operators

Sometimes a problem can be solved using either nested selection or a compound Boolean condition.

For example, a program might check whether a number is positive and even.

### Using nested selection

```java
int number = 12;

if (number > 0) {

    if (number % 2 == 0) {
        System.out.println("Positive and even.");
    }
}
```

### Using a compound condition

```java
int number = 12;

if (number > 0 && number % 2 == 0) {
    System.out.println("Positive and even.");
}
```

Both examples display:

```text
Positive and even.
```

The compound condition uses `&&`, which requires both conditions to be true.

### When should you use each approach?

Use nested selection when:

- A later decision logically depends on an earlier decision.
- Different instructions must execute at different levels.
- The problem is easier to understand when decisions are separated.

Use a compound condition when:

- Several conditions must all be true for one action to occur.
- A single Boolean expression clearly describes the requirement.

The best structure is the one that expresses the problem's logic clearly and correctly.

## 6. Nested Selection Versus Consecutive If Statements

It is important to distinguish between nested selection and consecutive selection statements.

### Nested selection

```java
int number = 8;

if (number > 0) {

    if (number < 10) {
        System.out.println("The number is between 1 and 9.");
    }
}
```

The inner condition is reached only if the outer condition is true.

### Consecutive selection

```java
int number = 8;

if (number > 0) {
    System.out.println("The number is positive.");
}

if (number < 10) {
    System.out.println("The number is less than 10.");
}
```

Output:

```text
The number is positive.
The number is less than 10.
```

Each `if` statement is evaluated independently. The second statement is not controlled by the first.

This distinction matters when tracing code or predicting output in an examination.

## 7. Understanding Indentation and Braces

Nested selection becomes harder to read when indentation is inconsistent.

Consider the following example:

```java
int mark = 80;

if (mark >= 50) {
    System.out.println("Pass");

    if (mark >= 75) {
        System.out.println("Distinction");
    }
}
```

The indentation shows that:

- The first message belongs to the outer `if` block.
- The second `if` statement belongs to the outer block.
- The distinction message belongs to the inner `if` block.

Java uses curly braces to determine the structure of the program. Indentation does not determine which statements belong to a block, but consistent indentation makes the structure easier to understand.

A missing or misplaced brace can change the intended logic or prevent the program from compiling.

## 8. Common Mistakes

### Mistake 1: Incorrectly placing the inner statement

Incorrect:

```java
if (number > 0) {
    System.out.println("Positive");
}

if (number % 2 == 0) {
    System.out.println("Even");
}
```

This code contains two consecutive `if` statements, not nested selection. The even-number check is performed regardless of whether the number is positive.

If the requirement is to check for evenness only when the number is positive, the second `if` must be inside the first block.

### Mistake 2: Forgetting a closing brace

Incorrectly placed braces can cause statements to execute in the wrong block or result in a compilation error.

Always match each opening brace `{` with its corresponding closing brace `}`.

### Mistake 3: Using the wrong condition

Suppose a distinction requires a mark of at least `75`.

Incorrect:

```java
if (mark > 75) {
    System.out.println("Distinction");
}
```

This excludes a mark of exactly `75`.

Correct:

```java
if (mark >= 75) {
    System.out.println("Distinction");
}
```

### Mistake 4: Assuming the inner condition always executes

The inner selection is evaluated only when execution reaches it.

If the outer condition is false, the inner condition is skipped.

### Mistake 5: Overcomplicating the structure

Too many nested levels can make a program difficult to understand. If a simpler compound condition or a different selection structure expresses the requirements more clearly, consider using it.

## 9. Testing Nested Selection

When testing nested selection, consider both the outer and inner conditions.

For the following code:

```java
int number = 12;

if (number > 0) {

    if (number % 2 == 0) {
        System.out.println("Positive and even.");
    } else {
        System.out.println("Positive and odd.");
    }

} else {
    System.out.println("Not positive.");
}
```

Use this test table:

| Input | Outer condition | Inner condition | Expected output |
|---:|---|---|---|
| `12` | True | True | Positive and even. |
| `7` | True | False | Positive and odd. |
| `-4` | False | Not evaluated | Not positive. |
| `0` | False | Not evaluated | Not positive. |

These tests cover the different paths through the program.

When tracing nested selection, evaluate conditions in execution order and remember that a condition inside a skipped block is not evaluated.

## Practical Challenge

Develop a Java program that asks the user to enter a whole number.

Your program must:

1. Use `JOptionPane` to request the number.
2. Convert the entered value to an integer.
3. Check whether the number is positive.
4. If the number is positive, determine whether it is even or odd.
5. If the number is zero or negative, display an appropriate message.
6. Use nested selection to implement the required decisions.

### Suggested test data

| Input | Expected output |
|---:|---|
| `8` | The number is positive and even. |
| `7` | The number is positive and odd. |
| `-4` | The number is zero or negative. |
| `0` | The number is zero or negative. |

### Extension activities

- Develop a program that determines whether a mark is a pass and, if it is, whether it qualifies for a distinction.
- Write pseudocode for your solution.
- Draw a flowchart showing the nested decisions.
- Rewrite the positive/even example using a compound Boolean condition.
- Compare the two approaches and explain which is clearer for each problem.

## Key Takeaways

- Nested selection occurs when a selection statement is placed inside another selection statement.
- The inner condition is evaluated only when execution reaches it.
- Nested `if` and `if-else` statements can represent multiple levels of decision-making.
- Consecutive `if` statements are not the same as nested selection.
- Logical operators can sometimes replace nested conditions.
- Correct conditions, braces and indentation help make nested selection understandable.
- Testing should cover the different possible execution paths.
- Use the simplest structure that correctly represents the requirements.

---

## Navigation

- [Previous: If-Else Statements](../If-Else-Statements/README.md)
- **Current topic: Nested Selection**
- [Next: Switch Statements](../Switch-Statements/README.md)
- [Back to the Grade 10 Java Library](../../README.md)
