# Type Conversion and Casting

## Overview

Java programs frequently need to convert information from one data type to another. A program may receive a number as text, calculate an average that requires a decimal result, or convert a numeric value into a different representation.

**Type conversion** is the process of changing a value from one data type to another. Some conversions can happen automatically, while others require an explicit instruction from the programmer.

**Casting** is a technique used to explicitly convert a value to a specified type, particularly when Java does not automatically perform the required conversion.

Understanding these concepts is essential when working with user input, arithmetic expressions, characters and variables of different data types.

This topic develops the knowledge required to convert values correctly, understand the effects of conversion and avoid errors that can produce unexpected results.

The content is intended for **Grade 10 Information Technology Students studying Java according to the IEB curriculum**.

---

## Learning Objectives

By completing this topic, you should be able to:

- Explain why type conversion is necessary in Java.
- Convert numeric Strings into appropriate numeric data types.
- Convert numeric values into Strings where required.
- Understand the relationship between Strings and individual characters.
- Convert between characters and integer values.
- Distinguish between widening and narrowing conversions.
- Explain the difference between automatic conversion and explicit casting.
- Cast real-number values to integer values.
- Predict the results of type conversions.
- Identify common errors involving incompatible types and loss of information.

---

## Curriculum Alignment

This topic supports Grade 10 programming concepts associated with simple data types and conversions between String, numeric, character and integer values, including widening and narrowing conversions and casting between real and integer values.

These skills reinforce the correct use of variables, input, calculations and data types in Java programs.

**Curriculum note:** This repository is a supplementary learning resource. Students should use these notes alongside prescribed course material, practical activities and official IEB assessment guidance.

---

## Topic Structure

Work through the following six subtopics in order.

| Subtopic | What You Will Learn |
|---|---|
| [String to Numeric Conversion](String-to-Numeric-Conversion/README.md) | Convert valid numeric text into `int` and `double` values. |
| [Numeric to String Conversion](Numeric-to-String-Conversion/README.md) | Convert numeric values into text for display or further String processing. |
| [String and Character Conversion](String-and-Character-Conversion/README.md) | Understand how Strings and individual characters differ and how to obtain a character from a String. |
| [Character and Integer Conversion](Character-and-Integer-Conversion/README.md) | Understand character values, character codes and conversions involving `char` and `int`. |
| [Widening and Narrowing Conversions](Widening-and-Narrowing-Conversions/README.md) | Compare conversions to wider and narrower numeric types and understand potential information loss. |
| [Casting Real and Integer Values](Casting-Real-and-Integer-Values/README.md) | Use explicit casts to convert between floating-point and integer values. |

---

## 1. Why Type Conversion Is Necessary

Java uses different data types to represent different kinds of information. However, a program may need to use a value in a different form from the one in which it was originally obtained.

Consider the following example:

```java
String input = "25";
```

The value `"25"` is text. It is not automatically an integer just because it contains digits.

If the program needs to perform arithmetic, the String must be converted:

```java
int number = Integer.parseInt(input);

System.out.println(number + 5);
```

Output:

```text
30
```

Without conversion, adding `5` to the String would perform String concatenation instead of numerical addition.

Type conversion therefore helps ensure that values are represented appropriately for the operations a program needs to perform.

---

## 2. Automatic Conversion and Explicit Casting

Java can automatically convert certain values when the conversion is permitted by its type rules.

For example:

```java
int wholeNumber = 10;
double decimalNumber = wholeNumber;

System.out.println(decimalNumber);
```

Output:

```text
10.0
```

The integer value can be represented as a `double`, so Java performs the conversion automatically.

Other conversions require an explicit cast:

```java
double decimalNumber = 9.8;
int wholeNumber = (int) decimalNumber;

System.out.println(wholeNumber);
```

Output:

```text
9
```

The cast `(int)` instructs Java to convert the floating-point value into an integer. For this positive value, the fractional component is discarded.

Casting does not guarantee that the original value can be represented exactly in the destination type. Some conversions lose information.

---

## 3. Converting Strings and Numeric Values

A common example of type conversion occurs when a program accepts input through `JOptionPane`.

The following statement returns a String:

```java
String input = JOptionPane.showInputDialog(
    "Enter your age:"
);
```

If the program needs to store the age as an integer, it can use `Integer.parseInt()`:

```java
int age = Integer.parseInt(input);
```

For decimal values, use `Double.parseDouble()`:

```java
double price = Double.parseDouble(input);
```

These methods expect valid numeric text. Invalid input may cause a `NumberFormatException`.

