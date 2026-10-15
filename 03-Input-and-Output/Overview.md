# Input and Output

## Overview

Input and output are fundamental parts of an interactive computer program. **Input** allows a program to receive information, while **output** allows it to communicate information and results to the user.

A program that only performs calculations using fixed values has limited flexibility. By accepting input from a user, the same program can process different information each time it runs.

For example, a program that calculates a Student's average mark can request two marks, calculate the average and display the result. The user can enter different marks without the programmer having to change the source code.

In Java, input and output are commonly used together with variables, data types, operators, calculations and selection statements.

This topic introduces the techniques required to obtain keyboard input, display meaningful output, convert input into suitable data types, combine input with processing and present information clearly.

The content is intended for **Grade 10 Information Technology Students studying Java according to the IEB curriculum**.

---

## Learning Objectives

By completing this topic, you should be able to:

- Explain the difference between input, processing and output.
- Describe the purpose of input and output in a Java program.
- Obtain keyboard input using `JOptionPane`.
- Display messages and calculated results using `JOptionPane`.
- Distinguish between text input and numerical values.
- Convert String input into appropriate numeric data types.
- Store input in variables and use it in calculations.
- Combine input, processing and output to solve simple problems.
- Present output using meaningful messages and appropriate formatting.
- Identify and correct common input and output errors.

---

## Curriculum Alignment

This topic supports the Grade 10 programming concepts associated with keyboard input, output, data types, calculations and the input-processing-output model.

It also reinforces the use of variables and type conversion when processing information supplied by a user.

The material focuses on introductory Java programming and the construction of simple interactive programs.

**Curriculum note:** This repository is a supplementary learning resource. Students should use these notes alongside prescribed course material, practical activities and official IEB assessment guidance.

---

## Topic Structure

This topic is divided into five subtopics.

| Subtopic | What You Will Learn |
|---|---|
| [Keyboard Input with JOptionPane](Keyboard-Input-with-JOptionPane/README.md) | Obtain information from the user through dialog boxes using `JOptionPane`. |
| [Displaying Output](Displaying-Output/README.md) | Display messages, variable values and calculated results. |
| [Input Conversion](Input-Conversion/README.md) | Convert String input into numeric values before performing calculations. |
| [Combining Input, Processing and Output](Combining-Input-Processing-and-Output/README.md) | Develop complete programs that accept input, process information and display results. |
| [Formatting Output](Formatting-Output/README.md) | Improve the clarity and readability of program output. |

---

## 1. The Input-Processing-Output Model

Most introductory programs follow a simple sequence:

1. **Input:** Obtain the information required by the program.
2. **Processing:** Perform calculations or other operations on the information.
3. **Output:** Display the results.

This sequence is often called the **input-processing-output (IPO) model**.

Consider a program that calculates the total cost of two products.

- Input: The prices of the two products.
- Processing: Add the prices together.
- Output: Display the total cost.

The IPO model provides a useful way to plan a program before writing Java code.

### Example

```java
double price1 = 45.50;
double price2 = 29.99;

double total = price1 + price2;

System.out.println("Total cost: R" + total);
```

Output:

```text
Total cost: R75.49
```

This example uses fixed values. In an interactive program, the prices could instead be obtained from the user.

---

## 2. Obtaining Input with JOptionPane

Java provides the `JOptionPane` class to display dialog boxes that allow a program to interact with a user.

For introductory desktop Java programs, `JOptionPane.showInputDialog()` is a convenient way to obtain input.

### Example

```java
import javax.swing.JOptionPane;

public class UserInput {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(
            "Enter your name:"
        );

        JOptionPane.showMessageDialog(
            null,
            "Welcome, " + name + "!"
        );
    }
}
```

The program first displays an input dialog requesting the user's name. It then displays a message dialog containing a greeting.

The variable `name` is declared as a `String` because `showInputDialog()` returns text.

**Important:** Input received through `showInputDialog()` is text, even when the user enters digits. If the program needs to perform numerical calculations, the input must first be converted into a suitable numeric type.

---

## 3. Displaying Output

Output communicates information to the user. It should be clear, relevant and easy to understand.

Two common approaches in introductory Java programs are:

- `System.out.println()` for console output.
- `JOptionPane.showMessageDialog()` for dialog-box output.

### Console Output

```java
int mark = 85;

System.out.println("Mark: " + mark);
```

Output:

```text
Mark: 85
```

### Dialog-Box Output

```java
import javax.swing.JOptionPane;

public class DisplayOutput {
    public static void main(String[] args) {
        int mark = 85;

        JOptionPane.showMessageDialog(
            null,
            "Your mark is " + mark
        );
    }
}
```

The second example displays the message in a dialog box instead of the console.

Choose the output method that suits the purpose of the program and the expected user interface.

---

## 4. Converting Input into Numeric Values

Since `JOptionPane.showInputDialog()` returns a `String`, numerical input must be converted before it can be used in arithmetic calculations.

Java provides conversion methods such as:

- `Integer.parseInt()` to convert a String into an `int`.
- `Double.parseDouble()` to convert a String into a `double`.

### Example: Reading an Integer

```java
import javax.swing.JOptionPane;

public class IntegerInput {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(
            "Enter your age:"
        );

        int age = Integer.parseInt(input);

        JOptionPane.showMessageDialog(
            null,
            "Your age is " + age
        );
    }
}
```

