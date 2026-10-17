# Input Conversion

## Learning Objectives

By the end of this topic, you should be able to:

- Explain why input from `JOptionPane` must be converted before numeric calculations.
- Convert a `String` to an `int` using `Integer.parseInt()`.
- Convert a `String` to a `double` using `Double.parseDouble()`.
- Store converted values in appropriate variables.
- Use converted input to calculate totals, averages and percentages.
- Recognise common input conversion errors.

## 1. Why Is Input Conversion Necessary?

When you use `JOptionPane.showInputDialog()`, the value entered by the user is returned as a `String`.

For example:

```java
String studentAge = JOptionPane.showInputDialog("Enter the Student's age:");
```

If the user enters `16`, Java initially stores the text `"16"` in `studentAge`.

Although the text looks like a number, Java treats it as a `String`.

You cannot directly use this `String` in an arithmetic calculation that requires an integer.

For example, this statement will not compile:

```java
String studentAge = "16";
int nextYearAge = studentAge + 1;
```

You must convert the text into a numeric value before performing the calculation.

## 2. Converting Input to an Integer

Java provides the `Integer.parseInt()` method to convert a numeric `String` into an `int`.

Syntax:

```java
Integer.parseInt(stringValue);
```

Example:

```java
String ageInput = JOptionPane.showInputDialog("Enter the Student's age:");
int studentAge = Integer.parseInt(ageInput);
```

These statements perform the following actions:

1. Display a dialog box asking for the Student's age.
2. Store the entered text in `ageInput`.
3. Convert the text into an integer.
4. Store the converted number in `studentAge`.

If the user enters `16`, the integer variable stores the numeric value `16`.

You can now perform calculations:

```java
int nextYearAge = studentAge + 1;
```

If `studentAge` is `16`, `nextYearAge` becomes `17`.

**Important:** `Integer.parseInt()` works with text representing a valid integer, such as `"16"` or `"-5"`. It does not accept a decimal value such as `"16.5"`.

## 3. Converting Input to a Double

Use `Double.parseDouble()` when the input may contain a decimal value.

For example, a Student's average mark might be `78.5`.

```java
String markInput = JOptionPane.showInputDialog("Enter the average mark:");
double averageMark = Double.parseDouble(markInput);
```

If the user enters `78.5`, the variable `averageMark` stores the numeric value `78.5`.

You can then perform calculations:

```java
double improvedMark = averageMark + 2.5;
```

If the original average is `78.5`, the new value is `81.0`.

Use:

- `Integer.parseInt()` to convert suitable text into an `int`.
- `Double.parseDouble()` to convert suitable text into a `double`.

## 4. Choosing the Correct Conversion Method

| Required data type | Conversion method | Example input |
|---|---|---|
| `int` | `Integer.parseInt()` | `"16"` |
| `double` | `Double.parseDouble()` | `"78.5"` |

The conversion method must match the data type you intend to use.

For example:

```java
String gradeInput = "10";
int studentGrade = Integer.parseInt(gradeInput);
```

The variable `studentGrade` stores the integer `10`.

For a mark that can contain a decimal fraction:

```java
String averageInput = "78.5";
double averageMark = Double.parseDouble(averageInput);
```

The variable `averageMark` stores the numeric value `78.5`.

## 5. Complete Example: Student Assessment

Suppose a teacher enters two assessment marks using input dialogs.

The program must calculate the total and average.

```java
import javax.swing.JOptionPane;

public class AssessmentCalculator {

    public static void main(String[] args) {

        String firstInput = JOptionPane.showInputDialog("Enter the first mark:");
        String secondInput = JOptionPane.showInputDialog("Enter the second mark:");

        int firstMark = Integer.parseInt(firstInput);
        int secondMark = Integer.parseInt(secondInput);

        int totalMarks = firstMark + secondMark;
        double averageMark = totalMarks / 2.0;

        JOptionPane.showMessageDialog(null,
                "Total marks: " + totalMarks
                + "\nAverage mark: " + averageMark);

    }

}
```

