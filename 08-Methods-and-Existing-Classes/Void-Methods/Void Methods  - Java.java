
public class VoidMethods
{
    public static void main(String[] args)
    {
        // Question 1: Calling void methods without parameters.
        displayWelcomeMessage();
        displaySchoolName();

        // Question 2: Calling a void method with parameters.
        displayStudentDetails("Liam", "Botha", 12);

        // Question 3: Calling a void method more than once.
        displayLine();
        displayLine();

        // Question 4: Using a void method to display a result.
        displayMark("Liam", 85);
        displayMark("Emma", 92);

        // Question 5: Using a void method with selection.
        checkResult("Liam", 85);
        checkResult("Noah", 38);

        // Question 6: Using a void method with a loop.
        displayClassList();

        // Question 7: A void method calling another method.
        displayStudentReport("Emma", 92);
    }

    // Question 1
    // A void method performs an action but does not return a value.
    // It can be called whenever its action is needed.
    public static void displayWelcomeMessage()
    {
        System.out.println("Welcome to the Student Management System.");
    }

    public static void displaySchoolName()
    {
        System.out.println("Crawford International College");
    }

    // Question 2
    // This method receives three arguments when it is called.
    // The parameters are firstName, surname and grade.
    // The method displays the supplied information.
    public static void displayStudentDetails(String firstName, String surname, int grade)
    {
        System.out.println("Student: " + firstName + " " + surname);
        System.out.println("Grade: " + grade);
    }

    // Question 3
    // This method can be called repeatedly without rewriting
    // the same println statement in the main method.
    public static void displayLine()
    {
        System.out.println("------------------------------");
    }

    // Question 4
    // The parameters allow the same method to display
    // different Students and their marks.
    public static void displayMark(String studentName, int mark)
    {
        System.out.println(studentName + " achieved " + mark + "%.");
    }

    // Question 5
    // A void method can contain an if-else statement.
    // It displays a result but does not return that result.
    public static void checkResult(String studentName, int mark)
    {
        if (mark >= 50)
        {
            System.out.println(studentName + " has passed.");
        }
        else
        {
            System.out.println(studentName + " has not passed.");
        }
    }

    // Question 6
    // A void method can contain a loop.
    // The loop repeats the statements inside the method.
    public static void displayClassList()
    {
        String[] studentNames = {"Liam", "Emma", "Noah"};

        System.out.println("Class List:");

        for (int i = 0; i < studentNames.length; i++)
        {
            System.out.println(studentNames[i]);
        }
    }

    // Question 7
    // A void method can call other methods.
    // This method combines existing methods to produce a report.
    public static void displayStudentReport(String studentName, int mark)
    {
        displayLine();
        System.out.println("STUDENT REPORT");
        displayMark(studentName, mark);
        checkResult(studentName, mark);
        displayLine();
    }
}

/*
EXPECTED OUTPUT

Welcome to the Student Management System.
Crawford International College
Student: Liam Botha
Grade: 12
------------------------------
------------------------------
Liam achieved 85%.
Emma achieved 92%.
Liam has passed.
Noah has not passed.
Class List:
Liam
Emma
Noah
------------------------------
STUDENT REPORT
Emma achieved 92%.
Emma has passed.
------------------------------

TEACHING EMPHASIS

1. A void method does not return a value.
2. Use the keyword void in the method declaration.
3. A void method can have parameters, but it does not have to.
4. Arguments are supplied when the method is called.
5. A void method can contain selection statements and loops.
6. A void method can call another method.
7. You cannot assign the result of a void method to a variable,
   because the method does not produce a return value.
8. A void method may use return; to exit early, but it must not
   return a value. The return; statement is optional.
*/
