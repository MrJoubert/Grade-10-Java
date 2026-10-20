# Pseudocode

## Overview

Pseudocode is a way of describing an algorithm using simple, structured language without following the exact syntax of a programming language.

It allows you to plan a solution before writing Java code. Instead of worrying about semicolons, curly brackets and Java-specific keywords, you can focus on the logical steps required to solve the problem.

Pseudocode is especially useful when analysing examination questions, designing algorithms, tracing program logic and translating a planned solution into Java.

**The main purpose of pseudocode is to describe clearly what a program must do and in what order.**

---

## Learning Objectives

By the end of this topic, you should be able to:

- Define pseudocode and explain its purpose.
- Distinguish between pseudocode and Java source code.
- Write algorithms using clear, structured instructions.
- Represent input, processing and output.
- Represent selection using `IF`, `ELSE` and `ENDIF`.
- Represent repetition using loops.
- Use meaningful variable names in pseudocode.
- Translate pseudocode into Java.
- Trace pseudocode to determine its expected output.
- Identify and correct logical errors in an algorithm.

---

## 1. What Is Pseudocode?

Pseudocode is an informal way of expressing an algorithm using a mixture of ordinary language and programming-style instructions.

It describes the steps needed to solve a problem without requiring the exact syntax of Java.

Consider a program that calculates the total cost of an order.

### Pseudocode

```text
START
    INPUT price
    INPUT quantity
    total = price * quantity
    OUTPUT total
STOP
```

This algorithm describes four important actions:

1. Obtain the price.
2. Obtain the quantity.
3. Multiply the two values.
4. Display the total.

The same algorithm can be implemented in Java, but the Java version must follow Java's syntax rules.

### Why use pseudocode?

- It allows you to plan before coding.
- It helps you focus on logic rather than syntax.
- It makes an algorithm easier to understand.
- It helps identify missing steps.
- It makes it easier to translate a solution into Java.
- It can be used to trace an algorithm without running a program.

---

## 2. Pseudocode Versus Java

Pseudocode and Java serve different purposes.

| Pseudocode | Java |
|---|---|
| Describes an algorithm. | Implements an algorithm in a programming language. |
| Uses simplified, structured instructions. | Follows strict syntax rules. |
| Does not require semicolons or Java-specific declarations. | Requires correct Java syntax. |
| Can be written without choosing every implementation detail. | Requires suitable variables, data types and statements. |
| Cannot normally be compiled and executed directly. | Can be compiled and executed when the program is valid. |

Consider the following example.

### Pseudocode

```text
START
    INPUT age
    OUTPUT age
STOP
```

### Java

```java
import javax.swing.JOptionPane;

public class AgeDisplay
{
    public static void main(String[] args)
    {
        int age;

        age = Integer.parseInt(
            JOptionPane.showInputDialog("Enter your age:")
        );

        JOptionPane.showMessageDialog(
            null,
            "Age: " + age
        );
    }
}
```

Both describe obtaining and displaying an age, but Java requires the additional syntax needed to create and execute a program.

---

## 3. Basic Pseudocode Instructions

Most Grade 10 algorithms can be expressed using a few fundamental instructions.

### 3.1 START and STOP

These indicate the beginning and end of an algorithm.

```text
START
    OUTPUT "Welcome"
STOP
```

### 3.2 INPUT

`INPUT` indicates that information must be obtained.

```text
INPUT name
INPUT mark
```

The algorithm requires a name and a mark before it can continue with any processing that depends on those values.

### 3.3 Assignment

Assignment stores a value in a variable.

```text
total = price * quantity
```

This calculates the product of `price` and `quantity` and assigns the result to `total`.

Assignment is different from comparing two values. In pseudocode, the exact notation may vary according to the convention being used.

### 3.4 OUTPUT

`OUTPUT` indicates that a value or message must be displayed.

```text
OUTPUT total
OUTPUT "Calculation complete"
```

### 3.5 Comments

Comments explain the purpose of an instruction or section of an algorithm.

```text
// Calculate the total cost
total = price * quantity
```

Comments are useful when the purpose of an instruction may not be immediately obvious.

---

## 4. Writing a Simple Algorithm

Consider the following problem:

A program must obtain two numbers, calculate their sum and display the answer.

### Step 1: Identify the inputs

- First number.
- Second number.

### Step 2: Identify the processing

Add the two numbers.

\[
\text{Sum}=\text{Number 1}+\text{Number 2}
\]

### Step 3: Identify the output

Display the sum.

### Step 4: Write the pseudocode

