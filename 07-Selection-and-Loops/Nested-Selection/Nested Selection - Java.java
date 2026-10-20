
public class NestedSelection
{
    public static void main(String[] args)
    {
        // ============================================================
        // SECTION 1: WHAT IS NESTED SELECTION?
        // ============================================================
        // Nested selection means placing one if statement inside
        // another if statement.
        //
        // The INNER if statement is only reached when the OUTER
        // condition is true.
        //
        // Think of it as two questions:
        // 1. Does the Student meet the first requirement?
        // 2. If yes, does the Student meet the second requirement?

        System.out.println("SECTION 1: BASIC NESTED SELECTION");

        int mark = 78;
        boolean submittedProject = true;

        if (mark >= 50)
        {
            // This block only executes if mark is at least 50.
            System.out.println("The Student has passed.");

            if (submittedProject == true)
            {
                // This condition is checked only after the Student
                // has passed.
                System.out.println("The project has been submitted.");
            }
        }

        // ============================================================
        // SECTION 2: THE INNER CONDITION IS NOT ALWAYS CHECKED
        // ============================================================
        // Change mark to 35 and run the program again.
        //
        // The outer condition will be false.
        // Therefore, the inner if statement will not be reached.
        //
        // The program will not display the message about the project.

        System.out.println();
        System.out.println("SECTION 2: OUTER CONDITION IS FALSE");

        mark = 35;
        submittedProject = true;

        if (mark >= 50)
        {
            System.out.println("The Student has passed.");

            if (submittedProject == true)
            {
                System.out.println("The project has been submitted.");
            }
        }

        System.out.println("The selection structure has finished.");

        // ============================================================
        // SECTION 3: NESTED IF-ELSE STATEMENTS
        // ============================================================
        // An if-else statement can also be placed inside another
        // if statement.
        //
        // First, the program checks whether the Student has passed.
        // If the Student has passed, it checks whether the mark
        // qualifies for a distinction.
        //
        // The inner if-else chooses between two outcomes, but it is
        // only reached when the outer condition is true.

        System.out.println();
        System.out.println("SECTION 3: PASS AND DISTINCTION");

        mark = 82;

        if (mark >= 50)
        {
            System.out.println("The Student has passed.");

            if (mark >= 80)
            {
                System.out.println("The Student has achieved a distinction.");
            }
            else
            {
                System.out.println("The Student has not achieved a distinction.");
            }
        }
        else
        {
            System.out.println("The Student has failed.");
        }

        // ============================================================
        // SECTION 4: CHECKING MULTIPLE REQUIREMENTS
        // ============================================================
        // A Student must:
        // 1. Have an attendance percentage of at least 80%.
        // 2. Have submitted the required assessment.
        //
        // The second requirement is checked only if the first
        // requirement is met.

        System.out.println();
        System.out.println("SECTION 4: ATTENDANCE AND ASSESSMENT");

        int attendance = 90;
        boolean assessmentSubmitted = true;

        if (attendance >= 80)
        {
            System.out.println("Attendance requirement met.");

            if (assessmentSubmitted)
            {
                System.out.println("Assessment requirement met.");
                System.out.println("The Student meets both requirements.");
            }
            else
            {
                System.out.println("Assessment has not been submitted.");
            }
        }
        else
        {
            System.out.println("Attendance requirement not met.");
        }

        // ============================================================
        // SECTION 5: NESTED SELECTION WITH ELSE
        // ============================================================
        // Each else belongs to the closest if statement that does not
        // already have an else.
        //
        // Use indentation and braces to make the structure clear.
        // The outer else handles a mark below 50.
        // The inner else handles a mark from 50 to 79.

        System.out.println();
        System.out.println("SECTION 5: MARK CATEGORIES");

        mark = 65;

        if (mark >= 50)
        {
            if (mark >= 80)
            {
                System.out.println("Distinction");
            }
            else
            {
                System.out.println("Pass without distinction");
            }
        }
        else
        {
            System.out.println("Fail");
        }

        // ============================================================
        // SECTION 6: NESTED SELECTION WITH STRINGS
        // ============================================================
        // Use equals() to compare the contents of String variables.
        // Do not use == when you want to compare String contents.
        //
        // The program checks the Student's grade first.
        // Only a Grade 12 Student is checked for the special message.

        System.out.println();
        System.out.println("SECTION 6: GRADE CHECK");

        String grade = "Grade 12";
        boolean completedPAT = true;

        if (grade.equals("Grade 12"))
        {
            System.out.println("The Student is in Grade 12.");

            if (completedPAT)
            {
                System.out.println("The PAT has been completed.");
            }
            else
            {
                System.out.println("The PAT is outstanding.");
            }
        }
        else
        {
            System.out.println("The Student is not in Grade 12.");
        }

        // ============================================================
        // SECTION 7: NESTED SELECTION INSIDE A LOOP
        // ============================================================
        // A loop can repeat a nested selection structure.
        //
        // Each Student's mark is checked.
        // If the Student passes, the program then checks for a
        // distinction.
        //
        // The array stores the marks for three Students.

        System.out.println();
        System.out.println("SECTION 7: CHECKING STUDENT MARKS");

        int[] marks = {45, 67, 85};

        for (int counter = 0; counter < marks.length; counter++)
        {
            System.out.print("Student " + (counter + 1) + ": ");

            if (marks[counter] >= 50)
            {
                if (marks[counter] >= 80)
                {
                    System.out.println("Pass with distinction");
                }
                else
                {
                    System.out.println("Pass");
                }
            }
            else
            {
                System.out.println("Fail");
            }
        }

        // ============================================================
        // SECTION 8: INDEPENDENT IF STATEMENTS VERSUS NESTED IF
        // ============================================================
        // Two independent if statements are checked separately.
        //
        // In a nested structure, the inner condition is only checked
        // when the outer condition is true.
        //
        // These structures are not always interchangeable.
        // Choose the structure that matches the requirements.

        System.out.println();
        System.out.println("SECTION 8: INDEPENDENT CONDITIONS");

        mark = 85;

        if (mark >= 50)
        {
            System.out.println("Pass requirement met.");
        }

        if (mark >= 80)
        {
            System.out.println("Distinction requirement met.");
        }

        // ============================================================
        // SECTION 9: COMMON MISTAKES
        // ============================================================
        // 1. Forgetting braces around a block containing multiple
        //    statements.
        //
        // 2. Placing an inner if statement outside the outer braces
        //    when it should depend on the outer condition.
        //
        // 3. Connecting an else to the wrong if statement.
        //
        // 4. Using = instead of == when comparing primitive values.
        //
        // 5. Using == instead of equals() to compare String contents.
        //
        // 6. Forgetting that an inner condition is only checked when
        //    the program reaches it.
        //
        // Indentation does not determine which statements belong
        // together. Braces determine the structure.

        // ============================================================
        // SECTION 10: PRACTICE CHALLENGE
        // ============================================================
        // Write a nested selection structure that:
        //
        // 1. Checks whether a mark is at least 50.
        // 2. If the Student passes, checks whether the mark is at
        //    least 75.
        // 3. Displays "Merit" if the second condition is true.
        // 4. Displays "Pass without merit" if the Student passes
        //    but does not achieve 75.
        // 5. Displays "Fail" if the Student's mark is below 50.
        //
        // Test your code using marks of 40, 60 and 80.

        System.out.println();
        System.out.println("SECTION 10: PRACTICE CHALLENGE");

        mark = 75;

        if (mark >= 50)
        {
            if (mark >= 75)
            {
                System.out.println("Merit");
            }
            else
            {
                System.out.println("Pass without merit");
            }
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
