# Variables and Calculations

## Overview

Variables and calculations are fundamental building blocks of Java programming. Variables store information, data types determine what kind of information can be stored, and operators allow a program to perform calculations using that information.

In this topic, you will combine these concepts to solve practical problems. Instead of studying each concept in isolation, you will use variables, assignment statements, arithmetic operators, input and output to develop complete Java programs.

These skills form the foundation for more advanced programming tasks in Grade 10 Information Technology.

## Learning Objectives

By the end of this topic, you should be able to:

- Declare and initialise variables using appropriate data types.
- Assign values to variables and update those values.
- Perform arithmetic calculations using Java operators.
- Apply operator precedence and brackets correctly.
- Distinguish between integer division and real-number division.
- Accept input using `JOptionPane`.
- Convert input from `String` to numeric values.
- Display meaningful output.
- Test calculations using expected results and different input values.

---

## 1. Declaring and Initialising Variables

A variable is a named storage location used to hold a value while a program executes.

Every variable in Java has a data type that determines the kind of value it can store.

Common data types include:

| Data type | Purpose | Example |
|---|---|---|
| `int` | Stores whole numbers | `int age = 16;` |
| `double` | Stores decimal numbers | `double price = 24.99;` |
| `char` | Stores a single character | `char initial = 'J';` |
| `boolean` | Stores `true` or `false` | `boolean passed = true;` |
| `String` | Stores text | `String name = "Alex";` |

A variable declaration introduces a variable, while initialisation gives it its first value.

```java id="m6txjw"
int age = 16;
double price = 25.50;
String name = "Alex";
```

Choose a data type that suits the information being stored. For example, an age is usually stored as an `int`, while a price may require a `double` in introductory calculations.

## 2. Performing Basic Calculations

Java supports several arithmetic operators.

| Operator | Operation | Example | Result |
|---|---|---|---:|
| `+` | Addition | `10 + 5` | `15` |
| `-` | Subtraction | `10 - 5` | `5` |
| `*` | Multiplication | `10 * 5` | `50` |
| `/` | Division | `10 / 5` | `2` |
| `%` | Remainder | `10 % 3` | `1` |

### Example: Calculating the total cost

Suppose a Student buys four items that each cost R25.

```java id="7q9h5k"
int price = 25;
int quantity = 4;

int totalCost = price * quantity;

System.out.println("Total cost: R" + totalCost);
```

**Output:**

```text id="45zj2v"
Total cost: R100
```

The program stores the price and quantity in separate variables, multiplies them, and stores the answer in `totalCost`.

## 3. Understanding Operator Precedence

Java follows rules that determine the order in which calculations are performed.

Multiplication and division are performed before addition and subtraction. Brackets can be used to change the order.

Consider the following calculation:

```java id="m3f4nv"
int result = 10 + 5 * 2;

System.out.println(result);
```

**Output:**

```text id="y6c0tf"
20
```

Multiplication takes place first:

\[
10+(5\times2)=20
\]

If the addition must happen first, use brackets:

```java id="t6xk4s"
int result = (10 + 5) * 2;

System.out.println(result);
```

**Output:**

```text id="2kd4ms"
30
```

Always use brackets when they make a calculation easier to understand or ensure that the intended order is followed.

## 4. Integer Division and Real-Number Division

Integer division occurs when both operands are integers. The fractional part of the result is discarded.

```java id="k7g4jp"
int result = 7 / 2;

System.out.println(result);
```

**Output:**

```text id="v3k6ps"
3
```

To obtain a decimal result, use a `double` calculation.

```java id="j5x2rw"
double result = 7.0 / 2;

System.out.println(result);
```

**Output:**

```text id="q4m8yt"
3.5
```

This distinction is important when calculating averages, percentages or other values that may contain decimal places.

## 5. Updating Variables

An assignment statement stores a value in a variable.

For example:

```java id="f9w2jk"
int score = 10;

score = score + 5;

System.out.println(score);
```

**Output:**

```text id="z6n1pd"
15
```

The statement `score = score + 5;` first calculates the value on the right-hand side and then assigns the result to `score`.

The variable changes from `10` to `15`.

## 6. Accepting Input with JOptionPane

Programs become more useful when users can enter their own information.

The `JOptionPane.showInputDialog()` method displays a dialog box and returns the entered value as a `String`.

If you want to perform a numerical calculation, convert the input into an appropriate numeric type.

### Example: Calculating the area of a rectangle

The area of a rectangle is calculated using:

\[
\text{Area}=\text{length}\times\text{width}
\]

```java id="x8m4qn"
import javax.swing.JOptionPane;

public class RectangleArea {
    public static void main(String[] args) {
        String lengthInput = JOptionPane.showInputDialog(
                "Enter the length:");

        String widthInput = JOptionPane.showInputDialog(
                "Enter the width:");

        double length = Double.parseDouble(lengthInput);
        double width = Double.parseDouble(widthInput);

        double area = length * width;

        JOptionPane.showMessageDialog(
                null, "Area: " + area);
    }
}
```

If the user enters `5` for the length and `3` for the width, the result is:

```text id="u8m3pv"
Area: 15.0
```

The program follows three main stages:

1. **Input:** Obtain the length and width.
2. **Processing:** Multiply the values to calculate the area.
3. **Output:** Display the result.

