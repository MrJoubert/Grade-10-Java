/*
 * ============================================================
 * SCHOOL STUDENT DATA TYPES
 * ============================================================
 *
 * PURPOSE:
 * This program demonstrates how Java data types are used to
 * store information about a Student at a school.
 *
 * By the end of this example, you should understand:
 * 1. What a variable is.
 * 2. How to use int to store whole numbers.
 * 3. How to use double to store decimal numbers.
 * 4. How to use char to store a single character.
 * 5. How to use boolean to store true or false.
 * 6. How to use String to store text.
 * 7. How to display the contents of variables.
 *
 * IMPORTANT:
 * A variable is a named storage location that holds a value.
 *
 * A data type determines what kind of value a variable can
 * store.
 *
 * ============================================================
 * STEP 1: UNDERSTANDING THE DATA TYPES
 * ============================================================
 *
 * int
 * ---
 * Used to store whole numbers without decimal places.
 *
 * Examples:
 * int studentAge = 16;
 * int numberOfStudents = 25;
 * int studentNumber = 1205;
 *
 * double
 * ------
 * Used to store numbers that can contain decimal places.
 *
 * Examples:
 * double averageMark = 78.5;
 * double testMark = 84.25;
 * double schoolFee = 1250.75;
 *
 * char
 * ----
 * Used to store a single character.
 *
 * A char value must be placed inside single quotation marks.
 *
 * Examples:
 * char studentInitial = 'L';
 * char grade = 'A';
 *
 * boolean
 * -------
 * Used to store either true or false.
 *
 * Examples:
 * boolean playsSport = true;
 * boolean hasPassed = false;
 *
 * String
 * ------
 * Used to store text, such as names and subject names.
 *
 * String is NOT a primitive data type. It is a reference type.
 *
 * A String value must be placed inside double quotation marks.
 *
 * Examples:
 * String studentName = "Liam Jacobs";
 * String subjectName = "Information Technology";
 *
 * ============================================================
 * STEP 2: THE JAVA PROGRAM
 * ============================================================
 */

public class SchoolStudentDataTypes {

    public static void main(String[] args) {

        /*
         * STEP 2.1: STORE THE STUDENT'S AGE
         *
         * The int data type is suitable because age is stored
         * as a whole number in this example.
         *
         * The variable is called studentAge.
         * Its value is 16.
         */
        int studentAge = 16;


        /*
         * STEP 2.2: STORE THE STUDENT'S AVERAGE MARK
         *
         * The double data type allows decimal values.
         *
         * The Student's average is 78.5.
         *
         * We use double because an academic average can
         * contain a decimal part.
         */
        double averageMark = 78.5;


        /*
         * STEP 2.3: STORE THE STUDENT'S INITIAL
         *
         * The char data type stores one character.
         *
         * Notice that the letter L is placed inside
         * single quotation marks.
         */
        char studentInitial = 'L';


        /*
         * STEP 2.4: STORE WHETHER THE STUDENT PLAYS SPORT
         *
         * The boolean data type stores true or false.
         *
         * In this example, the Student participates in sport,
         * so the value is true.
         */
        boolean playsSport = true;


        /*
         * STEP 2.5: STORE THE STUDENT'S NAME
         *
         * String stores text.
         *
         * Notice that the Student's name is placed inside
         * double quotation marks.
         *
         * Remember:
         * String is a reference type, not a primitive type.
         */
        String studentName = "Liam Jacobs";


        /*
         * STEP 2.6: DISPLAY THE STUDENT'S INFORMATION
         *
         * System.out.println() displays information in the
         * Output window.
         *
         * The + operator joins text and variable values.
         *
         * For example:
         * "Age: " + studentAge
         *
         * produces:
         * Age: 16
         *
         * Java displays the value stored in studentAge,
         * rather than displaying the variable's name.
         */

        System.out.println("SCHOOL STUDENT PROFILE");
        System.out.println("======================");

        System.out.println("Name: " + studentName);
        System.out.println("Initial: " + studentInitial);
        System.out.println("Age: " + studentAge);
        System.out.println("Average mark: " + averageMark);
        System.out.println("Participates in sport: " + playsSport);

    }

}


/*
 * ============================================================
 * EXPECTED OUTPUT
 * ============================================================
 *
 * SCHOOL STUDENT PROFILE
 * ======================
 * Name: Liam Jacobs
 * Initial: L
 * Age: 16
 * Average mark: 78.5
 * Participates in sport: true
 *
 *
 * ============================================================
 * COMMON MISTAKES TO AVOID
 * ============================================================
 *
 * MISTAKE 1: Using the wrong quotation marks for char.
 *
 * Incorrect:
 * char studentInitial = "L";
 *
 * Correct:
 * char studentInitial = 'L';
 *
 * A char uses single quotation marks.
 *
 *
 * MISTAKE 2: Using single quotation marks for String.
 *
 * Incorrect:
 * String studentName = 'Liam Jacobs';
 *
 * Correct:
 * String studentName = "Liam Jacobs";
 *
 * A String uses double quotation marks.
 *
 *
 * MISTAKE 3: Storing a decimal value in an int.
 *
 * Incorrect:
 * int averageMark = 78.5;
 *
 * Correct:
 * double averageMark = 78.5;
 *
 * An int stores whole numbers, while a double can store
 * decimal numbers.
 *
 *
 * MISTAKE 4: Writing True or False with capital letters.
 *
 * Incorrect:
 * boolean playsSport = True;
 *
 * Correct:
 * boolean playsSport = true;
 *
 * Java is case-sensitive. The correct values are true
 * and false, written in lowercase.
 *
 *
 * MISTAKE 5: Forgetting the semicolon.
 *
 * Incorrect:
 * int studentAge = 16
 *
 * Correct:
 * int studentAge = 16;
 *
 * Most Java statements must end with a semicolon.
 *
 *
 * ============================================================
 * PRACTICE ACTIVITIES
 * ============================================================
 *
 * ACTIVITY 1: CHANGE THE STUDENT'S DETAILS
 *
 * Change the values so that the program displays:
 *
 * Name: Olivia Smith
 * Initial: O
 * Age: 17
 * Average mark: 84.25
 * Participates in sport: false
 *
 * Run the program again and check your output.
 *
 *
 * ACTIVITY 2: ADD ANOTHER VARIABLE
 *
 * Add a variable to store the Student's grade.
 *
 * Use an appropriate data type.
 *
 * For this example, store the grade as the number 10.
 *
 * Display the grade in the Student profile.
 *
 *
 * ACTIVITY 3: STORE A SUBJECT NAME
 *
 * Create a String variable called subjectName.
 *
 * Store the value "Information Technology".
 *
 * Display the subject name in the Student profile.
 *
 *
 * ACTIVITY 4: CHOOSE THE CORRECT DATA TYPE
 *
 * Decide which data type would be most suitable for each
 * piece of information:
 *
 * A. The number of Students in a classroom.
 * B. A Student's average mark of 72.75.
 * C. The initial of a Student's first name.
 * D. Whether a Student submitted homework.
 * E. A Teacher's full name.
 *
 * Write a variable declaration for each answer.
 *
 *
 * ACTIVITY 5: THINK ABOUT YOUR CHOICES
 *
 * 1. Why is double suitable for an average mark?
 * 2. Why does a char use single quotation marks?
 * 3. What is the difference between char and String?
 * 4. Why is String not classified as a primitive data type?
 * 5. What would happen if you changed playsSport to false?
 *
 *
 * ============================================================
 * END OF EXAMPLE
 * ============================================================
 */
