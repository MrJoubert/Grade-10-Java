
public class IfElseStatements
{
    public static void main(String[] args)
    {
        // ============================================================
        // SECTION 1: WHAT IS AN IF-ELSE STATEMENT?
        // ============================================================

        // An IF statement allows a program to execute code when
        // a condition is TRUE.
        //
        // However, what happens when the condition is FALSE?
        //
        // An IF-ELSE statement allows us to specify TWO possible
        // paths through the program:
        //
        // 1. The IF block runs when the condition is TRUE.
        // 2. The ELSE block runs when the condition is FALSE.
        //
        // General structure:
        //
        // if (condition)
        // {
        //     Statements that run if the condition is true.
        // }
        // else
        // {
        //     Statements that run if the condition is false.
        // }
        //
        // IMPORTANT:
        // Exactly ONE of these two blocks will execute.
        //
        // The ELSE statement does not have its own condition.


        // ============================================================
        // SECTION 2: A SIMPLE PASS OR FAIL DECISION
        // ============================================================

        int mark = 65;

        System.out.println("EXAMPLE 1: PASS OR FAIL");

        // Java checks whether the mark is at least 50.
        if (mark >= 50)
        {
            // This block executes if the condition is TRUE.
            System.out.println("The Student has passed.");
        }
        else
        {
            // This block executes if the condition is FALSE.
            System.out.println("The Student has failed.");
        }

        // This statement is outside both blocks.
        // It executes regardless of the result.
        System.out.println("Mark: " + mark);
        System.out.println();


        // ============================================================
        // SECTION 3: CHANGE THE VALUE AND PREDICT THE RESULT
        // ============================================================

        int secondMark = 35;

        System.out.println("EXAMPLE 2: A FAILING MARK");

        // Try changing secondMark to 80, 50 or 49.
        //
        // If secondMark is 50 or higher, the IF block runs.
        // If secondMark is below 50, the ELSE block runs.
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
        // SECTION 4: WHY DO WE USE ELSE?
        // ============================================================

        // Consider the following approach.
        //
        // if (mark >= 50)
        // {
        //     System.out.println("Passed");
        // }
        //
        // if (mark < 50)
        // {
        //     System.out.println("Failed");
        // }
        //
        // This works for this simple example, but Java evaluates
        // TWO separate conditions.
        //
        // An IF-ELSE structure is clearer when exactly one of
        // two outcomes must occur.
        //
        // Java evaluates the IF condition once.
        // It then chooses either the IF block or the ELSE block.


        // ============================================================
        // SECTION 5: CHECKING WHETHER A STUDENT IS OLD ENOUGH
        // ============================================================

        int age = 16;

        System.out.println("EXAMPLE 3: AGE REQUIREMENT");

        // A Student must be at least 16 years old to join an activity.
        if (age >= 16)
        {
            System.out.println("The Student meets the age requirement.");
        }
        else
        {
            System.out.println("The Student is too young.");
        }

        System.out.println();


        // ============================================================
        // SECTION 6: USING IF-ELSE WITH BOOLEAN VARIABLES
        // ============================================================

        boolean homeworkSubmitted = false;

        System.out.println("EXAMPLE 4: HOMEWORK SUBMISSION");

        // A Boolean variable already stores true or false.
        //
        // Therefore, we can use the variable directly as the
        // condition instead of writing homeworkSubmitted == true.
        if (homeworkSubmitted)
        {
            System.out.println("Homework has been submitted.");
        }
        else
        {
            System.out.println("Homework is outstanding.");
        }

        System.out.println();


        // ============================================================
        // SECTION 7: CHOOSING BETWEEN TWO VALUES
        // ============================================================

        int testMark = 72;
        int adjustedMark;

        System.out.println("EXAMPLE 5: ADJUSTING A MARK");

        // A Student receives 5 bonus marks if the original mark
        // is at least 70.
        //
        // The variable adjustedMark is declared above.
        // We assign a value to it in BOTH possible paths.
        if (testMark >= 70)
        {
            adjustedMark = testMark + 5;
        }
        else
        {
            adjustedMark = testMark;
        }

        // After the IF-ELSE structure, adjustedMark has a value
        // regardless of which block was executed.
        System.out.println("Original mark: " + testMark);
        System.out.println("Adjusted mark: " + adjustedMark);
        System.out.println();


        // ============================================================
        // SECTION 8: USING IF-ELSE WITH STRINGS
        // ============================================================

        String studentName = "Ayesha";

        System.out.println("EXAMPLE 6: CHECKING A STUDENT NAME");

        // Use equals() when comparing the contents of Strings.
        if (studentName.equals("Ayesha"))
        {
            System.out.println("Welcome, Ayesha.");
        }
        else
        {
            System.out.println("Student name does not match.");
        }

        // Try changing studentName to another name.
        // The ELSE block will then execute.
        System.out.println();


        // ============================================================
        // SECTION 9: USING IF-ELSE TO SELECT A MESSAGE
        // ============================================================

        int attendance = 68;

        System.out.println("EXAMPLE 7: ATTENDANCE");

        // A Student needs attendance of at least 80%.
        if (attendance >= 80)
        {
            System.out.println("Attendance requirement met.");
        }
        else
        {
            System.out.println("Attendance requirement not met.");
        }

        System.out.println("Attendance: " + attendance + "%");
        System.out.println();


        // ============================================================
        // SECTION 10: A COMMON MISTAKE - TWO ELSE BLOCKS
        // ============================================================

        // An IF statement can have only ONE ELSE block.
        //
        // The following code is INCORRECT and will not compile:
        //
        // if (mark >= 50)
        // {
        //     System.out.println("Passed");
        // }
        // else
        // {
        //     System.out.println("Failed");
        // }
        // else
        // {
        //     System.out.println("Another message");
        // }
        //
        // If you need more than two possible outcomes, you can use
        // an IF-ELSE-IF structure. We will cover that separately.


        // ============================================================
        // SECTION 11: A COMMON MISTAKE - A SEMICOLON AFTER IF
        // ============================================================

        int sportsScore = 85;

        System.out.println("EXAMPLE 8: CHECKING THE IF CONDITION");

        // CORRECT:
        if (sportsScore >= 70)
        {
            System.out.println("The Student qualifies.");
        }
        else
        {
            System.out.println("The Student does not qualify.");
        }

        // Do not write:
        //
        // if (sportsScore >= 70);
        // {
        //     System.out.println("The Student qualifies.");
        // }
        // else
        // {
        //     System.out.println("The Student does not qualify.");
        // }
        //
        // The semicolon ends the IF statement.
        // The ELSE then has no matching IF, causing a compiler error.
        System.out.println();


        // ============================================================
        // SECTION 12: PRACTICE CHALLENGE
        // ============================================================

        // SCENARIO:
        // A Student must score at least 75 to receive a distinction.
        //
        // TASK:
        // 1. Create an integer variable called distinctionMark.
        // 2. Give it a value of 81.
        // 3. Use IF-ELSE to determine whether the Student receives
        //    a distinction.
        // 4. Display an appropriate message for each outcome.
        //
        // Before running the code, predict which block will execute.

        int distinctionMark = 81;

        System.out.println("PRACTICE CHALLENGE");

        if (distinctionMark >= 75)
        {
            System.out.println("Distinction achieved!");
        }
        else
        {
            System.out.println("No distinction achieved.");
        }

        System.out.println("Mark: " + distinctionMark);
    }
}
