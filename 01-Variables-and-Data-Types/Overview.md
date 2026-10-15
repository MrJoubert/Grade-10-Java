# Variables and Data Types

## Overview

Variables and data types are fundamental building blocks of Java programming. Almost every program needs to store information, process values and produce results. Understanding how Java represents and stores data is therefore essential before progressing to calculations, input and output, selection statements, loops and methods.

A **variable** is a named storage location that holds a value while a program executes. A **data type** determines the kind of value that can be stored and influences which operations can be performed on that value.

For example, a program that calculates a Student's average mark may need to store the Student's name, individual marks, total and calculated average. Each piece of information must be represented using an appropriate data type.

This topic develops the knowledge and skills required to declare variables, assign values, distinguish between variables and constants, understand data type limitations and choose suitable data types for different programming problems.

The content is intended for **Grade 10 Information Technology Students studying Java according to the IEB curriculum**.

---

## Learning Objectives

By completing this topic, you should be able to:

- Explain the purpose of variables in a computer program.
- Identify and use appropriate primitive data types in Java.
- Distinguish between primitive data types and reference types.
- Declare variables and initialise them with suitable values.
- Assign new values to existing variables.
- Explain the difference between variables and constants.
- Apply appropriate naming conventions to identifiers.
- Understand the ranges and limitations of numeric data types.
- Select appropriate data types based on the information being processed.
- Recognise and correct common errors involving variable declarations and assignments.
- Read Java code and determine the values stored in variables as a program executes.

---

## Curriculum Alignment

This topic supports the Grade 10 Java programming concepts associated with data types and variable use in the IEB Information Technology Subject Assessment Guidelines (SAGS).

The material is organised to support the development of foundational programming knowledge, including:

- Simple data types.
- Variable declaration and assignment.
- Constants and variables.
- Naming conventions.
- Data type ranges and limitations.
- Selecting suitable data types for different situations.

The individual lessons provide focused explanations and examples for each of these concepts.

**Curriculum note:** This repository is a supplementary learning resource. Students should continue to use their prescribed course material, practical activities and official IEB assessment guidance alongside these notes.

---

## Topic Structure

This topic is divided into six subtopics. Work through them in the order presented to build a solid understanding of how Java stores and represents information.

| Subtopic | What You Will Learn |
|---|---|
| [Primitive Data Types](Primitive-Data-Types/README.md) | Understand Java's primitive types, including `int`, `double`, `char` and `boolean`, and learn when they are appropriate. |
| [Variable Declaration and Assignment](Variable-Declaration-and-Assignment/README.md) | Learn how to declare variables, initialise them and assign new values during program execution. |
| [Constants and Variables](Constants-and-Variables/README.md) | Understand the difference between changeable variables and constants declared using `final`. |
| [Naming Conventions](Naming-Conventions/README.md) | Apply Java naming conventions to variables and constants to improve code readability. |
| [Data Type Ranges](Data-Type-Ranges/README.md) | Explore the storage capacities, ranges and limitations of numeric data types. |
| [Choosing Appropriate Data Types](Choosing-Appropriate-Data-Types/README.md) | Decide which data type is most suitable for a given programming requirement. |

---

## 1. Understanding Variables

Variables allow a program to retain information so that it can be used in calculations, comparisons and other operations.

Consider the following Java statements:

```java
int mark = 85;
int bonus = 5;
int finalMark = mark + bonus;

System.out.println(finalMark);
```

Output:

```text
90
```

In this example:

1. `int mark = 85;` declares a variable and initialises it with the value `85`.
2. `int bonus = 5;` declares another variable.
3. `int finalMark = mark + bonus;` calculates the sum and stores it in a new variable.
4. `System.out.println(finalMark);` displays the calculated result.

The values stored in variables can be used throughout the relevant scope of a program, subject to Java's rules.

---

## 2. Understanding Data Types

Java is a strongly typed language. Every variable has a declared type, and Java applies type rules when values are assigned and operations are performed.

The following examples illustrate common data types used in introductory Java programming:

```java
int age = 17;
double average = 78.5;
char grade = 'B';
boolean passed = true;
String studentName = "Alex";
```

