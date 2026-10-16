# Basic Input Validation

## Overview

Input validation is the process of checking information entered by a user to determine whether it meets the requirements of a program.

Users do not always enter the information a program expects. For example, a program requesting a student's mark might receive a negative number, a mark greater than 100, or text instead of a number.

**Input validation helps prevent invalid data from being processed incorrectly.**

In Java, validation can be performed using selection statements, relational operators, logical operators and loops. These concepts allow a program to check whether input is acceptable and respond appropriately when it is not.

This section focuses on basic validation techniques suitable for Grade 10 Information Technology.

## Learning Objectives

By the end of this section, you should be able to:

- Explain the purpose of input validation.
- Identify valid and invalid input for a given problem.
- Use `if` and `if-else` statements to validate values.
- Apply relational and logical operators in validation conditions.
- Display appropriate messages when input is invalid.
- Use loops to request input again when necessary.
- Test a validation algorithm using normal, boundary and invalid values.

---

## 1. Why Is Input Validation Important?

Consider a program that asks a user to enter a test mark out of 100.

A valid mark must be between 0 and 100, inclusive.

If the user enters `75`, the value is valid.

If the user enters `-10` or `125`, the value is outside the permitted range.

Without validation, the program might continue processing these incorrect values and produce misleading results.

Validation allows the program to check the value before using it.

### Example: Validating a mark

```java
int mark = 125;

if (mark >= 0 && mark <= 100)
{
    System.out.println("Valid mark.");
}
else
{
    System.out.println("Invalid mark.");
}
```

Output:

```text
Invalid mark.
```

The condition checks two requirements:

- `mark >= 0`: The mark must be at least zero.
- `mark <= 100`: The mark must not exceed 100.

The `&&` operator requires both conditions to be true.

## 2. Types of Input Validation

Different problems require different validation rules.

### 2.1 Range validation

Range validation checks whether a value falls within an allowed range.

For example, a test mark must be between 0 and 100.

```java
if (mark >= 0 && mark <= 100)
{
    System.out.println("Mark accepted.");
}
else
{
    System.out.println("Mark must be between 0 and 100.");
}
```

### 2.2 Positive-value validation

Some problems require a positive number.

For example, a program that calculates the price of an item should not accept a negative price.

```java
if (price > 0)
{
    System.out.println("Price accepted.");
}
else
{
    System.out.println("Price must be greater than zero.");
}
```

Notice that `price > 0` does not accept zero.

If zero is permitted, the condition must be changed to `price >= 0`.

### 2.3 Choice validation

A program may ask the user to select from a limited set of options.

Suppose the user must enter either `1` or `2`.

```java
if (choice == 1 || choice == 2)
{
    System.out.println("Valid choice.");
}
else
{
    System.out.println("Enter either 1 or 2.");
}
```

The `||` operator means that at least one of the conditions must be true.

### 2.4 Type-related validation

A program may expect a number but receive text instead.

For example:

```java
int age = Integer.parseInt("abc");
```

This causes a `NumberFormatException` because `"abc"` cannot be converted into an integer.

Checking a numeric range is not the same as checking whether text can be converted to a number. The program must handle these situations separately.

---

## 3. Validating Input with if-else

The `if-else` statement allows a program to choose between two outcomes.

Consider a program that asks the user for their age.

```java
import javax.swing.JOptionPane;

public class AgeValidation
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog(
                "Enter your age:");

        int age = Integer.parseInt(input);

        if (age >= 0)
        {
            JOptionPane.showMessageDialog(null,
                    "Age accepted.");
        }
        else
        {
            JOptionPane.showMessageDialog(null,
                    "Age cannot be negative.");
        }
    }
}
```

If the user enters `16`, the program displays:

```text
Age accepted.
```

If the user enters `-5`, the program displays:

```text
Age cannot be negative.
```

This example validates the numerical value after conversion. It assumes that the user enters a valid integer.

---

## 4. Using Logical Operators in Validation

Logical operators allow you to combine multiple conditions.

The three main logical operators in Java are:

| Operator | Meaning | Example |
|---|---|---|
| `&&` | AND — both conditions must be true | `mark >= 0 && mark <= 100` |
| `||` | OR — at least one condition must be true | `choice == 1 || choice == 2` |
| `!` | NOT — reverses a Boolean result | `!(age >= 18)` |

### Example: Checking a mark range

```java
if (mark >= 0 && mark <= 100)
{
    System.out.println("Valid mark.");
}
```

Both conditions must be satisfied.

### Example: Checking an allowed menu choice

```java
if (choice == 1 || choice == 2)
{
    System.out.println("Valid choice.");
}
```

The input is accepted if the user enters either `1` or `2`.

### Example: Identifying invalid input

```java
if (!(mark >= 0 && mark <= 100))
{
    System.out.println("Invalid mark.");
}
```

The `!` operator reverses the result of the expression in brackets.

For Grade 10 programming, it is often clearer to write the condition directly where possible:

```java
if (mark < 0 || mark > 100)
{
    System.out.println("Invalid mark.");
}
```

Both versions identify marks outside the permitted range.

---

## 5. Repeating Input Until It Is Valid

Sometimes a program should not continue until the user enters an acceptable value.

A loop can repeat the input process.

The following example asks for a mark and continues requesting input while the mark is outside the range of 0 to 100.

