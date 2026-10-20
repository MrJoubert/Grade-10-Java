# Robustness Testing

## Overview

Robustness testing is the process of checking whether a program can handle unexpected, invalid or unusual inputs without producing incorrect results or failing unexpectedly.

A program may work perfectly when a user enters valid information but fail when the user enters something unexpected. For example, a program that asks for a mark may work when the user enters `75`, but it should also consider what happens if the user enters `-10`, `150` or text instead of a number.

A well-designed program should respond appropriately to these situations and provide useful feedback to the user.

In this topic, you will learn how to test the reliability of Java programs by using different types of input data and checking how the program responds.

## Learning Objectives

By the end of this topic, you should be able to:

- Explain the purpose of robustness testing.
- Distinguish between valid, invalid and unusual input data.
- Identify situations in which a program may fail.
- Test boundary values and unexpected inputs.
- Explain the importance of input validation.
- Use Java conditions to prevent invalid operations.
- Evaluate whether a program behaves reliably under different circumstances.

---

## 1. What Is Robustness Testing?

**Robustness testing** checks whether a program behaves appropriately when it encounters unexpected, invalid or unusual situations.

A robust program should not simply work for one expected input. It should also handle foreseeable problems in a controlled manner.

For example, consider a program that accepts a mark between 0 and 100.

The program should accept a mark of `75`, but it should reject `-10` and `150`.

| Input | Expected behaviour |
|---|---|
| `75` | Accept the mark |
| `0` | Accept the mark |
| `100` | Accept the mark |
| `-10` | Reject the mark |
| `150` | Reject the mark |
| Text instead of a number | Report invalid input rather than attempting an unsafe conversion |

Robustness testing helps identify weaknesses before a program is used by real users.

## 2. Types of Test Data

Different types of test data help you evaluate different aspects of a program.

### 2.1 Standard data

Standard data consists of normal, valid inputs that the program is expected to process.

For a mark between 0 and 100, examples include:

- `45`
- `67`
- `85`

**Purpose:** To check whether the program works correctly under normal circumstances.

### 2.2 Extreme data

Extreme data tests the limits of the acceptable input range.

For a mark between 0 and 100, the extreme values are:

- `0`
- `100`

These values are valid, but they are at the boundaries of the permitted range.

**Purpose:** To check whether the program handles the lowest and highest acceptable values correctly.

### 2.3 Abnormal data

Abnormal data consists of inputs that are invalid or outside the permitted range.

Examples include:

- `-1`
- `101`
- Text when a number is required.
- An empty response when a value is compulsory.

**Purpose:** To check whether the program identifies and handles invalid input appropriately.

### Comparison

| Type of data | Example | Expected behaviour |
|---|---|---|
| Standard | `65` | Accept |
| Extreme | `0` or `100` | Accept |
| Abnormal | `-5` or `105` | Reject |
| Wrong data type | `"hello"` instead of a number | Report or handle invalid input |

Remember that extreme data is not necessarily invalid. A value at the boundary of the permitted range is usually valid.

## 3. Understanding Boundary Values

A boundary value is a value at or near the limit of an acceptable range.

Suppose a Student must obtain a mark from 0 to 100 inclusive.

The valid range is:

\[
0 \leq \text{mark} \leq 100
\]

Useful boundary tests include:

| Test value | Classification | Expected result |
|---:|---|---|
| `-1` | Just below the minimum | Reject |
| `0` | Minimum boundary | Accept |
| `1` | Just above the minimum | Accept |
| `99` | Just below the maximum | Accept |
| `100` | Maximum boundary | Accept |
| `101` | Just above the maximum | Reject |

Testing values just outside the range is particularly useful because incorrect relational operators can allow invalid values through.

For example, using `mark < 0 || mark > 100` correctly identifies values outside the permitted range.

Using `mark <= 0 || mark >= 100` would incorrectly reject both `0` and `100`.

## 4. Input Validation in Java

Input validation checks whether entered data satisfies the program's requirements before the program processes it.

Consider the following example:

```java
int mark = 120;

if (mark >= 0 && mark <= 100) {
    System.out.println("Valid mark.");
} else {
    System.out.println("Invalid mark. Enter a mark from 0 to 100.");
}
```

**Output:**

```text
Invalid mark. Enter a mark from 0 to 100.
```

The program checks that the mark is at least 0 and at most 100.

Both conditions must be true, so the logical `&&` operator is used.

### Why validation matters

Without validation, a program may:

- Accept values that should not be permitted.
- Calculate incorrect results.
- Display misleading information.
- Perform operations using unsuitable values.
- Fail when unexpected input is encountered.

Validation should take place before the program relies on the entered value.

## 5. Robustness Testing with JOptionPane

