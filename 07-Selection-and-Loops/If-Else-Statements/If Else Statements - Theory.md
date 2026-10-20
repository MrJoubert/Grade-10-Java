# If-Else Statements in Java

## Overview

An `if-else` statement allows a Java program to choose between two alternative actions, depending on whether a condition is true or false.

An `if` statement executes a block of code only when its condition is true. An `if-else` statement goes further by providing an alternative block that executes when the condition is false.

For example, a program that determines whether a student has passed or failed must display an appropriate result regardless of the mark entered. An `if-else` statement is ideal for this situation.

Understanding `if-else` statements is essential for developing programs that respond to different inputs and make decisions based on specified conditions.

## Learning Objectives

By the end of this topic, you should be able to:

- Explain the purpose of an `if-else` statement.
- Identify the difference between `if` and `if-else`.
- Write the correct syntax for an `if-else` statement.
- Construct conditions using relational operators.
- Use logical operators to combine conditions.
- Trace the execution of an `if-else` statement.
- Apply selection to solve programming problems.
- Identify common errors in conditional statements.
- Test both possible outcomes of a condition.

## IEB Curriculum Alignment

This topic supports Grade 10 IEB Information Technology programming requirements involving selection statements, Boolean expressions, relational operators and algorithm development.

The examples use introductory Java concepts and are intended to develop your understanding of decision-making in programs. This resource is for student learning and is not an official IEB publication.

## 1. What Is an If-Else Statement?

An `if-else` statement allows a program to execute one block of code when a condition is true and a different block when the condition is false.

Consider this example:

```java
int mark = 65;

if (mark >= 50) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

Output:

```text
Pass
```

The condition `mark >= 50` is true because `65` is greater than or equal to `50`. Therefore, Java executes the first block and skips the `else` block.

Now consider the same program with a different mark:

```java
int mark = 35;

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

The condition is false, so Java executes the `else` block instead.

**Important:** Exactly one of the two blocks executes when an `if-else` statement is reached and its condition is evaluated normally.

## 2. The Syntax of an If-Else Statement

The general structure is:

```java
if (condition) {
    // Instructions executed if the condition is true
} else {
    // Instructions executed if the condition is false
}
```

Each part has a specific purpose:

- `if` introduces the condition.
- Parentheses `()` enclose the condition.
- The first pair of curly braces encloses the instructions for a true condition.
- `else` introduces the alternative block.
- The second pair of curly braces encloses the instructions for a false condition.

The condition must evaluate to either `true` or `false`.

For example:

```java
int number = 12;

if (number > 10) {
    System.out.println("The number is greater than 10.");
} else {
    System.out.println("The number is 10 or less.");
}
```

Output:

```text
The number is greater than 10.
```

If `number` were `8`, the alternative message would be displayed.

## 3. If Versus If-Else

The main difference is what happens when the condition is false.

### Using an if statement

```java
int temperature = 15;

if (temperature > 20) {
    System.out.println("It is warm.");
}
```

Output:

```text
```

Nothing is displayed because the condition is false.

### Using an if-else statement

```java
int temperature = 15;

if (temperature > 20) {
    System.out.println("It is warm.");
} else {
    System.out.println("It is not warm.");
}
```

Output:

```text
It is not warm.
```

Use an `if` statement when you only need to perform an action if a condition is true.

Use an `if-else` statement when you need to choose between two alternatives.

## 4. Using Relational Operators

Conditions frequently use relational operators to compare values.

| Operator | Meaning | Example |
|---|---|---|
| `==` | Equal to | `number == 10` |
| `!=` | Not equal to | `number != 10` |
| `>` | Greater than | `mark > 50` |
| `<` | Less than | `mark < 50` |
| `>=` | Greater than or equal to | `mark >= 50` |
| `<=` | Less than or equal to | `mark <= 50` |

For example:

```java
int number = 10;

if (number == 10) {
    System.out.println("The number is 10.");
} else {
    System.out.println("The number is not 10.");
}
```

Output:

```text
The number is 10.
```

The equality operator `==` compares two values. It must not be confused with the assignment operator `=`, which stores a value in a variable.

## 5. Using If-Else with User Input

You can combine `JOptionPane`, type conversion and selection to create an interactive program.

Consider a program that determines whether a student has passed.

```java
import javax.swing.JOptionPane;

public class PassOrFail {

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
        } else {
            JOptionPane.showMessageDialog(
                null,
                "You have not passed."
            );
        }
    }
}
```

### How the program works

1. The input dialog asks the user to enter a mark.
2. The entered value is stored as a String.
3. `Integer.parseInt()` converts the String to an integer.
4. The condition checks whether the mark is at least `50`.
5. If the condition is true, the pass message is displayed.
6. Otherwise, the alternative message is displayed.

This example assumes that the user enters a valid whole number. A complete program may also need to validate the mark and handle invalid input.

## 6. Using Logical Operators

Logical operators allow you to combine conditions.

| Operator | Meaning |
|---|---|
| `&&` | AND — both conditions must be true. |
| `||` | OR — at least one condition must be true. |
| `!` | NOT — reverses a Boolean value. |

Suppose a program must determine whether a mark falls within the permitted range of `0` to `100`.

```java
int mark = 85;

if (mark >= 0 && mark <= 100) {
    System.out.println("Valid mark.");
} else {
    System.out.println("Invalid mark.");
}
```

