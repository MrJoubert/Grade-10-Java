# Switch Statements in Java

## Overview

A program often needs to choose between several possible actions. For example, a program might display a different message depending on a menu option selected by the user, or identify a day of the week using a numeric value.

Java provides the `switch` statement as a selection structure that allows a program to compare one expression against several possible values.

A `switch` statement can make code easier to read when you need to compare the same variable or expression against several specific values. For other conditions, such as checking whether a mark is greater than or equal to a particular number, an `if` or `if-else` statement is generally more suitable.

## Learning Objectives

By the end of this topic, you should be able to:

- Explain the purpose of a `switch` statement.
- Identify the syntax and components of a `switch` statement.
- Use `case` labels to represent possible values.
- Explain the purpose of `break`.
- Use `default` to handle unmatched values.
- Write `switch` statements using integers and Strings.
- Trace the execution of a `switch` statement.
- Identify common errors involving `case`, `break` and `default`.
- Choose between `if-else` and `switch` for a given problem.

## IEB Curriculum Alignment

This topic supports Grade 10 IEB Information Technology programming requirements involving selection structures and the implementation of algorithms in Java.

The examples focus on introductory `switch` syntax, selection logic and testing. This resource is intended for student learning and is not an official IEB publication.

## 1. What Is a Switch Statement?

A `switch` statement allows a program to select a block of code based on the value of an expression.

Consider this example:

```java
int option = 2;

switch (option) {
    case 1:
        System.out.println("You selected Option 1.");
        break;

    case 2:
        System.out.println("You selected Option 2.");
        break;

    case 3:
        System.out.println("You selected Option 3.");
        break;

    default:
        System.out.println("Invalid option.");
}
```

Output:

```text
You selected Option 2.
```

The value of `option` is `2`, so Java executes the instructions associated with `case 2`.

The `break` statement ends the `switch` statement, preventing execution from continuing into the following cases.

## 2. Understanding the Syntax

The general structure is:

```java
switch (expression) {

    case value1:
        // Instructions for value1
        break;

    case value2:
        // Instructions for value2
        break;

    default:
        // Instructions if no case matches
}
```

Each component has a specific purpose.

- `switch` introduces the selection structure.
- The expression inside the parentheses provides the value to evaluate.
- `case` identifies a possible matching value.
- The instructions following a matching `case` execute.
- `break` exits the `switch` statement.
- `default` provides an alternative when no case matches.

The `default` section is optional, but it is often useful when the program must handle unexpected values.

## 3. Using Case Labels

Each `case` label represents a possible value of the switch expression.

For example:

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    case 4:
        System.out.println("Thursday");
        break;

    case 5:
        System.out.println("Friday");
        break;

    default:
        System.out.println("Invalid day number");
}
```

Output:

```text
Wednesday
```

Because `day` contains `3`, Java selects `case 3`.

### Important rules

- Each case value must be compatible with the switch expression's type.
- Case labels must be unique within the same switch statement.
- A case label uses a colon `:`, not a semicolon.
- Java executes the instructions associated with a matching case until it encounters a statement that exits the switch, such as `break`, or reaches the end of the switch.

## 4. Understanding Break

The `break` statement is commonly used to exit a `switch` statement after the selected case has completed.

Consider this example:

```java
int option = 1;

switch (option) {
    case 1:
        System.out.println("First");
        break;

    case 2:
        System.out.println("Second");
        break;

    default:
        System.out.println("Other");
}
```

Output:

```text
First
```

When `option` is `1`, Java displays `First` and then exits the switch.

### What happens without break?

Consider:

```java
int option = 1;

switch (option) {
    case 1:
        System.out.println("First");

    case 2:
        System.out.println("Second");
        break;

    default:
        System.out.println("Other");
}
```

Output:

```text
First
Second
```

There is no `break` after `case 1`, so execution continues into `case 2`. This behaviour is called **fall-through**.

Fall-through can sometimes be intentional, but in introductory programs it is usually safer to include `break` after each case unless you specifically want multiple case sections to execute.

## 5. Using Default

The `default` section executes when no case value matches the switch expression, provided execution reaches it.

For example:

```java
int option = 8;

