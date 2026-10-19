# String Length and Empty Strings

## Learning Objectives

By the end of this section, you should be able to:

- Determine the number of characters in a String using `length()`.
- Store a String's length in an integer variable.
- Identify an empty String.
- Use `isEmpty()` to check whether a String contains zero characters.
- Distinguish between an empty String and a String containing spaces.

## 1. What Is String Length?

A String contains a sequence of characters. Java provides the `length()` method to determine how many UTF-16 code units the String contains.

For example:

```java
String studentName = "Liam";
int nameLength = studentName.length();

System.out.println(nameLength);
```

Output:

```text
4
```

The String `"Liam"` has four characters, so `length()` returns `4`.

**Important:** `length()` is a method, so you must include the brackets: `length()`.

## 2. Using length() with Student Information

A school management program can use String length to check information entered by a Student.

```java
String studentName = "Olivia Smith";

int nameLength = studentName.length();

System.out.println("Name: " + studentName);
System.out.println("Number of characters: " + nameLength);
```

Output:

```text
Name: Olivia Smith
Number of characters: 12
```

The space between the first name and surname is included in the length.

You can also use `length()` directly in an expression:

```java
System.out.println("Name length: " + studentName.length());
```

## 3. What Is an Empty String?

An empty String contains zero characters.

```java
String studentName = "";

System.out.println(studentName.length());
```

Output:

```text
0
```

An empty String is different from a String containing a space.

```java
String emptyText = "";
String spaceText = " ";

System.out.println(emptyText.length());
System.out.println(spaceText.length());
```

Output:

```text
0
1
```

The first String contains no characters. The second contains one space character.

## 4. Checking Whether a String Is Empty

Java provides the `isEmpty()` method to check whether a String has a length of zero.

```java
String studentName = "";

boolean empty = studentName.isEmpty();

System.out.println(empty);
```

Output:

```text
true
```

If the String contains at least one character, `isEmpty()` returns `false`.

```java
String studentName = "Liam";

System.out.println(studentName.isEmpty());
```

Output:

```text
false
```

The result is a Boolean value, so it can be stored in a `boolean` variable or used in an `if` statement.

## 5. Using String Length for Validation

Suppose a Student must enter a name before the program can continue.

```java
String studentName = "";

if (studentName.isEmpty()) {
    System.out.println("Please enter a Student name.");
} else {
    System.out.println("Student name accepted.");
}
```

Output:

```text
Please enter a Student name.
```

You can also use `length()` to check whether a String meets a minimum length.

```java
String classCode = "11A";

if (classCode.length() >= 3) {
    System.out.println("Class code length accepted.");
} else {
    System.out.println("Class code is too short.");
}
```

Output:

```text
Class code length accepted.
```

This example checks the length only. It does not verify that the class code follows a particular format.

## 6. Empty Strings and Spaces

Consider the following values:

```java
String firstName = "";
String secondName = " ";
String thirdName = "Liam";
```

Their lengths are:

| String value | Length | `isEmpty()` |
|---|---:|---|
| `""` | 0 | `true` |
| `" "` | 1 | `false` |
| `"Liam"` | 4 | `false` |

A String containing spaces is not empty.

If you need to check whether a String contains only whitespace or no characters, Java's `isBlank()` method is useful. However, `isBlank()` is different from `isEmpty()` and is available from Java 11 onwards.

For example:

```java
String studentName = " ";

System.out.println(studentName.isEmpty());
System.out.println(studentName.isBlank());
```

Output:

```text
false
true
```

## 7. Common Mistakes

### Mistake 1: Forgetting the brackets

Incorrect:

```java
int nameLength = studentName.length;
```

Correct:

```java
int nameLength = studentName.length();
```

### Mistake 2: Thinking a space is an empty String

```java
String studentName = " ";

System.out.println(studentName.isEmpty());
```

The result is `false` because the String contains a space.

### Mistake 3: Confusing length with the final position

For the String `"Liam"`, the length is `4`, but the character positions are `0`, `1`, `2` and `3`.

The length is not the same as the index of the last character.

### Mistake 4: Calling a String method on null

```java
String studentName = null;
System.out.println(studentName.length());
```

This causes a `NullPointerException` because `null` does not refer to a String object. An empty String and `null` are not the same.

## 8. Practice Exercises

1. Declare a String containing a Student's full name and display its length.
2. Declare an empty String and display the result of `isEmpty()`.
3. Declare a String containing one space. Display its length and the result of `isEmpty()`.
4. Write an `if-else` statement that checks whether a subject name is empty.
5. Explain why the length of `"Liam Jacobs"` includes the space.
6. Explain the difference between an empty String and `null`.

## Summary

- Use `length()` to determine the number of UTF-16 code units in a String.
- Use `isEmpty()` to check whether a String has zero characters.
- A space is a character, so `" "` is not empty.
- String length can help with simple input validation.
- An empty String and `null` are different.
