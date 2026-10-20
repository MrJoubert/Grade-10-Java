
public class CombiningMultipleConditions {

    public static void main(String[] args) {

        // QUESTION 1: Combining three requirements
        System.out.println("STUDENT ELIGIBILITY");
        System.out.println("===================");

        int mark = 75;
        int attendance = 90;
        boolean projectSubmitted = true;

        boolean eligible = mark >= 50
                && attendance >= 80
                && projectSubmitted;

        System.out.println("Mark: " + mark);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("Project submitted: " + projectSubmitted);
        System.out.println("Eligible: " + eligible);

        // QUESTION 2: Checking whether support is required
        System.out.println();
        System.out.println("SUPPORT CHECK");
        System.out.println("=============");

        int supportMark = 35;
        int supportAttendance = 90;

        boolean needsSupport = supportMark < 40
                || supportAttendance < 70;

        System.out.println("Mark: " + supportMark);
        System.out.println("Attendance: " + supportAttendance + "%");
        System.out.println("Needs support: " + needsSupport);

        // QUESTION 3: Combining OR and AND with brackets
        System.out.println();
        System.out.println("PARTICIPATION CHECK");
        System.out.println("===================");

        int participationMark = 62;
        int average = 68;
        boolean parentPermission = true;

        boolean mayParticipate = (participationMark >= 60
                || average >= 70)
                && parentPermission;

        System.out.println("Mark: " + participationMark);
        System.out.println("Average: " + average);
        System.out.println("Parent permission: " + parentPermission);
        System.out.println("May participate: " + mayParticipate);

        // QUESTION 4: Comparing expressions with different groupings
        System.out.println();
        System.out.println("BOOLEAN EXPRESSION GROUPING");
        System.out.println("===========================");

        boolean resultOne = true || false && false;
        boolean resultTwo = (true || false) && false;
        boolean resultThree = true && false || true;
        boolean resultFour = true && (false || true);
        boolean resultFive = !(true && false);

        System.out.println("Result 1: " + resultOne);
        System.out.println("Result 2: " + resultTwo);
        System.out.println("Result 3: " + resultThree);
        System.out.println("Result 4: " + resultFour);
        System.out.println("Result 5: " + resultFive);

        // QUESTION 5: Checking award eligibility
        System.out.println();
        System.out.println("AWARD ELIGIBILITY");
        System.out.println("=================");

        double studentAverage = 82.5;
        boolean disciplinaryRestriction = false;
        boolean specialAward = false;

        boolean qualifiesForAward =
                (studentAverage >= 80 && !disciplinaryRestriction)
                || specialAward;

        System.out.println("Average: " + studentAverage);
        System.out.println("Disciplinary restriction: "
                + disciplinaryRestriction);
        System.out.println("Special award: " + specialAward);
        System.out.println("Qualifies for award: " + qualifiesForAward);

        // QUESTION 6: Checking whether permission is compulsory
        System.out.println();
        System.out.println("PERMISSION CHECK");
        System.out.println("================");

        boolean markRequirement = false;
        boolean attendanceRequirement = true;
        boolean permission = false;

        boolean firstExpression =
                (markRequirement || attendanceRequirement) && permission;

        boolean secondExpression =
                markRequirement || (attendanceRequirement && permission);

        System.out.println("Permission required for all: " + firstExpression);
        System.out.println("Permission applies to second condition: "
                + secondExpression);
    }
}
