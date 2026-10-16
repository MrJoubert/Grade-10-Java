# String and Character Programs

## Overview

Java programs often need to process text, examine individual characters and display information in a readable format. A program might ask for a Student's name, count the number of characters in a word, convert text to uppercase or determine whether a character is a digit.

Java provides the `String` class for working with text and the primitive `char` data type for storing a single character.

In this topic, you will combine String manipulation, character handling, variables, selection, input and output to solve practical programming problems.

## Learning Objectives

By the end of this topic, you should be able to:

- Distinguish between `String` and `char`.
- Accept text input using `JOptionPane`.
- Determine the length of a String.
- Join text using concatenation.
- Convert text to uppercase and lowercase.
- Compare Strings correctly.
- Extract and examine individual characters.
- Convert between characters and numeric values where appropriate.
- Use selection statements to process text and characters.
- Test programs using different text inputs.

---

## 1. Understanding String and char

Java uses different data types for text and individual characters.

A `String` stores a sequence of characters.

```java
String name = "Alex";
```

A `char` stores a single character and uses single quotation marks.

```java
char initial = 'A';
```

Compare the two examples:

| Declaration | Meaning |
|---|---|
| `String name = "Alex";` | Stores a word |
| `String letter = "A";` | Stores a one-character String |
| `char letter = 'A';` | Stores one character |

Although a String can contain only one character, `String` and `char` are different data types.

## 2. Accepting Text Input

The `JOptionPane.showInputDialog()` method can be used to obtain text from a user.

```java
import javax.swing.JOptionPane;

public class NameInput {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(
                "Enter your name:");

        JOptionPane.showMessageDialog(
                null, "Welcome, " + name + "!");
    }
}
```

If the user enters `Alex`, the message displayed is:

```text
Welcome, Alex!
```

The input is returned as a `String`, so no numeric conversion is necessary when the program only needs to process text.

This example assumes that the user supplies a name rather than cancelling the dialog.

## 3. Determining the Length of a String

The `length()` method returns the number of characters in a String.

```java
String word = "Computer";

int length = word.length();

System.out.println("Word: " + word);
System.out.println("Length: " + length);
```

**Output:**

```text
Word: Computer
Length: 8
```

Notice that `length()` is a method, so it requires parentheses.

The length of a String includes spaces and punctuation.

```java
String message = "Hello Java";

System.out.println(message.length());
```

**Output:**

```text
10
```

There are five characters in `Hello`, one space and four characters in `Java`.

## 4. Joining Text Using Concatenation

Concatenation means joining Strings together.

Java uses the `+` operator to concatenate text.

```java
String firstName = "Alex";
String surname = "Smith";

String fullName = firstName + " " + surname;

System.out.println(fullName);
```

**Output:**

```text
Alex Smith
```

The space between the quotation marks ensures that the names are separated.

### Combining text and numbers

The `+` operator can also combine text and numeric values.

```java
String subject = "Information Technology";
int mark = 85;

System.out.println("Subject: " + subject);
System.out.println("Mark: " + mark + "%");
```

**Output:**

```text
Subject: Information Technology
Mark: 85%
```

Be careful when combining arithmetic and String concatenation. Brackets can make calculations explicit.

```java
int firstNumber = 10;
int secondNumber = 5;

System.out.println("Total: " + (firstNumber + secondNumber));
```

**Output:**

```text
Total: 15
```

Without the brackets, `"Total: " + firstNumber + secondNumber` would produce `Total: 105`, because the values would be concatenated from left to right.

## 5. Converting Text to Uppercase and Lowercase

Java provides methods to change the case of a String.

- `toUpperCase()` converts letters to uppercase.
- `toLowerCase()` converts letters to lowercase.

```java
String name = "Alex Smith";

System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());
```

**Output:**

```text
ALEX SMITH
alex smith
```

These methods return new Strings. They do not modify the original String.

```java
String word = "Java";

String upperWord = word.toUpperCase();

System.out.println(word);
System.out.println(upperWord);
```

**Output:**

```text
Java
JAVA
```

The original variable still contains `"Java"`.

## 6. Comparing Strings

Strings should generally be compared using methods such as `equals()` rather than the `==` operator.

