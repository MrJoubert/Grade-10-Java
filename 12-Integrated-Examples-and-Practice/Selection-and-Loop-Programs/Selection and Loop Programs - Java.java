
import java.util.Scanner;

/**
 * File: SelectionAndLoopPrograms.java
 * Folder: 12-Integrated-Examples-and-Practice/Selection-and-Loop-Programs
 *
 * PURPOSE:
 * To demonstrate how selection statements and loops can be combined
 * to solve programming problems.
 *
 * SCENARIO:
 * A school uses a menu-driven programme to process Student marks.
 *
 * CONCEPTS DEMONSTRATED:
 * 1. if and if-else statements.
 * 2. Nested selection.
 * 3. switch statements.
 * 4. for loops.
 * 5. while loops.
 * 6. do-while loops.
 * 7. Counters and accumulators.
 * 8. Combining loops and selection.
 */

public class SelectionAndLoopPrograms {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // =========================================================
        // EXAMPLE 1: IF-ELSE SELECTION
        // =========================================================

        System.out.println("EXAMPLE 1: PASS OR FAIL");
        System.out.println("----------------------");

        System.out.print("Enter a mark out of 100: ");
        int mark = input.nextInt();

        // Determine the result based on the mark.

        if (mark >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        // =========================================================
        // EXAMPLE 2: NESTED SELECTION
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 2: PERFORMANCE CATEGORY");
        System.out.println("-------------------------------");

        System.out.print("Enter a mark out of 100: ");
        int performanceMark = input.nextInt();

        // First determine whether the Student passed.
        // If the Student passed, determine the performance category.

        if (performanceMark >= 50) {

            if (performanceMark >= 80) {
                System.out.println("Performance: Distinction");
            } else {
                System.out.println("Performance: Pass");
            }

        } else {
            System.out.println("Performance: Fail");
        }

        // =========================================================
        // EXAMPLE 3: SWITCH STATEMENT
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 3: SUBJECT SELECTION");
        System.out.println("----------------------------");

        System.out.println("1. Information Technology");
        System.out.println("2. Computer Applications Technology");
        System.out.println("3. Mathematics");

        System.out.print("Select a subject (1-3): ");
        int subjectChoice = input.nextInt();

        // Use switch when one variable must be compared with
        // several specific values.

        switch (subjectChoice) {
            case 1:
                System.out.println("Selected: Information Technology");
                break;

            case 2:
                System.out.println("Selected: Computer Applications Technology");
                break;

            case 3:
                System.out.println("Selected: Mathematics");
                break;

            default:
                System.out.println("Invalid subject selection.");
                break;
        }

        // =========================================================
        // EXAMPLE 4: FOR LOOP WITH SELECTION
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 4: PROCESSING FIVE MARKS");
        System.out.println("--------------------------------");

        int totalMarks = 0;
        int passCount = 0;

        // The for loop repeats exactly five times.
        // Each repetition processes one Student's mark.

        for (int studentNumber = 1;
                studentNumber <= 5;
                studentNumber++) {

            System.out.print("Enter the mark for Student "
                    + studentNumber + ": ");

            int studentMark = input.nextInt();

            // Validate the mark before using it.

            while (studentMark < 0 || studentMark > 100) {
                System.out.println("Enter a mark from 0 to 100.");
                System.out.print("Enter the mark for Student "
                        + studentNumber + ": ");

                studentMark = input.nextInt();
            }

            // Add the mark to the running total.

            totalMarks = totalMarks + studentMark;

            // Use selection to determine whether the Student passed.

            if (studentMark >= 50) {
                passCount++;
                System.out.println("Result: Pass");
            } else {
                System.out.println("Result: Fail");
            }
        }

        // Calculate the average after all five marks are entered.

        double average = totalMarks / 5.0;

        System.out.println();
        System.out.println("Total marks: " + totalMarks);
        System.out.printf("Average: %.2f%%%n", average);
        System.out.println("Number of Students who passed: " + passCount);

        // =========================================================
        // EXAMPLE 5: WHILE LOOP
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 5: COUNTING UP TO A TARGET");
        System.out.println("----------------------------------");

        System.out.print("Enter a positive target number: ");
        int target = input.nextInt();

        // Validate the target.

        while (target <= 0) {
            System.out.println("The target must be greater than zero.");
            System.out.print("Enter a positive target number: ");
            target = input.nextInt();
        }

        // A while loop checks its condition before each repetition.
        // It continues while count is less than or equal to target.

        int count = 1;

        while (count <= target) {
            System.out.println("Count: " + count);
            count++;
        }

        // =========================================================
        // EXAMPLE 6: DO-WHILE LOOP AND MENU
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 6: REPEATING MENU");
        System.out.println("-------------------------");

        int menuChoice;

        // A do-while loop always executes at least once.
        // This makes it useful for displaying a menu.

        do {

            System.out.println();
            System.out.println("STUDENT MENU");
            System.out.println("1. Display a message");
            System.out.println("2. Display a reminder");
            System.out.println("3. Exit");

            System.out.print("Enter your choice (1-3): ");
            menuChoice = input.nextInt();

            // Validate the menu choice.

            while (menuChoice < 1 || menuChoice > 3) {
                System.out.println("Invalid choice.");
                System.out.print("Enter your choice (1-3): ");
                menuChoice = input.nextInt();
            }

            // Respond to the selected option.

            switch (menuChoice) {
                case 1:
                    System.out.println("Welcome to the Student programme.");
                    break;

                case 2:
                    System.out.println("Remember to submit your homework.");
                    break;

                case 3:
                    System.out.println("Exiting the menu.");
                    break;
            }

        } while (menuChoice != 3);

        input.close();
    }
}

/*
SAMPLE OUTPUT EXTRACTS

EXAMPLE 1: PASS OR FAIL
----------------------
Enter a mark out of 100: 65
Result: Pass

EXAMPLE 2: PERFORMANCE CATEGORY
-------------------------------
Enter a mark out of 100: 85
Performance: Distinction

EXAMPLE 3: SUBJECT SELECTION
----------------------------
1. Information Technology
2. Computer Applications Technology
3. Mathematics
Select a subject (1-3): 1
Selected: Information Technology

EXAMPLE 4: PROCESSING FIVE MARKS
--------------------------------
Enter the mark for Student 1: 70
Result: Pass
Enter the mark for Student 2: 40
Result: Fail
Enter the mark for Student 3: 85
Result: Pass
Enter the mark for Student 4: 60
Result: Pass
Enter the mark for Student 5: 45
Result: Fail

Total marks: 300
Average: 60.00%
Number of Students who passed: 3

EXAMPLE 5: COUNTING UP TO A TARGET
----------------------------------
Enter a positive target number: 3
Count: 1
Count: 2
Count: 3

EXAMPLE 6: REPEATING MENU
-------------------------
STUDENT MENU
1. Display a message
2. Display a reminder
3. Exit
Enter your choice (1-3): 2
Remember to submit your homework.

STUDENT MENU
1. Display a message
2. Display a reminder
3. Exit
Enter your choice (1-3): 3
Exiting the menu.

Note: These are extracts from one possible run.
Each example runs in sequence in the same programme.
*/
