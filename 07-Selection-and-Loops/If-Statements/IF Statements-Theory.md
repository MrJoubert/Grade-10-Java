# If Statements in Java

## Overview

Programs often need to make decisions. For example, a program may need to determine whether a mark is a pass, whether a number is positive or whether a customer qualifies for a discount.

In Java, an `if` statement allows a program to execute a section of code only when a specified condition is true.

The `if` statement is one of the fundamental selection structures in programming. Understanding it will help you develop programs that respond intelligently to different inputs.

## Learning Objectives

By the end of this topic, you should be able to:

- Explain the purpose of an `if` statement.
- Understand the syntax and structure of an `if` statement.
- Write conditions using relational operators.
- Use Boolean expressions in selection statements.
- Predict whether a statement will execute for a given condition.
- Use `if` statements to solve simple programming problems.
- Identify common errors in selection statements.
- Test an `if` statement using different input values.

## IEB Curriculum Alignment

This topic supports Grade 10 IEB Information Technology programming requirements involving selection, relational operators, Boolean expressions and algorithm development.

The examples use introductory Java concepts and are intended to help you understand how programs make decisions. They are learning resources and are not official IEB publications.

## 1. What Is an If Statement?

An `if` statement allows Java to execute instructions only when a condition is true.

Consider the following example:

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

The condition `mark >= 50` is true because `75` is greater than or equal to `50`.

Java therefore executes the statement inside the curly braces.

Now consider this example:

```java
int mark = 35;

if (mark >= 50) {
    System.out.println("Pass");
}
```

Output:

```text
```

Nothing is displayed because the condition is false. Java skips the statement inside the `if` block and continues with the rest of the program.

**Important:** An `if` statement does not automatically provide an alternative action when its condition is false. For that, you can use an `if-else` statement, covered in the next subtopic.

## 2. The Syntax of an If Statement

The general structure is:

```java
if (condition) {
    // Instructions executed if the condition is true
}
```

Each part has a specific purpose.

- `if` is the Java keyword that introduces the selection statement.
- Parentheses `()` enclose the condition.
- The condition must evaluate to either `true` or `false`.
- Curly braces `{}` enclose the instructions that execute when the condition is true.

For example:

```java
int age = 18;

if (age >= 18) {
    System.out.println("You are an adult.");
}
```

The condition is checked before the instruction is executed.

If `age` is at least `18`, the message is displayed. Otherwise, the message is skipped.

## 3. Relational Operators

Conditions often use relational operators to compare values.

| Operator | Meaning | Example |
|---|---|---|
| `==` | Equal to | `number == 10` |
| `!=` | Not equal to | `number != 10` |
| `>` | Greater than | `mark > 50` |
| `<` | Less than | `mark < 50` |
| `>=` | Greater than or equal to | `mark >= 50` |
| `<=` | Less than or equal to | `mark <= 50` |

A relational expression produces a Boolean result: either `true` or `false`.

For example:

```java
int number = 10;

System.out.println(number > 5);
System.out.println(number < 5);
System.out.println(number == 10);
```

Output:

```text
true
false
true
```

These results can be used in `if` statements.

### Common distinction: `=` versus `==`

The assignment operator `=` stores a value in a variable.

```java
int number = 10;
```

The equality operator `==` checks whether two values are equal.

```java
if (number == 10) {
    System.out.println("The number is 10.");
}
```

Do not confuse assignment with comparison.

## 4. Using If Statements with User Input

You can combine `JOptionPane`, type conversion and an `if` statement to create an interactive program.

Consider a program that determines whether a student has achieved a pass mark of `50`.

```java
import javax.swing.JOptionPane;

public class PassCheck {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(
            "Enter your mark:"
        );

        int mark = Integer.parseInt(input);

        if (mark >= 50) {
            JOptionPane.showMessageDialog(
                null,
                "Congratulations! You have achieved a pass."
            );
        }
    }
}
```

### How the program works

1. `showInputDialog()` asks the user to enter a mark.
2. The entered value is stored as a `String`.
3. `Integer.parseInt()` converts the String into an integer.
4. The `if` statement checks whether the mark is at least `50`.
5. If the condition is true, the program displays a congratulatory message.

This example assumes that the user enters a valid whole number. Handling invalid input requires additional validation.

## 5. Using If Statements with Calculations

An `if` statement can also evaluate the result of a calculation.

Consider a program that calculates the area of a rectangle and displays a message if the area is greater than `100`.

```java
int length = 15;
int width = 10;

int area = length * width;

if (area > 100) {
    System.out.println("The area is greater than 100.");
}
```

Output:

```text
The area is greater than 100.
```

The program first calculates the area. It then evaluates the condition using the calculated value.

The order is important: `area` must be calculated before the condition is checked.

## 6. If Statements with Boolean Variables

A Boolean variable stores one of two possible values: `true` or `false`.

You can use a Boolean variable directly as the condition of an `if` statement.

```java
boolean isRegistered = true;

if (isRegistered) {
    System.out.println("Registration confirmed.");
}
```

Output:

```text
Registration confirmed.
```

