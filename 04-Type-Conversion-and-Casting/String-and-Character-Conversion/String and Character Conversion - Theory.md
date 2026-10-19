# String and Character Conversion

## Learning Objectives

By the end of this section, you should be able to:

- Explain the difference between a `String` and a `char`.
- Extract a single character from a String using `charAt()`.
- Convert a `char` into a String.
- Extract the first character of a Student's name.
- Understand how character positions are counted in Java.

## 1. Understanding String and char

Java uses two different data types to represent text.

### String

A `String` stores a sequence of characters.

```java
String studentName = "Olivia";
```

The variable contains six characters: `O`, `l`, `i`, `v`, `i` and `a`.

### char

A `char` stores a single UTF-16 code unit, which represents one character in many common cases.

```java
char initial = 'O';
```

Notice the quotation marks:

- A String uses double quotation marks: `"Olivia"`.
- A char uses single quotation marks: `'O'`.

A `char` is not the same data type as a String, even when both represent the letter O.

## 2. Extracting a Character from a String

Use the `charAt()` method to retrieve a character at a particular position in a String.

```java
String studentName = "Olivia";

char firstLetter = studentName.charAt(0);

System.out.println(firstLetter);
```

Output:

```text
O
```

Java starts counting String positions at **0**, not 1.

For the String `"Olivia"`, the positions are:

| Character | Position |
|---|---:|
| O | 0 |
| l | 1 |
| i | 2 |
| v | 3 |
| i | 4 |
| a | 5 |

Therefore:

```java
char firstLetter = studentName.charAt(0);
char thirdLetter = studentName.charAt(2);
```

The first statement retrieves `O`, and the second retrieves `i`.

**Important:** Attempting to access a position that does not exist causes a `StringIndexOutOfBoundsException`.

## 3. Extracting a Student's Initial

The `charAt()` method is useful when a program needs a Student's initial.

```java
String studentName = "Liam";

char initial = studentName.charAt(0);

System.out.println("Initial: " + initial);
```

Output:

```text
Initial: L
```

The result is a `char`, not a String.

## 4. Converting a char to a String

You can convert a character into a String using `String.valueOf()`.

```java
char initial = 'L';

String initialText = String.valueOf(initial);

System.out.println(initialText);
```

Output:

```text
L
```

Although both values display the letter L, their data types differ:

- `initial` is a `char`.
- `initialText` is a `String`.

You can also convert a character into a String by joining it with an empty String:

```java
char initial = 'L';

String initialText = "" + initial;
```

Using `String.valueOf()` makes the conversion more explicit.

## 5. Working with Student Names

Consider a Student's full name.

```java
String studentName = "Liam Jacobs";

char firstInitial = studentName.charAt(0);
char surnameInitial = studentName.charAt(5);
```

The first character is `L`, and the character at position 5 is `J`, because the space between the names also occupies a position.

You can combine the initials into a String:

```java
String initials = String.valueOf(firstInitial)
        + String.valueOf(surnameInitial);

System.out.println(initials);
```

Output:

```text
LJ
```

This example assumes that the name has the expected format and is long enough to contain both initials.

## 6. Common Mistakes

### Mistake 1: Using double quotation marks for a char

```java
char initial = "L";
```

This causes a compilation error because `"L"` is a String.

Correct:

```java
char initial = 'L';
```

### Mistake 2: Forgetting that positions start at zero

```java
String studentName = "Liam";
char firstLetter = studentName.charAt(1);
```

This returns `i`, not `L`.

To retrieve the first character, use `charAt(0)`.

### Mistake 3: Treating char and String as interchangeable

```java
char initial = 'L';
String initialText = String.valueOf(initial);
```

These variables have different data types. Use the type required by the operation or method.

## 7. Practice Exercises

1. Declare a String containing a Student's first name.
2. Extract the first character of the name using `charAt()`.
3. Convert that character into a String using `String.valueOf()`.
4. Extract the first and surname initials from a full name, assuming there is one space between the names.
5. Explain why `charAt(0)` retrieves the first character.
6. State the difference between `'A'` and `"A"`.

## Summary

- A `String` stores a sequence of characters.
- A `char` stores one UTF-16 code unit.
- Use `charAt(position)` to retrieve a character from a String.
- String positions begin at zero.
- Use `String.valueOf(character)` to convert a char into a String.
- Single quotation marks represent char literals; double quotation marks represent String literals.
