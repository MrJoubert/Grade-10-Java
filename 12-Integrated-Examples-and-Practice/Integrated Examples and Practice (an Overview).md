# Integrated Examples and Practice

## Overview

Programming concepts become easier to understand when you apply them to complete problems. In this topic, you will combine the Java skills developed throughout Grade 10 to design, implement, test and improve programs.

Instead of focusing on one concept at a time, you will work with problems that require several concepts to be used together. These may include variables, calculations, input and output, type conversion, String manipulation, Boolean logic, selection, loops, methods, algorithms, validation and testing.

The purpose of this section is to help you move from understanding individual programming concepts to solving complete programming problems independently.

The examples and activities are designed for Grade 10 Information Technology students following the IEB curriculum. They use introductory Java techniques and avoid relying on more advanced topics such as arrays, which belong to later Grade 10–12 programming progression.

## Learning Objectives

By the end of this topic, you should be able to:

- Combine variables, calculations, input and output in complete programs.
- Accept and convert user input using `JOptionPane`.
- Validate input against specified requirements.
- Use selection statements to make decisions.
- Use loops to repeat instructions.
- Manipulate and compare Strings.
- Create and call simple methods.
- Apply common algorithms to solve problems.
- Develop a solution from a problem description.
- Write pseudocode before implementing a program.
- Test programs using standard, extreme and abnormal data.
- Identify and correct syntax, runtime and logical errors.
- Explain your programming decisions clearly.
- Approach examination-style questions systematically.

## IEB Curriculum Alignment

This topic consolidates Grade 10 IEB Information Technology programming concepts, including computational thinking, variables, data types, calculations, input and output, type conversion, Strings, Boolean logic, selection, repetition, methods, algorithm development, validation, testing and debugging.

The exercises are intended to provide opportunities to apply these concepts in integrated solutions. The precise requirements of any formal assessment should always be checked against the applicable IEB Subject Assessment Guidelines (SAGS).

This is an educational resource for students and is not an official IEB publication.

## Topic Structure

Work through the following subtopics in order.

1. [Variables and Calculations](Variables-and-Calculations/README.md)
2. [Input Validation Programs](Input-Validation-Programs/README.md)
3. [Selection and Loop Programs](Selection-and-Loop-Programs/README.md)
4. [String and Character Programs](String-and-Character-Programs/README.md)
5. [Methods and Modular Programs](Methods-and-Modular-Programs/README.md)
6. [Algorithm Practice](Algorithm-Practice/README.md)
7. [Exam-Style Questions](Exam-Style-Questions/README.md)

---

## 1. How to Approach an Integrated Programming Problem

An integrated problem requires you to use more than one programming concept to produce a complete solution.

For example, consider the following problem:

**Develop a program that accepts a student's name and three marks, calculates the average, determines whether the student has achieved an average of at least 50, and displays a suitable message.**

This problem requires several skills:

- String input.
- Numeric input and conversion.
- Variables and data types.
- Arithmetic calculations.
- Selection statements.
- Output messages.
- Testing.

Do not begin by writing Java code immediately. First, identify the requirements and plan the solution.

### Step 1: Identify the input

The program requires:

- The student's name.
- The first mark.
- The second mark.
- The third mark.

### Step 2: Identify the processing

The program must:

1. Add the three marks.
2. Divide the total by three.
3. Check whether the average is at least 50.

### Step 3: Identify the output

The program must display:

- The student's name.
- The calculated average.
- A suitable result message.

### Step 4: Plan the algorithm

```text id="e5v6rx"
START
    INPUT studentName
    INPUT mark1
    INPUT mark2
    INPUT mark3

    total ← mark1 + mark2 + mark3
    average ← total / 3

    IF average >= 50 THEN
        OUTPUT "Average is a pass"
    ELSE
        OUTPUT "Average is below the pass requirement"
    ENDIF

    OUTPUT studentName
    OUTPUT average
END
```

This pseudocode describes the intended logic. The Java implementation must also use appropriate data types, convert the entered values and handle input according to the problem's requirements.

---

