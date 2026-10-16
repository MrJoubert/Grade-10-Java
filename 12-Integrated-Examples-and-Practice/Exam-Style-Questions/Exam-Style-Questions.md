# Exam-Style Questions

## Overview

This section provides exam-style practice questions to help you consolidate your Grade 10 Java programming knowledge in preparation for Information Technology assessments.

The questions combine concepts such as variables, data types, calculations, input and output, String manipulation, Boolean logic, selection, loops, methods, algorithms, testing and debugging.

The purpose is not simply to memorise Java syntax. You should be able to interpret a problem, develop a logical solution, write suitable Java code, predict program output and identify errors.

Attempt each question before consulting the suggested solutions.

## Learning Objectives

By completing these exercises, you should be able to:

- Interpret programming questions and identify their requirements.
- Select appropriate variables and data types.
- Write Java statements that perform calculations.
- Use `JOptionPane` for input and output.
- Apply selection and repetition structures.
- Manipulate Strings and characters.
- Use methods to organise code.
- Trace program execution and predict output.
- Identify syntax, runtime and logic errors.
- Design appropriate test cases.
- Explain the reasoning behind your solutions.

---

## Section A: Variables, Data Types and Calculations

### Question 1: Variable declarations (6 marks)

**1.1** Declare an integer variable named `age` and initialise it to `16`. (2)

**1.2** Declare a `double` variable named `price` and initialise it to `49.95`. (2)

**1.3** Declare a `String` variable named `subject` and initialise it to `"Information Technology"`. (2)

### Question 2: Calculations (8 marks)

A shop sells notebooks for R18.50 each.

Write Java statements to:

**2.1** Declare a `double` variable named `price` and initialise it to `18.50`. (2)

**2.2** Declare an integer variable named `quantity` and initialise it to `4`. (2)

**2.3** Calculate the total cost and store it in a variable named `totalCost`. (2)

**2.4** Display the total cost with an appropriate message. (2)

### Question 3: Operator precedence (6 marks)

Study the following code:

```java
int a = 12;
int b = 4;
int result = a + b * 2;

System.out.println(result);
```

**3.1** State the output. (2)

**3.2** Explain why the calculation produces this result. (2)

**3.3** Rewrite the calculation so that addition occurs before multiplication. (2)

---

## Section B: Input, Output and Type Conversion

### Question 4: Accepting numerical input (8 marks)

Write a Java program that uses `JOptionPane` to ask the user to enter two integers.

The program must:

- Accept both numbers.
- Convert the input into integers.
- Calculate their sum.
- Display the answer using an appropriate message.

(8)

### Question 5: Integer and real-number division (6 marks)

Consider the following statements:

```java
int first = 9;
int second = 2;

System.out.println(first / second);
System.out.println(first % second);
System.out.println(first / 2.0);
```

**5.1** State the output of each statement. (3)

**5.2** Explain the difference between `/` and `%`. (3)

---

## Section C: String and Character Manipulation

### Question 6: String methods (8 marks)

Study the following code:

```java
String word = "Computer";

System.out.println(word.length());
System.out.println(word.toUpperCase());
System.out.println(word.toLowerCase());
```

**6.1** State the output. (3)

**6.2** Explain what the `length()` method does. (2)

**6.3** State whether the original value of `word` changes after calling `toUpperCase()`. Explain your answer. (3)

### Question 7: Comparing Strings (6 marks)

Consider the following code:

```java
String first = "Java";
String second = "JAVA";

System.out.println(first.equals(second));
System.out.println(first.equalsIgnoreCase(second));
```

**7.1** State the output of both statements. (2)

**7.2** Explain the difference between `equals()` and `equalsIgnoreCase()`. (4)

---

## Section D: Boolean Logic and Selection

### Question 8: Boolean expressions (8 marks)

Let:

```java
int age = 17;
boolean registered = true;
```

Determine whether each expression evaluates to `true` or `false`.

**8.1** `age >= 18` (2)

**8.2** `age >= 16 && registered` (2)

**8.3** `age < 16 || registered` (2)

**8.4** `!(age >= 18)` (2)

### Question 9: Selection statements (10 marks)

A Student passes an assessment if the mark is at least 50.

Write a Java program that:

- Stores a mark in an integer variable.
- Checks whether the mark is between 0 and 100 inclusive.
- Displays an appropriate error message if the mark is invalid.
- Otherwise, determines whether the Student has passed or failed.

(10)

---

## Section E: Loops and Algorithms

### Question 10: Predicting loop output (8 marks)

Study the following code:

```java
int total = 0;

for (int number = 1; number <= 4; number++) {
    total = total + number;
}

System.out.println(total);
```

**10.1** State the output. (2)

**10.2** Explain the purpose of the variable `total`. (2)

**10.3** List the value of `total` after each iteration. (4)

### Question 11: Multiplication table (8 marks)

Write a Java program that displays the multiplication table for the number 7, from 1 to 10.

Your output should follow this format:

```text
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
```

Continue until the tenth multiple.

(8)

### Question 12: Finding the largest number (8 marks)

Write a Java program that stores three integer values and determines which is the largest.

Your program must:

- Compare all three values.
- Store the largest value in a variable.
- Display the result.

Assume the three values are not necessarily different.

(8)

---

## Section F: Methods and Modular Programming

### Question 13: Creating a method (8 marks)

Write a Java program containing a `void` method named `displayHeading()`.

The method must display:

```text
GRADE 10 JAVA
==============
```

Call the method twice from `main()`.

(8)

### Question 14: Understanding method execution (6 marks)

Study the following program:

```java
public class MethodTrace {
    public static void main(String[] args) {
        firstMethod();
        System.out.println("Finished");
    }

    public static void firstMethod() {
        System.out.println("First");
        secondMethod();
    }

    public static void secondMethod() {
        System.out.println("Second");
    }
}
```

**14.1** State the output in the correct order. (3)

**14.2** Explain why `"Finished"` is displayed last. (3)

---

## Section G: Testing and Debugging

### Question 15: Identifying errors (9 marks)

For each example, identify the type of error and explain the problem.

**15.1**

```java
int age = 16
System.out.println(age);
```

(3)

**15.2**

```java
int number = 10;
int divisor = 0;

System.out.println(number / divisor);
```

(3)

**15.3**

```java
int length = 5;
int width = 4;

int area = length + width;

System.out.println(area);
```

The program is intended to calculate the area of a rectangle.

(3)

### Question 16: Designing test cases (8 marks)

A program accepts a mark between 0 and 100 inclusive.

Provide four test cases that cover:

- A standard valid value.
- The minimum valid value.
- The maximum valid value.
- An invalid value.

For each test case, state the input and expected behaviour.

(8)

---

## Section H: Integrated Programming Challenge

### Question 17: Student Mark Calculator (20 marks)

Write a Java program that asks a user to enter three assessment marks using `JOptionPane`.

The program must:

1. Obtain three marks from the user. (3)
2. Convert the input values into integers. (3)
3. Check whether each mark is between 0 and 100 inclusive. (4)
4. Calculate the total of the three marks. (2)
5. Calculate the average using a suitable data type. (3)
6. Display the total and average using appropriate messages. (3)
7. Display whether the average is at least 50. (2)

For this question, assume the user enters valid whole-number input. You may extend the solution to handle invalid input.

---

# Suggested Solutions

Attempt the questions before reading this section. The solutions demonstrate one possible approach; other correct solutions may also be accepted.

## Section A: Solutions

### Question 1

```java
int age = 16;
double price = 49.95;
String subject = "Information Technology";
```

Each variable is declared using an appropriate data type and initialised with a value.

### Question 2

```java
double price = 18.50;
int quantity = 4;

double totalCost = price * quantity;

System.out.println("Total cost: R" + totalCost);
```

**Expected result:** R74.0, displayed as part of the output message.

### Question 3

**3.1**

```text
20
```

**3.2** Multiplication has a higher precedence than addition. Java calculates `4 * 2` first and then adds 12.

**3.3**

```java
int result = (a + b) * 2;
```

The brackets ensure that addition occurs first.

## Section B: Solutions

### Question 4

```java
import javax.swing.JOptionPane;

public class AddNumbers {
    public static void main(String[] args) {
        String firstInput = JOptionPane.showInputDialog(
                "Enter the first integer:");

        String secondInput = JOptionPane.showInputDialog(
                "Enter the second integer:");

        int firstNumber = Integer.parseInt(firstInput);
        int secondNumber = Integer.parseInt(secondInput);

        int total = firstNumber + secondNumber;

        JOptionPane.showMessageDialog(
                null, "Total: " + total);
    }
}
```

This solution assumes that both inputs are valid integers and that neither dialog is cancelled.

### Question 5

**5.1**

```text
4
1
4.5
```

**5.2**

- `/` performs division. When both operands are integers, the fractional part is discarded.
- `%` returns the remainder after division.
- `first / 2.0` performs real-number division because one operand is a `double`.

## Section C: Solutions

### Question 6

**6.1**

```text
8
COMPUTER
computer
```

**6.2** `length()` returns the number of characters in a String.

**6.3** No. `toUpperCase()` returns a new String. It does not change the original String stored in `word`.

### Question 7

**7.1**

```text
false
true
```

**7.2**

- `equals()` compares String content and is case-sensitive.
- `equalsIgnoreCase()` compares String content without distinguishing uppercase and lowercase letters.

## Section D: Solutions

### Question 8

| Expression | Result |
|---|---|
| `age >= 18` | `false` |
| `age >= 16 && registered` | `true` |
| `age < 16 || registered` | `true` |
| `!(age >= 18)` | `true` |

### Question 9

```java
int mark = 65;

if (mark < 0 || mark > 100) {
    System.out.println("Invalid mark.");
} else if (mark >= 50) {
    System.out.println("You have passed.");
} else {
    System.out.println("You have failed.");
}
```

