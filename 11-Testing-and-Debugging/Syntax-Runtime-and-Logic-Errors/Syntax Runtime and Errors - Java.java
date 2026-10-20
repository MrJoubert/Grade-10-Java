
public class SyntaxRuntimeAndLogicErrors
{
    public static void main(String[] args)
    {
        System.out.println("UNDERSTANDING JAVA ERRORS");
        System.out.println("=========================");

        // Question 1: Syntax errors.
        // A syntax error occurs when code does not follow Java's rules.
        //
        // INCORRECT EXAMPLE:
        // System.out.println("Student registered.")
        //
        // ERROR:
        // The semicolon is missing at the end of the statement.
        // Java will not compile this statement correctly.
        //
        // CORRECTED CODE:

        System.out.println("Student registered successfully.");

        // Question 2: Runtime errors.
        // A runtime error occurs while a program is executing.
        //
        // INCORRECT EXAMPLE:
        // int totalMarks = 200;
        // int numberOfStudents = 0;
        // int average = totalMarks / numberOfStudents;
        //
        // ERROR:
        // Integer division by zero causes an ArithmeticException.
        //
        // CORRECTED CODE:
        // Check that the divisor is not zero before dividing.

        int totalMarks = 200;
        int numberOfStudents = 0;

        if (numberOfStudents != 0)
        {
            int average = totalMarks / numberOfStudents;
            System.out.println("Average: " + average);
        }
        else
        {
            System.out.println(
                    "Error: Cannot calculate an average using zero Students.");
        }

        // Question 3: Logic errors.
        // A logic error occurs when the program runs but produces
        // an incorrect result.
        //
        // INCORRECT EXAMPLE:
        // int testMark = 60;
        // int examMark = 80;
        // double average = testMark + examMark / 2.0;
        //
        // ERROR:
        // Division happens before addition.
        // The result is not the average of the two marks.
        //
        // CORRECTED CODE:
        // Add the marks first, then divide by 2.0.

        int testMark = 60;
        int examMark = 80;

        double averageMark = (testMark + examMark) / 2.0;

        System.out.println("Test mark: " + testMark);
        System.out.println("Exam mark: " + examMark);
        System.out.println("Correct average: " + averageMark);

        // Question 4: A logic error involving a boundary condition.
        // Assume a mark of 50 or more is a pass.
        //
        // INCORRECT LOGIC:
        // if (mark > 50)
        //
        // ERROR:
        // A mark of exactly 50 would incorrectly be treated as a fail.
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

        // Question 5: A runtime error caused by an invalid array index.
        // Array indexes start at 0.
        // An array with three elements has indexes 0, 1 and 2.
        //
        // INCORRECT EXAMPLE:
        // String[] students = {"Liam", "Olivia", "Noah"};
        // System.out.println(students[3]);
        //
        // ERROR:
        // Index 3 does not exist in this array.
        // Accessing it causes an ArrayIndexOutOfBoundsException.
        //
        // CORRECTED CODE:

        String[] students = {"Liam", "Olivia", "Noah"};

        System.out.println("First Student: " + students[0]);
        System.out.println("Last Student: " + students[2]);

        // Question 6: Using a loop to access array elements safely.
        // The condition i < students.length prevents the loop
        // from accessing an index beyond the end of the array.

        System.out.println("Class list:");

        for (int i = 0; i < students.length; i++)
        {
            System.out.println(students[i]);
        }

        System.out.println("=========================");
        System.out.println("Error examples completed.");
    }
}

/*
EXPECTED OUTPUT

UNDERSTANDING JAVA ERRORS
=========================
Student registered successfully.
Error: Cannot calculate an average using zero Students.
Test mark: 60
Exam mark: 80
Correct average: 70.0
Result: Pass
First Student: Liam
Last Student: Noah
Class list:
Liam
Olivia
Noah
=========================
Error examples completed.

TEACHING EMPHASIS

1. Syntax errors prevent code from compiling successfully.
2. Runtime errors occur while a program is executing.
3. Logic errors cause a program to produce an incorrect result.
4. A missing semicolon is an example of a syntax error.
5. Integer division by zero causes an ArithmeticException.
6. Accessing an invalid array index causes an
   ArrayIndexOutOfBoundsException.
7. Brackets can change the order of calculations.
8. Boundary conditions must be checked carefully.
9. Array indexes start at 0.
10. The final valid array index is array.length - 1.
11. Loops can use i < array.length to process every element safely.
12. Debugging involves identifying and correcting errors.
13. After correcting an error, test the program again.
*/
