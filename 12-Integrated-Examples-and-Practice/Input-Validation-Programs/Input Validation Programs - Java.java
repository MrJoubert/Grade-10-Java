
import java.util.Scanner;

/**
 * File: InputValidationPrograms.java
 * Folder: 12-Integrated-Examples-and-Practice/Input-Validation-Programs
 *
 * PURPOSE:
 * To demonstrate how to validate input so that a programme only
 * processes values that meet specified requirements.
 *
 * CONCEPTS DEMONSTRATED:
 * 1. Range validation.
 * 2. Repeating input prompts using while loops.
 * 3. Validating menu selections.
 * 4. Validating text input.
 * 5. Combining validation with selection and calculations.
 *
 * IMPORTANT:
 * These examples validate the values entered by the user.
 * Scanner input methods such as nextInt() expect the correct data type.
 * Entering text where an integer is expected can cause an exception.
 */

public class InputValidationPrograms {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // =========================================================
        // EXAMPLE 1: VALIDATING A MARK
        // =========================================================

        System.out.println("EXAMPLE 1: MARK VALIDATION");
        System.out.println("-------------------------");

        // A mark must be between 0 and 100, inclusive.

        System.out.print("Enter a mark out of 100: ");
        int mark = input.nextInt();

        // Repeat the prompt while the mark is outside the valid range.
        // The || operator means OR.
        // Only one of these conditions needs to be true for the mark
        // to be invalid.

        while (mark < 0 || mark > 100) {
            System.out.println("Invalid mark.");
            System.out.println("The mark must be between 0 and 100.");

            System.out.print("Enter a mark out of 100: ");
            mark = input.nextInt();
        }

        // The programme reaches this point only when the mark is valid.

        System.out.println("Valid mark accepted: " + mark);

        // =========================================================
        // EXAMPLE 2: VALIDATING A MENU CHOICE
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 2: MENU VALIDATION");
        System.out.println("-------------------------");

        // The user must select one of the available options.

        System.out.println("1. View Student result");
        System.out.println("2. View class average");
        System.out.println("3. Exit");

        System.out.print("Select an option (1-3): ");
        int choice = input.nextInt();

        // A choice below 1 or above 3 is invalid.

        while (choice < 1 || choice > 3) {
            System.out.println("Invalid option.");
            System.out.print("Select an option (1-3): ");
            choice = input.nextInt();
        }

        // Use selection to respond to the valid menu choice.

        switch (choice) {
            case 1:
                System.out.println("You selected: View Student result");
                break;

            case 2:
                System.out.println("You selected: View class average");
                break;

            case 3:
                System.out.println("You selected: Exit");
                break;
        }

        // =========================================================
        // EXAMPLE 3: VALIDATING TEXT INPUT
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 3: TEXT VALIDATION");
        System.out.println("-------------------------");

        // A Student's name must not be empty or contain only spaces.
        // nextLine() allows the user to enter a name containing spaces.

        input.nextLine(); // Consume the newline left by nextInt().

        System.out.print("Enter the Student's first name: ");
        String firstName = input.nextLine();

        // trim() removes spaces from the beginning and end.
        // isEmpty() checks whether the resulting String has no characters.

        while (firstName.trim().isEmpty()) {
            System.out.println("The name cannot be blank.");
            System.out.print("Enter the Student's first name: ");
            firstName = input.nextLine();
        }

        System.out.println("Name accepted: " + firstName.trim());

        // =========================================================
        // EXAMPLE 4: VALIDATING AN AGE
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 4: AGE VALIDATION");
        System.out.println("------------------------");

        // For this example, the acceptable age range is 13 to 19.
        // This range is an example for a school-based programme.

        System.out.print("Enter the Student's age: ");
        int age = input.nextInt();

        while (age < 13 || age > 19) {
            System.out.println("Invalid age.");
            System.out.println("Enter an age from 13 to 19.");

            System.out.print("Enter the Student's age: ");
            age = input.nextInt();
        }

        System.out.println("Valid age accepted: " + age);

        // =========================================================
        // EXAMPLE 5: VALIDATING INPUT BEFORE A CALCULATION
        // =========================================================

        System.out.println();
        System.out.println("EXAMPLE 5: VALIDATION AND CALCULATION");
        System.out.println("-------------------------------------");

        // Both marks must be within the range 0 to 100.
        // Each input is validated separately before the average
        // is calculated.

        System.out.print("Enter the first mark: ");
        int firstMark = input.nextInt();

        while (firstMark < 0 || firstMark > 100) {
            System.out.println("Enter a mark from 0 to 100.");
            System.out.print("Enter the first mark: ");
            firstMark = input.nextInt();
        }

        System.out.print("Enter the second mark: ");
        int secondMark = input.nextInt();

        while (secondMark < 0 || secondMark > 100) {
            System.out.println("Enter a mark from 0 to 100.");
            System.out.print("Enter the second mark: ");
            secondMark = input.nextInt();
        }

        // Divide by 2.0 to ensure that the average can contain decimals.

        double average = (firstMark + secondMark) / 2.0;

        System.out.printf("Average: %.2f%%%n", average);

        input.close();
    }
}

/*
SAMPLE RUN

EXAMPLE 1: MARK VALIDATION
-------------------------
Enter a mark out of 100: 120
Invalid mark.
The mark must be between 0 and 100.
Enter a mark out of 100: 75
Valid mark accepted: 75

EXAMPLE 2: MENU VALIDATION
-------------------------
1. View Student result
2. View class average
3. Exit
Select an option (1-3): 5
Invalid option.
Select an option (1-3): 2
You selected: View class average

EXAMPLE 3: TEXT VALIDATION
-------------------------
Enter the Student's first name:
The name cannot be blank.
Enter the Student's first name:   [spaces entered]
The name cannot be blank.
Enter the Student's first name: Aiden
Name accepted: Aiden

EXAMPLE 4: AGE VALIDATION
------------------------
Enter the Student's age: 17
Valid age accepted: 17

EXAMPLE 5: VALIDATION AND CALCULATION
-------------------------------------
Enter the first mark: 80
Enter the second mark: 65
Average: 72.50%

Note: Each example runs in sequence in the same programme.
The sample run illustrates selected inputs, not every prompt.
*/
