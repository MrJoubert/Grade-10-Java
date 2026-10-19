# String Manipulation Practice

## Learning Objectives

By completing this section, you should be able to:

- Apply string methods to solve practical programming problems.
- Extract characters and substrings using indexes.
- Search for characters and substrings.
- Change the case of a string and remove unwanted spaces.
- Replace characters and substrings.
- Join strings using concatenation.
- Compare strings correctly.
- Convert values into strings.
- Split strings into smaller parts.
- Combine string operations to process information.

---

## 1. String Manipulation Overview

String manipulation means working with text in a Java programme.

Java provides several methods and operators for processing strings.

| Method or operator | Purpose |
|---|---|
| `length()` | Returns the number of characters in a string |
| `charAt(index)` | Returns the character at a specified index |
| `substring(start)` | Extracts part of a string from an index to the end |
| `substring(start, end)` | Extracts part of a string from the start index up to, but not including, the end index |
| `indexOf()` | Finds the first occurrence of a character or substring |
| `lastIndexOf()` | Finds the last occurrence of a character or substring |
| `toUpperCase()` | Converts letters to uppercase |
| `toLowerCase()` | Converts letters to lowercase |
| `trim()` | Removes leading and trailing spaces |
| `replace()` | Replaces characters or character sequences |
| `equals()` | Compares string contents, including letter case |
| `equalsIgnoreCase()` | Compares string contents without considering letter case |
| `concat()` | Joins strings |
| `split()` | Divides a string into an array of strings |
| `String.valueOf()` | Converts a value into its string representation |
| `+` | Joins strings and can also perform arithmetic |

---

## 2. Extracting Characters

The `charAt()` method retrieves one character from a string.

```java
String classCode = "12A";

System.out.println(classCode.charAt(0));
System.out.println(classCode.charAt(2));
```

Output:

```text
1
A
```

String indexes start at `0`, so the first character is at index `0`.

Be careful not to access an index that is outside the string's valid range.

---

## 3. Extracting Substrings

The `substring()` method extracts a section of a string.

```java
String studentName = "Olivia Smith";

System.out.println(studentName.substring(0, 6));
System.out.println(studentName.substring(7));
```

Output:

```text
Olivia
Smith
```

The starting index is included, but the ending index in `substring(start, end)` is excluded.

---

## 4. Searching Within Strings

Use `indexOf()` to find the position of a character or substring.

```java
String subject = "Information Technology";

System.out.println(subject.indexOf("Technology"));
```

Output:

```text
13
```

If the requested text cannot be found, `indexOf()` returns `-1`.

Use `lastIndexOf()` when you need the final occurrence of a character or substring.

---

## 5. Changing Case and Removing Spaces

```java
String studentName = "  Olivia Smith  ";

System.out.println(studentName.trim());
System.out.println(studentName.toUpperCase());
System.out.println(studentName.toLowerCase());
```

The `trim()` method removes spaces at the beginning and end. It does not remove spaces between words.

The case-conversion methods return new strings. Assign the result to a variable if you need to store it.

---

## 6. Replacing Text

The `replace()` method replaces matching characters or sequences of characters.

```java
String classCode = "11A";

classCode = classCode.replace('A', 'B');

System.out.println(classCode);
```

Output:

```text
11B
```

Remember that strings are immutable. Assign the returned string if you want to keep the modified result.

---

## 7. Joining Strings

The `+` operator and `concat()` method can combine strings.

```java
String firstName = "Liam";
String surname = "Jacobs";

String fullName = firstName + " " + surname;

System.out.println(fullName);
```

Output:

```text
Liam Jacobs
```

Java does not automatically insert spaces between joined strings.

When combining text and numeric values, remember that `+` may perform concatenation instead of arithmetic.

```java
System.out.println("Total: " + (10 + 5));
```

Output:

```text
Total: 15
```

The brackets ensure that the addition happens first.

---

## 8. Comparing Strings

Use `equals()` to compare string contents.

```java
String answer = "Java";

System.out.println(answer.equals("Java"));
System.out.println(answer.equals("JAVA"));
System.out.println(answer.equalsIgnoreCase("JAVA"));
```

Output:

```text
true
false
true
```

Use `equals()` when letter case matters. Use `equalsIgnoreCase()` when letter case should not affect the result.

Do not normally use `==` to compare the contents of strings.

---

## 9. Converting Values to Strings

Use `String.valueOf()` to convert a value into a string.

```java
int mark = 85;

String markText = String.valueOf(mark);

System.out.println(markText);
```

The resulting variable stores text rather than an integer.

This is useful when you need to combine values into a message or report.

---

## 10. Splitting Strings

The `split()` method divides a string into an array of strings.

```java
String marks = "65,78,92";

String[] markParts = marks.split(",");

System.out.println(markParts[0]);
System.out.println(markParts[1]);
System.out.println(markParts[2]);
```

Output:

```text
65
78
92
```

The array indexes start at `0`. The values are strings, so convert them to integers before performing arithmetic.

---

## 11. Integrated Practice Exercises

Complete the exercises in order. Use the appropriate string methods rather than manually typing the expected answers.

### Exercise 1: Student Name

Given a string containing a student's full name:

1. Display the number of characters.
2. Display the first character.
3. Extract the first name.
4. Extract the surname.

### Exercise 2: Subject Processing

Given the string `"Information Technology"`:

1. Display the subject in uppercase.
2. Display the subject in lowercase.
3. Find the position of `"Technology"`.
4. Check whether the subject equals `"Information Technology"`.

### Exercise 3: Clean and Compare

Given an entered name containing leading and trailing spaces:

1. Remove the unwanted spaces.
2. Compare the cleaned name with a stored name.
3. Display whether the names match.

### Exercise 4: Update a Class Code

Given a class code of `"11A"`:

1. Extract the grade number.
2. Extract the class group.
3. Replace the class group with `"B"`.
4. Display the updated class code.

### Exercise 5: Process Marks

Given the string `"65,78,92"`:

1. Split the string at each comma.
2. Convert the values to integers.
3. Calculate the total.
4. Calculate the average.

### Exercise 6: Build a Report

Use the supplied student information to create a complete sentence containing the student's full name, class code and mark.

Use concatenation to combine the values.

### Exercise 7: Find and Replace

Given the string `"Computer Studies"`:

1. Find the position of `"Studies"`.
2. Replace `"Studies"` with `"Applications Technology"`.
3. Display the updated subject.

### Exercise 8: Combined Challenge

Write a programme that processes a student's name and marks.

Your programme must:

1. Remove unwanted spaces from the name.
2. display the name in title case only if you implement the conversion yourself; otherwise, retain the cleaned name and display it in uppercase.
3. Split a comma-separated string of marks.
4. Convert the marks to integers.
5. Calculate the total and average.
6. Display a formatted report.

---

## Summary

String manipulation is an important programming skill. The correct method depends on the task:

- Use `length()` to count characters.
- Use `charAt()` and `substring()` to extract text.
- Use `indexOf()` and `lastIndexOf()` to search.
- Use `trim()` to remove leading and trailing spaces.
- Use `replace()` to substitute text.
- Use `+` or `concat()` to join strings.
- Use `equals()` or `equalsIgnoreCase()` to compare string contents.
- Use `String.valueOf()` to convert values to text.
- Use `split()` to divide strings into arrays.

Practise combining these methods to solve problems rather than treating each method as an isolated skill.
