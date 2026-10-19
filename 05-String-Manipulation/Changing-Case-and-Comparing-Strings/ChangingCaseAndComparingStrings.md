# Changing Case and Comparing Strings

## Learning Objectives

By the end of this section, you should be able to:

- Convert a String to uppercase using `toUpperCase()`.
- Convert a String to lowercase using `toLowerCase()`.
- Compare String contents using `equals()`.
- Compare Strings without considering case using `equalsIgnoreCase()`.
- Explain why `==` should not normally be used to compare String contents.
- Use String comparison when checking entered information.

## 1. Changing the Case of a String

Java provides methods to change the case of letters in a String.

### Converting to uppercase

Use `toUpperCase()` to return a String with its letters converted to uppercase.

```java
String studentName = "Olivia Smith";

String upperName = studentName.toUpperCase();

System.out.println(upperName);
```

Output:

```text
OLIVIA SMITH
```

### Converting to lowercase

Use `toLowerCase()` to return a String with its letters converted to lowercase.

```java
String subjectName = "Information Technology";

String lowerSubject = subjectName.toLowerCase();

System.out.println(lowerSubject);
```

Output:

```text
information technology
```

Both methods return a new String. The original String is not changed.

## 2. Comparing Strings Using equals()

Use `equals()` to compare the contents of two Strings.

```java
String firstName = "Olivia";
String secondName = "Olivia";

System.out.println(firstName.equals(secondName));
```

Output:

```text
true
```

The result is `true` because both Strings contain the same sequence of characters.

If the contents differ, `equals()` returns `false`.

```java
String firstName = "Olivia";
String secondName = "Oliver";

System.out.println(firstName.equals(secondName));
```

Output:

```text
false
```

The comparison is case-sensitive.

## 3. Case-Sensitive Comparisons

A case-sensitive comparison treats uppercase and lowercase letters as different characters.

```java
String subjectOne = "Mathematics";
String subjectTwo = "MATHEMATICS";

System.out.println(subjectOne.equals(subjectTwo));
```

Output:

```text
false
```

The Strings differ in case, so `equals()` returns `false`.

This matters when comparing information entered by a Student, because the Student might type the same word using different capitalisation.

## 4. Comparing Strings Using equalsIgnoreCase()

Use `equalsIgnoreCase()` when the comparison should ignore differences in letter case.

```java
String subjectOne = "Mathematics";
String subjectTwo = "MATHEMATICS";

System.out.println(subjectOne.equalsIgnoreCase(subjectTwo));
```

Output:

```text
true
```

The comparison treats the two Strings as equal despite their different capitalisation.

For example:

```java
String enteredSubject = "information technology";

if (enteredSubject.equalsIgnoreCase("Information Technology")) {
    System.out.println("Subject recognised.");
} else {
    System.out.println("Subject not recognised.");
}
```

Output:

```text
Subject recognised.
```

This is useful when checking text where capitalisation should not matter.

## 5. Why Not Use == to Compare String Contents?

The `==` operator compares object references when it is used with objects such as Strings. It checks whether the references refer to the same object, not whether two different String objects contain the same text.

For example:

```java
String firstName = new String("Olivia");
String secondName = new String("Olivia");

System.out.println(firstName == secondName);
System.out.println(firstName.equals(secondName));
```

Output:

```text
false
true
```

The two variables refer to different String objects, so `==` returns `false`. However, their contents are identical, so `equals()` returns `true`.

**Remember:**
- Use `equals()` to compare String contents.
- Use `equalsIgnoreCase()` to compare String contents without considering case.
- Do not normally use `==` to compare String contents.

## 6. Combining Case Conversion and Comparison

You can convert a String to a consistent case before comparing it.

```java
String enteredSubject = "MATHEMATICS";

String standardSubject = enteredSubject.toLowerCase();

if (standardSubject.equals("mathematics")) {
    System.out.println("Subject recognised.");
}
```

Output:

```text
Subject recognised.
```

This works, but `equalsIgnoreCase()` is often simpler when the only requirement is to ignore letter case.

## 7. Common Mistakes

### Mistake 1: Using == for String content comparison

Incorrect for comparing contents:

```java
if (subjectOne == subjectTwo) {
    System.out.println("Subjects match.");
}
```

Correct:

```java
if (subjectOne.equals(subjectTwo)) {
    System.out.println("Subjects match.");
}
```

### Mistake 2: Expecting equals() to ignore case

```java
"English".equals("ENGLISH")
```

This returns `false`.

Use `equalsIgnoreCase()` if case should not matter.

### Mistake 3: Assuming toUpperCase() changes the original String

```java
String studentName = "Olivia";
studentName.toUpperCase();

System.out.println(studentName);
```

The output is still `Olivia`.

To retain the converted value, assign the result:

```java
studentName = studentName.toUpperCase();
```

### Mistake 4: Confusing assignment and comparison

- `=` assigns a value.
- `==` compares primitive values or object references.
- `equals()` compares String contents.

## 8. Practice Exercises

1. Convert `"Information Technology"` to uppercase.
2. Convert `"MATHEMATICS"` to lowercase.
3. Compare `"English"` and `"English"` using `equals()`.
4. Compare `"English"` and `"ENGLISH"` using `equals()` and `equalsIgnoreCase()`.
5. Explain why `==` is not the recommended way to compare String contents.
6. Write an `if-else` statement that recognises a subject name regardless of capitalisation.

## Summary

- `toUpperCase()` converts letters to uppercase.
- `toLowerCase()` converts letters to lowercase.
- `equals()` compares String contents and is case-sensitive.
- `equalsIgnoreCase()` compares String contents without considering case.
- `==` compares String references, not String contents.
- Strings are immutable, so case-conversion methods return a String rather than changing the original object.
