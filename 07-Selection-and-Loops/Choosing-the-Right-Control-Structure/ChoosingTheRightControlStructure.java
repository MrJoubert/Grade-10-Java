
public class ChoosingTheRightControlStructure
{
    public static void main(String[] args)
    {
        // ============================================================
        // SECTION 1: WHAT IS A CONTROL STRUCTURE?
        // ============================================================

        // A control structure determines the order in which
        // statements in a program are executed.
        //
        // Without control structures, Java normally executes
        // statements from top to bottom, one after another.
        //
        // Control structures allow us to:
        //
        // 1. Make decisions.
        // 2. Choose between different actions.
        // 3. Repeat instructions.
        //
        // There are THREE important ideas to understand:
        //
        // SEQUENCE:
        // Statements execute one after another.
        //
        // SELECTION:
        // The program makes a decision based on a condition.
        //
        // REPETITION:
        // The program repeats statements while a requirement is met,
        // or for a specified number of repetitions.


        // ============================================================
        // SECTION 2: SEQUENCE - EXECUTING STATEMENTS IN ORDER
        // ============================================================

        System.out.println("SECTION 2: SEQUENCE");

        // Sequence means that statements execute in the order
        // in which they appear.
        //
        // Java starts with the first statement and moves downwards.
        // There is no decision and no repetition in this example.

        String studentName = "Lerato";
        int mark = 78;
        int bonus = 5;

        int finalMark = mark + bonus;

        System.out.println("Student: " + studentName);
        System.out.println("Original mark: " + mark);
        System.out.println("Bonus: " + bonus);
        System.out.println("Final mark: " + finalMark);

        // The statements above execute once, in order.
        System.out.println();


        // ============================================================
        // SECTION 3: SELECTION - MAKING A DECISION
        // ============================================================

        System.out.println("SECTION 3: SELECTION");

        int testMark = 65;

        // A selection structure allows Java to choose an action
        // based on whether a condition is TRUE or FALSE.
        //
        // Ask yourself:
        // Does the program need to make a decision?
        //
        // In this example, the program must decide whether the
        // Student has passed or failed.
        //
        // An IF-ELSE structure is suitable because there are
        // exactly TWO possible outcomes.

        if (testMark >= 50)
        {
            // This block executes when testMark >= 50 is TRUE.
            System.out.println("The Student has passed.");
        }
        else
        {
            // This block executes when testMark >= 50 is FALSE.
            System.out.println("The Student has failed.");
        }

        System.out.println();


        // ============================================================
        // SECTION 4: WHEN SHOULD WE USE A SIMPLE IF STATEMENT?
        // ============================================================

        System.out.println("SECTION 4: SIMPLE IF");

        int attendance = 95;

        // Sometimes we only need to perform an action when
        // a condition is TRUE.
        //
        // We do not always need an ELSE block.
        //
        // In this example, a message is displayed only when
        // attendance is at least 90%.
        //
        // If attendance is below 90%, the message is simply skipped.

        if (attendance >= 90)
        {
            System.out.println("Excellent attendance!");
        }

        System.out.println("Attendance check complete.");

        // Notice that "Attendance check complete." is displayed
        // regardless of whether the IF condition is TRUE or FALSE.
        System.out.println();


        // ============================================================
        // SECTION 5: WHEN SHOULD WE USE IF-ELSE-IF?
        // ============================================================

        System.out.println("SECTION 5: IF-ELSE-IF");

        int achievementMark = 82;

        // An IF-ELSE-IF structure is useful when there are
        // THREE OR MORE possible outcomes.
        //
        // Here, the Student's mark determines an achievement level.
        //
        // 80 or higher: Excellent
        // 65 to 79:    Very Good
        // 50 to 64:    Pass
        // Below 50:    Needs Improvement
        //
        // Java checks conditions from top to bottom.
        // Once a condition is TRUE, its block executes and the
        // remaining branches in this structure are skipped.

        if (achievementMark >= 80)
        {
            System.out.println("Achievement: Excellent");
        }
        else if (achievementMark >= 65)
        {
            System.out.println("Achievement: Very Good");
        }
        else if (achievementMark >= 50)
        {
            System.out.println("Achievement: Pass");
        }
        else
        {
            System.out.println("Achievement: Needs Improvement");
        }

        System.out.println();


        // ============================================================
        // SECTION 6: WHEN SHOULD WE USE SWITCH?
        // ============================================================

        System.out.println("SECTION 6: SWITCH");

        int menuChoice = 2;

        // A SWITCH statement is useful when a variable is compared
        // against a number of specific, fixed values.
        //
        // For example, a menu may contain these options:
        //
        // 1 - View marks
        // 2 - View attendance
        // 3 - View timetable
        //
        // A SWITCH statement is often clearer than several
        // ELSE-IF conditions when checking these fixed options.

        switch (menuChoice)
        {
            case 1:
                System.out.println("Opening Student marks.");
                break;

            case 2:
                System.out.println("Opening Student attendance.");
                break;

            case 3:
                System.out.println("Opening the timetable.");
                break;

            default:
                System.out.println("Invalid menu choice.");
                break;
        }

        // The BREAK statement prevents execution from continuing
        // into the next case in this traditional switch structure.
        //
        // The DEFAULT section handles values that do not match
        // any of the listed cases.
        System.out.println();


        // ============================================================
        // SECTION 7: REPETITION - REPEATING INSTRUCTIONS
        // ============================================================

        System.out.println("SECTION 7: REPETITION");

        // Repetition is used when an instruction must be performed
        // more than once.
        //
        // For example, a teacher may need to display the numbers
        // from 1 to 5.
        //
        // We could write five separate PRINTLN statements.
        // However, a loop allows Java to repeat the same instruction.
        //
        // A FOR loop is suitable when we know how many times
        // we want to repeat an instruction.

        for (int count = 1; count <= 5; count++)
        {
            System.out.println("Student number: " + count);
        }

        // Understand the three parts of the FOR loop:
        //
        // int count = 1
        // This initialises the counter. It runs once at the beginning.
        //
        // count <= 5
        // This is the condition. The loop repeats while it is TRUE.
        //
        // count++
        // This increases count by 1 after each iteration.
        //
        // An iteration means one execution of the loop body.
        System.out.println();


        // ============================================================
        // SECTION 8: REPEATING UNTIL A CONDITION CHANGES
        // ============================================================

        System.out.println("SECTION 8: WHILE LOOP");

        int studentNumber = 1;

        // A WHILE loop repeats while its condition is TRUE.
        //
        // It is particularly useful when repetition depends on
        // a condition rather than a fixed number of repetitions.
        //
        // The condition is checked BEFORE each iteration.
        // If it is FALSE at the beginning, the loop body never runs.

        while (studentNumber <= 3)
        {
            System.out.println("Processing Student " + studentNumber);

            // IMPORTANT:
            // The counter must change so that the condition can
            // eventually become FALSE.
            //
            // If we forget this statement, studentNumber remains 1.
            // The condition remains TRUE and the loop never ends.
            studentNumber++;
        }

        System.out.println("All Students processed.");
        System.out.println();


        // ============================================================
        // SECTION 9: COMBINING SELECTION AND REPETITION
        // ============================================================

        System.out.println("SECTION 9: SELECTION INSIDE A LOOP");

        // A program can use more than one control structure.
        //
        // In this example:
        //
        // 1. The FOR loop processes three marks.
        // 2. The IF-ELSE structure decides whether each mark passes.
        //
        // The loop controls HOW MANY marks are processed.
        // The selection structure decides WHAT happens to each mark.

        int mark1 = 75;
        int mark2 = 42;
        int mark3 = 58;

        for (int student = 1; student <= 3; student++)
        {
            int currentMark;

            // Select the mark belonging to the current Student.
            if (student == 1)
            {
                currentMark = mark1;
            }
            else if (student == 2)
            {
                currentMark = mark2;
            }
            else
            {
                currentMark = mark3;
            }

            // This IF-ELSE executes during every loop iteration.
            if (currentMark >= 50)
            {
                System.out.println("Student " + student + ": Passed");
            }
            else
            {
                System.out.println("Student " + student + ": Failed");
            }
        }

        System.out.println();


        // ============================================================
        // SECTION 10: HOW DO YOU CHOOSE THE CORRECT STRUCTURE?
        // ============================================================

        // Before writing code, read the problem and ask these questions:
        //
        // QUESTION 1:
        // Must the instructions execute once, in order, without
        // making a decision or repeating anything?
        //
        // If YES, use sequence.
        //
        // QUESTION 2:
        // Must the program decide what to do based on a condition?
        //
        // If YES, use selection.
        //
        // A simple IF is useful when an action is only required
        // if a condition is TRUE.
        //
        // IF-ELSE is useful when there are two alternative outcomes.
        //
        // IF-ELSE-IF is useful when there are several possible
        // outcomes based on different conditions.
        //
        // SWITCH is useful when selecting between specific,
        // fixed options.
        //
        // QUESTION 3:
        // Must the program repeat instructions?
        //
        // If YES, use a loop.
        //
        // FOR is often suitable when the number of repetitions
        // is known.
        //
        // WHILE is suitable when repetition depends on a condition.
        //
        // DO-WHILE is useful when the instructions must execute
        // at least once before the condition is checked.
        //
        // QUESTION 4:
        // Must the program both repeat instructions and make
        // a decision during each repetition?
        //
        // If YES, combine a loop with a selection structure.


        // ============================================================
        // SECTION 11: PRACTICE CHALLENGE
        // ============================================================

        System.out.println("SECTION 11: PRACTICE CHALLENGE");

        // For each scenario, decide which control structure is
        // most suitable BEFORE writing the code.
        //
        // SCENARIO A:
        // Display a message only if a Student's mark is at least 80.
        //
        // SCENARIO B:
        // Display either "Pass" or "Fail" based on a mark.
        //
        // SCENARIO C:
        // Assign one of four achievement categories based on a mark.
        //
        // SCENARIO D:
        // Display the numbers from 1 to 20.
        //
        // SCENARIO E:
        // Process five Students and determine whether each has passed.
        //
        // Suggested answers:
        //
        // A: IF
        // B: IF-ELSE
        // C: IF-ELSE-IF
        // D: FOR LOOP
        // E: FOR LOOP containing an IF-ELSE structure
        //
        // Try to explain WHY each answer is appropriate.

        int practiceMark = 88;

        // SCENARIO A: An action is required only when the condition
        // is TRUE, so a simple IF statement is suitable.
        if (practiceMark >= 80)
        {
            System.out.println("Excellent mark!");
        }

        // SCENARIO B: There are two possible outcomes.
        if (practiceMark >= 50)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }

        System.out.println("Practice complete.");
    }
}
