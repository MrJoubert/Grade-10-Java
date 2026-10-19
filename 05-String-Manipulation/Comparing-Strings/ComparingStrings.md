# Comparing Strings

## Learning Objectives

By the end of this section, you should be able to:

- Compare two strings to determine whether their contents are equal.
- Use the `equals()` method.
- Use the `equalsIgnoreCase()` method.
- Explain why `==` should not normally be used to compare the contents of strings.
- Use string comparisons in `if` statements.
- Understand that spaces and spelling affect string comparisons.

---

## 1. Why Do We Compare Strings?

A program often needs to check whether two pieces of text are the same.

For example, a school programme might need to check whether:

- A student's name matches a name entered by a user.
- A subject name matches a particular subject.
- A class code matches the required class.
- A student's answer matches an expected word.

Java provides methods that allow us to compare the contents of strings.

## 2. Using `equals()`

The `equals()` method compares the contents of two strings.

### Syntax

```java
string1.equals(string2)
```

The method returns a `boolean` value:

- `true` if the strings contain exactly the same characters.
- `false` if the strings differ.

The comparison is case-sensitive. This means that uppercase and lowercase letters are treated as different characters.

### Example 1: Equal strings

```java
String subjectOne = "Mathematics";
String subjectTwo = "Mathematics";

System.out.println(subjectOne.equals(subjectTwo));
```

Output:

```text
true
```

Both strings contain exactly the same text.

### Example 2: Different strings

```java
String subjectOne = "Mathematics";
String subjectTwo = "English";

System.out.println(subjectOne.equals(subjectTwo));
```

Output:

```text
false
```

The contents of the strings are different.

### Example 3: Case-sensitive comparison

```java
String nameOne = "Olivia";
String nameTwo = "olivia";

System.out.println(nameOne.equals(nameTwo));
```

Output:

```text
false
```

The first string begins with an uppercase `O`, while the second begins with a lowercase `o`.

Even though the names look similar, the strings are not exactly equal.

---

## 3. Using `equalsIgnoreCase()`

The `equalsIgnoreCase()` method compares two strings without considering differences between uppercase and lowercase letters.

### Syntax

```java
string1.equalsIgnoreCase(string2)
```

### Example

```java
String subjectOne = "Information Technology";
String subjectTwo = "information technology";

System.out.println(subjectOne.equalsIgnoreCase(subjectTwo));
```

Output:

```text
true
```

The text is the same apart from the letter case.

### Comparing names

```java
String enteredName = "LIAM";
String storedName = "Liam";

if (enteredName.equalsIgnoreCase(storedName)) {
    System.out.println("Names match.");
} else {
    System.out.println("Names do not match.");
}
```

Output:

```text
Names match.
```

This is useful when differences in capitalisation should not affect the result.

**Important:** `equalsIgnoreCase()` ignores letter case, but it does not ignore spaces or spelling differences.

For example:

```java
System.out.println("Liam".equalsIgnoreCase("Liam "));
```

Output:

```text
false
```

The second string contains an extra space at the end.

---

## 4. Why Should You Avoid `==` for String Contents?

The `==` operator checks whether two object references refer to the same object. It does not reliably tell you whether two separate `String` objects contain the same text.

Consider the following example:

```java
String nameOne = new String("Olivia");
String nameTwo = new String("Olivia");

System.out.println(nameOne == nameTwo);
System.out.println(nameOne.equals(nameTwo));
```

Output:

```text
false
true
```

Both variables contain strings with the text `"Olivia"`, but the two objects are separate objects.

- `==` checks whether the references point to the same object.
- `equals()` checks whether the strings contain the same characters.

For comparing the text stored in strings, use `equals()` or `equalsIgnoreCase()` as appropriate.

---

## 5. Comparing Strings in an `if` Statement

A string comparison can be used as a condition in an `if` statement.

### Example: Checking a subject

