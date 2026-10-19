# Joining and Combining Strings

## Learning Objectives

By the end of this section, you should be able to:

- Join strings using the `+` operator.
- Combine several strings and variables into one string.
- Use the `concat()` method to join strings.
- Include spaces and other characters when combining strings.
- Explain the difference between adding numbers and joining text.
- Understand that joining strings creates a new `String` value.

---

## 1. What Does It Mean to Join Strings?

Joining strings means combining two or more pieces of text to form one longer string.

For example, a student's first name and surname can be combined to create a full name.

```java
String firstName = "Olivia";
String surname = "Smith";

String fullName = firstName + " " + surname;
```

The result stored in `fullName` is:

```text
Olivia Smith
```

Notice that `" "` contains a single space. Java does not automatically insert spaces between strings.

## 2. Joining Strings Using the `+` Operator

The `+` operator can be used to join strings.

### Example 1: Joining two strings

```java
String firstName = "Liam";
String surname = "Jacobs";

String fullName = firstName + surname;

System.out.println(fullName);
```

Output:

```text
LiamJacobs
```

There is no space between the names because no space was included in the calculation.

### Example 2: Including a space

```java
String firstName = "Liam";
String surname = "Jacobs";

String fullName = firstName + " " + surname;

System.out.println(fullName);
```

Output:

```text
Liam Jacobs
```

The expression joins three values:

1. The first name.
2. A space.
3. The surname.

### Example 3: Joining several strings

```java
String studentName = "Ava";
String subject = "Information Technology";
String classCode = "12A";

String message = studentName + " studies " + subject
        + " in class " + classCode + ".";

System.out.println(message);
```

Output:

```text
Ava studies Information Technology in class 12A.
```

You can join as many strings and string variables as necessary.

---

## 3. Joining Strings and Numeric Values

Java can also combine strings with numeric values.

```java
String studentName = "Noah";
int mark = 85;

String message = studentName + " achieved " + mark + "%.";

System.out.println(message);
```

Output:

```text
Noah achieved 85%.
```

When a string is joined with a number using `+`, Java converts the numeric value to text as part of the concatenation.

### Important: Addition versus concatenation

The `+` operator has two uses.

**Adding numbers:**

```java
int result = 10 + 5;

System.out.println(result);
```

Output:

```text
15
```

**Joining text:**

```java
String result = "10" + "5";

System.out.println(result);
```

Output:

```text
105
```

The first example performs arithmetic. The second joins two strings.

### Be careful with mixed expressions

```java
System.out.println("Total: " + 10 + 5);
```

Output:

```text
Total: 105
```

Java processes the expression from left to right. After `"Total: " + 10` produces a string, the next `+ 5` also joins text.

If you want to calculate the total first, use brackets:

```java
System.out.println("Total: " + (10 + 5));
```

Output:

```text
Total: 15
```

The brackets ensure that the addition takes place before the result is joined to the string.

---

## 4. Joining Strings Using `concat()`

Java also provides the `concat()` method for joining strings.

### Syntax

```java
string1.concat(string2)
```

The method returns a new string containing the original string followed by the string supplied as an argument.

Example:

```java
String firstName = "Mia";
String surname = "Patel";

String fullName = firstName.concat(" ").concat(surname);

System.out.println(fullName);
```

Output:

```text
Mia Patel
```

The first `concat()` adds a space. The second adds the surname.

### Using `concat()` with a variable

```java
String message = "Welcome, ";
String studentName = "Ethan";

String greeting = message.concat(studentName);

System.out.println(greeting);
```

Output:

```text
Welcome, Ethan
```

### Important: Strings do not change automatically

Strings in Java are immutable. This means that their contents cannot be changed after they have been created.

Both `+` and `concat()` produce a string value. If you want to keep that result, assign it to a variable.

For example:

```java
String message = "Welcome, ";

message.concat("Ethan");

System.out.println(message);
```

Output:

```text
Welcome, 
```

The original variable still contains `"Welcome, "` because the returned string was not assigned.

Correct version:

```java
String message = "Welcome, ";

message = message.concat("Ethan");

System.out.println(message);
```

Output:

```text
Welcome, Ethan
```

You can also use `+` with reassignment:

```java
message = message + "Ethan";
```

---

## 5. Worked Example: A Student Report

Suppose a program must display a student's name, class and mark in one sentence.

```java
String firstName = "Sophie";
String surname = "Brown";
String classCode = "11B";
int mark = 78;

String fullName = firstName + " " + surname;

String report = fullName + " is in class " + classCode
        + " and achieved " + mark + "%.";

System.out.println(report);
```

Output:

```text
Sophie Brown is in class 11B and achieved 78%.
```

The program joins strings, variables and a numeric value to produce a complete sentence.

---

## 6. Common Mistakes

### Mistake 1: Forgetting spaces

Incorrect:

```java
String fullName = "Olivia" + "Smith";
```

Result: `OliviaSmith`

Correct:

```java
String fullName = "Olivia" + " " + "Smith";
```

Result: `Olivia Smith`

### Mistake 2: Confusing addition with concatenation

```java
System.out.println("Mark: " + 70 + 5);
```

Output: `Mark: 705`

To display a calculated total:

```java
System.out.println("Mark: " + (70 + 5));
```

Output: `Mark: 75`

### Mistake 3: Ignoring the result of `concat()`

Incorrect:

```java
String subject = "Computer";
subject.concat(" Applications");

System.out.println(subject);
```

Output: `Computer`

Correct:

```java
subject = subject.concat(" Applications");
```

The returned string must be assigned if you want to retain it in the variable.

### Mistake 4: Using `+` when you need arithmetic

```java
String firstNumber = "20";
String secondNumber = "4";

System.out.println(firstNumber + secondNumber);
```

Output: `204`

These variables contain strings, so Java joins their contents. Convert them to numeric values if you need to perform a calculation.

---

## 7. Practice Exercises

### Exercise 1: Full Name

Create variables for a student's first name and surname. Join them into a full name with one space between the names.

### Exercise 2: Student Introduction

Create variables for a student's name, grade and class code. Use concatenation to display a complete sentence containing all three values.

### Exercise 3: Calculate and Display

Create two integer variables containing `35` and `40`. Calculate their sum and display it in a sentence.

Ensure that Java adds the numbers before joining the answer to the text.

### Exercise 4: Use `concat()`

Create a string containing `"Information"`. Use `concat()` to add `" Technology"` and assign the result to the original variable. Display the final string.

### Exercise 5: Predict the Output

Without running the code, determine what will be displayed.

```java
System.out.println("Grade " + 1 + 2);
System.out.println("Grade " + (1 + 2));
System.out.println("IT" + " " + "Student");
```

Then run the code to check your answers.

---

## Summary

- The `+` operator joins strings together.
- The `concat()` method can also join strings.
- Java does not automatically insert spaces between strings.
- The `+` operator can perform addition or concatenation, depending on the values and expression.
- Brackets can ensure that arithmetic is calculated before concatenation.
- Strings are immutable, so a returned string must be assigned if you want to store the result.
