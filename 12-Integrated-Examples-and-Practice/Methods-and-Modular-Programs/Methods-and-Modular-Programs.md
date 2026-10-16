# Methods and Modular Programs

## Overview

As programs become more complex, writing all the instructions inside a single `main` method can make the code difficult to understand, test and maintain.

Methods allow a program to divide a problem into smaller, manageable tasks. Each method can perform a specific operation, such as displaying a message, calculating a total or determining whether a number is even.

This approach is known as **modular programming**. It encourages code reuse, improves readability and makes programs easier to develop and debug.

In this topic, you will combine methods, variables, calculations, selection, loops and input/output to create structured Java programs.

## Learning Objectives

By the end of this topic, you should be able to:

- Explain the purpose of methods.
- Distinguish between a method declaration and a method call.
- Create and call `void` methods.
- Understand how parameters and arguments work.
- Recognise return types and return values.
- Use local variables correctly.
- Divide a problem into smaller tasks.
- Identify opportunities to reuse code.
- Test methods independently as part of a larger program.

---

## 1. What Is a Method?

A method is a named block of code that performs a particular task.

Instead of writing the same instructions repeatedly, you can place them inside a method and call that method whenever required.

Consider this example:

```java id="r7mv4p"
public static void displayMessage() {
    System.out.println("Welcome to Java!");
}
```

This code declares a method named `displayMessage`.

The method does not execute simply because it has been declared. It must be called.

```java id="p4y6nq"
displayMessage();
```

When called, the method executes its statements.

### Why use methods?

Methods help you to:

- Break large problems into smaller tasks.
- Avoid unnecessary repetition.
- Give meaningful names to operations.
- Improve the readability of a program.
- Test and debug smaller sections of code.
- Reuse functionality in different parts of a program.

## 2. Declaring and Calling a Void Method

A `void` method performs a task without returning a value to the calling statement.

Consider this complete Java program:

```java id="g2y6wk"
public class MethodExample {
    public static void main(String[] args) {
        displayMessage();
        displayMessage();
    }

    public static void displayMessage() {
        System.out.println("Welcome to Java!");
    }
}
```

**Output:**

```text id="m3j8qx"
Welcome to Java!
Welcome to Java!
```

The method is called twice, so its instructions execute twice.

### Understanding the structure

```java id="w1z8pk"
public static void displayMessage() {
    System.out.println("Welcome to Java!");
}
```

- `public` determines the method's accessibility.
- `static` allows the method to be called from the static `main` method without creating an object.
- `void` indicates that the method does not return a value.
- `displayMessage` is the method name.
- `()` contains the parameter list, which is empty in this example.
- `{ }` contains the statements executed by the method.

For introductory Grade 10 practical work, focus on declaring and calling simple `void` methods without parameters where required by your practical assessment guidelines.

## 3. Methods and the Main Method

The `main` method is the entry point of a standard Java application.

```java id="k8v5nf"
public static void main(String[] args) {
    displayHeading();
    displayInstructions();
}
```

When the program starts, Java executes the statements inside `main`.

The calls to `displayHeading()` and `displayInstructions()` cause the corresponding methods to execute.

Example:

```java id="y2q5hs"
public class StudyProgram {
    public static void main(String[] args) {
        displayHeading();
        displayInstructions();
    }

    public static void displayHeading() {
        System.out.println("GRADE 10 JAVA");
        System.out.println("==============");
    }

    public static void displayInstructions() {
        System.out.println("Practise your programming.");
        System.out.println("Test your code carefully.");
    }
}
```

**Output:**

```text id="q2w8mx"
GRADE 10 JAVA
==============
Practise your programming.
Test your code carefully.
```

The program is easier to understand because each method has a clear responsibility.

## 4. Using Methods to Organise Calculations

Methods can be used to separate different tasks within a program.

Suppose a program calculates the total cost of a purchase.