This structure is commonly known as the input-processing-output cycle.

**Note:** This introductory example assumes that the user enters valid numerical input. A complete application should also consider invalid input and cancelled dialogs.

## 7. Integrated Example: Calculating a Shopping Bill

A shop sells an item at a fixed price. The user enters the price and the number of items purchased. The program calculates and displays the total cost.

```java id="b5m8vz"
import javax.swing.JOptionPane;

public class ShoppingBill {
    public static void main(String[] args) {
        String priceInput = JOptionPane.showInputDialog(
                "Enter the price of one item:");

        String quantityInput = JOptionPane.showInputDialog(
                "Enter the quantity:");

        double price = Double.parseDouble(priceInput);
        int quantity = Integer.parseInt(quantityInput);

        double total = price * quantity;

        JOptionPane.showMessageDialog(
                null,
                "Price per item: R" + price
                + "\nQuantity: " + quantity
                + "\nTotal cost: R" + total);
    }
}
```

### Example test

Suppose the user enters:

- Price per item: `19.50`
- Quantity: `3`

The expected total is:

\[
19.50\times3=58.50
\]

The displayed result will include:

```text id="k2n5yr"
Price per item: R19.5
Quantity: 3
Total cost: R58.5
```

The exact decimal formatting can be improved in a later exercise. For now, focus on selecting the correct data types, performing the calculation and displaying the values.

## 8. Common Mistakes

### Mistake 1: Using the wrong data type

```java id="r6w1tx"
int price = 19.50;
```

This causes a compilation error because `19.50` is a decimal literal and cannot be assigned directly to an `int`.

**Correction:**

```java id="v3q9lk"
double price = 19.50;
```

### Mistake 2: Using addition instead of multiplication

```java id="a7n2pf"
int total = price + quantity;
```

If the task requires the cost of several identical items, the correct operation is multiplication.

```java id="w9m4ks"
int total = price * quantity;
```

### Mistake 3: Forgetting integer division

```java id="t4y8nx"
int average = 7 / 2;
```

The result is `3`, not `3.5`.

**Correction:**

```java id="p5j7qm"
double average = 7.0 / 2;
```

### Mistake 4: Forgetting to convert input

```java id="g8k3vd"
String input = JOptionPane.showInputDialog("Enter your age:");
int age = input;
```

This does not compile because `input` is a `String`, while `age` is an `int`.

**Correction:**

```java id="h2r6wb"
int age = Integer.parseInt(input);
```

### Mistake 5: Using unclear variable names

Names such as `x`, `y` and `z` may be difficult to understand when a program becomes more complicated.

Where appropriate, use descriptive names such as `price`, `quantity` and `totalCost`.

## 9. Testing Your Calculations

Testing helps confirm that a program produces the correct result.

Consider a program that calculates the total cost using:

\[
\text{Total cost}=\text{price}\times\text{quantity}
\]

Use a range of test values.

| Price | Quantity | Expected total |
|---:|---:|---:|
| R10 | 1 | R10 |
| R25 | 4 | R100 |
| R19.50 | 3 | R58.50 |
| R0 | 5 | R0 |

For each test:

1. Work out the expected result independently.
2. Run the program using the test values.
3. Record the actual result.
4. Compare the actual result with the expected result.
5. Investigate and correct any differences.

Also consider whether zero, negative values or unsuitable input should be accepted according to the problem requirements.

## 10. Practical Challenges

Complete the following programming activities to practise combining variables and calculations.

### Challenge 1: Convert minutes to seconds

Write a program that asks the user to enter a number of minutes and calculates the equivalent number of seconds.

Use:

\[
\text{Seconds}=\text{minutes}\times60
\]

Display the entered minutes and calculated seconds.

### Challenge 2: Calculate a percentage

Write a program that asks the user to enter a mark and the total possible marks.

Calculate the percentage using:

\[
\text{Percentage}=\frac{\text{mark obtained}}{\text{total marks}}\times100
\]

Use a `double` calculation to allow decimal results.

Test the program using `35` out of `50`. The expected percentage is `70%`.

### Challenge 3: Calculate the cost of a journey

Write a program that asks the user to enter the distance travelled and the cost per kilometre.

Calculate the total cost using:

\[
\text{Total cost}=\text{distance}\times\text{cost per kilometre}
\]

Display the distance, rate and total cost.

### Challenge 4: Debug an incorrect calculation

The following program is intended to calculate the total price of six items costing R15 each.

```java id="z6p4tw"
int price = 15;
int quantity = 6;

int total = price + quantity;

System.out.println("Total: R" + total);
```

Tasks:

1. Predict the output.
2. Identify the logic error.
3. Correct the calculation.
4. State the expected result.
5. Run the corrected program to verify your answer.

## 11. Key Takeaways

- Variables store information that can be used in calculations.
- Data types must be selected appropriately.
- Arithmetic operators perform mathematical operations.
- Operator precedence determines the order of calculations.
- Integer division discards the fractional part of the result.
- `JOptionPane.showInputDialog()` returns a `String`.
- Numeric input must be converted before it can be used in numerical calculations.
- The input-processing-output cycle provides a useful structure for complete programs.
- Testing confirms whether calculations produce the expected results.

## Navigation

- [Back to Integrated Examples and Practice](../README.md)
- [Back to Grade 10 Java](../../README.md)
