# String to Numeric Conversion

## Learning Objectives

By the end of this section, you should be able to:

- Explain why a `String` sometimes needs to be converted into a numeric data type.
- Convert a `String` into an `int` using `Integer.parseInt()`.
- Convert a `String` into a `double` using `Double.parseDouble()`.
- Convert a `String` into a `long` using `Long.parseLong()`.
- Use converted values in calculations.
- Recognise situations in which a conversion will fail.

## 1. Why Is Conversion Necessary?

A `String` stores text. Even if the text contains digits, Java still treats it as text until it is converted.

Consider these two variables:

```java
String firstValue = "20";
String secondValue = "5";
```

If you join these Strings using `+`, Java joins their contents:

```java
String result = firstValue + secondValue;
System.out.println(result);
```

Output:

```text
205
```

This is not the same as adding the numbers 20 and 5.

To perform a mathematical calculation, convert the Strings into numeric values first.

## 2. Converting a String to an int

Use `Integer.parseInt()` to convert a String containing a valid whole number into an `int`.

```java
String markInput = "78";
int mark = Integer.parseInt(markInput);

System.out.println(mark + 2);
```

Output:

```text
80
```

The conversion changes the value from text to a whole number that can be used in calculations.

**Remember:** `Integer.parseInt()` returns an `int`, not a String.

## 3. Converting a String to a double

Use `Double.parseDouble()` to convert a String containing a valid numeric value into a `double`.

```java
String averageInput = "76.5";
double average = Double.parseDouble(averageInput);

System.out.println(average + 2.5);
```

Output:

```text
79.0
```

Use `double` when a calculation needs decimal values.

## 4. Converting a String to a long

Use `Long.parseLong()` to convert a String containing a valid whole number into a `long`.

```java
String studentNumberInput = "9876543210";
long studentNumber = Long.parseLong(studentNumberInput);

System.out.println(studentNumber);
```

Output:

```text
9876543210
```

An `int` cannot store every possible whole number. A `long` can store a much larger range of whole numbers.

## 5. Choosing the Correct Conversion Method

| Conversion method | Resulting data type | Typical use |
|---|---|---|
| `Integer.parseInt()` | `int` | Whole-number marks or quantities |
| `Double.parseDouble()` | `double` | Averages, percentages or decimal values |
| `Long.parseLong()` | `long` | Large whole-number values |

Choose the method according to the numeric data type required by your program.

## 6. Conversion and Calculations

A conversion is often followed by a calculation.

```java
String firstMarkInput = "72";
String secondMarkInput = "84";

int firstMark = Integer.parseInt(firstMarkInput);
int secondMark = Integer.parseInt(secondMarkInput);

int totalMarks = firstMark + secondMark;
double averageMark = totalMarks / 2.0;

System.out.println("Total: " + totalMarks);
System.out.println("Average: " + averageMark);
```

Output:

```text
Total: 156
Average: 78.0
```

The important steps are:

1. Receive or store the input as a String.
2. Convert the String to the required numeric type.
3. Use the numeric variables in calculations.
4. Display the result.

## 7. When Can Conversion Fail?

The text must represent a valid number for the selected conversion method.

For example:

```java
String markInput = "seventy";
int mark = Integer.parseInt(markInput);
```

This conversion fails because `"seventy"` is not written as a numeric value.

The following can also cause problems:

- An empty String.
- Text containing letters, such as `"78A"`.
- A decimal value such as `"78.5"` passed to `Integer.parseInt()`.
- A whole number that falls outside the range of the target data type.

Invalid conversions normally cause a `NumberFormatException`.

**Important:** `Integer.parseInt("78.5")` does not round the value to 79 or truncate it to 78. It fails because the String is not a valid integer representation.

This example assumes valid input. A later topic can cover how to handle invalid input using exception handling.

## 8. Common Mistakes

### Mistake 1: Forgetting to convert the String

```java
String firstMark = "70";
String secondMark = "5";

System.out.println(firstMark + secondMark);
```

Output: `705`

Convert both values before adding them.

### Mistake 2: Using the wrong conversion method

```java
String averageInput = "72.5";
int average = Integer.parseInt(averageInput);
```

This fails because `"72.5"` is not a valid integer representation. Use `Double.parseDouble()` if a decimal value is required.

### Mistake 3: Confusing the variable's data type with its contents

```java
String mark = "85";
```

Although the contents look like a number, `mark` is still a String.

## 9. Practice Exercises

1. Convert the String `"65"` to an integer and display the value increased by 10.
2. Convert the String `"78.5"` to a double and display the value increased by 1.5.
3. Convert two Strings containing whole-number assessment marks into integers. Calculate and display their total.
4. Explain why `Integer.parseInt("82.5")` fails.
5. Identify the correct conversion method for each of the following:
   - A whole-number quantity stored as text.
   - An average stored as text with a decimal component.
   - A very large whole number stored as text.

## Summary

- A String containing digits is still text.
- `Integer.parseInt()` converts a valid numeric String to an `int`.
- `Double.parseDouble()` converts a valid numeric String to a `double`.
- `Long.parseLong()` converts a valid numeric String to a `long`.
- Convert values before performing numeric calculations.
- Invalid text or values outside the target type's range can cause a `NumberFormatException`.
