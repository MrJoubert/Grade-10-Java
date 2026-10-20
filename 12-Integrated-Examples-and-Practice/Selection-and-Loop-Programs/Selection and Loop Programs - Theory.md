# Selection and Loop Programs

## Overview

Selection and loops allow a Java program to make decisions and repeat instructions. Selection structures determine which statements execute based on a condition, while loops allow statements to execute repeatedly.

When combined, these structures can solve a wide range of programming problems, such as determining whether a number is positive, calculating totals, displaying multiplication tables and validating user input.

In this topic, you will combine `if`, `if-else`, `switch`, `for`, `while` and `do-while` structures to create complete Java programs.

## Learning Objectives

By the end of this topic, you should be able to:

- Use selection structures to make decisions.
- Choose an appropriate selection structure for a problem.
- Use loops to repeat instructions.
- Distinguish between counting-controlled and condition-controlled loops.
- Combine selection and loops in a single program.
- Use counters and accumulators correctly.
- Prevent infinite loops.
- Trace program execution and predict output.
- Test programs using different input values.

---

## 1. Selection Structures

Selection allows a program to choose which instructions to execute based on a condition.

### 1.1 The `if` statement

An `if` statement executes a block of code only when its condition is true.

```java
int mark = 75;

if (mark >= 50) {
    System.out.println("You have passed.");
}
```

**Output:**

```text
You have passed.
```

If the mark were below 50, the message would not be displayed.

### 1.2 The `if-else` statement

An `if-else` statement provides two possible paths.

```java
int number = 7;

if (number % 2 == 0) {
    System.out.println("Even number.");
} else {
    System.out.println("Odd number.");
}
```

**Output:**

```text
Odd number.
```

The remainder operator `%` determines whether the number is divisible by 2 without a remainder.

### 1.3 The `switch` statement

A `switch` statement selects a branch based on the value of an expression.

```java
int choice = 2;

switch (choice) {
    case 1:
        System.out.println("Add");
        break;
    case 2:
        System.out.println("Subtract");
        break;
    case 3:
        System.out.println("Multiply");
        break;
    default:
        System.out.println("Invalid choice");
        break;
}
```

**Output:**

```text
Subtract
```

The `break` statement prevents execution from continuing into the next case.

---

## 2. Loops

Loops repeat a block of code. The correct loop depends on whether the number of repetitions is known and when the condition must be checked.

### 2.1 The `for` loop

A `for` loop is useful when the number of repetitions is known.

```java
for (int counter = 1; counter <= 5; counter++) {
    System.out.println(counter);
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

The loop has three important parts:

- Initialisation: `int counter = 1`
- Condition: `counter <= 5`
- Update: `counter++`

The loop continues while the condition is true.

### 2.2 The `while` loop

A `while` loop repeats while its condition remains true. The condition is checked before the body executes.

```java
int counter = 1;

while (counter <= 3) {
    System.out.println(counter);
    counter++;
}
```

**Output:**

```text
1
2
3
```

If the condition is false before the first iteration, the loop body does not execute.

### 2.3 The `do-while` loop

A `do-while` loop checks its condition after executing the body. Therefore, the body executes at least once.

```java
int counter = 1;

do {
    System.out.println(counter);
    counter++;
} while (counter <= 3);
```

**Output:**

```text
1
2
3
```

A `do-while` loop is useful when an instruction must happen at least once, such as displaying a menu before checking whether the user wants to continue.

---

## 3. Combining Selection and Loops

Selection and loops become particularly useful when used together.

For example, a loop can process several numbers, while an `if` statement determines whether each number is positive or negative.

```java
for (int number = 1; number <= 5; number++) {
    if (number % 2 == 0) {
        System.out.println(number + " is even.");
    } else {
        System.out.println(number + " is odd.");
    }
}
```

**Output:**

```text
1
