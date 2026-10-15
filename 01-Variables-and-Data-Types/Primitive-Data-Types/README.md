# Primitive Data Types in Java

## 1. Overview

In Java, a data type specifies the kind of value that a variable can store. Choosing the correct data type is an important part of writing a program because different types of information require different forms of storage and processing.

Java provides several **primitive data types**. These are built-in types used to represent simple values, such as whole numbers, decimal numbers, individual characters and logical values.

For Grade 10 Information Technology, it is important to understand the purpose of the basic primitive data types and to select an appropriate type for the information a program needs to store.

## 2. Learning Objectives

By the end of this section, you should be able to:

- Explain what a data type is.
- Distinguish between primitive data types and reference types.
- Identify the purpose of `int`, `double`, `float`, `char` and `boolean`.
- Declare variables using appropriate primitive data types.
- Assign suitable values to primitive variables.
- Explain why choosing the correct data type matters.
- Identify common errors involving primitive data types.

## 3. The Main Primitive Data Types

Java has eight primitive data types. The following table introduces all eight, with particular attention to those commonly used in introductory programming.

| Data type | Purpose | Example |
|---|---|---|
| `byte` | Stores small whole numbers. | `byte age = 18;` |
| `short` | Stores whole numbers within a limited range. | `short year = 2026;` |
| `int` | Stores whole numbers. | `int mark = 85;` |
| `long` | Stores large whole numbers. | `long population = 8000000000L;` |
| `float` | Stores decimal numbers using single precision. | `float temperature = 23.5f;` |
| `double` | Stores decimal numbers using double precision. | `double average = 76.85;` |
| `char` | Stores a single UTF-16 code unit. | `char initial = 'J';` |
| `boolean` | Stores either `true` or `false`. | `boolean passed = true;` |

**Important:** Java's primitive data types have different storage sizes and ranges. These will be examined in more detail in the Data Type Ranges section.

For introductory calculations, `int` and `double` are particularly useful. The `char` and `boolean` types are also important when working with characters and conditions.

## 4. Whole Numbers: `int`

The `int` data type is used to store whole numbers without a decimal component.

Examples include:

- A Student's age.
- The number of Students in a class.
- The number of items purchased.
- A mark recorded as a whole number.

### Example

```java
int age = 17;
int numberOfStudents = 25;
int testMark = 82;
```

Each variable stores a whole-number value.

You can use `int` variables in calculations:

```java
int mark1 = 75;
int mark2 = 85;
int total = mark1 + mark2;

System.out.println(total);
```

Output:

```text
160
```

An `int` variable cannot store a fractional value directly.

For example, the following assignment is invalid:

```java
int average = 75.5;
```

The value `75.5` is a decimal value, and Java does not automatically convert it to an `int` in an assignment.

If a calculation can produce a decimal result, consider using `double`.

## 5. Decimal Numbers: `double`

The `double` data type is commonly used when a program needs to store decimal numbers.

Examples include:

- An average mark.
- A measured distance.
- A calculated percentage.
- A product price requiring decimal places.

### Example

```java
double average = 78.5;
double distance = 12.75;
double percentage = 84.25;
```

A `double` can store values with a fractional component.

Consider the following calculation:

```java
double total = 150.0;
double numberOfItems = 4.0;
double average = total / numberOfItems;

System.out.println(average);
```

Output:

```text
37.5
```

**Remember:** `double` is a floating-point type. It can represent a wide range of decimal values, but it does not represent every possible decimal fraction exactly. For ordinary Grade 10 calculations, it is generally the appropriate choice for decimal results.

## 6. Single Characters: `char`

The `char` data type stores a single UTF-16 code unit. It is commonly used for an individual character, such as a letter, digit or symbol.

A character value is written inside **single quotation marks**.

### Example

```java
char initial = 'J';
char grade = 'A';
char symbol = '#';
char digit = '7';
```

Notice the difference between a character and a String:

```java
char initial = 'J';
String name = "Joubert";
```

- `'J'` is a `char`.
- `"Joubert"` is a `String`.

A `char` stores one UTF-16 code unit, whereas a `String` can contain multiple characters.

The `String` type is a reference type, not a primitive data type.

## 7. Logical Values: `boolean`

The `boolean` data type stores one of two possible values:

- `true`
- `false`

It is useful when a program needs to represent a condition or a yes/no decision.

### Example

```java
boolean passed = true;
boolean schoolClosed = false;
boolean isRegistered = true;
```

Boolean variables are especially useful when working with selection statements and logical expressions.

For example:

```java
int mark = 65;
boolean passed = mark >= 50;

System.out.println(passed);
```

Output:

```text
true
```

The expression `mark >= 50` evaluates to either `true` or `false`. The result is stored in the Boolean variable `passed`.

Boolean logic and relational operators are covered in more detail in the Boolean Logic section of this repository.

## 8. Choosing Between `int` and `double`

One of the most important decisions in introductory Java programming is choosing between whole-number and decimal-number types.

| Situation | Suitable type | Reason |
|---|---|---|
| Number of Students | `int` | Students are counted in whole numbers. |
| Student's age in completed years | `int` | The value is a whole number. |
| Average examination mark | `double` | The result may contain decimal places. |
| Distance measured in kilometres | `double` | The measurement may contain a fraction. |
| Number of books borrowed | `int` | Books are counted in whole numbers. |
| Calculated percentage | `double` | The result may contain decimal places. |

The best choice depends on the meaning of the value, not merely on the value currently being stored.

For example, the number of Students in a class should normally be represented by an `int`, even if the class currently contains only a few Students.

## 9. Practical Java Example

The following example demonstrates the use of several primitive data types in one program.

```java
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        String studentName = "Alex";
        int mark1 = 76;
        int mark2 = 83;
        double average = (mark1 + mark2) / 2.0;
        char grade = 'B';
        boolean passed = average >= 50;

        System.out.println("Student: " + studentName);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + passed);
    }
}
```

### Expected Output

```text
Student: Alex
Mark 1: 76
Mark 2: 83
Average: 79.5
Grade: B
Passed: true
```

### Understanding the Example

1. `String studentName` stores the Student's name. A `String` is a reference type.
2. `int mark1` and `int mark2` store whole-number marks.
3. `double average` stores the calculated average.
4. `(mark1 + mark2) / 2.0` uses `2.0` to ensure that the division is performed using floating-point arithmetic.
5. `char grade` stores a single character.
6. `boolean passed` stores the result of a comparison.

This example demonstrates how selecting suitable data types allows a program to store and process different kinds of information.

## 10. Common Mistakes

### Mistake 1: Using the wrong quotation marks

Incorrect:

```java
char grade = "A";
```

Correct:

```java
char grade = 'A';
```

A `char` literal uses single quotation marks. Double quotation marks are used for String literals.

### Mistake 2: Assigning a decimal value to an `int`

Incorrect:

```java
int average = 72.5;
```

Correct:

```java
double average = 72.5;
```

The data type must be suitable for the value being stored.

### Mistake 3: Assuming that `boolean` stores numbers

Incorrect:

```java
boolean passed = 1;
```

Correct:

```java
boolean passed = true;
```

Java Boolean variables store `true` or `false`, not `1` or `0`.

### Mistake 4: Confusing `char` and `String`

```java
char letter = 'A';
String word = "Apple";
```

These variables use different types because they store different kinds of values.

### Mistake 5: Forgetting that integer division can discard the fractional part

```java
int result = 5 / 2;
System.out.println(result);
```

Output:

```text
2
```

Both
