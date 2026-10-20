
import java.util.Scanner;

/**
 * File: VariablesAndCalculations.java
 * Folder: 12-Integrated-Examples-and-Practice/Variables-and-Calculations
 *
 * PURPOSE:
 * To demonstrate how variables and calculations are used to solve
 * practical problems in Java.
 *
 * SCENARIO:
 * A school programme calculates Student marks, averages, discounts
 * and school activity costs.
 *
 * CONCEPTS DEMONSTRATED:
 * 1. Declaring and initialising variables.
 * 2. Using constants.
 * 3. Performing arithmetic calculations.
 * 4. Understanding integer and decimal division.
 * 5. Using type conversion.
 * 6. Applying operator precedence.
 * 7. Calculating percentages.
 * 8. Formatting numerical output.
 * 9. Combining calculations in a practical programme.
 */

public class VariablesAndCalculations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // =========================================================
        // EXAMPLE 1: DECLARING AND INITIALISING VARIABLES
        // =========================================================

        System.out.println("EXAMPLE 1: VARIABLES");
        System.out.println("-------------------");

        // A variable stores a value that can be used later.
        // The data type determines the kind of value it can store.

        String studentName = "Aiden Smith";
        int grade = 10;
        int age = 16;
        double averageMark = 78.5;
        boolean passed = true;

        System.out.println("Student: " + studentName);
        System.out.println("Grade: " + grade);
        System.out.println("Age: " + age);
        System.out.println("Average: " + averageMark);
        System.out.println("Passed: " + passed);

        // A variable can be updated after it has been initialised.

        age = age + 1;

        System.out.println("Age next year: " + age);

        // =========================================================
        // EXAMPLE 2: CONSTANTS
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 2: CONSTANTS");
        System.out.println("-------------------");

        // A constant stores a value that cannot be reassigned.
        // The final keyword makes a variable a constant.

        final double PASS_MARK = 50.0;
        final double DISTINCTION_MARK = 80.0;

        double mark = 85.0;

        System.out.println("Pass requirement: " + PASS_MARK);
        System.out.println("Distinction requirement: " + DISTINCTION_MARK);

        if (mark >= DISTINCTION_MARK) {
            System.out.println("The Student achieved a distinction.");
        } else if (mark >= PASS_MARK) {
            System.out.println("The Student passed.");
        } else {
            System.out.println("The Student failed.");
        }

        // =========================================================
        // EXAMPLE 3: ARITHMETIC OPERATORS
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 3: ARITHMETIC OPERATORS");
        System.out.println("-------------------------------");

        int firstNumber = 17;
        int secondNumber = 5;

        // Addition, subtraction and multiplication.

        System.out.println("Addition: "
                + (firstNumber + secondNumber));

        System.out.println("Subtraction: "
                + (firstNumber - secondNumber));

        System.out.println("Multiplication: "
                + (firstNumber * secondNumber));

        // Integer division discards the decimal portion.

        System.out.println("Integer division: "
                + (firstNumber / secondNumber));

        // Modulus (%) returns the remainder after division.

        System.out.println("Remainder: "
                + (firstNumber % secondNumber));

        // Decimal division preserves the fractional portion.

        System.out.println("Decimal division: "
                + (firstNumber / 5.0));

        // =========================================================
        // EXAMPLE 4: OPERATOR PRECEDENCE
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 4: OPERATOR PRECEDENCE");
        System.out.println("------------------------------");

        int calculation1 = 10 + 5 * 2;
        int calculation2 = (10 + 5) * 2;

        // Multiplication takes priority over addition.

        System.out.println("10 + 5 * 2 = " + calculation1);

        // Brackets change the order in which the calculation occurs.

        System.out.println("(10 + 5) * 2 = " + calculation2);

        // =========================================================
        // EXAMPLE 5: CALCULATING AVERAGES
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 5: STUDENT AVERAGE");
        System.out.println("-------------------------");

        int itMark = 78;
        int mathematicsMark = 84;
        int englishMark = 69;

        // Add the marks and divide by the number of subjects.
        // Dividing by 3.0 allows the answer to contain decimals.

        double average = (itMark + mathematicsMark + englishMark) / 3.0;

        System.out.printf("IT mark: %d%n", itMark);
        System.out.printf("Mathematics mark: %d%n", mathematicsMark);
        System.out.printf("English mark: %d%n", englishMark);
        System.out.printf("Average: %.2f%%%n", average);

        // =========================================================
        // EXAMPLE 6: TYPE CONVERSION
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 6: TYPE CONVERSION");
        System.out.println("-------------------------");

        int totalMarks = 257;
        int numberOfSubjects = 3;

        // When both operands are integers, division produces
        // an integer result.

        int integerAverage = totalMarks / numberOfSubjects;

        System.out.println("Integer average: " + integerAverage);

        // Multiplying by 1.0 converts the calculation to decimal
        // arithmetic.

        double decimalAverage = totalMarks / (numberOfSubjects * 1.0);

        System.out.println("Decimal average: " + decimalAverage);

        // Explicit casting can also convert an integer to a double.

        double convertedTotal = (double) totalMarks;

        System.out.println("Converted total: " + convertedTotal);

        // =========================================================
        // EXAMPLE 7: PERCENTAGE AND DISCOUNT
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 7: PERCENTAGE AND DISCOUNT");
        System.out.println("----------------------------------");

        double originalPrice = 450.00;
        double discountRate = 15.0;

        // Divide the discount percentage by 100 to obtain
        // its decimal equivalent.

        double discountAmount = originalPrice * (discountRate / 100.0);

        double discountedPrice = originalPrice - discountAmount;

        System.out.printf("Original price: R%.2f%n", originalPrice);
        System.out.printf("Discount rate: %.2f%%%n", discountRate);
        System.out.printf("Discount amount: R%.2f%n", discountAmount);
        System.out.printf("Discounted price: R%.2f%n", discountedPrice);

        // =========================================================
        // EXAMPLE 8: SCHOOL ACTIVITY COST CALCULATOR
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 8: SCHOOL ACTIVITY COST");
        System.out.println("------------------------------");

        // Constants store the fixed costs used by the programme.

        final double TRANSPORT_COST = 120.00;
        final double ENTRY_COST = 85.00;

        System.out.print("Enter the number of Students attending: ");
        int numberOfStudents = input.nextInt();

        // Validate the number of Students.

        while (numberOfStudents <= 0) {
            System.out.println("Enter a number greater than zero.");
            System.out.print("Enter the number of Students attending: ");
            numberOfStudents = input.nextInt();
        }

        // Calculate the cost for one Student.

        double costPerStudent = TRANSPORT_COST + ENTRY_COST;

        // Calculate the total cost for the group.

        double totalCost = costPerStudent * numberOfStudents;

        // Calculate the cost if the school receives a 10% discount.

        final double GROUP_DISCOUNT = 10.0;

        double discount = totalCost * (GROUP_DISCOUNT / 100.0);
        double finalCost = totalCost - discount;

        // Display the results with two decimal places.

        System.out.println();
        System.out.println("========== ACTIVITY COST ==========");
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.printf("Transport per Student: R%.2f%n", TRANSPORT_COST);
        System.out.printf("Entry per Student: R%.2f%n", ENTRY_COST);
        System.out.printf("Cost per Student: R%.2f%n", costPerStudent);
        System.out.printf("Total before discount: R%.2f%n", totalCost);
        System.out.printf("Discount: R%.2f%n", discount);
        System.out.printf("Final cost: R%.2f%n", finalCost);
        System.out.println("===================================");

        input.close();
    }
}