```text
START
    INPUT number1
    INPUT number2

    sum = number1 + number2

    OUTPUT sum
STOP
```

### Step 5: Trace the algorithm

Suppose the user supplies `12` and `8`.

| Instruction | Value |
|---|---|
| `INPUT number1` | `number1 = 12` |
| `INPUT number2` | `number2 = 8` |
| `sum = number1 + number2` | `sum = 20` |
| `OUTPUT sum` | Displays `20` |

Tracing confirms that the algorithm produces the expected result.

---

## 5. Selection in Pseudocode

Selection allows an algorithm to choose between different actions based on a condition.

In Java, selection is commonly implemented using `if`, `if-else` or `switch` statements.

In pseudocode, you can represent a decision using `IF`, `THEN`, `ELSE` and `ENDIF`.

### Example: Checking whether a student passed

```text
START
    INPUT mark

    IF mark >= 50 THEN
        OUTPUT "Pass"
    ELSE
        OUTPUT "Not yet passed"
    ENDIF

STOP
```

The algorithm checks whether the mark is at least 50.

- If the condition is true, it outputs `Pass`.
- Otherwise, it outputs `Not yet passed`.

### Equivalent Java code

```java
import javax.swing.JOptionPane;

public class PassChecker
{
    public static void main(String[] args)
    {
        int mark;

        mark = Integer.parseInt(
            JOptionPane.showInputDialog("Enter the mark:")
        );

        if (mark >= 50)
        {
            JOptionPane.showMessageDialog(
                null,
                "Pass"
            );
        }
        else
        {
            JOptionPane.showMessageDialog(
                null,
                "Not yet passed"
            );
        }
    }
}
```

The Java code implements the same decision described by the pseudocode.

---

## 6. Repetition in Pseudocode

Repetition allows an algorithm to perform instructions multiple times.

Loops are useful when a task must be repeated, such as displaying a sequence of numbers or processing several values.

### Example: Display the numbers from 1 to 5

One way to represent a count-controlled loop in pseudocode is:

```text
START
    FOR count = 1 TO 5
        OUTPUT count
    ENDFOR
STOP
```

**Expected output:**

```text
1
2
3
4
5
```

### Equivalent Java code

```java
public class NumberSequence
{
    public static void main(String[] args)
    {
        for (int count = 1; count <= 5; count++)
        {
            System.out.println(count);
        }
    }
}
```

The pseudocode describes the algorithm, while the Java code implements it using a `for` loop.

### Important consideration

Pseudocode conventions can differ between textbooks, schools and examination documents. When working on an assessment, use the notation and conventions specified by your teacher or the relevant examination instructions.

---

## 7. Pseudocode for Calculations

Pseudocode is useful for planning mathematical algorithms.

Consider a program that calculates the average of three marks.

### Algorithm

1. Obtain the three marks.
2. Calculate their total.
3. Divide the total by three.
4. Display the average.

### Pseudocode

```text
START
    INPUT mark1
    INPUT mark2
    INPUT mark3

    total = mark1 + mark2 + mark3
    average = total / 3

    OUTPUT average
STOP
```

### Equivalent Java code

```java
import javax.swing.JOptionPane;

public class AverageCalculator
{
    public static void main(String[] args)
    {
        double mark1;
        double mark2;
        double mark3;
        double total;
        double average;

        mark1 = Double.parseDouble(
            JOptionPane.showInputDialog("Enter mark 1:")
        );

        mark2 = Double.parseDouble(
            JOptionPane.showInputDialog("Enter mark 2:")
        );

        mark3 = Double.parseDouble(
            JOptionPane.showInputDialog("Enter mark 3:")
        );

        total = mark1 + mark2 + mark3;
        average = total / 3.0;

        JOptionPane.showMessageDialog(
            null,
            "Average: " + average
        );
    }
}
```

Using `3.0` in the Java calculation ensures that the division is performed using a decimal value.

When translating pseudocode into Java, always consider the data types and arithmetic behaviour of the language.

---

## 8. Using Meaningful Variable Names

Variable names in pseudocode should explain what the values represent.

Compare the following examples.

**Less descriptive:**

```text
a = b * c
```

**More descriptive:**

```text
totalCost = price * quantity
```

The second version makes the purpose of each variable clearer.

Meaningful names help you:

- Understand the algorithm.
- Trace values more easily.
- Identify mistakes.
- Translate the algorithm into Java.
- Explain your solution to another person.

Use names that describe the information being stored or the purpose of the calculation.

---

## 9. Translating Pseudocode into Java

When converting pseudocode into Java, follow a systematic process.

### Example problem

