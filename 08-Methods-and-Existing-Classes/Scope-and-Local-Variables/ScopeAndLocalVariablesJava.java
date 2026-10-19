
public class ScopeAndLocalVariables
{
    public static void main(String[] args)
    {
        // ============================================================
        // SECTION 1: WHAT IS VARIABLE SCOPE?
        // ============================================================
        // Scope determines where a variable can be accessed.
        //
        // A local variable is declared inside a method or a block.
        // It can only be accessed within the part of the program
        // where it is declared and available.
        //
        // The variable studentName is declared inside main().
        // Therefore, it can be used throughout main() after its
        // declaration, but not directly inside another method.

        System.out.println("SECTION 1: LOCAL VARIABLES");

        String studentName = "Ayesha Khan";
        int mark = 85;

        System.out.println("Student: " + studentName);
        System.out.println("Mark: " + mark);

        // ============================================================
        // SECTION 2: EACH METHOD HAS ITS OWN LOCAL VARIABLES
        // ============================================================
        // A variable declared inside one method belongs to that
        // method's scope.
        //
        // The variable message inside displayMessage() is separate
        // from any variable called message declared elsewhere.
        //
        // Variables with the same name in different methods are
        // separate variables when their scopes do not overlap.

        System.out.println();
        System.out.println("SECTION 2: SEPARATE METHOD SCOPES");

        displayMessage();
        displayAnotherMessage();

        // ============================================================
        // SECTION 3: A VARIABLE CANNOT BE USED OUTSIDE ITS SCOPE
        // ============================================================
        // The variable testMark is declared inside calculateTotal().
        //
        // It cannot be accessed directly from main() because it
        // belongs to calculateTotal()'s local scope.
        //
        // The method can return a value if another method needs
        // to use the result of its calculation.

        System.out.println();
        System.out.println("SECTION 3: RETURNING A CALCULATION");

        int total = calculateTotal();

        System.out.println("Returned total: " + total);

        // ============================================================
        // SECTION 4: METHOD PARAMETERS ARE LOCAL VARIABLES
        // ============================================================
        // A parameter is declared in a method header.
        //
        // Parameters behave like local variables inside the method.
        // They receive values supplied by the method call.
        //
        // The parameter name is only available inside that method.

        System.out.println();
        System.out.println("SECTION 4: METHOD PARAMETERS");

        displayStudent("Liam Smith", 11);
        displayStudent("Naledi Molefe", 12);

        // ============================================================
        // SECTION 5: THE SAME VARIABLE NAME IN DIFFERENT METHODS
        // ============================================================
        // Two methods can declare local variables with the same name.
        //
        // These variables are separate because each belongs to a
        // different method.
        //
        // Changing the local variable in one method does not change
        // the local variable in the other method.

        System.out.println();
        System.out.println("SECTION 5: SAME NAME, DIFFERENT VARIABLES");

        displayFirstMark();
        displaySecondMark();

        // ============================================================
        // SECTION 6: BLOCK SCOPE
        // ============================================================
        // Variables declared inside a block are limited to that block.
        //
        // A block is normally enclosed by braces { }.
        //
        // The variable bonus is declared inside the if block.
        // It can be used inside that block but not after the closing
        // brace of the if statement.

        System.out.println();
        System.out.println("SECTION 6: BLOCK SCOPE");

        int originalMark = 70;

        if (originalMark >= 50)
        {
            int bonus = 5;

            System.out.println("Original mark: " + originalMark);
            System.out.println("Bonus: " + bonus);
        }

        System.out.println("The if block has finished.");

        // ============================================================
        // SECTION 7: VARIABLES DECLARED BEFORE A BLOCK
        // ============================================================
        // A variable declared outside an if block can be accessed
        // inside that block and later in the enclosing scope.
        //
        // Here, adjustedMark is declared before the if statement.
        // It can therefore be used after the if statement finishes.

        System.out.println();
        System.out.println("SECTION 7: VARIABLE OUTSIDE A BLOCK");

        int markToAdjust = 72;
        int adjustedMark = markToAdjust;

        if (markToAdjust >= 70)
        {
            adjustedMark = markToAdjust + 5;
        }

        System.out.println("Original mark: " + markToAdjust);
        System.out.println("Adjusted mark: " + adjustedMark);

        // ============================================================
        // SECTION 8: PASSING INFORMATION BETWEEN METHODS
        // ============================================================
        // A local variable cannot simply be accessed from another
        // method.
        //
        // One solution is to pass its value as an argument.
        //
        // main() passes studentMark to displayResult().
        // The parameter mark receives the supplied value.

        System.out.println();
        System.out.println("SECTION 8: PASSING A VALUE");

        int studentMark = 68;

        displayResult(studentMark);

        // ============================================================
        // SECTION 9: RETURNING INFORMATION BETWEEN METHODS
        // ============================================================
        // Another way to transfer information is to return a value.
        //
        // calculateAverage() creates and calculates a local variable.
        // It returns the result to the calling statement.
        //
        // main() stores that returned value in its own local variable.

        System.out.println();
        System.out.println("SECTION 9: RETURNING A VALUE");

        double average = calculateAverage(75, 85);

        System.out.println("Average: " + average);

        // ============================================================
        // SECTION 10: LOOP VARIABLE SCOPE
        // ============================================================
        // A variable declared in a for-loop header is normally
        // accessible only within that loop.
        //
        // The variable counter is used to control the loop.
        // After the loop finishes, it cannot be accessed outside
        // the loop's scope.
        //
        // The variable total is declared before the loop, so it
        // remains available after the loop finishes.

        System.out.println();
        System.out.println("SECTION 10: LOOP VARIABLE SCOPE");

        int totalMarks = 0;

        for (int counter = 1; counter <= 3; counter++)
        {
            totalMarks = totalMarks + counter * 10;
        }

        System.out.println("Total marks: " + totalMarks);

        // ============================================================
        // SECTION 11: LOCAL VARIABLES MUST BE INITIALISED
        // ============================================================
        // Local variables do not automatically receive default
        // values when declared.
        //
        // Before using a local variable, Java must be able to
        // determine that it has been assigned a value.
        //
        // This example assigns a value before displaying the variable.

        System.out.println();
        System.out.println("SECTION 11: INITIALISING VARIABLES");

        int homeworkMark;
        homeworkMark = 90;

        System.out.println("Homework mark: " + homeworkMark);

        // ============================================================
        // SECTION 12: COMMON SCOPE MISTAKES
        // ============================================================
        // 1. Trying to use a local variable from another method.
        //
        // 2. Trying to use a variable declared inside an if block
        //    after the block has finished.
        //
        // 3. Trying to access a for-loop counter outside its scope.
        //
        // 4. Assuming that two local variables with the same name
        //    in different methods are the same variable.
        //
        // 5. Using a local variable before assigning it a value.
        //
        // 6. Forgetting to pass a value as an argument or return it
        //    when another method needs the information.
        //
        // Remember:
        // Scope controls where a variable can be accessed.
        // Parameters and return values allow methods to exchange data.

        // ============================================================
        // SECTION 13: PRACTICE CHALLENGE
        // ============================================================
        // Create a method called calculatePercentage().
        //
        // Inside the method:
        // 1. Declare a local variable called percentage.
        // 2. Calculate the percentage from a mark and maximum mark.
        // 3. Return the percentage.
        //
        // In main():
        // 4. Call the method using 36 and 40 as arguments.
        // 5. Store the returned value in a variable.
        // 6. Display the result.
        //
        // Remember that the local variable inside the method is
        // separate from the variable declared in main().

        System.out.println();
        System.out.println("SECTION 13: PRACTICE CHALLENGE");

        double percentage = calculatePercentage(36, 40);

        System.out.println("Percentage: " + percentage + "%");
    }