The conversion process should therefore be understood as two distinct steps:

1. Obtain the input as text.
2. Convert the text into the required data type.

---

## 4. Understanding Characters and Their Numeric Values

Java provides the `char` type for a single UTF-16 code unit.

For example:

```java
char letter = 'A';
```

Characters also have numeric code values. Java's `char` type is an unsigned 16-bit type, so converting a `char` to an `int` can produce its numeric code-unit value.

```java
char letter = 'A';
int code = letter;

System.out.println(code);
```

Output:

```text
65
```

For the basic Latin character `'A'`, the value is `65`.

This is different from converting the text `"65"` into the integer `65`. One operation obtains a character's numeric code-unit value; the other parses a numeric String.

It is important to distinguish these two processes when working with characters and numeric values.

---

## 5. Widening and Narrowing Conversions

Numeric types differ in their ranges and precision.

A **widening conversion** converts a value to a type that can generally accommodate a broader range or representation. For example, an `int` can be converted to a `double`.

```java
int number = 25;
double result = number;

System.out.println(result);
```

Output:

```text
25.0
```

A **narrowing conversion** converts a value to a type with more restrictive representation or range. Such conversions may require an explicit cast and can lose information.

```java
double number = 25.75;
int result = (int) number;

System.out.println(result);
```

Output:

```text
25
```

The fractional component is discarded.

Not every widening conversion preserves every possible value exactly. For example, very large integers may lose precision when converted to floating-point types.

Always consider the source type, destination type and value being converted.

---

## 6. Common Conversion Errors

### Error 1: Treating a String as a number

```java
String number = "12";
System.out.println(number + 3);
```

Output:

```text
123
```

The `+` operator concatenates the text.

To perform arithmetic:

```java
int number = Integer.parseInt("12");
System.out.println(number + 3);
```

Output:

```text
15
```

### Error 2: Converting invalid numeric text

```java
int number = Integer.parseInt("hello");
```

This causes a `NumberFormatException` because `"hello"` is not a valid integer representation.

### Error 3: Assuming casting rounds a number

```java
int result = (int) 8.9;
```

The result is `8`, not `9`. Casting a floating-point value to an integer discards the fractional component, moving the value towards zero.

### Error 4: Losing information during narrowing

```java
int number = (int) 130.7;
```

The result is `130`. The fractional component is lost.

Conversions to smaller integral types can also change the represented value when the original value is outside the destination type's range.

### Error 5: Confusing a character's code with numeric text

```java
char digit = '7';
int code = digit;
```

The value stored in `code` is the character's code-unit value, not the integer `7`.

If the intention is to interpret a single decimal digit as its numeric value, a different operation is required.

---

## 7. Recommended Study Approach

For each subtopic:

1. Identify the original data type.
2. Identify the required destination data type.
3. Determine whether Java performs the conversion automatically or whether an explicit operation is needed.
4. Predict the result before running the code.
5. Check whether any information is lost.
6. Test ordinary values and boundary cases.
7. Explain why the conversion produces its result.

Pay particular attention to the difference between parsing a String, converting a character's code-unit value and casting a numeric value.

These operations may look similar but serve different purposes.

---

## 8. Practical Challenge

Create a Java program called `TypeConversionPractice` that demonstrates several conversions.

Your program should:

1. Convert the String `"42"` into an integer.
2. Convert the String `"18.75"` into a `double`.
3. Convert an integer into a `double`.
4. Cast a positive decimal value to an integer.
5. Store the character `'A'` in a `char` variable and obtain its numeric code-unit value.
6. Display the original values and the converted results.

Use meaningful variable names and descriptive output messages.

**Extension:** Explain why converting the String `"7"` into an integer is different from converting the character `'7'` into an integer.

---

## 9. Key Takeaways

By the end of this topic, you should understand that:

- Type conversion changes how a value is represented or used.
- Numeric Strings must be parsed before they can be used as numeric values.
- Automatic conversions are permitted only when Java's type rules allow them.
- Explicit casting can convert values that Java does not automatically convert.
- Widening and narrowing conversions have different implications for range and precision.
- Casting a floating-point value to an integer discards its fractional component.
- Converting a character to an integer can produce its numeric code-unit value.
- Some conversions can lose information or produce exceptions.

A strong understanding of type conversion is essential for writing reliable Java programs, particularly when processing user input and performing calculations.

---

## Navigation

[**← Previous: Input and Output**](../03-Input-and-Output/README.md)

[**Next: String Manipulation →**](../05-String-Manipulation/README.md)

[Return to the Grade 10 Java repository](../README.md)
