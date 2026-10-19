
public class WhileLoops
{
    public static void main(String[] args)
    {
        // ============================================================
        // SECTION 1: WHAT IS A WHILE LOOP?
        // ============================================================
        // A while loop repeats a block of code while its condition
        // remains true.
        //
        // The condition is checked BEFORE the loop body executes.
        //
        // If the condition is false at the beginning, the loop body
        // will not execute at all.
        //
        // A while loop is useful when repetition depends on a
        // condition rather than a fixed number of repetitions.

        System.out.println("SECTION 1: BASIC WHILE LOOP");

        int counter = 1;

        while (counter <= 5)
        {
            System.out.println("Student number " + counter);

            // Increase counter so that the condition eventually
            // becomes false.
            counter++;
        }

        // ============================================================
        // SECTION 2: UNDERSTANDING THE LOOP CONDITION
        // ============================================================
        // The condition is counter <= 3.
        //
        // The loop continues while counter is less than or equal to 3.
        // Once counter becomes 4, the condition is false and the loop
        // stops.
        //
        // Always check whether the variable changes inside the loop.

        System.out.println();
        System.out.println("SECTION 2: LOOP CONDITION");

        counter = 1;

        while (counter <= 3)
        {
            System.out.println("Counter: " + counter);
            counter++;
        }

        System.out.println("Loop finished.");

        // ============================================================
        // SECTION 3: A WHILE LOOP THAT DOES NOT EXECUTE
        // ============================================================
        // The variable starts at 10.
        // The condition requires the variable to be less than 5.
        //
        // Since 10 < 5 is false, the loop body is skipped completely.

        System.out.println();
        System.out.println("SECTION 3: FALSE CONDITION");

        counter = 10;

        while (counter < 5)
        {
            System.out.println("This message will not display.");
            counter++;
        }

        System.out.println("The condition was false from the start.");

        // ============================================================
        // SECTION 4: COUNTING REPETITIONS
        // ============================================================
        // A counter records how many times something happens.
        //
        // In this example, the counter starts at 0.
        // It increases by 1 each time the loop executes.
        //
        // When counter reaches 4, the condition counter < 4 becomes
        // false and the loop stops.

        System.out.println();
        System.out.println("SECTION 4: COUNTING REPETITIONS");

        int repetitions = 0;

        while (repetitions < 4)
        {
            System.out.println("Repetition " + (repetitions + 1));
            repetitions++;
        }

        System.out.println("Total repetitions: " + repetitions);

        // ============================================================
        // SECTION 5: USING AN ACCUMULATOR
        // ============================================================
        // An accumulator stores a running total.
        //
        // The total starts at 0.
        // Each mark is added to the total.
        //
        // The loop stops when all three marks have been processed.
        //
        // The counter identifies which mark must be processed next.

        System.out.println();
        System.out.println("SECTION 5: TOTAL AND AVERAGE");

        int[] marks = {70, 80, 90};
        int index = 0;
        int total = 0;

        while (index < marks.length)
        {
            total = total + marks[index];
            index++;
        }

        double average = (double) total / marks.length;

        System.out.println("Total marks: " + total);
        System.out.println("Average mark: " + average);

        // ============================================================
        // SECTION 6: CONDITION-CONTROLLED REPETITION
        // ============================================================
        // Sometimes the number of repetitions depends on a condition.
        //
        // This example represents a Student completing homework tasks.
        // The loop continues while tasks remain.
        //
        // In a real program, the condition might depend on user input
        // or information stored in a file.

        System.out.println();
        System.out.println("SECTION 6: HOMEWORK TASKS");

        int tasksRemaining = 3;

        while (tasksRemaining > 0)
        {
            System.out.println("Complete a homework task.");

            tasksRemaining--;

            System.out.println("Tasks remaining: " + tasksRemaining);
        }

        System.out.println("All homework tasks completed.");

        // ============================================================
        // SECTION 7: NESTED SELECTION INSIDE A WHILE LOOP
        // ============================================================
        // A while loop can contain an if-else statement.
        //
        // The loop processes each Student's mark.
        // The if-else structure decides whether the Student passed.
        //
        // The index increases after every mark is checked so that
        // the program moves to the next Student.

        System.out.println();
        System.out.println("SECTION 7: PASS OR FAIL");

        int[] studentMarks = {45, 68, 82};
        int studentIndex = 0;

        while (studentIndex < studentMarks.length)
        {
            System.out.print("Student " + (studentIndex + 1) + ": ");

            if (studentMarks[studentIndex] >= 50)
            {
                System.out.println("Pass");
            }
            else
            {
                System.out.println("Fail");
            }

            studentIndex++;
        }

        // ============================================================
        // SECTION 8: VALIDATING A VALUE
        // ============================================================
        // Validation checks whether a value meets a requirement.
        //
        // This example uses a starting value of 0.
        // The loop continues while the value is outside the permitted
        // range of 1 to 12.
        //
        // The value is updated in the example so that the loop
        // eventually stops.
        //
        // In a real application, invalid values could be replaced
        // with new input from the user.

        System.out.println();
        System.out.println("SECTION 8: VALIDATION");

        int month = 0;

        while (month < 1 || month > 12)
        {
            System.out.println("Month " + month + " is invalid.");

            // Simulate receiving a valid month.
            month = 6;
        }

        System.out.println("Valid month: " + month);

        // ============================================================
        // SECTION 9: A WHILE LOOP WITH A RUNNING TOTAL
        // ============================================================
        // The program adds the numbers from 1 to 5.
        //
        // number is the counter.
        // sum is the accumulator.
        //
        // Each repetition adds the current number to sum.
        // The number is then increased so the next value is processed.

        System.out.println();
        System.out.println("SECTION 9: RUNNING TOTAL");

        int number = 1;
        int sum = 0;

        while (number <= 5)
        {
            sum = sum + number;
            number++;
        }

        System.out.println("Sum of numbers from 1 to 5: " + sum);

        // ============================================================
        // SECTION 10: COMMON WHILE-LOOP MISTAKES
        // ============================================================
        // 1. Forgetting to update the variable used in the condition.
        //    This can create an infinite loop.
        //
        // 2. Using the wrong relational operator.
        //
        // 3. Starting the counter at the wrong value.
        //
        // 4. Forgetting that a while loop might execute zero times.
        //
        // 5. Increasing the counter before processing the intended
        //    value, which may skip a value.
        //
        // 6. Using a condition that never becomes false.
        //
        // Before running a while loop, identify:
        // - The initial value.
        // - The condition.
        // - The statements that change the variable.
        // - The point at which the loop stops.

        // ============================================================
        // SECTION 11: PRACTICE CHALLENGE
        // ============================================================
        // Write a while loop that:
        //
        // 1. Starts a counter at 2.
        // 2. Displays the counter.
        // 3. Increases the counter by 2 each time.
        // 4. Stops when the counter is greater than 10.
        //
        // Predict the output before running the program.

        System.out.println();
        System.out.println("SECTION 11: PRACTICE CHALLENGE");

        counter = 2;

        while (counter <= 10)
        {
            System.out.println(counter);
            counter = counter + 2;
        }
    }
}
