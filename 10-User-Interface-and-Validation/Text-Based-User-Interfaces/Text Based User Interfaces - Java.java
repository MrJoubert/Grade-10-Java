
import java.util.Scanner;

public class TextBasedUserInterfaces
{
    public static void main(String[] args)
    {
        // Question 1: Creating a Scanner object.
        // Scanner allows the program to receive keyboard input.
        Scanner input = new Scanner(System.in);

        // The variable controls whether the menu should continue.
        boolean running = true;

        // Question 2: Repeating a menu using a while loop.
        // The menu appears again after an action is completed.
        // The loop ends when the user chooses option 4.
        while (running)
        {
            System.out.println();
            System.out.println("==============================");
            System.out.println("STUDENT MANAGEMENT SYSTEM");
            System.out.println("==============================");
            System.out.println("1. Display school information");
            System.out.println("2. Calculate a Student's average");
            System.out.println("3. Check a Student's result");
            System.out.println("4. Exit");
            System.out.println("==============================");
            System.out.print("Enter your choice: ");

            // Read the menu choice as a String first.
            // This prevents the program from crashing if the
            // user enters text instead of a number.
            String choice = input.nextLine().trim();

            // Question 3: Processing the menu choice.
            // A switch statement selects the action to perform.
            switch (choice)
            {
                case "1":
                    // Display general school information.
                    System.out.println();
                    System.out.println("School: Crawford International College");
                    System.out.println("Grades: 10, 11 and 12");
                    break;

                case "2":
                    // Question 4: Requesting and validating marks.
                    System.out.print("Enter the first mark (0 to 100): ");
                    String firstInput = input.nextLine().trim();

                    System.out.print("Enter the second mark (0 to 100): ");
                    String secondInput = input.nextLine().trim();

                    try
                    {
                        int firstMark = Integer.parseInt(firstInput);
                        int secondMark = Integer.parseInt(secondInput);

                        if (firstMark >= 0 && firstMark <= 100
                                && secondMark >= 0 && secondMark <= 100)
                        {
                            double average = (firstMark + secondMark) / 2.0;

                            System.out.println("Average: " + average + "%");
                        }
                        else
                        {
                            System.out.println(
                                    "Error: Both marks must be from 0 to 100.");
                        }
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println(
                                "Error: Enter whole numbers for both marks.");
                    }

                    break;

                case "3":
                    // Question 5: Checking whether a Student passed.
                    System.out.print("Enter the Student's mark: ");
                    String markInput = input.nextLine().trim();

                    try
                    {
                        int mark = Integer.parseInt(markInput);

                        if (mark >= 0 && mark <= 100)
                        {
                            if (mark >= 50)
                            {
                                System.out.println("Result: Pass");
                            }
                            else
                            {
                                System.out.println("Result: Fail");
                            }
                        }
                        else
                        {
                            System.out.println(
                                    "Error: The mark must be from 0 to 100.");
                        }
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println(
                                "Error: Please enter a whole number.");
                    }

                    break;

                case "4":
                    // Question 6: Ending the menu loop.
                    System.out.println("Thank you for using the system.");
                    running = false;
                    break;

                default:
                    // This runs when the choice does not match
                    // any of the available menu options.
                    System.out.println(
                            "Invalid choice. Please select 1, 2, 3 or 4.");
                    break;
            }
        }

        // Close the Scanner when the program no longer needs it.
        input.close();
    }
}

/*
EXAMPLE INTERACTION

==============================
STUDENT MANAGEMENT SYSTEM
==============================
1. Display school information
2. Calculate a Student's average
3. Check a Student's result
4. Exit
==============================
Enter your choice: 1

School: Crawford International College
Grades: 10, 11 and 12

The menu appears again.

Enter your choice: 2
Enter the first mark (0 to 100): 75
Enter the second mark (0 to 100): 85
Average: 80.0%

The menu appears again.

Enter your choice: 3
Enter the Student's mark: 42
Result: Fail

The menu appears again.

Enter your choice: 4
Thank you for using the system.

TEACHING EMPHASIS

1. A text-based interface communicates through text in the console.
2. System.out.println() displays text and moves to a new line.
3. System.out.print() displays text without moving to a new line.
4. Scanner receives input from the keyboard.
5. nextLine() reads the user's input as a String.
6. A while loop can keep displaying a menu.
7. A switch statement processes the selected option.
8. break exits the current switch case.
9. Changing running to false causes the while loop to end.
10. default handles choices that do not match a case.
11. try-catch handles input that cannot be converted to an integer.
12. Validate the range of a mark after checking its numeric format.
13. Clear instructions and helpful error messages improve usability.
14. A menu-driven program should provide a clear way to exit.
*/
