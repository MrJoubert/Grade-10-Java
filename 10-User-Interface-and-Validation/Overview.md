# User Interface and Validation

## Overview

A program should do more than produce the correct answer. It should also communicate clearly with the person using it, request information in an understandable way and respond appropriately when incorrect input is provided.

A **user interface (UI)** is the part of a computer system through which a user interacts with the program. In Grade 10 Java, you will work primarily with text-based interfaces and dialog boxes created using `JOptionPane`.

**Input validation** involves checking whether information supplied by a user meets specified requirements before the program processes it.

For example, a program that calculates a student's average should provide clear input prompts, accept appropriate marks, calculate the average correctly and display meaningful results. If the user enters an invalid mark, the program should respond appropriately rather than silently accepting the value.

This topic focuses on creating understandable, consistent and user-friendly Java programs.

## Learning Objectives

By the end of this topic, you should be able to:

- Explain the purpose of a user interface.
- Distinguish between text-based and graphical user interfaces.
- Create clear input prompts and output messages.
- Use `JOptionPane` to interact with a user.
- Explain why input validation is important.
- Validate numeric input against specified requirements.
- Use selection statements to respond to invalid input.
- Display meaningful error messages and feedback.
- Identify basic principles of effective user interface design.
- Compare desktop and mobile user interfaces.
- Apply basic validation and interface design to a Java program.

## IEB Curriculum Alignment

This topic supports Grade 10 IEB Information Technology programming skills involving user interface design, input, output, validation, testing and the development of usable solutions.

The examples focus on introductory Java programming, using `JOptionPane`, variables, selection and basic validation techniques.

The purpose is to help you develop programs that are not only logically correct but also understandable and appropriate for their intended users. This material is designed as a student learning resource and is not an official IEB publication.

## Topic Structure

Work through the following subtopics in order.

1. [Text-Based User Interfaces](Text-Based-User-Interfaces/README.md)
2. [Input Prompts and Output Messages](Input-Prompts-and-Output-Messages/README.md)
3. [Basic Input Validation](Basic-Input-Validation/README.md)
4. [Error Messages and User Feedback](Error-Messages-and-User-Feedback/README.md)
5. [User Interface Design Principles](User-Interface-Design-Principles/README.md)
6. [Desktop and Mobile UI Comparison](Desktop-and-Mobile-UI-Comparison/README.md)

---

## 1. What Is a User Interface?

A **user interface** is the means through which a person interacts with a computer program or system.

A user interface allows a person to provide information, request an action and receive feedback from the program.

Consider a program that calculates the total price of items purchased.

The user interface might need to:

1. Explain which information is required.
2. Allow the user to enter the price and quantity.
3. Display the calculated total.
4. Inform the user if an invalid value was entered.

Without an appropriate interface, a user might not know what to enter, how to proceed or whether the program has completed its task.

### Why is the user interface important?

A well-designed interface helps users:

- Understand what the program does.
- Enter the required information correctly.
- Interpret the results.
- Recognise and correct mistakes.
- Complete tasks with minimal confusion.

An effective interface should support the purpose of the program rather than distract from it.

## 2. Text-Based and Graphical User Interfaces

Two common forms of user interface are text-based interfaces and graphical user interfaces.

### Text-based user interface

A text-based interface communicates primarily through text. The user reads instructions, enters information and receives text output.

For example:

```text
Enter your age:
18

Your age is 18.
```

Text-based interfaces are useful for learning programming logic because the emphasis is on input, processing and output.

### Graphical user interface

A graphical user interface (GUI) uses visual elements such as windows, buttons, menus, icons and text fields.

Java's `JOptionPane` provides dialog boxes that can be used to request input and display messages.

For example:

```java
import javax.swing.JOptionPane;

String name = JOptionPane.showInputDialog(
    "Enter your name:"
);

JOptionPane.showMessageDialog(
    null,
    "Welcome, " + name + "!"
);
```

The first dialog requests the user's name. The second displays a welcome message.

Although the messages contain text, the dialog boxes are graphical interface elements.

### Comparing the interfaces

