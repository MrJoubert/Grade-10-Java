# Input, Processing and Output

## Overview

Almost every computer program follows a basic pattern: it receives information, processes that information and produces a result.

This pattern is known as **Input, Processing and Output (IPO)**. It is an important tool for analysing programming problems before writing Java code.

- **Input** is the information supplied to a program.
- **Processing** is the work performed on that information, such as calculations or decisions.
- **Output** is the information produced by the program.

Understanding IPO helps you identify what a program needs to do, organise your algorithm and determine whether your solution meets the requirements of a problem.

---

## Learning Objectives

By the end of this topic, you should be able to:

- Explain input, processing and output.
- Identify the IPO elements of a programming problem.
- Construct an IPO table.
- Distinguish between input data, processing instructions and output results.
- Represent an IPO solution using pseudocode.
- Implement an IPO algorithm in Java.
- Use `JOptionPane` to obtain input and display output.
- Identify missing or incorrect IPO steps in a program.

---

## 1. Understanding the IPO Model

The IPO model divides a programming problem into three basic stages.

<box border radius="lg" padding={3} gap={2}>
  <box background="surface-secondary" radius="md" padding={3} align="center" gap={1}>
    <title size="lg">1. INPUT</title>
    Information enters the program.
    <text color="secondary" size="sm">Example: price and quantity</text>
  </box>
  <box align="center">
    <icon name="arrow-down" size="xl" />
  </box>
  <box background="surface-secondary" radius="md" padding={3} align="center" gap={1}>
    <title size="lg">2. PROCESSING</title>
    The program works with the information.
    <text color="secondary" size="sm">Example: multiply price by quantity</text>
  </box>
  <box align="center">
    <icon name="arrow-down" size="xl" />
  </box>
  <box background="surface-secondary" radius="md" padding={3} align="center" gap={1}>
    <title size="lg">3. OUTPUT</title>
    The program produces a result.
    <text color="secondary" size="sm">Example: display the total cost</text>
  </box>
</box>

The stages usually follow this order:

1. Obtain the required information.
2. Process the information.
3. Produce the required result.

Some programs repeat these stages or perform additional processing steps, but the IPO model remains a useful starting point.

---

## 2. Understanding Input

Input is the information a program receives so that it can perform its task.

Input can come from a user, a file, a database or another source. In Grade 10 Java programs, you will often obtain input directly from the user.

For example, a program that calculates the area of a rectangle needs the length and width.

```java
import javax.swing.JOptionPane;

public class RectangleArea
{
    public static void main(String[] args)
    {
        double length;
        double width;

        length = Double.parseDouble(
            JOptionPane.showInputDialog("Enter the length:")
        );

        width = Double.parseDouble(
            JOptionPane.showInputDialog("Enter the width:")
        );
    }
}
```

In this example:

- `showInputDialog()` requests information from the user.
- `Double.parseDouble()` converts the entered text into a `double`.
- The values are stored in `length` and `width`.

The program has obtained its input, but it has not yet calculated or displayed the area.

### Important distinction

Input is the data received by the program. A variable declaration by itself does not obtain input.

For example:

```java
double length;
```

This declares a variable. It does not ask the user for a length or assign a value to the variable.

---

## 3. Understanding Processing

Processing refers to the operations performed on input data to produce a result.

Processing may include:

- Mathematical calculations.
- Comparisons.
- Logical operations.
- Selection using `if`, `if-else` or `switch`.
- Repetition using loops.
- String manipulation.
- Calling methods.

Consider the rectangle example.

The area is calculated using:

\[
\text{Area}=\text{Length}\times\text{Width}
\]

In Java:

```java
double area;

area = length * width;
```

The multiplication is the processing step.

Processing does not necessarily mean performing a mathematical calculation. Checking whether a mark is at least 50 is also processing because the program evaluates a condition.

```java
if (mark >= 50)
{
    System.out.println("Pass");
}
```

---

## 4. Understanding Output

Output is the information produced by a program.

Output may be displayed on the screen, written to a file or sent to another system. In your Grade 10 programs, output will commonly be displayed using `JOptionPane` or `System.out.println()`.

For example:

```java
JOptionPane.showMessageDialog(
    null,
    "The area is: " + area
);
```

This statement displays the calculated area.

Output should satisfy the requirements of the original problem. If a program calculates a result but never displays or otherwise uses it, it may not fully solve the problem.

---

## 5. Constructing an IPO Table

An IPO table helps you analyse a problem before writing code.

Consider this problem:

A shop needs a program that asks for the price of an item and the quantity purchased. The program must calculate and display the total cost.

The IPO table would be:

| Input | Processing | Output |
|---|---|---|
| Price per item | Multiply price by quantity | Total cost |
| Quantity | `total = price * quantity` | Display the total |

The table identifies exactly what the program needs to receive, do and produce.

### Another example: Calculating an average

Problem: A program must request two marks, calculate their average and display the result.

| Input | Processing | Output |
|---|---|---|
| First mark | Add the two marks | Average |
| Second mark | Divide the sum by two | Display the average |

The formula is:

\[
\text{Average}=\frac{\text{Mark 1}+\text{Mark 2}}{2}
\]

Writing this table first helps prevent missing steps in your algorithm.

---

## 6. From IPO to Pseudocode

Once you have identified the inputs, processing and outputs, you can use them to write an algorithm.

Consider a program that calculates the total cost of a purchase.

### IPO analysis

- **Input:** Price and quantity.
- **Processing:** Multiply price by quantity.
- **Output:** Total cost.

### Pseudocode

```text
START

    INPUT price
    INPUT quantity

    total = price * quantity

    OUTPUT total

STOP
```

The pseudocode describes the sequence of instructions without requiring Java syntax.

