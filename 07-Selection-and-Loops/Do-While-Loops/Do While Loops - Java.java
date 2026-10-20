
public class DoWhileLoops
{
    public static void main(String[] args)
    {
        // ============================================================
        // SECTION 1: WHAT IS A DO-WHILE LOOP?
        // ============================================================

        // A DO-WHILE loop repeats a block of code while a condition
        // remains TRUE.
        //
        // The important difference between a WHILE loop and a
        // DO-WHILE loop is WHEN the condition is checked.
        //
        // WHILE LOOP:
        // 1. Check the condition.
        // 2. If TRUE, execute the loop body.
        // 3. Repeat.
        //
        // DO-WHILE LOOP:
        // 1. Execute the loop body.
        // 2. Check the condition.
        // 3. If TRUE, repeat.
        //
        // Because the DO-WHILE condition is checked AFTER the loop
        // body, the body always executes at least once.
        //
        // GENERAL STRUCTURE:
        //
        // do
        // {
        //     Statements to repeat.
        // }
        // while (condition);
        //
        // IMPORTANT:
        // A DO-WHILE loop has a semicolon after its WHILE condition.
        // Do not forget this semicolon!


        // ============================================================
        // SECTION 2: A SIMPLE DO-WHILE LOOP
        // ============================================================

        System.out.println("SECTION 2: SIMPLE DO-WHILE LOOP");

        int counter = 1;

        // The DO block contains the statements that will be repeated.
        do
        {
            System.out.println("Student number: " + counter);

            // Increase the counter so that the condition can
            // eventually become FALSE.
            counter++;
        }
        while (counter <= 5);

        // Trace:
        //
        // counter = 1: display 1, increase to 2.
        // counter = 2: display 2, increase to 3.
        // counter = 3: display 3, increase to 4.
        // counter = 4: display 4, increase to 5.
        // counter = 5: display 5, increase to 6.
        // Check 6 <= 5: FALSE. The loop ends.

        System.out.println();


        // ============================================================
        // SECTION 3: A DO-WHILE LOOP EXECUTES AT LEAST ONCE
        // ============================================================

        System.out.println("SECTION 3: CONDITION INITIALLY FALSE");

        int number = 10;

        // The condition number < 5 is already FALSE.
        //
        // However, Java does NOT check this condition before entering
        // the DO block.
        //
        // Java first displays the number.
        // It then checks number < 5.
        // Since the condition is FALSE, the loop ends immediately
        // after this first iteration.

        do
        {
            System.out.println("Number: " + number);
        }
        while (number < 5);

        // Even though the condition was FALSE from the beginning,
        // the message was displayed once.

        System.out.println();


        // ============================================================
        // SECTION 4: COMPARING WHILE AND DO-WHILE
        // ============================================================

        System.out.println("SECTION 4: WHILE LOOP COMPARISON");

        int whileNumber = 10;

        // A WHILE loop checks its condition before executing the body.
        //
        // Since whileNumber < 5 is FALSE, the loop body is skipped.
        while (whileNumber < 5)
        {
            System.out.println("WHILE number: " + whileNumber);
        }

        // No message from the WHILE body is displayed.
        System.out.println("WHILE loop finished.");

        System.out.println();

        int doWhileNumber = 10;

        // A DO-WHILE loop executes its body before checking
        // the condition.
        do
        {
            System.out.println("DO-WHILE number: " + doWhileNumber);
        }
        while (doWhileNumber < 5);

        System.out.println("DO-WHILE loop finished.");

        System.out.println();


        // ============================================================
        // SECTION 5: COUNTING WITH A DO-WHILE LOOP
        // ============================================================

        System.out.println("SECTION 5: COUNTING");

        int studentNumber = 1;

        // A DO-WHILE loop can be used for counting, just like
        // a FOR loop or a WHILE loop.
        //
        // This loop displays the numbers from 1 to 3.

        do
        {
            System.out.println("Processing Student " + studentNumber);

            // Update the counter.
            studentNumber++;
        }
        while (studentNumber <= 3);

        // Once studentNumber becomes 4, the condition is FALSE.

        System.out.println();


        // ============================================================
        // SECTION 6: COUNTING BACKWARDS
        // ============================================================

        System.out.println("SECTION 6: COUNTING BACKWARDS");

        int countdown = 5;

        // A DO-WHILE loop can also count backwards.
        //
        // countdown-- is equivalent to:
        // countdown = countdown - 1;

        do
        {
            System.out.println(countdown);
            countdown--;
        }
        while (countdown >= 1);

        // When countdown becomes 0, the condition is FALSE.

        System.out.println();


        // ============================================================
        // SECTION 7: USING A DO-WHILE LOOP WITH A COUNTER
        // ============================================================

        System.out.println("SECTION 7: COUNTING HIGH MARKS");

        // A counter keeps track of how many times something happens.
        //
        // In this example, we process three Student marks.
        // We count how many marks are at least 75.

        int mark1 = 85;
        int mark2 = 42;
        int mark3 = 76;

        int student = 1;
        int highMarkCount = 0;

        do
        {
            int currentMark;

            // Select the mark for the current Student.
            if (student == 1)
            {
                currentMark = mark1;
            }
            else if (student == 2)
            {
                currentMark = mark2;
            }
            else
            {
                currentMark = mark3;
            }

            System.out.println("Student " + student
                    + " mark: " + currentMark);

            // Check whether the current mark is at least 75.
            if (currentMark >= 75)
            {
                // Increase the counter only when the condition is TRUE.
                highMarkCount++;
            }

            // Move to the next Student.
            student++;
        }
        while (student <= 3);

        System.out.println("Number of high marks: " + highMarkCount);

        System.out.println();


        // ============================================================
        // SECTION 8: USING A DO-WHILE LOOP WITH AN ACCUMULATOR
        // ============================================================

        System.out.println("SECTION 8: TOTAL AND AVERAGE");

        // An accumulator stores a running total.
        //
        // Here, we add three Student marks and calculate the average.

        int markA = 70;
        int markB = 80;
        int markC = 90;

        int studentCount = 1;
        int totalMarks = 0;

        do
        {
            int currentMark;

            if (studentCount == 1)
            {
                currentMark = markA;
            }
            else if (studentCount == 2)
            {
                currentMark = markB;
            }
            else
            {
                currentMark = markC;
            }

            // Add the current mark to the running total.
            totalMarks = totalMarks + currentMark;

            // Move to the next Student.
            studentCount++;
        }
        while (studentCount <= 3);

        // The total is 70 + 80 + 90 = 240.
        System.out.println("Total marks: " + totalMarks);

        // Divide by 3.0 to perform real-number division.
        double average = totalMarks / 3.0;

        System.out.println("Average mark: " + average);

        System.out.println();


        // ============================================================
        // SECTION 9: REPEATING A MENU
        // ============================================================

        System.out.println("SECTION 9: MENU EXAMPLE");

        // DO-WHILE loops are often useful for menus.
        //
        // A menu should normally be displayed at least once.
        // The user can then choose whether to continue or exit.
        //
        // This demonstration uses predetermined choices rather
        // than keyboard input so that the program can run immediately.
        //
        // In a real menu program, the choice could be obtained
        // using JOptionPane or another input method.

        int menuChoice = 1;
        int menuDisplays = 0;

        do
        {
            menuDisplays++;

            System.out.println("SCHOOL MANAGEMENT MENU");
            System.out.println("1. View marks");
            System.out.println("2. View attendance");
            System.out.println("0. Exit");

            // Simulate the option selected by the user.
            System.out.println("Selected option: " + menuChoice);

            if (menuChoice == 1)
            {
                System.out.println("Opening Student marks.");
            }
            else if (menuChoice == 2)
            {
                System.out.println("Opening Student attendance.");
            }
            else if (menuChoice == 0)
            {
                System.out.println("Exiting the menu.");
            }
            else
            {
                System.out.println("Invalid menu choice.");
            }

            // For this demonstration, the first simulated choice
            // is 1 and the second is 0.
            //
            // After the first display, change the choice to 0.
            // The next iteration will display the menu again and
            // then exit.
            if (menuDisplays == 1)
            {
                menuChoice = 0;
            }
        }
        while (menuChoice != 0);

        System.out.println("Menu closed.");

        System.out.println();


        // ============================================================
        // SECTION 10: VALIDATING A VALUE WITH DO-WHILE
        // ============================================================

        System.out.println("SECTION 10: VALIDATION EXAMPLE");

        // Validation checks whether a value meets a requirement.
        //
        // A DO-WHILE loop is useful when an action must happen at
        // least once before a condition is checked.
        //
        // In this example, we simulate a mark being checked.
        // The loop continues while the mark is outside the range
        // of 0 to 100.
        //
        // A real program could request a new value during each
        // iteration until the input is valid.

        int enteredMark = 120;
        int attempts = 0;

        do
        {
            attempts++;

            System.out.println("Attempt " + attempts);
            System.out.println("Mark entered: " + enteredMark);

            // This demonstration changes the invalid value to a
            // valid value on the next attempt.
            if (enteredMark < 0 || enteredMark > 100)
            {
                System.out.println("Invalid mark.");

                // Simulate entering a corrected mark.
                enteredMark = 85;
            }
        }
        while (enteredMark < 0 || enteredMark > 100);

        System.out.println("Valid mark accepted: " + enteredMark);

        System.out.println();


        // ============================================================
        // SECTION 11: COMMON MISTAKES
        // ============================================================

        // MISTAKE 1: FORGETTING THE SEMICOLON
        //
        // Correct:
        //
        // do
        // {
        //     System.out.println("Hello");
        // }
        // while (condition);
        //
        // The semicolon after the WHILE condition is required.


        // MISTAKE 2: ASSUMING THE CONDITION IS CHECKED FIRST
        //
        // In a DO-WHILE loop, the body executes before the condition
        // is checked.
        //
        // Even if the condition is initially FALSE, the body
        // still executes once.


        // MISTAKE 3: FORGETTING TO UPDATE THE COUNTER
        //
        // Incorrect:
        //
        // int count = 1;
        //
        // do
        // {
        //     System.out.println(count);
        // }
        // while (count <= 5);
        //
        // The counter never changes.
        // Since count remains 1, the condition remains TRUE.
        // This creates an infinite loop.
        //
        // Correct:
        //
        // int count = 1;
        //
        // do
        // {
        //     System.out.println(count);
        //     count++;
        // }
        // while (count <= 5);


        // MISTAKE 4: USING THE WRONG CONDITION
        //
        // If you want to count from 1 to 5, use:
        //
        // while (count <= 5);
        //
        // Do not accidentally use count < 5 if the value 5
        // must also be processed.


        // MISTAKE 5: CONFUSING WHILE AND DO-WHILE
        //
        // WHILE:
        // The condition is checked first.
        // The body might execute zero times.
        //
        // DO-WHILE:
        // The body executes first.
        // The body executes at least once.


        // ============================================================
        // SECTION 12: PRACTICE CHALLENGE
        // ============================================================

        // SCENARIO:
        // A teacher wants to process Student marks until all three
        // marks have been processed.
        //
        // TASK:
        // 1. Use a DO-WHILE loop.
        // 2. Process each mark.
        // 3. Calculate the total.
        // 4. Count how many marks are at least 50.
        // 5. Display the total and the pass count.
        //
        // Try writing the solution yourself before examining
        // the worked example below.

        int practiceMark1 = 45;
        int practiceMark2 = 68;
        int practiceMark3 = 82;

        int practiceStudent = 1;
        int practiceTotal = 0;
        int passCount = 0;

        do
        {
            int currentMark;

            if (practiceStudent == 1)
            {
                currentMark = practiceMark1;
            }
            else if (practiceStudent == 2)
            {
                currentMark = practiceMark2;
            }
            else
            {
                currentMark = practiceMark3;
            }

            // Add the current mark to the total.
            practiceTotal = practiceTotal + currentMark;

            // Count the mark as a pass if it is at least 50.
            if (currentMark >= 50)
            {
                passCount++;
            }

            System.out.println("Processed mark: " + currentMark);

            // Move to the next Student.
            practiceStudent++;
        }
        while (practiceStudent <= 3);

        System.out.println("Total marks: " + practiceTotal);
        System.out.println("Number of passes: " + passCount);
    }
}
