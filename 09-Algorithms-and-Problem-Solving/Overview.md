# Algorithms and Problem Solving

## Overview

Programming is not just about writing Java code. Before writing a program, you need to understand the problem, identify the information required, plan a solution and organise the steps needed to solve it.

This process is known as **problem solving**. An algorithm provides a logical, step-by-step solution to a problem and can be represented using pseudocode, flowcharts or a programming language such as Java.

In Grade 10 Information Technology, you will develop your ability to analyse problems, recognise patterns, break complicated tasks into smaller parts and translate a planned solution into working code.

This topic brings together several concepts from earlier topics, including variables, data types, calculations, input and output, Boolean logic, selection, loops and methods.

## Learning Objectives

By the end of this topic, you should be able to:

- Explain what an algorithm is and why algorithms are important.
- Apply computational thinking to solve programming problems.
- Break a problem into smaller, manageable tasks.
- Recognise patterns and identify the information relevant to a problem.
- Describe the input, processing and output required by a program.
- Write clear, logical pseudocode.
- Interpret and construct basic flowcharts.
- Develop algorithms that use calculations, selection and repetition.
- Calculate sums, averages, minimums and maximums.
- Identify factors and multiples of numbers.
- Swap the values stored in two variables.
- Isolate digits from a whole number using integer division and the remainder operator.
- Test an algorithm using suitable test data.
- Translate an algorithm into Java code.

## IEB Curriculum Alignment

This topic supports the Grade 10 IEB Information Technology programming requirements relating to computational thinking, algorithm development, problem solving and the implementation of solutions in Java.

The concepts in this section are intended to help you plan and explain solutions before implementing them in code. They also support the use of trace tables, testing and debugging.

The emphasis is on developing logical, understandable and correct solutions rather than simply memorising code.

## Topic Structure

Work through the following subtopics in order. Each section will contain focused explanations, worked examples and activities.

1. [Computational Thinking](Computational-Thinking/README.md)
2. [Problem Decomposition](Problem-Decomposition/README.md)
3. [Pattern Recognition and Abstraction](Pattern-Recognition-and-Abstraction/README.md)
4. [Input, Processing and Output](Input-Processing-Output/README.md)
5. [Pseudocode](Pseudocode/README.md)
6. [Flowcharts](Flowcharts/README.md)
7. [Common Algorithmic Tasks](Common-Algorithmic-Tasks/README.md)
8. [Swapping Values](Swapping-Values/README.md)
9. [Isolating Digits](Isolating-Digits/README.md)
10. [Algorithm Evaluation and Efficiency](Algorithm-Evaluation-and-Efficiency/README.md)

---

## 1. What Is an Algorithm?

An **algorithm** is a finite sequence of clear, logical instructions designed to solve a problem or complete a task.

An algorithm should:

- Have a clearly defined purpose.
- Follow a logical sequence.
- Contain instructions that can be understood and followed.
- Produce the intended result when given suitable input.
- Finish after a finite number of steps.

Consider a program that calculates the average of three marks.

The algorithm must:

1. Obtain the three marks.
2. Add the marks together.
3. Divide the total by three.
4. Display the average.

The algorithm describes the solution independently of the programming language used to implement it.

### Algorithm versus program

| Algorithm | Program |
|---|---|
| Describes the steps required to solve a problem. | Implements those steps in a programming language. |
| Can be written as pseudocode or represented by a flowchart. | Contains executable code written in a language such as Java. |
| Focuses on the logic of the solution. | Must follow the syntax and rules of the programming language. |

A well-planned algorithm makes programming easier because you have already considered the logic before writing the code.

## 2. Computational Thinking

Computational thinking is an approach to solving problems systematically. It helps you develop solutions that can be implemented by a computer.

Four useful aspects are:

### Decomposition

Breaking a large problem into smaller tasks that are easier to understand and solve.

For example, a student-mark calculation program can be divided into input, calculation, result determination and output.

### Pattern recognition

Identifying similarities between problems or repeated steps within a problem.

For example, calculating the total of five prices involves repeatedly adding a price to a running total.

### Abstraction

Focusing on the information and details relevant to the problem while ignoring unnecessary information.

For example, a program calculating a student's average needs the marks and the number of marks. The student's favourite colour is irrelevant to the calculation.

### Algorithm design

Planning a logical sequence of instructions that solves the problem.

For example, you must decide how marks will be entered, how the average will be calculated and how the result will be displayed.

These aspects often work together rather than occurring as completely separate stages.