switch (option) {
    case 1:
        System.out.println("Start");
        break;

    case 2:
        System.out.println("Settings");
        break;

    case 3:
        System.out.println("Exit");
        break;

    default:
        System.out.println("Invalid option");
}
```

Output:

```text
Invalid option
```

The value `8` does not match any case, so the `default` section executes.

The `default` label is optional. If it is omitted and no case matches, the switch simply completes without executing a case body.

## 6. Using Switch with User Input

You can combine `JOptionPane`, type conversion and a `switch` statement to create a simple menu.

### Problem statement

Develop a program that asks the user to enter a menu option from `1` to `3` and displays the corresponding action.

```java
import javax.swing.JOptionPane;

public class MenuSelection {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(
            "Select an option:\n"
            + "1. Start\n"
            + "2. Settings\n"
            + "3. Exit"
        );

        int option = Integer.parseInt(input);

        switch (option) {
            case 1:
                JOptionPane.showMessageDialog(
                    null,
                    "Starting the program."
                );
                break;

            case 2:
                JOptionPane.showMessageDialog(
                    null,
                    "Opening settings."
                );
                break;

            case 3:
                JOptionPane.showMessageDialog(
                    null,
                    "Exiting the program."
                );
                break;

            default:
                JOptionPane.showMessageDialog(
                    null,
                    "Invalid option. Select 1, 2 or 3."
                );
        }
    }
}
```

### How it works

1. The input dialog displays the menu.
2. The user's response is stored as a String.
3. `Integer.parseInt()` converts the String to an integer.
4. The switch compares the integer with the case values.
5. The corresponding message is displayed.
6. If no case matches, the default message is displayed.

This example assumes that the user enters a valid integer. If the user enters text or cancels the dialog, additional input handling is needed.

## 7. Using Switch with Strings

Java also supports `switch` statements with String expressions.

This is useful when a program needs to respond to a specific text value.

```java
String colour = "Blue";

switch (colour) {
    case "Red":
        System.out.println("You selected red.");
        break;

    case "Blue":
        System.out.println("You selected blue.");
        break;

    case "Green":
        System.out.println("You selected green.");
        break;

    default:
        System.out.println("Unknown colour.");
}
```

Output:

```text
You selected blue.
```

String matching in a switch is case-sensitive. Therefore, `"Blue"` and `"blue"` are treated as different values.

For example, if the variable contained `"blue"`, the `case "Blue"` label would not match.

If the program should ignore differences in letter case, you can normalise the String first:

```java
String colour = "blue";

switch (colour.toUpperCase()) {
    case "RED":
        System.out.println("You selected red.");
        break;

    case "BLUE":
        System.out.println("You selected blue.");
        break;

    case "GREEN":
        System.out.println("You selected green.");
        break;

    default:
        System.out.println("Unknown colour.");
}
```

Output:

```text
You selected blue.
```

## 8. Grouping Multiple Case Labels

Sometimes several values should produce the same result.

For example, a program might group weekend days together.

```java
int day = 6;

switch (day) {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
        System.out.println("Weekday");
        break;

    case 6:
    case 7:
        System.out.println("Weekend");
        break;

    default:
        System.out.println("Invalid day number");
}
```

Output:

```text
Weekend
```

Notice that the first several cases share the same instructions. There are no statements between those case labels, so execution falls through to the shared message.

This is a useful way to group several specific values that should be treated identically.

## 9. Switch Versus If-Else

Both `switch` and `if-else` are selection structures, but they are useful in different situations.

### Using if-else

```java
int mark = 72;

if (mark >= 75) {
    System.out.println("Distinction");
} else if (mark >= 50) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

