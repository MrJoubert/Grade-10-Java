# Formatting Output

## Learning Objectives

By the end of this topic, you should be able to:

- Explain why output formatting is important.
- Use `System.out.printf()` to display formatted output.
- Display decimal values to a specified number of decimal places.
- Use format specifiers such as `%s`, `%d` and `%f`.
- Use field widths to organise console output.
- Display Student assessment results in a clear, readable format.

## 1. What Is Output Formatting?

Output formatting controls how information appears when a program displays its results.

Consider a Student's average mark:

```java
double averageMark = 78.6666666667;

System.out.println("Average: " + averageMark);
```

The output is:

```text
Average: 78.6666666667
```

This is a valid result, but displaying so many decimal places may not be necessary.

You can format the output to display two decimal places:

```java
System.out.printf("Average: %.2f%n", averageMark);
```

Output:

```text
Average: 78.67
```

The stored value has not changed. Only the way it is displayed has changed.

## 2. Using System.out.printf()

Java provides the `System.out.printf()` method for formatted console output.

Unlike `println()`, `printf()` does not automatically move to a new line. You can use `%n` to start a new line.

For example:

```java
System.out.printf("Student: %s%n", "Olivia Smith");
System.out.printf("Grade: %d%n", 11);
```

Output:

```text
Student: Olivia Smith
Grade: 11
```

The format string contains ordinary text and format specifiers. The values supplied after the comma replace the corresponding specifiers.

## 3. Common Format Specifiers

A format specifier tells Java how to display a value.

| Specifier | Purpose | Example |
|---|---|---|
| `%s` | Displays a string | `%s` displays `Olivia Smith` |
| `%d` | Displays an integer | `%d` displays `11` |
| `%f` | Displays a floating-point value | `%f` displays `78.500000` |
| `%.2f` | Displays a floating-point value to two decimal places | `78.50` |
| `%.1f` | Displays a floating-point value to one decimal place | `78.5` |
| `%n` | Starts a new line | Moves to the next line |

### Example

```java
String studentName = "Olivia Smith";
int studentGrade = 11;
double averageMark = 78.5;

System.out.printf("Student: %s%n", studentName);
System.out.printf("Grade: %d%n", studentGrade);
System.out.printf("Average: %.2f%n", averageMark);
```

Output:

```text
Student: Olivia Smith
Grade: 11
Average: 78.50
```

Notice that the average is displayed with two decimal places, even though the stored value is `78.5`.

## 4. Controlling Decimal Places

You can specify how many decimal places a floating-point value should display.

For example:

```java
double percentage = 82.222222;

System.out.printf("%.0f%n", percentage);
System.out.printf("%.1f%n", percentage);
System.out.printf("%.2f%n", percentage);
System.out.printf("%.3f%n", percentage);
```

Output:

```text
82
82.2
82.22
82.222
```

Java rounds the displayed value to the specified number of decimal places.

The original variable is not changed by formatting.

For example, displaying `percentage` with `%.2f` does not permanently change its value to `82.22`.

## 5. Displaying Assessment Results

Suppose a Student receives 37 out of 45 marks.

The percentage is approximately `82.2222222222`.

You can display the percentage to two decimal places:

```java
int markObtained = 37;
int maximumMark = 45;

double percentage = (double) markObtained / maximumMark * 100;

System.out.printf("Percentage: %.2f%%%n", percentage);
```

Output:

```text
Percentage: 82.22%
```

The format specifier `%.2f` displays two decimal places.

The `%%` sequence displays a literal percentage symbol. A single `%` introduces a format specifier, so it must be escaped when you want to display the symbol itself.

## 6. Formatting Money

Formatted output can make financial information easier to read.

For example:

```java
int numberOfBooks = 4;
double bookPrice = 18.5;
double totalCost = numberOfBooks * bookPrice;

System.out.printf("Unit price: R%.2f%n", bookPrice);
System.out.printf("Total cost: R%.2f%n", totalCost);
```

Output:

```text
Unit price: R18.50
Total cost: R74.00
```

Using two decimal places is useful when displaying currency values.

For this introductory example, the values are stored as `double`. Real financial applications may require a more precise approach to currency calculations.

## 7. Using Field Widths

You can specify a minimum field width to align values in columns.

For example:

