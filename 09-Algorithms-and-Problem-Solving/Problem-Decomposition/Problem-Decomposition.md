# Problem Decomposition

## Overview

Problem decomposition is the process of breaking a complex problem into smaller, more manageable tasks.

When developing a Java program, it is often difficult to solve the entire problem at once. By dividing the problem into smaller parts, you can focus on one task at a time, develop a solution for each part and combine the solutions into a complete program.

Problem decomposition is an important part of computational thinking. It helps you plan algorithms, organise your Java code, identify reusable methods and test your program more effectively.

**The main idea:** Instead of trying to solve one large problem all at once, solve a series of smaller problems that together solve the original problem.

---

## Learning Objectives

By the end of this topic, you should be able to:

- Define problem decomposition.
- Explain why complex problems should be divided into smaller tasks.
- Identify the main tasks required to solve a programming problem.
- Break a problem into logical steps.
- Identify the inputs, processing and outputs of individual tasks.
- Represent a decomposed solution using pseudocode.
- Use methods to implement separate tasks in Java.
- Explain how decomposition improves testing, debugging and code reuse.

---

## 1. What Is Problem Decomposition?

Problem decomposition means dividing a large problem into smaller parts that are easier to understand and solve.

Consider the following problem:

A school needs a program that accepts a student's name and three test marks, calculates the average, determines whether the student has passed and displays a report.

Trying to write the entire program immediately may feel overwhelming.

Instead, break the problem into smaller tasks:

1. Request the student's name.
2. Obtain the three test marks.
3. Calculate the average.
4. Determine whether the student has passed.
5. Display the student's information and result.

Each task has a clear purpose and contributes to the complete solution.

### Why is decomposition useful?

- It makes complex problems easier to understand.
- It helps you identify what the program must do.
- It allows you to focus on one task at a time.
- It makes algorithms easier to design.
- It helps you identify where errors occur.
- It can make methods easier to reuse.
- It makes the final program easier to read and maintain.

---

## 2. Identifying the Main Tasks

Before writing Java code, read the problem carefully and identify the actions the program must perform.

For example:

> A shop requires a program that asks for the price of an item and the quantity purchased. It must calculate the total cost, apply a 10% discount if the total exceeds R500 and display the final amount.

The main tasks are:

| Task | Description |
|---|---|
| 1. Input | Obtain the price and quantity. |
| 2. Calculation | Calculate the total before the discount. |
| 3. Decision | Determine whether the total exceeds R500. |
| 4. Calculation | Calculate and subtract the discount when applicable. |
| 5. Output | Display the final amount. |

Notice that the problem contains both calculations and a decision. Separating these tasks makes the solution easier to plan.

### Important principle

Every decomposed task should contribute to solving the original problem.

Do not create unnecessary tasks that make the solution more complicated without adding value.

---

## 3. Breaking a Problem into Smaller Steps

Let's consider another example.

**Problem:** Write a program that calculates the area of a rectangle and displays whether the area is greater than 100 square units.

### Step 1: Identify the required information

The program needs the rectangle's length and width.

### Step 2: Identify the calculation

The area is calculated using:

\[
\text{Area}=\text{Length}\times\text{Width}
\]

### Step 3: Identify the decision

The program must check whether the calculated area is greater than 100.

### Step 4: Identify the output

The program must display the area and an appropriate message.

### Decomposed solution

1. Request the length.
2. Request the width.
3. Calculate the area.
4. Check whether the area is greater than 100.
5. Display the area.
6. Display the appropriate message.

This gives you a clear plan before you begin programming.

---

## 4. Representing Decomposition Using IPO

You can use the Input-Processing-Output (IPO) approach to analyse individual tasks.

For the rectangle problem:

| Element | Description |
|---|---|
| Input | Length and width |
| Processing | Calculate the area and compare it with 100 |
| Output | Area and a message indicating whether it exceeds 100 |

For a more complex problem, you can identify the IPO elements for each task separately.

For example, the decision task has:

- **Input:** The calculated area.
- **Processing:** Check whether `area > 100`.
- **Output:** A Boolean result that determines which message to display.

Breaking down the problem this way helps you understand how the different parts work together.

---

## 5. Writing Pseudocode for a Decomposed Problem

Pseudocode allows you to describe the solution without worrying about Java syntax.

For the rectangle problem, the pseudocode could be:

```text
START

    INPUT length
    INPUT width

    area = length * width

    IF area > 100 THEN
        message = "Area exceeds 100"
    ELSE
        message = "Area is 100 or less"
    ENDIF

    OUTPUT area
    OUTPUT message

STOP
```

The pseudocode follows the decomposed tasks in a logical order.

Before converting it into Java, check that:

- All required inputs are obtained.
- The calculation is correct.
- The decision uses the correct condition.
- The required output is produced.

---

## 6. Implementing the Solution in Java

The following Java program implements the rectangle problem.

```java
import javax.swing.JOptionPane;

public class RectangleAnalysis
{
    public static void main(String[] args)
    {
        double length;
        double width;
        double area;
        String message;

        length = Double.parseDouble(
            JOptionPane.showInputDialog("Enter the length:")
        );

        width = Double.parseDouble(
            JOptionPane.showInputDialog("Enter the width:")
        );

        area = length * width;

        if (area > 100)
        {
            message = "Area exceeds 100";
        }
        else
        {
            message = "Area is 100 or less";
        }

        JOptionPane.showMessageDialog(
            null,
            "Area: " + area + "\n" + message
        );
    }
}
```

