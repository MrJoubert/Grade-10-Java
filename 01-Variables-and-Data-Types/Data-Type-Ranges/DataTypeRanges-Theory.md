# Data Type Ranges

## Learning objectives

By the end of this lesson, you should be able to:

- Explain what a data type's range is.
- Identify the minimum and maximum values of Java's integer types.
- Distinguish between integer and floating-point data types.
- Use Java's built-in constants to display data type limits.
- Explain why choosing an appropriate data type matters.

## 1. What is a data type range?

A **data type range** is the set of values that a particular data type can represent.

Different numeric data types have different limits. Some can store only relatively small whole numbers, while others can represent much larger numbers or decimal values.

For example, a `byte` can store values from `-128` to `127`, whereas an `int` can store much larger whole numbers.

Choosing an appropriate data type helps ensure that a variable can represent the values your program needs.

## 2. Integer data types

Java provides four primitive integer types: `byte`, `short`, `int` and `long`.

These types store whole numbers, including negative numbers and zero.

| Data type | Minimum value | Maximum value |
|---|---:|---:|
| `byte` | -128 | 127 |
| `short` | -32,768 | 32,767 |
| `int` | -2,147,483,648 | 2,147,483,647 |
| `long` | -9,223,372,036,854,775,808 | 9,223,372,036,854,775,807 |

The larger integer types can represent a wider range of values, but they also use more memory.

### 2.1 `byte`

A `byte` stores an 8-bit signed integer.

Its range is:

- Minimum: `-128`
- Maximum: `127`

For example:

```java
byte numberOfPeriods = 8;
```

The value fits within the permitted range.

However, a value such as `150` cannot be assigned directly to a `byte` because it exceeds the maximum value.

### 2.2 `short`

A `short` stores a 16-bit signed integer.

Its range is:

- Minimum: `-32,768`
- Maximum: `32,767`

A `short` can represent a wider range of whole numbers than a `byte`, but its range is still limited compared with an `int`.

### 2.3 `int`

An `int` stores a 32-bit signed integer.

Its range is:

- Minimum: `-2,147,483,648`
- Maximum: `2,147,483,647`

The `int` data type is commonly used for whole-number values in Java, including ages, grades and counts.

For example:

```java
int studentAge = 16;
int numberOfStudents = 25;
```

### 2.4 `long`

A `long` stores a 64-bit signed integer.

It can represent much larger whole numbers than an `int`.

For example:

```java
long largeNumber = 5000000000L;
```

Notice the `L` at the end of the number. It identifies the literal as a `long`.

The uppercase `L` is recommended because lowercase `l` can look like the digit `1`.

## 3. Floating-point data types

Java has two primitive floating-point types: `float` and `double`.

These types represent numbers that can include fractional parts.

| Data type | Approximate decimal precision | Approximate maximum magnitude |
|---|---|---:|
| `float` | 6–7 significant decimal digits | \(3.4 \times 10^{38}\) |
| `double` | 15–16 significant decimal digits | \(1.8 \times 10^{308}\) |

The values above describe approximate precision and magnitude. Floating-point types also have special values, such as positive and negative infinity, that are not ordinary finite numbers.

### 3.1 `float`

A `float` stores a 32-bit floating-point value.

For example:

```java
float averageMark = 78.5F;
```

The `F` identifies the literal as a `float`.

Without the suffix, a decimal literal such as `78.5` is treated as a `double` by default.

### 3.2 `double`

A `double` stores a 64-bit floating-point value.

For example:

```java
double averageMark = 78.5;
```

A `double` generally provides greater precision and a wider range than a `float`.

It is commonly used for calculations that require decimal values, such as averages.

**Important:** Floating-point values cannot represent every decimal number exactly. Small rounding differences can occur during calculations.

## 4. How can Java show the limits of a data type?

Java provides built-in constants that contain the minimum and maximum values of its numeric types.

For example:

```java
System.out.println(Byte.MIN_VALUE);
System.out.println(Byte.MAX_VALUE);
```

This displays the minimum and maximum values for a `byte`.

Other examples include:

```java
Short.MIN_VALUE
Short.MAX_VALUE

Integer.MIN_VALUE
Integer.MAX_VALUE

Long.MIN_VALUE
Long.MAX_VALUE
```

