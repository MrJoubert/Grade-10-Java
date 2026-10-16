# Text-Based User Interfaces

## Overview

A user interface (UI) is the part of a computer program through which a user interacts with the application. It allows the user to provide information, make choices and view results.

A **text-based user interface** uses text to communicate with the user rather than relying primarily on graphical elements such as buttons, icons and images.

In Java, a simple text-based interface can be created using output statements and keyboard input. In this repository, we will also use `JOptionPane` to display messages and collect input through dialog boxes.

A well-designed interface should be clear, consistent and easy to use. Users should understand what information is required, what the program is doing and what result they can expect.

## Learning Objectives

By the end of this section, you should be able to:

- Explain what a user interface is.
- Describe the characteristics of a text-based user interface.
- Distinguish between text-based and graphical user interfaces.
- Display clear instructions and messages in Java.
- Collect information from a user using `JOptionPane`.
- Explain why clarity, consistency and appropriate feedback are important when designing an interface.

---

## 1. What Is a User Interface?

A user interface allows a person to communicate with a computer program.

For example, consider a program that calculates the average of two marks.

The program needs to communicate three things to the user:

1. Which marks must be entered.
2. What calculation is performed.
3. What the final answer is.

Without a clear interface, the user may not know what information to enter or how to interpret the result.

### Example of a poor interface

```java
JOptionPane.showInputDialog("Enter value:");
```

The instruction is vague. The user does not know which value is required.

### Example of a better interface

```java
JOptionPane.showInputDialog("Enter the first test mark:");
```

This prompt explains exactly what information is required.

**Key principle:** A good interface reduces confusion by communicating clearly with the user.

---

## 2. Characteristics of a Text-Based User Interface

A text-based interface communicates through written instructions, messages and information.

It may include:

- Instructions explaining what the user must do.
- Prompts requesting input.
- Menus presenting available options.
- Output displaying calculated results.
- Error messages explaining what went wrong.
- Confirmation messages indicating that an action has been completed.

### Example: A simple menu

```java
System.out.println("STUDENT MARKS SYSTEM");
System.out.println("--------------------");
System.out.println("1. Enter marks");
System.out.println("2. Calculate average");
System.out.println("3. Exit");
System.out.print("Select an option: ");
```

Output:

```text
STUDENT MARKS SYSTEM
--------------------
1. Enter marks
2. Calculate average
3. Exit
Select an option:
```

The menu has a heading, a clear list of options and an instruction explaining what the user must do.

Although this example displays the menu in the console, the same design principles apply to interfaces created with dialog boxes.

---

## 3. Displaying Messages with JOptionPane

Java provides the `JOptionPane` class for displaying dialog boxes.

Before using it, import the class:

```java
import javax.swing.JOptionPane;
```

### Displaying an informational message

Use `showMessageDialog()` to display a message.

```java
JOptionPane.showMessageDialog(null,
        "Welcome to the Student Marks System.");
```

The dialog displays the message and waits for the user to acknowledge it.

### Collecting input

Use `showInputDialog()` to request information from the user.

```java
String name = JOptionPane.showInputDialog(
        "Enter your name:");
```

The input is stored as a `String`, even if the user enters a number.

### Example: Collecting and displaying a name

```java
import javax.swing.JOptionPane;

public class StudentWelcome
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

The program first collects information and then uses that information to create a personalised message.

---

## 4. Making Instructions Clear

A well-designed interface tells the user exactly what is expected.

Compare the following prompts.

| Unclear prompt | Clearer prompt |
|---|---|
| `Enter value:` | `Enter the student's age:` |
| `Number:` | `Enter the number of items purchased:` |
| `Mark:` | `Enter the test mark out of 100:` |
| `Choice:` | `Enter 1 to calculate or 2 to exit:` |
| `Error` | `Invalid mark. Enter a value from 0 to 100.` |

Clear instructions help prevent incorrect input and reduce the need for users to guess.

When designing a prompt, consider:

- What information does the program require?
- Does the user know the expected format?
- Are any limits or restrictions important?
- Is the wording simple and unambiguous?

For example, if the program expects a whole number, the prompt should make this clear.

```java
String input = JOptionPane.showInputDialog(
        "Enter the number of students (whole number):");
```