| Feature | Text-based interface | Graphical interface |
|---|---|---|
| Main interaction | Text and typed commands or responses | Visual controls and interactive elements |
| Appearance | Usually simple and text-focused | Can include windows, buttons, icons and menus |
| User guidance | Instructions must be communicated clearly through text | Guidance can also be provided through labels, icons and controls |
| Example | A console-based program | A Java program using `JOptionPane` |

The best choice depends on the task, the intended users and the environment in which the program will operate.

## 3. Creating Clear Input Prompts

An input prompt tells the user what information the program requires.

A vague prompt such as `Enter value` does not explain which value is required or what format should be used.

A better prompt is specific:

```java
String name = JOptionPane.showInputDialog(
    "Enter the student's full name:"
);
```

Another example:

```java
String markInput = JOptionPane.showInputDialog(
    "Enter a mark between 0 and 100:"
);
```

The second prompt communicates both the type of information required and the permitted range.

### Principles for good prompts

A good input prompt should:

- Describe the required information.
- Use language appropriate to the intended user.
- Include units or permitted ranges when relevant.
- Avoid unnecessary technical terminology.
- Make it clear when a particular format is expected.

For example, if a program requires a temperature in degrees Celsius, the prompt should specify Celsius rather than simply asking for a temperature.

## 4. Displaying Meaningful Output

Output messages should communicate the result clearly.

Consider the following example:

```java
double price = 125.50;
int quantity = 3;

double total = price * quantity;

System.out.println(total);
```

Output:

```text
376.5
```

The result is mathematically correct, but the user must work out what the number represents.

A clearer version is:

```java
double price = 125.50;
int quantity = 3;

double total = price * quantity;

System.out.println("Price per item: R" + price);
System.out.println("Quantity: " + quantity);
System.out.println("Total cost: R" + total);
```

Output:

```text
Price per item: R125.5
Quantity: 3
Total cost: R376.5
```

The labels make the output easier to interpret.

For financial values, displaying two decimal places is often preferable. You can use `String.format` to format a result:

```java
double total = 376.5;

String formattedTotal = String.format("%.2f", total);

System.out.println("Total cost: R" + formattedTotal);
```

Output:

```text
Total cost: R376.50
```

Clear output should tell the user what a result means, not merely display a value.

## 5. What Is Input Validation?

**Input validation** is the process of checking whether information entered by a user satisfies specified rules.

A program may require input to:

- Be numeric.
- Fall within a permitted range.
- Be greater than zero.
- Match an expected format.
- Meet a particular condition.

For example, a program that accepts a percentage mark may require a value between `0` and `100`.

A value of `75` is within this range. A value of `125` is not.

Validation is important because users can make mistakes, misunderstand instructions or enter values that the program was not designed to process.

### Validation versus conversion

These are related but different operations.

- **Conversion** changes a value from one data type to another.
- **Validation** checks whether the value meets the program's requirements.

For example, `Integer.parseInt` converts a numeric String into an integer. It does not check whether that integer is a valid mark.

A value can be successfully converted and still be invalid for the program.

## 6. Basic Input Validation in Java

Consider a program that accepts a mark and checks whether it is between `0` and `100`.

```java
import javax.swing.JOptionPane;

String input = JOptionPane.showInputDialog(
    "Enter a mark between 0 and 100:"
);

int mark = Integer.parseInt(input);

if (mark >= 0 && mark <= 100) {
    JOptionPane.showMessageDialog(
        null,
        "Valid mark entered."
    );
} else {
    JOptionPane.showMessageDialog(
        null,
        "Invalid mark. Enter a value from 0 to 100."
    );
}
```

### How the validation works

The condition is:

```java
mark >= 0 && mark <= 100
```

The `&&` operator means **AND**. Both conditions must be true.

- `mark >= 0` checks that the mark is not below zero.
- `mark <= 100` checks that the mark is not above one hundred.

If both conditions are true, the mark is within the permitted range.

If either condition is false, the program displays an error message.

### Important limitation

The example assumes that the user enters a valid integer. If the user enters text such as `hello`, `Integer.parseInt` throws a `NumberFormatException`.

The range check cannot prevent this because conversion occurs before the validation condition.

A more robust program must also consider whether the input can be converted successfully.

## 7. Handling Invalid Numeric Input

When a program converts user input into a number, the conversion may fail.

For example:

```java
int age = Integer.parseInt("eighteen");
```

