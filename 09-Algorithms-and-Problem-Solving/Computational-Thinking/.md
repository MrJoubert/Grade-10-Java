# Computational Thinking

## Overview

Computational thinking is a problem-solving approach used to understand problems, break them into manageable parts and develop logical solutions that a computer can follow.

Before writing Java code, you need to understand what the problem requires. You must identify the information available, determine what processing is needed and decide what output the program should produce.

Computational thinking helps you plan a solution before you begin programming. It also makes it easier to identify errors, test your solution and improve your algorithms.

In Grade 10 Information Technology, computational thinking forms an important foundation for algorithm design and Java programming.

---

## Learning Objectives

By the end of this topic, you should be able to:

- Explain what computational thinking means.
- Identify the problem that needs to be solved.
- Break a complex problem into smaller tasks.
- Recognise patterns in problems and their solutions.
- Identify relevant information and ignore unnecessary details.
- Develop a logical sequence of instructions.
- Identify inputs, processing and outputs.
- Translate a planned solution into pseudocode and Java code.
- Evaluate whether an algorithm solves the original problem.

---

## 1. What Is Computational Thinking?

Computational thinking is a structured way of solving problems by developing solutions that can be expressed as clear, logical instructions.

It does not mean that you must immediately start writing Java code. Instead, you first work out what needs to happen and how the problem can be solved.

For example, suppose you need to write a program that calculates the average of two test marks.

Before writing code, consider the following questions:

1. What information must the program receive?
2. What calculation must be performed?
3. What result must the program display?
4. What happens if the user enters an invalid mark?
5. How can you test whether the answer is correct?

These questions help you understand the problem before implementing a solution.

### A simple problem-solving process

1. Understand the problem.
2. Identify the inputs and required outputs.
3. Break the problem into smaller tasks.
4. Develop a logical algorithm.
5. Represent the algorithm using pseudocode or a flowchart.
6. Write the Java program.
7. Test and debug the program.
8. Evaluate the solution.

This process helps you avoid writing code before you know exactly what the program must accomplish.

---

## 2. The Four Main Ideas of Computational Thinking

Computational thinking is commonly explained using four related concepts.

### 2.1 Decomposition

**Decomposition** means breaking a large problem into smaller, more manageable parts.

Imagine that you need to create a program that calculates and displays a student's result.

The complete problem could be divided into these smaller tasks:

1. Request the student's name.
2. Request the test mark.
3. Request the examination mark.
4. Calculate the average.
5. Determine whether the student passed.
6. Display the result.

Each task is easier to understand and implement than the entire problem at once.

### 2.2 Pattern recognition

**Pattern recognition** means identifying similarities or repeated structures in problems.

For example, calculating the total cost of several products follows the same pattern:

\[
\text{Total cost}=\text{Price}\times\text{Quantity}
\]

The calculation remains the same even when the price and quantity change.

Recognising this pattern allows you to create one reusable method instead of writing a separate calculation for every product.

### 2.3 Abstraction

**Abstraction** means focusing on the information that matters for solving a problem while ignoring irrelevant details.

Suppose you need to calculate the average of two marks.

The student's name, favourite colour and home address are not required for the calculation itself. The two marks are the important values.

By concentrating on the relevant information, you can simplify the problem and avoid unnecessary complexity.

### 2.4 Algorithm design

**Algorithm design** means developing a clear sequence of instructions that solves a problem.

For the average-mark problem, the algorithm could be:

1. Obtain the first mark.
2. Obtain the second mark.
3. Add the marks.
4. Divide the total by two.
5. Display the average.

The algorithm can then be represented using pseudocode, a flowchart or Java code.

---

## 3. Applying Computational Thinking to a Problem

Consider the following problem:

A shop needs a program that calculates the total cost of a customer's purchase. The program must request the price of an item and the quantity purchased, calculate the total and display the answer.

### Step 1: Understand the problem

The program must calculate how much the customer needs to pay.

### Step 2: Identify the inputs

The program requires:

- The price of one item.
- The number of items purchased.

### Step 3: Identify the processing

The total cost is calculated by multiplying the price by the quantity.

\[
\text{Total}=\text{Price}\times\text{Quantity}
\]

### Step 4: Identify the output

The program must display the total cost.

### Step 5: Design the algorithm

The instructions must follow a logical order:

1. Request the price.
2. Request the quantity.
3. Calculate the total.
4. Display the total.