---

## 5. Organising Information Clearly

The order in which information appears affects how easy the interface is to use.

A sensible sequence is:

1. Introduce the program.
2. Explain what the user must enter.
3. Collect the required information.
4. Display the result.
5. Explain any problems that occur.

### Example: A simple average calculator

```java
import javax.swing.JOptionPane;

public class AverageCalculator
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null,
                "Student Average Calculator");

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

For example, if the user enters `70` and `80`, the final message displays:

```text
The average mark is: 75.0
```

This program demonstrates a clear sequence of input, processing and output.

It assumes that the user enters valid numeric values. More robust handling of incorrect input will be covered in the validation section.

---

## 6. Text-Based Interfaces Compared with Graphical Interfaces

A text-based interface relies mainly on written information. A graphical user interface (GUI) uses visual elements to help users interact with a program.

| Feature | Text-based interface | Graphical user interface |
|---|---|---|
| Main interaction | Text and typed commands or responses | Visual controls such as buttons, menus and icons |
| Input | Often entered as text | May use text fields, buttons, lists and other controls |
| Presentation | Mainly text | Text combined with visual elements |
| Complexity | Can be simple to create | May require more interface design and programming |
| User guidance | Instructions and prompts | Instructions, labels and visual controls |
| Example | A console-based menu | A desktop application with buttons and menus |

`JOptionPane` displays graphical dialog boxes, even when the program itself is simple. It is therefore useful to distinguish between a console-based text interface and a graphical dialog-based interface.

The most appropriate interface depends on the program's purpose and the needs of its users.

---

## 7. Common Interface Design Mistakes

### Mistake 1: Using vague instructions

A prompt such as `Enter data` does not explain what is required.

**Improvement:** Use a specific instruction that identifies the expected information.

### Mistake 2: Displaying results without context

Displaying only `75` does not explain what the number represents.

**Improvement:**

```java
JOptionPane.showMessageDialog(null,
        "The average mark is: " + average);
```

### Mistake 3: Using inconsistent wording

If a program refers to a value as a `mark` in one place and a `score` in another, users may wonder whether these refer to different things.

**Improvement:** Use consistent terminology throughout the program.

### Mistake 4: Providing no feedback

If a program completes an operation without displaying a result or confirmation, the user may not know whether the operation succeeded.

**Improvement:** Display an appropriate result or confirmation message.

### Mistake 5: Assuming every input is valid

A user may enter text when a number is expected, or provide a value outside the allowed range.

**Improvement:** Validate input and explain how the user can correct it.

### Mistake 6: Overloading the user with information

Too much text in one message can make the important instruction difficult to find.

**Improvement:** Keep prompts concise and present information in a logical order.

---

## 8. Practical Challenge

Create a Java program called `StudentInformation` that uses `JOptionPane`.

Your program must:

1. Display a welcome message.
2. Ask the user to enter their name.
3. Ask the user to enter their grade.
4. Ask the user to enter their favourite school subject.
5. Display a summary containing all three responses.

For example, if the user enters `Alex`, `10` and `Information Technology`, the final message should communicate the information clearly.

### Extension challenges

- Improve the wording of every prompt.
- Add a confirmation message before displaying the final summary.
- Display the information on separate lines.
- Consider what should happen if the user does not enter a name.
- Consider what should happen if the user enters a grade outside the permitted range.

Do not assume that a prompt alone validates the information entered. Validation requires additional programming logic.

---

## Key Takeaways

- A user interface allows a person to interact with a computer program.
- Text-based interfaces communicate through instructions, prompts, menus and messages.
- `JOptionPane` can display messages and collect input through dialog boxes.
- Clear prompts reduce confusion and help users provide appropriate information.
- Output should explain what a result represents.
- Consistent wording and logical organisation improve usability.
- A good interface should provide appropriate feedback and account for incorrect input.

---

## Navigation

- [Previous main topic: Integrated Examples and Practice](../../12-Integrated-Examples-and-Practice/README.md)
- [Next: Input Prompts and Output Messages](../Input-Prompts-and-Output-Messages/README.md)
- [Back to User Interface and Validation](../README.md)
- [Back to Grade 10 Java](../../README.md)
