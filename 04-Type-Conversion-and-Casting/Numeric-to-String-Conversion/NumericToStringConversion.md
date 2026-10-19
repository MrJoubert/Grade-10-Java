# Numeric to String Conversion

## Learning Objectives

By the end of this section, you should be able to:

- Explain why a numeric value may need to be converted into a String.
- Convert numeric values to Strings using `String.valueOf()`.
- Convert numeric values to Strings using concatenation.
- Use converted values when constructing messages and displaying information.
- Distinguish between a numeric value and a String containing the same characters.

## 1. What Is Numeric to String Conversion?

Numeric to String conversion changes a numeric value, such as an `int` or `double`, into a `String`.

For example:

```java
int studentMark = 85;
String markText = String.valueOf(studentMark);
```

The variable `studentMark` stores a numeric value, while `markText` stores text.

Both may display as `85`, but their data types are different.

- An `int` can be used directly in mathematical calculations.
- A `String` is used to store and manipulate text.

## 2. Using String.valueOf()

Java provides the `String.valueOf()` method to convert values into Strings.

### Converting an int

```java
int studentAge = 16;
String ageText = String.valueOf(studentAge);

System.out.println(ageText);
```

Output:

```text
16
```

The value of `studentAge` is converted into a String and stored in `ageText`.

### Converting a double

```java
double averageMark = 78.5;
String averageText = String.valueOf(averageMark);

System.out.println(averageText);
```

Output:

```text
78.5
```

### Converting a boolean

A Boolean value can also be converted into a String.

```java
boolean passed = true;
String resultText = String.valueOf(passed);

System.out.println(resultText);
```

Output:

```text
true
```

The resulting String contains the text `"true"`.

## 3. Using Concatenation to Produce a String

When a String is joined to a numeric value using the `+` operator, Java produces a String.

```java
int studentMark = 85;

String result = "Student mark: " + studentMark;

System.out.println(result);
```

Output:

```text
Student mark: 85
```

The numeric value does not need to be converted in a separate statement when it is used this way.

This is useful when constructing messages that contain numbers.

**Important:** The `+` operator can perform addition or String concatenation, depending on the operands.

Compare:

```java
int firstNumber = 20;
int secondNumber = 5;

int total = firstNumber + secondNumber;
String message = "Total: " + total;
```

- `firstNumber + secondNumber` performs addition.
- `"Total: " + total` joins text and a number to create a String.

## 4. Why Convert a Number to a String?

A school management program might calculate a Student's average and then display it in a message.

```java
double averageMark = 82.5;
String averageText = String.valueOf(averageMark);

System.out.println("Average mark: " + averageText);
```

Output:

```text
Average mark: 82.5
```

Numeric-to-String conversion is useful when:

- Building messages containing numeric values.
- Preparing text for display.
- Combining data with labels or descriptions.
- Storing a numeric value in a String variable when text is specifically required.

Remember that converting a number to a String does not change the original numeric variable.

## 5. The Data Type Still Matters

Consider the following example:

```java
int mark = 85;
String markText = String.valueOf(mark);
```

The variables contain values that display similarly, but they have different data types.

You can add a number to `mark`:

```java
mark = mark + 5;
```

This changes `mark` to `90`.

However, joining text to `markText` produces a String:

```java
markText = markText + "5";
```

The value of `markText` becomes `"855"`, not `"90"`.

**Remember:** Converting a numeric value into a String does not make the String suitable for mathematical calculations.

## 6. Common Mistakes

### Mistake 1: Assigning a number directly to a String variable

```java
String markText = 85;
```

This causes a compilation error because an integer cannot be assigned directly to a String variable.

Correct approach:

```java
String markText = String.valueOf(85);
```

### Mistake 2: Confusing addition with concatenation

```java
System.out.println("20" + "5");
```

Output: `205`

Both values are Strings, so Java joins their contents instead of adding them.

### Mistake 3: Assuming conversion changes the original variable

```java
int mark = 85;
String markText = String.valueOf(mark);
```

The `mark` variable remains an `int`. Only `markText` stores a String.

## 7. Practice Exercises

1. Convert an integer containing a Student's age into a String using `String.valueOf()`.
2. Convert a `double` containing an assessment average into a String.
3. Create a message that displays a Student's name and mark using concatenation.
4. Explain the difference between the results of `20 + 5` and `"20" + "5"`.
5. Given `int mark = 75;`, convert the mark into a String called `markText`.
6. Explain why converting a numeric value to a String can affect how the `+` operator behaves.

## Summary

- Numeric-to-String conversion changes a numeric value into text.
- Use `String.valueOf()` to convert numeric values into Strings explicitly.
- Concatenation can automatically produce a String when text and numeric values are joined.
- A String containing digits is still a String, not a numeric data type.
- Conversion does not change the data type of the original variable.
