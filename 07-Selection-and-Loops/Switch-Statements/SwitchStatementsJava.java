
public class SwitchStatements
{
    public static void main(String[] args)
    {
        // ============================================================
        // SECTION 1: WHAT IS A SWITCH STATEMENT?
        // ============================================================
        // A switch statement selects one option from several cases.
        //
        // It is useful when one variable must be compared with
        // several specific values.
        //
        // The switch checks the value of the variable.
        // It then starts executing the matching case.
        //
        // The break statement exits the switch.
        // The default case executes if no case matches.

        System.out.println("SECTION 1: BASIC SWITCH");

        int grade = 11;

        switch (grade)
        {
            case 10:
                System.out.println("Grade 10");
                break;

            case 11:
                System.out.println("Grade 11");
                break;

            case 12:
                System.out.println("Grade 12");
                break;

            default:
                System.out.println("Invalid grade");
                break;
        }

        // ============================================================
        // SECTION 2: UNDERSTANDING CASE AND BREAK
        // ============================================================
        // Each case represents a possible value.
        //
        // When a matching case is found, its statements execute.
        // The break statement prevents execution from continuing
        // into the next case.
        //
        // If break is omitted, execution can continue into subsequent
        // cases until a break or the end of the switch is reached.
        //
        // This is called fall-through.

        System.out.println();
        System.out.println("SECTION 2: USING BREAK");

        int day = 3;

        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }

        // ============================================================
        // SECTION 3: THE DEFAULT CASE
        // ============================================================
        // The default case is optional.
        //
        // It is useful when the variable might contain a value
        // that is not covered by any of the cases.
        //
        // Here, 15 does not match any of the listed grades.

        System.out.println();
        System.out.println("SECTION 3: DEFAULT CASE");

        grade = 15;

        switch (grade)
        {
            case 10:
                System.out.println("Grade 10 selected");
                break;

            case 11:
                System.out.println("Grade 11 selected");
                break;

            case 12:
                System.out.println("Grade 12 selected");
                break;

            default:
                System.out.println("Grade is not supported");
                break;
        }

        // ============================================================
        // SECTION 4: SWITCH WITH A STRING
        // ============================================================
        // A switch statement can also be used with a String.
        //
        // The String value is compared with the case values.
        // The case values must be constant String values.
        //
        // String matching in a switch is case-sensitive.
        // For example, "CAT" and "cat" are different values.

        System.out.println();
        System.out.println("SECTION 4: STRING SWITCH");

        String subject = "IT";

        switch (subject)
        {
            case "IT":
                System.out.println("Information Technology");
                break;

            case "CAT":
                System.out.println("Computer Applications Technology");
                break;

            case "MATHEMATICS":
                System.out.println("Mathematics");
                break;

            default:
                System.out.println("Subject not recognised");
                break;
        }

        // ============================================================
        // SECTION 5: SWITCH WITH A CALCULATED VALUE
        // ============================================================
        // A switch can use a variable whose value was calculated
        // earlier in the program.
        //
        // The mark is converted into a simple category.
        // The switch then displays the corresponding result.

        System.out.println();
        System.out.println("SECTION 5: MARK CATEGORY");

        int mark = 86;
        int category;

        if (mark >= 80)
        {
            category = 1;
        }
        else if (mark >= 50)
        {
            category = 2;
        }
        else
        {
            category = 3;
        }

        switch (category)
        {
            case 1:
                System.out.println("Distinction");
                break;

            case 2:
                System.out.println("Pass");
                break;

            case 3:
                System.out.println("Fail");
                break;

            default:
                System.out.println("Invalid category");
                break;
        }

        // ============================================================
        // SECTION 6: GROUPING CASES
        // ============================================================
        // Several cases can share the same statements.
        //
        // In this example, both 1 and 2 represent the first two
        // assessment cycles.
        //
        // There is deliberately no break after case 1.
        // Execution continues into the shared statements for case 2.

        System.out.println();
        System.out.println("SECTION 6: GROUPED CASES");

        int cycle = 2;

        switch (cycle)
        {
            case 1:
            case 2:
                System.out.println("First half of the school year");
                break;

            case 3:
            case 4:
                System.out.println("Second half of the school year");
                break;

            default:
                System.out.println("Invalid Cycle");
                break;
        }

        // ============================================================
        // SECTION 7: SWITCH INSIDE A LOOP
        // ============================================================
        // A switch can be placed inside a loop.
        //
        // The loop repeats the selection structure for each value.
        // Each iteration checks a different subject code.

        System.out.println();
        System.out.println("SECTION 7: SUBJECT CODES");

        int[] subjectCodes = {1, 2, 3, 4};

        for (int counter = 0;
                counter < subjectCodes.length;
                counter++)
        {
            System.out.print("Subject code "
                    + subjectCodes[counter] + ": ");

            switch (subjectCodes[counter])
            {
                case 1:
                    System.out.println("IT");
                    break;

                case 2:
                    System.out.println("CAT");
                    break;

                case 3:
                    System.out.println("Mathematics");
                    break;

                default:
                    System.out.println("Unknown subject");
                    break;
            }
        }

        // ============================================================
        // SECTION 8: SWITCH VERSUS IF-ELSE
        // ============================================================
        // A switch is suitable when one expression is compared
        // against several specific values.
        //
        // An if-else structure is more flexible when conditions
        // involve ranges or more complicated comparisons.
        //
        // For example, a mark of 75 falls within a range.
        // A switch is not the most suitable choice for checking
        // whether a mark is above or below a threshold.

        System.out.println();
        System.out.println("SECTION 8: IF-ELSE FOR A MARK RANGE");

        mark = 75;

        if (mark >= 80)
        {
            System.out.println("Distinction");
        }
        else if (mark >= 50)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }

        // ============================================================
        // SECTION 9: COMMON SWITCH MISTAKES
        // ============================================================
        // 1. Forgetting break and accidentally executing another case.
        //
        // 2. Using duplicate case values.
        //
        // 3. Forgetting the colon after a case value.
        //
        // 4. Assuming default is compulsory. It is optional.
        //
        // 5. Using a switch for a range of values when if-else
        //    would be clearer.
        //
        // 6. Forgetting that String matching is case-sensitive.
        //
        // 7. Expecting the default case to execute after a matching
        //    case that already ends with break.

        // ============================================================
        // SECTION 10: PRACTICE CHALLENGE
        // ============================================================
        // Write a switch statement for a variable called option.
        //
        // Use these options:
        // 1 - Display "View Student marks"
        // 2 - Display "Calculate average"
        // 3 - Display "Display class list"
        // Any other value - Display "Invalid option"
        //
        // Remember to use break statements where appropriate.

        System.out.println();
        System.out.println("SECTION 10: PRACTICE CHALLENGE");

        int option = 2;

        switch (option)
        {
            case 1:
                System.out.println("View Student marks");
                break;

            case 2:
                System.out.println("Calculate average");
                break;

            case 3:
                System.out.println("Display class list");
                break;

            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