If the user enters `35` and `42`:

- The first mark is converted to the integer `35`.
- The second mark is converted to the integer `42`.
- The total is `77`.
- The average is `38.5`.

The result is displayed in a message dialog.

## 6. Converting Input Does Not Validate It Automatically

Conversion and validation are different tasks.

Conversion changes suitable text into a numeric value. Validation checks whether the entered value is acceptable for the application.

For example, if the user enters `hello` and the program executes:

```java
int studentAge = Integer.parseInt("hello");
```

Java throws a `NumberFormatException` because `"hello"` is not a valid integer representation.

Likewise, attempting to convert `"78.5"` using `Integer.parseInt()` causes a `NumberFormatException`.

Input validation and exception handling can be used to deal with invalid input. For now, ensure that you enter suitable numeric values when testing your programs.

## 7. Common Mistakes

### Mistake 1: Trying to calculate with a String

Incorrect:

```java
String markInput = JOptionPane.showInputDialog("Enter a mark:");
int total = markInput + 5;
```

The variable `markInput` is a `String`, so it cannot be used directly as an integer in this calculation.

Correct:

```java
String markInput = JOptionPane.showInputDialog("Enter a mark:");
int mark = Integer.parseInt(markInput);
int total = mark + 5;
```

### Mistake 2: Using the wrong conversion method

Incorrect for a decimal value:

```java
double averageMark = Integer.parseInt("78.5");
```

Correct:

```java
double averageMark = Double.parseDouble("78.5");
```

### Mistake 3: Forgetting to store the converted value

This statement performs a conversion:

```java
Integer.parseInt(ageInput);
```

However, it does not store the result in a variable.

To use the converted value later, assign it:

```java
int studentAge = Integer.parseInt(ageInput);
```

### Mistake 4: Forgetting that conversion can fail

The following input is not a valid integer:

```java
Integer.parseInt("sixteen");
```

Only attempt conversion when the text is suitable for the intended numeric type, or handle invalid input appropriately.

### Mistake 5: Forgetting real division

Even after converting input to integers, dividing two integers can discard the fractional part.

Incorrect for an exact average:

```java
double averageMark = totalMarks / 2;
```

Correct:

```java
double averageMark = totalMarks / 2.0;
```

## 8. Practice Activities

Complete these activities in NetBeans.

### Activity 1: Student Age

Write a program that:

1. Requests the Student's age using `JOptionPane`.
2. Converts the input into an integer.
3. Calculates the Student's age next year.
4. Displays both values in a message dialog.

### Activity 2: Assessment Total

Write a program that:

1. Requests two assessment marks.
2. Converts both inputs into integers.
3. Calculates the total.
4. Displays the total.

### Activity 3: Assessment Average

Extend Activity 2 to calculate the average using real division.

Test your program with marks of `35` and `42`. The expected average is `38.5`.

### Activity 4: Average Mark Adjustment

Write a program that:

1. Requests a Student's current average mark.
2. Converts the input using `Double.parseDouble()`.
3. Adds `2.5` to the average.
4. Displays the original and adjusted values.

### Activity 5: Identify the Error

Study the following code:

```java
String markInput = JOptionPane.showInputDialog("Enter a mark:");
double mark = Integer.parseInt(markInput);
```

Explain why this code will fail if the user enters `76.5`.

Rewrite the conversion statement so that the program can accept the decimal value.

## 9. Summary

- `showInputDialog()` returns a `String`.
- `Integer.parseInt()` converts suitable text into an `int`.
- `Double.parseDouble()` converts suitable text into a `double`.
- Converted values can be used in arithmetic calculations.
- Conversion does not automatically validate the input.
- Invalid numeric text can cause a `NumberFormatException`.
- Use real division when calculating averages that may contain decimal fractions.
