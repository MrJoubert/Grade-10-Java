# Input Validation Programs

## Overview

Input validation is the process of checking whether data entered by a user meets the requirements of a program before that data is processed.

A program should not assume that users will always enter the correct information. A user might enter a negative number, a value outside an acceptable range, text instead of a number, or no input at all.

In this topic, you will combine variables, data types, selection statements, logical operators, type conversion and input/output to create Java programs that validate user input.

You will also learn to distinguish between checking whether input is valid and handling errors that occur when converting input into a numeric value.

## Learning Objectives

By the end of this topic, you should be able to:

- Explain the purpose of input validation.
- Identify valid and invalid input values.
- Validate numerical input against an acceptable range.
- Use relational and logical operators to check conditions.
- Convert `String` input into numeric data types.
- Use `if`, `if-else` and other appropriate selection structures to control program behaviour.
- Display meaningful error messages.
- Handle unsuitable numerical input using exception handling.
- Test programs using standard, extreme and abnormal data.

---

## 1. Why Is Input Validation Important?

Consider a program that asks a Student to enter a mark between 0 and 100.

If the Student enters `75`, the program should accept the value.

However, what should happen if the Student enters `-15` or `140`?

Without validation, the program might accept an impossible mark and use it in further calculations.

Input validation helps to ensure that:

- Numerical values fall within acceptable ranges.
- Required information is supplied.
- Input is appropriate for the operation being performed.
- Invalid values are rejected before they are processed.
- Users receive clear feedback when their input is unsuitable.

Validation rules must be based on the requirements of the particular problem. Not every numerical value has the same restrictions.

## 2. Validating a Numerical Range

Suppose a program accepts marks from 0 to 100, inclusive.

The condition for a valid mark is:

\[
0 \leq \text{mark} \leq 100
\]

In Java, this can be expressed using the logical `&&` operator.

```java
if (mark >= 0 && mark <= 100) {
    System.out.println("Valid mark.");
} else {
    System.out.println("Invalid mark.");
}
```

Both conditions must be true for the mark to be accepted.

### Example

```java
int mark = 85;

if (mark >= 0 && mark <= 100) {
    System.out.println("Valid mark.");
} else {
    System.out.println("Invalid mark.");
}
```

**Output:**

```text
Valid mark.
```

If `mark` is changed to `120`, the output becomes:

```text
Invalid mark.
```

### Understanding the condition

- `mark >= 0` checks that the mark is not negative.
- `mark <= 100` checks that the mark does not exceed 100.
- `&&` requires both conditions to be true.

Remember that the values `0` and `100` are valid because the conditions use `>=` and `<=`.

## 3. Validating Input with JOptionPane

The `JOptionPane.showInputDialog()` method allows a user to enter information through a dialog box.

The method returns the entered information as a `String`. If you want to perform calculations with the input, you must convert it into an appropriate numeric data type.

The following example accepts a whole-number mark and validates its range.

```java
import javax.swing.JOptionPane;

public class MarkValidation {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(
                "Enter a mark from 0 to 100:");

        if (input == null) {
            JOptionPane.showMessageDialog(
                    null, "Input cancelled.");
        } else {
            try {
                int mark = Integer.parseInt(input);

                if (mark >= 0 && mark <= 100) {
                    JOptionPane.showMessageDialog(
                            null, "Valid mark: " + mark);
                } else {
                    JOptionPane.showMessageDialog(
                            null, "Invalid mark. Enter a value from 0 to 100.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null, "Please enter a whole number.");
            }
        }
    }
}
```

### How the program works

1. An input dialog asks the user to enter a mark.
2. The program checks whether the user cancelled the dialog.
3. `Integer.parseInt()` converts the input into an integer.
4. The program checks whether the mark is between 0 and 100.
5. Valid marks are accepted, while values outside the range are rejected.
6. If the input cannot be converted into an integer, a `NumberFormatException` is handled and an error message is displayed.

This example combines range validation with exception handling.

**Important:** Range validation and type validation solve different problems. Checking whether a mark is between 0 and 100 does not help if the input contains text that cannot be converted into an integer.

## 4. Using Logical Operators for Validation

Logical operators allow you to combine conditions.

### 4.1 Using AND (`&&`)

Use `&&` when all conditions must be true.

For example, a password length might be required to be at least 8 characters and no more than 20 characters.

```java
String password = "JavaStudent";

if (password.length() >= 8 && password.length() <= 20) {
    System.out.println("Acceptable password length.");
} else {
    System.out.println("Password length is invalid.");
}
```

**Output:**

```text
Acceptable password length.
```

This example checks the length only. It does not check password strength or security.

### 4.2 Using OR (`||`)

Use `||` when any one of the conditions being checked can make the input invalid.

For example, a mark is invalid if it is below 0 or above 100.

```java
int mark = 105;

if (mark < 0 || mark > 100) {
    System.out.println("Invalid mark.");
} else {
    System.out.println("Valid mark.");
}
```

**Output:**

```text
Invalid mark.
```

The condition is true if either the mark is below 0 or it is above 100.

### 4.3 Using NOT (`!`)

The logical NOT operator reverses a Boolean value.

For example:

```java
boolean valid = false;

if (!valid) {
    System.out.println("Input is invalid.");
}
```

**Output:**

```text
Input is invalid.
```

