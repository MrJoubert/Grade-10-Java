
import java.util.Scanner;

/**
 * File: ExamStyleQuestions.java
 * Folder: 12-Integrated-Examples-and-Practice/Exam-Style-Questions
 *
 * PURPOSE:
 * This programme demonstrates how to solve exam-style programming
 * questions by applying previously learnt Java concepts.
 *
 * QUESTIONS:
 * Question 1: Calculate a Student's final mark.
 * Question 2: Determine whether a Student qualifies for an award.
 * Question 3: Process several Students and calculate class statistics.
 *
 * CONCEPTS DEMONSTRATED:
 * Variables, constants, input, calculations, selection, loops,
 * validation, counters, accumulators and formatted output.
 */

public class ExamStyleQuestions {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // =========================================================
        // QUESTION 1: CALCULATING A FINAL MARK
        // =========================================================

        System.out.println("QUESTION 1: FINAL MARK");
        System.out.println("----------------------");

        // A Student's final mark consists of two components:
        // a theory mark worth 60% and a practical mark worth 40%.

        System.out.print("Enter the theory mark out of 100: ");
        double theoryMark = input.nextDouble();

        System.out.print("Enter the practical mark out of 100: ");
        double practicalMark = input.nextDouble();

        // Apply the weighting to each component.
        // Multiplying by 0.60 is the same as calculating 60%.

        double finalMark = (theoryMark * 0.60)
                + (practicalMark * 0.40);

        System.out.printf("Final mark: %.2f%%%n", finalMark);

        // =========================================================
        // QUESTION 2: AWARD ELIGIBILITY
        // =========================================================

        System.out.println();
        System.out.println("QUESTION 2: AWARD ELIGIBILITY");
        System.out.println("-----------------------------");

        // A Student qualifies for an academic award if:
        // 1. The average is at least 80%.
        // 2. The Student has completed all required assignments.

        System.out.print("Enter the Student's average: ");
        double average = input.nextDouble();

        System.out.print("Have all assignments been completed (true/false)? ");
        boolean assignmentsCompleted = input.nextBoolean();

        // Both conditions must be true.
        // The && operator means AND.

        if (average >= 80 && assignmentsCompleted) {
            System.out.println("The Student qualifies for the award.");
        } else {
            System.out.println("The Student does not qualify for the award.");
        }

        // =========================================================
        // QUESTION 3: PROCESSING MULTIPLE STUDENTS
        // =========================================================

        System.out.println();
        System.out.println("QUESTION 3: CLASS STATISTICS");
        System.out.println("----------------------------");

        // First, obtain the number of Students to process.

        System.out.print("Enter the number of Students: ");
        int numberOfStudents = input.nextInt();

        // Validate the number of Students.
        // At least one Student must be processed.

        while (numberOfStudents <= 0) {
            System.out.println("Enter a number greater than zero.");
            System.out.print("Enter the number of Students: ");
            numberOfStudents = input.nextInt();
        }

        // Initialise the accumulator and counters.
        // An accumulator stores a running total.
        // A counter records how many times something occurs.

        int totalMarks = 0;
        int passCount = 0;
        int distinctionCount = 0;

        // Process each Student.
        // The loop counter starts at 1 for easier identification.

        for (int studentNumber = 1;
                studentNumber <= numberOfStudents;
                studentNumber++) {

            System.out.println();
            System.out.println("Student " + studentNumber);

            System.out.print("Enter the mark out of 100: ");
            int mark = input.nextInt();

            // Reject marks outside the valid range.

            while (mark < 0 || mark > 100) {
                System.out.println("Invalid mark. Enter a mark from 0 to 100.");
                System.out.print("Enter the mark out of 100: ");
                mark = input.nextInt();
            }

            // Add the current mark to the running total.

            totalMarks = totalMarks + mark;

            // Count Students who have passed.
            // A pass is defined as 50% or higher.

            if (mark >= 50) {
                passCount = passCount + 1;
            }

            // Count distinctions.
            // A distinction is defined as 80% or higher.

            if (mark >= 80) {
                distinctionCount = distinctionCount + 1;
            }

            // Display the result for the current Student.

            System.out.println("Mark: " + mark);

            if (mark >= 50) {
                System.out.println("Result: Pass");
            } else {
                System.out.println("Result: Fail");
            }
        }

        // Calculate the class average after processing all Students.
        // Convert the total to a decimal calculation.

        double classAverage = totalMarks / (numberOfStudents * 1.0);

        // Display the final statistics.

        System.out.println();
        System.out.println("========== CLASS REPORT ==========");
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Total marks: " + totalMarks);
        System.out.printf("Class average: %.2f%%%n", classAverage);
        System.out.println("Students who passed: " + passCount);
        System.out.println("Students with distinctions: " + distinctionCount);
        System.out.println("==================================");

        input.close();
    }
}

/*
SAMPLE RUN

QUESTION 1: FINAL MARK
----------------------
Enter the theory mark out of 100: 70
Enter the practical mark out of 100: 90
Final mark: 78.00%

QUESTION 2: AWARD ELIGIBILITY
-----------------------------
Enter the Student's average: 85
Have all assignments been completed (true/false)? true
The Student qualifies for the award.

QUESTION 3: CLASS STATISTICS
----------------------------
Enter the number of Students: 3

Student 1
Enter the mark out of 100: 45
Mark: 45
Result: Fail

Student 2
Enter the mark out of 100: 80
Mark: 80
Result: Pass

Student 3
Enter the mark out of 100: 65
Mark: 65
Result: Pass

========== CLASS REPORT ==========
Number of Students: 3
Total marks: 190
Class average: 63.33%
Students who passed: 2
Students with distinctions: 1
==================================

Note: The sample run shows one possible set of inputs.
*/