The String `"eighteen"` cannot be converted into an integer using `Integer.parseInt`.

Java throws a `NumberFormatException`.

One way to handle this situation is with a `try-catch` statement.

```java
import javax.swing.JOptionPane;

String input = JOptionPane.showInputDialog(
    "Enter your age:"
);

try {
    int age = Integer.parseInt(input);

    if (age >= 0) {
        JOptionPane.showMessageDialog(
            null,
            "Age entered: " + age
        );
    } else {
        JOptionPane.showMessageDialog(
            null,
            "Age cannot be negative."
        );
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(
        null,
        "Invalid input. Enter a whole number."
    );
}
```

This example demonstrates two separate checks:

1. **Conversion check:** Can the input be converted into an integer?
2. **Range check:** Is the converted integer permitted?

The `try-catch` structure is useful when you want to prevent invalid numeric text from terminating the program unexpectedly. Exception handling may be explored in greater depth in later programming work.

For this example, cancellation of the input dialog is not handled separately. In a more complete program, you should decide how the application should respond when the user cancels.

## 8. Validation Using Selection

Selection statements allow a program to respond differently depending on whether input is valid.

Consider a program that checks whether a number is positive.

```java
import javax.swing.JOptionPane;

String input = JOptionPane.showInputDialog(
    "Enter a number:"
);

int number = Integer.parseInt(input);

if (number > 0) {
    JOptionPane.showMessageDialog(
        null,
        "The number is positive."
    );
} else if (number == 0) {
    JOptionPane.showMessageDialog(
        null,
        "The number is zero."
    );
} else {
    JOptionPane.showMessageDialog(
        null,
        "The number is negative."
    );
}
```

The program checks the input and displays an appropriate message for each possible category.

However, a number being positive, zero or negative is a classification, not necessarily a validation rule. Whether a negative number is invalid depends on the requirements of the particular problem.

**Always distinguish between what a program can accept and what it should accept.**

## 9. Error Messages and User Feedback

An error message informs the user that something has gone wrong or that the supplied information does not meet the requirements.

Good error messages should explain the problem and, where possible, tell the user how to correct it.

| Weak message | Improved message |
|---|---|
| Error | The mark must be between 0 and 100. |
| Wrong | Enter a whole number for the quantity. |
| Invalid input | The date must use the required format. |
| Failed | The password does not meet the stated requirements. |

A useful error message should be:

- Specific.
- Understandable.
- Polite.
- Relevant to the problem.
- Helpful in guiding the next action.

### Positive feedback is also important

A program should communicate successful actions as well as errors.

For example:

```java
JOptionPane.showMessageDialog(
    null,
    "Your details have been saved successfully."
);
```

Feedback reassures the user that the program has completed the intended operation.

Do not display a success message before confirming that the relevant operation has actually succeeded.

## 10. User Interface Design Principles

A good user interface should make the program easy to understand and use.

### Consistency

Use consistent wording, labels, formatting and interaction patterns.

If one screen uses `Student name`, avoid changing the same label to `Learner's full name` elsewhere without a reason.

### Clarity

Use understandable language and make the purpose of each prompt or message obvious.

### Simplicity

Include the controls and information needed for the task without overwhelming the user.

### Appropriate feedback

Inform users about successful actions, errors and any additional steps required.

### Error prevention

Design prompts and controls that reduce the chance of incorrect input.

For example, telling a user that a mark must be between `0` and `100` can prevent confusion.

### Readability

Use clear labels, suitable spacing and readable text. Important information should not be hidden in long or confusing messages.

### Accessibility

Consider users with different needs. Instructions should not rely only on colour, and text should be readable and understandable.

### Suitability for the intended user

An interface designed for young students may use different language and guidance from an interface designed for experienced professionals.

The interface should match the task and the people who will use it.

## 11. Desktop and Mobile User Interfaces

Desktop and mobile interfaces often have different design constraints.

| Consideration | Desktop interface | Mobile interface |
|---|---|---|
| Screen size | Usually has more available screen space. | Usually has less screen space. |
| Input methods | Often uses a keyboard and mouse. | Often uses a touchscreen and on-screen keyboard. |
| Controls | Can accommodate more visible controls. | Benefits from touch-friendly controls. |
| Layout | Can display several sections side by side. | Often works better with a simple, compact layout. |
| User interaction | May support detailed, multi-window workflows. | Often prioritises quick actions and straightforward navigation. |

