# Understanding Variables

## Learning objectives

By the end of this lesson, you should be able to:

- Explain what a variable is.
- Declare and initialise variables in Java.
- Assign values to existing variables.
- Update the values stored in variables.
- Display variable values using `System.out.println()`.

## 1. What is a variable?

A variable is a named storage location used to store data in a program.

Imagine that a school needs to store information about a Student, such as their name, age and grade. We can create variables to store this information.

For example:

```java
String studentName = "Liam Jacobs";
int studentAge = 16;
int studentGrade = 10;
```

Each variable has a data type, a name and a value.

- `String` is the data type.
- `studentName` is the variable name.
- `"Liam Jacobs"` is the value stored in the variable.

## 2. Declaring a variable

Declaring a variable means specifying its data type and name.

```java
String studentName;
```

This statement declares a variable called `studentName` that can store text. It has not yet been assigned a value.

## 3. Initialising a variable

Initialising a variable means giving it its first value.

```java
String studentName = "Liam Jacobs";
```

This statement declares the variable and assigns its first value.

The `=` symbol is called the **assignment operator**.

## 4. Updating a variable

Once a variable has been declared, its value can be changed by assigning a new value to it.

```java
studentName = "Olivia Smith";
```

We do not write `String` again because the variable has already been declared.

The new value replaces the old value.

## 5. Java code example

The following complete program demonstrates these concepts using fictional school information.

Create a Java class named `UnderstandingVariables` in NetBeans and copy the code below into it.

```java
/*
 * TOPIC: UNDERSTANDING VARIABLES
 *
 * This program demonstrates how to declare, initialise,
 * assign and update variables in Java.
 *
 * The example uses fictional Student information.
 */

public class UnderstandingVariables {

    public static void main(String[] args) {

        // STEP 1: Declare and initialise the Student's name.
        // String is used to store text.
        String studentName = "Liam Jacobs";

        // STEP 2: Declare and initialise the Student's age.
        // int is used to store a whole number.
        int studentAge = 16;

        // STEP 3: Store the Student's current grade.
        int studentGrade = 10;

        // STEP 4: Display the original values.
        System.out.println("ORIGINAL STUDENT DETAILS");
        System.out.println("========================");

        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Grade: " + studentGrade);

        // STEP 5: Update the Student's name.
        // We assign a new value to the existing variable.
        studentName = "Olivia Smith";

        // STEP 6: Update the Student's age.
        studentAge = 17;

        // STEP 7: Update the Student's grade.
        studentGrade = 11;

        // STEP 8: Display the updated values.
        System.out.println();

        System.out.println("UPDATED STUDENT DETAILS");
        System.out.println("=======================");

        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Grade: " + studentGrade);

    }

}
```

## 6. Expected output

When you run the program, the Output window should display:

```text
ORIGINAL STUDENT DETAILS
========================
Name: Liam Jacobs
Age: 16
Grade: 10

UPDATED STUDENT DETAILS
=======================
Name: Olivia Smith
Age: 17
Grade: 11
```

## 7. Understanding the output

The program displays the original values first. It then assigns new values to the three existing variables and displays them again.

Notice that the updated details appear because Java displays the current values stored in the variables.

## 8. Common mistakes

### Mistake 1: Declaring the same variable twice

Incorrect:

```java
int studentAge = 16;
int studentAge = 17;
```

Correct:

```java
int studentAge = 16;
studentAge = 17;
```

Declare the variable once, then assign a new value when needed.

### Mistake 2: Using the wrong data type

Incorrect:

```java
int studentName = "Liam Jacobs";
```

Correct:

```java
String studentName = "Liam Jacobs";
```

A Student's name is text, so `String` is appropriate.

### Mistake 3: Forgetting the semicolon

Incorrect:

```java
int studentAge = 16
```

Correct:

```java
int studentAge = 16;
```

Java statements generally end with a semicolon.

### Mistake 4: Confusing a variable name with its value

In the statement:

```java
int studentAge = 16;
```

- `int` is the data type.
- `studentAge` is the variable name.
- `16` is the value.

## 9. Practice activities

### Activity 1: Change the Student's details

Change the original values so that the program initially displays:

- Name: Jason Naidoo
- Age: 16
- Grade: 10

Run the program and check the output.

### Activity 2: Update the details

Change the updated values so that the Student's details become:

- Name: Ayesha Khan
- Age: 17
- Grade: 11

Run the program again.

### Activity 3: Add a class group

1. Declare a `String` variable called `classGroup`.
2. Initialise it with the value `"10A"`.
3. Display it with the Student's details.
4. Change its value to `"11A"`.
5. Display the updated value.

### Activity 4: Test your understanding

Answer these questions in your own words:

1. What is a variable?
2. What does declaring a variable mean?
3. What does initialising a variable mean?
4. Which symbol is used to assign a value?
5. What happens when a new value is assigned to a variable?
6. Why do we not write `int` again when updating `studentAge`?

## 10. Summary

In this lesson, you learned that variables store information, declarations specify a variable's data type and name, initialisation gives a variable its first value, and assignment can update that value.

You also learned how to display variable values using `System.out.println()`.

**Next lesson:** Understanding Data Types — choosing and using appropriate data types for different kinds of information.
