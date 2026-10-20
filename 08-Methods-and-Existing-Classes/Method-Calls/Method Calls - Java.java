
public class MethodCalls
{
    public static void main(String[] args)
    {
        // ============================================================
        // SECTION 1: WHAT IS A METHOD CALL?
        // ============================================================
        // A method call tells Java to execute a method.
        //
        // A method declaration defines the instructions to execute.
        // A method call causes those instructions to run.
        //
        // The following statement calls displayWelcomeMessage().
        //
        // When Java reaches this statement, execution moves to the
        // method. After the method finishes, execution returns to
        // the next statement in main().

        System.out.println("SECTION 1: BASIC METHOD CALL");

        displayWelcomeMessage();

        System.out.println("Back in main().");

        // ============================================================
        // SECTION 2: A METHOD CAN BE CALLED MORE THAN ONCE
        // ============================================================
        // A method does not have to be called only once.
        //
        // Each call executes the same instructions.
        // This allows code to be reused without copying it.

        System.out.println();
        System.out.println("SECTION 2: REPEATED METHOD CALLS");

        displaySeparator();
        displaySeparator();
        displaySeparator();

        // ============================================================
        // SECTION 3: CALLING METHODS IN A SPECIFIC ORDER
        // ============================================================
        // Java executes statements in the order in which they are
        // reached, unless a selection statement, loop or method call
        // changes the flow of execution.
        //
        // These three methods are called in a specific order.
        // Their output follows that order.

        System.out.println();
        System.out.println("SECTION 3: ORDER OF METHOD CALLS");

        displayStudentName();
        displayStudentGrade();
        displayStudentSubject();

        // ============================================================
        // SECTION 4: PASSING ARGUMENTS TO A METHOD
        // ============================================================
        // A method can receive information through parameters.
        //
        // When calling displayStudent(), we supply two arguments:
        // a String containing the name and an int containing the grade.
        //
        // The method uses these values when it executes.

        System.out.println();
        System.out.println("SECTION 4: METHOD ARGUMENTS");

        displayStudent("Ayesha Khan", 10);
        displayStudent("Liam Smith", 11);

        // ============================================================
        // SECTION 5: METHOD CALLS WITH RETURN VALUES
        // ============================================================
        // Some methods return a value to the calling statement.
        //
        // calculateTotal() returns the sum of two marks.
        //
        // The returned value is stored in total.
        // Java then continues executing the next statement in main().

        System.out.println();
        System.out.println("SECTION 5: RETURNED VALUES");

        int total = calculateTotal(72, 84);

        System.out.println("Total marks: " + total);

        // ============================================================
        // SECTION 6: USING A METHOD CALL IN AN EXPRESSION
        // ============================================================
        // A returned value can be used directly in an expression.
        //
        // Here, calculateTotal() is called and its result is divided
        // by 2.0 to calculate the average.
        //
        // The method call is evaluated before the final result
        // is assigned to average.

        System.out.println();
        System.out.println("SECTION 6: METHOD CALL IN A CALCULATION");

        double average = calculateTotal(72, 84) / 2.0;

        System.out.println("Average mark: " + average);

        // ============================================================
        // SECTION 7: CALLING A METHOD FROM ANOTHER METHOD
        // ============================================================
        // A method can call another method.
        //
        // displayStudentResult() calls calculateAverage() to obtain
        // the average, then displays the result.
        //
        // This allows the calculation to be kept separate from
        // the display instructions.

        System.out.println();
        System.out.println("SECTION 7: METHOD CALLS WITHIN METHODS");

        displayStudentResult("Naledi Molefe", 70, 86);

        // ============================================================
        // SECTION 8: METHOD CALLS INSIDE A LOOP
        // ============================================================
        // A loop can call a method repeatedly.
        //
        // The same method is called once for each Student.
        // The arguments change with each iteration.

        System.out.println();
        System.out.println("SECTION 8: METHOD CALLS IN A LOOP");

        String[] names =
        {
            "Ayesha Khan",
            "Liam Smith",
            "Naledi Molefe"
        };

        for (int counter = 0; counter < names.length; counter++)
        {
            displayGreeting(names[counter]);
        }

        // ============================================================
        // SECTION 9: METHOD CALLS IN A SELECTION STATEMENT
        // ============================================================
        // A method can be called from inside an if-else statement.
        //
        // The method is called only when the relevant branch executes.

        System.out.println();
        System.out.println("SECTION 9: METHOD CALLS IN IF-ELSE");

        int mark = 68;

        if (hasPassed(mark))
        {
            displayPassMessage();
        }
        else
        {
            displayFailMessage();
        }

        // ============================================================
        // SECTION 10: THE DIFFERENCE BETWEEN A CALL AND A DECLARATION
        // ============================================================
        // A declaration contains the method header and body.
        //
        // Example declaration:
        //
        // public static void displayMessage()
        // {
        //     System.out.println("Hello");
        // }
        //
        // A call uses the method name and parentheses:
        //
        // displayMessage();
        //
        // The method body is not copied into main().
        // Java executes it when the call is reached.

        System.out.println();
        System.out.println("SECTION 10: METHOD DECLARATION AND CALL");

        displayMessage();

        // ============================================================
        // SECTION 11: COMMON MISTAKES
        // ============================================================
        // 1. Writing a method declaration inside main().
        //
        // 2. Forgetting the parentheses when calling a method.
        //
        // 3. Calling a method using the wrong number of arguments.
        //
        // 4. Supplying arguments in the wrong order.
        //
        // 5. Expecting a method to execute without calling it.
        //
        // 6. Trying to store a value returned by a void method.
        //
        // 7. Forgetting to use a returned value when it is needed.
        //
        // 8. Calling a method that does not exist or has the wrong
        //    method signature.
        //
        // Trace each method call and identify where execution moves.

        // ============================================================
        // SECTION 12: PRACTICE CHALLENGE
        // ============================================================
        // Create a method called displaySubjectInfo().
        //
        // It must accept a subject name and a teacher's name.
        // It must display both pieces of information.
        //
        // Call the method twice using different arguments.
        //
        // Then create a method called multiplyMarks() that receives
        // two integers and returns their product.
        //
        // Call the method and display its returned value.

        System.out.println();
        System.out.println("SECTION 12: PRACTICE CHALLENGE");

        displaySubjectInfo("Information Technology", "Mr Dlamini");
        displaySubjectInfo("Mathematics", "Ms Jacobs");

        int product = multiplyMarks(6, 7);

        System.out.println("Product: " + product);
    }