## 2. Integrated Example: Variables and Calculations

The following program calculates the total cost of three products.

### Problem statement

Write a Java program that asks the user for the prices of three products, calculates the total cost and displays the result.

### Java solution

```java
import javax.swing.JOptionPane;

public class ProductTotal {

    public static void main(String[] args) {

        String input1 = JOptionPane.showInputDialog(
            "Enter the price of product 1:"
        );

        String input2 = JOptionPane.showInputDialog(
            "Enter the price of product 2:"
        );

        String input3 = JOptionPane.showInputDialog(
            "Enter the price of product 3:"
        );

        double price1 = Double.parseDouble(input1);
        double price2 = Double.parseDouble(input2);
        double price3 = Double.parseDouble(input3);

        double total = price1 + price2 + price3;

        JOptionPane.showMessageDialog(
            null,
            "Total cost: R" + String.format("%.2f", total)
        );
    }
}
```

### Example input

- Product 1: `25.50`
- Product 2: `18.00`
- Product 3: `12.50`

### Expected output

```text id="a3x6wb"
Total cost: R56.00
```

### Concepts used

- String variables for the entered values.
- `Double.parseDouble` for conversion.
- `double` variables for prices and the total.
- The addition operator.
- `JOptionPane` for input and output.
- `String.format` for displaying two decimal places.

### Further practice

Modify the program to accept the quantity of each product and calculate the total cost using both price and quantity.

---

## 3. Integrated Example: Input Validation

Input validation helps prevent a program from processing values that do not meet the stated requirements.

### Problem statement

Write a program that accepts a mark and determines whether it is within the permitted range of 0 to 100.

### Java solution

```java
import javax.swing.JOptionPane;

public class MarkValidation {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(
            "Enter a mark between 0 and 100:"
        );

        try {

            int mark = Integer.parseInt(input);

            if (mark >= 0 && mark <= 100) {

                JOptionPane.showMessageDialog(
                    null,
                    "Valid mark: " + mark
                );

            } else {

                JOptionPane.showMessageDialog(
                    null,
                    "Invalid mark. Enter a value from 0 to 100."
                );
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                null,
                "Invalid input. Enter a whole number."
            );
        }
    }
}
```

### How the program works

1. The user enters a value.
2. The program attempts to convert the String into an integer.
3. If conversion succeeds, the program checks the permitted range.
4. If the mark is valid, a confirmation message is displayed.
5. If the mark is outside the range, an error message is displayed.
6. If conversion fails, the `catch` block displays a numeric-input error.

### Test cases

| Input | Expected behaviour |
|---|---|
| `65` | Accept the mark. |
| `0` | Accept the lower boundary. |
| `100` | Accept the upper boundary. |
| `-1` | Reject the mark. |
| `101` | Reject the mark. |
| `hello` | Display a numeric-input error. |

### Further practice

Modify the program to accept three marks and calculate the average only when all three marks are valid.

---

## 4. Integrated Example: Selection and Loops

Selection allows a program to make decisions. Loops allow instructions to be repeated.

### Problem statement

Write a program that displays the numbers from 1 to 10 and identifies whether each number is even or odd.

### Java solution

```java
public class EvenOddNumbers {

    public static void main(String[] args) {

        for (int number = 1; number <= 10; number++) {

            if (number % 2 == 0) {

                System.out.println(number + " is even.");

            } else {

                System.out.println(number + " is odd.");
            }
        }
    }
}
```

### Example output

```text id="d5t47y"
1 is odd.
2 is even.
3 is odd.
4 is even.
5 is odd.
6 is even.
7 is odd.
8 is even.
9 is odd.
10 is even.
```

### Concepts used

- A `for` loop to repeat the instructions.
- A variable to represent the current number.
- The remainder operator `%`.
- An `if-else` statement to select the appropriate message.
- Output using `System.out.println`.

### Further practice

Modify the program to display the numbers from 1 to 100 and count how many are even.

---

## 5. Integrated Example: String Manipulation

Strings are used to store and manipulate text.

### Problem statement

Write a program that accepts a student's name and displays the name in uppercase and lowercase, together with the number of characters in the name.