```java
import javax.swing.JOptionPane;

public class MarkValidation
{
    public static void main(String[] args)
    {
        int mark = -1;

        while (mark < 0 || mark > 100)
        {
            String input = JOptionPane.showInputDialog(
                    "Enter a mark between 0 and 100:");

            mark = Integer.parseInt(input);

            if (mark < 0 || mark > 100)
            {
                JOptionPane.showMessageDialog(null,
                        "Invalid mark. Please try again.");
            }
        }

        JOptionPane.showMessageDialog(null,
                "Mark accepted: " + mark);
    }
}
```

### How it works

1. The variable `mark` is initialised to `-1`, which is outside the valid range.
2. The `while` loop checks whether the mark is below 0 or above 100.
3. The program asks the user to enter a mark.
4. The input is converted to an integer.
5. If the value is invalid, an error message is displayed.
6. The loop repeats while the value is invalid.
7. When a valid mark is entered, the loop ends.

This example assumes that the user always enters an integer. If the user enters text or cancels the dialog, additional handling is required.

---

## 6. Validating Numeric Input Safely

Range validation only works after the program has obtained a valid numerical value.

Consider this statement:

```java
int mark = Integer.parseInt(input);
```

If `input` contains `"hello"`, the conversion fails before the range condition can be checked.

Java provides exception handling to manage conversion errors. This is an additional technique that may be introduced separately from basic selection and loop validation.

For example:

```java
String input = JOptionPane.showInputDialog(
        "Enter a whole-number mark:");

try
{
    int mark = Integer.parseInt(input);

    if (mark >= 0 && mark <= 100)
    {
        JOptionPane.showMessageDialog(null,
                "Valid mark.");
    }
    else
    {
        JOptionPane.showMessageDialog(null,
                "Mark must be between 0 and 100.");
    }
}
catch (NumberFormatException e)
{
    JOptionPane.showMessageDialog(null,
            "Please enter a whole number.");
}
```

This example handles invalid integer input, such as `"hello"`, and separately checks whether the numerical value is within the required range.

It does not handle every possible situation, such as the user cancelling the input dialog. A complete application should also consider how cancellation and empty input should be handled.

---

## 7. Common Mistakes

### Mistake 1: Using the wrong relational operator

Incorrect:

```java
if (mark > 0 && mark < 100)
```

This excludes both 0 and 100.

If the permitted range is inclusive, use:

```java
if (mark >= 0 && mark <= 100)
```

### Mistake 2: Using OR instead of AND for a range

Incorrect:

```java
if (mark >= 0 || mark <= 100)
```

This condition is true for almost every integer because a number generally satisfies at least one of the two conditions.

Correct:

```java
if (mark >= 0 && mark <= 100)
```

### Mistake 3: Forgetting to update the input inside a loop

If the input is never requested or updated again, the loop may repeat indefinitely.

**Solution:** Ensure that the value being checked can change during each iteration.

### Mistake 4: Validating before converting the input

A value collected using `showInputDialog()` is a `String`.

**Solution:** Convert the input to the appropriate numerical type before applying numerical comparisons, and handle conversion errors where required.

### Mistake 5: Displaying an error without explaining how to correct it

A message such as `Invalid input` may not provide enough information.

Improved:

```java
JOptionPane.showMessageDialog(null,
        "Invalid mark. Enter a whole number from 0 to 100.");
```

The improved message explains the expected input.

---

## 8. Testing and Debugging

A validation algorithm should be tested with values that check the permitted range and the boundaries around it.

For a mark between 0 and 100, inclusive, use the following test cases.

| Test input | Expected result | Reason |
|---:|---|---|
| -1 | Invalid | Below the minimum |
| 0 | Valid | Minimum permitted value |
| 1 | Valid | Within the range |
| 50 | Valid | Within the range |
| 99 | Valid | Within the range |
| 100 | Valid | Maximum permitted value |
| 101 | Invalid | Above the maximum |

These tests check normal values, boundary values and invalid values.

If your program accepts `101`, examine the upper-bound condition. If it rejects `100`, check whether you used `>` instead of `>=` or `<` instead of `<=`.

Also consider whether the program handles non-numeric input appropriately.

---

## 9. Practical Challenge

Create a Java program called `ValidMark`.

Your program must:

1. Ask the user to enter a mark out of 100 using `JOptionPane`.
2. Convert the input to an integer.
3. Check whether the mark is between 0 and 100, inclusive.
4. Display an appropriate message if the mark is valid.
5. Display a helpful error message if the numerical value is outside the permitted range.

### Extension challenges

- Repeat the input prompt until a valid mark is entered.
- Handle text entered instead of a number.
- Display whether a valid mark is a pass or a fail, using 50 as the pass mark.
- Create a menu that accepts only choices `1`, `2` or `3`.
- Test the program using the minimum and maximum permitted values.

Remember that a value can be numerically valid but still require further checks depending on the problem.

---

## Key Takeaways

- Input validation checks whether data meets a program's requirements.
- Range validation uses relational operators to check permitted values.
- Logical operators combine conditions when multiple rules must be satisfied.
- `if-else` statements allow a program to respond differently to valid and invalid values.
- Loops can repeat input requests until a value is acceptable.
- Converting text to a number can fail if the input is not numeric.
- Good validation includes clear error messages and appropriate testing.
- Always test the boundaries of a permitted range.

---

## Navigation

- [Previous: Input Prompts and Output Messages](../Input-Prompts-and-Output-Messages/README.md)
- [Next: Error Messages and User Feedback](../Error-Messages-and-User-Feedback/README.md)
- [Back to User Interface and Validation](../README.md)
- [Back to Grade 10 Java](../../README.md)
