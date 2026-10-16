# Error Messages and User Feedback

## Overview

A well-designed Java program should communicate with the user throughout the interaction. When something goes wrong, the program should explain the problem and, where possible, tell the user how to correct it.

**Error messages** inform users that something has gone wrong or that the information they entered is unacceptable. **User feedback** communicates the outcome of an action, such as confirming that a calculation has been completed or explaining that input must be corrected.

In Grade 10 Information Technology, you should be able to design meaningful messages, use selection statements to respond to different situations and improve the usability of a program through clear communication.

## Learning Objectives

By the end of this section, you should be able to:

- Explain the purpose of error messages and user feedback.
- Distinguish between error, warning, informational and confirmation messages.
- Display messages using `JOptionPane.showMessageDialog()`.
- Use selection statements to display appropriate messages.
- Write helpful messages that explain problems and suggest corrections.
- Identify poor feedback in a user interface and improve it.
- Test whether a program provides appropriate feedback for different inputs.

---

## 1. Why Is User Feedback Important?

Imagine entering a mark into a program and receiving no response. You would not know whether the program accepted the mark, calculated a result or encountered a problem.

Feedback helps the user understand what the program is doing and what action may be required next.

For example, consider a program that accepts marks from 0 to 100.

If the user enters `75`, the program can confirm that the mark is valid.

If the user enters `150`, the program should explain that the mark is outside the permitted range.

Without appropriate feedback, users may become confused or repeat actions unnecessarily.

Good feedback should be:

- **Clear:** The user understands the message.
- **Specific:** The message identifies the problem or outcome.
- **Helpful:** It explains what the user should do next, where appropriate.
- **Appropriate:** The message suits the situation.
- **Consistent:** Similar situations use similar wording.

---

## 2. Types of Messages

Different situations require different messages.

### 2.1 Informational messages

An informational message provides useful information to the user.

Example:

```java
JOptionPane.showMessageDialog(null,
        "Welcome to the Student Marks System.");
```

This message introduces the application.

### 2.2 Error messages

An error message explains that something has gone wrong or that an action cannot be completed.

Example:

```java
JOptionPane.showMessageDialog(null,
        "Invalid mark. Enter a value from 0 to 100.");
```

This message explains the problem and tells the user what is expected.

### 2.3 Warning messages

A warning alerts the user to a potentially important situation that may require attention.

For example:

```java
JOptionPane.showMessageDialog(null,
        "Warning: Check the mark before continuing.");
```

This example displays a warning-style message in ordinary text. More specialised dialog icons and message types are also available in `JOptionPane`, but the essential Grade 10 principle is to communicate the situation clearly.

### 2.4 Confirmation messages

A confirmation message tells the user that an action has been completed or accepted.

Example:

```java
JOptionPane.showMessageDialog(null,
        "The mark has been accepted.");
```

This reassures the user that the program has processed the input successfully.

---

## 3. Displaying Feedback with JOptionPane

Java's `JOptionPane.showMessageDialog()` method can display messages in dialog boxes.

First, import the class:

```java
import javax.swing.JOptionPane;
```

You can then display a message:

```java
JOptionPane.showMessageDialog(null,
        "Calculation completed successfully.");
```

The first argument, `null`, indicates that the dialog has no specified parent component.

The second argument contains the message to display.

### Example: Responding to a mark

```java
import javax.swing.JOptionPane;

public class MarkFeedback
{
    public static void main(String[] args)
    {
        int mark = 75;

        if (mark >= 0 && mark <= 100)
        {
            JOptionPane.showMessageDialog(null,
                    "Valid mark. Your mark is " + mark + ".");
        }
        else
        {
            JOptionPane.showMessageDialog(null,
                    "Invalid mark. Enter a value from 0 to 100.");
        }
    }
}
```

Because the value of `mark` is `75`, the program displays:

```text
Valid mark. Your mark is 75.
```

If the value were changed to `150`, the program would display the error message instead.

The program uses an `if-else` statement to decide which message is appropriate.

---

## 4. Writing Helpful Error Messages

An error message should do more than simply announce that something is wrong.

Consider these examples.

| Poor message | Improved message |
|---|---|
| `Error` | `Invalid mark. Enter a value from 0 to 100.` |
| `Wrong input` | `Invalid quantity. Enter a whole number greater than zero.` |
| `Failed` | `The calculation could not be completed because the input is invalid.` |
| `Try again` | `Please enter a valid menu option: 1, 2 or 3.` |
| `Incorrect` | `The age cannot be negative. Enter a value of zero or more.` |

The improved messages explain the problem and, where appropriate, provide a correction.

When designing an error message, ask yourself:

1. Does the user understand what went wrong?
2. Does the message identify the incorrect value or requirement?
3. Does the user know how to correct the problem?
4. Is the message polite and easy to understand?

Avoid technical language that the intended user may not understand.

---

## 5. Providing Feedback After Processing

