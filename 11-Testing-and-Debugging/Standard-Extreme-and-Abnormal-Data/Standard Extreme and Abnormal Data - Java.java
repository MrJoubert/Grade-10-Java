
import java.util.Scanner;

public class StandardExtremeAndAbnormalData
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("STUDENT MARK TESTING");
        System.out.println("====================");

        // Question 1: Testing standard data.
        // Standard data is typical input that should be accepted.
        // A mark of 75 is a normal, valid mark.

        System.out.println();
        System.out.println("TEST 1: STANDARD DATA");
        testMark(75);

        // Question 2: Testing extreme data.
        // Extreme data tests the valid boundaries of the range.
        // For a mark out of 100, the boundaries are 0 and 100.

        System.out.println();
        System.out.println("TEST 2: EXTREME DATA");
        testMark(0);
        testMark(100);

        // Question 3: Testing abnormal numeric data.
        // These values are integers, but they are outside
        // the acceptable range for a mark.

        System.out.println();
        System.out.println("TEST 3: ABNORMAL NUMERIC DATA");
        testMark(-1);
        testMark(101);

        // Question 4: Testing user input.
        // Input is received as a String so that non-numeric
        // data can be handled without crashing the program.

        System.out.println();
        System.out.println("TEST 4: USER INPUT");
        System.out.print("Enter a mark to test (0 to 100): ");

        String enteredValue = input.nextLine().trim();

        try
        {
            int mark = Integer.parseInt(enteredValue);

            testMark(mark);
        }
        catch (NumberFormatException e)
        {
            // This block runs when the input cannot be converted
            // into an integer, for example "seventy".
            System.out.println("Abnormal data: Enter a whole number.");
        }

        // Question 5: Testing empty input.
        // An empty String contains no characters.
        // It should not be treated as a valid mark.

        System.out.println();
        System.out.println("TEST 5: EMPTY DATA");

        String emptyValue = "";

        if (emptyValue.isEmpty())
        {
            System.out.println("Abnormal data: No mark was entered.");
        }
        else
        {
            System.out.println("Input supplied: " + emptyValue);
        }

        input.close();
    }

    // This method checks whether a mark is within the valid range.
    // It is reused for standard, extreme and abnormal numeric data.
    public static void testMark(int mark)
    {
        if (mark >= 0 && mark <= 100)
        {
            System.out.println("Mark " + mark + ": Accepted");
        }
        else
        {
            System.out.println("Mark " + mark + ": Rejected");
        }
    }
}

/*
EXPECTED OUTPUT

STUDENT MARK TESTING
====================

TEST 1: STANDARD DATA
Mark 75: Accepted

TEST 2: EXTREME DATA
Mark 0: Accepted
Mark 100: Accepted

TEST 3: ABNORMAL NUMERIC DATA
Mark -1: Rejected
Mark 101: Rejected

TEST 4: USER INPUT
Enter a mark to test (0 to 100): seventy
Abnormal data: Enter a whole number.

TEST 5: EMPTY DATA
Abnormal data: No mark was entered.

NOTE:
The result of TEST 4 depends on the value entered by the user.
The output above assumes that the user enters "seventy".

TEACHING EMPHASIS

1. Standard data is ordinary input that should be accepted.
2. Extreme data tests the valid boundaries of the permitted range.
3. Abnormal data is invalid input that should be rejected or handled.
4. For a mark from 0 to 100, both 0 and 100 are valid.
5. A mark of -1 or 101 is outside the valid range.
6. Numeric range validation and numeric type validation are different.
7. Integer.parseInt() can throw NumberFormatException when
   the input is not a valid integer.
8. Empty input should be handled appropriately.
9. Test cases should have an expected result before they are run.
10. Reusing a method allows the same validation logic to be tested
    with several different values.
*/
