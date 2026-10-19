public class IfStatements
{
    public static void main(String[] args)
    {
        // ============================================================
        // SECTION 1: WHAT IS AN IF STATEMENT?
        // ============================================================

        // An IF statement allows a program to make a decision.
        // Java evaluates a condition to determine whether it is TRUE
        // or FALSE.
        //
        // If the condition is TRUE, the code inside the IF block runs.
        // If the condition is FALSE, the code inside the IF block
        // is skipped.
        //
        // General structure:
        //
        // if (condition)
        // {
        //     Statements that run if the condition is true.
        // }
        //
        // The condition must produce a Boolean result:
        // true or false.


        // ============================================================
        // SECTION 2: OUR FIRST IF STATEMENT
        // ============================================================

        // Imagine that a Student has received a mark of 75.
        int mark = 75;

        System.out.println("EXAMPLE 1: CHECKING A MARK");

        // The condition checks whether the mark is greater than
        // or equal to 50.
        //
        // The >= operator means "greater than or equal to".
        //
        // If mark is 50 or higher, the condition is TRUE.
        // If mark is below 50, the condition is FALSE.
        if (mark >= 50)
        {
            // This statement only runs if mark >= 50 is TRUE.
            System.out.println("The Student has passed.");
        }

        // This statement is outside the IF block.
        // It runs whether the Student passes or fails.
        System.out.println("The mark is " + mark);
        System.out.println();


        // ============================================================
        // SECTION 3: WHAT HAPPENS WHEN THE CONDITION IS FALSE?
        // ============================================================

        int secondMark = 35;

        System.out.println("EXAMPLE 2: A CONDITION THAT IS FALSE");

        // Java checks whether 35 is greater than or equal to 50.
        // This condition is FALSE.
        //
        // Therefore, Java skips the statement inside the IF block.
        if (secondMark >= 50)
        {
            System.out.println("The Student has passed.");
        }

        // This statement still runs because it is outside the IF.
        System.out.println("The mark is " + secondMark);
        System.out.println();


        // ============================================================
        // SECTION 4: USING DIFFERENT RELATIONAL OPERATORS
        // ============================================================

        int age = 16;

        System.out.println("EXAMPLE 3: CHECKING AN AGE");

        // The > operator means "greater than".
        // The condition is FALSE because age is exactly 16.
        if (age > 16)
        {
            System.out.println("The Student is older than 16.");
        }

        // The >= operator means "greater than or equal to".
        // This condition is TRUE because age is 16.
        if (age >= 16)
        {
            System.out.println("The Student is at least 16 years old.");
        }

        // The == operator checks whether two values are equal.
        if (age == 16)
        {
            System.out.println("The Student is exactly 16 years old.");
        }

        // The != operator checks whether two values are different.
        if (age != 18)
        {
            System.out.println("The Student is not 18 years old.");
        }

        System.out.println();


        // ============================================================
        // SECTION 5: USING A BOOLEAN VARIABLE
        // ============================================================

        // A Boolean variable stores either true or false.
        boolean submittedHomework = true;

        System.out.println("EXAMPLE 4: CHECKING HOMEWORK");

        // Because submittedHomework is true, the condition is TRUE.
        if (submittedHomework)
        {
            System.out.println("Homework has been submitted.");
        }

        // You can also check whether a Boolean variable is false.
        // The ! operator means NOT and reverses a Boolean value.
        //
        // !submittedHomework would be false in this example.
        // Therefore, this IF block will not execute.
        if (!submittedHomework)
        {
            System.out.println("Homework is outstanding.");
        }

        System.out.println();


        // ============================================================
        // SECTION 6: USING A STRING COMPARISON
        // ============================================================

        String studentName = "Thabo";
        String classGroup = "10A";

        System.out.println("EXAMPLE 5: CHECKING STUDENT INFORMATION");

        // Use equals() to compare the contents of two Strings.
        // Do not use == to compare String contents.
        //
        // The condition is TRUE because studentName contains "Thabo".
        if (studentName.equals("Thabo"))
        {
            System.out.println("Student name confirmed.");
        }

        // Strings can also be compared without considering
        // uppercase and lowercase differences.
        //
        // equalsIgnoreCase() considers "10a" and "10A" equal.
        if (classGroup.equalsIgnoreCase("10a"))
        {
            System.out.println("The Student belongs to class 10A.");
        }

        System.out.println();


        // ============================================================
        // SECTION 7: USING AN IF STATEMENT TO CALCULATE A BONUS
        // ============================================================

        int testMark = 82;
        int bonus = 0;

        System.out.println("EXAMPLE 6: AWARDING A BONUS");

        // A Student receives a bonus of 5 marks if the test mark
        // is at least 80.
        //
        // First, bonus is set to 0.
        // If the condition is TRUE, bonus changes to 5.
        if (testMark >= 80)
        {
            bonus = 5;
        }

        // Java displays the value currently stored in bonus.
        System.out.println("Original mark: " + testMark);
        System.out.println("Bonus: " + bonus);
        System.out.println("Mark with bonus: " + (testMark + bonus));
        System.out.println();


        // ============================================================
        // SECTION 8: USING AN IF STATEMENT WITH A COUNTER
        // ============================================================

        // A counter is a variable used to count something.
        int numberOfHighMarks = 0;

        int mark1 = 85;
        int mark2 = 42;
        int mark3 = 76;

        System.out.println("EXAMPLE 7: COUNTING HIGH MARKS");

        // Check the first mark.
        // If it is at least 75, increase the counter by 1.
        if (mark1 >= 75)
        {
            numberOfHighMarks = numberOfHighMarks + 1;
        }

        // Check the second mark.
        if (mark2 >= 75)
        {
            numberOfHighMarks = numberOfHighMarks + 1;
        }

        // Check the third mark.
        if (mark3 >= 75)
        {
            numberOfHighMarks = numberOfHighMarks + 1;
        }

        // Only mark1 and mark3 are at least 75.
        // Therefore, the counter contains 2.
        System.out.println("Number of high marks: " + numberOfHighMarks);
        System.out.println();


        // ============================================================
        // SECTION 9: A COMMON MISTAKE - THE SEMICOLON
        // ============================================================

        int attendance = 90;

        System.out.println("EXAMPLE 8: AVOIDING COMMON MISTAKES");

        // CORRECT:
        // Do not place a semicolon immediately after the IF condition.
        if (attendance >= 80)
        {
            System.out.println("Attendance requirement met.");
        }

        // INCORRECT EXAMPLE - DO NOT USE:
        //
        // if (attendance >= 80);
        // {
        //     System.out.println("This block always runs.");
        // }
        //
        // The semicolon ends the IF statement.
        // The block that follows is then separate and runs regardless
        // of whether the condition is true or false.

        System.out.println();


        // ============================================================
        // SECTION 10: UNDERSTANDING THE SCOPE OF THE IF BLOCK
        // ============================================================

        int finalMark = 68;

        System.out.println("EXAMPLE 9: STATEMENTS INSIDE AND OUTSIDE IF");

        if (finalMark >= 50)
        {
            // This statement runs only when the condition is true.
            System.out.println("The Student passed.");
            System.out.println("Congratulations!");
        }

        // This statement is outside the IF block.
        // It runs even if finalMark is below 50.
        System.out.println("Assessment processing complete.");
        System.out.println();


        // ============================================================
        // SECTION 11: PRACTICE CHALLENGE
        // ============================================================

        // Read the requirements below and try to complete the task.
        //
        // A Student may join the school sports team if their
        // fitness score is at least 70.
        //
        // Your task:
        // 1. Create an integer variable called fitnessScore.
        // 2. Give it a value of 78.
        // 3. Write an IF statement that checks whether the score
        //    is at least 70.
        // 4. Display "Eligible for the sports team." if the condition
        //    is true.
        //
        // Try writing the solution yourself before looking below.

        int fitnessScore = 78;

        System.out.println("PRACTICE CHALLENGE");

        if (fitnessScore >= 70)
        {
            System.out.println("Eligible for the sports team.");
        }

        System.out.println("Fitness score: " + fitnessScore);
    }
}