Output:

```text
Pass
```

This structure works well because the conditions use ranges and relational comparisons.

### Using switch

```java
int option = 2;

switch (option) {
    case 1:
        System.out.println("Start");
        break;

    case 2:
        System.out.println("Settings");
        break;

    case 3:
        System.out.println("Exit");
        break;

    default:
        System.out.println("Invalid option");
}
```

This structure works well because the program compares one value with several specific alternatives.

### Comparison

| Feature | If-else | Switch |
|---|---|---|
| Specific value matching | Supported | Supported |
| Range conditions | Suitable | Traditional case labels do not directly express ranges |
| Multiple Boolean conditions | Suitable | Less suitable for general Boolean expressions |
| Menu options | Suitable | Often clear and concise |
| Alternative for unmatched conditions | `else` | `default` |

Use the structure that best represents the problem's requirements.

## 10. Common Mistakes

### Mistake 1: Forgetting break

Without `break`, execution may continue into later cases.

### Mistake 2: Using a semicolon after a case label

Incorrect:

```java
case 1;
    System.out.println("Start");
    break;
```

Correct:

```java
case 1:
    System.out.println("Start");
    break;
```

### Mistake 3: Duplicating case values

Case labels within the same switch statement must be unique.

### Mistake 4: Using ranges as traditional case labels

A traditional switch case matches a specific value, not a range such as `mark >= 50`.

Use `if-else` for range-based decisions.

### Mistake 5: Assuming String comparisons ignore letter case

`"Java"` and `"java"` are different case-sensitive String values.

### Mistake 6: Forgetting the default case

If an unexpected value is entered, the program may do nothing when no case matches and no default section is provided.

Including `default` is often useful for menu-driven programs.

### Mistake 7: Assuming switch validates input

The switch statement selects an action based on a value. It does not automatically ensure that the user entered the correct type of data or that the value meets all the program's requirements.

## 11. Testing Switch Statements

Testing should include values that match each case and at least one value that matches none of the cases.

For the menu program, a suitable test table is:

| Input | Expected output |
|---:|---|
| `1` | Starting the program. |
| `2` | Opening settings. |
| `3` | Exiting the program. |
| `0` | Invalid option message. |
| `5` | Invalid option message. |

If you are using a String switch, also test differences in letter case when relevant.

When tracing a switch statement, identify the matching case and check whether a `break` or another exit occurs before the next case.

## Practical Challenge

Create a Java program that asks the user to enter a number from `1` to `4`.

Your program must display:

- `1`: Monday
- `2`: Tuesday
- `3`: Wednesday
- `4`: Thursday
- Any other integer: Invalid day number

### Requirements

- Use `JOptionPane` for input and output.
- Convert the input into an integer.
- Use a `switch` statement.
- Include a `break` after each case.
- Include a `default` section.
- Test all four valid values and at least two invalid values.

### Extension activities

- Add Friday, Saturday and Sunday.
- Create a menu with options to calculate the area of a rectangle, calculate the area of a square or exit.
- Use a String switch to respond to a user's chosen colour.
- Compare a switch solution with an equivalent `if-else` solution.

## Key Takeaways

- A `switch` statement selects code based on the value of an expression.
- Each `case` label represents a possible matching value.
- `break` normally prevents execution from continuing into subsequent cases.
- `default` handles values that do not match any case.
- Multiple case labels can share the same instructions.
- Java supports String switch expressions, and String matching is case-sensitive.
- `switch` is useful for specific alternatives, while `if-else` is generally better for ranges and complex conditions.
- A switch statement does not replace input validation.
- Testing should cover all expected cases and unmatched values.

---

## Navigation

- [Previous: Nested Selection](../Nested-Selection/README.md)
- **Current topic: Switch Statements**
- [Next: For Loops](../For-Loops/README.md)
- [Back to the Grade 10 Java Library](../../README.md)

