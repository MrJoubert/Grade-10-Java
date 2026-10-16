# Input Prompts and Output Messages

## Overview

Input prompts and output messages are important parts of a well-designed user interface. They allow a Java program to communicate with the user, collect the information required to solve a problem and explain the results.

An **input prompt** tells the user what information to enter. An **output message** displays information, results, instructions or feedback.

In Grade 10 Information Technology, you should be able to design clear prompts, collect input using `JOptionPane`, display meaningful results and organise the interaction between the user and the program.

A program may calculate the correct answer, but if the user does not understand what to enter or what the result means, the interface is not effective.

## Learning Objectives

By the end of this section, you should be able to:

- Explain the purpose of input prompts and output messages.
- Create clear, specific input prompts using `JOptionPane`.
- Display information and calculated results using `showMessageDialog()`.
- Combine input, processing and output in a Java program.
- Use meaningful messages to improve the user experience.
- Identify and improve poorly designed prompts and messages.
- Distinguish between displaying a result and providing useful feedback.

---

## 1. What Is an Input Prompt?

An input prompt is a message that asks the user to provide information.

In Java, you can use `JOptionPane.showInputDialog()` to display a dialog box that accepts input.

Example:

```java
String name = JOptionPane.showInputDialog(
        "Enter your name:");
```

The program displays a dialog box containing the message `Enter your name:`.

The text entered by the user is stored in the variable `name`.

Remember that `showInputDialog()` returns a `String`, even when the user enters a number.

### Writing effective prompts

A good prompt should be:

- **Clear:** The user understands what is required.
- **Specific:** The prompt identifies the information needed.
- **Concise:** It avoids unnecessary wording.
- **Appropriate:** The wording suits the task and its intended users.

Compare the following examples.

| Poor prompt | Improved prompt |
|---|---|
| `Enter data:` | `Enter your surname:` |
| `Number:` | `Enter the number of items purchased:` |
| `Mark:` | `Enter your test mark out of 100:` |
| `Age:` | `Enter your age in years:` |
| `Choice:` | `Enter 1 to calculate or 2 to exit:` |

The improved prompts reduce uncertainty and make the program easier to use.

---

## 2. What Is an Output Message?

An output message displays information to the user.

In Java, `JOptionPane.showMessageDialog()` can display a message in a dialog box.

Example:

```java
JOptionPane.showMessageDialog(null,
        "Welcome to the application.");
```

The program displays the message and waits for the user to acknowledge it.

Output messages can be used to display:

- Welcome messages.
- Calculated results.
- Summaries of information.
- Instructions.
- Warnings.
- Error messages.
- Confirmation messages.

### Displaying meaningful results

Suppose a program calculates a student's average mark.

A poorly designed output message might display only:

```text
75.0
```

The user has no indication of what the value represents.

A better message is:

```java
JOptionPane.showMessageDialog(null,
        "The average mark is: " + average);
```

If `average` is `75.0`, the dialog displays:

```text
The average mark is: 75.0
```

**Key principle:** An output message should explain the meaning of the information being displayed.

---

## 3. Collecting and Displaying Text

The following example asks for the user's name and then displays a personalised greeting.

```java
import javax.swing.JOptionPane;

public class Greeting
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog(
                "Enter your name:");

        JOptionPane.showMessageDialog(null,
                "Welcome, " + name + "!");
    }
}
```

If the user enters `Alex`, the output message is:

```text
Welcome, Alex!
```

The `+` operator joins the text with the value stored in `name`. This is called **String concatenation**.

The program follows a simple sequence:

1. Ask the user for their name.
2. Store the response in `name`.
3. Combine the name with a greeting.
4. Display the resulting message.

This is an example of input followed by output.

---

## 4. Displaying Multiple Values in One Message

Sometimes a program needs to display several pieces of information together.

For example, a program might calculate the total cost of a purchase.

```java
import javax.swing.JOptionPane;

public class TotalCost
{
    public static void main(String[] args)
    {
        double price = 25.50;
        int quantity = 4;

        double total = price * quantity;

        JOptionPane.showMessageDialog(null,
                "Price per item: R" + price
                + "\nQuantity: " + quantity
                + "\nTotal cost: R" + total);
    }
}
```

Output:

```text
Price per item: R25.5
Quantity: 4
Total cost: R102.0
```

The `\n` escape sequence starts a new line within the message.

This makes the information easier to read than displaying every value on one long line.

Notice that this example uses fixed values. In a practical application, you could collect the price and quantity from the user instead.

---

## 5. Combining Input, Processing and Output

Many Java programs follow three basic stages.

<escape>
| Stage | Purpose | Example |
|---|---|---|
| Input | Collect information | Ask for two marks |
| Processing | Perform a calculation | Calculate the average |
| Output | Display the result | Show the average mark |
</escape>

Consider the following complete program.

