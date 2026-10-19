# Character and Integer Conversion

## Learning Objectives

By the end of this section, you should be able to:

- Explain how Java represents characters using numeric character codes.
- Convert a `char` into an `int`.
- Convert an `int` into a `char`.
- Understand the difference between a character and its numeric code.
- Use character codes in simple calculations.

## 1. Characters and Numeric Codes

A Java `char` represents a UTF-16 code unit. Each `char` has a numeric value associated with it.

For example, the uppercase letter `A` has the numeric value `65`, while `B` has the value `66`.

Java uses Unicode character encoding, so character codes are not limited to the English alphabet.

Consider the following code:

```java
char letter = 'A';
int characterCode = letter;

System.out.println(characterCode);
```

Output:

```text
65
```

The character is stored in a `char` variable. When it is assigned to an `int`, Java converts it to its numeric character code.

## 2. Converting a char to an int

A `char` can be assigned directly to an `int` because Java permits this conversion.

```java
char classLetter = 'B';
int classCode = classLetter;

System.out.println(classCode);
```

Output:

```text
66
```

The variable `classCode` stores the numeric code for `B`, not the printed letter itself.

This is an example of a **widening primitive conversion** because the `char` value can be represented by an `int` without losing its numeric code.

## 3. Converting an int to a char

You can convert an integer into a character by using an explicit cast.

```java
int characterCode = 67;
char letter = (char) characterCode;

System.out.println(letter);
```

Output:

```text
C
```

The expression `(char) characterCode` tells Java to convert the integer value into a `char`.

This is a narrowing conversion because an `int` can represent a much wider range of numeric values than a `char`.

Only the value's corresponding UTF-16 code unit is retained. If the integer is outside the range of a `char`, information can be lost.

## 4. Using Character Codes

Character codes can be used in calculations.

For example:

```java
char firstLetter = 'A';
int firstCode = firstLetter;

int nextCode = firstCode + 1;
char nextLetter = (char) nextCode;

System.out.println(nextLetter);
```

Output:

```text
B
```

The calculation adds 1 to the numeric code for `A`. Casting the result back to `char` produces `B`.

This works for consecutive characters whose codes follow one another. It should not be assumed that every letter in every alphabet has a consecutive code sequence.

## 5. Important Difference: Character Code vs Numeric Digit

A character representing a digit is not the same as the integer it appears to represent.

```java
char digit = '7';
int characterCode = digit;

System.out.println(characterCode);
```

Output:

```text
55
```

The result is `55`, which is the Unicode code point value for the character `'7'`.

It is not the numeric value 7.

If you want to obtain the numeric digit from a character known to contain an ASCII digit from `'0'` to `'9'`, you can subtract `'0'`:

```java
char digit = '7';
int numericValue = digit - '0';

System.out.println(numericValue);
```

Output:

```text
7
```

This technique works for characters between `'0'` and `'9'`.

For a more general Unicode digit, use `Character.digit()` and check whether the result is valid.

## 6. Common Mistakes

### Mistake 1: Expecting a char to print its numeric code

```java
char letter = 'A';
System.out.println(letter);
```

Output:

```text
A
```

To display its numeric code, assign it to an `int` first:

```java
int characterCode = letter;
System.out.println(characterCode);
```

Output:

```text
65
```

### Mistake 2: Forgetting the cast

```java
int characterCode = 66;
char letter = characterCode;
```

This causes a compilation error because Java does not automatically assign an `int` to a `char`.

Correct:

```java
char letter = (char) characterCode;
```

### Mistake 3: Confusing the digit character with the number

```java
char digit = '7';
int value = digit;
```

The value is `55`, not `7`.

To convert a character from `'0'` to `'9'` into its numeric digit, use:

```java
int value = digit - '0';
```

## 7. Practice Exercises

1. Declare a `char` containing the letter `A` and assign it to an `int`. Display the result.
2. Convert the integer `68` into a `char` using an explicit cast.
3. Convert the character `'5'` into its numeric digit value.
4. Explain why assigning `'7'` to an `int` produces a different value from assigning the integer `7`.
5. Write code that obtains the numeric code of `'C'`, adds 1, and converts the result back to a character.

## Summary

- A Java `char` represents a UTF-16 code unit.
- Assigning a `char` to an `int` obtains its numeric code.
- Converting an `int` to a `char` requires an explicit cast.
- A character digit, such as `'7'`, has a character code that differs from the numeric value `7`.
- For ASCII digit characters `'0'` to `'9'`, subtracting `'0'` obtains the corresponding numeric digit.
