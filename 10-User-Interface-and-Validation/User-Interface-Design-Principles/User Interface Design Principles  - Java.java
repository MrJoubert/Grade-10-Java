
import java.util.Scanner;

public class UserInterfaceDesignPrinciples
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Question 1: Use a clear heading.
        // A heading tells the user what the program is for.
        // Consistent headings help users understand where they are.

        System.out.println("==================================");
        System.out.println("     STUDENT REGISTRATION");
        System.out.println("==================================");

        // Question 2: Give clear instructions.
        // Tell the user exactly what information to enter.
        // Avoid vague prompts such as "Enter data".

        System.out.print("Enter the Student's first name: ");
        String studentName = input.nextLine().trim();

        // Question 3: Validate input.
        // A program should not accept an empty name.
        // The user receives a message explaining the problem.

        if (studentName.isEmpty())
        {
            System.out.println();
            System.out.println("ERROR: A Student name is required.");
            System.out.println("Please restart the program and enter a name.");

            input.close();
            return;
        }

        // Question 4: Use a clear and consistent input format.
        // A numbered list makes the available choices easy to understand.
        // The same style of prompt is used throughout the program.

        System.out.println();
        System.out.println("Select the Student's grade:");
        System.out.println("1. Grade 10");
        System.out.println("2. Grade 11");
        System.out.println("3. Grade 12");
        System.out.print("Enter your choice (1 to 3): ");

        String gradeChoice = input.nextLine().trim();

        String grade;

        // Question 5: Provide feedback for invalid choices.
        // The program checks the user's selection before continuing.

        switch (gradeChoice)
        {
            case "1":
                grade = "10";
                break;

            case "2":
                grade = "11";
                break;

            case "3":
                grade = "12";
                break;

            default:
                System.out.println();
                System.out.println("ERROR: Invalid grade selection.");
                System.out.println("Please choose 1, 2 or 3.");

                input.close();
                return;
        }

        // Question 6: Keep the interface simple.
        // Only ask for information needed for this example.
        // Avoid unnecessary questions that make a form longer.

        System.out.print("Enter the Student's age: ");
        String ageInput = input.nextLine().trim();

        int age;

        try
        {
            age = Integer.parseInt(ageInput);
        }
        catch (NumberFormatException e)
        {
            System.out.println();
            System.out.println("ERROR: Age must be a whole number.");
            System.out.println("Example: Enter 17, not seventeen.");

            input.close();
            return;
        }

        // Question 7: Check that the age is within an acceptable range.
        if (age < 5 || age > 25)
        {
            System.out.println();
            System.out.println("ERROR: Age must be between 5 and 25.");

            input.close();
            return;
        }

        // Question 8: Present a clear summary before confirming success.
        // Labels make it easy for the user to check the information.
        // Spacing separates the summary from the rest of the interaction.

        System.out.println();
        System.out.println("==================================");
        System.out.println("     REGISTRATION SUMMARY");
        System.out.println("==================================");
        System.out.println("Student name: " + studentName);
        System.out.println("Grade: " + grade);
        System.out.println("Age: " + age);
        System.out.println("==================================");

        // Question 9: Give clear feedback.
        // The message confirms that the supplied information
        // passed the checks performed by this program.

        System.out.println("Student information accepted.");
        System.out.println("Thank you for using the system.");

        input.close();
    }
}

/*
EXAMPLE INTERACTION

==================================
     STUDENT REGISTRATION
==================================
Enter the Student's first name: Liam

Select the Student's grade:
1. Grade 10
2. Grade 11
3. Grade 12
Enter your choice (1 to 3): 3
Enter the Student's age: 17

==================================
     REGISTRATION SUMMARY
==================================
Student name: Liam
Grade: 12
Age: 17
==================================
Student information accepted.
Thank you for using the system.

OTHER POSSIBLE OUTCOMES

If the user enters an empty name:
ERROR: A Student name is required.
Please restart the program and enter a name.

If the user enters 5 for the grade choice:
ERROR: Invalid grade selection.
Please choose 1, 2 or 3.

If the user enters seventeen for the age:
ERROR: Age must be a whole number.
Example: Enter 17, not seventeen.

If the user enters 40 for the age:
ERROR: Age must be between 5 and 25.

TEACHING EMPHASIS

1. Consistency: use a similar style for headings, prompts and messages.
2. Simplicity: request only the information needed for the task.
3. Clarity: explain exactly what the user must enter.
4. Readability: use spacing, headings and descriptive labels.
5. Validation: check input before processing it.
6. Error prevention: use numbered options where appropriate.
7. Feedback: tell the user whether an action succeeded or failed.
8. Helpful errors: explain how the user can correct a problem.
9. User control: make available choices clear.
10. Appropriate output: display information in a logical order.
11. Robustness: handle invalid numeric input without crashing.
12. Design principle: a good interface makes a program easier to use.
*/