The `equals()` method checks whether two Strings contain the same sequence of characters.

```java
String password = "Java123";
String enteredPassword = "Java123";

if (password.equals(enteredPassword)) {
    System.out.println("The Strings match.");
} else {
    System.out.println("The Strings do not match.");
}
```

**Output:**

```text
The Strings match.
```

String comparison using `equals()` is case-sensitive.

```java
String firstWord = "Java";
String secondWord = "JAVA";

System.out.println(firstWord.equals(secondWord));
```

**Output:**

```text
false
```

The Strings differ in letter case.

### Case-insensitive comparison

If the comparison should ignore letter case, use `equalsIgnoreCase()`.

```java
String firstWord = "Java";
String secondWord = "JAVA";

System.out.println(firstWord.equalsIgnoreCase(secondWord));
```

**Output:**

```text
true
```

### Why not use `==`?

For objects such as Strings, `==` checks whether two references refer to the same object, not whether the Strings contain the same text.

For comparing String content, use `equals()` or `equalsIgnoreCase()` as appropriate.

## 7. Examining Individual Characters

The `charAt()` method returns the character at a specified index in a String.

Java uses zero-based indexing, which means the first character is at index `0`.

Consider the String `"JAVA"`:

| Character | J | A | V | A |
|---|---:|---:|---:|---:|
| Index | 0 | 1 | 2 | 3 |

Example:

```java
String word = "JAVA";

System.out.println(word.charAt(0));
System.out.println(word.charAt(2));
```

**Output:**

```text
J
V
```

An index must be within the valid range. For a non-empty String, the first valid index is `0`, and the last valid index is `word.length() - 1`.

Attempting to access an invalid index causes a `StringIndexOutOfBoundsException`.

## 8. Using Characters in Conditions

Java provides methods through the `Character` class to examine characters.

For example:

- `Character.isDigit(ch)` checks whether a character is a digit.
- `Character.isLetter(ch)` checks whether a character is a letter.
- `Character.isUpperCase(ch)` checks whether a character is uppercase.
- `Character.isLowerCase(ch)` checks whether a character is lowercase.

Example:

```java
char character = '7';

if (Character.isDigit(character)) {
    System.out.println("The character is a digit.");
} else {
    System.out.println("The character is not a digit.");
}
```

**Output:**

```text
The character is a digit.
```

These methods are useful when a program needs to classify or validate individual characters.

## 9. Integrated Example: Analysing a Word

The following program asks the user to enter a word and displays information about it.

```java
import javax.swing.JOptionPane;

public class WordAnalysis {
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog(
                "Enter a word:");

        if (word == null) {
            JOptionPane.showMessageDialog(
                    null, "Input cancelled.");
        } else if (word.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null, "Please enter a word.");
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Original: " + word
                    + "\nUppercase: " + word.toUpperCase()
                    + "\nLowercase: " + word.toLowerCase()
                    + "\nLength: " + word.length());
        }
    }
}
```

If the user enters `Java`, the displayed information includes:

```text
Original: Java
Uppercase: JAVA
Lowercase: java
Length: 4
```

### How the program works

1. The program obtains a String from the user.
2. It checks whether the dialog was cancelled.
3. It checks whether the String is empty.
4. If the input is acceptable, the program displays the original text, its uppercase form, its lowercase form and its length.

The `isEmpty()` method checks whether a String has zero characters. It does not reject a String containing only spaces.

## 10. Integrated Example: Checking a Character

The following program asks the user to enter a character and checks whether it is a letter, a digit or another type of character.

```java
import javax.swing.JOptionPane;

public class CharacterCheck {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(
                "Enter one character:");

        if (input == null) {
            JOptionPane.showMessageDialog(
                    null, "Input cancelled.");
        } else if (input.length() != 1) {
            JOptionPane.showMessageDialog(
                    null, "Please enter exactly one character.");
        } else {
            char character = input.charAt(0);

            if (Character.isLetter(character)) {
                JOptionPane.showMessageDialog(
                        null, "The character is a letter.");
            } else if (Character.isDigit(character)) {
                JOptionPane.showMessageDialog(
                        null, "The character is a digit.");
            } else {
                JOptionPane.showMessageDialog(
                        null, "The character is neither a letter nor a digit.");
            }
        }
    }
}
```