Output:

```text
Valid mark.
```

Both conditions must be true for the mark to be valid.

If the mark were `120`, the second condition would be false, so the program would display `Invalid mark.`

Remember that this example checks the range of an integer already stored in a variable. It does not handle invalid text entered by the user.

## 7. Using If-Else with Calculations

Selection can be used to make decisions based on calculated results.

Consider a program that calculates the total cost of a purchase and applies a discount if the total is at least R500.

```java
double price1 = 250.00;
double price2 = 300.00;

double total = price1 + price2;

if (total >= 500) {
    System.out.println("Discount applies.");
} else {
    System.out.println("No discount applies.");
}
```

Output:

```text
Discount applies.
```

The total is R550, so the condition is true.

Notice the order of execution:

1. The prices are stored.
2. The total is calculated.
3. The condition is evaluated.
4. The appropriate message is displayed.

The calculation must occur before the program can determine whether the discount applies.

## 8. If-Else with Boolean Variables

A Boolean variable stores either `true` or `false`.

You can use the variable directly as the condition of an `if-else` statement.

```java
boolean isRegistered = false;

if (isRegistered) {
    System.out.println("Registration confirmed.");
} else {
    System.out.println("Registration is required.");
}
```

Output:

```text
Registration is required.
```

Because `isRegistered` contains `false`, the `else` block executes.

You do not need to write `isRegistered == true` when checking whether a Boolean variable is true. Using the variable directly is simpler and easier to read.

## 9. Understanding the Execution Flow

Consider this example:

```java
int number = 7;

System.out.println("Start");

if (number >= 10) {
    System.out.println("Ten or more.");
} else {
    System.out.println("Less than ten.");
}

System.out.println("End");
```

Output:

```text
Start
Less than ten.
End
```

Java executes the statements in order:

1. Displays `Start`.
2. Evaluates `number >= 10`.
3. The condition is false, so it executes the `else` block.
4. Displays `End`.

The `if-else` statement selects one of its two blocks. The program then continues with the instructions after the selection statement.

## 10. Common Mistakes

### Mistake 1: Using assignment instead of comparison

Incorrect:

```java
if (number = 10) {
    System.out.println("Ten");
} else {
    System.out.println("Not ten");
}
```

Correct:

```java
if (number == 10) {
    System.out.println("Ten");
} else {
    System.out.println("Not ten");
}
```

Use `==` to compare values.

### Mistake 2: Placing a semicolon after the condition

Incorrect:

```java
if (mark >= 50);
{
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

Correct:

```java
if (mark >= 50) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

A semicolon immediately after the condition creates an empty statement and disrupts the intended structure.

### Mistake 3: Using the wrong comparison operator

Suppose a mark of exactly `50` must count as a pass.

Incorrect:

```java
if (mark > 50) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

Correct:

```java
if (mark >= 50) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

The `>=` operator includes the boundary value.

### Mistake 4: Reversing the messages

Always check that the true and false outcomes display the correct messages.

For example, if the condition checks whether a mark is at least `50`, the true branch should indicate a pass and the false branch should indicate a result below the pass requirement.

### Mistake 5: Using two separate if statements unnecessarily

Consider:

```java
if (mark >= 50) {
    System.out.println("Pass");
}

if (mark < 50) {
    System.out.println("Fail");
}
```

For this particular example, both statements can work correctly because the conditions are mutually exclusive. However, an `if-else` structure communicates that the program must choose between two alternatives and avoids testing a second condition unnecessarily.

## 11. Testing If-Else Statements

A useful test plan should include inputs that make the condition true and false.

Consider:

```java
if (mark >= 50) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

A suitable test table is:

| Input mark | Condition | Expected output |
|---:|---|---|
| `75` | True | `Pass` |
| `50` | True | `Pass` |
| `49` | False | `Fail` |
| `0` | False | `Fail` |
| `100` | True | `Pass` |

The values `49` and `50` are particularly useful because they test both sides of the pass boundary.

When testing your own programs, predict the expected result before running the code. This helps you identify errors in the logic.

## Practical Challenge

Create a Java program that asks the user to enter a whole number.

Your program must:

1. Use `JOptionPane` to request the number.
2. Convert the input to an integer.
3. Use an `if-else` statement to determine whether the number is even or odd.
4. Display `The number is even.` if the number is divisible by two.
5. Display `The number is odd.` otherwise.

### Extension activities

- Write a program that determines whether a student has passed or failed.
- Write a program that determines whether a number is positive or non-positive.
- Create a program that determines whether a customer qualifies for a discount.
- Use a logical operator to check whether a number is within a specified range.
- Test your programs using values that make the condition true and false.

## Key Takeaways

- An `if-else` statement chooses between two alternative blocks.
- The `if` block executes when the condition is true.
- The `else` block executes when the condition is false.
- Conditions use relational operators and may combine expressions with logical operators.
- `==` compares values, while `=` assigns a value.
- Calculations must be completed before their results can be evaluated.
- Boolean variables can be used directly as conditions.
- Boundary values are important when testing selection statements.
- Correct conditions and clearly organised code help prevent logical errors.

---

## Navigation

- [Previous: If Statements](../If-Statements/README.md)
- **Current topic: If-Else Statements**
- [Next: Nested Selection](../Nested-Selection/README.md)
- [Back to the Grade 10 Java Library](../../README.md)
