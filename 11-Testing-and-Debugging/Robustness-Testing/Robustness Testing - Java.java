
import java.util.Scanner;

public class RobustnessTesting
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("STUDENT MARK ENTRY");
        System.out.println("==================");

        // Question 1: Testing normal input.
        // A normal input is a value the program is designed to accept.
        // For example, 75 is a valid mark out of 100.

        System.out.print("Enter a Student's mark (0 to 100): ");
        String markInput = input.nextLine().trim();

        // Question 2: Handling unexpected input.
        // Input is first received as a String.
        // This allows the program to check whether it is numeric
        // before attempting to use it as an integer.

        int mark;
        boolean validNumber = true;

        try
        {
            mark = Integer.parseInt(markInput);
        }
        catch (NumberFormatException e)
        {
            mark = -1;
            validNumber = false;
        }

        if (!validNumber)
        {
            System.out.println("Error: Enter a whole number.");
        }
        else if (mark < 0 || mark > 100)
        {
            // Question 3: Testing values outside the permitted range.
            // A value can be an integer but still be invalid.
            System.out.println("Error: The mark must be between 0 and 100.");
        }
        else
        {
            System.out.println("Mark accepted: " + mark);
        }

        // Question 4: Repeatedly requesting valid input.
        // A robust program can give the user another opportunity
        // to enter valid data instead of stopping after one error.

        boolean validMark = false;
        int acceptedMark = 0;

        while (!validMark)
        {
            System.out.print("Enter a valid mark (0 to 100): ");
            String inputValue = input.nextLine().trim();

            try
            {
                int enteredMark = Integer.parseInt(inputValue);

                if (enteredMark >= 0 && enteredMark <= 100)
                {
                    acceptedMark = enteredMark;
                    validMark = true;
                }
                else
                {
                    System.out.println(
                            "Invalid range. Enter a mark from 0 to 100.");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println(
                        "Invalid input. Enter a whole number, such as 75.");
            }
        }

        System.out.println("Accepted mark: " + acceptedMark);

        // Question 5: Checking that calculations use valid data.
        // Only calculate a result after a valid mark has been entered.

        if (acceptedMark >= 50)
        {
            System.out.println("Result: Pass");
        }
        else
        {
            System.out.println("Result: Fail");
        }

        // Question 6: Testing a calculation that could fail.
        // A program must check that a divisor is not zero
        // before performing integer division.

        System.out.print("Enter the number of assessment tasks: ");
        String tasksInput = input.nextLine().trim();

        try
        {
            int numberOfTasks = Integer.parseInt(tasksInput);

            if (numberOfTasks > 0)
            {
                int totalMarks = 240;
                int averagePerTask = totalMarks / numberOfTasks;

                System.out.println(
                        "Average marks per task: " + averagePerTask);
            }
            else
            {
                System.out.println(
                        "Error: The number of tasks must be greater than zero.");
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println(
                    "Error: Enter the number of tasks as a whole number.");
        }

        input.close();
    }
}

/*
EXAMPLE INTERACTION 1: NORMAL INPUT

Enter a Student's mark (0 to 100): 75
Mark accepted: 75
Enter a valid mark (0 to 100): 82
Accepted mark: 82
Result: Pass
Enter the number of assessment tasks: 3
Average marks per task: 80

EXAMPLE INTERACTION 2: NON-NUMERIC INPUT

Enter a Student's mark (0 to 100): abc
Error: Enter a whole number.

EXAMPLE INTERACTION 3: OUT-OF-RANGE INPUT

Enter a Student's mark (0 to 100): 150
Error: The mark must be between 0 and 100.

EXAMPLE INTERACTION 4: REPEATED VALIDATION

Enter a valid mark (0 to 100): eighty
Invalid input. Enter a whole number, such as 75.
Enter a valid mark (0 to 100): 120
Invalid range. Enter a mark from 0 to 100.
Enter a valid mark (0 to 100): 65
Accepted mark: 65
Result: Pass

EXAMPLE INTERACTION 5: INVALID NUMBER OF TASKS

Enter the number of assessment tasks: 0
Error: The number of tasks must be greater than zero.

TEACHING EMPHASIS

1. Robustness means that a program handles unexpected or invalid
   input appropriately.
2. Test both valid and invalid input.
3. Test values inside and outside acceptable ranges.
4. Input received from nextLine() is a String.
5. Integer.parseInt() converts a valid numeric String into an int.
6. NumberFormatException can be handled using try-catch.
7. Range validation checks whether a value is acceptable.
8. A loop can allow the user to correct invalid input.
9. Do not use invalid data in calculations.
10. Check that a divisor is not zero before dividing.
11. A robust program provides useful error messages instead of
    allowing preventable errors to interrupt execution.
12. Testing should include unexpected input, not only normal input.
*/
