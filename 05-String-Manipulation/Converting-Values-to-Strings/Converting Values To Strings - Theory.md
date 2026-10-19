# Converting Values to Strings

## Learning Objectives

By the end of this section, you should be able to:

- Explain why a program may need to convert a value into a string.
- Use `String.valueOf()` to convert values into strings.
- Convert integer, double, boolean and character values into strings.
- Distinguish between storing a numeric value and storing the same value as text.
- Combine converted values with other strings.
- Understand the difference between converting a value and displaying it.

---

## 1. What Does It Mean to Convert a Value to a String?

A variable normally stores a value using a particular data type.

For example:

```java
int mark = 85;
double average = 76.5;
boolean passed = true;
```

These variables store an integer, a decimal number and a boolean value respectively.

Sometimes, a program needs to represent one of these values as text. For example, a school report might need to combine a student's name and mark into one message.

Java provides the `String.valueOf()` method to convert values into their string representations.

## 2. Using `String.valueOf()`

### Syntax

```java
String.valueOf(value)
```

The method returns a `String` representing the supplied value.

### Example 1: Converting an integer

```java
int mark = 85;

String markText = String.valueOf(mark);

System.out.println(markText);
```

Output:

```text
85
```

The variable `mark` stores an integer. The variable `markText` stores the text `"85"`.

Although they display the same characters, their data types are different.

### Example 2: Converting a decimal number

```java
double average = 76.5;

String averageText = String.valueOf(average);

System.out.println(averageText);
```

Output:

```text
76.5
```

The numeric value is represented as a string.

### Example 3: Converting a boolean

```java
boolean passed = true;

String resultText = String.valueOf(passed);

System.out.println(resultText);
```

Output:

```text
true
```

The boolean value `true` becomes the string `"true"`.

### Example 4: Converting a character

```java
char grade = 'A';

String gradeText = String.valueOf(grade);

System.out.println(gradeText);
```

Output:

```text
A
```

A `char` stores a single character, whereas a `String` can store a sequence of characters.

---

## 3. Combining Converted Values with Strings

Converting a value can be useful when preparing text for a report or message.

Consider the following example:

```java
String studentName = "Olivia";
int mark = 85;

String markText = String.valueOf(mark);

String report = studentName + " achieved " + markText + "%.";

System.out.println(report);
```

Output:

```text
Olivia achieved 85%.
```

The integer is converted into a string and then combined with the student's name and other text.

In this example, Java can also concatenate the integer directly with a string using `+`. Explicit conversion with `String.valueOf()` is useful when you need the value itself to be stored as a string variable.

---

## 4. A String Is Not a Number

Consider these two declarations:

```java
int mark = 85;
String markText = "85";
```

Both may display as `85`, but they are different types.

- `mark` stores an integer and can be used directly in arithmetic.
- `markText` stores text and is treated as a string.

For example:

```java
System.out.println(mark + 5);
System.out.println(markText + 5);
```

Output:

```text
90
855
```

The first statement adds two numbers. The second joins the string `"85"` with the number `5`.

Converting a number to a string does not mean that the string can still be used directly in arithmetic.

---

## 5. Converting Values for Display

Suppose a school programme needs to build a message containing a student's name, average and promotion status.

```java
String studentName = "Liam";
double average = 72.5;
boolean promoted = true;

String averageText = String.valueOf(average);
String promotedText = String.valueOf(promoted);

String message = studentName + " has an average of "
        + averageText + ". Promoted: " + promotedText;

System.out.println(message);
```

Output:

```text
Liam has an average of 72.5. Promoted: true
```

The converted values can be joined with other strings to create a complete message.

---

## 6. Important Difference: Conversion and Display

Printing a value does not automatically change the data type of the variable.

```java
int mark = 85;

System.out.println(mark);
```

The value is displayed, but `mark` remains an integer.

To store its string representation in another variable:

```java
String markText = String.valueOf(mark);
```

Now `markText` is a string.

Remember that conversion produces a new value. It does not change the declared data type of the original variable.

---

## 7. Common Mistakes

### Mistake 1: Assigning a number directly to a string variable

Incorrect:

```java
String markText = 85;
```

The integer value cannot be assigned directly to a `String` variable.

Correct:

```java
String markText = String.valueOf(85);
```

You could also write:

```java
String markText = "85";
```

The first approach converts a value; the second assigns a string literal.

### Mistake 2: Expecting a converted string to perform arithmetic

```java
String numberText = String.valueOf(20);

System.out.println(numberText + 5);
```

Output:

```text
205
```

The variable contains text, so the `+` operator joins the values.

### Mistake 3: Thinking conversion changes the original variable

```java
int age = 17;
String ageText = String.valueOf(age);
```

`age` is still an integer. Only `ageText` is a string.

### Mistake 4: Confusing a character with a string

```java
char grade = 'A';
String gradeText = String.valueOf(grade);
```

The original variable is a `char`; the new variable is a `String`.

---

## 8. Practice Exercises

### Exercise 1: Convert a Mark

Create an integer variable containing `92`. Use `String.valueOf()` to convert it into a string and display the result.

### Exercise 2: Convert an Average

Create a `double` variable containing `68.75`. Convert it into a string and display it.

### Exercise 3: Convert a Boolean

Create a boolean variable called `passed` containing `true`. Convert it into a string and display the result.

### Exercise 4: Build a Report

Create variables for a student's name and mark. Convert the mark to a string and combine both values into a sentence.

### Exercise 5: Predict the Output

Determine what each statement will display:

```java
int number = 12;
String numberText = String.valueOf(number);

System.out.println(number + 3);
System.out.println(numberText + 3);
System.out.println(numberText + " students");
```

Explain why the first statement produces a different result from the second.

---

## Summary

- `String.valueOf()` converts a value into its string representation.
- It can be used with values such as integers, doubles, booleans and characters.
- A converted string stores text rather than a numeric value.
- A string containing digits is not automatically a number.
- Conversion does not change the original variable's data type.
- `System.out.println()` displays values but does not change their data types.