The first condition rejects marks outside the permitted range. Only valid marks are then checked against the pass requirement.

## Section E: Solutions

### Question 10

**10.1**

```text
10
```

**10.2** `total` is an accumulator. It stores the running sum.

**10.3**

| Iteration | Number added | Total |
|---|---:|---:|
| 1 | 1 | 1 |
| 2 | 2 | 3 |
| 3 | 3 | 6 |
| 4 | 4 | 10 |

### Question 11

```java
for (int number = 1; number <= 10; number++) {
    System.out.println("7 x " + number + " = " + (7 * number));
}
```

### Question 12

```java
int firstNumber = 15;
int secondNumber = 42;
int thirdNumber = 27;

int largest = firstNumber;

if (secondNumber > largest) {
    largest = secondNumber;
}

if (thirdNumber > largest) {
    largest = thirdNumber;
}

System.out.println("Largest: " + largest);
```

**Output:**

```text
Largest: 42
```

The algorithm begins with the first value and updates `largest` whenever a greater value is found. It also works when some or all values are equal.

## Section F: Solutions

### Question 13

```java
public class HeadingProgram {
    public static void main(String[] args) {
        displayHeading();
        displayHeading();
    }

    public static void displayHeading() {
        System.out.println("GRADE 10 JAVA");
        System.out.println("==============");
    }
}
```

### Question 14

**14.1**

```text
First
Second
Finished
```

**14.2** `main()` calls `firstMethod()`. That method displays `"First"` and then calls `secondMethod()`. Once `secondMethod()` finishes, execution returns to `firstMethod()`, which finishes. Execution then returns to `main()`, where `"Finished"` is displayed.

## Section G: Solutions

### Question 15

**15.1 — Syntax error / compilation error**

The declaration is missing a semicolon after `16`.

**Correction:**

```java
int age = 16;
```

**15.2 — Runtime error**

Integer division by zero causes an `ArithmeticException` when the statement executes.

**Correction:** Check whether `divisor != 0` before performing the division.

**15.3 — Logic error**

The program adds the length and width rather than multiplying them.

**Correction:**

```java
int area = length * width;
```

### Question 16

| Input | Classification | Expected behaviour |
|---:|---|---|
| `65` | Standard | Accept |
| `0` | Minimum boundary | Accept |
| `100` | Maximum boundary | Accept |
| `-1` | Invalid | Reject |

Other valid test cases may be used if they meet the stated requirements.

## Section H: Solution

### Question 17: Student Mark Calculator

```java
import javax.swing.JOptionPane;

public class StudentMarkCalculator {
    public static void main(String[] args) {
        String firstInput = JOptionPane.showInputDialog(
                "Enter the first mark:");

        String secondInput = JOptionPane.showInputDialog(
                "Enter the second mark:");

        String thirdInput = JOptionPane.showInputDialog(
                "Enter the third mark:");

        int mark1 = Integer.parseInt(firstInput);
        int mark2 = Integer.parseInt(secondInput);
        int mark3 = Integer.parseInt(thirdInput);

        if (mark1 < 0 || mark1 > 100
                || mark2 < 0 || mark2 > 100
                || mark3 < 0 || mark3 > 100) {
            JOptionPane.showMessageDialog(
                    null, "Invalid mark. Each mark must be from 0 to 100.");
        } else {
            int total = mark1 + mark2 + mark3;
            double average = total / 3.0;

            String result = "Total: " + total
                    + "\nAverage: " + average;

            if (average >= 50) {
                result = result + "\nResult: Pass";
            } else {
                result = result + "\nResult: Fail";
            }

            JOptionPane.showMessageDialog(null, result);
        }
    }
}
```

This solution validates the range of each mark before calculating the total and average. It assumes that the user enters valid whole-number input and does not cancel a dialog.

---

## Final Revision Checklist

Before completing your Grade 10 Java revision, check that you can:

- [ ] Declare variables using suitable data types.
- [ ] Perform arithmetic calculations correctly.
- [ ] Explain operator precedence and integer division.
- [ ] Accept and convert input using `JOptionPane`.
- [ ] Manipulate and compare Strings.
- [ ] Use relational and logical operators.
- [ ] Write `if`, `if-else` and `switch` statements.
- [ ] Write `for`, `while` and `do-while` loops.
- [ ] Use counters and accumulators.
- [ ] Declare and call methods.
- [ ] Explain parameters, arguments and return values.
- [ ] Develop algorithms for common programming problems.
- [ ] Trace code and predict program output.
- [ ] Distinguish syntax, runtime and logic errors.
- [ ] Design tests using standard, extreme and abnormal data.
- [ ] Correct errors and retest a program.

## Navigation

- [Previous: Algorithm Practice](../Algorithm-Practice/README.md)
- [Back to Integrated Examples and Practice](../README.md)
- [Back to Grade 10 Java](../../README.md)
