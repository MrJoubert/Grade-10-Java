# Combining Input, Processing and Output

## Learning Objectives

By the end of this topic, you should be able to:

- Explain the input, processing and output stages of a Java program.
- Collect information using `JOptionPane`.
- Convert numeric input into suitable data types.
- Process input using calculations and variables.
- Display meaningful results using `JOptionPane.showMessageDialog()`.
- Organise a program into a logical sequence of instructions.

## 1. The Three Stages of a Program

Many programs follow three basic stages: input, processing and output.

### Input

Input is information supplied to the program by the user.

For example, a teacher might enter a Student's assessment marks.

```java
String firstMarkInput = JOptionPane.showInputDialog("Enter the first mark:");
```

Because `showInputDialog()` returns a `String`, the input may need to be converted before it can be used in calculations.

### Processing

Processing involves working with the input to produce a result.

For example, a program can calculate the total of two assessment marks:

```java
int firstMark = Integer.parseInt(firstMarkInput);
int secondMark = Integer.parseInt(secondMarkInput);

int totalMarks = firstMark + secondMark;
```

The program converts the input into integers and adds the marks.

### Output

Output presents the result to the user.

```java
JOptionPane.showMessageDialog(null, "Total marks: " + totalMarks);
```

The program displays the calculated total in a message dialog.

## 2. Understanding the Sequence

The order of instructions is important.

A program should generally:

1. Collect the required input.
2. Convert the input when necessary.
3. Process the values.
4. Display the result.

For example, a program cannot calculate the total of two marks until it has collected both marks.

Similarly, it cannot display the calculated total until the calculation has taken place.

## 3. Worked Example: Calculating an Assessment Average

Suppose a teacher wants to calculate the average of two assessment marks.

The program must collect two marks, calculate their total and average, and display the results.

### Step 1: Collect the input

```java
String firstMarkInput = JOptionPane.showInputDialog("Enter the first mark:");
String secondMarkInput = JOptionPane.showInputDialog("Enter the second mark:");
```

The values are initially stored as strings.

### Step 2: Convert the input

```java
int firstMark = Integer.parseInt(firstMarkInput);
int secondMark = Integer.parseInt(secondMarkInput);
```

The values are converted into integers so that arithmetic calculations can be performed.

### Step 3: Process the values

```java
int totalMarks = firstMark + secondMark;
double averageMark = totalMarks / 2.0;
```

The program calculates the total and average.

The divisor `2.0` ensures that real division takes place, preserving a fractional average when necessary.

### Step 4: Display the output

```java
JOptionPane.showMessageDialog(null,
        "Total marks: " + totalMarks
        + "\nAverage mark: " + averageMark);
```

The results are displayed in a message dialog.

If the teacher enters `35` and `42`, the total is `77` and the average is `38.5`.

## 4. Complete Program

```java
import javax.swing.JOptionPane;

public class AssessmentAverage {

    public static void main(String[] args) {

        String firstMarkInput = JOptionPane.showInputDialog("Enter the first mark:");
        String secondMarkInput = JOptionPane.showInputDialog("Enter the second mark:");

        int firstMark = Integer.parseInt(firstMarkInput);
        int secondMark = Integer.parseInt(secondMarkInput);

        int totalMarks = firstMark + secondMark;
        double averageMark = totalMarks / 2.0;

        JOptionPane.showMessageDialog(null,
                "ASSESSMENT RESULTS\n"
                + "First mark: " + firstMark + "\n"
                + "Second mark: " + secondMark + "\n"
                + "Total: " + totalMarks + "\n"
                + "Average: " + averageMark);

    }

}
```

## 5. Using More Than One Calculation

Input, processing and output can be used for more complex tasks.

Suppose a school office wants to calculate the cost of stationery purchased by a Student.

The program collects the quantity and price of each item, calculates the total cost, and displays the result.

```java
int numberOfBooks = Integer.parseInt(bookInput);
int bookPrice = Integer.parseInt(priceInput);

int totalCost = numberOfBooks * bookPrice;
```

If a Student purchases 4 exercise books at R18 each, the total is:

\[
4 \times 18 = 72
\]

The total cost is R72.

The same process can be applied to calculations involving assessment marks, attendance figures or other school information.

## 6. Common Mistakes

### Mistake 1: Performing calculations before collecting input

A program must obtain the required values before using them in calculations.

### Mistake 2: Forgetting to convert numeric input

`showInputDialog()` returns a `String`. Use `Integer.parseInt()` or `Double.parseDouble()` when numeric input is required.

### Mistake 3: Using integer division for an average

Incorrect:

```java
double averageMark = totalMarks / 2;
```

Correct:

```java
double averageMark = totalMarks / 2.0;
```

### Mistake 4: Displaying the wrong variable

Check that your output statement uses the calculated result rather than the original input.

### Mistake 5: Using an unclear output message

Instead of displaying only `77`, use a descriptive message such as:

```java
JOptionPane.showMessageDialog(null, "Total marks: " + totalMarks);
```

Meaningful labels make the output easier to understand.

### Mistake 6: Assuming all input is valid

If the user enters text such as `hello` where an integer is expected, `Integer.parseInt()` throws a `NumberFormatException`.

The examples in this topic assume that valid numeric input is entered. More robust input validation can be added in a later topic.

## 7. Practice Activities

### Activity 1: Student Average

Write a program that:

1. Requests two assessment marks.
2. Converts both values into integers.
3. Calculates the total and average.
4. Displays both results in a message dialog.

### Activity 2: Stationery Cost

Write a program that:

1. Requests the number of exercise books purchased.
2. Requests the price of one exercise book.
3. Converts both inputs into integers.
4. Calculates the total cost.
5. Displays the quantity, unit price and total cost.

### Activity 3: Percentage Calculator

Write a program that:

1. Requests the mark obtained and the maximum mark.
2. Converts both values into integers.
3. Calculates the percentage using real division.
4. Displays the percentage in a message dialog.

Use the formula:

\[
\text{Percentage} =
\frac{\text{Mark Obtained}}{\text{Maximum Mark}} \times 100
\]

Assume the maximum mark is greater than zero.

### Activity 4: Student Information

Write a program that requests a Student's name, grade and average mark.

Convert the grade to an integer and the average to a `double`.

Display all the information in a single message dialog.

### Activity 5: Identify the Stages

Study your solution to Activity 1.

Identify the statements responsible for:

- Input.
- Conversion.
- Processing.
- Output.

Explain why each stage is necessary.

## 8. Summary

- Input, processing and output are the three basic stages of many programs.
- Input collects information from the user.
- Conversion changes numeric text into a suitable data type.
- Processing performs
