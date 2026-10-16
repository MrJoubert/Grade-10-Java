# Debugging and Correcting Errors

## Overview

Debugging is the process of finding, understanding and correcting errors in a computer program. A program may contain syntax errors that prevent compilation, runtime errors that occur during execution, or logic errors that cause incorrect results.

Writing a program is not only about getting the code to compile. You must also ensure that it produces the correct results for different inputs and behaves as expected.

In this topic, you will learn how to approach debugging systematically, interpret error messages, trace problems through your code and test your corrections.

## Learning Objectives

By the end of this topic, you should be able to:

- Explain what debugging means.
- Identify and locate errors in Java programs.
- Interpret common compiler messages and runtime exceptions.
- Use program output to investigate logic errors.
- Correct errors without introducing new problems.
- Retest a program after making corrections.
- Explain why systematic debugging is more effective than changing code randomly.

---

## 1. What Is Debugging?

**Debugging** is the process of identifying, investigating and correcting errors in a program.

The process generally involves four stages:

1. **Identify the problem** – recognise that the program is not behaving as expected.
2. **Locate the cause** – determine which statement, calculation or condition is responsible.
3. **Correct the error** – make the necessary change to the code.
4. **Retest the program** – confirm that the correction works.

For example, suppose a program should calculate the total price of three items costing R20 each.

```java
int price = 20;
int quantity = 3;

int total = price + quantity;

System.out.println("Total: R" + total);
```

The program compiles and runs, but it displays:

```text
Total: R23
```

The expected result is R60. The problem is the calculation: the program uses addition instead of multiplication.

The corrected statement is:

```java
int total = price * quantity;
```

The output is now:

```text
Total: R60
```

This is a logic error. Debugging involves more than correcting code that will not compile; it also involves checking whether the program's results are correct.

## 2. Reading Compiler Error Messages

When Java cannot compile your code, your IDE, such as NetBeans, displays compiler messages.

These messages can help you identify the location and possible cause of a problem.

Consider this example:

```java
int age = 16
System.out.println(age);
```

The first statement is missing a semicolon.

The compiler will report a compilation error, often indicating the line where it detected the problem. The reported line is not always the exact location of the original mistake, because one error can affect how later statements are interpreted.

### How to investigate a compiler error

1. Read the complete error message.
2. Check the line number mentioned in the message.
3. Examine that line and the statement immediately before it.
4. Look for missing punctuation, incorrect spelling or mismatched brackets.
5. Correct the problem and compile again.

**Important:** Do not assume that the line number in an error message always identifies the precise source of the mistake. A missing bracket or semicolon on an earlier line can cause an error to be reported later.

## 3. Debugging Syntax and Compilation Errors

Compilation errors must be corrected before the affected program can execute successfully.

### Example: Incorrect variable name

**Incorrect code:**

```java
int mark = 85;

System.out.println(marks);
```

The variable was declared as `mark`, but the program tries to display `marks`.

Java treats these as two different names. Since `marks` has not been declared, the compiler reports an error.

**Corrected code:**

```java
int mark = 85;

System.out.println(mark);
```

**Output:**

```text
85
```

### A useful debugging checklist

When a program does not compile, check the following:

- Are all statements terminated with semicolons where required?
- Are opening and closing brackets correctly matched?
- Are quotation marks complete?
- Are variable names spelt consistently?
- Have variables been declared before they are used?
- Are data types compatible?
- Have Java keywords been written with the correct capitalisation?

Fix one problem at a time and compile again. This makes it easier to determine whether each correction has worked.

## 4. Debugging Runtime Errors

A runtime error occurs after the program has compiled, when a problem is encountered during execution.

Java often provides an exception name and a message describing the problem.

### Example: Division by zero

```java
int number = 100;
int divisor = 0;

int answer = number / divisor;

System.out.println(answer);
```

The code compiles, but executing the division causes an `ArithmeticException`.

### How to correct the problem

Check whether the divisor is zero before performing the calculation.

```java
int number = 100;
int divisor = 0;

if (divisor != 0) {
    int answer = number / divisor;
    System.out.println("Answer: " + answer);
} else {
    System.out.println("Error: The divisor cannot be zero.");
}
```

**Output:**

```text
Error: The divisor cannot be zero.
```

The corrected program checks the value before attempting the operation.

### Investigating runtime exceptions

When a program stops unexpectedly:

1. Read the exception name and message.
2. Find the relevant statement in your code.
3. Determine which input or value caused the problem.
4. Check whether the operation is valid for that value.
5. Correct the cause or handle the situation appropriately.
6. Run the program again with both valid and problematic inputs.

For example, a `NumberFormatException` can occur when `Integer.parseInt()` receives text that does not represent a valid integer.

## 5. Debugging Logic Errors

