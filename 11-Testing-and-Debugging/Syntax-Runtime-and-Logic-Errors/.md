# Syntax, Runtime and Logic Errors

## Overview

Errors are a normal part of programming. Even experienced programmers make mistakes when writing code. The important skill is learning to recognise different types of errors, understand why they occur, and correct them systematically.

In Java, errors are commonly classified into three categories:

1. **Syntax errors** – the code does not follow Java's rules and cannot compile.
2. **Runtime errors** – the program compiles but encounters a problem while executing.
3. **Logic errors** – the program executes but produces an incorrect result.

Understanding these differences will help you test, debug and improve your Java programs.

## Learning Objectives

By the end of this topic, you should be able to:

- Distinguish between syntax, runtime and logic errors.
- Identify common causes of each type of error.
- Recognise errors reported by the Java compiler.
- Explain why a program may crash during execution.
- Identify incorrect calculations and conditions.
- Correct errors and test a program to confirm that it works as expected.

---

## 1. Syntax Errors

A syntax error occurs when code does not follow Java's language rules.

Java checks your code during compilation. If the compiler finds a syntax error, the program cannot be compiled successfully until the error is corrected.

### Example 1: Missing semicolon

**Incorrect code:**

```java
int age = 16
System.out.println(age);
```

The first statement is missing a semicolon.

**Correct code:**

```java
int age = 16;
System.out.println(age);
```

**Output:**

```text
16
```

### Example 2: Incorrect spelling of a Java keyword

**Incorrect code:**

```java
Int age = 16;
```

Java is case-sensitive. The primitive data type is `int`, not `Int`.

**Correct code:**

```java
int age = 16;
```

### Example 3: Incorrect use of quotation marks

**Incorrect code:**

```java
System.out.println("Hello);
```

The closing quotation mark is missing.

**Correct code:**

```java
System.out.println("Hello");
```

**Output:**

```text
Hello
```

### Common causes of syntax errors

- Missing semicolons.
- Missing or mismatched brackets.
- Missing quotation marks.
- Misspelt Java keywords.
- Incorrectly structured statements.
- Using a variable without declaring it.
- Assigning a value of an incompatible data type.

Some errors are more accurately described as **compile-time errors** rather than syntax errors. For example, assigning a `String` value to an `int` variable violates Java's type rules, even though the statement may look syntactically correct.

```java
int age = "sixteen";
```

The compiler rejects this because `"sixteen"` is a `String`, not an integer.

## 2. Runtime Errors

A runtime error occurs while a program is executing.

The program may compile successfully, but an operation fails when the program reaches a particular statement. Depending on the error, the program may terminate unexpectedly.

### Example 1: Division by zero

**Code:**

```java
int number = 10;
int divisor = 0;

int answer = number / divisor;

System.out.println(answer);
```

This code compiles, but executing the division causes an `ArithmeticException` because integer division by zero is not permitted.

**Typical result:** The program terminates with an exception before displaying the answer.

### Corrected version

```java
int number = 10;
int divisor = 0;

if (divisor != 0) {
    int answer = number / divisor;
    System.out.println(answer);
} else {
    System.out.println("Cannot divide by zero.");
}
```

**Output:**

```text
Cannot divide by zero.
```

The condition checks whether division is possible before performing the calculation.

### Example 2: Invalid numeric conversion

A program may ask a user to enter a number. However, the user might enter text that cannot be converted into an integer.

**Code:**

```java
String input = "hello";

int number = Integer.parseInt(input);

System.out.println(number);
```

The program compiles, but `Integer.parseInt()` throws a `NumberFormatException` when it attempts to convert `"hello"` into an integer.

A program that accepts user input should validate the input or handle the exception appropriately.

### Common causes of runtime errors

- Dividing an integer by zero.
- Attempting to convert unsuitable text into a number.
- Calling a method with an invalid argument that causes an exception.
- Accessing an object through a `null` reference.
- Performing an operation that fails for the actual values encountered during execution.

**Important:** A runtime error may only occur for certain inputs. A program could work correctly with one set of data and fail with another.

## 3. Logic Errors

A logic error occurs when a program runs without a syntax or runtime error but produces an incorrect result.

The Java compiler cannot determine whether your algorithm matches the intended problem. You must test the program and check whether its results are correct.

### Example 1: Incorrect calculation

Suppose a program must calculate the area of a rectangle.

