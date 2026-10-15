# String Manipulation

## Overview

Text is one of the most common forms of information processed by computer programs. Applications frequently need to store names, display messages, process descriptions and compare text entered by users.

In Java, text is represented using the `String` class. A String is a sequence of characters that can be stored in a variable and processed using built-in methods and operators.

**String manipulation** refers to working with text by combining Strings, determining their length, changing their letter case, comparing their contents and converting values where necessary.

These skills are essential when developing interactive programs, processing user input and displaying meaningful information.

This topic introduces the fundamental String operations appropriate for **Grade 10 Information Technology Students studying Java according to the IEB curriculum**.

---

## Learning Objectives

By completing this topic, you should be able to:

- Explain what a String is and how it differs from a primitive data type.
- Declare and initialise String variables.
- Determine the length of a String using `length()`.
- Combine Strings using concatenation.
- Convert text to uppercase and lowercase.
- Compare String contents correctly using `equals()`.
- Understand the difference between String comparison using `equals()` and `==`.
- Perform basic conversions involving Strings and other data types.
- Use String methods to process and display information.
- Identify common errors when working with Strings.

---

## Curriculum Alignment

This topic supports the Grade 10 Java concepts associated with Strings, including:

- String length.
- String concatenation.
- Uppercase and lowercase conversion.
- Comparing Strings.
- Basic String conversion.

These skills also support input and output, data type conversion and the development of interactive Java programs.

**Scope:** This topic focuses on foundational String operations. More advanced algorithms involving counting or isolating words, removing vowels, encryption, name conversion and ID validation belong to more advanced programming work and are not covered here as core Grade 10 material.

**Curriculum note:** This repository is a supplementary learning resource. Students should use these notes alongside prescribed course material, practical activities and official IEB assessment guidance.

---

## Topic Structure

Work through the following five subtopics in order.

| Subtopic | What You Will Learn |
|---|---|
| [String Length](String-Length/README.md) | Determine the number of characters in a String using `length()`. |
| [String Concatenation](String-Concatenation/README.md) | Combine text and variables using the `+` operator. |
| [Uppercase and Lowercase](Uppercase-and-Lowercase/README.md) | Change the letter case of a String using built-in methods. |
| [Comparing Strings](Comparing-Strings/README.md) | Compare String contents correctly and understand `equals()` and `==`. |
| [Basic String Conversion](Basic-String-Conversion/README.md) | Understand basic conversions between Strings and other data types. |

---

## 1. Understanding Strings

A `String` represents text. Unlike primitive data types such as `int`, `double`, `char` and `boolean`, `String` is a reference type provided by Java's standard library.

String literals are written inside double quotation marks.

```java
String studentName = "Alex";
String schoolName = "Crawford";
String message = "Welcome to Java!";
```

Each variable stores a reference to a String object containing text.

Strings can contain letters, numbers, spaces and symbols. For example:

```java
String phoneNumber = "0123456789";
String markText = "85";
String greeting = "Hello, Student!";
```

Even though `phoneNumber` and `markText` contain digits, their values are text because the variables are declared as `String`.

This distinction matters when performing calculations or comparing values.

---

## 2. Determining String Length

Java provides the `length()` method to determine the number of UTF-16 code units in a String.

For ordinary English text, this usually corresponds to the number of characters students expect to count.

### Example

```java
String word = "Computer";

int numberOfCharacters = word.length();

System.out.println(numberOfCharacters);
```

Output:

```text
8
```

The String `"Computer"` contains eight characters.

### Practical Application

A program may need to determine the length of a Student's name or check whether text meets a basic length requirement.

```java
String studentName = "Alex";

System.out.println(
    "Number of characters: " + studentName.length()
);
```

Output:

```text
Number of characters: 4
```

**Important:** `length()` is a method, so it requires parentheses. It is not a property accessed using `word.length`.

---

## 3. Combining Strings

String concatenation means joining two or more pieces of text together.

In Java, the `+` operator can concatenate Strings.

### Example

```java
String firstName = "Alex";
String surname = "Smith";

String fullName = firstName + " " + surname;

System.out.println(fullName);
```

Output:

```text
Alex Smith
```

The expression joins the first name, a space and the surname.

### Combining Text and Numbers

The `+` operator can also combine text with numerical values.

```java
String studentName = "Alex";
int mark = 85;

System.out.println(
    studentName + " obtained " + mark + "%"
);
```

Output:

```text
Alex obtained 85%
```

When a String is involved in the expression, `+` can perform concatenation rather than numerical addition.

For example:

```java
System.out.println("10" + 5);
```

Output:

```text
105
```

The result is text concatenation, not the numerical value `15`.

Understanding the difference between concatenation and arithmetic is important when displaying calculated results.

---

## 4. Changing Letter Case

Java provides built-in methods for converting Strings to uppercase or lowercase.

- `toUpperCase()` returns a String with its letters converted to uppercase where applicable.
- `toLowerCase()` returns a String with its letters converted to lowercase where applicable.

### Example

```java
String studentName = "Alex Smith";

System.out.println(studentName.toUpperCase());
System.out.println(studentName.toLowerCase());
```

Output:

```text
ALEX SMITH
alex smith
```

These methods are useful when formatting text or preparing information for certain types of comparison.

### Important Consideration

Strings in Java are immutable. This means that a String object cannot be changed after it has been created.

The methods `toUpperCase()` and `toLowerCase()` return a String result. If you want to store that result, assign it to a variable.