## 3. Problem Decomposition

When a problem seems complicated, do not attempt to solve everything at once. Divide it into smaller tasks.

Consider the following problem:

**Develop a program that accepts a student's name and three marks, calculates the average and displays the student's name and average.**

The problem can be divided into four stages.

| Stage | Task |
|---|---|
| Input | Obtain the student's name and three marks. |
| Processing | Add the marks and divide the total by three. |
| Output | Display the name and calculated average. |
| Testing | Check the calculation using known marks. |

Each stage has a clear responsibility.

This makes the problem easier to plan, implement and test.

## 4. Input, Processing and Output

Many programming problems can be analysed using the **IPO model**.

- **Input:** Information supplied to the program.
- **Processing:** Calculations or decisions performed using that information.
- **Output:** Information produced by the program.

For example, consider a program that calculates the area of a rectangle.

| Input | Processing | Output |
|---|---|---|
| Length | Area = length × width | Calculated area |
| Width | | |

The algorithm can be expressed as:

1. Obtain the length.
2. Obtain the width.
3. Calculate the area.
4. Display the area.

The IPO model is a useful starting point when analysing exam questions. Before writing code, identify what the program must receive, do and produce.

## 5. Planning an Algorithm Using Pseudocode

**Pseudocode** is a structured, language-independent way of describing an algorithm. It uses ordinary language and programming-style instructions without requiring the exact syntax of Java.

For example, an algorithm to calculate the average of three marks could be written as:

```text
START
    INPUT mark1
    INPUT mark2
    INPUT mark3

    total ← mark1 + mark2 + mark3
    average ← total / 3

    OUTPUT average
END
```

The arrow `←` means that a value is assigned to a variable. It is not Java syntax.

### Why use pseudocode?

Pseudocode allows you to focus on the logic of a solution without worrying about semicolons, data types, braces or other Java syntax rules.

It is particularly useful when:

- Analysing a question before coding.
- Explaining an algorithm in an examination.
- Identifying missing steps.
- Checking whether the order of instructions is correct.
- Planning selection and repetition.

### Important principles

Good pseudocode should be:

- Clear and unambiguous.
- Logically ordered.
- Indented consistently.
- Detailed enough to describe the required solution.
- Written using consistent conventions.

Do not include unnecessary instructions that make the algorithm harder to understand.

## 6. Representing Algorithms with Flowcharts

A **flowchart** is a graphical representation of an algorithm. It uses standard symbols connected by arrows to show the sequence of steps and the direction of control.

Common flowchart symbols include:

| Symbol | Purpose |
|---|---|
| Oval | Start or end of an algorithm. |
| Rectangle | A processing instruction, such as a calculation or assignment. |
| Parallelogram | Input or output. |
| Diamond | A decision or condition with possible outcomes. |
| Arrow | The direction in which the algorithm proceeds. |

For example, an algorithm that determines whether a number is positive can be represented using the following logic:

1. Start.
2. Input a number.
3. Check whether the number is greater than zero.
4. If true, display `Positive`.
5. Otherwise, display `Zero or negative`.
6. End.

The decision is represented by a diamond because the algorithm follows different paths depending on whether the condition is true or false.

### Pseudocode and flowcharts

Both represent algorithms, but they do so differently.

- Pseudocode uses written instructions.
- Flowcharts use symbols, arrows and decision paths.

You should be able to understand the logic represented by either form and relate it to Java code.

## 7. Common Algorithmic Tasks

Many programming questions involve familiar operations. Understanding these patterns helps you solve new problems more efficiently.

### Calculating a total

Suppose a program must calculate the total cost of three items.

```java
double price1 = 25.50;
double price2 = 18.00;
double price3 = 12.50;

double total = price1 + price2 + price3;

System.out.println("Total: R" + total);
```

Output:

```text
Total: R56.0
```

The calculation is correct, although the output could be formatted to show two decimal places in a later application.

### Calculating an average

The average is calculated by dividing the sum of the values by the number of values.

```java
int mark1 = 70;
int mark2 = 80;
int mark3 = 90;

double average = (mark1 + mark2 + mark3) / 3.0;

System.out.println("Average: " + average);
```

Output:

```text
Average: 80.0
```

Notice that the divisor is `3.0`, not `3`. Using a real-number divisor ensures that the division can produce a decimal result.

### Finding the largest value

A program can compare values using relational operators and selection.