| Type | Example Value | Typical Purpose |
|---|---|---|
| `int` | `17` | Whole-number values. |
| `double` | `78.5` | Decimal calculations and measurements. |
| `char` | `'B'` | A single UTF-16 code unit. |
| `boolean` | `true` | Logical values used in conditions. |
| `String` | `"Alex"` | Text containing characters. |

**Important:** `String` is a reference type, not a primitive data type. Java has eight primitive data types: `byte`, `short`, `int`, `long`, `float`, `double`, `char` and `boolean`.

You will explore the relevant types and their uses in greater detail in the Primitive Data Types subtopic.

---

## 3. Variables and Constants

A variable can hold different values as a program executes, provided that the new values are compatible with its declared type.

```java
int score = 70;
score = 85;

System.out.println(score);
```

Output:

```text
85
```

The value stored in `score` changes from `70` to `85`.

A constant, on the other hand, is a variable declared with the `final` keyword. Once it has been initialised, it cannot be reassigned.

```java
final int MAX_MARK = 100;
```

Constants are useful for values that should remain fixed throughout a program, such as a maximum mark or a fixed number of questions.

The distinction between variables and constants is explored in the Constants and Variables subtopic.

---

## 4. Choosing the Correct Data Type

Selecting a suitable data type is an important part of solving a programming problem.

For example:

| Information | Suitable Type | Reason |
|---|---|---|
| Number of Students in a class | `int` | Students are counted in whole numbers. |
| Student's average mark | `double` | The result may contain decimal places. |
| First letter of a surname | `char` | The value represents a single character. |
| Whether a Student passed | `boolean` | The result is either `true` or `false`. |
| Student's name | `String` | The value contains text. |

The choice should reflect the meaning of the information and the calculations that may be performed on it.

For example, a whole-number examination mark may be stored as an `int`, while an average calculated from several marks may require a `double`.

---

## 5. Common Mistakes

When working with variables and data types, avoid the following errors:

### Using a variable before it is declared

A variable must be declared before it can be used. Local variables must also be initialised before their values are read.

### Assigning an incompatible value

For example, assigning a decimal literal directly to an `int` variable causes a compilation error.

```java
int average = 72.5;
```

If the program needs to store a decimal value, use an appropriate type:

```java
double average = 72.5;
```

### Confusing characters and Strings

A character literal uses single quotation marks, while a String literal uses double quotation marks.

```java
char letter = 'A';
String word = "Apple";
```

### Using unclear variable names

Names such as `x`, `y` and `z` may be acceptable in short mathematical examples, but meaningful names such as `totalMark` and `studentAge` make programs easier to understand.

### Ignoring data type limitations

Different types have different ranges and storage characteristics. A data type should be selected with its limitations in mind.

---

## 6. Recommended Study Approach

For each subtopic:

1. Read the explanation and identify the key terminology.
2. Study each Java code example carefully.
3. Predict the output before running the program.
4. Type the code into NetBeans and execute it.
5. Change the values and observe how the results differ.
6. Create your own examples using different variables and data types.
7. Practise explaining why each data type is suitable for its purpose.

Do not rely solely on memorising code. Aim to understand the relationship between the information being stored, the data type selected and the operations performed.

---

## 7. Practical Challenge

Create a Java program called `StudentInformation` that stores and displays basic information about a Student.

Your program should:

- Declare a `String` variable for the Student's name.
- Declare an `int` variable for the Student's age.
- Declare two `int` variables for two examination marks.
- Calculate the average using a `double` variable.
- Declare a `char` variable for a grade.
- Declare a `boolean` variable indicating whether the Student has passed.
- Display all the information using meaningful output messages.

After completing the program, change the marks and observe how the average and pass status are affected.

**Extension:** Explain why `double` is appropriate for the average, even though the original marks are stored as integers.

---

## 8. Key Takeaways

By the end of this topic, you should understand that:

- Variables store information that a program needs to use.
- Every variable has a declared data type.
- Primitive types represent basic values, while `String` is a reference type.
- Variables can be reassigned, while a `final` variable cannot be reassigned after initialisation.
- Naming conventions improve the readability and maintainability of code.
- Data types have specific ranges and limitations.
- Choosing a suitable data type helps a program process information correctly.

These concepts form the foundation for the remaining topics in the Grade 10 Java Code Library.

---

## Navigation

[**Next: Operators and Calculations →**](../02-Operators-and-Calculations/README.md)

[Return to the Grade 10 Java repository](../README.md)
