# Keyboard Input with JOptionPane

## Learning Objectives

By the end of this topic, you should be able to:

- Explain why programs need input from users.
- Import and use the `JOptionPane` class.
- Use `showInputDialog()` to request information.
- Store input in `String` variables.
- Collect multiple pieces of information about a Student.
- Explain why input from `showInputDialog()` is returned as a `String`.

## 1. What Is Input?

Input is information supplied to a computer program.

A school-management application might need to collect information such as:

- A Student's name and surname.
- The Student's grade and class group.
- The subject being selected.
- A teacher's name.
- A mark entered by a teacher.

Input allows a program to work with information supplied by its user rather than relying only on values written into the source code.

Java provides several ways to receive input. In this topic, you will use `JOptionPane` to display dialog boxes that allow users to enter information.

## 2. What Is JOptionPane?

`JOptionPane` is a Java class that provides ready-made dialog boxes.

It belongs to the `javax.swing` package.

To use it, include the following import statement at the beginning of your program:

```java
import javax.swing.JOptionPane;
```

You can then call the `showInputDialog()` method:

```java
JOptionPane.showInputDialog("Enter the Student's name:");
```

This displays a dialog box containing a message, a text field and buttons that allow the user to submit or cancel the input.

The value entered by the user is returned to the program as a `String`.

## 3. Using showInputDialog()

The `showInputDialog()` method requests information from the user.

For example:

```java
String studentName = JOptionPane.showInputDialog("Enter the Student's name:");
```

This statement performs three important actions:

1. Displays a dialog box asking for the Student's name.
2. Waits for the user to enter information and submit the dialog.
3. Stores the entered text in the `studentName` variable.

If the user enters `Liam`, the variable contains the text `"Liam"`.

The value can then be used elsewhere in the program.

## 4. Collecting Multiple Inputs

A program can display more than one input dialog.

For example, a school application might request a Student's name, surname and class group.

```java
String studentName = JOptionPane.showInputDialog("Enter the Student's name:");
String studentSurname = JOptionPane.showInputDialog("Enter the Student's surname:");
String classGroup = JOptionPane.showInputDialog("Enter the class group:");
```

Each statement displays a separate dialog box.

The program waits for each input before moving to the next statement.

The values are stored in separate variables so that they can be processed or displayed later.

## 5. Input Is Returned as a String

One of the most important rules to understand is that `showInputDialog()` returns a `String`.

For example:

```java
String studentAge = JOptionPane.showInputDialog("Enter the Student's age:");
```

Even if the user enters `16`, the value is initially text.

The variable contains `"16"`, not the integer value `16`.

This matters when you want to perform calculations. You cannot directly use a `String` as an integer in an arithmetic expression.

For example, the following statement will not compile:

```java
String studentAge = "16";
int nextYearAge = studentAge + 1;
```

You will learn how to convert input into numeric values in the **Input Conversion** concept.

For now, store input in `String` variables.

## 6. Displaying the Information Entered

After collecting information, a program can display it using a message dialog.

For example:

```java
JOptionPane.showMessageDialog(null, "Student name: " + studentName);
```

The first argument, `null`, indicates that the dialog has no specified parent component.

The second argument is the message to display.

You can combine multiple values into one message:

```java
JOptionPane.showMessageDialog(null,
        "Student: " + studentName + " " + studentSurname
        + "\nClass group: " + classGroup);
```

The special character sequence `\n` starts a new line in the message.

Although this topic focuses on input, displaying the collected information helps you confirm that the program has received the correct values.

## 7. Complete Example

The following program requests a Student's name, surname and class group, then displays the details.

```java
import javax.swing.JOptionPane;

public class StudentRegistration {

    public static void main(String[] args) {

        String studentName = JOptionPane.showInputDialog("Enter the Student's name:");
        String studentSurname = JOptionPane.showInputDialog("Enter the Student's surname:");
        String classGroup = JOptionPane.showInputDialog("Enter the class group:");

        JOptionPane.showMessageDialog(null,
                "STUDENT REGISTRATION\n"
                + "Name: " + studentName + "\n"
                + "Surname: " + studentSurname + "\n"
                + "Class group: " + classGroup);

    }

}
```

If the user enters:

- Name: Olivia
- Surname: Smith
- Class group: 10A

The message dialog displays:

```text
STUDENT REGISTRATION
Name: Olivia
Surname: Smith
Class group: 10A
```

The exact appearance of the dialog boxes depends on the operating system and Java environment.

## 8. Common Mistakes

### Mistake 1: Forgetting the import statement

If you use `JOptionPane` without importing it, Java may report that it cannot find the class.

Include:

```java
import javax.swing.JOptionPane;
```

### Mistake 2: Using the wrong method name

The correct method is:

```java
JOptionPane.showInputDialog("Enter your name:");
```

Java is case-sensitive. `showinputdialog()` and `ShowInputDialog()` are not the same method name.

### Mistake 3: Forgetting that input is a String

This statement stores text:

```java
String mark = JOptionPane.showInputDialog("Enter a mark:");
```

It does not automatically create an integer variable.

Numeric conversion is covered in a later concept.

### Mistake 4: Forgetting quotation marks

Text messages must be enclosed in double quotation marks.

Correct:

```java
JOptionPane.showInputDialog("Enter the Student's name:");
```

### Mistake 5: Mismatching the class name and filename

If the public class is called `KeyboardInputWithJOptionPane`, the file must be named `KeyboardInputWithJOptionPane.java`.

## 9. Practice Activities

Complete these activities in NetBeans.

### Activity 1: Student Details

Write a program that requests:

1. The Student's name.
2. The Student's surname.
3. The Student's class group.

Display all three values in a message dialog.

### Activity 2: Subject Selection

Write a program that asks a Student to enter the name of a school subject.

Display a message confirming the selected subject.

### Activity 3: Teacher Information

Write a program that requests a teacher's name and the subject they teach.

Display both values in one message dialog.

### Activity 4: Personalised Welcome

Write a program that asks for a Student's name and grade.

Display a welcome message that includes both values.

For this activity, the grade can be stored as a `String`. Numeric conversion will be covered separately.

## 10. Summary

- Input allows users to provide information to a program.
- `JOptionPane` provides dialog boxes for collecting input.
- Import `javax.swing.JOptionPane` before using the class.
- Use `showInputDialog()` to request information.
- The value returned by `showInputDialog()` is a `String`.
- Store input in variables so that it can be used later.
- Use `showMessageDialog()` to display the collected information.
- Numeric input must be converted before it can be used in arithmetic calculations.
