# Scope and Local Variables

## Overview

In Java, a variable stores information that a program can use while it runs. However, a variable cannot necessarily be accessed from every part of a program.

**Scope** refers to the part of a program in which a variable can be accessed. Understanding scope helps you organise your code, avoid errors and write methods that work independently.

A **local variable** is a variable declared inside a method or a block of code. It is generally only accessible within the method or block in which it is declared.

This topic builds on your understanding of variables, methods, method calls and return values.

---

## Learning Objectives

By the end of this topic, you should be able to:

- Explain what scope means in Java.
- Identify local variables in a program.
- Determine where a variable can be accessed.
- Explain the scope of method parameters.
- Understand the scope of variables declared inside selection statements and loops.
- Identify and correct scope-related compilation errors.
- Explain why local variables must be initialised before they are used.
- Use local variables appropriately when designing methods.

---

## 1. Understanding Scope

Consider the following method:

```java
public static void displayMessage()
{
    String message = "Welcome to Java";

    System.out.println(message);
}
```

The variable `message` is declared inside `displayMessage()`.

It can be accessed inside that method, but it cannot be accessed directly from another method simply by referring to its name.

For example:

```java
public static void displayMessage()
{
    String message = "Welcome to Java";

    System.out.println(message);
}

public static void main(String[] args)
{
    displayMessage();

    System.out.println(message);
}
```

The final statement causes a compilation error because `message` was declared inside `displayMessage()`. It is not available inside `main()`.

### Key principle

A variable's scope determines where it can be used. Declaring a variable in one method does not automatically make it available in other methods.

---

## 2. Declaring Local Variables

Local variables are declared inside methods or blocks of code.

Examples include:

```java
int age = 17;
double price = 49.99;
String studentName = "Alex";
boolean passed = true;
```

These variables can be used within the scope in which they were declared.

Consider this complete example:

```java
public class LocalVariableExample
{
    public static void main(String[] args)
    {
        int age = 17;
        double price = 49.99;
        String studentName = "Alex";

        System.out.println(studentName);
        System.out.println(age);
        System.out.println(price);
    }
}
```

**Output:**

```text
Alex
17
49.99
```

All three variables are declared inside `main()`, so they can be accessed throughout the remaining part of that method, provided they have been declared and initialised before they are used.

---

## 3. Scope Within Methods

Each method has its own local variables.

Consider the following example:

```java
public class MethodScopeExample
{
    public static void calculateTotal()
    {
        double price = 120.00;
        double delivery = 30.00;

        double total = price + delivery;

        System.out.println(total);
    }

    public static void displayMessage()
    {
        String message = "Calculation completed";

        System.out.println(message);
    }

    public static void main(String[] args)
    {
        calculateTotal();
        displayMessage();
    }
}
```

**Output:**

```text
150.0
Calculation completed
```

Notice that:

- `price`, `delivery` and `total` belong to `calculateTotal()`.
- `message` belongs to `displayMessage()`.
- Neither method can directly access the local variables declared in the other method.
- `main()` can call both methods without needing access to their local variables.

This separation allows each method to perform its own task.

### Important distinction

Calling a method does not give the calling method direct access to the local variables declared inside the method being called.

If one method needs to provide a result to another method, you can use a return value. If it needs information to perform its task, you can use parameters.

---

## 4. Scope of Method Parameters

A parameter is a variable declared in a method's parameter list. It receives a value when the method is called.

Consider this example:

```java
public class ParameterScopeExample
{
    public static void displayAge(int age)
    {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args)
    {
        displayAge(17);
    }
}
```

**Output:**

```text
Age: 17
```

The parameter `age` is available inside `displayAge()`.

It cannot be accessed directly from `main()` because it is not declared there.

```java
public static void main(String[] args)
{
    displayAge(17);

    System.out.println(age);
}
```

The final statement causes a compilation error.

### Remember

- A parameter behaves like a local variable within its method.
- The parameter is available only within that method's scope.
- The argument supplied when calling the method provides the value for the parameter.

---

## 5. Scope Within Blocks

A block is a section of code enclosed in curly brackets `{ }`.

Blocks are used in structures such as `if` statements, loops and methods.

A variable declared inside a block is generally only accessible within that block.

Consider the following example:

```java
public class BlockScopeExample
{
    public static void main(String[] args)
    {
        int age = 17;

        if (age >= 18)
        {
            String message = "Adult";
            System.out.println(message);
        }
    }
}
```

The variable `message` is declared inside the `if` block.

It can be accessed inside that block, but it cannot be accessed after the closing curly bracket.

For example, the following statement would cause a compilation error if added after the `if` statement:

```java
System.out.println(message);
```

The variable `message` is outside its scope.

### Variables declared outside a block

A variable declared before a block may be accessible inside that block, as long as the variable is in scope and has been initialised.

For example:

```java
public class BlockScopeExample
{
    public static void main(String[] args)
    {
        int age = 17;

        if (age >= 18)
        {
            System.out.println(age);
        }

        System.out.println(age);
    }
}
```

**Output:**

```text
17
```

The variable `age` is declared in `main()`, outside the `if` block. It remains accessible later in the same method.

---

## 6. Scope in Loops

Variables declared in a loop's initialisation section have a limited scope.

Consider this `for` loop:

```java
public class LoopScopeExample
{
    public static void main(String[] args)
    {
        for (int count = 1; count <= 3; count++)
        {
            System.out.println(count);
        }
    }
}
```

**Output:**

```text
1
2
3
```

The variable `count` is declared in the `for` loop. It is available within that loop, including its condition, update expression and body.

It cannot be accessed after the loop.

For example:

```java
for (int count = 1; count <= 3; count++)
{
    System.out.println(count);
}

System.out.println(count);
```

The final statement causes a compilation error because `count` is outside its scope.

### Declaring a variable before a loop

If a variable must be used both inside and after a loop, it can be declared before the loop.

```java
public class LoopScopeExample
{
    public static void main(String[] args)
    {
        int count;

        for (count = 1; count <= 3; count++)
        {
            System.out.println(count);
        }

        System.out.println("Final value: " + count);
    }
}
```

**Output:**

```text
1
2
3
Final value: 4
```

Here, `count` is declared inside `main()`, outside the loop. Therefore, it remains accessible after the loop finishes.

---

## 7. Local Variables Must Be Initialised

Java requires a local variable to be assigned a value before it is used.

Consider this example:

```java
public class InitialisationExample
{
    public static void main(String[] args)
    {
        int total;

        System.out.println(total);
    }
}
```

This program does not compile because `total` has been declared but has not been initialised.

The corrected version is:

```java
public class InitialisationExample
{
    public static void main(String[] args)
    {
        int total = 0;

        System.out.println(total);
    }
}
```

**Output:**

```text
0
```

Alternatively, you can initialise the variable later, provided Java can determine that it has been assigned a value before it is used.

```java
int total;

total = 25;

System.out.println(total);
```

**Output:**

```text
25
```

### Why is initialisation important?

Initialising variables ensures that your program uses values that have been deliberately assigned rather than attempting to use an undefined local variable value.

**Remember:** Local variables do not automatically receive default values in the same way that fields do.

---

## 8. Using Local Variables Effectively

Local variables help methods complete specific tasks without unnecessarily sharing information.

Consider this example, which calculates the total cost of an order:

```java
import javax.swing.JOptionPane;

public class OrderCalculator
{
    public static void calculateOrder()
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

    public static void main(String[] args)
    {
        calculateOrder();
    }
}
```

For example, if the user enters `25.50` and `4`, the calculation is:

\[
25.50 \times 4 = 102.00
\]

The displayed result will be:

```text
Total cost: R102.0
```

The variables `price`, `quantity` and `total` are local to `calculateOrder()`.

They do not need to be accessible in `main()` because `main()` only needs to call the method.

This is an example of keeping variables within the part of the program that needs them.

---

## 9. Common Mistakes

| Mistake | Why it is incorrect | How to correct it |
|---|---|---|
| Using a variable from another method | The variable may be outside the current method's scope. | Use a parameter or return value where appropriate. |
| Using a variable after its block ends | A block-local variable is no longer accessible. | Use the variable within its block or declare it in a suitable outer scope. |
| Using a `for` loop variable after the loop | A variable declared in the loop initialisation is limited to the loop. | Declare the variable before the loop if it is needed afterwards. |
| Using a variable before initialising it | Java cannot compile a local variable use when it has not been definitely assigned. | Assign a value before using the variable. |
| Declaring every variable in `main()` | This can make the program harder to organise and understand. | Declare variables in the methods and blocks where they are needed. |

---

## 10. Testing and Debugging Scope Errors

When a program produces a compilation error involving a variable, ask yourself the following questions:

1. Where was the variable declared?
2. Is the variable inside a method or a block?
3. Am I trying to use it outside that method or block?
4. Was the variable declared before the statement that uses it?
5. Has the variable been initialised before it is used?
6. Would a parameter or return value be more appropriate?

### Practice debugging

Identify the error in this program:

```java
public class DebugScope
{
    public static void main(String[] args)
    {
        if (true)
        {
            int number = 10;
        }

        System.out.println(number);
    }
}
```

**Explanation:** The variable `number` is declared inside the `if` block. The final statement attempts to access it outside that block.

One correction is to declare the variable before the `if` statement:

```java
public class DebugScope
{
    public static void main(String[] args)
    {
        int number = 0;

        if (true)
        {
            number = 10;
        }

        System.out.println(number);
    }
}
```

**Output:**

```text
10
```

The variable is now declared in the scope of `main()`, so it can be accessed both inside and after the `if` block.

---

## 11. Practical Challenge

Create a Java program called `StudentResult` that uses a method to calculate and display a student's result.

Your program must:

1. Create a method called `calculateResult()`.
2. Declare local variables for a student's name, test mark and examination mark inside that method.
3. Use `JOptionPane` to request the student's name, test mark and examination mark.
4. Calculate the average of the two marks.
5. Display the student's name and average.
6. Call `calculateResult()` from `main()`.
7. Keep the variables local to `calculateResult()` rather than attempting to access them directly from `main()`.

**Extension challenge:** Modify the program so that a separate method displays a message indicating whether the student achieved an average of at least 50%. Use a parameter to pass the average to the second method.

Before running your program, identify which method can access each variable and explain why.

---

## 12. Key Takeaways

- **Scope** determines where a variable can be accessed.
- A **local variable** is declared inside a method or block.
- Each method has its own local variables.
- Method parameters are local to the methods that declare them.
- Variables declared inside an `if` block or a loop may not be accessible outside that block or loop.
- A variable declared in a `for` loop's initialisation section is limited to that loop.
- Local variables must be initialised before they are used.
- Parameters and return values allow methods to exchange information without directly accessing each other's local variables.
- Declaring variables where they are needed helps make programs easier to understand, test and maintain.

---

## Navigation

- **Previous topic:** [Return Values and Return Types](../Return-Values-and-Return-Types/README.md)
- **Next topic:** [Code Reuse and Modularity](../Code-Reuse-and-Modularity/README.md)
- **Back to Methods and Existing Classes:** [Main Topic README](../README.md)
- **Back to Grade 10 Java:** [Grade 10 Java README](../../README.md)
