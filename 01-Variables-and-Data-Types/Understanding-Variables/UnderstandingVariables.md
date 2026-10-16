```java
/*
 * ============================================================
 * TOPIC: UNDERSTANDING VARIABLES
 * ============================================================
 *
 * PURPOSE:
 * This program introduces variables in Java using information
 * about a fictional Student at a school.
 *
 * LEARNING OBJECTIVES:
 * By completing this example, you should understand:
 *
 * 1. What a variable is.
 * 2. How to declare a variable.
 * 3. How to initialise a variable.
 * 4. How to assign a value to a variable.
 * 5. How to change the value stored in a variable.
 * 6. How to display the contents of a variable.
 *
 * ============================================================
 * 1. WHAT IS A VARIABLE?
 * ============================================================
 *
 * A variable is a named storage location used to store data.
 *
 * Imagine that a school needs to store information about a
 * Student, such as the Student's name, age and grade.
 *
 * We can create variables to store this information.
 *
 * For example:
 *
 * String studentName = "Liam Jacobs";
 * int studentAge = 16;
 * int studentGrade = 10;
 *
 * Each variable has:
 *
 * - A data type, which determines the kind of value it stores.
 * - A name, which identifies the variable.
 * - A value, which is the information stored in it.
 *
 * ============================================================
 * 2. DECLARING A VARIABLE
 * ============================================================
 *
 * Declaring a variable means specifying its data type and name.
 *
 * Example:
 *
 * String studentName;
 *
 * String is the data type.
 * studentName is the variable name.
 *
 * The variable has been declared, but no value has been
 * assigned to it yet.
 *
 * ============================================================
 * 3. INITIALISING A VARIABLE
 * ============================================================
 *
 * Initialising a variable means giving it its first value.
 *
 * Example:
 *
 * String studentName = "Liam Jacobs";
 *
 * This statement declares the variable and gives it a value.
 *
 * The equals sign (=) is called the assignment operator.
 *
 * ============================================================
 * 4. ASSIGNING A VALUE TO A VARIABLE
 * ============================================================
 *
 * Once a variable has been declared, we can assign a value
 * to it.
 *
 * Example:
 *
 * studentName = "Olivia Smith";
 *
 * This stores a new name in the existing variable.
 *
 * We do not write String again because the variable has
 * already been declared.
 *
 * ============================================================
 * 5. THE JAVA PROGRAM
 * ============================================================
 */

public class UnderstandingVariables {

    public static void main(String[] args) {

        /*
         * STEP 1: DECLARE AND INITIALISE THE STUDENT'S NAME.
         *
         * String is used because a name consists of text.
         *
         * The variable studentName now stores "Liam Jacobs".
         */
        String studentName = "Liam Jacobs";


        /*
         * STEP 2: DECLARE AND INITIALISE THE STUDENT'S AGE.
         *
         * int is used because we are storing a whole number.
         *
         * The variable studentAge now stores 16.
         */
        int studentAge = 16;


        /*
         * STEP 3: DECLARE AND INITIALISE THE STUDENT'S GRADE.
         *
         * The Student is currently in Grade 10.
         *
         * The variable studentGrade stores the number 10.
         */
        int studentGrade = 10;


        /*
         * STEP 4: DISPLAY THE ORIGINAL VALUES.
         *
         * System.out.println() displays information in the
         * Output window.
         *
         * The + operator joins text and variable values.
         *
         * For example:
         *
         * "Name: " + studentName
         *
         * displays:
         *
         * Name: Liam Jacobs
         */
        System.out.println("ORIGINAL STUDENT DETAILS");
        System.out.println("========================");

        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Grade: " + studentGrade);


        /*
         * STEP 5: CHANGE THE STUDENT'S NAME.
         *
         * We assign a new value to the existing variable.
         *
         * The old value, "Liam Jacobs", is replaced by
         * "Olivia Smith".
         *
         * Notice that String is not written again.
         */
        studentName = "Olivia Smith";


        /*
         * STEP 6: CHANGE THE STUDENT'S AGE.
         *
         * The Student has had a birthday.
         *
         * We update the value stored in studentAge.
         */
        studentAge = 17;


        /*
         * STEP 7: CHANGE THE STUDENT'S GRADE.
         *
         * The Student has progressed to Grade 11.
         *
         * We update the value stored in studentGrade.
         */
        studentGrade = 11;


        /*
         * STEP 8: DISPLAY THE UPDATED VALUES.
         *
         * The variables now contain different values.
         *
         * When we display them again, Java uses the new values.
         */
        System.out.println();

        System.out.println("UPDATED STUDENT DETAILS");
        System.out.println("=======================");

        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Grade: " + studentGrade);

    }

}


/*
 * ============================================================
 * EXPECTED OUTPUT
 * ============================================================
 *
 * ORIGINAL STUDENT DETAILS
 * ========================
 * Name: Liam Jacobs
 * Age: 16
 * Grade: 10
 *
 * UPDATED STUDENT DETAILS
 * =======================
 * Name: Olivia Smith
 * Age: 17
 * Grade: 11
 *
 * ============================================================
 * COMMON MISTAKES
 * ============================================================
 *
 * MISTAKE 1: DECLARING THE SAME VARIABLE TWICE.
 *
 * Incorrect:
 *
 * int studentAge = 16;
 * int studentAge = 17;
 *
 * Correct:
 *
 * int studentAge = 16;
 * studentAge = 17;
 *
 * Declare the variable once, then assign a new value when
 * you need to change it.
 *
 *
 * MISTAKE 2: USING THE WRONG DATA TYPE.
 *
 * Incorrect:
 *
 * int studentName = "Liam Jacobs";
 *
 * Correct:
 *
 * String studentName = "Liam Jacobs";
 *
 * A name is text, so String is appropriate.
 *
 *
 * MISTAKE 3: FORGETTING THE SEMICOLON.
 *
 * Incorrect:
 *
 * int studentAge = 16
 *
 * Correct:
 *
 * int studentAge = 16;
 *
 * Java statements generally end with a semicolon.
 *
 *
 * MISTAKE 4: CONFUSING A VARIABLE NAME WITH ITS VALUE.
 *
 * In the statement:
 *
 * int studentAge = 16;
 *
 * studentAge is the variable name.
 * 16 is the value stored in the variable.
 *
 *
 * ============================================================
 * PRACTICE ACTIVITIES
 * ============================================================
 *
 * ACTIVITY 1: CHANGE THE STUDENT'S DETAILS.
 *
 * Modify the initial values so that the original details are:
 *
 * Name: Jason Naidoo
 * Age: 16
 * Grade: 10
 *
 * Run the program and check the output.
 *
 *
 * ACTIVITY 2: UPDATE THE DETAILS.
 *
 * Change the updated values so that the Student's details
 * become:
 *
 * Name: Ayesha Khan
 * Age: 17
 * Grade: 11
 *
 * Run the program again.
 *
 *
 * ACTIVITY 3: ADD A CLASS GROUP.
 *
 * 1. Declare a String variable called classGroup.
 * 2. Initialise it with the value "10A".
 * 3. Display the class group with the Student's details.
 * 4. Change the class group to "11A".
 * 5. Display the updated class group.
 *
 *
 * ACTIVITY 4: TEST YOUR UNDERSTANDING.
 *
 * Answer these questions:
 *
 * 1. What is a variable?
 * 2. What does declaring a variable mean?
 * 3. What does initialising a variable mean?
 * 4. Which symbol is used to assign a value?
 * 5. What happens when a new value is assigned to a variable?
 * 6. Why do we not write int again when updating studentAge?
 *
 *
 * ============================================================
 * END OF EXAMPLE
 * ============================================================
 */
```
