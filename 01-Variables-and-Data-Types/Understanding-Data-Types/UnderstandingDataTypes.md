# Understanding Data Types

## Learning objectives

By the end of this lesson, you should be able to:

- Explain why Java uses data types.
- Identify the difference between primitive data types and reference types.
- Use `int`, `double`, `char` and `boolean`.
- Use `String` to store text.
- Select an appropriate data type for different kinds of information.

## 1. What is a data type?

A **data type** specifies the kind of value a variable can store.

When writing a school management program, we might need to store a Student's age, average mark, initial, sport participation and name.

These values are different kinds of information. Java uses data types to determine how they should be stored and used.

For example:

```java
int studentAge = 16;
double averageMark = 78.5;
char studentInitial = 'L';
boolean playsSport = true;
String studentName = "Liam Jacobs";
```

Each variable has a data type suited to its value.

## 2. The data types covered in this lesson

### 2.1 `int` — whole numbers

The `int` data type stores whole numbers without decimal places.

Examples include:

```java
int studentAge = 16;
int studentNumber = 1205;
int numberOfStudents = 25;
```

Use `int` when the value is a whole number and does not need a decimal component.

**Remember:** An `int` cannot store a decimal value such as `78.5`.

### 2.2 `double` — decimal numbers

The `double` data type stores numbers that can contain decimal places.

Examples include:

```java
double averageMark = 78.5;
double assessmentMark = 84.25;
double schoolFee = 1250.75;
```

A `double` is useful when a value may contain a fractional part, such as an academic average or a calculated amount.

Even if a `double` stores a whole number, Java can still represent that value using the `double` data type.

### 2.3 `char` — a single character

The `char` data type stores one character.

Examples include:

```java
char studentInitial = 'L';
char classLetter = 'A';
char gradeSymbol = 'B';
```

A `char` value uses **single quotation marks**.

For example, `'L'` is a character.

The value `'Liam'` is not a valid `char` because it contains more than one character.

### 2.4 `boolean` — true or false

The `boolean` data type stores one of two values:

- `true`
- `false`

Examples include:

```java
boolean playsSport = true;
boolean homeworkSubmitted = false;
boolean hasPaidFees = true;
```

A Boolean variable is useful when information represents a yes-or-no condition.

Java uses lowercase `true` and `false`, without quotation marks.

### 2.5 `String` — text

The `String` type stores text, including names, subject names and class groups.

Examples include:

```java
String studentName = "Liam Jacobs";
String subjectName = "Information Technology";
String classGroup = "10A";
```

A `String` value uses **double quotation marks**.

Although `String` is commonly used alongside primitive data types, it is a **reference type**, not a primitive data type.

## 3. Primitive data types and reference types

Java has eight primitive data types. The four covered in this example are:

| Data type | Purpose | Example |
|---|---|---|
| `int` | Whole numbers | `16` |
| `double` | Decimal numbers | `78.5` |
| `char` | One character | `'L'` |
| `boolean` | True or false | `true` |

The other primitive data types are `byte`, `short`, `long` and `float`. These can be explored when required by the relevant syllabus.

`String` is a reference type. It is used to represent text and is not one of Java's eight primitive data types.

## 4. Choosing the correct quotation marks

Pay close attention to quotation marks.

```java
char studentInitial = 'L';
String studentName = "Liam Jacobs";
```

The `char` value uses single quotation marks, while the `String` value uses double quotation marks.

Numbers and Boolean values do not need quotation marks:

```java
int studentAge = 16;
double averageMark = 78.5;
boolean playsSport = true;
```

If you put a number inside quotation marks, Java treats it as text rather than as a numeric value.

For example:

```java
int studentAge = 16;
String ageDescription = "16";
```

Both values contain the characters `16` in some form, but they have different data types and cannot be used interchangeably in every situation.

## 5. Following the Java program

Open `UnderstandingDataTypes.java` in NetBeans and follow these steps.

### Step 1: Examine the declarations

The program creates five variables:

- `studentAge` uses `int`.
- `averageMark` uses `double`.
- `studentInitial` uses `char`.
- `playsSport` uses `boolean`.
- `studentName` uses `String`.

### Step 2: Examine the assigned values

Notice the different ways the values are written:

- The age is written as `16`.
- The average is written as `78.5`.
- The initial is written as `'L'`.
- Sport participation is written as `true`.
- The name is written as `"Liam Jacobs"`.

The syntax reflects the data type of each value.

### Step 3: Examine the output

The program displays the stored values using `System.out.println()`.

Java displays the value held by each variable. It does not display the variable's data type automatically.

For example, the statement:

```java
System.out.println("Age: " + studentAge);
```

displays:

```text
Age: 16
```

### Step 4: Change the values

Try changing the values in the Java program. Make sure each new value is compatible with the variable's data type.

For example, you can change:

```java
double averageMark = 78.5;
```

to:

```java
double averageMark = 84.25;
```

However, changing an `int` variable to hold a decimal value will cause a compilation error.

## 6. Common mistakes

### Mistake 1: Using `int` for a decimal value

Incorrect:

```java
int averageMark = 78.5;
```

Correct:

```java
double averageMark = 78.5;
```

### Mistake 2: Using double quotation marks for a `char`

Incorrect:

```java
char studentInitial = "L";
```

Correct:

```java
char studentInitial = 'L';
```

### Mistake 3: Using single quotation marks for a `String`

Incorrect:

```java
String studentName = 'Liam Jacobs';
```

Correct:

```java
String studentName = "Liam Jacobs";
```

### Mistake 4: Writing Boolean values with capital letters

Incorrect:

```java
boolean playsSport = True;
```

Correct:

```java
boolean playsSport = true;
```

Java is case-sensitive.

### Mistake 5: Treating `String` as a primitive type

`String` is a reference type, even though it is used frequently in simple Java programs.

## 7. Practice activities

### Activity 1: Change the Student profile

Modify the program so that it displays these details:

- Name: Olivia Smith
- Initial: `O`
- Age: 17
- Average mark: 84.25
- Participates in sport: `false`

Run the program and check the output.

### Activity 2: Add more information

Add these variables to the program:

```java
int studentNumber = 1205;
String classGroup = "10A";
boolean homeworkSubmitted = true;
```

Display all three values.

### Activity 3: Identify the data type

For each item, select the most appropriate data type from `int`, `double`, `char`, `boolean` and `String`.

1. The number of Students in a class.
2. A Student's average mark of 73.65.
3. A Teacher's first initial.
4. Whether a Student has submitted homework.
5. The name of a subject.
6. A Student's age in completed years.
7. A class group such as `11B`.

### Activity 4: Correct the errors

Identify and correct the errors in the following declarations:

```java
int studentAge = 16.5;
char initial = "M";
String subject = 'Mathematics';
boolean passed = "true";
```

### Activity 5: Explain your choices

Answer these questions:

1. Why is `double` suitable for an average mark?
2. What is the difference between `char` and `String`?
3. Why does `boolean` not require quotation marks?
4. Why is `String` not a primitive data type?
5. What would happen if you assigned `"16"` to an `int` variable?

## Summary

Data types determine what kind of information a variable stores. In this lesson, you explored `int`, `double`, `char`, `boolean` and `String`.

Choosing an appropriate data type makes your programs easier to understand and helps prevent errors when assigning and processing values.

**Next lesson:** Variables and Constants — understanding which values can change and which should remain fixed.
