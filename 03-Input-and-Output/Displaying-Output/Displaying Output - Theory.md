# Displaying Output

## Learning Objectives

By the end of this topic, you should be able to:

- Display information using `System.out.println()` and `System.out.print()`.
- Explain the difference between these two methods.
- Display text, variables and calculation results.
- Combine text and variable values using concatenation.
- Use escape sequences to format output.
- Display information in a `JOptionPane` message dialog.

## 1. What Is Output?

Output is information produced by a computer program and presented to the user.

A school-management program might display:

- A Student's details.
- Assessment marks and averages.
- A timetable.
- A list of subjects.
- A message confirming that information has been entered.

Java provides several ways to display output. In this topic, you will focus on console output and message dialogs.

## 2. Displaying Output with System.out.println()

The `System.out.println()` method displays information in the console and then moves to the next line.

Example:

```java
System.out.println("Welcome to the school management system.");
System.out.println("Student: Liam Jacobs");
System.out.println("Grade: 10");
```

Output:

```text
Welcome to the school management system.
Student: Liam Jacobs
Grade: 10
```

Each statement displays its information on a separate line.

The text inside quotation marks is called a string literal.

## 3. The Difference Between print() and println()

Java provides two commonly used methods for displaying console output.

### System.out.println()

Displays information and moves to the next line.

```java
System.out.println("Grade");
System.out.println("10");
```

Output:

```text
Grade
10
```

### System.out.print()

Displays information without automatically moving to the next line.

```java
System.out.print("Grade: ");
System.out.print("10");
```

Output:

```text
Grade: 10
```

The second statement continues on the same line as the first.

Use `println()` when you want the next output to begin on a new line. Use `print()` when you want multiple pieces of information to appear on the same line.

## 4. Displaying Variables

You can display the contents of a variable by including its name in a print statement.

For example:

```java
String studentName = "Liam Jacobs";
int studentGrade = 10;
double averageMark = 78.5;

System.out.println(studentName);
System.out.println(studentGrade);
System.out.println(averageMark);
```

Output:

```text
Liam Jacobs
10
78.5
```

Java displays the values stored in the variables, not the variable names themselves.

Compare:

```java
System.out.println("studentName");
System.out.println(studentName);
```

The first statement displays the literal text `studentName`.

The second displays the value stored in the variable, such as `Liam Jacobs`.

## 5. Combining Text and Variables

You can combine text and variables using the `+` operator. When used with strings, this is called **string concatenation**.

For example:

```java
String studentName = "Olivia Smith";
int studentGrade = 11;

System.out.println("Student: " + studentName);
System.out.println("Grade: " + studentGrade);
```

Output:

```text
Student: Olivia Smith
Grade: 11
```

The `+` operator joins the text and variable value into one output string.

You can combine several values in one statement:

```java
System.out.println("Student: " + studentName
        + ", Grade: " + studentGrade);
```

Output:

```text
Student: Olivia Smith, Grade: 11
```

Remember to include spaces in your text where necessary.

## 6. Displaying Calculation Results

Output statements can display the results of calculations.

For example:

```java
int testOneMark = 35;
int testTwoMark = 42;

int totalMarks = testOneMark + testTwoMark;

System.out.println("Test 1: " + testOneMark);
System.out.println("Test 2: " + testTwoMark);
System.out.println("Total: " + totalMarks);
```

Output:

```text
Test 1: 35
Test 2: 42
Total: 77
```

You can also include a calculation directly in an output statement:

```java
System.out.println("Total: " + (35 + 42));
```

Output:

```text
Total: 77
```

Brackets make it clear that the addition should be performed before the result is combined with the text.

## 7. Using Escape Sequences

Escape sequences allow you to control how output is displayed.

| Escape sequence | Purpose |
|---|---|
| `\n` | Starts a new line |
| `\t` | Inserts a tab |
| `\"` | Displays a double quotation mark |
| `\\` | Displays a backslash |

### New line: `\n`

```java
System.out.println("STUDENT DETAILS\nName: Liam Jacobs\nGrade: 10");
```

Output:

```text
STUDENT DETAILS
Name: Liam Jacobs
Grade: 10
```