For floating-point types, use:

```java
Float.MIN_VALUE
Float.MAX_VALUE

Double.MIN_VALUE
Double.MAX_VALUE
```

**Important distinction:** For `float` and `double`, `MIN_VALUE` is the smallest positive value greater than zero, not the most negative value.

To obtain the most negative finite value, use `-Float.MAX_VALUE` or `-Double.MAX_VALUE`.

## 5. What happens when a value exceeds a type's range?

A value that is outside a type's range cannot always be assigned directly to that type.

For example:

```java
byte number = 150;
```

This causes a compilation error because `150` is outside the permitted range of a `byte`.

An overflowing integer calculation can behave differently. If a calculation produces a value beyond the range of an integer type, the result may wrap around rather than causing a compilation error.

For example, incrementing a `byte` that already contains `127` can produce `-128` when the value wraps around.

This is one reason it is important to choose an appropriate data type and understand its limits.

## 6. Following the Java program

Open `DataTypeRanges.java` in NetBeans.

### Step 1: Examine the integer types

The program displays the minimum and maximum values for `byte`, `short`, `int` and `long`.

Compare their ranges to see how the permitted values increase.

### Step 2: Examine the floating-point types

The program displays the values provided by `Float` and `Double`.

Pay attention to the difference between `MIN_VALUE` and the most negative finite value.

### Step 3: Run the program

Compare the output with the range table in these notes.

The exact formatting of very large or very small floating-point values may use scientific notation.

### Step 4: Consider practical uses

Think about the kinds of values a school program might need to store.

A Student's age would not normally require a `long`. An average mark could require a `double` if decimal places are needed.

Choose a type based on the values the program must represent, rather than automatically choosing the largest available type.

## 7. Common mistakes

### Mistake 1: Assigning a value outside a type's range

Incorrect:

```java
byte number = 150;
```

The value `150` exceeds the maximum value of a `byte`.

### Mistake 2: Forgetting the `long` suffix

A large integer literal may need an `L` suffix to be represented as a `long`.

```java
long largeNumber = 5000000000L;
```

### Mistake 3: Forgetting the `float` suffix

Incorrect:

```java
float averageMark = 78.5;
```

Correct:

```java
float averageMark = 78.5F;
```

A decimal literal is treated as a `double` by default.

### Mistake 4: Misunderstanding `MIN_VALUE`

For `Integer`, `MIN_VALUE` is the most negative permitted integer.

For `Float` and `Double`, `MIN_VALUE` is the smallest positive value greater than zero.

### Mistake 5: Assuming a larger type is always necessary

A larger data type can represent more values, but it is not automatically the best choice.

Use a type that suits the information and calculations in your program.

## 8. Practice activities

### Activity 1: Compare the ranges

Use the table in this lesson to answer:

1. Which integer type has the smallest range?
2. Which integer type has the largest range?
3. What is the maximum value of a `short`?
4. Why can a `long` store values that an `int` cannot?

### Activity 2: Identify suitable types

Choose an appropriate type for each value:

1. A Student's age in completed years.
2. A Student's average mark of `86.75`.
3. A whole-number count of Students.
4. A very large whole number of `5000000000`.
5. A decimal measurement that needs more precision than a `float` generally provides.

Explain each choice.

### Activity 3: Explore the built-in constants

Modify `DataTypeRanges.java` to display the minimum and maximum values for `short` and `long` separately.

Run the program and compare the results.

### Activity 4: Investigate an out-of-range value

Try assigning `150` to a `byte` variable.

Observe the compilation error. Explain why the assignment is not permitted.

### Activity 5: Investigate integer overflow

Create a separate variable:

```java
byte number = 127;
```

Then add the statement:

```java
number++;
```

Display `number`.

Observe the result and explain what happened. Do not confuse this behaviour with assigning the literal `150` directly to a `byte`.

## Summary

Every numeric data type has limits on the values it can represent. Integer types store whole numbers, while `float` and `double` represent floating-point numbers.

Java provides built-in constants for exploring these limits. Understanding the ranges helps you select suitable data types and avoid errors or unexpected results.

**Next lesson:** Choosing Appropriate Data Types — selecting data types for realistic school-management information.