### Suggested tests

| Input | Expected result |
|---|---|
| `A` | Letter |
| `z` | Letter |
| `7` | Digit |
| `@` | Neither a letter nor a digit |
| `AB` | Rejected because two characters were entered |
| Empty input | Rejected because the input length is not one |
| Cancel | Cancellation message |

## 11. Common Mistakes

### Mistake 1: Using single quotation marks for a String

Incorrect:

```java
String name = 'Alex';
```

Correct:

```java
String name = "Alex";
```

Use double quotation marks for Strings and single quotation marks for character literals.

### Mistake 2: Using `length` instead of `length()`

Incorrect:

```java
int size = word.length;
```

Correct:

```java
int size = word.length();
```

For a String, `length()` is a method.

### Mistake 3: Comparing String content using `==`

Incorrect for content comparison:

```java
if (word == "Java") {
    System.out.println("Match");
}
```

Preferred:

```java
if (word.equals("Java")) {
    System.out.println("Match");
}
```

### Mistake 4: Using an invalid character index

Incorrect:

```java
String word = "Java";

System.out.println(word.charAt(4));
```

The valid indices are `0` to `3`.

### Mistake 5: Assuming case does not matter

`"Java".equals("JAVA")` returns `false`.

Use `equalsIgnoreCase()` if the comparison should ignore case.

## 12. Testing String and Character Programs

Test your programs with a range of inputs.

For a program that examines a word, consider:

| Test input | What to test |
|---|---|
| `Java` | Ordinary text |
| `JAVA` | Uppercase conversion |
| `java` | Lowercase conversion |
| `A B` | Spaces within text |
| Empty input | Empty String handling |
| `123` | Numeric characters stored as text |
| `Hello!` | Punctuation |
| Cancel | Cancellation handling |

For character programs, test letters, digits, punctuation, spaces and inputs containing more than one character.

Compare the actual behaviour with the expected behaviour. If the results differ, investigate the conditions and methods used.

## 13. Practical Challenges

### Challenge 1: Name formatting

Write a program that asks the user to enter their first name and surname.

Display:

- The full name.
- The full name in uppercase.
- The full name in lowercase.
- The number of characters in the full name, including the space.

### Challenge 2: Word comparison

Write a program that asks the user to enter two words.

Display whether the words are identical, ignoring differences in uppercase and lowercase.

Use `equalsIgnoreCase()`.

### Challenge 3: First and last characters

Write a program that asks the user to enter a word.

If the input is not empty, display the first and last characters.

Hint: The last character is at index `word.length() - 1`.

### Challenge 4: Character classification

Write a program that asks the user to enter a single character.

Classify the character as:

- A letter.
- A digit.
- Another character.

Reject input containing more than one character.

### Challenge 5: Debug the following program

The program is intended to compare two Strings.

```java
String firstWord = "Java";
String secondWord = "JAVA";

if (firstWord.equals(secondWord)) {
    System.out.println("The words match.");
} else {
    System.out.println("The words do not match.");
}
```

Tasks:

1. Predict the output.
2. Explain why the Strings do not match.
3. Modify the program so that the comparison ignores case.
4. Test the program with two genuinely different words.

## 14. Key Takeaways

- `String` stores a sequence of characters, while `char` stores one character.
- `length()` returns the number of characters in a String.
- `+` can concatenate Strings and other values.
- `toUpperCase()` and `toLowerCase()` return Strings in different letter cases.
- `equals()` compares String content and is case-sensitive.
- `equalsIgnoreCase()` compares String content without considering letter case.
- `charAt()` accesses a character using a zero-based index.
- The `Character` class provides useful methods for classifying characters.
- Input validation helps prevent errors when processing text.
- Testing should include empty input, spaces, punctuation, different letter cases and unexpected input lengths.

## Navigation

- [Previous: Selection and Loop Programs](../Selection-and-Loop-Programs/README.md)
- [Next: Methods and Modular Programs](../Methods-and-Modular-Programs/README.md)
- [Back to Integrated Examples and Practice](../README.md)
- [Back to Grade 10 Java](../../README.md)