### Step 6: Implement the solution in Java

```java
import javax.swing.JOptionPane;

public class ShopCalculator
{
    public static void main(String[] args)
    {
        double price;
        int quantity;
        double total;

        price = Double.parseDouble(
            JOptionPane.showInputDialog("Enter the price per item:")
        );

        quantity = Integer.parseInt(
            JOptionPane.showInputDialog("Enter the quantity:")
        );

        total = price * quantity;

        JOptionPane.showMessageDialog(
            null,
            "Total cost: R" + total
        );
    }
}
```

### Example

Suppose the user enters:

- Price per item: `25.50`
- Quantity: `4`

The calculation is:

\[
25.50\times4=102.00
\]

The program displays:

```text
Total cost: R102.0
```

This example demonstrates how computational thinking helps you move from a written problem to a working Java solution.

---

## 4. Inputs, Processing and Outputs

A useful way to analyse a programming problem is to identify its inputs, processing and outputs.

These three elements are often abbreviated as **IPO**.

| Element | Meaning | Shop calculator example |
|---|---|---|
| Input | Information supplied to the program | Price and quantity |
| Processing | Calculations or decisions performed | Multiply price by quantity |
| Output | Information produced by the program | Total cost |

### Why is IPO useful?

Identifying inputs, processing and outputs helps you determine exactly what your program must do.

It also helps you identify missing steps before you begin coding.

For example, if you know the required output is the total cost but have not identified the price and quantity as inputs, your problem analysis is incomplete.

### Practice example

A program must calculate the area of a rectangle.

Identify the three IPO elements.

**Input:**
- Length.
- Width.

**Processing:**

\[
\text{Area}=\text{Length}\times\text{Width}
\]

**Output:**
- The calculated area.

This approach can be applied to many Grade 10 programming problems.

---

## 5. Breaking a Problem into Smaller Tasks

When a problem appears complicated, do not attempt to solve everything at once.

Instead, divide it into smaller tasks that can be completed and tested individually.

Consider a program that calculates a student's average and displays a message based on the result.

The problem can be decomposed as follows:

| Task | Description |
|---|---|
| 1. Obtain information | Request two marks. |
| 2. Calculate | Determine the average. |
| 3. Make a decision | Check whether the average is at least 50%. |
| 4. Display | Show the average and the appropriate message. |

Each task corresponds to a familiar programming concept.

- Input uses `JOptionPane`.
- Calculation uses arithmetic operators.
- Decision-making uses an `if` statement.
- Output uses `JOptionPane`.

This makes it easier to combine concepts that you have already learnt.

### Example Java implementation

```java
import javax.swing.JOptionPane;

public class StudentAverage
{
    public static void main(String[] args)
    {
        double mark1;
        double mark2;
        double average;
        String message;

        mark1 = Double.parseDouble(
            JOptionPane.showInputDialog("Enter the first mark:")
        );

        mark2 = Double.parseDouble(
            JOptionPane.showInputDialog("Enter the second mark:")
        );

        average = (mark1 + mark2) / 2;

        if (average >= 50)
        {
            message = "Pass";
        }
        else
        {
            message = "Not yet passed";
        }

        JOptionPane.showMessageDialog(
            null,
            "Average: " + average + "\n" + message
        );
    }
}
```

This program combines input, calculations, selection and output to solve a problem.

---

## 6. Identifying Patterns

Recognising patterns allows you to use an existing solution for similar problems.

Consider these calculations:

- Total cost: price multiplied by quantity.
- Distance travelled: speed multiplied by time.
- Rectangle area: length multiplied by width.

Although the calculations solve different problems, each uses multiplication.

Recognising this common operation can help you understand how arithmetic instructions are reused in different algorithms.

Another example is calculating the average of several marks. Each mark contributes to a total, and the total is divided by the number of marks.

The general pattern is:

\[
\text{Average}=\frac{\text{Sum of values}}{\text{Number of values}}
\]

Understanding the pattern helps you design solutions for different sets of data.

**Important:** Pattern recognition does not mean that every problem can use exactly the same algorithm. You must still check the requirements of each problem.

---

## 7. Applying Abstraction

Abstraction helps you simplify a problem by concentrating on what is necessary.

Imagine that you are developing a program to calculate the cost of a cinema ticket.

The cinema may have many details, including its location, seating arrangement, screen size and snack menu.

However, if the program only needs to calculate a ticket price based on age, most of those details are irrelevant.