These are general tendencies rather than absolute rules. Desktop and mobile applications can share many design principles, but their layouts should suit the devices and contexts in which they are used.

### Example

A desktop application might display several data fields in a single window.

A mobile application might arrange the same fields vertically, using larger touch targets and fewer items on each screen.

Both interfaces should still provide clear prompts, appropriate feedback and understandable error messages.

## Common Mistakes

Avoid the following mistakes when developing user interfaces and validation:

- Using vague input prompts.
- Displaying results without explaining what they represent.
- Assuming that all user input will be correct.
- Confusing numeric conversion with validation.
- Checking the permitted range only after an invalid conversion has already occurred.
- Forgetting that `&&` requires both conditions to be true.
- Using the wrong comparison operator when checking a range.
- Displaying an error message that does not explain how to correct the problem.
- Treating every unusual value as invalid without considering the problem requirements.
- Using inconsistent labels and messages.
- Overloading the interface with unnecessary information.
- Ignoring the needs of the intended user.
- Displaying a success message when an operation has not succeeded.

## Recommended Study Approach

Use the following method when designing or evaluating a program's user interface.

1. **Identify the user.** Consider who will use the program and what they need to accomplish.
2. **Identify the required input.** Determine what information the program needs.
3. **Design clear prompts.** Explain what the user must enter and any applicable restrictions.
4. **Identify validation rules.** Decide which values or formats are acceptable.
5. **Plan the response to invalid input.** Determine which error messages or corrective actions are appropriate.
6. **Design meaningful output.** Make results easy to interpret.
7. **Implement the interface.** Use `JOptionPane` and the relevant Java constructs.
8. **Test the program.** Check valid, invalid and boundary values.
9. **Review usability.** Ask whether the prompts, messages and interactions are clear.

When answering examination questions about interface design, relate your explanation to the intended user and the specific task. Avoid giving general statements without explaining why they are relevant.

## Practical Challenge

Develop a Java program that asks a user to enter a student's name and an assessment mark.

Your program must:

1. Ask for the student's name.
2. Ask for a mark between `0` and `100`.
3. Convert the entered mark into an integer.
4. Check that the mark falls within the permitted range.
5. Display a suitable message for a valid mark.
6. Display a clear error message when the mark falls outside the permitted range.
7. Handle input that cannot be converted into an integer.
8. Display the student's name and mark when the input is valid.

### Requirements

- Use `JOptionPane` for input and output.
- Use meaningful variable names.
- Use a relational operator to check the permitted range.
- Use a logical operator where appropriate.
- Separate conversion errors from range-validation errors.
- Provide understandable prompts and feedback.

### Test your program

Try the following inputs:

| Test input | Expected behaviour |
|---|---|
| `75` | Accept the mark. |
| `0` | Accept the lower boundary. |
| `100` | Accept the upper boundary. |
| `-5` | Reject the mark as outside the range. |
| `120` | Reject the mark as outside the range. |
| `hello` | Display a numeric-input error message. |

Also consider what should happen if the user cancels the input dialog or enters no value. Decide how your program should handle these situations.

## Key Takeaways

- A user interface allows a person to interact with a program.
- Text-based and graphical interfaces provide different forms of interaction.
- `JOptionPane` can be used to request input and display messages in Java.
- Input prompts should clearly explain what information is required.
- Output should communicate the meaning of a result.
- Input validation checks whether supplied information meets specified rules.
- Conversion and validation are different operations.
- A value may convert successfully but still be invalid.
- Relational and logical operators can be used to validate values against conditions.
- `try-catch` can be used to handle invalid numeric conversions.
- Good error messages explain the problem and help users correct it.
- Consistency, clarity, simplicity, accessibility and feedback contribute to effective interface design.
- Programs should be tested with valid, invalid, boundary and unusual input.

---

## Navigation

- [Previous: Algorithms and Problem Solving](../09-Algorithms-and-Problem-Solving/README.md)
- **Current topic: User Interface and Validation**
- [Next: Testing and Debugging](../11-Testing-and-Debugging/README.md)
- [Back to the Grade 10 Java Library](../README.md)