    // ================================================================
    // METHOD 1: DISPLAY A WELCOME MESSAGE
    // ================================================================
    // This method has no parameters and does not return a value.
    // It simply displays a message when called.

    public static void displayWelcomeMessage()
    {
        System.out.println("Welcome to the School Management System.");
    }

    // ================================================================
    // METHOD 2: DISPLAY A SEPARATOR
    // ================================================================

    public static void displaySeparator()
    {
        System.out.println("------------------------------");
    }

    // ================================================================
    // METHOD 3: DISPLAY A STUDENT NAME
    // ================================================================

    public static void displayStudentName()
    {
        System.out.println("Student: Ayesha Khan");
    }

    // ================================================================
    // METHOD 4: DISPLAY A STUDENT GRADE
    // ================================================================

    public static void displayStudentGrade()
    {
        System.out.println("Grade: 10");
    }

    // ================================================================
    // METHOD 5: DISPLAY A STUDENT SUBJECT
    // ================================================================

    public static void displayStudentSubject()
    {
        System.out.println("Subject: Information Technology");
    }

    // ================================================================
    // METHOD 6: DISPLAY INFORMATION USING PARAMETERS
    // ================================================================

    public static void displayStudent(String name, int grade)
    {
        System.out.println("Student: " + name);
        System.out.println("Grade: " + grade);
    }

    // ================================================================
    // METHOD 7: CALCULATE A TOTAL
    // ================================================================
    // The return type is int because the method returns an integer.
    // The return statement sends the calculated value back to the
    // statement that called the method.

    public static int calculateTotal(int mark1, int mark2)
    {
        int total = mark1 + mark2;

        return total;
    }

    // ================================================================
    // METHOD 8: CALCULATE AN AVERAGE
    // ================================================================
    // This method calls calculateTotal().
    //
    // The returned total is divided by 2.0 to ensure decimal division.

    public static double calculateAverage(int mark1, int mark2)
    {
        double average = calculateTotal(mark1, mark2) / 2.0;

        return average;
    }

    // ================================================================
    // METHOD 9: DISPLAY A STUDENT RESULT
    // ================================================================

    public static void displayStudentResult(
            String name, int mark1, int mark2)
    {
        double average = calculateAverage(mark1, mark2);

        System.out.println("Student: " + name);
        System.out.println("Average: " + average);
    }

    // ================================================================
    // METHOD 10: DISPLAY A GREETING
    // ================================================================

    public static void displayGreeting(String name)
    {
        System.out.println("Welcome, " + name + ".");
    }

    // ================================================================
    // METHOD 11: CHECK WHETHER A STUDENT PASSED
    // ================================================================

    public static boolean hasPassed(int mark)
    {
        return mark >= 50;
    }

    // ================================================================
    // METHOD 12: DISPLAY A PASS MESSAGE
    // ================================================================

    public static void displayPassMessage()
    {
        System.out.println("The Student has passed.");
    }

    // ================================================================
    // METHOD 13: DISPLAY A FAIL MESSAGE
    // ================================================================

    public static void displayFailMessage()
    {
        System.out.println("The Student has failed.");
    }

    // ================================================================
    // METHOD 14: DISPLAY A MESSAGE
    // ================================================================

    public static void displayMessage()
    {
        System.out.println("This message comes from another method.");
    }

    // ================================================================
    // METHOD 15: DISPLAY SUBJECT INFORMATION
    // ================================================================

    public static void displaySubjectInfo(
            String subject, String teacher)
    {
        System.out.println("Subject: " + subject);
        System.out.println("Teacher: " + teacher);
    }

    // ================================================================
    // METHOD 16: MULTIPLY TWO MARK VALUES
    // ================================================================

    public static int multiplyMarks(int number1, int number2)
    {
        int product = number1 * number2;

        return product;
    }
}