### Java solution

```java
import javax.swing.JOptionPane;

public class NameInformation {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(
            "Enter your name:"
        );

        String upperName = name.toUpperCase();
        String lowerName = name.toLowerCase();

        int length = name.length();

        JOptionPane.showMessageDialog(
            null,
            "Uppercase: " + upperName
            + "\nLowercase: " + lowerName
            + "\nNumber of characters: " + length
        );
    }
}
```

### Example input

```text id="u3b3qz"
Alex Morgan
```

### Expected output

```text id="j8km1b"
Uppercase: ALEX MORGAN
Lowercase: alex morgan
Number of characters: 11
```

The length includes the space between the first and last names.

### Concepts used

- String input.
- The `toUpperCase()` method.
- The `toLowerCase()` method.
- The `length()` method.
- String concatenation.
- Newline characters in output.

### Further practice

Modify the program to compare the entered name with a stored name and display whether they match, ignoring differences in letter case.

---

## 6. Integrated Example: Methods and Code Reuse

Methods allow a program to divide its work into smaller, reusable sections.

### Problem statement

Write a program that uses a method to display a welcome message.

### Java solution

```java
public class WelcomeProgram {

    public static void main(String[] args) {

        displayWelcome();
    }

    public static void displayWelcome() {

        System.out.println("Welcome to the Grade 10 Java Library.");
        System.out.println("Practise your programming skills.");
    }
}
```

### Output

```text id="l8p9cy"
Welcome to the Grade 10 Java Library.
Practise your programming skills.
```

### How it works

- `main` is the method where the program begins execution.
- `displayWelcome()` is a method created to perform a specific task.
- The method call `displayWelcome();` causes the method to execute.
- The method is declared as `void` because it does not return a value.

A method is useful when you want to give a section of code a clear purpose or reuse it from different places in a program.

### Further practice

Create a `displayResult()` method that displays a student's name and average. Call the method from `main`.

---

## 7. Integrated Example: Algorithm Practice

This example combines input, calculations, selection and output.

### Problem statement

Write a program that accepts a whole number and determines whether it is positive, negative or zero. If it is positive, also determine whether it is even or odd.

### Java solution

```java
import javax.swing.JOptionPane;

public class NumberAnalysis {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(
            "Enter a whole number:"
        );

        try {

            int number = Integer.parseInt(input);

            if (number > 0) {

                JOptionPane.showMessageDialog(
                    null,
                    "The number is positive."
                );

                if (number % 2 == 0) {

                    JOptionPane.showMessageDialog(
                        null,
                        "The number is even."
                    );

                } else {

                    JOptionPane.showMessageDialog(
                        null,
                        "The number is odd."
                    );
                }

            } else if (number < 0) {

                JOptionPane.showMessageDialog(
                    null,
                    "The number is negative."
                );

            } else {

                JOptionPane.showMessageDialog(
                    null,
                    "The number is zero."
                );
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                null,
                "Invalid input. Enter a whole number."
            );
        }
    }
}
```

### Concepts used

- `JOptionPane` for input and output.
- String-to-integer conversion.
- `try-catch` for invalid numeric input.
- Relational operators.
- Nested selection.
- The remainder operator.
- Algorithm design and testing.

### Further practice

Modify the program to also determine whether a positive number is a multiple of 5.

---

## 8. Developing Your Own Solutions

When you receive a new programming problem, use a structured approach.

### Analyse the problem

Identify:

- What the program must accomplish.
- What information must be supplied.
- What calculations or decisions are required.
- What output must be produced.
- What restrictions apply to the input.

### Plan the solution

Write pseudocode or draw a flowchart before coding.

For example:

```text id="w6q8y2"
START
    INPUT number

    IF number MOD 2 = 0 THEN
        OUTPUT "Even"
    ELSE
        OUTPUT "Odd"
    ENDIF
END
```

`MOD` represents the remainder operation in this pseudocode. In Java, the corresponding operator is `%`.

### Implement the solution

Translate each planned instruction into Java using suitable variables, data types, operators and control structures.