```java
String subject = "Computer Applications Technology";

if (subject.equals("Computer Applications Technology")) {
    System.out.println("Correct subject.");
} else {
    System.out.println("Different subject.");
}
```

Output:

```text
Correct subject.
```

The `equals()` method returns `true`, so the first message is displayed.

### Example: Checking a class code

```java
String classCode = "12A";

if (classCode.equalsIgnoreCase("12a")) {
    System.out.println("Class code matches.");
} else {
    System.out.println("Class code does not match.");
}
```

Output:

```text
Class code matches.
```

The comparison ignores the difference in letter case.

---

## 6. Spaces and Spelling Matter

The `equals()` method compares the complete contents of the strings.

| First string | Second string | Result using `equals()` |
|---|---|---|
| `"Olivia"` | `"Olivia"` | `true` |
| `"Olivia"` | `"olivia"` | `false` |
| `"Liam"` | `"Liam "` | `false` |
| `"Grade 12"` | `"Grade12"` | `false` |
| `"English"` | `"Engish"` | `false` |

An extra space, a missing space or a spelling difference can cause a comparison to return `false`.

If unwanted spaces may be present, you can remove leading and trailing spaces before comparing:

```java
String enteredName = " Olivia ";
String storedName = "Olivia";

if (enteredName.trim().equals(storedName)) {
    System.out.println("Names match.");
}
```

Output:

```text
Names match.
```

The `trim()` method removes spaces at the beginning and end of a string before the comparison takes place.

---

## 7. Common Mistakes

### Mistake 1: Using `==` to compare string contents

Incorrect approach:

```java
if (nameOne == nameTwo) {
    System.out.println("Names match.");
}
```

Use `equals()` when you want to compare the text stored in the strings.

### Mistake 2: Forgetting that `equals()` is case-sensitive

```java
System.out.println("English".equals("ENGLISH"));
```

Output:

```text
false
```

Use `equalsIgnoreCase()` if capitalisation should not matter.

### Mistake 3: Expecting spaces to be ignored

```java
System.out.println("Grade 12".equals("Grade12"));
```

Output:

```text
false
```

The strings contain different characters.

### Mistake 4: Confusing a comparison with an assignment

```java
String subject = "Mathematics";
```

The `=` operator assigns a value to a variable.

```java
subject.equals("Mathematics")
```

The `equals()` method compares string contents and returns a boolean value.

---

## 8. Practice Exercises

### Exercise 1: Compare Two Names

Create two string variables containing student names. Use `equals()` to display whether the names match.

### Exercise 2: Ignore Capitalisation

Compare `"INFORMATION TECHNOLOGY"` with `"Information Technology"` using `equalsIgnoreCase()`.

### Exercise 3: Predict the Output

Without running the code, predict the result of each comparison:

```java
System.out.println("Liam".equals("Liam"));
System.out.println("Liam".equals("liam"));
System.out.println("Grade 11".equals("Grade11"));
System.out.println("CAT".equalsIgnoreCase("cat"));
```

Run the program to check your answers.

### Exercise 4: Use an `if` Statement

Create a string variable called `classCode` containing `"11A"`.

Use an `if` statement and `equals()` to check whether it matches `"11A"`. Display an appropriate message for each possible result.

### Exercise 5: Correct the Comparison

The following code is intended to check whether two strings contain the same text:

```java
String answerOne = new String("Java");
String answerTwo = new String("Java");

if (answerOne == answerTwo) {
    System.out.println("Correct");
} else {
    System.out.println("Incorrect");
}
```

Change the condition so that it correctly compares the contents of the two strings.

---

## Summary

- `equals()` compares string contents and is case-sensitive.
- `equalsIgnoreCase()` compares string contents without considering letter case.
- `==` compares object references, not string contents.
- Extra spaces and spelling differences affect comparisons.
- String comparisons return a boolean value: `true` or `false`.
- String comparison methods can be used directly in `if` statements.