```java
String studentName = "Alex Smith";

studentName = studentName.toUpperCase();

System.out.println(studentName);
```

Output:

```text
ALEX SMITH
```

The variable now refers to the uppercase result.

---

## 5. Comparing Strings

Programs often need to determine whether two pieces of text contain the same characters.

For example, a program may compare a user's answer with an expected answer or check whether two names are equal.

The `equals()` method compares String contents.

### Example

```java
String firstName = "Alex";
String secondName = "Alex";

boolean sameName = firstName.equals(secondName);

System.out.println(sameName);
```

Output:

```text
true
```

The two Strings contain the same sequence of characters.

### Case Sensitivity

The `equals()` method is case-sensitive.

```java
String firstWord = "Java";
String secondWord = "JAVA";

System.out.println(firstWord.equals(secondWord));
```

Output:

```text
false
```

The Strings differ because their letter cases are different.

If a case-insensitive comparison is required, Java provides `equalsIgnoreCase()`:

```java
String firstWord = "Java";
String secondWord = "JAVA";

System.out.println(firstWord.equalsIgnoreCase(secondWord));
```

Output:

```text
true
```

### `equals()` Versus `==`

These two expressions are not equivalent:

```java
firstName.equals(secondName)
```

```java
firstName == secondName
```

For Strings, `equals()` compares the contents. The `==` operator compares whether two references refer to the same object.

When checking whether two Strings contain the same text, use `equals()` or `equalsIgnoreCase()` as appropriate.

---

## 6. Basic String Conversion

String conversion is closely related to the work covered in the Type Conversion and Casting topic.

A String containing a valid number can be converted into a numeric value.

```java
String markText = "85";

int mark = Integer.parseInt(markText);

System.out.println(mark + 5);
```

Output:

```text
90
```

The String is converted into an integer before the calculation is performed.

Java also provides `String.valueOf()` to convert values into their String representation.

```java
int mark = 85;

String markText = String.valueOf(mark);

System.out.println("Mark: " + markText);
```

Output:

```text
Mark: 85
```

These conversions serve different purposes:

- Parsing converts suitable text into a value of a specified data type.
- Converting a value to a String produces a textual representation.

If the input String does not contain a valid number, a parsing method may throw a `NumberFormatException`.

---

## 7. Common String Errors

### Error 1: Using single quotation marks for a String

Incorrect:

```java
String name = 'Alex';
```

Correct:

```java
String name = "Alex";
```

Single quotation marks are used for a `char` literal, while double quotation marks are used for a String literal.

### Error 2: Using `length` instead of `length()`

Incorrect:

```java
int size = name.length;
```

Correct:

```java
int size = name.length();
```

The length of a String is obtained by calling its `length()` method.

### Error 3: Comparing String contents with `==`

When checking whether two Strings contain the same text, use:

```java
firstName.equals(secondName)
```

Do not rely on `==` for content comparison.

### Error 4: Assuming concatenation performs arithmetic

```java
String number = "10";

System.out.println(number + 5);
```

The result is `105`, because the expression concatenates text.

Convert the String to a numeric type if the intention is to perform arithmetic.

### Error 5: Assuming a String method changes the original String

Calling `toUpperCase()` returns a String result. Store that result if it needs to be used later.

---

## 8. Practical Applications

String manipulation is useful in many introductory programming situations.

### Displaying a Full Name

Combine a first name and surname to display a full name.

### Formatting Messages

Combine fixed text with variable values to produce informative output.

### Checking Text Length

Determine how many characters a String contains.

### Standardising Letter Case

Convert text to a consistent case when formatting output or preparing comparisons.

### Comparing Answers

Compare a user's text with an expected answer using `equals()` or `equalsIgnoreCase()`.

These applications demonstrate how basic String operations make programs more useful and interactive.

---

## 9. Practical Challenge

Create a Java program called `StringPractice` that:

1. Declares a variable for a Student's first name.
2. Declares a variable for the Student's surname.
3. Combines both values into a full name.
4. Displays the full name.
5. Displays the number of UTF-16 code units in the full name.
6. Displays the full name in uppercase.
7. Displays the full name in lowercase.
8. Compares the full name with another String using `equals()`.
9. Converts an integer mark into a String for display.

Use meaningful variable names and descriptive output messages.

**Extension:** Explain why `"Java".equals("JAVA")` returns `false`, while `"Java".equalsIgnoreCase("JAVA")` returns `true`.

---

## 10. Key Takeaways

By the end of this topic, you should understand that:

- A String stores text and is a reference type.
- The `length()` method determines the number of UTF-16 code units in a String.
- The `+` operator can concatenate Strings.
- `toUpperCase()` and `toLowerCase()` return Strings with converted letter case.
- `equals()` compares String contents and is case-sensitive.
- `equalsIgnoreCase()` compares String contents without requiring matching letter case.
- `==` compares references rather than String contents.
- String conversion allows text and values of other data types to be used appropriately.
- Strings are immutable, so methods return results rather than modifying an existing String object.

These concepts form the foundation for working with text in Java and will be useful throughout the rest of the Grade 10 Java Code Library.

---

## Navigation

[**← Previous: Type Conversion and Casting**](../04-Type-Conversion-and-Casting/README.md)

[**Next: Boolean Logic →**](../06-Boolean-Logic/README.md)

[Return to the Grade 10 Java repository](../README.md)