    // ================================================================
    // METHOD 1: DISPLAY A MESSAGE
    // ================================================================
    // message is a local variable.
    // It can only be accessed inside displayMessage().

    public static void displayMessage()
    {
        String message = "This message belongs to displayMessage().";

        System.out.println(message);
    }

    // ================================================================
    // METHOD 2: DISPLAY ANOTHER MESSAGE
    // ================================================================
    // This method also declares a variable called message.
    //
    // It is a separate variable from the one in displayMessage()
    // because the two variables belong to different methods.

    public static void displayAnotherMessage()
    {
        String message = "This message belongs to displayAnotherMessage().";

        System.out.println(message);
    }

    // ================================================================
    // METHOD 3: CALCULATE A TOTAL
    // ================================================================
    // testMark is local to this method.
    // The returned total allows another method to use the result.

    public static int calculateTotal()
    {
        int testMark = 65;
        int examMark = 80;
        int total = testMark + examMark;

        return total;
    }

    // ================================================================
    // METHOD 4: DISPLAY STUDENT DETAILS
    // ================================================================
    // name and grade are parameters.
    // They are available inside this method only.

    public static void displayStudent(String name, int grade)
    {
        System.out.println("Student: " + name);
        System.out.println("Grade: " + grade);
    }

    // ================================================================
    // METHOD 5: DISPLAY THE FIRST MARK
    // ================================================================

    public static void displayFirstMark()
    {
        int mark = 75;

        System.out.println("First mark: " + mark);
    }

    // ================================================================
    // METHOD 6: DISPLAY THE SECOND MARK
    // ================================================================

    public static void displaySecondMark()
    {
        int mark = 92;

        System.out.println("Second mark: " + mark);
    }

    // ================================================================
    // METHOD 7: DISPLAY A RESULT
    // ================================================================

    public static void displayResult(int mark)
    {
        if (mark >= 50)
        {
            System.out.println("The Student has passed.");
        }
        else
        {
            System.out.println("The Student has failed.");
        }
    }

    // ================================================================
    // METHOD 8: CALCULATE AN AVERAGE
    // ================================================================

    public static double calculateAverage(int mark1, int mark2)
    {
        double average = (mark1 + mark2) / 2.0;

        return average;
    }

    // ================================================================
    // METHOD 9: CALCULATE A PERCENTAGE
    // ================================================================

    public static double calculatePercentage(
            int markObtained, int maximumMark)
    {
        double percentage = markObtained * 100.0 / maximumMark;

        return percentage;
    }
}
