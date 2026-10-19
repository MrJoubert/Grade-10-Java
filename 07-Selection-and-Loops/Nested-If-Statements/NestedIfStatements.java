
public class NestedIfStatements
{
    public static void main(String[] args)
    {
        // ============================================================
        // SECTION 1: WHAT IS A NESTED IF STATEMENT?
        // ============================================================

        // A nested IF statement is an IF statement INSIDE another
        // IF statement.
        //
        // The outer IF statement is checked first.
        // If its condition is FALSE, Java skips the entire outer block.
        // This means that any nested IF statements inside that block
        // are also skipped.
        //
        // If the outer condition is TRUE, Java enters the block and
        // evaluates the nested IF statement.
        //
        // GENERAL STRUCTURE:
        //
        // if (outerCondition)
        // {
        //     // This block runs if outerCondition is TRUE.
        //
        //     if (innerCondition)
        //     {
        //         // This block runs if BOTH conditions are TRUE.
        //     }
        // }
        //
        // Think of the outer IF as a gate.
        // You must pass through the outer gate before reaching
        // the inner gate.


        // ============================================================
        // SECTION 2: A SIMPLE NESTED IF STATEMENT
        // ============================================================

        int mark = 85;
        int attendance = 90;

        System.out.println("EXAMPLE 1: NESTED CONDITIONS");

        // OUTER CONDITION:
        // Check whether the Student has passed the assessment.
        if (mark >= 50)
        {
            System.out.println("The Student has passed.");

            // INNER CONDITION:
            // This IF statement is reached only if mark >= 50.
            //
            // If the Student has passed, we can now check attendance.
            if (attendance >= 80)
            {
                System.out.println("Attendance requirement met.");
            }

            // This statement belongs to the outer IF block.
            // It runs whenever mark >= 50, regardless of attendance.
            System.out.println("Assessment result processed.");
        }

        // This statement is outside the outer IF block.
        // It runs whether the Student passes or fails.
        System.out.println("End of Example 1.");
        System.out.println();


        // ============================================================
        // SECTION 3: WHAT HAPPENS WHEN THE OUTER CONDITION IS FALSE?
        // ============================================================

        int secondMark = 40;
        int secondAttendance = 95;

        System.out.println("EXAMPLE 2: OUTER CONDITION IS FALSE");

        // The mark is below 50.
        // Therefore, Java does not enter this IF block.
        if (secondMark >= 50)
        {
            System.out.println("The Student has passed.");

            // Java never reaches this nested IF statement because
            // the outer condition is FALSE.
            if (secondAttendance >= 80)
            {
                System.out.println("Attendance requirement met.");
            }
        }

        // Even though attendance is 95, the nested condition is
        // never checked because the outer condition failed.
        System.out.println("End of Example 2.");
        System.out.println();


        // ============================================================
        // SECTION 4: USING NESTED IF-ELSE STATEMENTS
        // ============================================================

        int thirdMark = 75;
        int thirdAttendance = 65;

        System.out.println("EXAMPLE 3: NESTED IF-ELSE");

        // First, check whether the Student passed.
        if (thirdMark >= 50)
        {
            System.out.println("The Student has passed.");

            // Because the Student passed, check attendance.
            if (thirdAttendance >= 80)
            {
                System.out.println("Attendance is satisfactory.");
            }
            else
            {
                // This ELSE belongs to the INNER IF statement.
                // It executes if attendance is below 80.
                System.out.println("Attendance is too low.");
            }
        }
        else
        {
            // This ELSE belongs to the OUTER IF statement.
            // It executes if the mark is below 50.
            System.out.println("The Student has failed.");
        }

        // IMPORTANT:
        // The position of the closing braces determines which ELSE
        // belongs to which IF statement.
        System.out.println();


        // ============================================================
        // SECTION 5: IDENTIFYING WHICH IF AN ELSE BELONGS TO
        // ============================================================

        int fourthMark = 42;
        int fourthAttendance = 60;

        System.out.println("EXAMPLE 4: MATCHING ELSE TO IF");

        if (fourthMark >= 50)
        {
            System.out.println("The Student has passed.");

            if (fourthAttendance >= 80)
            {
                System.out.println("Attendance is satisfactory.");
            }
            else
            {
                // This ELSE belongs to:
                // if (fourthAttendance >= 80)
                //
                // It does NOT belong to the outer IF.
                System.out.println("Attendance is too low.");
            }
        }
        else
        {
            // This ELSE belongs to:
            // if (fourthMark >= 50)
            System.out.println("The Student has failed.");
        }

        // The mark is 42, so the outer ELSE executes.
        // Neither the inner IF nor the inner ELSE executes.
        System.out.println();


        // ============================================================
        // SECTION 6: NESTED IF STATEMENTS FOR SCHOOL ACTIVITIES
        // ============================================================

        int age = 16;
        boolean permissionGranted = true;

        System.out.println("EXAMPLE 5: SCHOOL ACTIVITY ELIGIBILITY");

        // A Student must first be at least 16 years old.
        if (age >= 16)
        {
            System.out.println("Age requirement met.");

            // Only Students who meet the age requirement reach
            // this second decision.
            if (permissionGranted)
            {
                System.out.println("The Student may attend the activity.");
            }
            else
            {
                System.out.println("Parental permission is required.");
            }
        }
        else
        {
            // This ELSE belongs to the outer IF.
            System.out.println("The Student does not meet the age requirement.");
        }

        System.out.println();


        // ============================================================
        // SECTION 7: NESTED IF STATEMENTS WITH THREE DECISIONS
        // ============================================================

        int examMark = 78;
        int examAttendance = 88;
        boolean feesCleared = true;

        System.out.println("EXAMPLE 6: MULTIPLE ELIGIBILITY REQUIREMENTS");

        // FIRST DECISION:
        // Has the Student achieved at least 50?
        if (examMark >= 50)
        {
            System.out.println("Pass mark requirement met.");

            // SECOND DECISION:
            // Has the Student achieved at least 80% attendance?
            if (examAttendance >= 80)
            {
                System.out.println("Attendance requirement met.");

                // THIRD DECISION:
                // Have the required school fees been cleared?
                if (feesCleared)
                {
                    System.out.println("The Student meets all requirements.");
                }
                else
                {
                    System.out.println("Fees requirement not met.");
                }
            }
            else
            {
                System.out.println("Attendance requirement not met.");
            }
        }
        else
        {
            System.out.println("Pass mark requirement not met.");
        }

        // Notice that the final decision can only be reached if
        // every preceding outer condition is TRUE.
        System.out.println();


        // ============================================================
        // SECTION 8: USING NESTED IF STATEMENTS WITH STRINGS
        // ============================================================

        String studentName = "Lerato";
        String classGroup = "10A";

        System.out.println("EXAMPLE 7: CHECKING CLASS INFORMATION");

        // First, check whether the name matches.
        if (studentName.equals("Lerato"))
        {
            System.out.println("Student name confirmed.");

            // Only after the name matches do we check the class.
            if (classGroup.equals("10A"))
            {
                System.out.println("Class group confirmed.");
            }
            else
            {
                System.out.println("Incorrect class group.");
            }
        }
        else
        {
            System.out.println("Student name not recognised.");
        }

        System.out.println();


        // ============================================================
        // SECTION 9: USING NESTED IF STATEMENTS TO ASSIGN A VALUE
        // ============================================================

        int sportPoints = 82;
        int reward = 0;

        System.out.println("EXAMPLE 8: ASSIGNING A REWARD");

        // A Student must first earn at least 50 points.
        if (sportPoints >= 50)
        {
            // If the Student reaches 50 points, check for a higher
            // reward threshold.
            if (sportPoints >= 80)
            {
                reward = 100;
            }
            else
            {
                reward = 50;
            }
        }
        else
        {
            // Students with fewer than 50 points receive no reward.
            reward = 0;
        }

        System.out.println("Points: " + sportPoints);
        System.out.println("Reward: " + reward);
        System.out.println();


        // ============================================================
        // SECTION 10: WHEN SHOULD YOU USE NESTED IF STATEMENTS?
        // ============================================================

        // Nested IF statements are useful when a second decision
        // should only be considered after a first requirement is met.
        //
        // For example:
        //
        // 1. Check whether a Student passed.
        // 2. If the Student passed, check attendance.
        // 3. If attendance is sufficient, check another requirement.
        //
        // However, if all conditions simply need to be TRUE at the
        // same time, a combined condition may be easier to read.
        //
        // Example using &&:
        //
        // if (mark >= 50 && attendance >= 80)
        // {
        //     System.out.println("Both requirements are met.");
        // }
        //
        // Both approaches can be useful.
        // Choose the structure that makes the logic clearest.


        // ============================================================
        // SECTION 11: COMMON MISTAKES
        // ============================================================

        // MISTAKE 1:
        // Placing a closing brace in the wrong position.
        //
        // Incorrect braces can cause an ELSE to match the wrong IF,
        // or can make a statement execute outside the intended block.
        //
        // Always check that every opening brace { has a matching
        // closing brace }.


        // MISTAKE 2:
        // Assuming that an inner IF executes when the outer IF is false.
        //
        // The inner IF is inside the outer block.
        // If Java skips the outer block, the inner IF is skipped too.


        // MISTAKE 3:
        // Nesting every condition even when it is unnecessary.
        //
        // Too many levels of nesting can make code difficult to read.
        // Consider whether a combined condition would be clearer.


        // MISTAKE 4:
        // Assigning a value in only some possible paths.
        //
        // If a variable must be used after a decision, ensure that
        // it has a value on every possible path through the program.


        // ============================================================
        // SECTION 12: PRACTICE CHALLENGE
        // ============================================================

        // SCENARIO:
        // A Student wants to join a school leadership programme.
        //
        // Requirements:
        // 1. The Student must have a mark of at least 70.
        // 2. If the mark requirement is met, attendance must be
        //    at least 85%.
        // 3. If both requirements are met, parental permission
        //    must be checked.
        //
        // TASK:
        // Use nested IF-ELSE statements to display the appropriate
        // message for each possible outcome.
        //
        // Test these combinations:
        // - Mark below 70.
        // - Mark at least 70, but attendance below 85.
        // - Both requirements met, but permission is false.
        // - All requirements met.

        int leadershipMark = 76;
        int leadershipAttendance = 90;
        boolean leadershipPermission = true;

        System.out.println("PRACTICE CHALLENGE");

        if (leadershipMark >= 70)
        {
            if (leadershipAttendance >= 85)
            {
                if (leadershipPermission)
                {
                    System.out.println("Eligible for the leadership programme.");
                }
                else
                {
                    System.out.println("Parental permission is required.");
                }
            }
            else
            {
                System.out.println("Attendance requirement not met.");
            }
        }
        else
        {
            System.out.println("Mark requirement not met.");
        }

        System.out.println("Challenge complete.");
    }
}
