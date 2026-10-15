# Pattern Recognition and Abstraction

## Overview

Pattern recognition and abstraction are two important concepts in computational thinking. They help you understand problems, identify similarities and develop simpler, more effective solutions.

**Pattern recognition** means identifying similarities, repeated structures or common steps in problems.

**Abstraction** means focusing on the information that is relevant to solving a problem while ignoring unnecessary details.

These concepts are useful when designing Java algorithms, identifying repeated calculations, creating reusable methods and deciding which information a program actually needs.

In Grade 10 Information Technology, both concepts help you plan solutions before writing code.

---

## Learning Objectives

By the end of this topic, you should be able to:

- Explain pattern recognition and abstraction.
- Identify repeated operations in programming problems.
- Recognise similarities between different problems.
- Identify relevant and irrelevant information.
- Simplify a problem by focusing on its essential requirements.
- Use patterns to develop general solutions.
- Apply pattern recognition and abstraction when designing Java algorithms.
- Explain how these concepts can improve code reuse and problem-solving.

---

## 1. What Is Pattern Recognition?

Pattern recognition is the process of identifying similarities or repeated structures in problems.

When you recognise a pattern, you can often use an existing approach to solve a new problem instead of starting from scratch.

### Example: Repeated calculations

Consider the following calculations:

- Calculate the total cost of an order.
- Calculate the total cost of another order.
- Calculate the total cost of a third order.

Each calculation follows the same pattern:

\[
\text{Total}=\text{Price}\times\text{Quantity}
\]

Only the values change.

Recognising this pattern means you can create one method that performs the calculation for different orders.

```java
public static double calculateTotal(
    double price,
    int quantity)
{
    double total;

    total = price * quantity;

    return total;
}
```

The method can then be reused:

```java
System.out.println(calculateTotal(100, 2));
System.out.println(calculateTotal(150, 3));
System.out.println(calculateTotal(200, 4));
```

**Output:**

```text
200.0
450.0
800.0
```

The same algorithm is used for all three calculations.

### Why is pattern recognition useful?

- It helps you identify repeated calculations.
- It reduces duplicated code.
- It helps you recognise familiar problem types.
- It makes it easier to develop reusable methods.
- It allows you to apply previously learnt techniques to new problems.

---

## 2. Recognising Patterns in Algorithms

Many Grade 10 programming problems use familiar algorithmic patterns.

### Pattern A: Calculating a total

When you need to calculate a total, you often add values together.

For example:

```java
int mark1 = 60;
int mark2 = 75;
int mark3 = 80;

int total;

total = mark1 + mark2 + mark3;

System.out.println(total);
```

**Output:**

```text
215
```

The pattern is addition.

### Pattern B: Calculating an average

An average is calculated by dividing the sum of the values by the number of values.

\[
\text{Average}=\frac{\text{Total}}{\text{Number of values}}
\]

```java
int mark1 = 60;
int mark2 = 75;
int mark3 = 80;

int total;
double average;

total = mark1 + mark2 + mark3;

average = total / 3.0;

System.out.println(average);
```

**Output:**

```text
71.66666666666667
```

Notice that `3.0` is used so that the division produces a decimal result.

### Pattern C: Checking a condition

Many problems require a decision based on a value.

For example:

```java
int mark = 65;

if (mark >= 50)
{
    System.out.println("Pass");
}
else
{
    System.out.println("Not yet passed");
}
```

**Output:**

```text
Pass
```

The pattern is a comparison followed by a decision.

Recognising these patterns helps you identify the Java structures that are likely to be useful for a new problem.

---

## 3. Generalising a Pattern

Once you recognise a pattern, you can develop a solution that works for different values.

Consider the calculation:

\[
\text{Total}=\text{Price}\times\text{Quantity}
\]

You could write a separate calculation for every order, but that would repeat the same instructions.

Instead, use parameters to represent the values that may change.

```java
public static double calculateTotal(
    double price,
    int quantity)
{
    double total;

    total = price * quantity;

    return total;
}
```

This method represents the general pattern rather than one specific calculation.

It can be used with many different values:

```java
double firstTotal;
double secondTotal;

firstTotal = calculateTotal(50, 2);
secondTotal = calculateTotal(120, 5);

System.out.println(firstTotal);
System.out.println(secondTotal);
```

**Output:**

```text
100.0
600.0
```

The method does not need to be rewritten when the price or quantity changes.

**Key principle:** A recognised pattern can often be expressed as a general algorithm that works with different inputs.

---

## 4. What Is Abstraction?

Abstraction means concentrating on the information that matters for solving a problem while ignoring details that are not relevant to the task.

When analysing a programming problem, you should identify what the program actually needs to know.

### Example: Calculating a student's average

Suppose a program must calculate the average of two marks.

The relevant information is:

- The first mark.
- The second mark.

The student's favourite colour, home address and preferred music are not needed for the calculation.

By ignoring irrelevant details, you can focus on the actual problem.

### Why is abstraction useful?

- It simplifies complex problems.
- It reduces unnecessary information.
- It helps you identify the variables a program needs.
- It makes algorithms easier to design.
- It prevents you from adding unnecessary functionality.
- It helps you focus on the requirements of the problem.

---

## 5. Applying Abstraction to a Programming Problem

Consider the following scenario:

A school wants a program that calculates whether a student has passed a test.

The original scenario might include many details about the school, the teacher, the classroom and the student.

However, the program only needs to compare the student's mark with the pass mark.

### Step 1: Identify the goal

Determine whether the student has passed.

### Step 2: Identify the relevant information

- The student's mark.
- The required pass mark.

### Step 3: Ignore irrelevant details

The student's classroom, favourite subject and home address are not required for this decision.

### Step 4: Develop the algorithm

```text
INPUT mark

IF mark >= 50 THEN
    OUTPUT "Pass"
ELSE
    OUTPUT "Not yet passed"
ENDIF
```

### Step 5: Implement the solution in Java

```java
import javax.swing.JOptionPane;

public class PassChecker
{
    public static void main(String[] args)
    {
        int mark;
        String message;

        mark = Integer.parseInt(
            JOptionPane.showInputDialog("Enter the test mark:")
        );

        if (mark >= 50)
        {
            message = "Pass";
        }
        else
        {
            message = "Not yet passed";
        }

        JOptionPane.showMessageDialog(
            null,
            message
        );
    }
}
```

The program focuses only on the information needed to make the decision.

---

## 6. The Difference Between Pattern Recognition and Abstraction

Although these concepts are related, they are not the same.

| Pattern recognition | Abstraction |
|---|---|
| Identifies similarities or repeated structures. | Identifies the information relevant to the problem. |
| Helps you recognise common calculations or algorithms. | Helps you simplify a problem by ignoring unnecessary details. |
| Can lead to reusable methods and general algorithms. | Helps determine which data and operations are needed. |
| Example: Recognising that several orders use price multiplied by quantity. | Example: Ignoring a customer's address when calculating an order total. |

### Using both concepts together

Suppose you are developing a program to calculate the cost of several products.

**Pattern recognition:** You notice that every product's total cost is calculated using price multiplied by quantity.

**Abstraction:** You determine that the calculation requires only the price and quantity, not unrelated product details.

Together, these concepts help you develop a simple, reusable calculation method.

---

## 7. Recognising Patterns in Repetition

Loops are useful when a task must be repeated.

Consider displaying the numbers from 1 to 5.

You could write five separate output statements:

```java
System.out.println(1);
System.out.println(2);
System.out.println(3);
System.out.println(4);
System.out.println(5);
```

However, the statements follow a repeated pattern: display the next number.

A `for` loop expresses this pattern more clearly.

```java
for (int number = 1; number <= 5; number++)
{
    System.out.println(number);
}
```

**Output:**

```text
1
2
3
4
5
```

Pattern recognition helps you notice that the same operation is repeated with changing values.

Abstraction helps you focus on the essential rules:

- Start at 1.
- Continue while the number is at most 5.
- Increase the number by 1.
- Display the number.

This produces a shorter, more adaptable solution.

---

## 8. Recognising Patterns in Character Processing

Pattern recognition is also useful when working with characters and digits.

For example, if you need to determine whether a character is a digit, you can use the `Character` class.