A program must request a number and display whether it is positive or not positive.

### Step 1: Write the pseudocode

```text
START
    INPUT number

    IF number > 0 THEN
        OUTPUT "Positive"
    ELSE
        OUTPUT "Not positive"
    ENDIF

STOP
```

### Step 2: Identify the required variable

The number may be positive, negative or zero. An `int` is suitable if only whole numbers are required.

### Step 3: Convert input

Java's `JOptionPane.showInputDialog()` returns text. Use `Integer.parseInt()` to convert the input into an integer.

### Step 4: Implement the decision

Use an `if-else` statement with the condition `number > 0`.

### Step 5: Display the output

Use `JOptionPane.showMessageDialog()`.

### Complete Java program

```java
import javax.swing.JOptionPane;

public class PositiveNumberChecker
{
    public static void main(String[] args)
    {
        int number;
        String message;

        number = Integer.parseInt(
            JOptionPane.showInputDialog("Enter a whole number:")
        );

        if (number > 0)
        {
            message = "Positive";
        }
        else
        {
            message = "Not positive";
        }

        JOptionPane.showMessageDialog(
            null,
            message
        );
    }
}
```

The Java program follows the sequence described in the pseudocode.

---

## 10. Tracing Pseudocode

Tracing means following an algorithm instruction by instruction to determine how variable values change and what output is produced.

Consider this pseudocode:

```text
START
    number = 4
    number = number + 3
    number = number * 2
    OUTPUT number
STOP
```

Follow the changes in `number`.

| Instruction | Value of `number` |
|---|---:|
| `number = 4` | 4 |
| `number = number + 3` | 7 |
| `number = number * 2` | 14 |
| `OUTPUT number` | Displays 14 |

The final output is `14`.

### Why is tracing useful?

- It helps you understand how an algorithm works.
- It allows you to predict output without executing the program.
- It helps identify logical errors.
- It prepares you for examination questions involving trace tables.
- It helps verify that the algorithm follows the intended sequence.

---

## 11. Common Mistakes

| Mistake | Why it is a problem | How to improve |
|---|---|---|
| Writing pseudocode using complete Java syntax | The focus shifts from algorithm design to programming syntax. | Use clear, structured instructions. |
| Omitting an input | The algorithm may use a value that has never been obtained. | Check the required inputs before writing the algorithm. |
| Performing calculations in the wrong order | The result may be incorrect. | Plan the processing steps carefully. |
| Forgetting the output | The algorithm may not communicate the required result. | Check the output requirements. |
| Using unclear variable names | The purpose of values becomes difficult to understand. | Choose descriptive names. |
| Writing a condition that does not match the problem | The wrong branch may be executed. | Check comparison operators and boundary values. |
| Assuming all pseudocode conventions are identical | Different conventions may use different notation. | Follow the conventions specified in your assessment. |

---

## 12. Practical Challenge

Create a pseudocode algorithm for a program that calculates the final price of a purchase.

The program must:

1. Obtain the original price.
2. Obtain the quantity purchased.
3. Calculate the total before a discount.
4. Apply a 10% discount if the total exceeds R500.
5. Calculate the final price.
6. Display the original total, discount and final price.

### Your tasks

- Write the complete pseudocode algorithm.
- Identify all variables needed.
- Use selection to decide whether the discount applies.
- Trace the algorithm using a total below R500.
- Trace the algorithm using a total exactly equal to R500.
- Trace the algorithm using a total above R500.
- Translate your pseudocode into a Java program using `JOptionPane`.

### Extension challenge

Add a condition that displays a warning if the quantity entered is zero or negative.

Decide where the validation should occur in the algorithm so that an invalid quantity is not used to calculate the final price.

---

## 13. Key Takeaways

- Pseudocode describes an algorithm using simplified, structured instructions.
- It helps you plan a solution before writing Java code.
- `INPUT`, assignment and `OUTPUT` represent common algorithmic actions.
- `IF` and `ELSE` represent decisions.
- Repetition can be represented using loop structures.
- Meaningful variable names make algorithms easier to understand.
- Tracing helps you determine how values change during execution.
- Java implements the logic described by pseudocode using the language's syntax.
- Follow the pseudocode conventions required by your teacher or assessment.

---

## Navigation

- **Previous topic:** [Input, Processing and Output](../Input-Processing-Output/README.md)
- **Next topic:** [Flowcharts](../Flowcharts/README.md)
- **Back to Algorithms and Problem-Solving:** [Main Topic README](../README.md)
- **Back to Grade 10 Java:** [Grade 10 Java README](../../README.md)
