
public class ReturnValuesAndReturnTypes
{
    public static void main(String[] args)
    {
        // ============================================================
        // SECTION 1: WHAT IS A RETURN VALUE?
        // ============================================================
        // A return value is information sent back from a method
        // to the statement that called it.
        //
        // A method that returns a value must specify its data type
        // in the method header.
        //
        // For example:
        // public static int calculateTotal()
        //
        // The return type is int because the method returns an integer.
        //
        // The return statement sends the result back to the caller.

        System.out.println("SECTION 1: RETURN VALUES");

        int total = calculateTotal(35, 40);

        System.out.println("Total marks: " + total);

        // ============================================================
        // SECTION 2: DIFFERENT RETURN TYPES
        // ============================================================
        // The return type depends on the kind of value the method
        // must send back.
        //
        // int     - whole numbers
        // double  - decimal numbers
        // boolean - true or false
        // String  - text
        //
        // The value returned must be compatible with the declared
        // return type.

        System.out.println();
        System.out.println("SECTION 2: DIFFERENT RETURN TYPES");

        int studentAge = calculateAge(2010, 2026);
        double average = calculateAverage(75, 86);
        boolean passed = hasPassed(68);
        String studentName = getStudentName();

        System.out.println("Age: " + studentAge);
        System.out.println("Average: " + average);
        System.out.println("Passed: " + passed);
        System.out.println("Student name: " + studentName);

        // ============================================================
        // SECTION 3: THE RETURN STATEMENT
        // ============================================================
        // The return statement sends a value back to the caller.
        //
        // When Java reaches return, the method finishes immediately.
        // Statements after that return statement in the same execution
        // path will not execute.
        //
        // Here, calculateTotal() returns the sum of the two marks.

        System.out.println();
        System.out.println("SECTION 3: USING RETURN");

        int result = calculateTotal(60, 25);

        System.out.println("Returned result: " + result);

        // ============================================================
        // SECTION 4: STORING A RETURNED VALUE
        // ============================================================
        // A returned value can be stored in a variable.
        //
        // This is useful when the result will be needed more than once.
        //
        // The method call is executed first.
        // Its returned value is then assigned to totalMarks.

        System.out.println();
        System.out.println("SECTION 4: STORING A RETURNED VALUE");

        int totalMarks = calculateTotal(45, 48);

        System.out.println("Total: " + totalMarks);
        System.out.println("Total multiplied by 2: "
                + (totalMarks * 2));

        // ============================================================
        // SECTION 5: USING A RETURNED VALUE DIRECTLY
        // ============================================================
        // A returned value does not always need to be stored.
        //
        // It can be used directly inside another statement.
        //
        // In this example, calculateTotal() returns an int.
        // That value is displayed immediately.

        System.out.println();
        System.out.println("SECTION 5: USING A RETURNED VALUE DIRECTLY");

        System.out.println("Total: " + calculateTotal(20, 30));

        // ============================================================
        // SECTION 6: USING A RETURN VALUE IN A CALCULATION
        // ============================================================
        // A returned value can form part of a larger calculation.
        //
        // calculateAverage() returns a double.
        // The returned value is multiplied by 2 in the expression.
        //
        // The calculation is completed before the result is assigned.

        System.out.println();
        System.out.println("SECTION 6: RETURN VALUES IN CALCULATIONS");

        double calculatedAverage = calculateAverage(70, 90);

        double doubledAverage = calculatedAverage * 2;

        System.out.println("Average: " + calculatedAverage);
        System.out.println("Doubled average: " + doubledAverage);

        // ============================================================
        // SECTION 7: USING A RETURN VALUE IN AN IF STATEMENT
        // ============================================================
        // A method that returns boolean can be used directly
        // in an if statement.
        //
        // hasPassed() returns true if the mark is at least 50.
        // Otherwise, it returns false.
        //
        // The if statement uses that returned boolean value.

        System.out.println();
        System.out.println("SECTION 7: RETURN VALUES IN CONDITIONS");

        int mark = 72;

        if (hasPassed(mark))
        {
            System.out.println("The Student has passed.");
        }
        else
        {
            System.out.println("The Student has failed.");
        }

        // ============================================================
        // SECTION 8: RETURNING A STRING
        // ============================================================
        // A method can return text.
        //
        // The return type is String.
        // The returned text can be stored in a variable and displayed.
        //
        // The method getGradeDescription() receives a grade number
        // and returns a description.

        System.out.println();
        System.out.println("SECTION 8: RETURNING TEXT");

        String gradeDescription = getGradeDescription(11);

        System.out.println("Description: " + gradeDescription);

        // ============================================================
        // SECTION 9: RETURNING THE RESULT OF A CONDITION
        // ============================================================
        // A boolean method can return the result of a comparison
        // directly.
        //
        // The statement:
        //
        // return mark >= 80;
        //
        // returns true when mark is at least 80 and false otherwise.
        //
        // There is no need to write a separate if-else statement
        // just to return true or false.

        System.out.println();
        System.out.println("SECTION 9: BOOLEAN RETURN VALUE");

        System.out.println("Mark 85 is a distinction: "
                + isDistinction(85));

        System.out.println("Mark 65 is a distinction: "
                + isDistinction(65));

        // ============================================================
        // SECTION 10: RETURNING EARLY FROM A METHOD
        // ============================================================
        // A return statement ends the current method immediately.
        //
        // In getPassMessage(), the first condition is checked.
        // If the mark is below 50, the method returns "Fail".
        //
        // The second return statement is reached only if the first
        // condition was false.

        System.out.println();
        System.out.println("SECTION 10: EARLY RETURN");

        System.out.println("Mark 35: " + getPassMessage(35));
        System.out.println("Mark 75: " + getPassMessage(75));

        // ============================================================
        // SECTION 11: CALLING ONE VALUE-RETURNING METHOD FROM ANOTHER
        // ============================================================
        // A method can call another method and use its returned value.
        //
        // getRoundedAverage() calls calculateAverage().
        // It then rounds the returned average and returns the result.
        //
        // This allows smaller methods to work together.

        System.out.println();
        System.out.println("SECTION 11: METHODS WORKING TOGETHER");

        long roundedAverage = getRoundedAverage(71, 82);

        System.out.println("Rounded average: " + roundedAverage);

        // ============================================================
        // SECTION 12: RETURN TYPES MUST MATCH
        // ============================================================
        // The returned value must be compatible with the method's
        // declared return type.
        //
        // For example:
        // public static int getMark()
        //
        // must return an int value.
        //
        // A method declared as double can return a double value.
        //
        // A method declared as boolean must return true or false.
        //
        // If a non-void method can finish without returning a suitable
        // value, Java will report a compilation error.

        System.out.println();
        System.out.println("SECTION 12: MATCHING RETURN TYPES");

        int storedMark = getFixedMark();
        double storedAverage = getFixedAverage();

        System.out.println("Stored mark: " + storedMark);
        System.out.println("Stored average: " + storedAverage);

        // ============================================================
        // SECTION 13: COMMON MISTAKES
        // ============================================================
        // 1. Forgetting a return statement in a non-void method.
        //
        // 2. Returning a value with an incompatible data type.
        //
        // 3. Declaring a method as void when a value is required.
        //
        // 4. Expecting a return value from a void method.
        //
        // 5. Writing statements after a return statement that can
        //    never be reached.
        //
        // 6. Forgetting to store or use a returned value.
        //
        // 7. Confusing displaying a value with returning a value.
        //
        // System.out.println() displays information.
        // return sends a value back to the calling statement.

        // ============================================================
        // SECTION 14: PRACTICE CHALLENGE
        // ============================================================
        // Create the following methods:
        //
        // 1. calculateProduct(int number1, int number2)
        //    Return the product as an int.
        //
        // 2. calculatePercentage(int mark, int maximumMark)
        //    Return the percentage as a double.
        //
        // 3. isEligibleForAward(int mark)
        //    Return true if the mark is at least 75.
        //
        // Call all three methods and display their returned values.

        System.out.println();
        System.out.println("SECTION 14: PRACTICE CHALLENGE");

        System.out.println("Product: " + calculateProduct(6, 7));

        System.out.println("Percentage: "
                + calculatePercentage(36, 40) + "%");

        System.out.println("Eligible for award: "
                + isEligibleForAward(78));
    }