```java
char character = '7';

if (Character.isDigit(character))
{
    System.out.println("The character is a digit");
}
else
{
    System.out.println("The character is not a digit");
}
```

**Output:**

```text
The character is a digit
```

The same method can be reused for different characters.

```java
System.out.println(Character.isDigit('4'));
System.out.println(Character.isDigit('A'));
System.out.println(Character.isDigit('0'));
```

**Output:**

```text
true
false
true
```

The pattern is checking whether a character belongs to the category of digits.

Using an existing Java method avoids the need to write a separate set of conditions for each character.

---

## 9. Common Mistakes

| Mistake | Why it is incorrect | How to improve |
|---|---|---|
| Treating pattern recognition and abstraction as identical | They solve different parts of the problem-analysis process. | Identify whether you are looking for similarities or relevant information. |
| Ignoring important information during abstraction | The solution may no longer satisfy the requirements. | Keep all information needed to solve the problem correctly. |
| Rewriting repeated calculations | This creates unnecessary duplication. | Look for patterns and consider reusable methods. |
| Assuming every problem with similar wording has the same solution | Different requirements may require different algorithms. | Check the inputs, processing and outputs of each problem. |
| Adding unnecessary variables | Irrelevant data can make the program harder to understand. | Identify the minimum information required for the task. |
| Using a general method without testing different values | The method may not work correctly for every expected input. | Test the method with a range of appropriate values. |

---

## 10. Testing and Evaluating Your Thinking

Before writing a program, check whether your analysis is correct.

Ask yourself:

1. Have I identified the main task?
2. Which information is essential?
3. Which details can be ignored?
4. Are there repeated calculations or operations?
5. Can a general algorithm solve several similar cases?
6. Have I considered different input values?
7. Does my proposed solution satisfy every requirement?

### Example: Discount calculation

A shop offers a 10% discount on purchases exceeding R500.

Consider these values:

| Purchase total | Discount applies? | Reason |
|---:|---|---|
| R200 | No | The total is below R500. |
| R500 | No | The total does not exceed R500. |
| R650 | Yes | The total exceeds R500. |

Pattern recognition helps identify that each purchase requires the same comparison.

Abstraction helps you focus on the purchase total and the threshold of R500.

Together, they help you design the condition:

```java
if (total > 500)
{
    // Calculate the discount.
}
```

Testing the boundary value of exactly R500 helps confirm that the condition matches the stated requirement.

---

## 11. Practical Challenge

Create a Java program called `ProductCalculator`.

A shop sells three products. For each product, the program must calculate the total cost using its price and quantity.

### Requirements

1. Identify the information required for each product.
2. Identify the repeated calculation.
3. Explain how pattern recognition applies to the problem.
4. Explain which information is relevant and which can be ignored.
5. Create a reusable method called `calculateTotal()`.
6. Use parameters for the price and quantity.
7. Call the method for all three products.
8. Display the total cost for each product.

Use `JOptionPane` to request the price and quantity for each product.

### Extension challenge

The shop offers a 10% discount when a product's total cost exceeds R500.

Modify your program so that it:

- Calculates each product's total.
- Checks whether the discount applies.
- Calculates the discount when required.
- Displays the original total, discount and final amount.

Before coding, identify the repeated pattern and the information required to make the discount decision.

---

## 12. Key Takeaways

- Pattern recognition identifies similarities and repeated structures in problems.
- Abstraction focuses on relevant information and ignores unnecessary details.
- Pattern recognition can help you develop reusable methods and general algorithms.
- Abstraction helps simplify problem requirements.
- Loops can express repeated operations more clearly than duplicated statements.
- Existing Java classes provide reusable functionality.
- Pattern recognition and abstraction work together during problem analysis.
- Testing helps confirm that your solution works with different inputs and boundary values.

---

## Navigation

- **Previous topic:** [Problem Decomposition](../Problem-Decomposition/README.md)
- **Next topic:** [Input, Processing and Output](../Input-Processing-Output/README.md)
- **Back to Algorithms and Problem-Solving:** [Main Topic README](../README.md)
- **Back to Grade 10 Java:** [Grade 10 Java README](../../README.md)