Logic errors can be more difficult to find because the program may compile and run without displaying any error message.

You must compare the program's actual behaviour with the expected behaviour.

### Example: Incorrect average

Suppose a program calculates the average of three marks.

**Incorrect code:**

```java
int mark1 = 70;
int mark2 = 80;
int mark3 = 90;

int average = mark1 + mark2 + mark3 / 3;

System.out.println("Average: " + average);
```

The intended calculation is:

\[
\text{Average}=\frac{\text{mark1}+\text{mark2}+\text{mark3}}{3}
\]

However, Java performs division before addition because division has higher precedence than addition.

The program calculates:

\[
70+80+\frac{90}{3}=180
\]

**Actual output:**

```text
Average: 180
```

The result is incorrect because the calculation was not grouped properly.

### Corrected code

```java
int mark1 = 70;
int mark2 = 80;
int mark3 = 90;

int average = (mark1 + mark2 + mark3) / 3;

System.out.println("Average: " + average);
```

**Output:**

```text
Average: 80
```

The brackets ensure that the three marks are added before the division takes place.

### Questions to ask when investigating a logic error

- Does the program follow the requirements?
- Is the correct formula being used?
- Are the operators correct?
- Are brackets needed to control the order of calculations?
- Are the conditions correct?
- Are variables being updated correctly?
- Does the result make sense for the input values?

## 6. Using Output to Find Errors

Displaying intermediate values can help you identify where a calculation or algorithm goes wrong.

Consider the following program:

```java
int number = 5;
int result = number * 2 + 3;

System.out.println("Number: " + number);
System.out.println("Result: " + result);
```

**Output:**

```text
Number: 5
Result: 13
```

If the intended formula was to multiply the number by the sum of 2 and 3, the expected result would be 25.

You can correct the calculation by adding brackets:

```java
int result = number * (2 + 3);
```

You can also temporarily display intermediate values while investigating a more complicated problem.

For example:

```java
int price = 25;
int quantity = 4;

int total = price * quantity;

System.out.println("Price: " + price);
System.out.println("Quantity: " + quantity);
System.out.println("Calculated total: " + total);
```

These additional messages help you verify the values used in the calculation.

Once debugging is complete, remove unnecessary diagnostic output or replace it with appropriate user-facing messages.

## 7. Debugging in NetBeans

When working in NetBeans, use the following process:

1. Open the Java project and the class containing the problem.
2. Review any red underlines or error indicators in the editor.
3. Compile or run the program to view the error messages.
4. Double-check the indicated line and surrounding code.
5. Correct the identified problem.
6. Run the program again.
7. Test different inputs and compare the results with your expected answers.

NetBeans may identify some errors while you type, before you attempt to run the program. However, it cannot automatically determine whether every calculation or algorithm is logically correct.

You remain responsible for testing the program's behaviour.

## 8. Correcting Errors Without Creating New Ones

A correction should solve the original problem without introducing another error.

Follow these good practices:

- Change only what is necessary.
- Understand the cause of the error before changing the code.
- Avoid making several unrelated changes at once.
- Compile after correcting compilation errors.
- Test the exact input that originally caused the problem.
- Test other relevant inputs to check that the correction works in different situations.
- Keep your code readable and use meaningful variable names.

For example, if a program calculates the wrong average, changing the variable names will not solve the problem. You must identify and correct the calculation itself.

## 9. Practical Challenge

The following program is intended to calculate a Student's percentage from a mark obtained out of 50.

```java
int mark = 40;
int totalMarks = 50;

int percentage = mark / totalMarks * 100;

System.out.println("Percentage: " + percentage + "%");
```

### Your tasks

1. Predict the output before running the program.
2. Run the program and record the actual output.
3. Explain why the result is incorrect.
4. Identify the type of error.
5. Correct the calculation.
6. Run the corrected program and compare the actual result with the expected result.
7. Test the program with a mark of 35 out of 50.

**Extension:** Modify the program to calculate the percentage using `double` values so that results can include decimal places where necessary.

## 10. Key Takeaways

- Debugging is the systematic process of finding, correcting and testing errors.
- Compiler messages help you investigate syntax and other compilation errors.
- Runtime exceptions provide information about problems that occur during execution.
- Logic errors require you to compare actual results with expected results.
- Displaying intermediate values can help identify incorrect calculations.
- Correcting an error is only part of the process; you must also retest the program.
- A program that compiles successfully is not necessarily a correct program.

## Navigation

- [Previous: Syntax, Runtime and Logic Errors](../Syntax-Runtime-and-Logic-Errors/README.md)
- [Next: Robustness Testing](../Robustness-Testing/README.md)
- [Back to Testing and Debugging](../README.md)
- [Back to Grade 10 Java](../../README.md)
