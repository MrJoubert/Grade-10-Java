
public class DeMorgansLaws {

    public static void main(String[] args) {

        // QUESTION 1: De Morgan's first law
        System.out.println("DE MORGAN'S FIRST LAW");
        System.out.println("=====================");

        boolean passed = true;
        boolean projectSubmitted = false;

        boolean originalAnd = !(passed && projectSubmitted);
        boolean rewrittenAnd = !passed || !projectSubmitted;

        System.out.println("Original expression: " + originalAnd);
        System.out.println("Rewritten expression: " + rewrittenAnd);

        // QUESTION 2: De Morgan's second law
        System.out.println();
        System.out.println("DE MORGAN'S SECOND LAW");
        System.out.println("======================");

        boolean availableMonday = false;
        boolean availableTuesday = false;

        boolean originalOr = !(availableMonday || availableTuesday);
        boolean rewrittenOr = !availableMonday && !availableTuesday;

        System.out.println("Original expression: " + originalOr);
        System.out.println("Rewritten expression: " + rewrittenOr);

        // QUESTION 3: Negating relational expressions
        System.out.println();
        System.out.println("NEGATING COMPARISONS");
        System.out.println("====================");

        int mark = 50;

        System.out.println("Not greater than 60: " + !(mark > 60));
        System.out.println("Less than or equal to 60: " + (mark <= 60));
        System.out.println("Not at most 75: " + !(mark <= 75));
        System.out.println("Greater than 75: " + (mark > 75));
        System.out.println("Not equal to 50: " + !(mark == 50));
        System.out.println("Not different from 50: " + !(mark != 50));

        // QUESTION 4: Rewriting student eligibility
        System.out.println();
        System.out.println("STUDENT ELIGIBILITY");
        System.out.println("===================");

        int studentMark = 45;
        boolean submitted = true;
        int attendance = 85;

        boolean eligible = studentMark >= 50
                && submitted
                && attendance >= 80;

        boolean notEligible = !(studentMark >= 50
                && submitted
                && attendance >= 80);

        boolean rewrittenNotEligible = studentMark < 50
                || !submitted
                || attendance < 80;

        System.out.println("Eligible: " + eligible);
        System.out.println("Not eligible: " + notEligible);
        System.out.println("Rewritten not eligible: "
                + rewrittenNotEligible);

        // QUESTION 5: Comparing equivalent expressions
        System.out.println();
        System.out.println("EQUIVALENT EXPRESSIONS");
        System.out.println("======================");

        boolean A = true;
        boolean B = false;

        System.out.println("!(A && B): " + !(A && B));
        System.out.println("!A || !B: " + (!A || !B));
        System.out.println("!(A || B): " + !(A || B));
        System.out.println("!A && !B: " + (!A && !B));
    }
}
