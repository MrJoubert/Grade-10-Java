
import java.util.Scanner;

/**
 * File: AlgorithmPractice.java
 * Folder: 12-Integrated-Examples-and-Practice/Algorithm-Practice
 *
 * PURPOSE:
 * This programme demonstrates how to develop algorithms by combining
 * variables, calculations, selection statements and loops.
 *
 * SCENARIO:
 * A teacher enters the marks of several Students. The programme calculates
 * each Student's percentage, determines whether the Student has passed,
 * and calculates the class average and highest mark.
 *
 * CONCEPTS DEMONSTRATED:
 * 1. Declaring and initialising variables.
 * 2. Obtaining input using Scanner.
 * 3. Using a loop to repeat instructions.
 * 4. Using selection statements to make decisions.
 * 5. Performing calculations.
 * 6. Keeping track of totals and the highest value.
 * 7. Displaying formatted output.
 */

public class AlgorithmPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // QUESTION 1: Collect the number of Students.
        // The number determines how many times the loop must execute.

        System.out.print("Enter the number of Students: ");
        int numberOfStudents = input.nextInt();

        // A valid number of Students must be greater than zero.
        // This prevents division by zero when calculating the average.

        while (numberOfStudents <= 0) {
            System.out.println("The number of Students must be greater than zero.");
            System.out.print("Enter the number of Students: ");
            numberOfStudents = input.nextInt();
        }

        // QUESTION 2: Initialise the variables needed by the algorithm.
        // totalMarks accumulates all the marks entered.
        // highestMark stores the highest mark entered so far.

        int totalMarks = 0;
        int highestMark = 0;

        // QUESTION 3: Process each Student's mark.
        // The loop starts at 1 because it is easier to relate to
        // Student 1, Student 2, Student 3, and so on.

        for (int studentNumber = 1;
                studentNumber <= numberOfStudents;
                studentNumber++) {

            System.out.println();
            System.out.println("Student " + studentNumber);

            // Obtain a mark out of 100.

            System.out.print("Enter the mark out of 100: ");
            int mark = input.nextInt();

            // Validate the mark.
            // A mark cannot be below 0 or above 100.

            while (mark < 0 || mark > 100) {
                System.out.println("Invalid mark. Enter a mark from 0 to 100.");
                System.out.print("Enter the mark out of 100: ");
                mark = input.nextInt();
            }

            // Calculate the percentage.
            // Since the mark is already out of 100, the percentage
            // has the same numerical value as the mark.

            double percentage = (mark / 100.0) * 100;

            // Determine whether the Student has passed.
            // In this example, 50% is the pass requirement.

            String result;

            if (percentage >= 50) {
                result = "Pass";
            } else {
                result = "Fail";
            }

            // Display the result for the current Student.

            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Result: " + result);

            // Add the current mark to the running total.
            // The total is updated after every Student.

            totalMarks = totalMarks + mark;

            // Compare the current mark with the highest mark so far.
            // The first mark will replace 0 if it is greater than 0.

            if (mark > highestMark) {
                highestMark = mark;
            }
        }

        // QUESTION 4: Calculate the class average.
        // The total is divided by the number of Students.
        // Multiplying or dividing by 1.0 ensures a decimal result.

        double classAverage = totalMarks / (numberOfStudents * 1.0);

        // QUESTION 5: Display the final class statistics.

        System.out.println();
        System.out.println("========== CLASS SUMMARY ==========");
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Total of all marks: " + totalMarks);
        System.out.println("Highest mark: " + highestMark);
        System.out.println("Class average: " + classAverage + "%");
        System.out.println("===================================");

        input.close();
    }
}

/*
SAMPLE RUN

Enter the number of Students: 3

Student 1
Enter the mark out of 100: 65
Percentage: 65.0%
Result: Pass

Student 2
Enter the mark out of 100: 42
Percentage: 42.0%
Result: Fail

Student 3
Enter the mark out of 100: 87
Percentage: 87.0%
Result: Pass

========== CLASS SUMMARY ==========
Number of Students: 3
Total of all marks: 194
Highest mark: 87
Class average: 64.66666666666667%
===================================

Note: The sample run assumes the user enters valid input.
The class average may display many decimal places because it is not rounded.
*/