The program receives text, converts it to an integer and displays the resulting value.

### Example: Reading a Decimal Number

```java
import javax.swing.JOptionPane;

public class DecimalInput {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(
            "Enter a decimal number:"
        );

        double number = Double.parseDouble(input);

        JOptionPane.showMessageDialog(
            null,
            "You entered " + number
        );
    }
}
```

The input is converted into a `double`, allowing the program to perform decimal calculations.

**Important:** These parsing methods expect valid numerical input. If the user enters text that cannot be converted, Java throws a `NumberFormatException`. Invalid input and validation are addressed in more detail in the User Interface and Validation topic.

---

## 5. Combining Input, Processing and Output

A useful Java program combines user input with processing and output.

The following example calculates the average of two marks entered by the user.

### Example: Calculating an Average

```java
import javax.swing.JOptionPane;

public class CalculateAverage {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog(
            "Enter the first mark:"
        );

        String input2 = JOptionPane.showInputDialog(
            "Enter the second mark:"
        );

        int mark1 = Integer.parseInt(input1);
        int mark2 = Integer.parseInt(input2);

        double average = (mark1 + mark2) / 2.0;

        JOptionPane.showMessageDialog(
            null,
            "Average mark: " + average
        );
    }
}
```

### Understanding the Program

**Input**

The program requests two marks and stores the entered text in `input1` and `input2`.

**Processing**

The two Strings are converted to integers. Their values are added and divided by `2.0`.

**Output**

The calculated average is displayed in a message dialog.

Using `2.0` ensures that the division is performed using floating-point arithmetic, allowing the average to contain a decimal component.

### Sample Run

If the user enters `71` and `84`, the output will be:

```text
Average mark: 77.5
```

This example demonstrates how input, processing and output work together to create an interactive program.

---

## 6. Common Input and Output Errors

### Error 1: Treating text input as a number

Incorrect:

```java
String input = JOptionPane.showInputDialog(
    "Enter a number:"
);

System.out.println(input + 5);
```

If the user enters `10`, the result is:

```text
105
```

The `+` operator concatenates the String `"10"` with the text `"5"`.

To perform numerical addition, convert the input first:

```java
int number = Integer.parseInt(input);

System.out.println(number + 5);
```

The result is `15`.

### Error 2: Forgetting to convert decimal input

If the program needs a decimal result, converting the input to an integer may not be appropriate.

Use `Double.parseDouble()` when the program needs to process decimal values.

### Error 3: Forgetting the import statement

To use `JOptionPane`, include:

```java
import javax.swing.JOptionPane;
```

Without the appropriate import, Java may not recognise the class when it is referenced by its simple name.

### Error 4: Displaying unclear messages

A message such as `Result: 75` is more useful than displaying `75` alone.

Good output should explain what the value represents.

### Error 5: Assuming input will always be valid

Users may enter letters instead of numbers, leave a field blank or cancel an input dialog.

Programs that convert input into numeric values should consider how invalid or missing input will be handled.

---

## 7. Good Input and Output Practices

When developing interactive Java programs:

- Use clear and specific input prompts.
- Store input in appropriately named variables.
- Convert input into the correct data type before processing it.
- Separate input, processing and output into logical steps.
- Display results with descriptive messages.
- Use meaningful variable names.
- Avoid unnecessarily complicated expressions.
- Consider what should happen if the user enters invalid data.
- Test programs with different input values.

These practices make programs easier to understand, use, test and maintain.

---

## 8. Practical Applications

Input and output are used in many everyday programming tasks.

### Student Information

Request a Student's name and age, then display a personalised message.

### Examination Marks

Request two or more marks, calculate a total or average, and display the result.

### Shopping Calculations

Request the price and quantity of an item, calculate the total cost and display it.

### Unit Conversion

Request a measurement, convert it into another unit and display the converted value.

Each of these tasks follows the same fundamental IPO process.

---

## 9. Practical Challenge

Create a Java program called `StudentMarks` that:

1. Requests the Student's name.
2. Requests two examination marks.
3. Converts the marks into integers.
4. Calculates the total.
5. Calculates the average using a `double`.
6. Displays the Student's name, both marks, total and average in a message dialog.

Test the program using different values.

**Extension activities:**

- Add a third examination mark.
- Display the average to two decimal places.
- Improve the wording of all input prompts and output messages.
- Consider what should happen if the user enters non-numeric text.

---

## 10. Key Takeaways

By the end of this topic, you should understand that:

- Input allows a program to receive information.
- Processing uses the input to perform calculations or other operations.
- Output communicates information and results to the user.
- `JOptionPane.showInputDialog()` returns a String.
- `Integer.parseInt()` converts valid numeric text into an integer.
- `Double.parseDouble()` converts valid numeric text into a double.
- `System.out.println()` and `JOptionPane.showMessageDialog()` can display output in different ways.
- Clear prompts and descriptive output improve usability.
- Input, processing and output work together to form complete programs.

These skills are essential for developing interactive Java programs and will be used throughout the remaining topics in this repository.

---

## Navigation

[**← Previous: Operators and Calculations**](../02-Operators-and-Calculations/README.md)

[**Next: Type Conversion and Casting →**](../04-Type-Conversion-and-Casting/README.md)

[Return to the Grade 10 Java repository](../README.md)
