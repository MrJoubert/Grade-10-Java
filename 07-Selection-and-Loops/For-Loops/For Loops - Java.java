
public class ForLoops
{
    public static void main(String[] args)
    {
        // ============================================================
        // SECTION 1: WHAT IS A FOR LOOP?
        // ============================================================

        // A FOR loop repeats a group of statements.
        //
        // It is particularly useful when we know how many times
        // a set of instructions must be repeated.
        //
        // Imagine that a teacher wants to display five Student numbers.
        // We could write five separate println statements.
        // However, a FOR loop allows us to write the instruction once.
        //
        // GENERAL STRUCTURE:
        //
        // for (initialisation; condition; update)
        // {
        //     Statements to repeat.
        // }
        //
        // The three parts inside the brackets have different purposes:
        //
        // 1. INITIALISATION
        //    Creates and initialises the counter.
        //
        // 2. CONDITION
        //    Determines whether the loop should execute again.
        //
        // 3. UPDATE
        //    Changes the counter after each iteration.
        //
        // An ITERATION is one execution of the loop body.


        // ============================================================
        // SECTION 2: YOUR FIRST FOR LOOP
        // ============================================================

        System.out.println("SECTION 2: FIRST FOR LOOP");

        for (int counter = 1; counter <= 5; counter++)
        {
            System.out.println("Student number: " + counter);
        }

        // UNDERSTANDING THE LOOP:
        //
        // int counter = 1
        // The counter begins at 1. This happens once.
        //
        // counter <= 5
        // Java checks this condition before every iteration.
        //
        // counter++
        // After the loop body executes, the counter increases by 1.
        //
        // The loop displays 1, 2, 3, 4 and 5.
        //
        // After displaying 5, the counter increases to 6.
        // Java checks 6 <= 5.
        // This is FALSE, so the loop ends.


        // ============================================================
        // SECTION 3: THE ORDER OF EXECUTION
        // ============================================================

        System.out.println();
        System.out.println("SECTION 3: ORDER OF EXECUTION");

        // It is important to understand the order in which Java
        // processes a FOR loop.
        //
        // The order is:
        //
        // STEP 1: Initialise the counter.
        // STEP 2: Check the condition.
        // STEP 3: Execute the loop body if the condition is TRUE.
        // STEP 4: Execute the update.
        // STEP 5: Return to STEP 2.
        //
        // If the condition is FALSE, Java skips the loop body.

        for (int number = 1; number <= 3; number++)
        {
            System.out.println("Current number: " + number);
        }

        System.out.println("Loop completed.");


        // ============================================================
        // SECTION 4: TRACING A FOR LOOP
        // ============================================================

        System.out.println();
        System.out.println("SECTION 4: TRACING");

        // A TRACE TABLE helps us follow the changing values
        // of variables during a loop.
        //
        // Consider:
        //
        // for (int count = 1; count <= 4; count++)
        //
        // The loop works as follows:
        //
        // Iteration | count | Condition | Output
        // ----------|-------|-----------|-------
        // 1         | 1     | TRUE      | 1
        // 2         | 2     | TRUE      | 2
        // 3         | 3     | TRUE      | 3
        // 4         | 4     | TRUE      | 4
        // End       | 5     | FALSE     | Nothing
        //
        // The condition is checked one final time after the last
        // iteration. When it becomes FALSE, the loop ends.

        for (int count = 1; count <= 4; count++)
        {
            System.out.println("Count: " + count);
        }


        // ============================================================
        // SECTION 5: CHANGING THE STARTING VALUE
        // ============================================================

        System.out.println();
        System.out.println("SECTION 5: CHANGING THE START");

        // A FOR loop does not have to start at 1.
        //
        // Here, the counter begins at 10.
        // It increases until it reaches 13.

        for (int counter = 10; counter <= 13; counter++)
        {
            System.out.println(counter);
        }


        // ============================================================
        // SECTION 6: COUNTING BACKWARDS
        // ============================================================

        System.out.println();
        System.out.println("SECTION 6: COUNTING BACKWARDS");

        // The update can decrease the counter.
        //
        // counter-- is equivalent to:
        // counter = counter - 1;
        //
        // The counter begins at 5.
        // The loop continues while the counter is at least 1.

        for (int counter = 5; counter >= 1; counter--)
        {
            System.out.println(counter);
        }

        // Once counter becomes 0, counter >= 1 is FALSE.


        // ============================================================
        // SECTION 7: COUNTING IN STEPS
        // ============================================================

        System.out.println();
        System.out.println("SECTION 7: COUNTING IN STEPS OF TWO");

        // The update can change the counter by more than 1.
        //
        // counter = counter + 2 increases the counter by 2.
        //
        // The loop displays the even numbers from 2 to 10.

        for (int counter = 2; counter <= 10; counter = counter + 2)
        {
            System.out.println(counter);
        }


        // ============================================================
        // SECTION 8: COUNTING ODD NUMBERS
        // ============================================================

        System.out.println();
        System.out.println("SECTION 8: ODD NUMBERS");

        // Starting at 1 and increasing by 2 produces odd numbers.
        //
        // The sequence is:
        // 1, 3, 5, 7, 9.

        for (int counter = 1; counter <= 9; counter = counter + 2)
        {
            System.out.println(counter);
        }


        // ============================================================
        // SECTION 9: CALCULATING A TOTAL
        // ============================================================

        System.out.println();
        System.out.println("SECTION 9: ACCUMULATOR");

        // An ACCUMULATOR stores a running total.
        //
        // Always initialise the total before the loop.
        // A common starting value is 0.
        //
        // In this example, we add the numbers from 1 to 5.
        //
        // total = total + counter;
        //
        // This means:
        // Take the existing total and add the current counter value.

        int total = 0;

        for (int counter = 1; counter <= 5; counter++)
        {
            total = total + counter;

            // Display the running total after each iteration.
            System.out.println("Adding " + counter
                    + ", running total: " + total);
        }

        System.out.println("Final total: " + total);

        // The final total is:
        // 1 + 2 + 3 + 4 + 5 = 15.


        // ============================================================
        // SECTION 10: CALCULATING AN AVERAGE
        // ============================================================

        System.out.println();
        System.out.println("SECTION 10: AVERAGE MARK");

        // Suppose a Student has written four assessments.
        //
        // We want to calculate the total and the average.
        //
        // The average is:
        // Total of all marks / Number of marks.
        //
        // We will use a loop to process the marks.

        int mark1 = 65;
        int mark2 = 72;
        int mark3 = 88;
        int mark4 = 75;

        int totalMarks = 0;

        for (int assessment = 1; assessment <= 4; assessment++)
        {
            int currentMark;

            // Select the mark for the current assessment.
            if (assessment == 1)
            {
                currentMark = mark1;
            }
            else if (assessment == 2)
            {
                currentMark = mark2;
            }
            else if (assessment == 3)
            {
                currentMark = mark3;
            }
            else
            {
                currentMark = mark4;
            }

            // Add the current mark to the accumulator.
            totalMarks = totalMarks + currentMark;
        }

        // The total is 65 + 72 + 88 + 75 = 300.
        System.out.println("Total marks: " + totalMarks);

        // Divide by 4.0 to ensure real-number division.
        double average = totalMarks / 4.0;

        System.out.println("Average mark: " + average);


        // ============================================================
        // SECTION 11: USING A COUNTER TO COUNT PASSES
        // ============================================================

        System.out.println();
        System.out.println("SECTION 11: COUNTING PASSES");

        // A COUNTER counts how many times a condition is TRUE.
        //
        // An ACCUMULATOR adds numerical values.
        //
        // These two concepts are different.
        //
        // Here, we count how many Students achieved a mark of at
        // least 50.

        int firstMark = 45;
        int secondMark = 67;
        int thirdMark = 82;
        int fourthMark = 39;
        int fifthMark = 55;

        int passCount = 0;

        for (int student = 1; student <= 5; student++)
        {
            int currentMark;

            // Select the mark for the current Student.
            if (student == 1)
            {
                currentMark = firstMark;
            }
            else if (student == 2)
            {
                currentMark = secondMark;
            }
            else if (student == 3)
            {
                currentMark = thirdMark;
            }
            else if (student == 4)
            {
                currentMark = fourthMark;
            }
            else
            {
                currentMark = fifthMark;
            }

            // Check whether the Student passed.
            if (currentMark >= 50)
            {
                passCount++;
            }
        }

        System.out.println("Number of passes: " + passCount);


        // ============================================================
        // SECTION 12: USING IF-ELSE INSIDE A FOR LOOP
        // ============================================================

        System.out.println();
        System.out.println("SECTION 12: PASS OR FAIL");

        // A loop can contain a selection structure.
        //
        // The loop repeats for each Student.
        // The IF-ELSE decides whether that Student passed.
        //
        // This is a common structure in practical programming tasks.

        for (int student = 1; student <= 5; student++)
        {
            int currentMark;

            if (student == 1)
            {
                currentMark = firstMark;
            }
            else if (student == 2)
            {
                currentMark = secondMark;
            }
            else if (student == 3)
            {
                currentMark = thirdMark;
            }
            else if (student == 4)
            {
                currentMark = fourthMark;
            }
            else
            {
                currentMark = fifthMark;
            }

            System.out.print("Student " + student + ": ");

            if (currentMark >= 50)
            {
                System.out.println("Pass");
            }
            else
            {
                System.out.println("Fail");
            }
        }


        // ============================================================
        // SECTION 13: USING A CONDITION TO FILTER VALUES
        // ============================================================

        System.out.println();
        System.out.println("SECTION 13: FILTERING VALUES");

        // A loop can process a range of values while an IF statement
        // decides which values should be displayed.
        //
        // Here, we display only numbers that are at least 5.
        //
        // The loop still processes every number from 1 to 10.
        // The IF statement controls which numbers are displayed.

        for (int number = 1; number <= 10; number++)
        {
            if (number >= 5)
            {
                System.out.println(number);
            }
        }


        // ============================================================
        // SECTION 14: NESTED FOR LOOPS
        // ============================================================

        System.out.println();
        System.out.println("SECTION 14: NESTED LOOPS");

        // A NESTED LOOP is a loop inside another loop.
        //
        // The OUTER loop controls the rows.
        // The INNER loop controls the repetitions within each row.
        //
        // For every one iteration of the outer loop, the inner loop
        // completes all of its iterations.
        //
        // Here:
        // Outer loop: 3 iterations.
        // Inner loop: 2 iterations for every outer iteration.
        //
        // Total inner-loop executions: 3 x 2 = 6.

        for (int row = 1; row <= 3; row++)
        {
            for (int column = 1; column <= 2; column++)
            {
                System.out.println("Row " + row
                        + ", Column " + column);
            }
        }


        // ============================================================
        // SECTION 15: COMMON MISTAKES
        // ============================================================

        // MISTAKE 1: USING THE WRONG CONDITION
        //
        // for (int count = 1; count < 5; count++)
        //
        // This displays 1, 2, 3 and 4.
        //
        // If you want to display 1 to 5, use:
        //
        // for (int count = 1; count <= 5; count++)


        // MISTAKE 2: FORGETTING TO UPDATE THE COUNTER
        //
        // A normal FOR loop includes an update such as count++.
        //
        // If the counter never changes and the condition remains
        // TRUE, the loop can run indefinitely.


        // MISTAKE 3: INITIALISING THE TOTAL INSIDE THE LOOP
        //
        // Incorrect:
        //
        // for (int count = 1; count <= 5; count++)
        // {
        //     int total = 0;
        //     total = total + count;
        // }
        //
        // The total is reset to 0 during every iteration.
        //
        // Correct:
        //
        // int total = 0;
        //
        // for (int count = 1; count <= 5; count++)
        // {
        //     total = total + count;
        // }


        // MISTAKE 4: CONFUSING COUNTERS AND ACCUMULATORS
        //
        // Counter:
        // passCount++;
        //
        // Accumulator:
        // totalMarks = totalMarks + currentMark;
        //
        // The counter increases by 1.
        // The accumulator increases by the value being added.


        // MISTAKE 5: INTEGER DIVISION
        //
        // If both operands are integers, Java performs integer division.
        //
        // For example:
        // int average = 5 / 2;
        //
        // The result is 2, not 2.5.
        //
        // Use:
        // double average = 5 / 2.0;
        //
        // The result is 2.5.


        // ============================================================
        // SECTION 16: PRACTICE CHALLENGE
        // ============================================================

        // SCENARIO:
        // A teacher wants to analyse six Student marks.
        //
        // The program must:
        // 1. Display each mark.
        // 2. Calculate the total.
        // 3. Calculate the average.
        // 4. Count how many Students passed.
        // 5. Count how many Students achieved at least 75.
        //
        // TASK:
        // Try to write the solution yourself first.
        // Then compare your solution with the worked example below.
        //
        // The marks are stored in separate variables to keep the
        // focus on FOR loops and selection rather than arrays.

        int practiceMark1 = 48;
        int practiceMark2 = 76;
        int practiceMark3 = 91;
        int practiceMark4 = 54;
        int practiceMark5 = 33;
        int practiceMark6 = 80;

        int practiceTotal = 0;
        int practicePassCount = 0;
        int practiceHighMarkCount = 0;

        for (int student = 1; student <= 6; student++)
        {
            int currentMark;

            if (student == 1)
            {
                currentMark = practiceMark1;
            }
            else if (student == 2)
            {
                currentMark = practiceMark2;
            }
            else if (student == 3)
            {
                currentMark = practiceMark3;
            }
            else if (student == 4)
            {
                currentMark = practiceMark4;
            }
            else if (student == 5)
            {
                currentMark = practiceMark5;
            }
            else
            {
                currentMark = practiceMark6;
            }

            System.out.println("Student " + student
                    + " mark: " + currentMark);

            // Calculate the total.
            practiceTotal = practiceTotal + currentMark;

            // Count Students who passed.
            if (currentMark >= 50)
            {
                practicePassCount++;
            }

            // Count Students who achieved at least 75.
            if (currentMark >= 75)
            {
                practiceHighMarkCount++;
            }
        }

        // Calculate the average using real-number division.
        double practiceAverage = practiceTotal / 6.0;

        System.out.println("Total marks: " + practiceTotal);
        System.out.println("Average mark: " + practiceAverage);
        System.out.println("Number of passes: " + practicePassCount);
        System.out.println("Marks of at least 75: "
                + practiceHighMarkCount);
    }
}