The following program asks the user to enter a mark using `JOptionPane`. It converts the input into an integer and checks whether the mark is within the valid range.

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
                            null,
                            "Invalid mark. Enter a value from 0 to 100.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null, "Invalid input. Enter a whole number.");
            }
        }
    }
}
```

### How the program works

1. `showInputDialog()` asks the user to enter a mark.
2. The program checks whether the user cancelled the input.
3. `Integer.parseInt()` attempts to convert the input into an integer.
4. The `if` statement checks whether the mark is between 0 and 100.
5. Invalid numerical values produce an appropriate message.
6. If the input cannot be converted into an integer, the `catch` block handles the `NumberFormatException`.

### Suggested tests

| Input or action | Expected response |
|---|---|
| `75` | Display a valid mark message |
| `0` | Display a valid mark message |
| `100` | Display a valid mark message |
| `-5` | Display an invalid mark message |
| `105` | Display an invalid mark message |
| `hello` | Display a whole-number error message |
| Cancel the dialog | Display an input-cancelled message |

This program demonstrates how range validation and exception handling can work together.

## 6. Testing for Unexpected Situations

Robustness testing should consider more than numerical boundaries.

Depending on the requirements, test situations such as:

- The user enters letters instead of numbers.
- The user enters a negative value.
- The user enters a value much larger than expected.
- The user leaves an input blank.
- The user cancels an input dialog.
- The user enters a value that causes division by zero.
- The user enters a decimal number when only a whole number is allowed.

Not every situation requires the same solution. For example, checking a numerical range does not prevent `Integer.parseInt()` from failing when the input contains letters. The program must also handle the conversion appropriately.

## 7. Creating a Robustness Test Table

A test table records the inputs used, the expected behaviour and the actual result.

Consider a program that calculates the price of an item after applying a discount. The discount percentage must be between 0 and 100.

| Test case | Discount entered | Expected result |
|---|---:|---|
| Standard | `15` | Accept |
| Minimum boundary | `0` | Accept |
| Maximum boundary | `100` | Accept |
| Below minimum | `-1` | Reject |
| Above maximum | `101` | Reject |
| Abnormal input | `"abc"` | Handle invalid numerical input |

After running the tests, record the actual result for each case.

If the actual result differs from the expected result, investigate the cause, correct the program and repeat the relevant tests.

## 8. Common Mistakes

### Mistake 1: Testing only normal values

A program may work with a value of `50` but fail when the user enters `0` or `101`.

**Solution:** Test normal values, boundary values and invalid values.

### Mistake 2: Rejecting valid boundary values

Using `mark > 0 && mark < 100` rejects `0` and `100`, even when both are permitted.

**Solution:** Check the requirements carefully and use the correct relational operators.

### Mistake 3: Validating the range but ignoring the data type

The condition `mark >= 0 && mark <= 100` works only after a valid integer has been obtained.

**Solution:** Handle conversion errors before checking the numerical range.

### Mistake 4: Displaying an error message but continuing incorrectly

A program should not continue processing an invalid value as though it were valid.

**Solution:** Structure the program so that invalid input is rejected before further processing takes place.

### Mistake 5: Assuming that one successful test proves the program is correct

A single test only demonstrates how the program behaved for that particular input.

**Solution:** Use a range of test cases that cover normal, boundary and abnormal situations.

## 9. Practical Challenge

Create a Java program that asks the user to enter their age using `JOptionPane`.

Your program must:

1. Ask the user to enter an age.
2. Accept ages from 0 to 120 inclusive.
3. Reject ages below 0 or above 120.
4. Handle text that cannot be converted into a whole number.
5. Handle the user cancelling the input dialog.
6. Display an appropriate message for every situation.

### Test your program

Use the following test cases:

| Input | Expected behaviour |
|---|---|
| `25` | Accept |
| `0` | Accept |
| `120` | Accept |
| `-1` | Reject |
| `121` | Reject |
| `hello` | Display an input error |
| Cancel | Handle cancellation |

**Extension:** Add a message that classifies an accepted age as a child, teenager or adult. Clearly define the age ranges you use and test the boundary values for each category.

## 10. Key Takeaways

- Robustness testing checks how reliably a program handles unexpected or invalid situations.
- Standard data tests normal behaviour.
- Extreme data tests the boundaries of acceptable values.
- Abnormal data tests invalid or unsuitable inputs.
- Boundary values are especially useful for identifying incorrect conditions.
- Input validation checks whether data meets the program's requirements.
- Exception handling can help a program respond appropriately to invalid conversions.
- A good test plan compares expected results with actual results.
- After correcting a problem, repeat the relevant tests to confirm that the program behaves correctly.

## Navigation

- [Previous: Debugging and Correcting Errors](../Debugging-and-Correcting-Errors/README.md)
- [Back to Testing and Debugging](../README.md)
- [Back to Grade 10 Java](../../README.md)
