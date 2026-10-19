# Choosing Appropriate Data Types

## Learning objectives

By the end of this lesson, you should be able to:

- Choose an appropriate data type for different kinds of information.
- Explain why a particular data type is suitable.
- Distinguish between numeric values and text that contains digits.
- Recognise when a value may need decimal places.
- Apply your understanding of variables, constants and data types in one program.

## 1. Why is choosing the correct data type important?

Every variable in Java has a data type. The data type determines what kind of value the variable can store and which operations can be performed on it.

Consider the information a school might need to store about a Student:

- Name
- Student number
- Age
- Grade
- Average mark
- First initial
- Sport participation

These pieces of information do not all have the same purpose. Therefore, we should not automatically use the same data type for every variable.

## 2. Choosing a data type for common school information

### 2.1 Student name — `String`

A Student's name is text.

```java
String studentName = "Liam Jacobs";
```

We use `String` because a name can contain multiple characters, spaces and other valid text characters.

### 2.2 Student number — `String` or `int`?

A Student number might look like a number, but we must consider how it will be used.

For example:

```java
String studentNumber = "001205";
```

Here, the Student number is stored as text. This preserves the leading zeros.

If the Student number is an identifier rather than a value used in calculations, `String` is often appropriate.

For a numerical count or quantity, an integer type is generally more suitable.

**Important:** Do not choose a data type based only on how a value looks. Consider what the value represents and how the program will use it.

### 2.3 Student age — `int`

A Student's age in completed years is normally stored as a whole number.

```java
int studentAge = 16;
```

An `int` is suitable because the program does not need a decimal component for this example.

### 2.4 Student grade — `int`

A Student's grade can be represented by a whole number.

```java
int studentGrade = 10;
```

An `int` is appropriate for storing the grade number.

### 2.5 Average mark — `double`

An academic average may contain decimal places.

```java
double averageMark = 78.5;
```

A `double` is appropriate when the program needs to store and calculate decimal values.

### 2.6 Student initial — `char`

A single initial can be stored using `char`.

```java
char studentInitial = 'L';
```

Remember that a `char` uses single quotation marks and stores one character.

### 2.7 Sport participation — `boolean`

If the program needs to record whether a Student participates in sport, a Boolean variable is suitable.

```java
boolean playsSport = true;
```

The value can be `true` or `false`.

### 2.8 Subject name — `String`

A subject name is text.

```java
String subjectName = "Information Technology";
```

A `String` can store the complete subject name, including spaces.

## 3. Summary table

| Information | Suitable data type | Reason |
|---|---|---|
| Student name | `String` | Stores text |
| Student number with leading zeros | `String` | Preserves the identifier exactly |
| Age in completed years | `int` | Stores a whole number |
| Grade number | `int` | Stores a whole number |
| Average mark | `double` | Allows decimal values |
| First initial | `char` | Stores one character |
| Sport participation | `boolean` | Represents true or false |
| Subject name | `String` | Stores text |

These are suitable choices for the examples described. A different program may have different requirements.

## 4. What questions should you ask when choosing a data type?

Before declaring a variable, ask yourself:

1. Is the information text, a whole number, a decimal number, a single character or a true-or-false value?
2. Will the value need to contain decimal places?
3. If it contains digits, is it a quantity used in calculations or an identifier?
4. Does the chosen numeric type have a range large enough for the values the program must store?
5. Is the value expected to change, or should it be a constant?

These questions help you make a sensible decision before writing your code.

## 5. Following the Java program

Open `ChoosingAppropriateDataTypes.java` in NetBeans.

### Step 1: Examine each declaration

The program stores a Student's name, number, age, grade, average mark, initial, sport participation and subject.

Each variable has a data type selected for the information it represents.

### Step 2: Pay attention to the Student number

The Student number is stored as a `String` so that its leading zeros are preserved.

The program does not perform mathematical calculations on the Student number.

### Step 3: Examine the average mark

The average mark uses `double` because decimal values may be required.

### Step 4: Examine the Boolean value

The `playsSport` variable stores `true` or `false`, rather than the text `"yes"` or `"no"`.

### Step 5: Run the program

Check the output and confirm that each variable displays the expected information.

## 6. Common mistakes

### Mistake 1: Using `int` for a Student number that contains leading zeros

If the number `001205` is stored as an integer, the leading zeros are not preserved.

For an identifier that must retain its exact format, use `String`.

### Mistake 2: Using `String` for a value that must be calculated

Incorrect choice for a numerical age calculation:

```java
String studentAge = "16";
```

More appropriate:

```java
int studentAge = 16;
```

A `String` stores text. An `int` is more suitable when the age is represented as a whole number and used in numerical calculations.

### Mistake 3: Using `int` when decimal places are needed

Incorrect:

```java
int averageMark = 78;
```

If the program must retain an average of `78.5`, use:

```java
double averageMark = 78.5;
```

### Mistake 4: Using `char` for a complete name

Incorrect:

```java
char studentName = 'L';
```

This stores only one character.

Correct:

```java
String studentName = "Liam Jacobs";
```

## 7. Practice activities

### Activity 1: Choose the appropriate data type

Select a suitable data type for each item and explain your choice.

1. A Student's full name.
2. A Student number that begins with zeros.
3. A Student's age in completed years.
4. A calculated average of `73.65`.
5. A single letter representing a class group.
6. Whether a Student submitted homework.
7. The name of a classroom.

### Activity 2: Create variable declarations

Write Java declarations for the following fictional information:

- Student name: Olivia Smith
- Student number: `001307`
- Age: 17
- Grade: 11
- Average mark: 84.25
- Initial: O
- Participates in sport: false

Choose appropriate data types for each value.

### Activity 3: Correct the declarations

Explain what is wrong with each declaration and correct it where necessary.

```java
int studentName = "Liam Jacobs";
int averageMark = 78.5;
char initial = "L";
boolean playsSport = "true";
```

### Activity 4: Extend the program

Add these variables to `ChoosingAppropriateDataTypes.java`:

- A class group stored as text.
- A subject name stored as text.
- A Boolean variable indicating whether homework was submitted.
- An integer representing the number of Students in the class.

Display the new information.

### Activity 5: Justify your choices

Explain why a Student number may be stored as a `String` even though it contains digits.

Then explain why a Student's age is normally stored as an integer in this example.

## Summary

Choosing appropriate data types requires you to understand what the information represents and how the program will use it.

Use `String` for text and identifiers that must retain their formatting, integer types for whole-number quantities, `double` for decimal values, `char` for a single character and `boolean` for true-or-false information.

**Next:** Folder 02 — Operators and Calculations.