```java
int number1 = 14;
int number2 = 27;
int number3 = 19;

int largest = number1;

if (number2 > largest) {
    largest = number2;
}

if (number3 > largest) {
    largest = number3;
}

System.out.println("Largest: " + largest);
```

Output:

```text
Largest: 27
```

The variable `largest` initially stores the first number. Each subsequent number is compared with the current largest value. If a bigger number is found, the variable is updated.

This pattern is useful when finding the smallest or largest of a known set of values.

### Finding the smallest value

The same approach can be used to find the smallest value. Replace the greater-than comparisons with less-than comparisons.

The general pattern is:

1. Assume the first value is the smallest.
2. Compare each remaining value with the current smallest.
3. Update the variable whenever a smaller value is found.
4. Display the final smallest value.

### Finding factors

A factor of a number divides that number exactly, leaving no remainder.

For example, the factors of `12` are:

```text
1, 2, 3, 4, 6, 12
```

The remainder operator `%` can help determine whether a number is a factor.

```java
int number = 12;
int divisor = 3;

if (number % divisor == 0) {
    System.out.println("The divisor is a factor.");
} else {
    System.out.println("The divisor is not a factor.");
}
```

Output:

```text
The divisor is a factor.
```

This works because `12 % 3` produces `0`.

Always ensure that a divisor is not zero before attempting division or remainder calculations.

### Finding multiples

A number is a multiple of another number if it can be obtained by multiplying that number by an integer.

For example, `18` is a multiple of `6` because `6 × 3 = 18`.

You can also use the remainder operator to test whether a number is a multiple of another number.

```java
int number = 18;
int base = 6;

if (number % base == 0) {
    System.out.println("It is a multiple.");
} else {
    System.out.println("It is not a multiple.");
}
```

Output:

```text
It is a multiple.
```

The same condition can be used in algorithms involving factors and multiples, provided the divisor is not zero.

## 8. Swapping Values

Swapping means exchanging the values stored in two variables.

Suppose:

```java
int first = 10;
int second = 20;
```

The goal is to make `first` equal to `20` and `second` equal to `10`.

### Why a temporary variable is needed

The following approach does not work:

```java
first = second;
second = first;
```

After the first assignment, both variables contain `20`. The original value of `first` has been lost.

Instead, temporarily preserve one of the values.

```java
int first = 10;
int second = 20;
int temporary;

temporary = first;
first = second;
second = temporary;

System.out.println("First: " + first);
System.out.println("Second: " + second);
```

Output:

```text
First: 20
Second: 10
```

The steps are:

1. Copy the original value of `first` into `temporary`.
2. Copy the value of `second` into `first`.
3. Copy the saved value in `temporary` into `second`.

A temporary variable prevents an original value from being overwritten before it is used.

## 9. Isolating Digits

Integer division and the remainder operator can be used to extract digits from a whole number.

Consider the number `583`.

### Obtaining the last digit

The remainder after division by `10` gives the last digit of a non-negative whole number.

```java
int number = 583;
int lastDigit = number % 10;

System.out.println(lastDigit);
```

Output:

```text
3
```

### Removing the last digit

Integer division by `10` removes the last digit of a non-negative whole number.

```java
int number = 583;
int remainingNumber = number / 10;

System.out.println(remainingNumber);
```

Output:

```text
58
```

### Obtaining the tens digit

The tens digit can be isolated by first removing the units digit and then finding the remainder after division by `10`.

```java
int number = 583;
int tensDigit = (number / 10) % 10;

System.out.println(tensDigit);
```

Output:

```text
8
```

### Obtaining the hundreds digit

For a three-digit non-negative whole number, integer division by `100` gives the hundreds digit.

```java
int number = 583;
int hundredsDigit = number / 100;

System.out.println(hundredsDigit);
```

Output:

```text
5
```

### Understanding the pattern

| Operation | Result | Explanation |
|---|---:|---|
| `583 % 10` | `3` | Isolates the units digit. |
| `583 / 10` | `58` | Removes the units digit through integer division. |
| `(583 / 10) % 10` | `8` | Isolates the tens digit. |
| `583 / 100` | `5` | Isolates the hundreds digit for a three-digit number. |

These examples assume non-negative whole numbers. Negative numbers require additional care because Java's remainder and integer division rules can produce different results from the patterns shown here.

## 10. Evaluating an Algorithm

An algorithm should not merely produce an answer for one example. It should solve the stated problem correctly and handle the relevant input values.

When evaluating an algorithm, consider the following questions:

- **Correctness:** Does it produce the expected result?
- **Completeness:** Does it include all the required steps?
- **Clarity:** Can another person understand the instructions?
- **Robustness:** Does it handle inappropriate or unexpected input appropriately?
- **Termination:** Will it eventually finish, or could a loop continue indefinitely?
- **Efficiency:** Does it avoid unnecessary work?

At Grade 10 level, focus primarily on correctness, clarity, completeness and avoiding unnecessary steps. More advanced analysis of algorithmic complexity is beyond the main focus of this introduction.

### Example: identifying a logical error

Consider the following code:

```java
int number = 8;
int square = number + number;

System.out.println(square);
```

Output:

```text
16
```

The output is not the square of `8`. It is twice the value of `8`.

The correct calculation is:

```java
int number = 8;
int square = number * number;

System.out.println(square);
```

Output:

```text
64
```

The original code is syntactically valid and executes, but its logic does not match the intended problem. This is a **logical error**.

## Common Mistakes

Avoid the following errors when developing algorithms:

- Writing Java code before understanding what the question requires.
- Missing an input, calculation or output step.
- Performing calculations in the wrong order.
- Using integer division when a decimal result is required.
- Confusing the remainder operator `%` with division `/`.
- Updating a minimum or maximum variable incorrectly.
- Overwriting a value before saving it when swapping variables.
- Forgetting that integer division removes the fractional part of the result.
- Using a divisor of zero in a division or remainder operation.
- Creating a condition that does not correctly represent the problem.
- Writing pseudocode that is too vague to implement.
- Designing a loop that never reaches its stopping condition.
- Testing an algorithm with only one example.
- Confusing a program that executes successfully with one that produces the correct answer.

## Recommended Study Approach

Use the following method when approaching a programming problem or an examination question.

1. **Read the question carefully.** Identify exactly what the program must achieve.
2. **Identify the input.** Determine which values must be supplied or obtained.
3. **Identify the output.** Determine what information must be displayed.
4. **Plan the processing.** Write down the calculations, decisions and repetitions required.
5. **Develop the algorithm.** Use pseudocode or a flowchart to organise the steps.
6. **Trace the algorithm.** Work through it manually using sample values.
7. **Translate it into Java.** Use appropriate variables, operators and control structures.
8. **Test the solution.** Compare the actual output with the expected output.
9. **Correct errors.** Determine whether a problem lies in the algorithm, the Java syntax or the execution of the program.

When you are stuck, return to the problem statement and the IPO model. You may have misunderstood the required input, processing or output.

## Practical Challenge

Develop a Java program that calculates a student's results for three assessments.

Your program must:

1. Ask the user to enter the student's name.
2. Ask the user to enter three assessment marks.
3. Calculate the total of the three marks.
4. Calculate the average as a decimal value.
5. Determine the highest mark.
6. Determine the lowest mark.
7. Display the student's name, total, average, highest mark and lowest mark.

### Requirements

- Use `JOptionPane` for input.
- Convert the entered marks to numeric values.
- Use suitable variable names and data types.
- Use selection to determine the highest and lowest marks.
- Display meaningful output messages.
- Test your program with different marks, including cases where two or more marks are equal.

### Extension activities

Once your program works correctly:

- Add validation to ensure that marks fall within the permitted range of `0` to `100`.
- Display a suitable error message when a mark is invalid.
- Test the program with standard, extreme and abnormal data.
- Write pseudocode for your solution before implementing the Java code.
- Draw a flowchart showing the input, processing, decisions and output.

## Key Takeaways

- An algorithm is a finite sequence of logical instructions used to solve a problem.
- Computational thinking helps you analyse and plan solutions.
- Decomposition breaks a complicated problem into manageable tasks.
- Pattern recognition identifies repeated or similar operations.
- Abstraction focuses attention on relevant information.
- The IPO model identifies input, processing and output.
- Pseudocode describes an algorithm in structured written form.
- Flowcharts represent algorithms using standard symbols and arrows.
- Totals, averages, minimums, maximums, factors and multiples are common algorithmic tasks.
- A temporary variable can be used to swap two values safely.
- Integer division and the remainder operator can be used to isolate digits.
- Algorithms must be tested to confirm that they produce the expected results.
- Correct logic is just as important as correct Java syntax.

---

## Navigation

- [Previous: Methods and Existing Classes](../08-Methods-and-Existing-Classes/README.md)
- **Current topic: Algorithms and Problem Solving**
- [Next: User Interface and Validation](../10-User-Interface-and-Validation/README.md)
- [Back to the Grade 10 Java Library](../README.md)