### Test the solution

Use several test cases, including values that exercise different branches of your algorithm.

### Debug the solution

If the output is incorrect, trace the relevant variables and examine the logic before making changes.

---

## Common Mistakes

Avoid the following mistakes when completing integrated programming tasks:

- Starting to code without understanding the problem.
- Omitting an input or output requirement.
- Choosing an unsuitable data type.
- Forgetting to convert String input into a numeric value.
- Using integer division when a decimal result is required.
- Applying the wrong formula.
- Using an incorrect comparison operator.
- Forgetting to update a loop variable.
- Creating a loop that does not terminate.
- Confusing String comparison with numeric comparison.
- Declaring a method but never calling it.
- Confusing a method declaration with a method call.
- Validating a value only after an unsafe conversion.
- Testing only the standard case.
- Assuming that a program is correct because it compiles.
- Ignoring the expected output and interface requirements.

## Recommended Study Approach

Use this method when practising the examples and preparing for assessments.

1. **Attempt the problem independently.** Read the requirements and identify the programming concepts involved.
2. **Write the algorithm first.** Plan the steps using pseudocode or a flowchart.
3. **Implement the Java code.** Translate the algorithm into a complete program.
4. **Compile and execute.** Correct any syntax errors.
5. **Test systematically.** Use standard, extreme and abnormal data where appropriate.
6. **Trace difficult sections.** Follow variable values and loop execution manually.
7. **Debug logically.** Identify the cause of an error before changing the code.
8. **Review your solution.** Check that every requirement has been met.
9. **Repeat without notes.** Recreate the solution from memory to develop confidence.

Do not simply copy a worked example and assume that you understand it. Change the inputs, modify the requirements and explain how each part of the program works.

## Practical Challenge

Develop a complete Java program for a simple student assessment system.

Your program must:

1. Ask for a student's name.
2. Ask for three assessment marks.
3. Validate that each mark is a whole number between `0` and `100`.
4. Calculate the total and average when all marks are valid.
5. Determine whether the average is at least `50`.
6. Display the student's name, total, average and result.
7. Use clear prompts and output messages.
8. Handle invalid numeric input appropriately.
9. Include at least one additional method to perform a clearly defined task.
10. Be tested with standard, extreme and abnormal data.

### Suggested test cases

| Test case | Marks | Expected behaviour |
|---|---|---|
| Standard result | `60, 70, 80` | Average `70.0`; pass. |
| Lower boundary | `0, 0, 0` | Average `0.0`; below pass requirement. |
| Pass boundary | `50, 50, 50` | Average `50.0`; pass. |
| Upper boundary | `100, 100, 100` | Average `100.0`; pass. |
| Invalid low mark | `-1, 70, 80` | Reject the invalid mark. |
| Invalid high mark | `101, 70, 80` | Reject the invalid mark. |
| Invalid text | `hello, 70, 80` | Display an input error. |

### Extension activities

- Use a loop to repeat input when a mark is invalid.
- Add a method that calculates the average.
- Add a method that displays the result.
- Write pseudocode for the complete program.
- Draw a flowchart for the validation and result-determination logic.
- Create a trace table for the total and average calculations.

## Key Takeaways

- Integrated programs combine multiple programming concepts to solve complete problems.
- Problem analysis should happen before coding.
- The IPO model helps identify input, processing and output.
- Pseudocode and flowcharts help plan algorithms.
- Variables and suitable data types store information for processing.
- Type conversion allows text input to be used in numeric calculations.
- Selection statements make decisions.
- Loops repeat instructions.
- String methods allow text to be manipulated and examined.
- Methods divide programs into manageable, reusable sections.
- Validation helps ensure that input meets the requirements.
- Testing checks whether a program produces the expected results.
- Debugging identifies and corrects errors.
- A complete solution must satisfy the problem requirements, not merely compile successfully.

---

## Navigation

- [Previous: Testing and Debugging](../11-Testing-and-Debugging/README.md)
- **Current topic: Integrated Examples and Practice**
- [Back to the Grade 10 Java Library](../README.md)

