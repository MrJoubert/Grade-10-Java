
public class CountingAndConditionControlledLoops
{
    public static void main(String[] args)
    {
        // ============================================================
        // SECTION 1: WHAT IS A LOOP?
        // ============================================================

        // A loop repeats a group of statements.
        //
        // Without a loop, we might have to write the same statement
        // many times:
        //
        // System.out.println("Student");
        // System.out.println("Student");
        // System.out.println("Student");
        //
        // A loop allows us to write the instruction once and repeat it.
        //
        // There are two important types of loop control:
        //
        // 1. COUNTING-CONTROLLED LOOP
        //    The number of repetitions is known or controlled by
        //    a counter.
        //
        // 2. CONDITION-CONTROLLED LOOP
        //    The loop continues while a condition is TRUE.
        //
        // A FOR loop is commonly used for counting-controlled tasks.
        // A WHILE loop is commonly used for condition-controlled tasks.
        //
        // These are common uses, not absolute rules. The best loop
        // depends on the requirements of the problem.


        // ============================================================
        // SECTION 2: COUNTING-CONTROLLED LOOP
        // ============================================================

        System.out.println("SECTION 2: COUNTING-CONTROLLED LOOP");

        // Suppose a teacher wants to display five Student numbers.
        //
        // We know that exactly FIVE repetitions are required.
        // A FOR loop is a suitable choice.

        for (int counter = 1; counter <= 5; counter++)
        {
            // The counter begins at 1.
            // The condition checks whether counter is at most 5.
            // counter++ increases the counter by 1 after each iteration.
            System.out.println("Student number: " + counter);
        }

        // TRACE THE LOOP:
        //
        // Iteration 1: counter = 1, condition TRUE, display 1.
        // Iteration 2: counter = 2, condition TRUE, display 2.
        // Iteration 3: counter = 3, condition TRUE, display 3.
        // Iteration 4: counter = 4, condition TRUE, display 4.
        // Iteration 5: counter = 5, condition TRUE, display 5.
        // Next check:  counter = 6, condition FALSE, loop ends.
        //
        // The loop body executes five times.
        System.out.println();


        // ============================================================
        // SECTION 3: UNDERSTANDING THE THREE PARTS OF A FOR LOOP
        // ============================================================

        System.out.println("SECTION 3: PARTS OF A FOR LOOP");

        // General structure:
        //
        // for (initialisation; condition; update)
        // {
        //     Statements to repeat.
        // }
        //
        // INITIALISATION:
        // int count = 1
        // Creates the counter and gives it its starting value.
        // This runs once, before the loop begins.
        //
        // CONDITION:
        // count <= 3
        // Java checks this before every iteration.
        // If it is TRUE, the loop body executes.
        // If it is FALSE, the loop ends.
        //
        // UPDATE:
        // count++
        // Increases count by 1 after each iteration.
        //
        // IMPORTANT:
        // The condition must eventually become FALSE.
        // Otherwise, the loop may never end.

        for (int count = 1; count <= 3; count++)
        {
            System.out.println("Count is " + count);
        }

        System.out.println();


        // ============================================================
        // SECTION 4: COUNTING BACKWARDS
        // ============================================================

        System.out.println("SECTION 4: COUNTING BACKWARDS");

        // A counter does not have to increase.
        // It can also decrease.
        //
        // Start at 5.
        // Continue while counter >= 1.
        // Decrease the counter by 1 after each iteration.

        for (int counter = 5; counter >= 1; counter--)
        {
            System.out.println(counter);
        }

        // counter-- is equivalent to counter = counter - 1.
        System.out.println();


        // ============================================================
        // SECTION 5: COUNTING IN STEPS
        // ============================================================

        System.out.println("SECTION 5: COUNTING IN STEPS OF TWO");

        // The update does not have to increase the counter by 1.
        //
        // counter = counter + 2 increases it by 2 each time.
        // This produces the even numbers from 2 to 10.

        for (int counter = 2; counter <= 10; counter = counter + 2)
        {
            System.out.println(counter);
        }

        System.out.println();


        // ============================================================
        // SECTION 6: CONDITION-CONTROLLED LOOP
        // ============================================================

        System.out.println("SECTION 6: CONDITION-CONTROLLED LOOP");

        // A condition-controlled loop repeats while a condition
        // remains TRUE.
        //
        // A WHILE loop is often appropriate when the number of
        // repetitions is not known in advance.
        //
        // In this example, we process Student numbers while the
        // number is at most 3.

        int studentNumber = 1;

        while (studentNumber <= 3)
        {
            System.out.println("Processing Student " + studentNumber);

            // Update the variable used in the condition.
            // Without this statement, studentNumber would remain 1.
            // The condition would stay TRUE and the loop would
            // continue indefinitely.
            studentNumber++;
        }

        // When studentNumber becomes 4, studentNumber <= 3 is FALSE.
        // Java exits the loop and continues here.
        System.out.println("Processing complete.");
        System.out.println();


        // ============================================================
        // SECTION 7: CONDITION-CONTROLLED LOOP WITH A BOOLEAN
        // ============================================================

        System.out.println("SECTION 7: BOOLEAN CONDITION");

        // A Boolean variable stores either true or false.
        // It can be used directly as a WHILE loop condition.
        //
        // This example represents a process that continues while
        // there are still Students to process.

        boolean studentsRemaining = true;
        int processedStudents = 0;

        while (studentsRemaining)
        {
            processedStudents++;

            System.out.println("Student processed: " + processedStudents);

            // In a real program, a condition would determine whether
            // more Students remain.
            //
            // For this demonstration, stop after three Students.
            if (processedStudents == 3)
            {
                studentsRemaining = false;
            }
        }

        // Once studentsRemaining becomes false, the WHILE loop ends.
        System.out.println("No more Students to process.");
        System.out.println();


        // ============================================================
        // SECTION 8: WHAT IS A COUNTER?
        // ============================================================

        System.out.println("SECTION 8: COUNTERS");

        // A COUNTER keeps track of how many times something happens.
        //
        // A counter commonly begins at 0.
        //
        // When an event occurs, increase the counter by 1.
        //
        // counter = counter + 1;
        //
        // This is equivalent to:
        //
        // counter++;
        //
        // The longer form is often easier for beginners to understand.

        int highMarks = 0;

        int mark1 = 85;
        int mark2 = 42;
        int mark3 = 76;
        int mark4 = 91;

        // Check the first mark.
        if (mark1 >= 75)
        {
            highMarks = highMarks + 1;
        }

        // Check the second mark.
        if (mark2 >= 75)
        {
            highMarks = highMarks + 1;
        }

        // Check the third mark.
        if (mark3 >= 75)
        {
            highMarks = highMarks + 1;
        }

        // Check the fourth mark.
        if (mark4 >= 75)
        {
            highMarks = highMarks + 1;
        }

        // Marks 85, 76 and 91 meet the requirement.
        System.out.println("Number of high marks: " + highMarks);
        System.out.println();


        // ============================================================
        // SECTION 9: USING A COUNTER INSIDE A LOOP
        // ============================================================

        System.out.println("SECTION 9: COUNTER INSIDE A LOOP");

        // The previous example checked each mark separately.
        // A loop can repeat the same check for several Students.
        //
        // This makes the program shorter and easier to maintain.

        int numberOfHighMarks = 0;

        // These are the marks that will be processed.
        int studentMark1 = 85;
        int studentMark2 = 42;
        int studentMark3 = 76;
        int studentMark4 = 91;

        // The loop processes four Students.
        for (int student = 1; student <= 4; student++)
        {
            int currentMark;

            // Select the mark for the current Student.
            if (student == 1)
            {
                currentMark = studentMark1;
            }
            else if (student == 2)
            {
                currentMark = studentMark2;
            }
            else if (student == 3)
            {
                currentMark = studentMark3;
            }
            else
            {
                currentMark = studentMark4;
            }

            // If the current mark is at least 75, increase the counter.
            if (currentMark >= 75)
            {
                numberOfHighMarks = numberOfHighMarks + 1;
            }
        }

        System.out.println("Number of Students with high marks: "
                + numberOfHighMarks);
        System.out.println();


        // ============================================================
        // SECTION 10: WHAT IS AN ACCUMULATOR?
        // ============================================================

        System.out.println("SECTION 10: ACCUMULATORS");

        // An ACCUMULATOR stores a running total.
        //
        // A counter counts how many times something happens.
        // An accumulator adds values together.
        //
        // Example:
        // total = total + mark;
        //
        // Each new mark is added to the existing total.
        //
        // IMPORTANT:
        // The accumulator must normally be initialised to 0.
        // Otherwise, the total will begin with an incorrect value.

        int totalMarks = 0;

        totalMarks = totalMarks + 75;
        totalMarks = totalMarks + 62;
        totalMarks = totalMarks + 88;

        System.out.println("Total marks: " + totalMarks);
        System.out.println();


        // ============================================================
        // SECTION 11: USING AN ACCUMULATOR INSIDE A LOOP
        // ============================================================

        System.out.println("SECTION 11: TOTAL AND AVERAGE");

        // We can use a loop to add several marks together.
        //
        // For this example, the marks are stored in separate variables.
        // The loop selects each mark and adds it to the total.
        //
        // In a later section, arrays can make this process more direct.
        // For now, the example focuses on the loop and accumulator.

        int total = 0;

        int markA = 70;
        int markB = 80;
        int markC = 90;

        for (int student = 1; student <= 3; student++)
        {
            int currentMark;

            if (student == 1)
            {
                currentMark = markA;
            }
            else if (student == 2)
            {
                currentMark = markB;
            }
            else
            {
                currentMark = markC;
            }

            // Add the current mark to the running total.
            total = total + currentMark;
        }

        // The total is 70 + 80 + 90 = 240.
        System.out.println("Total marks: " + total);

        // To calculate the average, divide the total by the number
        // of Students.
        //
        // Use 3.0 rather than 3 to ensure real-number division.
        double average = total / 3.0;

        System.out.println("Average mark: " + average);
        System.out.println();


        // ============================================================
        // SECTION 12: THE DIFFERENCE BETWEEN A COUNTER AND ACCUMULATOR
        // ============================================================

        // COUNTER:
        // Increases to count events.
        //
        // Example:
        // numberOfStudents = numberOfStudents + 1;
        //
        // ACCUMULATOR:
        // Adds values to a running total.
        //
        // Example:
        // totalMarks = totalMarks + currentMark;
        //
        // A counter may count three Students.
        // An accumulator may add their marks to obtain a total.


        // ============================================================
        // SECTION 13: A CONDITION-CONTROLLED TOTAL
        // ============================================================

        System.out.println("SECTION 13: CONDITION-CONTROLLED TOTAL");

        // Imagine that a teacher wants to keep adding marks while
        // the current mark is below 100.
        //
        // This example uses a condition-controlled loop to demonstrate
        // that the loop ends when the condition becomes FALSE.
        //
        // The marks are supplied by the program for demonstration.
        // No keyboard input is required.

        int currentValue = 60;
        int runningTotal = 0;
        int numberProcessed = 0;

        while (currentValue <= 90)
        {
            runningTotal = runningTotal + currentValue;
            numberProcessed++;

            System.out.println("Value processed: " + currentValue);

            // Increase the value so that the loop eventually ends.
            currentValue = currentValue + 10;
        }

        // The values processed are 60, 70, 80 and 90.
        // The next value is 100, so the condition is FALSE.
        System.out.println("Number processed: " + numberProcessed);
        System.out.println("Running total: " + runningTotal);
        System.out.println();


        // ============================================================
        // SECTION 14: COMMON LOOP MISTAKES
        // ============================================================

        // MISTAKE 1: FORGETTING TO UPDATE A WHILE LOOP VARIABLE
        //
        // Incorrect:
        //
        // int count = 1;
        //
        // while (count <= 5)
        // {
        //     System.out.println(count);
        // }
        //
        // count never changes.
        // The condition remains TRUE, causing an infinite loop.
        //
        // Correct:
        //
        // int count = 1;
        //
        // while (count <= 5)
        // {
        //     System.out.println(count);
        //     count++;
        // }


        // MISTAKE 2: USING THE WRONG CONDITION
        //
        // Consider:
        //
        // for (int count = 1; count < 5; count++)
        //
        // This loop displays 1, 2, 3 and 4.
        // It does not display 5.
        //
        // To display 1 to 5, use:
        //
        // for (int count = 1; count <= 5; count++)


        // MISTAKE 3: INITIALISING A TOTAL INCORRECTLY
        //
        // A total should normally begin at 0.
        //
        // int total = 0;
        //
        // If total starts at an unrelated value, the final answer
        // will be incorrect.


        // MISTAKE 4: CONFUSING A COUNTER WITH AN ACCUMULATOR
        //
        // A counter increases by the number of events.
        // An accumulator adds the values being processed.


        // MISTAKE 5: DIVIDING BY THE WRONG NUMBER
        //
        // The average is:
        //
        // average = total / numberOfValues;
        //
        // The divisor must represent the number of values included
        // in the total, not the sum of the values.


        // ============================================================
        // SECTION 15: PRACTICE CHALLENGE
        // ============================================================

        // SCENARIO:
        // A teacher wants to process four Student marks.
        //
        // The program must:
        // 1. Process all four marks.
        // 2. Calculate the total.
        // 3. Calculate the average.
        // 4. Count how many Students achieved at least 75.
        //
        // TASK:
        // Complete the code using a counting-controlled loop,
        // an accumulator and a counter.
        //
        // Test the program using different marks.
        //
        // The worked solution is included below so that students
        // can compare their attempt with a correct implementation.

        int practiceMark1 = 65;
        int practiceMark2 = 80;
        int practiceMark3 = 92;
        int practiceMark4 = 48;

        int practiceTotal = 0;
        int practiceHighMarkCount = 0;

        for (int student = 1; student <= 4; student++)
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
            else
            {
                currentMark = practiceMark4;
            }

            // ACCUMULATOR:
            // Add the current mark to the running total.
            practiceTotal = practiceTotal + currentMark;

            // COUNTER:
            // Increase the count only when the condition is TRUE.
            if (currentMark >= 75)
            {
                practiceHighMarkCount = practiceHighMarkCount + 1;
            }
        }

        double practiceAverage = practiceTotal / 4.0;

        System.out.println("SECTION 15: PRACTICE CHALLENGE");
        System.out.println("Total marks: " + practiceTotal);
        System.out.println("Average mark: " + practiceAverage);
        System.out.println("Students with marks of at least 75: "
                + practiceHighMarkCount);
    }
}
