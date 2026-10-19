
public class IfElseIfStatements
{
    public static void main(String[] args)
    {
        // ============================================================
        // SECTION 1: WHAT IS AN IF-ELSE-IF STATEMENT?
        // ============================================================

        // An IF-ELSE-IF structure allows a program to choose between
        // THREE OR MORE possible outcomes.
        //
        // For example, a Student's mark could be classified as:
        // - Distinction
        // - Pass
        // - Fail
        //
        // An ordinary IF statement checks one condition.
        // An IF-ELSE structure handles two possible paths.
        // An IF-ELSE-IF structure handles several possible paths.
        //
        // GENERAL STRUCTURE:
        //
        // if (condition1)
        // {
        //     Statements for outcome 1.
        // }
        // else if (condition2)
        // {
        //     Statements for outcome 2.
        // }
        // else if (condition3)
        // {
        //     Statements for outcome 3.
        // }
        // else
        // {
        //     Statements if none of the conditions are true.
        // }
        //
        // Java evaluates the conditions FROM TOP TO BOTTOM.
        //
        // As soon as one condition is TRUE, its block executes.
        // Java then skips the remaining conditions in the structure.
        //
        // If none of the conditions is TRUE, the ELSE block executes,
        // provided that an ELSE block has been included.


        // ============================================================
        // SECTION 2: CLASSIFYING A STUDENT'S MARK
        // ============================================================

        int mark = 85;

        System.out.println("EXAMPLE 1: CLASSIFYING A MARK");

        // The first condition checks whether the mark is at least 75.
        if (mark >= 75)
        {
            System.out.println("Distinction achieved.");
        }
        // This condition is checked only if the first condition is
        // FALSE.
        else if (mark >= 50)
        {
            System.out.println("The Student has passed.");
        }
        // This block executes if BOTH previous conditions are FALSE.
        else
        {
            System.out.println("The Student has failed.");
        }

        System.out.println("Mark: " + mark);
        System.out.println();


        // ============================================================
        // SECTION 3: TRACE THE CONDITIONS FROM TOP TO BOTTOM
        // ============================================================

        int secondMark = 65;

        System.out.println("EXAMPLE 2: TRACING AN IF-ELSE-IF STRUCTURE");

        // Condition 1:
        // Is 65 >= 75?
        // FALSE. Java moves to the next condition.
        //
        // Condition 2:
        // Is 65 >= 50?
        // TRUE. Java executes this block.
        //
        // Java skips the ELSE block because a condition was TRUE.
        if (secondMark >= 75)
        {
            System.out.println("Distinction");
        }
        else if (secondMark >= 50)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }

        System.out.println();


        // ============================================================
        // SECTION 4: USING MORE THAN TWO ELSE-IF CONDITIONS
        // ============================================================

        int testMark = 42;

        System.out.println("EXAMPLE 3: USING SEVERAL CATEGORIES");

        // We can include as many ELSE-IF conditions as necessary.
        //
        // The conditions must be arranged carefully.
        // The highest mark range is checked first.
        if (testMark >= 90)
        {
            System.out.println("Outstanding result.");
        }
        else if (testMark >= 75)
        {
            System.out.println("Excellent result.");
        }
        else if (testMark >= 60)
        {
            System.out.println("Good result.");
        }
        else if (testMark >= 50)
        {
            System.out.println("Pass.");
        }
        else
        {
            System.out.println("Needs improvement.");
        }

        System.out.println("Mark: " + testMark);
        System.out.println();


        // ============================================================
        // SECTION 5: WHY THE ORDER OF CONDITIONS MATTERS
        // ============================================================

        int thirdMark = 85;

        System.out.println("EXAMPLE 4: INCORRECT CONDITION ORDER");

        // WARNING:
        // This example demonstrates a logical error.
        // The code compiles, but the result is incorrect.
        //
        // The first condition checks whether the mark is at least 50.
        // Since 85 is at least 50, this condition is TRUE.
        //
        // Java immediately executes the first block and skips all
        // the ELSE-IF conditions that follow.
        //
        // The Student incorrectly receives the ordinary pass message.

        if (thirdMark >= 50)
        {
            System.out.println("Pass.");
        }
        else if (thirdMark >= 75)
        {
            // This condition can never be reached when the mark
            // is 75 or higher because the first condition is already
            // TRUE for those marks.
            System.out.println("Distinction.");
        }
        else
        {
            System.out.println("Fail.");
        }

        // To correct the problem, check the highest threshold first:
        //
        // if (thirdMark >= 75)
        // {
        //     System.out.println("Distinction.");
        // }
        // else if (thirdMark >= 50)
        // {
        //     System.out.println("Pass.");
        // }
        // else
        // {
        //     System.out.println("Fail.");
        // }

        System.out.println();


        // ============================================================
        // SECTION 6: CHECKING MARK RANGES
        // ============================================================

        int fourthMark = 68;

        System.out.println("EXAMPLE 5: USING MARK RANGES");

