
import java.util.Scanner;

/**
 * File: MethodsAndModularPrograms.java
 * Folder: 12-Integrated-Examples-and-Practice/Methods-and-Modular-Programs
 *
 * PURPOSE:
 * To demonstrate how methods can be used to divide a larger problem
 * into smaller, manageable tasks.
 *
 * SCENARIO:
 * A teacher enters the marks of several Students. The programme
 * validates the marks, calculates averages, determines results,
 * and displays a class summary.
 *
 * CONCEPTS DEMONSTRATED:
 * 1. Creating and calling void methods.
 * 2. Passing arguments to methods.
 * 3. Using parameters to receive values.
 * 4. Returning values from methods.
 * 5. Reusing methods instead of repeating code.
 * 6. Combining methods with selection and loops.
 */

public class MethodsAndModularPrograms {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Display the programme heading using a separate method.
        displayHeading();

        // Obtain the number of Students using a method that returns
        // a validated integer.

        int numberOfStudents = getValidNumberOfStudents(input);

        // These variables store information about the entire class.
        // They are updated as each Student is processed.

        int totalMarks = 0;
        int passCount = 0;

        // Process each Student.
        // The loop starts at 1 to make the Student number easy to follow.

        for (int studentNumber = 1;
                studentNumber <= numberOfStudents;
                studentNumber++) {

            System.out.println();
            System.out.println("Student " + studentNumber);

            // Get a valid mark using a reusable method.

            int mark = getValidMark(input);

            // Calculate the percentage using a method that returns
            // a double value.

            double percentage = calculatePercentage(mark, 100);

            // Determine the result using a method that returns
            // a boolean value.

            boolean passed = hasPassed(percentage);

            // Display the Student's result using a void method.
            // Values are passed as arguments to the method.

            displayStudentResult(studentNumber, percentage, passed);

            // Update the running total.
            // The current mark is added to the previous total.

            totalMarks = totalMarks + mark;

            // Increase the pass counter only when the Student passes.

            if (passed) {
                passCount++;
            }
        }

        // Calculate the class average after all Students have been
        // processed.

        double classAverage = calculateAverage(totalMarks, numberOfStudents);

        // Display the class summary using another void method.

        displayClassSummary(numberOfStudents, classAverage, passCount);

        input.close();
    }

    // =============================================================
    // METHOD 1: DISPLAY HEADING
    // =============================================================

    /**
     * Displays the heading.
     *
     * This is a void method because it performs an action but does
     * not return a value.
     */

    public static void displayHeading() {

        System.out.println("==================================");
        System.out.println("     STUDENT MARKS MANAGER");
        System.out.println("==================================");
    }

    // =============================================================
    // METHOD 2: GET VALID NUMBER OF STUDENTS
    // =============================================================

    /**
     * Requests the number of Students.
     *
     * Parameter:
     * input - the Scanner object used to obtain input.
     *
     * Return type:
     * int - the validated number of Students.
     */

    public static int getValidNumberOfStudents(Scanner input) {

        System.out.print("Enter the number of Students: ");
        int number = input.nextInt();

        // Repeat the prompt until the number is greater than zero.

        while (number <= 0) {
            System.out.println("Enter a number greater than zero.");
            System.out.print("Enter the number of Students: ");
            number = input.nextInt();
        }

        // Return the validated number to the calling method.

        return number;
    }

    // =============================================================
    // METHOD 3: GET VALID MARK
    // =============================================================

    /**
     * Requests a mark and validates that it is between 0 and 100.
     *
     * Parameter:
     * input - the Scanner object used to obtain input.
     *
     * Return type:
     * int - the validated mark.
     */

    public static int getValidMark(Scanner input) {

        System.out.print("Enter a mark out of 100: ");
        int mark = input.nextInt();

        while (mark < 0 || mark > 100) {
            System.out.println("Invalid mark. Enter a value from 0 to 100.");
            System.out.print("Enter a mark out of 100: ");
            mark = input.nextInt();
        }

        return mark;
    }

    // =============================================================
    // METHOD 4: CALCULATE PERCENTAGE
    // =============================================================

    /**
     * Calculates a mark as a percentage.
     *
     * Parameters:
     * mark - the mark obtained.
     * maximumMark - the maximum possible mark.
     *
     * Return type:
     * double - the calculated percentage.
     */

    public static double calculatePercentage(int mark, int maximumMark) {

        // Convert to double before division to avoid integer division.

        double percentage = (mark * 100.0) / maximumMark;

        return percentage;
    }

    // =============================================================
    // METHOD 5: DETERMINE WHETHER THE STUDENT PASSED
    // =============================================================

    /**
     * Determines whether the percentage meets the pass requirement.
     *
     * Parameter:
     * percentage - the Student's percentage.
     *
     * Return type:
     * boolean - true if the Student passed, otherwise false.
     */

    public static boolean hasPassed(double percentage) {

        if (percentage >= 50) {
            return true;
        } else {
            return false;
        }
    }

    // =============================================================
    // METHOD 6: DISPLAY INDIVIDUAL STUDENT RESULT
    // =============================================================

    /**
     * Displays a Student's number, percentage and result.
     *
     * Parameters:
     * studentNumber - the Student's position in the class.
     * percentage - the Student's calculated percentage.
     * passed - indicates whether the Student passed.
     *
     * This method is void because it displays information rather
     * than returning a value.
     */

    public static void displayStudentResult(
            int studentNumber, double percentage, boolean passed) {

        System.out.println("Student number: " + studentNumber);
        System.out.printf("Percentage: %.2f%%%n", percentage);

        if (passed) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }

    // =============================================================
    // METHOD 7: CALCULATE CLASS AVERAGE
    // =============================================================

    /**
     * Calculates the average of the marks entered.
     *
     * Parameters:
     * totalMarks - the sum of all marks.
     * numberOfStudents - the number of Students processed.
     *
     * Return type:
     * double - the class average.
     */

    public static double calculateAverage(
            int totalMarks, int numberOfStudents) {

        double average = totalMarks / (numberOfStudents * 1.0);

        return average;
    }

    // =============================================================
    // METHOD 8: DISPLAY CLASS SUMMARY
    // =============================================================

    /**
     * Displays the final class statistics.
     *
     * Parameters:
     * numberOfStudents - the number of Students processed.
     * classAverage - the average mark for the class.
     * passCount - the number of Students who passed.
     */

    public static void displayClassSummary(
            int numberOfStudents, double classAverage, int passCount) {

        System.out.println();
        System.out.println("========== CLASS SUMMARY ==========");
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.printf("Class average: %.2f%%%n", classAverage);
        System.out.println("Students who passed: " + passCount);
        System.out.println("Students who failed: "
                + (numberOfStudents - passCount));
        System.out.println("===================================");
    }
}

/*
SAMPLE RUN

==================================
     STUDENT MARKS MANAGER
==================================
Enter the number of Students: 3

Student 1
Enter a mark out of 100: 75
Student number: 1
Percentage: 75.00%
Result: Pass

Student 2
Enter a mark out of 100: 42
Student number: 2
Percentage: 42.00%
Result: Fail

Student 3
Enter a mark out of 100: 85
Student number: 3
Percentage: 85.00%
Result: Pass

========== CLASS SUMMARY ==========
Number of Students: 3
Class average: 67.33%
Students who passed: 2
Students who failed: 1
===================================

Note: The sample run assumes valid numeric input.
*/
