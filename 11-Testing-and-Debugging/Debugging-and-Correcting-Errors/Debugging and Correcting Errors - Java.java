
public class DebuggingAndCorrectingErrors
{
    public static void main(String[] args)
    {
        System.out.println("JAVA DEBUGGING PRACTICE");
        System.out.println("=======================");

        // Question 1: Correcting a syntax error.
        // A syntax error occurs when Java's language rules are broken.
        //
        // INCORRECT EXAMPLE:
        // System.out.println("Student registered.")
        //
        // ERROR:
        // The semicolon is missing at the end of the statement.
        //
        // CORRECTED CODE:

        System.out.println("Student registered.");

        // Question 2: Correcting a variable name error.
        // Java is case-sensitive.
        // studentName and StudentName are different identifiers.
        //
        // INCORRECT EXAMPLE:
        // String studentName = "Liam";
        // System.out.println(StudentName);
        //
        // ERROR:
        // StudentName has not been declared.
        //
        // CORRECTED CODE:

        String studentName = "Liam";
        System.out.println("Student name: " + studentName);

        // Question 3: Correcting a logic error.
        // A logic error allows the program to run, but the answer
        // produced is incorrect.
        //
        // INCORRECT EXAMPLE:
        // int testMark = 70;
        // int examMark = 80;
        // int total = testMark + examMark / 2;
        //
        // ERROR:
        // Division is performed before addition.
        // The calculation does not calculate the average correctly.
        //
        // CORRECTED CODE:

        int testMark = 70;
        int examMark = 80;

        double average = (testMark + examMark) / 2.0;

        System.out.println("Test mark: " + testMark);
        System.out.println("Exam mark: " + examMark);
        System.out.println("Correct average: " + average);

        // Question 4: Correcting a selection logic error.
        // The program should determine whether a Student has passed.
        //
        // INCORRECT LOGIC:
        // if (mark > 50)
        // {
        //     System.out.println("Pass");
        // }
        // else
        // {
        //     System.out.println("Fail");
        // }
        //
        // ERROR:
        // If the pass mark is 50%, a mark of exactly 50 should pass.
        // The condition mark > 50 incorrectly excludes 50.
        //
        // CORRECTED CODE:

        int mark = 50;

        if (mark >= 50)
        {
            System.out.println("Result: Pass");
        }
        else
        {
            System.out.println("Result: Fail");
        }

        // Question 5: Preventing a runtime error.
        // A runtime error occurs while a program is executing.
        //
        // DIVISION BY ZERO:
        // int numberOfStudents = 30;
        // int numberOfGroups = 0;
        // int studentsPerGroup = numberOfStudents / numberOfGroups;
        //
        // ERROR:
        // Integer division by zero causes an ArithmeticException.
        //
        // CORRECTED CODE:
        // Check that the divisor is not zero before dividing.

        int numberOfStudents = 30;
        int numberOfGroups = 0;

        if (numberOfGroups != 0)
        {
            int studentsPerGroup = numberOfStudents / numberOfGroups;
            System.out.println("Students per group: " + studentsPerGroup);
        }
        else
        {
            System.out.println("Error: Number of groups cannot be zero.");
        }

        // Question 6: Correcting an incorrect loop condition.
        // A loop that uses the wrong condition may repeat too many
        // times or stop before processing all the required values.
        //
        // INCORRECT EXAMPLE:
        // for (int i = 1; i < 4; i++)
        // {
        //     System.out.println(i);
        // }
        //
        // This prints 1, 2 and 3.
        // If the intention is to print 1 to 4, the condition
        // must allow i to equal 4.
        //
        // CORRECTED CODE:

        System.out.println("Numbers from 1 to 4:");

        for (int i = 1; i <= 4; i++)
        {
            System.out.println(i);
        }

        // Question 7: Correcting an incorrect assignment.
        // The assignment operator (=) stores a value in a variable.
        // The equality operator (==) compares two values.
        //
        // INCORRECT EXAMPLE:
        // if (mark = 75)
        //
        // ERROR:
        // A comparison is required, not an assignment.
        //
        // CORRECTED CODE:

        int recordedMark = 75;

        if (recordedMark == 75)
        {
            System.out.println("The recorded mark is 75.");
        }

        // Question 8: Correcting an incorrect total.
        // Check that the correct variables are used in a calculation.
        //
        // INCORRECT EXAMPLE:
        // int homeworkMark = 20;
        // int testMark = 80;
        // int totalMarks = homeworkMark + homeworkMark;
        //
        // ERROR:
        // homeworkMark is added twice instead of adding testMark.
        //
        // CORRECTED CODE:

        int homeworkMark = 20;
        int assessmentMark = 80;

        int totalMarks = homeworkMark + assessmentMark;

        System.out.println("Total marks: " + totalMarks);

        // Question 9: Checking the output of a corrected program.
        // Testing helps confirm that the correction works as intended.

        System.out.println("=======================");
        System.out.println("Debugging practice complete.");
    }
}

/*
EXPECTED OUTPUT

JAVA DEBUGGING PRACTICE
=======================
Student registered.
Student name: Liam
Test mark: 70
Exam mark: 80
Correct average: 75.0
Result: Pass
Error: Number of groups cannot be zero.
Numbers from 1 to 4:
1
2
3
4
The recorded mark is 75.
Total marks: 100
=======================
Debugging practice complete.

TEACHING EMPHASIS

1. Syntax errors occur when Java's language rules are broken.
2. Runtime errors occur while a program is executing.
3. Logic errors produce an incorrect result even though the
   program may compile and run.
4. Java is case-sensitive.
5. Brackets are important when performing calculations.
6. Check boundary conditions carefully, especially when using
   >=, <=, > and <.
7. Check that a divisor is not zero before dividing.
8. Check loop conditions to ensure that the correct values
   are processed.
9. Use == to compare primitive values and = to assign values.
10. Check that calculations use the correct variables.
11. Debugging involves identifying, investigating and correcting
    errors in a program.
12. Test the corrected program to confirm that it behaves correctly.
*/