```java
System.out.printf("%-25s %8s%n", "Subject", "Mark");
System.out.printf("%-25s %8d%n", "Information Technology", 85);
System.out.printf("%-25s %8d%n", "Computer Applications Technology", 78);
```

In this example:

- `%-25s` displays a string in a field at least 25 characters wide and aligns it to the left.
- `%8s` displays a string in a field at least 8 characters wide and aligns it to the right.
- `%8d` displays an integer in a field at least 8 characters wide and aligns it to the right.

The field width is a minimum, not a maximum. If the value is longer than the specified width, Java does not automatically truncate it.

## 8. Combining Formatting with Calculations

Formatting can be applied to the results of calculations.

For example:

```java
int testOneMark = 72;
int testTwoMark = 85;
int testThreeMark = 79;

int totalMarks = testOneMark + testTwoMark + testThreeMark;
double averageMark = totalMarks / 3.0;

System.out.printf("Total marks: %d%n", totalMarks);
System.out.printf("Average mark: %.2f%n", averageMark);
```

Output:

```text
Total marks: 236
Average mark: 78.67
```

The program calculates the average using real division and then formats the displayed value to two decimal places.

## 9. Formatting with JOptionPane

The `printf()` method formats console output. It does not directly format a `JOptionPane` message dialog.

For message dialogs, you can use `String.format()` to create a formatted string first.

For example:

```java
double averageMark = 78.6666667;

String message = String.format("Average mark: %.2f", averageMark);

JOptionPane.showMessageDialog(null, message);
```

The dialog displays:

```text
Average mark: 78.67
```

The `String.format()` method uses the same style of format specifiers as `printf()`.

Remember to import `javax.swing.JOptionPane` when using a message dialog.

## 10. Common Mistakes

### Mistake 1: Using the wrong format specifier

Use `%s` for strings, `%d` for integers and `%f` for floating-point values.

The type of the value must match the format specifier.

### Mistake 2: Forgetting that `%f` displays six decimal places by default

```java
System.out.printf("%f%n", 78.5);
```

Output:

```text
78.500000
```

To display two decimal places, use `%.2f`.

### Mistake 3: Forgetting to escape the percentage symbol

Incorrect:

```java
System.out.printf("%.2f%%", percentage);
```

Correct: the statement above is already correct because `%%` displays a literal `%`.

Remember to use two percent signs in the format string when you want one percentage symbol in the output.

### Mistake 4: Expecting printf() to move to the next line automatically

```java
System.out.printf("Student: %s", studentName);
System.out.printf("Grade: %d", studentGrade);
```

The output appears on the same line.

Use `%n` at the end of the format string when you want a new line.

### Mistake 5: Assuming formatting changes the variable

Formatting changes the displayed representation, not the stored numeric value.

For example, displaying `78.6667` using `%.2f` shows `78.67`, but the variable still contains its original value.

## 11. Practice Activities

### Activity 1: Student Profile

Write a program that displays a Student's name, grade and average mark.

Use `%s`, `%d` and `%.2f` to format the output.

### Activity 2: Assessment Percentage

A Student receives 42 out of 48 marks.

1. Calculate the percentage using real division.
2. Display the result to two decimal places.
3. Include the percentage symbol in the output.

Expected percentage: `87.50%`.

### Activity 3: Subject Marks Table

Display the following information using field widths:

| Subject | Mark |
|---|---:|
| Information Technology | 85 |
| Computer Applications Technology | 78 |
| Mathematics | 82 |

Align the subject names to the left and the marks to the right.

### Activity 4: Stationery Costs

Write a program that calculates the total cost of 4 exercise books priced at R18.50 each.

Display both the unit price and total cost to two decimal places.

### Activity 5: Formatted Message Dialog

Write a program that calculates a Student's average mark and displays it in a `JOptionPane` message dialog using `String.format()`.

Display the average to two decimal places.

## 12. Summary

- Output formatting controls how values are displayed.
- `System.out.printf()` displays formatted console output.
- `%s` is used for strings, `%d` for integers and `%f` for floating-point values.
- `%.2f` displays a floating-point value to two decimal places.
- `%n` starts a new line.
- `%%` displays a literal percentage symbol.
- Field widths help align output in columns.
- `String.format()` can create formatted strings for use in message dialogs.
- Formatting changes the displayed representation, not the stored value.