Logical operators are useful when validation rules involve several conditions.

## 5. Validating Positive Numbers

Suppose a program calculates the cost of purchasing items. The quantity must be greater than zero.

```java
int quantity = 0;

if (quantity > 0) {
    System.out.println("Quantity accepted.");
} else {
    System.out.println("Quantity must be greater than zero.");
}
```

**Output:**

```text
Quantity must be greater than zero.
```

The condition prevents the program from accepting a quantity of zero or a negative quantity.

However, whether zero should be accepted depends on the problem requirements. For example, a quantity may be required to be positive, while a discount percentage may legitimately be zero.

Always establish the validation rules before writing the conditions.

## 6. Preventing Invalid Calculations

Input validation is especially important when a calculation could fail for certain values.

Consider a program that divides one number by another.

The divisor must not be zero when performing integer division.

```java
int number = 100;
int divisor = 0;

if (divisor != 0) {
    int answer = number / divisor;
    System.out.println("Answer: " + answer);
} else {
    System.out.println("The divisor cannot be zero.");
}
```

**Output:**

```text
The divisor cannot be zero.
```

The program checks the divisor before attempting the calculation.

This is an example of defensive programming: checking for a foreseeable problem before it causes a failure.

## 7. Common Input Validation Mistakes

### Mistake 1: Using the wrong relational operator

```java
if (mark > 0 && mark < 100)
```

This condition rejects both 0 and 100.

If the acceptable range is inclusive, use:

```java
if (mark >= 0 && mark <= 100)
```

### Mistake 2: Using OR instead of AND for a valid range

```java
if (mark >= 0 || mark <= 100)
```

This condition is true for every ordinary integer because almost any integer will satisfy at least one of the two conditions.

For a mark that must be between 0 and 100, use:

```java
if (mark >= 0 && mark <= 100)
```

Alternatively, identify an invalid mark using:

```java
if (mark < 0 || mark > 100)
```

### Mistake 3: Converting input without considering invalid text

```java
int mark = Integer.parseInt(input);
```

This statement can throw a `NumberFormatException` if the input is not a valid integer.

**Solution:** Validate the input appropriately or handle the exception.

### Mistake 4: Checking the range before converting the input

A `String` cannot be compared directly with integers using numerical relational operators.

Convert the input into a suitable numeric type first, and then validate the range.

### Mistake 5: Continuing after invalid input

Displaying an error message is not sufficient if the program then continues to calculate using an invalid value.

Structure the program so that further processing only takes place when the input meets the requirements.

## 8. Testing Input Validation

A program should be tested using a variety of inputs.

Suppose the valid range is 0 to 100 inclusive.

| Test input | Classification | Expected result |
|---:|---|---|
| `50` | Standard | Accept |
| `0` | Minimum boundary | Accept |
| `100` | Maximum boundary | Accept |
| `-1` | Below the range | Reject |
| `101` | Above the range | Reject |
| `hello` | Invalid data type | Display an input error |
| Cancel | Cancelled input | Handle cancellation |

For each test:

1. Identify the expected behaviour.
2. Run the program using the test input.
3. Record the actual result.
4. Compare the actual result with the expected result.
5. Correct any problems and repeat the relevant tests.

Testing both sides of a boundary is particularly useful for detecting incorrect relational operators.

## 9. Practical Challenge 1: Age Validation

Create a Java program that asks a user to enter their age.

Your program must:

1. Accept ages from 0 to 120 inclusive.
2. Reject negative ages.
3. Reject ages above 120.
4. Handle text that cannot be converted into an integer.
5. Handle cancellation of the input dialog.
6. Display an appropriate message for each situation.

### Test cases

| Input | Expected result |
|---|---|
| `18` | Accept |
| `0` | Accept |
| `120` | Accept |
| `-1` | Reject |
| `121` | Reject |
| `abc` | Display an input error |
| Cancel | Handle cancellation |

## 10. Practical Challenge 2: Shopping Calculator

Create a program that asks the user to enter:

- The price of one item.
- The quantity purchased.

Your program must validate the inputs before calculating the total cost.

Requirements:

1. The price must not be negative.
2. The quantity must be greater than zero.
3. The price must be entered as a valid number.
4. The quantity must be entered as a whole number.
5. Invalid inputs must produce appropriate error messages.
6. The total cost must only be calculated when both values are valid.

Use:

\[
\text{Total cost}=\text{price}\times\text{quantity}
\]

Test your program with a valid price and quantity, a zero quantity, a negative price and unsuitable text input.

## 11. Key Takeaways

- Input validation checks whether data meets the requirements of a program.
- Range validation uses relational operators to check numerical limits.
- `&&` combines conditions that must all be true.
- `||` combines conditions where any one can make an input invalid.
- `!` reverses a Boolean value.
- `JOptionPane` returns input as a `String`.
- Numeric conversion and range validation are separate steps.
- Exception handling can help manage invalid numerical conversions.
- Validation can prevent calculations from being performed with unsuitable values.
- Testing must include standard, extreme and abnormal inputs.

## Navigation

- [Previous: Variables and Calculations](../Variables-and-Calculations/README.md)
- [Next: Selection and Loop Programs](../Selection-and-Loop-Programs/README.md)
- [Back to Integrated Examples and Practice](../README.md)
- [Back to Grade 10 Java](../../README.md)
