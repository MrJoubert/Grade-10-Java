
public class LogicalOperators {

    public static void main(String[] args) {

        // QUESTION 1: AND operator
        System.out.println("AND OPERATOR");
        System.out.println("============");

        boolean passed = true;
        boolean projectSubmitted = false;

        System.out.println("Passed: " + passed);
        System.out.println("Project submitted: " + projectSubmitted);
        System.out.println("Both conditions true: "
                + (passed && projectSubmitted));

        projectSubmitted = true;

        System.out.println("After project submission: "
                + (passed && projectSubmitted));

        // QUESTION 2: OR operator
        System.out.println();
        System.out.println("OR OPERATOR");
        System.out.println("===========");

        boolean availableMonday = false;
        boolean availableTuesday = true;

        System.out.println("Available Monday: " + availableMonday);
        System.out.println("Available Tuesday: " + availableTuesday);
        System.out.println("Available on at least one day: "
                + (availableMonday || availableTuesday));

        // QUESTION 3: NOT operator
        System.out.println();
        System.out.println("NOT OPERATOR");
        System.out.println("============");

        boolean registered = false;

        System.out.println("Registered: " + registered);
        System.out.println("Not registered: " + !registered);

        // QUESTION 4: Checking student eligibility
        System.out.println();
        System.out.println("STUDENT ELIGIBILITY");
        System.out.println("===================");

        int mark = 78;
        int attendance = 90;
        boolean submitted = true;

        boolean eligible = mark >= 50
                && attendance >= 80
                && submitted;

        System.out.println("Mark: " + mark);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("Project submitted: " + submitted);
        System.out.println("Eligible: " + eligible);

        // QUESTION 5: Checking whether a student needs support
        System.out.println();
        System.out.println("SUPPORT CHECK");
        System.out.println("=============");

        int supportMark = 38;
        int supportAttendance = 85;

        boolean needsSupport = supportMark < 40
                || supportAttendance < 70;

        System.out.println("Mark: " + supportMark);
        System.out.println("Attendance: " + supportAttendance + "%");
        System.out.println("Needs support: " + needsSupport);

        // QUESTION 6: Combining conditions in an if statement
        System.out.println();
        System.out.println("ASSESSMENT REQUIREMENTS");
        System.out.println("=======================");

        int assessmentMark = 65;
        boolean assessmentSubmitted = true;

        if (assessmentMark >= 50 && assessmentSubmitted) {
            System.out.println("Assessment requirements met.");
        } else {
            System.out.println("Assessment requirements not met.");
        }

        // QUESTION 7: Displaying logical expression results
        System.out.println();
        System.out.println("LOGICAL EXPRESSION RESULTS");
        System.out.println("==========================");

        System.out.println("true && true: " + (true && true));
        System.out.println("true && false: " + (true && false));
        System.out.println("false || true: " + (false || true));
        System.out.println("false || false: " + (false || false));
        System.out.println("!true: " + !true);
        System.out.println("!false: " + !false);
    }
}
