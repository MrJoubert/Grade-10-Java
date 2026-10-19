# Splitting Strings

## Learning Objectives

By the end of this section, you should be able to:

- Explain why a string may need to be separated into smaller parts.
- Use the `split()` method to divide a string.
- Store the resulting parts in a `String` array.
- Access individual parts using array indexes.
- Split strings using spaces, commas and other delimiters.
- Understand that `split()` uses a regular expression as its separator.

---

## 1. What Does It Mean to Split a String?

Splitting a string means dividing one long string into smaller strings using a separator.

For example, a school programme might store a student's full name in one string:

```java
String fullName = "Olivia Smith";
```

The program may need to separate the first name from the surname.

The `split()` method can divide the string at the space.

```java
String[] nameParts = fullName.split(" ");
```

The resulting array contains two strings:

| Index | Value |
|---|---|
| `0` | `"Olivia"` |
| `1` | `"Smith"` |

Remember that array indexes start at `0`.

You can access the parts using:

```java
System.out.println(nameParts[0]);
System.out.println(nameParts[1]);
```

Output:

```text
Olivia
Smith
```

---

## 2. Using the `split()` Method

### Syntax

```java
string.split("separator")
```

The separator tells Java where the string should be divided.

The method returns a `String` array containing the parts.

### Example 1: Splitting a full name

```java
String fullName = "Liam Jacobs";

String[] nameParts = fullName.split(" ");

System.out.println("First name: " + nameParts[0]);
System.out.println("Surname: " + nameParts[1]);
```

Output:

```text
First name: Liam
Surname: Jacobs
```

The string is split at the space between the two names.

### Example 2: Splitting a sentence

```java
String sentence = "Students study Java programming";

String[] words = sentence.split(" ");

System.out.println(words[0]);
System.out.println(words[1]);
System.out.println(words[2]);
System.out.println(words[3]);
```

Output:

```text
Students
study
Java
programming
```

Each word is stored as a separate element in the array.

---

## 3. Splitting a String Using a Comma

A string may contain several values separated by commas.

For example:

```java
String marks = "75,82,91";
```

To separate the marks:

```java
String[] markParts = marks.split(",");
```

The resulting array contains:

| Index | Value |
|---|---|
| `0` | `"75"` |
| `1` | `"82"` |
| `2` | `"91"` |

You can display the individual values:

```java
System.out.println(markParts[0]);
System.out.println(markParts[1]);
System.out.println(markParts[2]);
```

Output:

```text
75
82
91
```

Notice that these values are strings, not integers. If you need to perform calculations, convert them to numeric values first.

For example:

```java
int firstMark = Integer.parseInt(markParts[0]);
```

This converts the first string into an integer.

---

## 4. Understanding the Separator

The separator is the text or pattern that Java uses to identify where the string should be divided.

Examples:

| Original string | Separator | Resulting parts |
|---|---|---|
| `"Liam Jacobs"` | `" "` | `"Liam"`, `"Jacobs"` |
| `"75,82,91"` | `","` | `"75"`, `"82"`, `"91"` |
| `"11-A"` | `"-"` | `"11"`, `"A"` |
| `"Java;Python;HTML"` | `";"` | `"Java"`, `"Python"`, `"HTML"` |

The separator is removed from the resulting parts.

For example:

```java
String classCode = "11-A";

String[] parts = classCode.split("-");

System.out.println(parts[0]);
System.out.println(parts[1]);
```

Output:

```text
11
A
```

The hyphen is not included in either part.

---

## 5. Accessing Parts of the Result

The result of `split()` is a `String` array. You can access each part using its index.

```java
String subjects = "Mathematics,English,IT";

String[] subjectParts = subjects.split(",");

System.out.println(subjectParts[0]);
System.out.println(subjectParts[1]);
System.out.println(subjectParts[2]);
```

Output:

```text
Mathematics
English
IT
```

You can also use the array's `length` property to determine how many parts were created:

```java
System.out.println(subjectParts.length);
```

Output:

```text
3
```

**Important:** The array's `length` property does not use brackets. For a string, by contrast, `length()` is a method and requires parentheses.

---

## 6. Important: `split()` Uses Regular Expressions

The separator supplied to `split()` is interpreted as a regular expression (regex), not always as ordinary text.

Many simple separators, such as a comma, hyphen or semicolon, can be used directly.

However, some characters have special meanings in regular expressions.

For example, a full stop (`.`) matches any character in a regular expression. To split at a literal full stop, escape it:

```java
String fileName = "report.pdf";

String[] parts = fileName.split("\\.");

System.out.println(parts[0]);
System.out.println(parts[1]);
```

Output:

```text
report
pdf
```

In Java, `"\\."` represents the regular expression `\.`. The backslash tells the regular expression engine to treat the full stop as a literal character.

You do not need to memorise every regular expression. For basic string manipulation, focus on understanding the separator and the resulting array.

---

## 7. Common Mistakes

### Mistake 1: Forgetting that the result is an array

Incorrect:

```java
String result = fullName.split(" ");
```

The `split()` method returns a `String` array, not a single `String`.

Correct:

```java
String[] result = fullName.split(" ");
```

### Mistake 2: Using the wrong index

```java
String fullName = "Olivia Smith";
String[] parts = fullName.split(" ");

System.out.println(parts[0]);
```

This displays `Olivia`, because the first array element is at index `0`.

### Mistake 3: Accessing an index that does not exist

```java
String[] parts = "Liam Jacobs".split(" ");

System.out.println(parts[2]);
```

This causes an `ArrayIndexOutOfBoundsException` because the array contains only two elements, at indexes `0` and `1`.

Check how many parts are available before accessing an index.

### Mistake 4: Expecting numeric values

```java
String[] parts = "20,30".split(",");

System.out.println(parts[0] + parts[1]);
```

Output:

```text
2030
```

The parts are strings, so `+` joins them. Convert the values to integers if you want to add them.

### Mistake 5: Forgetting that spaces matter

```java
String[] parts = "Olivia Smith".split(" ");
```

This splits at ordinary spaces. It does not automatically split at every possible whitespace character or correct inconsistent spacing.

---

## 8. Practice Exercises

### Exercise 1: Separate a Full Name

Create a string containing a student's first name and surname. Use `split(" ")` to separate the names and display them on separate lines.

### Exercise 2: Separate Marks

Split the string `"65,78,92"` using a comma. Display each mark separately.

### Exercise 3: Separate a Class Code

Split `"12-A"` using the hyphen. Display the grade number and class group separately.

### Exercise 4: Count the Words

Split the string `"Java makes programming interesting"` at each space. Display the number of words using the array's `length` property.

### Exercise 5: Predict the Output

Determine the output before running the code:

```java
String subjects = "IT,CAT,Mathematics";

String[] parts = subjects.split(",");

System.out.println(parts[0]);
System.out.println(parts[1]);
System.out.println(parts.length);
```

### Exercise 6: Add Two Marks

Split the string `"35,40"` using a comma. Convert both resulting strings to integers and display their sum.

---

## Summary

- The `split()` method divides a string into smaller strings.
- The separator determines where the string is divided.
- The method returns a `String` array.
- Array indexes start at `0`.
- Use the array's `length` property to count the resulting parts.
- Values returned by `split()` are strings, even when they contain digits.
- The separator is interpreted as a regular expression, so some special characters must be escaped.
