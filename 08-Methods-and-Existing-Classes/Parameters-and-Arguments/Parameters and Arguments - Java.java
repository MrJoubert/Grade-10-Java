public class ParametersAndArguments
{
    public static void main(String[] args)
    {
        // ============================================================
        // SECTION 1: WHAT ARE PARAMETERS AND ARGUMENTS?
        // ============================================================
        // A parameter is a variable declared in a method header.
        //
        // An argument is the actual value supplied when the method
        // is called.
        //
        // In this method call:
        //
        // displayStudent("Ayesha Khan");
        //
        // "Ayesha Khan" is the argument.
        //
        // In the method declaration:
        //
        // public static void displayStudent(String name)
        //
        // String name is the parameter.
        //
        // The parameter receives the argument when the method is called.

        System.out.println("SECTION 1: PARAMETERS AND ARGUMENTS");

        displayStudent("Ayesha Khan");

        // ============================================================
        // SECTION 2: CALLING THE SAME METHOD WITH DIFFERENT ARGUMENTS
        // ============================================================
        // A method with a parameter can be reused with different values.
        //
        // The method is declared only once.
        // Each call supplies a different argument.
        //
        // The parameter name remains the same, but the value it
        // receives depends on the particular method call.

        System.out.println();
        System.out.println("SECTION 2: DIFFERENT ARGUMENTS");

        displayStudent("Liam Smith");
        displayStudent("Naledi Molefe");
        displayStudent("Thabo Nkosi");

        // ============================================================
        // SECTION 3: METHODS WITH TWO PARAMETERS
        // ============================================================
        // A method can accept more than one parameter.
        //
        // Each parameter has a data type and a variable name.
        //
        // displayStudentDetails() accepts:
        // 1. A String containing the Student's name.
        // 2. An int containing the Student's grade.
        //
        // The arguments must match the parameter types and order.

        System.out.println();
        System.out.println("SECTION 3: TWO PARAMETERS");

        displayStudentDetails("Ayesha Khan", 10);
        displayStudentDetails("Liam Smith", 11);
        displayStudentDetails("Naledi Molefe", 12);

        // ============================================================
        // SECTION 4: ARGUMENT ORDER MATTERS
        // ============================================================
        // Arguments are assigned to parameters according to position.
        //
        // In this call:
        //
        // displayResult("Ayesha Khan", 85);
        //
        // The first argument is assigned to name.
        // The second argument is assigned to mark.
        //
        // Changing the order can cause a compilation error if the
        // argument types no longer match the parameter types.

        System.out.println();
        System.out.println("SECTION 4: ARGUMENT ORDER");

        displayResult("Ayesha Khan", 85);
        displayResult("Liam Smith", 43);

        // ============================================================
        // SECTION 5: PARAMETERS CAN BE USED IN CALCULATIONS
        // ============================================================
        // Parameters behave like variables inside the method.
        //
        // The method calculateTotal() receives two integer arguments.
        // It adds them and returns the calculated total.
        //
        // The values supplied during each call determine the result.

        System.out.println();
        System.out.println("SECTION 5: CALCULATIONS");

        int total1 = calculateTotal(35, 40);
        int total2 = calculateTotal(42, 48);

        System.out.println("First total: " + total1);
        System.out.println("Second total: " + total2);

        // ============================================================
        // SECTION 6: PARAMETERS WITH DIFFERENT DATA TYPES
        // ============================================================
        // Parameters can have different data types.
        //
        // This method receives:
        // - A String for the Student's name.
        // - An int for the mark.
        // - A boolean indicating whether homework was submitted.
        //
        // Each argument must match the corresponding parameter type.

        System.out.println();
        System.out.println("SECTION 6: DIFFERENT PARAMETER TYPES");

        displayHomeworkStatus("Ayesha Khan", 78, true);
        displayHomeworkStatus("Liam Smith", 62, false);

        // ============================================================
        // SECTION 7: USING PARAMETERS IN CONDITIONS
        // ============================================================
        // A parameter can be used in an if-else statement.
        //
        // The method below checks whether a mark is at least 50.
        // It returns true if the condition is satisfied and false
        // otherwise.
        //
        // The returned boolean can then be used by the calling code.

        System.out.println();
        System.out.println("SECTION 7: PARAMETERS AND CONDITIONS");

        int mark = 72;

        if (hasPassed(mark))
        {
            System.out.println("Mark " + mark + ": Pass");
        }
        else
        {
            System.out.println("Mark " + mark + ": Fail");
        }

        mark = 38;

        if (hasPassed(mark))
        {
            System.out.println("Mark " + mark + ": Pass");
        }
        else
        {
            System.out.println("Mark " + mark + ": Fail");
        }

        // ============================================================
        // SECTION 8: PASSING EXPRESSIONS AS ARGUMENTS
        // ============================================================
        // An argument does not have to be a literal value or a
        // variable name.
        //
        // It can also be an expression.
        //
        // Java evaluates the expression before passing its result
        // to the method.

        System.out.println();
        System.out.println("SECTION 8: EXPRESSIONS AS ARGUMENTS");

        displayTotal(20 + 15);
        displayTotal(100 - 28);
        displayTotal(6 * 7);

        // ============================================================
        // SECTION 9: PASSING ARRAY ELEMENTS AS ARGUMENTS
        // ============================================================
        // An array element can be passed to a method.
        //
        // The expression marks[counter] supplies the value stored
        // at the current index.
        //
        // The loop calls the same method for every mark in the array.

        System.out.println();
        System.out.println("SECTION 9: ARRAY ELEMENTS AS ARGUMENTS");

        int[] marks = {45, 67, 82};

        for (int counter = 0; counter < marks.length; counter++)
        {
            displayMark(marks[counter]);
        }

        // ============================================================
        // SECTION 10: PASSING A VALUE DOES NOT CHANGE THE ORIGINAL
        // ============================================================
        // Java passes arguments by value.
        //
        // For a primitive variable such as int, the method receives
        // a copy of the variable's value.
        //
        // Changing the parameter inside the method does not change
        // the original int variable in main().
        //
        // This example demonstrates that behaviour.

        System.out.println();
        System.out.println("SECTION 10: PASSING PRIMITIVE VALUES");

        int originalMark = 70;

        System.out.println("Before method call: " + originalMark);

        increaseMark(originalMark);

        System.out.println("After method call: " + originalMark);

        // ============================================================
        // SECTION 11: PARAMETERS AND RETURN VALUES WORK TOGETHER
        // ============================================================
        // A method can accept arguments and return a result.
        //
        // calculateAverage() receives two marks.
        // It calculates the average and returns a double.
        //
        // The calling statement stores the returned value.

        System.out.println();
        System.out.println("SECTION 11: PARAMETERS AND RETURN VALUES");

        double average = calculateAverage(75, 86);

        System.out.println("Average mark: " + average);

        // ============================================================
        // SECTION 12: COMMON MISTAKES
        // ============================================================
        // 1. Confusing parameters with arguments.
        //
        // 2. Supplying too many or too few arguments.
        //
        // 3. Supplying arguments in the wrong order.
        //
        // 4. Supplying an incompatible data type.
        //
        // 5. Forgetting that parameters are local to the method.
        //
        // 6. Assuming that changing an int parameter changes the
        //    original int variable used in the method call.
        //
        // 7. Forgetting to store or use a returned value.
        //
        // Always compare the method header with the method call.

        // ============================================================
        // SECTION 13: PRACTICE CHALLENGE
        // ============================================================
        // Write a method called displaySubjectMark().
        //
        // It must accept:
        // - A String containing a Student's name.
        // - A String containing a subject name.
        // - An int containing the mark.
        //
        // The method must display the Student, subject and mark.
        //
        // Then write a method called calculatePercentage().
        // It must accept the mark obtained and the maximum mark.
        // It must return the percentage as a double.
        //
        // Test the methods with different arguments.

        System.out.println();
        System.out.println("SECTION 13: PRACTICE CHALLENGE");

        displaySubjectMark("Ayesha Khan", "IT", 84);
        displaySubjectMark("Liam Smith", "CAT", 71);

        double percentage = calculatePercentage(36, 40);

        System.out.println("Percentage: " + percentage + "%");
    }

    // ================================================================
    // METHOD 1: DISPLAY A STUDENT
    // ================================================================
    // The String name parameter receives the argument supplied
    // in the method call.

    public static void displayStudent(String name)
    {
        System.out.println("Student: " + name);
    }

    // ================================================================
    // METHOD 2: DISPLAY STUDENT DETAILS
    // ================================================================

    public static void displayStudentDetails(String name, int grade)
    {
        System.out.println("Student: " + name);
        System.out.println("Grade: " + grade);
    }

    // ================================================================
    // METHOD 3: DISPLAY A RESULT
    // ================================================================

    public static void displayResult(String name, int mark)
    {
        System.out.println(name + " achieved " + mark + "%.");
    }

    // ================================================================
    // METHOD 4: CALCULATE A TOTAL
    // ================================================================
    // The two int parameters receive the two marks.
    // The method returns their sum.

    public static int calculateTotal(int mark1, int mark2)
    {
        int total = mark1 + mark2;

        return total;
    }

    // ================================================================
    // METHOD 5: DISPLAY HOMEWORK STATUS
    // ================================================================

    public static void displayHomeworkStatus(
            String name, int mark, boolean homeworkSubmitted)
    {
        System.out.println("Student: " + name);
        System.out.println("Mark: " + mark);

        if (homeworkSubmitted)
        {
            System.out.println("Homework submitted.");
        }
        else
        {
            System.out.println("Homework outstanding.");
        }
    }

    // ================================================================
    // METHOD 6: CHECK WHETHER A STUDENT PASSED
    // ================================================================

    public static boolean hasPassed(int mark)
    {
        return mark >= 50;
    }

    // ================================================================
    // METHOD 7: DISPLAY A TOTAL
    // ================================================================

    public static void displayTotal(int total)
    {
        System.out.println("Total: " + total);
    }

    // ================================================================
    // METHOD 8: DISPLAY A MARK
    // ================================================================

    public static void displayMark(int mark)
    {
        System.out.println("Mark: " + mark);
    }

    // ================================================================
    // METHOD 9: INCREASE A MARK PARAMETER
    // ================================================================
    // The parameter mark receives a copy of the original int value.
    // Increasing it changes the local parameter, not the original
    // variable in main().

    public static void increaseMark(int mark)
    {
        mark = mark + 10;

        System.out.println("Inside method: " + mark);
    }

    // ================================================================
    // METHOD 10: CALCULATE AN AVERAGE
    // ================================================================

    public static double calculateAverage(int mark1, int mark2)
    {
        double average = (mark1 + mark2) / 2.0;

        return average;
    }

    // ================================================================
    // METHOD 11: DISPLAY A SUBJECT MARK
    // ================================================================

    public static void displaySubjectMark(
            String name, String subject, int mark)
    {
        System.out.println("Student: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Mark: " + mark);
    }

    // ================================================================
    // METHOD 12: CALCULATE A PERCENTAGE
    // ================================================================

    public static double calculatePercentage(
            int markObtained, int maximumMark)
    {
        double percentage = markObtained * 100.0 / maximumMark;

        return percentage;
    }
}
