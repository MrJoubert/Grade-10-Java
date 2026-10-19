# Understanding Variables

## Learning objectives

By the end of this lesson, you should be able to:

- Explain what a variable is.
- Identify the data type, name and value of a variable.
- Declare and initialise a variable.
- Assign a new value to an existing variable.
- Display variable values using `System.out.println()`.

## 1. What is a variable?

A **variable** is a named storage location used to store information while a program runs.

A school management program might need to store a Student's name, age and grade. We can create a separate variable for each piece of information.

For example:

```java
String studentName = "Liam Jacobs";
int studentAge = 16;
int studentGrade = 10;
```

Each statement creates a variable and gives it an initial value.

### Understanding a variable declaration

Consider this statement:

```java
int studentAge = 16;
```

| Part | Meaning |
|---|---|
| `int` | The data type. It allows the variable to store a whole number. |
| `studentAge` | The variable name. It identifies the storage location. |
| `=` | The assignment operator. It assigns a value. |
| `16` | The value stored in the variable. |
| `;` | Marks the end of the Java statement. |

The variable name is used whenever we need to refer to the stored value.

## 2. Declaring a variable

**Declaring** a variable means specifying its data type and name.

```java
int studentAge;
```

This tells Java that a variable named `studentAge` will store an integer.

The statement does not assign a value to the variable.

Because `studentAge` is a local variable, Java will not allow us to use it until we have assigned it a value.

## 3. Initialising a variable

**Initialising** a variable means giving it its first value.

```java
int studentAge = 16;
```

Here, the variable is declared and initialised in a single statement.

We can also declare and initialise a text variable:

```java
String studentName = "Liam Jacobs";
```

The value assigned must be compatible with the variable's data type.

## 4. Assigning a new value

Once a variable has been declared, we can change its value.

```java
studentAge = 17;
```

The variable now stores `17` instead of `16`.

We do not write `int` again because the variable has already been declared.

Consider this sequence:

```java
int studentAge = 16;
studentAge = 17;
studentAge = 18;
```

The variable is declared once and then updated twice. Its final value is `18`.

## 5. Displaying variable values

Java can display information in the Output window using `System.out.println()`.

```java
int studentAge = 16;

System.out.println(studentAge);
System.out.println("Age: " + studentAge);
```

The output is:

```text
16
Age: 16
```

The first statement displays the value stored in `studentAge`.

The second statement joins the text `"Age: "` with the variable's value using the `+` operator.

This is called **string concatenation** when text is joined together.

## 6. Following the program step by step

Open `UnderstandingVariables.java` and follow these stages.

### Step 1: Create the variables

The program declares and initialises three variables:

- `studentName` stores a Student's name.
- `studentAge` stores a Student's age.
- `studentGrade` stores a Student's grade.

### Step 2: Display the original values

The program displays the values currently stored in the variables.

At this point, the Student is Liam Jacobs, aged 16, in Grade 10.

### Step 3: Update the variables

The program assigns new values to all three variables.

The Student's name becomes Olivia Smith, the age becomes 17 and the grade becomes 11.

### Step 4: Display the updated values

The program displays the variables again.

Because their values have changed, the output now shows the updated details.

**Important:** A variable stores its current value. When a new value is assigned, the previous value is replaced.

## 7. Common mistakes

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

### Mistake 2: Using an incompatible data type

Incorrect:

```java
int studentName = "Liam Jacobs";
```

Correct:

```java
String studentName = "Liam Jacobs";
```

The variable's data type must be appropriate for the value being stored.

### Mistake 3: Forgetting the semicolon

Incorrect:

```java
int studentAge = 16
```

Correct:

```java
int studentAge = 16;
```

### Mistake 4: Using a variable before it has a value

Incorrect:

```java
int studentAge;
System.out.println(studentAge);
```

A local variable must be assigned a value before it can be used.

Correct:

```java
int studentAge = 16;
System.out.println(studentAge);
```

## 8. Practice activities

Complete these activities by modifying your own copy of the Java program.

### Activity 1: Change the Student's details

Change the original values to:

- Name: Jason Naidoo
- Age: 16
- Grade: 10

Run the program and check the output.

### Activity 2: Update the details

Change the updated values to:

- Name: Ayesha Khan
- Age: 17
- Grade: 11

Run the program again.

### Activity 3: Add a class group

1. Create a `String` variable named `classGroup`.
2. Give it the initial value `"10A"`.
3. Display the class group with the other Student details.
4. Change its value to `"11A"`.
5. Display the updated class group.

### Activity 4: Check your understanding

Answer the following questions:

1. What is a variable?
2. What is the difference between declaring and initialising a variable?
3. What does the assignment operator do?
4. Why do we not write `int` again when updating `studentAge`?
5. What happens to the old value when a new value is assigned?
6. Why must a local variable be initialised before it is used?

## Summary

A variable is a named storage location for data. A declaration specifies the data type and name, initialisation gives the variable its first value, and assignment can change the value later.

In the next lesson, you will learn how to choose the correct data type for different kinds of information.
