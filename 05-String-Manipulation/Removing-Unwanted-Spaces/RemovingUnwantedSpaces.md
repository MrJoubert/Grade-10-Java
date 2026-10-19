# Removing Unwanted Spaces

## Learning Objectives

By the end of this section, you should be able to:

- Explain what leading and trailing spaces are.
- Use `trim()` to remove leading and trailing spaces from a String.
- Explain why spaces can affect String comparisons.
- Use `trim()` before comparing or processing entered text.
- Distinguish between removing spaces at the ends of a String and removing spaces throughout a String.

## 1. What Are Leading and Trailing Spaces?

Leading spaces occur before the first character of a String.

Trailing spaces occur after the last character of a String.

Consider these two Strings:

```java
String firstName = "Olivia";
String enteredName = "  Olivia  ";
```

Although both appear to contain the same name, `enteredName` contains additional spaces at the beginning and end.

These spaces can affect comparisons and calculations involving String length.

## 2. Using trim()

Java provides the `trim()` method to remove leading and trailing characters with character values up to the space character, U+0020.

```java
String enteredName = "  Olivia  ";

String cleanedName = enteredName.trim();

System.out.println("Original: [" + enteredName + "]");
System.out.println("Cleaned: [" + cleanedName + "]");
```

Output:

```text
Original: [  Olivia  ]
Cleaned: [Olivia]
```

The square brackets make the spaces easier to see.

The `trim()` method returns a String without the removable leading and trailing characters. It does not change the original String.

## 3. How trim() Affects String Length

Spaces count as characters in a String.

```java
String enteredName = "  Liam  ";

System.out.println(enteredName.length());
System.out.println(enteredName.trim().length());
```

Output:

```text
8
4
```

The original String contains eight characters: two leading spaces, four letters and two trailing spaces.

After trimming, only the four letters remain.

## 4. Using trim() Before Comparing Strings

Consider a Student entering a subject name with an accidental space at the end.

```java
String enteredSubject = "Mathematics ";
String correctSubject = "Mathematics";

System.out.println(enteredSubject.equals(correctSubject));
```

Output:

```text
false
```

The Strings are not equal because the first contains an additional space.

You can remove the unwanted spaces before comparing:

```java
String enteredSubject = "Mathematics ";
String correctSubject = "Mathematics";

String cleanedSubject = enteredSubject.trim();

System.out.println(cleanedSubject.equals(correctSubject));
```

Output:

```text
true
```

This is useful when processing information entered through a keyboard.

## 5. Combining trim() with equalsIgnoreCase()

Sometimes you need to ignore both unwanted spaces at the ends and differences in capitalisation.

```java
String enteredSubject = "  MATHEMATICS ";
String correctSubject = "Mathematics";

String cleanedSubject = enteredSubject.trim();

if (cleanedSubject.equalsIgnoreCase(correctSubject)) {
    System.out.println("Subject recognised.");
} else {
    System.out.println("Subject not recognised.");
}
```

Output:

```text
Subject recognised.
```

The program removes the leading and trailing spaces before comparing the Strings without considering case.

## 6. trim() Does Not Remove All Spaces

The `trim()` method removes qualifying characters only from the beginning and end of the String.

It does not remove spaces between words.

```java
String fullName = "Olivia Smith";

System.out.println(fullName.trim());
```

Output:

```text
Olivia Smith
```

The space between the first name and surname remains.

Similarly:

```java
String fullName = "  Olivia Smith  ";

System.out.println(fullName.trim());
```

Output:

```text
Olivia Smith
```

Only the spaces at the ends are removed.

If you need to remove or replace spaces inside a String, a different approach is required.

## 7. Common Mistakes

### Mistake 1: Assuming trim() changes the original String

```java
String studentName = "  Liam  ";

studentName.trim();

System.out.println(studentName);
```

The original String still contains the spaces because Strings are immutable.

Correct:

```java
studentName = studentName.trim();
```

Alternatively, store the result in another String variable.

### Mistake 2: Assuming trim() removes spaces between words

```java
String fullName = "Olivia Smith";

System.out.println(fullName.trim());
```

The space between the names remains.

### Mistake 3: Comparing Strings before trimming

```java
String enteredName = "Liam ";
String correctName = "Liam";

System.out.println(enteredName.equals(correctName));
```

The result is `false`. Trim the entered value before comparing if leading and trailing spaces should be ignored.

### Mistake 4: Confusing trim() with isEmpty()

`trim()` returns a String with qualifying leading and trailing characters removed. `isEmpty()` checks whether a String contains zero characters.

For example:

```java
String enteredName = "   ";

System.out.println(enteredName.isEmpty());
System.out.println(enteredName.trim().isEmpty());
```

Output:

```text
false
true
```

## 8. Practice Exercises

1. Declare a String containing a Student's name with spaces at the beginning and end. Use `trim()` to clean it.
2. Display the length of a String before and after trimming.
3. Explain why `"Mathematics "` is not equal to `"Mathematics"`.
4. Compare a trimmed subject name using `equalsIgnoreCase()`.
5. Explain why `trim()` does not remove the space between a first name and surname.
6. Write a statement that stores the trimmed version of a variable back into the same variable.

## Summary

- Leading spaces appear before the first character.
- Trailing spaces appear after the last character.
- `trim()` removes qualifying leading and trailing characters.
- Spaces can affect String length and equality comparisons.
- `trim()` does not remove spaces between words.
- Strings are immutable, so the returned value must be stored or used.