/*
SAMPLE OUTPUT EXTRACTS

EXAMPLE 1: VARIABLES
-------------------
Student: Aiden Smith
Grade: 10
Age: 16
Average: 78.5
Passed: true
Age next year: 17

EXAMPLE 2: CONSTANTS
-------------------
Pass requirement: 50.0
Distinction requirement: 80.0
The Student achieved a distinction.

EXAMPLE 3: ARITHMETIC OPERATORS
-------------------------------
Addition: 22
Subtraction: 12
Multiplication: 85
Integer division: 3
Remainder: 2
Decimal division: 3.4

EXAMPLE 4: OPERATOR PRECEDENCE
------------------------------
10 + 5 * 2 = 20
(10 + 5) * 2 = 30

EXAMPLE 5: STUDENT AVERAGE
-------------------------
IT mark: 78
Mathematics mark: 84
English mark: 69
Average: 77.00%

EXAMPLE 6: TYPE CONVERSION
-------------------------
Integer average: 85
Decimal average: 85.66666666666667
Converted total: 257.0

EXAMPLE 7: PERCENTAGE AND DISCOUNT
----------------------------------
Original price: R450.00
Discount rate: 15.00%
Discount amount: R67.50
Discounted price: R382.50

EXAMPLE 8: SCHOOL ACTIVITY COST
------------------------------
Enter the number of Students attending: 3

========== ACTIVITY COST ==========
Number of Students: 3
Transport per Student: R120.00
Entry per Student: R85.00
Cost per Student: R205.00
Total before discount: R615.00
Discount: R61.50
Final cost: R553.50
===================================

Note: Each example runs in sequence in the same programme.
The final example requires user input.
*/