Because `isRegistered` contains `true`, the message is displayed.

If the variable contained `false`, the message would not be displayed.

This is useful when a variable already represents the outcome of a decision.

## 7. If Statements with Logical Operators

You can combine conditions using logical operators.

The three fundamental logical operators are:

| Operator | Meaning |
|---|---|
| `&&` | AND — both conditions must be true. |
| `||` | OR — at least one condition must be true. |
| `!` | NOT — reverses a Boolean value. |

For example, suppose a student must achieve a mark of at least `50` to pass and a mark of at least `75` to qualify for a distinction.

```java
int mark = 82;

if (mark >= 75 && mark <= 100) {
    System.out.println("Distinction achieved.");
}
```

Output:

```text
Distinction achieved.
```

Both conditions must be true for the message to display.

Another example uses `||`:

```java
int age = 17;

if (age < 13 || age >= 18) {
    System.out.println("The age is outside the 13–17 range.");
}
```

Output:

```text
```

Neither condition is true for an age of `17`, so no message is displayed.

These operators allow you to create more specific conditions for your programs.

## 8. Understanding the Execution Flow

Consider the following program:

```java
int number = 12;

System.out.println("Start");

if (number > 10) {
    System.out.println("Condition is true.");
}

System.out.println("End");
```

Output:

```text
Start
Condition is true.
End
```

Java executes the instructions in order.

1. It displays `Start`.
2. It checks whether `number > 10`.
3. Because the condition is true, it displays `Condition is true.`
4. It continues after the `if` block and displays `End`.

If `number` were `8`, the second message would be skipped, but `Start` and `End` would still be displayed.

This is an important principle: an `if` statement controls whether its own block executes, not whether the entire program continues.

## 9. Common Mistakes

### Mistake 1: Using assignment instead of comparison

Incorrect:

```java
if (number = 10) {
    System.out.println("Ten");
}
```

Correct:

```java
if (number == 10) {
    System.out.println("Ten");
}
```

The equality operator `==` compares values.

### Mistake 2: Forgetting the condition's parentheses

Incorrect:

```java
if number > 10 {
    System.out.println("Large");
}
```

Correct:

```java
if (number > 10) {
    System.out.println("Large");
}
```

### Mistake 3: Using a semicolon immediately after the condition

Incorrect:

```java
if (number > 10);
{
    System.out.println("Large");
}
```

The semicolon creates an empty statement after the condition. The block that follows is no longer controlled by the `if` statement and executes regardless of the condition.

Correct:

```java
if (number > 10) {
    System.out.println("Large");
}
```

### Mistake 4: Using the wrong comparison operator

Suppose a pass requires a mark of at least `50`.

Incorrect:

```java
if (mark > 50) {
    System.out.println("Pass");
}
```

This excludes a mark of exactly `50`.

Correct:

```java
if (mark >= 50) {
    System.out.println("Pass");
}
```

### Mistake 5: Incorrectly placing instructions outside the block

Consider:

```java
if (mark >= 50) {
    System.out.println("Pass");
}

System.out.println("Result checked.");
```

The first message appears only when the condition is true. The second message appears regardless of the condition because it is outside the block.

Always check which instructions are enclosed by the curly braces.

## 10. Testing If Statements

You should test both true and false outcomes.

Consider this condition:

```java
if (mark >= 50) {
    System.out.println("Pass");
}
```

A suitable test table is:

| Input mark | Condition | Expected output |
|---:|---|---|
| `75` | True | `Pass` |
| `50` | True | `Pass` |
| `49` | False | No output from the `if` block |
| `0` | False | No output from the `if` block |
| `100` | True | `Pass` |

Testing the boundary value `50` is especially important because it confirms whether the program uses the correct comparison operator.

When testing your own programs, predict the result before running the code. This helps you identify logical errors rather than simply observing what the program does.

## Practical Challenge

Create a Java program that asks the user to enter their age.

Your program must:

1. Use `JOptionPane` to request the age.
2. Convert the input to an integer.
3. Use an `if` statement to check whether the age is at least `18`.
4. Display `You are eligible to register.` when the condition is true.
5. Display no eligibility message when the condition is false.

### Extension activities

- Modify the program to check whether a number is positive.
- Create a program that displays a message when a mark is at least `75`.
- Write a program that checks whether a number is divisible by `5`.
- Add a second independent `if` statement to check another condition.
- Test your programs with values that make the conditions true and false.

## Key Takeaways

- An `if` statement allows code to execute only when a condition is true.
- Conditions must evaluate to a Boolean value.
- Relational operators compare values.
- `==` checks equality, while `=` assigns a value.
- Logical operators can combine multiple conditions.
- Code inside the `if` block is skipped when the condition is false.
- Code after the `if` block continues executing normally.
- Boundary values are important when testing conditions.
- Clear conditions and correct comparison operators are essential for reliable programs.

---

## Navigation

- [Previous: Selection and Loops](../../07-Selection-and-Loops/README.md)
- **Current topic: If Statements**
- [Next: If-Else Statements](../If-Else-Statements/README.md)
- [Back to the Grade 10 Java Library](../../README.md)