```java id="n4x9qf"
public class ShoppingProgram {
    public static void main(String[] args) {
        displayHeading();
        calculateTotal();
    }

    public static void displayHeading() {
        System.out.println("SHOPPING CALCULATOR");
    }

    public static void calculateTotal() {
        int price = 25;
        int quantity = 4;
        int total = price * quantity;

        System.out.println("Total cost: R" + total);
    }
}
```

**Output:**

```text id="v8j2mc"
SHOPPING CALCULATOR
Total cost: R100
```

The `displayHeading()` method displays the heading, while `calculateTotal()` performs the calculation and displays the result.

Each method performs a distinct task.

## 5. Methods with Parameters

A parameter allows information to be supplied to a method.

A method with parameters can work with different values without requiring the same code to be rewritten.

For example:

```java id="x7m4qz"
public static void displayName(String name) {
    System.out.println("Welcome, " + name + "!");
}
```

The method accepts a `String` parameter named `name`.

It can be called using:

```java id="f9c2kp"
displayName("Alex");
displayName("Sam");
```

**Output:**

```text id="y5n8rv"
Welcome, Alex!
Welcome, Sam!
```

In these calls, `"Alex"` and `"Sam"` are arguments. They are the actual values supplied to the method.

### Parameters and arguments

- A **parameter** appears in the method declaration.
- An **argument** is the value supplied when the method is called.

Parameters are useful when a method must perform the same task using different data.

However, the Grade 10 practical requirements may restrict which method structures you must implement. Follow the requirements of the particular task or assessment.

## 6. Methods with Return Values

Some methods calculate or determine a value that another part of the program needs.

A method with a return type sends a value back to the calling statement using `return`.

For example:

```java id="b6p3mt"
public static int calculateTotal() {
    int price = 25;
    int quantity = 4;

    return price * quantity;
}
```

The method returns an `int` value.

It can be called as follows:

```java id="q8v1mz"
int total = calculateTotal();

System.out.println("Total cost: R" + total);
```

**Output:**

```text id="h5j7wk"
Total cost: R100
```

The return type is `int` because the method returns a whole number.

A method that returns a decimal value could use `double`, while a method returning text could use `String`.

For example:

```java id="t4n9qc"
public static String getGreeting() {
    return "Welcome to Java!";
}
```

A return statement provides a value to the caller. This differs from a `void` method, which performs its task without returning a value.

## 7. Understanding Local Variables

A local variable is declared inside a method or another local block and is only accessible within its scope.

Consider this program:

```java id="w5k2nf"
public class ScopeExample {
    public static void main(String[] args) {
        displayNumber();
    }

    public static void displayNumber() {
        int number = 10;

        System.out.println(number);
    }
}
```

**Output:**

```text id="k2m8vz"
10
```

The variable `number` is declared inside `displayNumber()`.

It cannot be accessed directly from `main()` because it is local to `displayNumber()`.

For example, attempting to use `number` directly inside `main()` would cause a compilation error.

### Why scope matters

Understanding scope helps you:

- Avoid using variables outside their permitted locations.
- Keep methods independent.
- Reduce accidental changes to unrelated data.
- Write clearer and more maintainable programs.

## 8. Dividing a Problem into Methods

A useful way to design a modular program is to identify the separate tasks that must be performed.

Suppose a program must display a shopping bill.

The problem can be divided into the following tasks:

1. Display a heading.
2. Obtain the necessary information.
3. Calculate the total.
4. Display the result.

Each task can be implemented separately where appropriate.

For example:

```java id="a7q5wd"
import javax.swing.JOptionPane;

public class ModularShopping {
    public static void main(String[] args) {
        displayHeading();
        obtainPurchaseDetails();
    }

    public static void displayHeading() {
        System.out.println("SHOPPING CALCULATOR");
        System.out.println("===================");
    }

    public static void obtainPurchaseDetails() {
        String priceInput = JOptionPane.showInputDialog(
                "Enter the price of one item:");

        String quantityInput = JOptionPane.showInputDialog(
                "Enter the quantity:");

        double price = Double.parseDouble(priceInput);
        int quantity = Integer.parseInt(quantityInput);

        double total = price * quantity;

        displayTotal(total);
    }

    public static void displayTotal(double total) {
        JOptionPane.showMessageDialog(
                null, "Total cost: R" + total);
    }
}
```