    // ================================================================
    // METHOD 1: RETURN A TOTAL
    // ================================================================

    public static int calculateTotal(int mark1, int mark2)
    {
        int total = mark1 + mark2;

        return total;
    }

    // ================================================================
    // METHOD 2: CALCULATE AGE
    // ================================================================
    // This simplified example assumes the Student has already had
    // their birthday in the current year.

    public static int calculateAge(int birthYear, int currentYear)
    {
        int age = currentYear - birthYear;

        return age;
    }

    // ================================================================
    // METHOD 3: CALCULATE AN AVERAGE
    // ================================================================

    public static double calculateAverage(int mark1, int mark2)
    {
        double average = (mark1 + mark2) / 2.0;

        return average;
    }

    // ================================================================
    // METHOD 4: CHECK WHETHER A STUDENT PASSED
    // ================================================================

    public static boolean hasPassed(int mark)
    {
        return mark >= 50;
    }

    // ================================================================
    // METHOD 5: RETURN A STUDENT NAME
    // ================================================================

    public static String getStudentName()
    {
        return "Ayesha Khan";
    }

    // ================================================================
    // METHOD 6: RETURN A GRADE DESCRIPTION
    // ================================================================

    public static String getGradeDescription(int grade)
    {
        String description = "Grade " + grade;

        return description;
    }

    // ================================================================
    // METHOD 7: CHECK FOR A DISTINCTION
    // ================================================================

    public static boolean isDistinction(int mark)
    {
        return mark >= 80;
    }

    // ================================================================
    // METHOD 8: RETURN A PASS MESSAGE
    // ================================================================
    // Each return statement ends the method when it is reached.

    public static String getPassMessage(int mark)
    {
        if (mark < 50)
        {
            return "Fail";
        }

        return "Pass";
    }

    // ================================================================
    // METHOD 9: CALCULATE A ROUNDED AVERAGE
    // ================================================================

    public static long getRoundedAverage(int mark1, int mark2)
    {
        double average = calculateAverage(mark1, mark2);

        return Math.round(average);
    }

    // ================================================================
    // METHOD 10: RETURN A FIXED MARK
    // ================================================================

    public static int getFixedMark()
    {
        return 85;
    }

    // ================================================================
    // METHOD 11: RETURN A FIXED AVERAGE
    // ================================================================

    public static double getFixedAverage()
    {
        return 76.5;
    }

    // ================================================================
    // METHOD 12: CALCULATE A PRODUCT
    // ================================================================

    public static int calculateProduct(int number1, int number2)
    {
        int product = number1 * number2;

        return product;
    }

    // ================================================================
    // METHOD 13: CALCULATE A PERCENTAGE
    // ================================================================

    public static double calculatePercentage(int mark, int maximumMark)
    {
        double percentage = mark * 100.0 / maximumMark;

        return percentage;
    }

    // ================================================================
    // METHOD 14: CHECK AWARD ELIGIBILITY
    // ================================================================

    public static boolean isEligibleForAward(int mark)
    {
        return mark >= 75;
    }
}
