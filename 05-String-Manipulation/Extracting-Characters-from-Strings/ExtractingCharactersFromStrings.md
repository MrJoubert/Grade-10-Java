# Extracting Characters from Strings

## Learning Objectives

By the end of this section, you should be able to:

- Use `charAt()` to extract an individual character from a String.
- Identify the position of a character in a String.
- Explain why Java String positions start at zero.
- Extract the first, last and selected characters from a String.
- Use String length to determine the position of the last character.
- Avoid errors when accessing characters outside a String's valid positions.

## 1. What Does charAt() Do?

Java provides the `charAt()` method to retrieve a character at a specified position in a String.

```java
String studentName = "Olivia";

char firstLetter = studentName.charAt(0);

System.out.println(firstLetter);
```

Output:

```text
O
```

The `charAt()` method returns a `char`, not a String.

## 2. Understanding String Positions

Java starts counting String positions at **zero**.

Consider the String `"JACOBS"`.

| Character | J | A | C | O | B | S |
|---|---:|---:|---:|---:|---:|---:|
| Position | 0 | 1 | 2 | 3 | 4 | 5 |

The following statements retrieve different characters:

```java
String surname = "JACOBS";

char firstLetter = surname.charAt(0);
char thirdLetter = surname.charAt(2);
char lastLetter = surname.charAt(5);
```

The results are `J`, `C` and `S`, respectively.

## 3. Extracting the First Character

To extract the first character, use position `0`.

```java
String subjectName = "Mathematics";

char firstLetter = subjectName.charAt(0);

System.out.println(firstLetter);
```

Output:

```text
M
```

This can be useful when extracting a Student's initial or examining the first character of a subject name.

## 4. Extracting the Last Character

The position of the last character depends on the length of the String.

The formula is:

\[
\text{Last position}=\text{String length}-1
\]

For example:

```java
String studentName = "Liam";

int nameLength = studentName.length();
char lastLetter = studentName.charAt(nameLength - 1);

System.out.println(lastLetter);
```

Output:

```text
m
```

The length of `"Liam"` is `4`, but the final character is at position `3`.

Using `length() - 1` means the code can work with names of different lengths, provided the String is not empty.

## 5. Extracting a Character at a Specific Position

You can retrieve a character from any valid position.

```java
String className = "Grade 11";

char character = className.charAt(6);

System.out.println(character);
```

Output:

```text
1
```

The space is also counted as a character. The positions are:

| Character | G | r | a | d | e | space | 1 | 1 |
|---|---:|---:|---:|---:|---:|---:|---:|---:|
| Position | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |

## 6. Extracting Initials

Suppose a Student's first name and surname are stored separately.

```java
String firstName = "Liam";
String surname = "Jacobs";

char firstInitial = firstName.charAt(0);
char surnameInitial = surname.charAt(0);

System.out.println(firstInitial);
System.out.println(surnameInitial);
```

Output:

```text
L
J
```

The two characters can also be combined into a String:

```java
String initials = "" + firstInitial + surnameInitial;

System.out.println(initials);
```

Output:

```text
LJ
```

This example assumes that both Strings contain at least one character.

## 7. What Happens If the Position Is Invalid?

A String has valid positions from `0` to `length() - 1`.

For example:

```java
String studentName = "Liam";

char letter = studentName.charAt(4);
```

This causes a `StringIndexOutOfBoundsException` because the valid positions are `0`, `1`, `2` and `3`.

An empty String has no valid character positions, so calling `charAt(0)` on it also causes an exception.

Always ensure that the position exists before retrieving a character.

## 8. Common Mistakes

### Mistake 1: Starting at position 1

```java
String studentName = "Liam";

char firstLetter = studentName.charAt(1);
```

This returns `i`, not `L`.

Correct:

```java
char firstLetter = studentName.charAt(0);
```

### Mistake 2: Using the String length as the last position

```java
String studentName = "Liam";

char lastLetter = studentName.charAt(studentName.length());
```

This causes an exception because the final position is one less than the length.

Correct:

```java
char lastLetter = studentName.charAt(studentName.length() - 1);
```

### Mistake 3: Forgetting that spaces have positions

In `"Liam Jacobs"`, the space is at position `4`. The surname starts at position `5`.

## 9. Practice Exercises

1. Declare a String containing your first name and display its first character.
2. Display the last character of a surname using `length() - 1`.
3. Extract the third character from `"Mathematics"`.
4. Determine the character at position `5` in `"Grade 12"`.
5. Explain why `charAt(studentName.length())` is invalid.
6. Extract and display the initials of a Student whose first name and surname are stored in separate variables.

## Summary

- Use `charAt(position)` to retrieve an individual character.
- String positions start at zero.
- The first character is at position `0`.
- The last character is at position `length() - 1`.
- Spaces count as characters.
- An invalid position causes a `StringIndexOutOfBoundsException`.