### Example

Suppose the user enters:

- Length: `12`
- Width: `10`

The program calculates:

\[
12\times10=120
\]

The displayed result is:

```text
Area: 120.0
Area exceeds 100
```

The program follows the tasks identified during decomposition:

1. Input the dimensions.
2. Calculate the area.
3. Evaluate the condition.
4. Display the result.

---

## 7. Using Methods to Support Decomposition

In Java, methods can help you separate a program into manageable tasks.

Consider a program that calculates the total price of an order and applies a discount.

You could separate the calculation into two methods:

- `calculateTotal()` calculates the original total.
- `calculateDiscount()` calculates the discount amount.

Each method is responsible for one calculation.

```java
public class DiscountCalculator
{
    public static double calculateTotal(
        double price,
        int quantity)
    {
        double total;

        total = price * quantity;

        return total;
    }

    public static double calculateDiscount(double total)
    {
        double discount;

        discount = total * 0.10;

        return discount;
    }

    public static void main(String[] args)
    {
        double total;
        double discount;
        double finalAmount;

        total = calculateTotal(150, 4);

        if (total > 500)
        {
            discount = calculateDiscount(total);
        }
        else
        {
            discount = 0;
        }

        finalAmount = total - discount;

        System.out.println("Original total: R" + total);
        System.out.println("Discount: R" + discount);
        System.out.println("Final amount: R" + finalAmount);
    }
}
```

**Output:**

```text
Original total: R600.0
Discount: R60.0
Final amount: R540.0
```

The program uses methods to separate the calculations from one another.

This makes each calculation easier to understand and test.

**Remember:** Decomposition is the problem-solving process. Using methods is one way to implement a decomposed solution in Java.

---

## 8. Testing Each Part Separately

One advantage of decomposition is that you can test individual tasks before testing the entire program.

Consider the discount calculator.

| Test | Price | Quantity | Original total | Expected discount |
|---|---:|---:|---:|---:|
| 1 | R100 | 2 | R200 | R0 |
| 2 | R150 | 4 | R600 | R60 |
| 3 | R250 | 2 | R500 | R0 |

These tests check both sides of the condition `total > 500`.

Notice that a total of exactly R500 does not qualify for the discount because the condition requires the total to be greater than R500, not greater than or equal to R500.

You can test:

- Whether the total is calculated correctly.
- Whether the discount condition is correct.
- Whether the discount amount is correct.
- Whether the final amount is correct.

If the final amount is incorrect, you can investigate the relevant calculation or decision instead of treating the whole program as one large problem.

---

## 9. Common Mistakes

| Mistake | Why it is a problem | How to improve |
|---|---|---|
| Attempting to solve everything at once | Important steps may be overlooked. | Identify the main tasks first. |
| Breaking a problem into unrelated tasks | The solution becomes unnecessarily complicated. | Ensure every task contributes to the original problem. |
| Forgetting a required task | The program may not meet all the requirements. | Compare the task list with the original problem statement. |
| Performing calculations in the wrong order | Later tasks may use incorrect values. | Arrange the steps in a logical sequence. |
| Writing code before planning the solution | The program may become difficult to organise. | Use IPO analysis and pseudocode first. |
| Testing only the complete program | Errors can be harder to isolate. | Test individual calculations and decisions as well. |
| Assuming decomposition always requires methods | A simple problem may not need multiple methods. | Use methods when they improve organisation or reuse. |

---

## 10. Practical Challenge

Create a Java program called `StudentReport`.

The program must accept a student's name and two marks, calculate the average and display the result.

### Requirements

Before writing the program:

1. Read the problem carefully.
2. Identify the required inputs.
3. List the processing tasks.
4. Identify the required outputs.
5. Write pseudocode for the complete solution.

Then implement the program using Java and `JOptionPane`.

Your program must:

- Request the student's name.
- Request two marks.
- Calculate the average.
- Determine whether the average is at least 50%.
- Display the student's name, average and result message.

### Extension challenge

Improve the program so that it also checks whether either mark falls outside the valid range of 0 to 100.

Think about where this validation task belongs in your decomposed solution. The program should not calculate the final result using invalid marks.

Test the program with valid marks, boundary values and invalid marks.

---

## 11. Key Takeaways

- Problem decomposition means dividing a complex problem into smaller tasks.
- Each task should have a clear purpose.
- IPO analysis helps identify the inputs, processing and outputs.
- Pseudocode helps you organise tasks before writing Java code.
- Methods can be used to implement separate tasks.
- Decomposition makes programs easier to understand, test and debug.
- Individual tasks can be checked before the complete solution is tested.
- The decomposed tasks must collectively satisfy the original problem requirements.

---

## Navigation

- **Previous topic:** [Computational Thinking](../Computational-Thinking/README.md)
- **Next topic:** [Pattern Recognition and Abstraction](../Pattern-Recognition-and-Abstraction/README.md)
- **Back to Algorithms and Problem-Solving:** [Main Topic README](../README.md)
- **Back to Grade 10 Java:** [Grade 10 Java README](../../README.md)
