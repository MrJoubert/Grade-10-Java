
public class NestedLoops
{
    public static void main(String[] args)
    {
        // ============================================================
        // SECTION 1: WHAT IS A NESTED LOOP?
        // ============================================================
        // A nested loop is a loop inside another loop.
        //
        // The OUTER loop controls how many times the INNER loop runs.
        //
        // Each time the outer loop executes once, the inner loop
        // completes ALL its repetitions.
        //
        // Example:
        // Outer loop: 3 repetitions
        // Inner loop: 2 repetitions per outer repetition
        //
        // Total inner-loop repetitions = 3 x 2 = 6

        System.out.println("SECTION 1: BASIC NESTED LOOP");

        for (int row = 1; row <= 3; row++)
        {
            // This statement executes once for each outer-loop cycle.
            System.out.println("Row " + row);

            for (int column = 1; column <= 2; column++)
            {
                // The inner loop runs from 1 to 2 for EVERY row.
                System.out.println("  Column " + column);
            }
        }

        // ============================================================
        // SECTION 2: UNDERSTANDING THE EXECUTION ORDER
        // ============================================================
        // Follow the values carefully:
        //
        // 1. row becomes 1.
        // 2. column becomes 1, and the inner statement executes.
        // 3. column becomes 2, and the inner statement executes.
        // 4. The inner loop finishes.
        // 5. row becomes 2.
        // 6. column starts again at 1.
        //
        // IMPORTANT:
        // The inner-loop variable starts again when the inner loop
        // is reached during the next outer-loop repetition.

        System.out.println();
        System.out.println("SECTION 2: EXECUTION ORDER");

        for (int row = 1; row <= 2; row++)
        {
            for (int column = 1; column <= 3; column++)
            {
                System.out.println("row = " + row
                        + ", column = " + column);
            }
        }

        // ============================================================
        // SECTION 3: DISPLAYING A RECTANGULAR PATTERN
        // ============================================================
        // The outer loop controls the number of rows.
        // The inner loop controls the number of symbols in each row.
        //
        // print() displays text without moving to a new line.
        // println() displays text and then moves to a new line.
        //
        // After the inner loop finishes, println() moves to the next
        // line before the outer loop starts its next repetition.

        System.out.println();
        System.out.println("SECTION 3: RECTANGULAR PATTERN");

        for (int row = 1; row <= 3; row++)
        {
            for (int column = 1; column <= 4; column++)
            {
                System.out.print("* ");
            }

            // Move to the next line after displaying four stars.
            System.out.println();
        }

        // ============================================================
        // SECTION 4: A NUMBER PATTERN
        // ============================================================
        // The inner loop variable can be used to display numbers.
        //
        // Each row displays the numbers 1 to 5.
        // The outer loop repeats the complete row four times.

        System.out.println();
        System.out.println("SECTION 4: NUMBER PATTERN");

        for (int row = 1; row <= 4; row++)
        {
            for (int number = 1; number <= 5; number++)
            {
                System.out.print(number + " ");
            }

            System.out.println();
        }

        // ============================================================
        // SECTION 5: MULTIPLICATION TABLE
        // ============================================================
        // Nested loops are useful when two values must be combined.
        //
        // The outer loop selects the first number.
        // The inner loop multiplies that number by 1, 2 and 3.
        //
        // When the first number changes, the inner loop starts again
        // at 1 and completes all three multiplications.

        System.out.println();
        System.out.println("SECTION 5: MULTIPLICATION TABLE");

        for (int number = 2; number <= 4; number++)
        {
            for (int multiplier = 1; multiplier <= 3; multiplier++)
            {
                int answer = number * multiplier;

                System.out.println(number + " x "
                        + multiplier + " = " + answer);
            }
        }

        // ============================================================
        // SECTION 6: NESTED LOOPS WITH STUDENT DATA
        // ============================================================
        // Imagine that a school has three classes.
        // Each class has two Students.
        //
        // The outer loop represents the class number.
        // The inner loop represents the Student number in that class.
        //
        // This example uses loop counters to generate simple labels.

        System.out.println();
        System.out.println("SECTION 6: CLASSES AND STUDENTS");

        for (int classNumber = 1; classNumber <= 3; classNumber++)
        {
            System.out.println("Class " + classNumber);

            for (int studentNumber = 1;
                    studentNumber <= 2;
                    studentNumber++)
            {
                System.out.println("  Student " + studentNumber);
            }
        }

        // ============================================================
        // SECTION 7: USING IF INSIDE A NESTED LOOP
        // ============================================================
        // A selection statement can be placed inside a loop.
        //
        // Here, the program displays only even numbers.
        //
        // The inner loop checks the numbers from 1 to 5.
        // The if statement displays a number only when it is even.
        //
        // The modulus operator (%) gives the remainder after division.
        // An even number divided by 2 has a remainder of 0.

        System.out.println();
        System.out.println("SECTION 7: EVEN NUMBERS");

        for (int row = 1; row <= 2; row++)
        {
            System.out.print("Row " + row + ": ");

            for (int number = 1; number <= 5; number++)
            {
                if (number % 2 == 0)
                {
                    System.out.print(number + " ");
                }
            }

            System.out.println();
        }

        // ============================================================
        // SECTION 8: COUNTING THE TOTAL NUMBER OF REPETITIONS
        // ============================================================
        // The outer loop executes 3 times.
        // The inner loop executes 4 times for every outer repetition.
        //
        // Total executions of the inner statement:
        // 3 x 4 = 12
        //
        // The counter is declared before the loops so that its final
        // value can be displayed after both loops have finished.

        System.out.println();
        System.out.println("SECTION 8: COUNTING REPETITIONS");

        int totalExecutions = 0;

        for (int row = 1; row <= 3; row++)
        {
            for (int column = 1; column <= 4; column++)
            {
                totalExecutions++;
            }
        }

        System.out.println("Total inner-loop executions: "
                + totalExecutions);

        // ============================================================
        // SECTION 9: DIFFERENT LOOP LIMITS
        // ============================================================
        // The inner loop does not always need the same limit.
        //
        // Here, each row displays a different number of stars.
        //
        // Row 1 displays one star.
        // Row 2 displays two stars.
        // Row 3 displays three stars.
        //
        // The inner-loop condition uses the outer-loop variable row.
        // Therefore, the number of repetitions changes for each row.

        System.out.println();
        System.out.println("SECTION 9: INCREASING PATTERN");

        for (int row = 1; row <= 3; row++)
        {
            for (int column = 1; column <= row; column++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        // ============================================================
        // SECTION 10: COMMON NESTED-LOOP MISTAKES
        // ============================================================
        // 1. Forgetting that the inner loop repeats for every outer
        //    loop repetition.
        //
        // 2. Placing System.out.println() inside the inner loop when
        //    the intention is to display a complete row on one line.
        //
        // 3. Using the wrong variable in the inner-loop condition.
        //
        // 4. Declaring a counter inside the loop when its final value
        //    is needed outside the loop.
        //
        // 5. Forgetting that the inner-loop variable starts again
        //    when the inner loop is entered for the next outer cycle.
        //
        // Always trace the outer loop first, then the inner loop.

        // ============================================================
        // SECTION 11: PRACTICE CHALLENGE
        // ============================================================
        // Study the loops below.
        //
        // Before running the program, predict:
        // - How many rows will be displayed?
        // - How many numbers will appear in each row?
        // - How many times will the inner statement execute?
        //
        // Try changing the loop limits and predicting the output.

        System.out.println();
        System.out.println("SECTION 11: PRACTICE CHALLENGE");

        for (int row = 1; row <= 3; row++)
        {
            for (int number = 1; number <= row + 1; number++)
            {
                System.out.print(number + " ");
            }

            System.out.println();
        }
    }
}