        // Another approach is to specify the lower and upper limits
        // of each range.
        //
        // The && operator means AND.
        // Both conditions must be TRUE.
        //
        // A mark of 68 is at least 60 AND less than 75.
        if (fourthMark >= 75 && fourthMark <= 100)
        {
            System.out.println("Category: Distinction");
        }
        else if (fourthMark >= 60 && fourthMark < 75)
        {
            System.out.println("Category: Good");
        }
        else if (fourthMark >= 50 && fourthMark < 60)
        {
            System.out.println("Category: Pass");
        }
        else if (fourthMark >= 0 && fourthMark < 50)
        {
            System.out.println("Category: Fail");
        }
        else
        {
            // This final ELSE handles values outside the expected
            // range of 0 to 100.
            System.out.println("Invalid mark.");
        }

        System.out.println();


        // ============================================================
        // SECTION 7: USING IF-ELSE-IF WITH SCHOOL ATTENDANCE
        // ============================================================

        int attendance = 92;

        System.out.println("EXAMPLE 6: ATTENDANCE CATEGORIES");

        // The attendance percentage determines the message.
        if (attendance >= 95)
        {
            System.out.println("Excellent attendance.");
        }
        else if (attendance >= 85)
        {
            System.out.println("Good attendance.");
        }
        else if (attendance >= 75)
        {
            System.out.println("Attendance needs attention.");
        }
        else
        {
            System.out.println("Attendance is below the required level.");
        }

        System.out.println();


        // ============================================================
        // SECTION 8: USING IF-ELSE-IF WITH STRINGS
        // ============================================================

        String classGroup = "10B";

        System.out.println("EXAMPLE 7: CLASS GROUP");

        // String values can be compared using equals().
        if (classGroup.equals("10A"))
        {
            System.out.println("The Student belongs to Class 10A.");
        }
        else if (classGroup.equals("10B"))
        {
            System.out.println("The Student belongs to Class 10B.");
        }
        else if (classGroup.equals("10C"))
        {
            System.out.println("The Student belongs to Class 10C.");
        }
        else
        {
            System.out.println("Unknown class group.");
        }

        System.out.println();


        // ============================================================
        // SECTION 9: USING IF-ELSE-IF WITH CALCULATIONS
        // ============================================================

        int points = 78;
        int reward;

        System.out.println("EXAMPLE 8: CALCULATING A REWARD");

        // The reward depends on the number of points earned.
        if (points >= 90)
        {
            reward = 100;
        }
        else if (points >= 75)
        {
            reward = 50;
        }
        else if (points >= 50)
        {
            reward = 20;
        }
        else
        {
            reward = 0;
        }

        // Every possible path assigns a value to reward.
        System.out.println("Points: " + points);
        System.out.println("Reward: " + reward);
        System.out.println();


        // ============================================================
        // SECTION 10: COMMON MISTAKES
        // ============================================================

        // MISTAKE 1:
        // Checking a broad condition before a more specific condition.
        //
        // Incorrect:
        // if (mark >= 50)
        // {
        //     System.out.println("Pass");
        // }
        // else if (mark >= 75)
        // {
        //     System.out.println("Distinction");
        // }
        //
        // Correct:
        // if (mark >= 75)
        // {
        //     System.out.println("Distinction");
        // }
        // else if (mark >= 50)
        // {
        //     System.out.println("Pass");
        // }


        // MISTAKE 2:
        // Using = instead of == when comparing primitive values.
        //
        // Incorrect comparison:
        // if (points = 50)
        //
        // Correct comparison:
        // if (points == 50)
        //
        // A single = assigns a value.
        // A double == compares two values.


        // MISTAKE 3:
        // Forgetting that Java stops after the first TRUE condition.
        //
        // If several conditions could be TRUE, only the first matching
        // block in an IF-ELSE-IF structure will execute.


        // MISTAKE 4:
        // Forgetting to consider invalid values.
        //
        // If marks must be between 0 and 100, decide what should
        // happen when a mark is negative or greater than 100.


        // ============================================================
        // SECTION 11: PRACTICE CHALLENGE
        // ============================================================

        // SCENARIO:
        // A school awards achievement levels based on a Student's mark.
        //
        // 80 to 100: Excellent
        // 65 to 79:  Very Good
        // 50 to 64:  Pass
        // 0 to 49:   Needs Improvement
        // Other:     Invalid mark
        //
        // TASK:
        // 1. Change achievementMark to test different values.
        // 2. Write the conditions in the correct order.
        // 3. Display the appropriate achievement level.
        //
        // Test the boundary values:
        // 100, 80, 79, 65, 64, 50, 49, 0, -1 and 101.

        int achievementMark = 79;

        System.out.println("PRACTICE CHALLENGE");

        if (achievementMark < 0 || achievementMark > 100)
        {
            System.out.println("Invalid mark.");
        }
        else if (achievementMark >= 80)
        {
            System.out.println("Excellent.");
        }
        else if (achievementMark >= 65)
        {
            System.out.println("Very Good.");
        }
        else if (achievementMark >= 50)
        {
            System.out.println("Pass.");
        }
        else
        {
            System.out.println("Needs Improvement.");
        }

        System.out.println("Mark: " + achievementMark);
    }
}