You might only need:

- The customer's age.
- The ticket price for the relevant age group.

The program can then focus on the calculation or decision that determines the ticket price.

### Questions to ask when applying abstraction

- Which information is required to solve the problem?
- Which information can be ignored?
- Which calculations or decisions are necessary?
- What is the simplest solution that satisfies the requirements?

Abstraction prevents you from making a program unnecessarily complicated.

---

## 8. Designing an Algorithm Before Coding

An algorithm is a logical sequence of instructions used to solve a problem.

Before writing Java code, you can express the algorithm in pseudocode.

Consider a program that calculates the area of a rectangle.

### Pseudocode

```text
START
    INPUT length
    INPUT width
    area = length * width
    OUTPUT area
STOP
```

This pseudocode describes the required steps without using Java-specific syntax.

### Translating the algorithm into Java

```java
import javax.swing.JOptionPane;

public class RectangleArea
{
    public static void main(String[] args)
    {
        double length;
        double width;
        double area;

        length = Double.parseDouble(
            JOptionPane.showInputDialog("Enter the length:")
        );

        width = Double.parseDouble(
            JOptionPane.showInputDialog("Enter the width:")
        );

        area = length * width;

        JOptionPane.showMessageDialog(
            null,
            "Area: " + area
        );
    }
}
```

The Java program follows the same sequence as the pseudocode.

This demonstrates why planning is important: once the algorithm is correct, translating it into code becomes easier.

---

## 9. Evaluating a Solution

A solution must do more than compile. It must solve the original problem correctly.

When evaluating an algorithm or program, consider the following questions:

- Does it meet every requirement?
- Does it obtain all the necessary inputs?
- Are the calculations correct?
- Are the instructions in the correct order?
- Does it produce the required output?
- Does it handle appropriate test cases?
- Can the solution be simplified or made easier to understand?

For example, a shop calculator that multiplies the price by the quantity but never displays the total is incomplete.

Likewise, a program that displays a total but multiplies the wrong variables does not solve the problem correctly.

**Remember:** A program that compiles successfully can still contain logical errors.

---

## 10. Common Mistakes

| Mistake | Why it is a problem | How to improve |
|---|---|---|
| Starting to code without understanding the problem | Important requirements may be missed. | Identify the inputs, processing and outputs first. |
| Trying to solve everything at once | Complex problems become difficult to manage. | Break the problem into smaller tasks. |
| Including irrelevant information | The solution becomes unnecessarily complicated. | Apply abstraction and focus on what matters. |
| Rewriting repeated instructions | Duplicated code is harder to maintain. | Look for patterns and reusable methods. |
| Writing instructions in the wrong order | The algorithm may produce an incorrect result. | Plan and trace the sequence before coding. |
| Assuming that successful compilation proves correctness | Logical errors may remain. | Test the program using suitable test data. |

---

## 11. Practical Challenge

Create a Java program called `ElectricityCalculator`.

A household wants to calculate the cost of its electricity usage.

The program must request:

- The number of electricity units consumed.
- The cost per unit.

It must calculate and display the total cost.

### Requirements

1. Identify the inputs, processing and outputs before writing code.
2. Write the algorithm using pseudocode.
3. Identify which variables are needed.
4. Implement the program using Java and `JOptionPane`.
5. Use meaningful variable names.
6. Test the program with at least three different sets of values.
7. Check each expected result manually.

### Extension challenge

Modify the program so that it displays a warning if the total electricity cost exceeds R1,000.

Before writing the additional code, identify the condition that must be tested and the message that should be displayed.

---

## 12. Key Takeaways

- Computational thinking is a structured approach to solving problems.
- Decomposition breaks a problem into smaller tasks.
- Pattern recognition identifies similarities between problems.
- Abstraction focuses on relevant information and ignores unnecessary details.
- Algorithm design develops a logical sequence of instructions.
- IPO analysis identifies inputs, processing and outputs.
- Pseudocode helps you plan a solution before writing Java code.
- Java implements the planned algorithm.
- Testing and evaluation help determine whether a solution works correctly.
- Understanding the problem before coding makes programming more manageable.

---

## Navigation

- **Next topic:** [Problem Decomposition](../Problem-Decomposition/README.md)
- **Back to Algorithms and Problem-Solving:** [Main Topic README](../README.md)
- **Back to Grade 10 Java:** [Grade 10 Java README](../../README.md)