```java
import javax.swing.JOptionPane;

public class AverageCalculator
{
    public static void main(String[] args)
    {
        String firstInput = JOptionPane.showInputDialog(
                "Enter the first mark:");

        String secondInput = JOptionPane.showInputDialog(
                "Enter the second mark:");

        double firstMark = Double.parseDouble(firstInput);
        double secondMark = Double.parseDouble(secondInput);

        double average = (firstMark + secondMark) / 2.0;

        JOptionPane.showMessageDialog(null,
                "The average mark is: " + average);
    }
}
```

If the user enters `70` and `85`, the final message displays:

```text
The average mark is: 77.5
```

### Understanding the program

**Input**

```java
String firstInput = JOptionPane.showInputDialog(
        "Enter the first mark:");
```

The program asks the user to enter the first mark.

**Conversion**

```java
double firstMark = Double.parseDouble(firstInput);
```

The input is converted from a `String` to a `double`, allowing it to be used in a numerical calculation.

**Processing**

```java
double average = (firstMark + secondMark) / 2.0;
```

The two marks are added and divided by two.

**Output**

```java
JOptionPane.showMessageDialog(null,
        "The average mark is: " + average);
```

The calculated average is displayed with a descriptive message.

This example assumes that both inputs contain valid numeric values. Handling invalid input requires additional validation.

---

## 6. Improving Output Messages

Output messages should be designed around what the user needs to understand.

Consider a program that calculates whether a student has passed a test.

A basic message might be:

```java
JOptionPane.showMessageDialog(null, "Pass");
```

A more informative message might be:

```java
JOptionPane.showMessageDialog(null,
        "Your mark is " + mark + ". You have passed.");
```

The second message provides both the mark and the result.

However, additional information should only be included when it is useful. Long messages containing irrelevant details can make an interface confusing.

When designing an output message, ask yourself:

- Does the message explain what the result means?
- Is the wording easy to understand?
- Are the important details included?
- Is the information presented in a logical order?
- Is the message appropriate for the situation?

---

## 7. Common Mistakes

### Mistake 1: Using vague prompts

Incorrect:

```java
String input = JOptionPane.showInputDialog("Enter value:");
```

The user does not know which value is required.

Improved:

```java
String input = JOptionPane.showInputDialog(
        "Enter the number of items purchased:");
```

### Mistake 2: Displaying results without descriptions

Incorrect:

```java
JOptionPane.showMessageDialog(null, total);
```

Improved:

```java
JOptionPane.showMessageDialog(null,
        "The total cost is: R" + total);
```

### Mistake 3: Forgetting to convert numeric input

Incorrect:

```java
String input = JOptionPane.showInputDialog(
        "Enter your age:");

int nextYear = input + 1;
```

The variable `input` is a `String`, so Java cannot add the integer `1` to it in this way.

Correct:

```java
String input = JOptionPane.showInputDialog(
        "Enter your age:");

int age = Integer.parseInt(input);
int nextYear = age + 1;
```

### Mistake 4: Forgetting new lines

If several values are displayed in one message, they may become difficult to read if there is no separation.

Use `\n` to start a new line.

### Mistake 5: Assuming the user always enters valid information

A user may enter letters instead of numbers or close the input dialog without entering anything.

A prompt does not guarantee that the response is valid. A robust program must handle such situations appropriately.

---

## 8. Practical Challenge

Create a Java program called `ShoppingSummary`.

Your program must:

1. Display a welcome message.
2. Ask the user to enter the name of an item.
3. Ask for the price of one item.
4. Ask for the quantity purchased.
5. Calculate the total cost.
6. Display a clear summary containing the item name, price, quantity and total cost.

For example, if the user enters:

- Item name: Notebook
- Price: R15.50
- Quantity: 3

The final message should clearly communicate that the total cost is R46.50.

### Extension challenges

- Improve the wording of all input prompts.
- Display each detail on a separate line.
- Display a confirmation message before calculating the total.
- Consider what should happen if the quantity is zero or negative.
- Consider what should happen if the price is not a valid number.

The final two challenges introduce input validation, which is covered in a later section.

---

## Key Takeaways

- Input prompts tell users what information to provide.
- Output messages communicate results, instructions and feedback.
- `JOptionPane.showInputDialog()` collects input as a `String`.
- `JOptionPane.showMessageDialog()` displays information in a dialog box.
- String concatenation allows text and variable values to be combined.
- The `\n` escape sequence can improve the layout of a message.
- Clear and meaningful prompts and outputs improve the usability of a program.
- Programs should not assume that all user input is valid.

---

## Navigation

- [Previous: Text-Based User Interfaces](../Text-Based-User-Interfaces/README.md)
- [Next: Basic Input Validation](../Basic-Input-Validation/README.md)
- [Back to User Interface and Validation](../README.md)
- [Back to Grade 10 Java](../../README.md)
