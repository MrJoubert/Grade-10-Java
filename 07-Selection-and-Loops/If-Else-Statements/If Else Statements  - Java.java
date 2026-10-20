public class IfElseStatements
{
    public static void main(String[] args)
    {
        // ============================================================
        // SECTION 1: UNDERSTANDING IF-ELSE
        // ============================================================

        // An IF-ELSE statement allows a program to choose between
        // TWO alternative paths.
        //
        // Java evaluates the condition inside the IF statement.
        //
        // If the condition is TRUE:
        //     The IF block executes.
        //
        // If the condition is FALSE:
        //     The ELSE block executes.
        //
        // Exactly ONE of these two blocks executes.
        //
        // GENERAL STRUCTURE:
        //
        // if (condition)
        // {
        //     Statements if the condition is TRUE.
        // }
        // else
        // {
        //     Statements if the condition is FALSE.
        // }
        //
        // The ELSE does not have its own condition.
        // It handles every situation in which the IF condition is false.


        // ============================================================
        // SECTION 2: A SIMPLE PASS OR FAIL DECISION
        // ============================================================

        System.out.println("SECTION 2: PASS OR FAIL");

        int mark = 65;

        // The pass mark is 50.
        // The >= operator means greater than or equal to.
        //
        // Java checks whether mark >= 50.
        // Since 65 >= 50 is TRUE, the IF block executes.

        if (mark >= 50)
        {
            System.out.println("The Student has passed.");
        }
        else
        {
            // Java skips this block because the condition is TRUE.
            System.out.println("The Student has failed.");
        }

        System.out.println("Mark: " + mark);

        // This statement is outside the IF-ELSE structure.
        // It executes regardless of which block was selected.
        System.out.println();


        // ============================================================
        // SECTION 3: WHAT HAPPENS WHEN THE CONDITION IS FALSE?
        // ============================================================

        System.out.println("SECTION 3: FAILING MARK");

        int secondMark = 35;

        // This time, the mark is below 50.
        //
        // Java evaluates:
        // secondMark >= 50
        //
        // 35 >= 50 is FALSE.
        //
        // Therefore, Java skips the IF block and executes ELSE.

        if (secondMark >= 50)
        {
            System.out.println("The Student has passed.");
        }
        else
        {
            System.out.println("The Student has failed.");
        }

        System.out.println("Mark: " + secondMark);
        System.out.println();


        // ============================================================
        // SECTION 4: TRACE THE IF-ELSE STRUCTURE
        // ============================================================

        // A trace helps you follow what Java does step by step.
        //
        // Consider:
        //
        // int mark = 49;
        //
        // if (mark >= 50)
        // {
        //     System.out.println("Pass");
        // }
        // else
        // {
        //     System.out.println("Fail");
        // }
        //
        // Step 1: Java reads mark, which is 49.
        // Step 2: Java checks whether 49 >= 50.
        // Step 3: The condition is FALSE.
        // Step 4: Java skips the IF block.
        // Step 5: Java executes the ELSE block.
        // Step 6: "Fail" is displayed.
        //
        // Only the selected block executes.


        // ============================================================
        // SECTION 5: BOUNDARY VALUES
        // ============================================================

        System.out.println("SECTION 5: BOUNDARY VALUES");

        // A boundary value is a value at the edge of a condition.
        //
        // If the pass requirement is mark >= 50:
        //
        // 49 fails.
        // 50 passes.
        // 51 passes.
        //
        // Students must pay attention to >= and >.
        //
        // >= means greater than OR equal to.
        // > means strictly greater than.

        int boundaryMark = 50;

        if (boundaryMark >= 50)
        {
            System.out.println("Boundary mark: Pass");
        }
        else
        {
            System.out.println("Boundary mark: Fail");
        }

        // If the condition had been boundaryMark > 50,
        // a mark of exactly 50 would fail.
        System.out.println();


        // ============================================================
        // SECTION 6: USING DIFFERENT RELATIONAL OPERATORS
        // ============================================================

        System.out.println("SECTION 6: RELATIONAL OPERATORS");

        int age = 16;

        // Greater than or equal to.
        if (age >= 16)
        {
            System.out.println("Age requirement met.");
        }
        else
        {
            System.out.println("Age requirement not met.");
        }

        // Equality comparison.
        // The == operator checks whether two primitive values
        // are equal.
        if (age == 16)
        {
            System.out.println("The Student is exactly 16.");
        }
        else
        {
            System.out.println("The Student is not exactly 16.");
        }

        // Inequality comparison.
        // The != operator means not equal to.
        if (age != 18)
        {
            System.out.println("The Student is not 18.");
        }
        else
        {
            System.out.println("The Student is 18.");
        }

        System.out.println();


        // ============================================================
        // SECTION 7: USING IF-ELSE WITH BOOLEAN VARIABLES
        // ============================================================

        System.out.println("SECTION 7: BOOLEAN VARIABLES");

        // A Boolean variable stores either true or false.
        boolean homeworkSubmitted = false;

        // The variable can be used directly as the condition.
        //
        // Since homeworkSubmitted is false, Java executes ELSE.
        if (homeworkSubmitted)
        {
            System.out.println("Homework has been submitted.");
        }
        else
        {
            System.out.println("Homework is outstanding.");
        }

        // The expression:
        //
        // if (homeworkSubmitted == true)
        //
        // is unnecessary here. Using:
        //
        // if (homeworkSubmitted)
        //
        // is simpler and clearer.
        System.out.println();


        // ============================================================
        // SECTION 8: USING NOT TO REVERSE A BOOLEAN
        // ============================================================

        System.out.println("SECTION 8: NOT OPERATOR");

        boolean permissionGranted = false;

        // The ! operator means NOT.
        //
        // If permissionGranted is false:
        // !permissionGranted is true.
        //
        // Therefore, this IF block executes.
        if (!permissionGranted)
        {
            System.out.println("Permission is required.");
        }
        else
        {
            System.out.println("Permission has been granted.");
        }

        System.out.println();


        // ============================================================
        // SECTION 9: USING IF-ELSE TO ASSIGN A VALUE
        // ============================================================

        System.out.println("SECTION 9: ASSIGNING A VALUE");

        int testMark = 72;
        int adjustedMark;

        // A Student receives five bonus marks if the original
        // mark is at least 70.
        //
        // If the condition is TRUE, adjustedMark is assigned
        // the original mark plus 5.
        //
        // Otherwise, adjustedMark remains equal to the original mark.
        //
        // IMPORTANT:
        // Both possible paths assign a value to adjustedMark.

        if (testMark >= 70)
        {
            adjustedMark = testMark + 5;
        }
        else
        {
            adjustedMark = testMark;
        }

        System.out.println("Original mark: " + testMark);
        System.out.println("Adjusted mark: " + adjustedMark);
        System.out.println();


        // ============================================================
        // SECTION 10: USING IF-ELSE WITH STRING COMPARISONS
        // ============================================================

        System.out.println("SECTION 10: STRING COMPARISON");

        String studentName = "Ayesha";

        // Use equals() to compare the contents of Strings.
        //
        // Do not use == to compare String contents.
        if (studentName.equals("Ayesha"))
        {
            System.out.println("Welcome, Ayesha.");
        }
        else
        {
            System.out.println("Student name does not match.");
        }

        System.out.println();


        // ============================================================
        // SECTION 11: COMBINING IF-ELSE WITH A LOOP
        // ============================================================

        System.out.println("SECTION 11: PASS OR FAIL FOR MULTIPLE STUDENTS");

        // A loop repeats the decision for several Students.
        //
        // The FOR loop controls how many Students are processed.
        // The IF-ELSE structure decides whether each Student passes.
        //
        // This is an important programming pattern:
        //
        // LOOP:
        // Repeat the task.
        //
        // SELECTION:
        // Choose the appropriate action during each repetition.

        int mark1 = 45;
        int mark2 = 67;
        int mark3 = 82;

        for (int student = 1; student <= 3; student++)
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

            System.out.print("Student " + student + ": ");

            // This IF-ELSE determines the result for each Student.
            if (currentMark >= 50)
            {
                System.out.println("Pass");
            }
            else
            {
                System.out.println("Fail");
            }
        }

        System.out.println();


        // ============================================================
        // SECTION 12: COMMON MISTAKES
        // ============================================================

        // MISTAKE 1: USING = INSTEAD OF ==
        //
        // A single = assigns a value.
        // A double == compares primitive values.
        //
        // Example:
        // if (age == 16)
        //
        // This checks whether age equals 16.


        // MISTAKE 2: PUTTING A SEMICOLON AFTER THE IF CONDITION
        //
        // Incorrect:
        //
        // if (mark >= 50);
        // {
        //     System.out.println("Pass");
        // }
        // else
        // {
        //     System.out.println("Fail");
        // }
        //
        // The semicolon ends the IF statement.
        // The ELSE then has no matching IF, causing a compiler error.
        //
        // Correct:
        //
        // if (mark >= 50)
        // {
        //     System.out.println("Pass");
        // }
        // else
        // {
        //     System.out.println("Fail");
        // }


        // MISTAKE 3: USING TWO ELSE BLOCKS
        //
        // One IF statement can have only one ELSE block.
        //
        // If there are more than two possible outcomes, consider
        // using an IF-ELSE-IF structure.


        // MISTAKE 4: CONFUSING THE IF BLOCK WITH THE ELSE BLOCK
        //
        // Only one block executes.
        // Java does not execute both blocks in the same IF-ELSE.


        // MISTAKE 5: FORGETTING THE PURPOSE OF BRACES
        //
        // Braces group statements together.
        // Use them to make it clear which statements belong to
        // the IF block and which belong to the ELSE block.


        // ============================================================
        // SECTION 13: PRACTICE CHALLENGE
        // ============================================================

        // SCENARIO:
        // A Student qualifies for a school award if their mark
        // is at least 75.
        //
        // TASK:
        // 1. Create a variable called awardMark.
        // 2. Test it using values of 74, 75 and 76.
        // 3. Display "Award achieved" if the mark is at least 75.
        // 4. Otherwise, display "Award not achieved".
        //
        // Before running the code, predict which block will execute.

        int awardMark = 75;

        System.out.println("SECTION 13: PRACTICE CHALLENGE");

        if (awardMark >= 75)
        {
            System.out.println("Award achieved.");
        }
        else
        {
            System.out.println("Award not achieved.");
        }

        System.out.println("Award mark: " + awardMark);
    }
}