Feedback is also important when a program completes an operation successfully.

Consider a program that calculates the total cost of a purchase.

```java
import javax.swing.JOptionPane;

public class PurchaseTotal
{
    public static void main(String[] args)
    {
        double price = 25.50;
        int quantity = 4;

        double total = price * quantity;

        JOptionPane.showMessageDialog(null,
                "Purchase calculation completed.\n"
                + "Price per item: R" + price
                + "\nQuantity: " + quantity
                + "\nTotal cost: R" + total);
    }
}
```

Output:

```text
Purchase calculation completed.
Price per item: R25.5
Quantity: 4
Total cost: R102.0
```

The program confirms that the calculation is complete and displays the relevant details.

The `\n` escape sequence starts a new line, making the information easier to read.

In a real application, you could collect the price and quantity from the user instead of using fixed values.

---

## 6. Combining Validation and Feedback

Error messages become especially useful when combined with input validation.

Consider a program that checks whether a mark is within the permitted range.

```java
import javax.swing.JOptionPane;

public class ValidatedMark
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog(
                "Enter a mark from 0 to 100:");

        int mark = Integer.parseInt(input);

        if (mark >= 0 && mark <= 100)
        {
            JOptionPane.showMessageDialog(null,
                    "Mark accepted successfully.");
        }
        else
        {
            JOptionPane.showMessageDialog(null,
                    "Invalid mark. Enter a value from 0 to 100.");
        }
    }
}
```

The program checks the numerical value and displays feedback according to the result.

However, this example assumes that the user enters a valid integer. If the user enters text such as `hello`, the conversion will fail before the validation condition can be evaluated.

A more robust program must also handle invalid numeric input and consider what should happen if the user cancels the dialog.

---

## 7. Common Mistakes

### Mistake 1: Displaying a message that is too vague

Incorrect:

```java
JOptionPane.showMessageDialog(null, "Error");
```

The user does not know what went wrong.

Improved:

```java
JOptionPane.showMessageDialog(null,
        "Invalid mark. Enter a value from 0 to 100.");
```

### Mistake 2: Displaying the same message for every outcome

A program should not display a success message when the input is invalid.

Use selection statements to display different messages for different conditions.

### Mistake 3: Providing feedback without explaining the result

Displaying only a number may leave the user unsure what it represents.

Improved:

```java
JOptionPane.showMessageDialog(null,
        "The average mark is: " + average);
```

### Mistake 4: Using messages that blame the user

Messages such as `You entered this incorrectly` are less helpful than neutral instructions.

Prefer:

`Invalid input. Please enter a whole number.`

### Mistake 5: Assuming a message validates input

Displaying an instruction does not guarantee that the user follows it.

A message must be supported by appropriate validation logic if the program needs to enforce a rule.

---

## 8. Testing and Debugging

Test your program to determine whether it displays the correct message for each situation.

For a mark that must be between 0 and 100, inclusive, use the following test cases.

| Input | Expected feedback |
|---:|---|
| -1 | Error message explaining that the mark is too low |
| 0 | Confirmation that the mark is accepted |
| 50 | Confirmation that the mark is accepted |
| 100 | Confirmation that the mark is accepted |
| 101 | Error message explaining the permitted range |

Also consider what happens when the user enters text instead of a number.

When testing feedback, check that:

- The correct message appears.
- The wording is clear.
- The message gives useful information.
- The program does not incorrectly display success after invalid input.
- The message is consistent with the program's validation rules.

---

## 9. Practical Challenge

Create a Java program called `StudentMarkFeedback`.

Your program must:

1. Ask the user to enter a mark out of 100 using `JOptionPane`.
2. Convert the input to an integer.
3. Check whether the mark is between 0 and 100, inclusive.
4. Display a confirmation message if the mark is valid.
5. Display a helpful error message if the mark is outside the permitted range.

### Extension challenges

- If the mark is valid, also display whether the student has passed, using 50 as the pass mark.
- Improve the error message so that it explains the expected range.
- Repeat the input prompt until a valid mark is entered.
- Handle text entered instead of a number.
- Test the program using `0`, `50`, `100`, `-1` and `101`.

---

## Key Takeaways

- Error messages explain problems or unacceptable input.
- Informational messages communicate useful information.
- Warning messages draw attention to situations that may require action.
- Confirmation messages reassure the user that an action has succeeded.
- `JOptionPane.showMessageDialog()` displays messages in dialog boxes.
- Good messages are clear, specific, helpful and appropriate.
- Selection statements allow a program to provide different feedback for different outcomes.
- Feedback should work together with validation to help users correct mistakes.

---

## Navigation

- [Previous: Basic Input Validation](../Basic-Input-Validation/README.md)
- [Next: User Interface Design Principles](../User-Interface-Design-Principles/README.md)
- [Back to User Interface and Validation](../README.md)
- [Back to Grade 10 Java](../../README.md)