The formula is:

\[
\text{Area}=\text{length}\times\text{width}
\]

**Incorrect code:**

```java
int length = 5;
int width = 3;

int area = length + width;

System.out.println(area);
```

**Output:**

```text
8
```

The program runs, but the answer is incorrect because addition was used instead of multiplication.

**Correct code:**

```java
int length = 5;
int width = 3;

int area = length * width;

System.out.println(area);
```

**Output:**

```text
15
```

### Example 2: Incorrect condition

Suppose a Student must be at least 16 years old to qualify.

**Incorrect code:**

```java
int age = 15;

if (age > 16) {
    System.out.println("You qualify.");
} else {
    System.out.println("You do not qualify.");
}
```

The condition excludes a Student who is exactly 16. The program runs, but the condition does not match the requirement.

**Correct code:**

```java
int age = 16;

if (age >= 16) {
    System.out.println("You qualify.");
} else {
    System.out.println("You do not qualify.");
}
```

**Output:**

```text
You qualify.
```

The `>=` operator includes values equal to 16 as well as values greater than 16.

### Common causes of logic errors

- Using the wrong arithmetic operator.
- Using an incorrect relational operator.
- Writing a condition that does not match the requirements.
- Performing calculations in the wrong order.
- Updating a variable incorrectly.
- Using an incorrect formula.
- Forgetting to handle a special case.

## 4. Comparing the Three Types of Errors

| Feature | Syntax error | Runtime error | Logic error |
|---|---|---|---|
| When does it occur? | During compilation | During execution | When the result is checked |
| Does the program compile? | No, until corrected | Yes | Yes |
| Does the program execute? | No successful execution of the affected program | It may stop or fail during execution | Usually, yes |
| Is the problem always obvious? | Often, through compiler messages | Sometimes, through an exception | Not necessarily |
| How is it identified? | Compiler messages | Exceptions and testing | Checking expected versus actual results |
| Example | Missing semicolon | Integer division by zero | Adding instead of multiplying |

## 5. A Systematic Approach to Finding Errors

When a program does not work as expected, follow these steps.

### Step 1: Read the problem requirements

Make sure you understand what the program is supposed to do.

Identify the required inputs, processing and outputs.

### Step 2: Check for syntax and compilation errors

- Read the compiler messages.
- Check the indicated line and the lines immediately before it.
- Look for missing semicolons, brackets and quotation marks.
- Check variable declarations, data types and spelling.

Correct compilation errors before trying to run the program.

### Step 3: Run the program

If the program compiles successfully, execute it.

Observe whether it completes normally or produces an exception.

### Step 4: Test different inputs

Use standard, extreme and abnormal test data where appropriate.

For example, if a program divides two integers, test a normal divisor and a divisor of zero.

### Step 5: Compare expected and actual results

Work out the correct answer independently.

Compare it with the result produced by the program. If the results differ, investigate the calculation, conditions and algorithm.

### Step 6: Correct and retest

Make the necessary change, then run the program again.

Test the original failing case and other relevant cases to ensure that the correction has not introduced another error.

---

## 6. Practical Challenge

The following program is intended to calculate the total cost of buying several identical items. It contains an error.

```java
int price = 25;
int quantity = 4;

int total = price + quantity;

System.out.println("Total cost: R" + total);
```

### Your tasks

1. Run the program and record its output.
2. Explain why the output is incorrect.
3. Identify the type of error.
4. Correct the program.
5. Calculate the expected result before running the corrected version.
6. Test your corrected program using a different price and quantity.

**Extension:** Modify the program so that it displays an error message if the quantity is zero or negative.

## 7. Key Takeaways

- **Syntax errors** occur when code violates Java's syntax rules and prevent successful compilation.
- **Runtime errors** occur while a program is executing and may cause it to terminate unexpectedly.
- **Logic errors** occur when a program produces an incorrect result despite executing successfully.
- Compiler messages help identify compilation problems, while testing helps uncover runtime and logic errors.
- Always compare actual results with expected results.
- After correcting an error, retest the program using relevant test data.

## Navigation

- [Previous: Trace Tables](../Trace-Tables/README.md)
- [Next: Debugging and Correcting Errors](../Debugging-and-Correcting-Errors/README.md)
- [Back to Testing and Debugging](../README.md)
- [Back to Grade 10 Java](../../README.md)
