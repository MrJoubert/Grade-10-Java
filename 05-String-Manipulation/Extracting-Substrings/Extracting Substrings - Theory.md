# Extracting Substrings

## Learning Objectives

By the end of this section, you should be able to:

- Explain what a substring is.
- Use `substring()` with one argument.
- Use `substring()` with two arguments.
- Understand the difference between a starting position and an ending position.
- Extract parts of Student names, class codes and other String values.
- Avoid invalid substring positions.

## 1. What Is a Substring?

A substring is a smaller String extracted from an existing String.

For example, the String `"INFORMATION"` contains the substring `"INFO"`.

Java provides the `substring()` method to extract part of a String.

```java
String subjectName = "INFORMATION";

String section = subjectName.substring(0, 4);

System.out.println(section);
```

Output:

```text
INFO
```

The original String remains unchanged. The method returns a new String containing the selected characters.

## 2. Understanding String Positions

Java starts counting positions at zero.

Consider the String `"CRAWFORD"`:

| Character | C | R | A | W | F | O | R | D |
|---|---:|---:|---:|---:|---:|---:|---:|---:|
| Position | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |

These positions are important when extracting a substring.

## 3. Using substring() with One Argument

The one-argument version of `substring()` extracts characters from the specified starting position to the end of the String.

Syntax:

```java
stringName.substring(startPosition)
```

Example:

```java
String studentNumber = "20261234";

String remainingNumber = studentNumber.substring(4);

System.out.println(remainingNumber);
```

Output:

```text
1234
```

The extraction starts at position `4` and continues to the end.

The starting position is included in the result.

## 4. Using substring() with Two Arguments

The two-argument version allows you to specify both a starting position and an ending position.

Syntax:

```java
stringName.substring(startPosition, endPosition)
```

The starting position is included, but the ending position is excluded.

For example:

```java
String studentNumber = "20261234";

String year = studentNumber.substring(0, 4);

System.out.println(year);
```

Output:

```text
2026
```

The characters at positions `0`, `1`, `2` and `3` are included. The character at position `4` is not included.

**Remember:** The ending position indicates where extraction stops, not the position of the last character included.

## 5. Extracting Parts of a Student Number

Suppose a Student number is stored as `"20261234"`.

You can extract different sections:

```java
String studentNumber = "20261234";

String year = studentNumber.substring(0, 4);
String studentCode = studentNumber.substring(4, 8);

System.out.println(year);
System.out.println(studentCode);
```

Output:

```text
2026
1234
```

This example assumes that the Student number has exactly eight characters.

## 6. Extracting Part of a Class Code

Consider a class code stored as `"GRADE11A"`.

```java
String classCode = "GRADE11A";

String gradeText = classCode.substring(5, 7);
String classGroup = classCode.substring(7);

System.out.println(gradeText);
System.out.println(classGroup);
```

Output:

```text
11
A
```

The first substring extracts the characters at positions `5` and `6`. The second starts at position `7` and continues to the end.

This approach works when the String follows the expected format.

## 7. Combining substring() and length()

You can use `length()` to extract the last few characters without needing to know the complete length in advance.

```java
String studentNumber = "20261234";

String lastFourDigits = studentNumber.substring(
        studentNumber.length() - 4);

System.out.println(lastFourDigits);
```

Output:

```text
1234
```

The method calculates the starting position by subtracting four from the String's length.

This assumes that the String contains at least four characters.

## 8. Common Mistakes

### Mistake 1: Including the ending position

```java
String subject = "COMPUTER";

String result = subject.substring(0, 3);
```

The result is `"COM"`, not `"COMP"`. The ending position is excluded.

### Mistake 2: Starting from position 1

```java
String subject = "COMPUTER";

String result = subject.substring(0, 3);
```

The result starts with the character at position `0`, which is `C`.

### Mistake 3: Using an invalid position

```java
String studentNumber = "1234";

String result = studentNumber.substring(5);
```

This causes a `StringIndexOutOfBoundsException` because position `5` is beyond the end of the String.

### Mistake 4: Assuming substring() changes the original String

```java
String subject = "COMPUTER";

subject.substring(0, 3);

System.out.println(subject);
```

The output is still `"COMPUTER"`. The returned substring must be assigned to a variable or used directly if you want to use it.

Correct:

```java
String shortName = subject.substring(0, 3);
```

## 9. Practice Exercises

1. Extract `"INFO"` from `"INFORMATION"` using `substring()`.
2. Extract the last four characters from `"20261234"`.
3. Extract the first four characters from `"20261234"`.
4. Given `"GRADE12B"`, extract `"12"` and `"B"`.
5. Explain why `substring(0, 4)` extracts four characters rather than five.
6. Write code that extracts the final three characters from a String using `length()`.

## Summary

- A substring is part of an existing String.
- `substring(start)` extracts from the starting position to the end.
- `substring(start, end)` extracts from the starting position up to, but excluding, the ending position.
- String positions start at zero.
- `length()` can help calculate substring positions.
- Invalid positions cause a `StringIndexOutOfBoundsException`.
- Strings are immutable; `substring()` returns a new String.