### Tab: `\t`

```java
System.out.println("Subject\tMark");
System.out.println("IT\t\t85");
System.out.println("CAT\t\t78");
```

The `\t` sequence inserts tab spacing. The exact alignment depends on the tab stops used by the console.

### Double quotation marks: `\"`

```java
System.out.println("The Student's status is \"Registered\".");
```

Output:

```text
The Student's status is "Registered".
```

### Backslash: `\\`

```java
System.out.println("Folder: C:\\School\\Students");
```

Output:

```text
Folder: C:\School\Students
```

## 8. Creating Headings and Separators

Output can be organised into sections to make results easier to read.

For example:

```java
System.out.println("STUDENT ASSESSMENT");
System.out.println("==================");
System.out.println("Student: Olivia Smith");
System.out.println("Average: 84.5");
```

Output:

```text
STUDENT ASSESSMENT
==================
Student: Olivia Smith
Average: 84.5
```

This technique is useful when displaying several related values.

## 9. Displaying Output with JOptionPane

You can also display information in a graphical message dialog.

First, import the class:

```java
import javax.swing.JOptionPane;
```

Then use `showMessageDialog()`:

```java
JOptionPane.showMessageDialog(null, "Welcome to Grade 10 IT.");
```

To display a variable:

```java
String studentName = "Liam Jacobs";

JOptionPane.showMessageDialog(null, "Student: " + studentName);
```

You can display several lines using `\n`:

```java
JOptionPane.showMessageDialog(null,
        "STUDENT DETAILS\n"
        + "Name: " + studentName + "\n"
        + "Grade: 10");
```

The first argument, `null`, means that no parent component has been specified for the dialog.

Use console output for simple text-based results and message dialogs when you want to display information in a graphical window.

## 10. Common Mistakes

### Mistake 1: Using quotation marks around a variable name

```java
String studentName = "Liam Jacobs";

System.out.println("studentName");
```

This displays `studentName`, not `Liam Jacobs`.

Correct:

```java
System.out.println(studentName);
```

### Mistake 2: Forgetting spaces during concatenation

```java
System.out.println("Student:" + studentName);
```

Output:

```text
Student:Liam Jacobs
```

Correct:

```java
System.out.println("Student: " + studentName);
```

### Mistake 3: Expecting print() to move to a new line

```java
System.out.print("Grade: ");
System.out.print(10);
```

Output:

```text
Grade: 10
```

Use `println()` if you want the next statement to start on a new line.

### Mistake 4: Forgetting the import for JOptionPane

Include:

```java
import javax.swing.JOptionPane;
```

before using `JOptionPane`.

### Mistake 5: Incorrectly displaying a calculation

```java
System.out.println("Total: " + 35 + 42);
```

This displays:

```text
Total: 3542
```

Java evaluates the string concatenation from left to right.

Correct:

```java
System.out.println("Total: " + (35 + 42));
```

Output:

```text
Total: 77
```

## 11. Practice Activities

Complete these activities in NetBeans.

### Activity 1: Student Profile

Write a program that displays a Student's name, surname, grade and class group. Use a separate `println()` statement for each value.

### Activity 2: Assessment Results

Create variables for three assessment marks. Display each mark, the total and the average.

Ensure that the average uses real division.

### Activity 3: Timetable

Display the following timetable in the console:

- Monday — Information Technology
- Tuesday — Mathematics
- Wednesday — English

Use `\n` to separate the lines in one output statement.

### Activity 4: Formatting Output

Display the following headings and values using `print()`, `println()` and `\t`:

```text
Subject         Mark
IT              85
CAT             78
```

Aim to make the output easy to read.

### Activity 5: Message Dialog

Write a program that displays a Student's name, grade and average in one `JOptionPane` message dialog.

## 12. Summary

- Output is information produced by a program.
- `System.out.println()` displays information and moves to the next line.
- `System.out.print()` displays information without automatically moving to the next line.
- String concatenation combines text and values using `+`.
- Escape sequences such as `\n` and `\t` help organise output.
- Brackets can ensure that calculations are performed before string concatenation.
- `JOptionPane.showMessageDialog()` displays output in a graphical dialog box.