This example illustrates a modular design using parameters.

It assumes valid input. A complete application should also handle invalid input and cancelled dialogs.

When planning your own programs, think about which tasks should be separated into methods and how information needs to move between them.

## 9. Common Mistakes

### Mistake 1: Declaring a method but never calling it

A method does not execute merely because it exists.

**Solution:** Add a method call at the appropriate point in the program.

### Mistake 2: Calling a method using the wrong name

Java is case-sensitive.

`displayMessage()` and `DisplayMessage()` are different names.

**Solution:** Use the same spelling and capitalisation in the declaration and call.

### Mistake 3: Calling a method with incompatible arguments

If a method expects an `int`, supplying a `String` may cause a compilation error.

**Solution:** Check the parameter types and the values supplied in the method call.

### Mistake 4: Using a return value incorrectly

A method returning `int` must return a compatible integer value on every applicable execution path.

A `void` method should not be used as though it produces a value.

**Solution:** Match the return type to the method's purpose.

### Mistake 5: Accessing a local variable outside its scope

A variable declared inside one method is not automatically available in another method.

**Solution:** Declare variables where they are needed and use parameters or return values when information must be passed between methods.

### Mistake 6: Repeating the same code unnecessarily

Copying the same instructions into several places makes the program harder to maintain.

**Solution:** Consider placing repeated functionality into a reusable method.

## 10. Testing Methods

Methods should be tested to confirm that they perform their intended tasks.

For a method that displays a message, check that the correct text appears.

For a method that calculates a total, compare its result with an independently calculated answer.

For a method that receives input, test different valid and invalid values where appropriate.

Use a test table such as the following:

| Test | Input | Expected result |
|---|---|---|
| Standard | Price `25`, quantity `4` | Total `100` |
| Different values | Price `10`, quantity `3` | Total `30` |
| Zero price | Price `0`, quantity `4` | Total `0`, if zero price is permitted |
| Invalid quantity | Quantity `-2` | Reject if quantities must be positive |

After changing a method, test the program again to ensure that the correction has not affected other parts of the application.

## 11. Practical Challenges

### Challenge 1: Display a heading

Create a program with a method named `displayHeading()`.

The method must display the name of your program and a separator line.

Call the method from `main()`.

### Challenge 2: Display a multiplication table

Create a method that displays the multiplication table for a fixed number from 1 to 10.

Use a loop inside the method.

Call the method from `main()`.

### Challenge 3: Calculate a total

Create a method named `calculateTotal()` that calculates the total cost of a fixed number of items.

Display the result and test it using different values.

### Challenge 4: Reuse a method

Create a method that displays a welcome message.

Call it several times from `main()` to demonstrate code reuse.

### Challenge 5: Trace a method call

Study the following program:

```java id="e2m6nv"
public class TraceMethod {
    public static void main(String[] args) {
        displayNumber();
        System.out.println("Finished");
    }

    public static void displayNumber() {
        System.out.println(10);
        System.out.println(20);
    }
}
```

Tasks:

1. Predict the output.
2. Identify which method executes first.
3. Explain when execution returns to `main()`.
4. Explain why `"Finished"` appears last.

## 12. Key Takeaways

- A method is a named block of code that performs a task.
- A method declaration defines the method, while a method call executes it.
- A `void` method does not return a value.
- Parameters allow methods to receive information.
- Arguments are the values supplied when a method is called.
- Methods with return values provide results to the calling code.
- Local variables are only accessible within their scope.
- Modular programming divides a problem into smaller tasks.
- Reusing methods reduces unnecessary repetition.
- Testing individual tasks and the complete program helps identify errors.

## Navigation

- [Previous: String and Character Programs](../String-and-Character-Programs/README.md)
- [Next: Algorithm Practice](../Algorithm-Practice/README.md)
- [Back to Integrated Examples and Practice](../README.md)
- [Back to Grade 10 Java](../../README.md)
