# Variables and Constants

## Learning objectives

By the end of this lesson, you should be able to:

- Explain the difference between a variable and a constant.
- Declare and initialise variables.
- Declare constants using the `final` keyword.
- Identify when a value should be stored in a variable or a constant.
- Explain why constants are useful in a program.

## 1. What is a variable?

A variable stores a value that can change while a program runs.

For example, a Student's age, average mark or current grade may change.

```java
int studentAge = 16;
double averageMark = 78.5;
int studentGrade = 10;
```

The values can be updated when necessary:

```java
studentAge = 17;
averageMark = 82.5;
studentGrade = 11;
```

The variables keep the same names and data types, but their stored values change.

## 2. What is a constant?

A **constant** is a value that cannot be reassigned after it has been initialised.

In Java, we use the keyword `final` to declare a variable that may only be assigned once.

For example:

```java
final String SCHOOL_NAME = "Crawford International College";
```

The keyword `final` prevents us from assigning a different value to `SCHOOL_NAME`.

This is useful when a value should remain fixed throughout the program.

Examples might include:

- A school's name.
- The maximum number of periods in a school day.
- The number of marks allocated to a particular assessment.
- A fixed conversion factor used in a calculation.

The value should only be made a constant if it is intended to remain fixed for the program's purpose.

## 3. Comparing variables and constants

Consider the following declarations:

```java
int studentAge = 16;
final int MAX_PERIODS = 8;
```

The variable `studentAge` can be updated:

```java
studentAge = 17;
```

The constant `MAX_PERIODS` cannot be reassigned:

```java
MAX_PERIODS = 9;
```

The second assignment causes a compilation error because `MAX_PERIODS` is declared using `final`.

| Feature | Variable | Constant |
|---|---|---|
| Can be assigned an initial value | Yes | Yes |
| Can be reassigned later | Yes | No, after it has been assigned |
| Example | `int studentAge = 16;` | `final int MAX_PERIODS = 8;` |
| Typical purpose | Values that may change | Values intended to remain fixed |

## 4. Naming constants

Java programmers commonly use **UPPER_SNAKE_CASE** for constants.

This means:

- Use uppercase letters.
- Separate words with underscores.
- Choose a descriptive name.

Examples:

```java
final String SCHOOL_NAME = "Crawford International College";
final int MAX_PERIODS = 8;
final int PASS_MARK = 50;
```

Ordinary variable names commonly use `camelCase`:

```java
int studentAge = 16;
double averageMark = 78.5;
String studentName = "Liam Jacobs";
```

Using different naming conventions helps programmers recognise constants quickly.

## 5. Why are constants useful?

Imagine that a school program uses the pass mark of 50 in several places.

Without a constant, the number might be written repeatedly throughout the program.

```java
boolean studentPassed = averageMark >= 50;
```

A more descriptive approach is to declare a constant:

```java
final int PASS_MARK = 50;
boolean studentPassed = averageMark >= PASS_MARK;
```

The name `PASS_MARK` makes the purpose of the value clear.

If the rule changes, the programmer can update the constant's declaration rather than searching for repeated values throughout the program.

A constant also helps prevent accidental reassignment.

**Important:** A constant should represent a value that is genuinely fixed for the program's intended use. A value that must change during normal operation should usually be stored in a variable.

## 6. Following the Java program

Open `VariablesAndConstants.java` in NetBeans.

### Step 1: Examine the constants

The program declares constants for the school's name and the maximum number of periods in a school day.

Both declarations use `final`.

### Step 2: Examine the variables

The program declares variables for a Student's name, age and grade.

These values can be changed as the Student's details are updated.

### Step 3: Display the original details

The program displays the school's fixed information alongside the Student's current details.

### Step 4: Update the variables

The program changes the Student's name, age and grade.

It does not attempt to change the constants.

### Step 5: Display the updated details

The program displays the new Student information. The school's name and maximum number of periods remain unchanged.

## 7. Common mistakes

### Mistake 1: Trying to change a constant

Incorrect:

```java
final int MAX_PERIODS = 8;
MAX_PERIODS = 9;
```

The second statement causes a compilation error.

Correct approach: assign the intended value when declaring the constant and do not reassign it.

### Mistake 2: Forgetting `final`

```java
int MAX_PERIODS = 8;
MAX_PERIODS = 9;
```

This is a valid variable declaration followed by an assignment. Java will allow the value to change because the variable is not declared `final`.

If the value must remain fixed, use `final`.

### Mistake 3: Using a constant for information that must change

A Student's age changes over time, so it is generally more appropriate to store it in an ordinary variable.

### Mistake 4: Giving constants unclear names

A name such as `X` does not explain the purpose of the value.

A name such as `MAX_PERIODS` makes the intention clearer.

## 8. Practice activities

### Activity 1: Add a constant

Add a constant called `PASS_MARK` with a value of `50`.

Display the constant alongside the Student's details.

### Activity 2: Update a variable

Change the Student's age and grade.

Display the original and updated values to demonstrate that variables can change.

### Activity 3: Add a school constant

Create a constant named `MAX_STUDENTS_PER_CLASS` with a value of `30`.

Display it in the program.

### Activity 4: Identify variables and constants

Classify each item as a variable or a suitable candidate for a constant:

1. A Student's current age.
2. The school's name in a program dedicated to that school.
3. A Student's latest assessment mark.
4. The fixed maximum number of periods used by the program.
5. A Student's current grade.

Explain your choices.

### Activity 5: Correct the code

Identify the problem in this code:

```java
final int PASS_MARK = 50;
PASS_MARK = 60;
```

Explain why Java rejects the second statement.

## Summary

Variables store values that can be reassigned. Constants are declared using `final` and cannot be reassigned after they have been initialised.

Use descriptive names, choose the correct data type, and decide whether a value should change before deciding whether to use a variable or a constant.

**Next lesson:** Naming Conventions — writing clear, consistent and valid Java identifiers.