Notice that the algorithm follows the IPO structure:

1. Input the values.
2. Calculate the total.
3. Output the result.

---

## 7. Implementing IPO in Java

The following complete Java program implements the shop calculator.

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

- Price: `25.50`
- Quantity: `4`

The processing step is:

\[
25.50\times4=102.00
\]

The output dialog displays:

```text
Total cost: R102.0
```

### Identifying the IPO stages in the code

| Stage | Java statement or statements |
|---|---|
| Input | `showInputDialog()` and the conversion methods |
| Processing | `total = price * quantity;` |
| Output | `showMessageDialog()` |

This connection between the IPO model and Java code is important when analysing exam questions.

---

## 8. IPO Can Include Decisions

Not every program performs only a calculation. Some programs must make decisions based on their input.

Consider a program that accepts a test mark and displays whether the student has passed.

### IPO table

| Input | Processing | Output |
|---|---|---|
| Test mark | Check whether `mark >= 50` | Pass message or not-yet-passed message |

### Java implementation

```java
import javax.swing.JOptionPane;

public class PassChecker
{
    public static void main(String[] args)
    {
        int mark;
        String result;

        mark = Integer.parseInt(
            JOptionPane.showInputDialog("Enter the test mark:")
        );

        if (mark >= 50)
        {
            result = "Pass";
        }
        else
        {
            result = "Not yet passed";
        }

        JOptionPane.showMessageDialog(
            null,
            result
        );
    }
}
```

The program's processing includes a decision rather than just a calculation.

This demonstrates that the IPO model can be used for a wide range of problems.

---

## 9. IPO and Data Types

When analysing input, you must also consider the type of information the program requires.

| Information | Suitable Java type | Example |
|---|---|---|
| Number of items | `int` | `5` |
| Price | `double` | `25.50` |
| Student name | `String` | `"Alex"` |
| Whether a condition is true | `boolean` | `true` |

Choosing an appropriate data type is important because the processing must work correctly with the values received.

For example, if the program calculates prices, `double` is generally more suitable than `int` because prices may include decimal values.

Remember that `JOptionPane.showInputDialog()` returns text. You must convert numeric input before performing numerical calculations.

---

## 10. Identifying Missing IPO Steps

When reviewing a program, check that every required stage is present.

Consider this example:

```java
double price = 100;
int quantity = 3;

double total = price * quantity;
```

The program calculates the total, but it does not display it.

If the problem requires the total to be shown to the user, the output step is missing.

A corrected version is:

```java
double price = 100;
int quantity = 3;

double total = price * quantity;

System.out.println("Total cost: R" + total);
```

**Output:**

```text
Total cost: R300.0
```

### IPO checking questions

- Has every required input been obtained?
- Are the input values stored in suitable variables?
- Is all the required processing performed?
- Are calculations and conditions correct?
- Is every required output produced?
- Does the program follow the original problem requirements?

These questions are useful when debugging your own programs and analysing code in assessments.

---

## 11. Testing and Debugging

Testing helps you confirm that the program's input, processing and output work together correctly.

Consider a shop calculator.

| Test | Price | Quantity | Expected total |
|---|---:|---:|---:|
| 1 | R10 | 2 | R20 |
| 2 | R25.50 | 4 | R102 |
| 3 | R100 | 0 | R0 |

The third test checks what happens when the quantity is zero. Whether zero should be accepted depends on the requirements of the problem.

For each test, verify that:

1. The correct input is obtained.
2. The values are converted into the correct data types.
3. The calculation is correct.
4. The result is displayed correctly.

### Common IPO errors

| Error | IPO stage affected |
|---|---|
| Requesting the wrong information | Input |
| Converting text incorrectly | Input preparation |
| Using addition instead of multiplication | Processing |
| Using the wrong comparison operator | Processing |
| Forgetting to display the result | Output |
| Displaying the wrong variable | Output |

Understanding which stage contains the error helps you investigate the program more efficiently.

---

## 12. Practical Challenge

Create a Java program called `TravelCostCalculator`.

The program must calculate the total cost of a journey.

It must request:

- The distance travelled in kilometres.
- The vehicle's fuel consumption in litres per 100 kilometres.
- The cost of one litre of fuel.

Use the following formula:

\[
\text{Fuel used}=\frac{\text{Distance}\times\text{Consumption}}{100}
\]

Then calculate:

\[
\text{Total cost}=\text{Fuel used}\times\text{Fuel price}
\]

### Requirements

1. Construct an IPO table before writing code.
2. Identify suitable data types for all inputs.
3. Write pseudocode for the solution.
4. Implement the program using Java and `JOptionPane`.
5. Display the fuel used and the total journey cost.
6. Test the program with at least three sets of values.
7. Check each expected result manually.

### Extension challenge

Add a decision that displays a warning if the journey cost exceeds R500.

Identify the additional processing step in your IPO table before implementing it.

---

## 13. Key Takeaways

- IPO stands for Input, Processing and Output.
- Input is the information received by the program.
- Processing includes calculations, comparisons and other operations.
- Output is the information produced by the program.
- IPO tables help you analyse problems before coding.
- Pseudocode can represent an IPO solution without Java-specific syntax.
- Java implements the planned input, processing and output steps.
- Decisions and loops can form part of the processing stage.
- Testing helps confirm that all three stages work correctly.
- A program must satisfy the original requirements, not merely compile successfully.

---

## Navigation

- **Previous topic:** [Pattern Recognition and Abstraction](../Pattern-Recognition-and-Abstraction/README.md)
- **Next topic:** [Pseudocode](../Pseudocode/README.md)
- **Back to Algorithms and Problem-Solving:** [Main Topic README](../README.md)
- **Back to Grade 10 Java:** [Grade 10 Java README](../../README.md)
