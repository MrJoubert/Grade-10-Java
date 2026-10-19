# Naming Conventions

## Learning objectives

By the end of this lesson, you should be able to:

- Explain why meaningful variable names are important.
- Identify valid and invalid Java identifiers.
- Apply `camelCase` to variable names.
- Apply `UPPER_SNAKE_CASE` to constant names.
- Recognise the difference between variable names and class names.
- Correct common naming mistakes.

## 1. Why are naming conventions important?

A variable name should describe the information stored in the variable.

Consider these two declarations:

```java
int a = 16;
int studentAge = 16;
```

Both declarations are valid Java. However, `studentAge` makes the purpose of the variable much clearer.

Imagine reading a large program containing hundreds of variables. Meaningful names help you understand what the program is doing without having to investigate every statement.

In our school-management examples, we will use descriptive names such as:

```java
String studentName = "Liam Jacobs";
int studentAge = 16;
double averageMark = 78.5;
String subjectName = "Information Technology";
```

These names describe the information each variable stores.

## 2. What is an identifier?

An **identifier** is a name used to identify a programming element, such as a variable, constant, method or class.

For example:

```java
int studentAge = 16;
```

Here, `studentAge` is an identifier.

Java has rules that determine which names are valid.

### Rule 1: An identifier cannot start with a digit

Invalid:

```java
int 2studentAge = 16;
```

Valid:

```java
int studentAge2 = 16;
```

A digit may appear later in an identifier, but the identifier cannot begin with a digit.

### Rule 2: Spaces are not allowed

Invalid:

```java
int student age = 16;
```

Valid:

```java
int studentAge = 16;
```

Use a naming convention such as `camelCase` to make names containing multiple words readable.

### Rule 3: Identifiers are case-sensitive

Java treats uppercase and lowercase letters as different characters.

For example:

```java
int studentAge = 16;
int StudentAge = 17;
```

These are two different identifiers in Java.

Although this is allowed, using names that differ only in capitalisation can make code confusing. Choose a consistent naming convention instead.

### Rule 4: Java keywords cannot be used as identifiers

Java reserves certain words for specific purposes.

For example, `int`, `class`, `public` and `static` are Java keywords.

Invalid:

```java
int class = 10;
```

Valid:

```java
int studentGrade = 10;
```

Choose a descriptive name that is not a reserved Java keyword.

### Rule 5: Use valid characters

Java identifiers can contain letters, digits, underscores and dollar signs, subject to the identifier rules.

For ordinary variable names, prefer readable names using letters and digits rather than unnecessary symbols.

For example:

```java
int studentNumber = 1205;
int studentAge = 16;
```

## 3. Using camelCase for variables

Java programmers commonly use **camelCase** for variable names.

The first word starts with a lowercase letter. Each following word starts with an uppercase letter, without spaces.

Examples:

| Incorrect or poor style | Recommended name |
|---|---|
| `studentname` | `studentName` |
| `student_age` | `studentAge` |
| `StudentAge` | `studentAge` |
| `avg` | `averageMark` |
| `sub` | `subjectName` |
| `num` | `numberOfStudents` |

Some names in the first column are technically valid Java identifiers, but the recommended names are clearer or follow the usual Java convention.

Use meaningful names that communicate the purpose of the variable.

## 4. Naming constants

Constants are commonly written using **UPPER_SNAKE_CASE**.

This convention uses uppercase letters and underscores to separate words.

Examples:

```java
final int PASS_MARK = 50;
final int MAX_PERIODS = 8;
final String SCHOOL_NAME = "Crawford International College";
```

The names make it easy to recognise that these values are intended to remain fixed.

Remember that `final` prevents reassignment. Uppercase naming is a convention that helps readers recognise constants; uppercase letters alone do not make a variable constant.

## 5. Naming classes

Java class names commonly use **PascalCase**.

Each word starts with an uppercase letter, and there are no spaces between words.

Examples:

```java
public class NamingConventions {
}
```

Other possible class names include:

- `StudentProfile`
- `SchoolTimetable`
- `AssessmentResults`

For this repository, the public class name must match the `.java` filename exactly.

For example:

`NamingConventions.java` must contain `public class NamingConventions`.

## 6. Following the Java program

Open `NamingConventions.java` in NetBeans.

### Step 1: Examine the variable names

The program uses names such as `studentName`, `studentAge`, `averageMark` and `classGroup`.

Each name describes the information being stored.

### Step 2: Examine the constant names

The program uses names such as `PASS_MARK` and `MAX_PERIODS`.

These follow the usual Java convention for constants.

### Step 3: Examine the class name

The public class is called `NamingConventions`.

The name uses PascalCase and matches the filename.

### Step 4: Compare the names

Notice how much easier it is to understand `averageMark` than a vague name such as `x`.

The values stored in the variables are not the main focus of this lesson. The aim is to practise choosing clear, valid and consistent names.

## 7. Common mistakes

### Mistake 1: Starting an identifier with a digit

Incorrect:

```java
int 3marks = 75;
```

Correct:

```java
int marks3 = 75;
```

### Mistake 2: Including spaces in a variable name

Incorrect:

```java
String student name = "Liam Jacobs";
```

Correct:

```java
String studentName = "Liam Jacobs";
```

### Mistake 3: Using inconsistent capitalisation

Poor style:

```java
int studentAge = 16;
int STUDENTGRADE = 10;
int average_mark = 78;
```

Recommended:

```java
int studentAge = 16;
int studentGrade = 10;
int averageMark = 78;
```

### Mistake 4: Using a Java keyword

Incorrect:

```java
int public = 10;
```

Correct:

```java
int studentGrade = 10;
```

### Mistake 5: Using vague names

Poor style:

```java
double x = 78.5;
```

Recommended:

```java
double averageMark = 78.5;
```

## 8. Practice activities

### Activity 1: Improve the names

Rewrite the following variable names using `camelCase` and meaningful descriptions:

1. `studentname`
2. `student_age`
3. `avg`
4. `sub`
5. `numstudents`

You may need to decide what each abbreviation was intended to mean.

### Activity 2: Identify invalid identifiers

Which of the following are invalid Java identifiers?

1. `studentAge`
2. `2studentAge`
3. `student age`
4. `studentAge2`
5. `class`
6. `averageMark`

Explain why each invalid identifier cannot be used.

### Activity 3: Create suitable names

Choose suitable variable names for:

1. A Student's surname.
2. A Teacher's employee number.
3. The number of Students in a classroom.
4. A Student's final examination mark.
5. Whether a Student has submitted homework.

Use `camelCase` for your variable names.

### Activity 4: Name constants

Create suitable constant names for:

1. The pass mark, which is 50.
2. The maximum number of periods in a school day, which is 8.
3. The maximum number of Students permitted in a class, which is 30.

Use `UPPER_SNAKE_CASE`.

### Activity 5: Improve the program

Modify `NamingConventions.java` to include a Student's surname, subject name and assessment mark.

Choose meaningful variable names and display the information.

## Summary

Good naming conventions make Java programs easier to read and maintain.

Use `camelCase` for variable names, `UPPER_SNAKE_CASE` for constants and `PascalCase` for class names. Always choose meaningful identifiers and ensure that they follow Java's naming rules.

**Next lesson:** Data Type Ranges — understanding the storage limits of numeric data types.
