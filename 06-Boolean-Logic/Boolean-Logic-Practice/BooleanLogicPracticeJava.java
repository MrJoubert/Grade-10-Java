public class BooleanLogicPractice
{
    public static void main(String[] args)
    {
        // Question 1: Relational operators
        int mark = 64;

        boolean passed = mark >= 50;

        System.out.println("QUESTION 1");
        System.out.println("Mark: " + mark);
        System.out.println("Passed: " + passed);
        System.out.println();

        // Question 2: OR operator
        int grade = 11;

        boolean allowedGrade = grade == 10 || grade == 11;

        System.out.println("QUESTION 2");
        System.out.println("Grade: " + grade);
        System.out.println("Allowed to attend: " + allowedGrade);
        System.out.println();

        // Question 3: AND operator
        int certificateMark = 78;
        int attendance = 85;

        boolean qualifies = certificateMark >= 75 && attendance >= 80;

        System.out.println("QUESTION 3");
        System.out.println("Mark: " + certificateMark);
        System.out.println("Attendance: " + attendance);
        System.out.println("Qualifies for certificate: " + qualifies);
        System.out.println();

        // Question 4: Brackets and combined conditions
        int studentGrade = 10;
        int studentMark = 62;

        boolean eligible = (studentGrade == 10 || studentGrade == 11)
                && studentMark >= 50;

        System.out.println("QUESTION 4");
        System.out.println("Eligible: " + eligible);
        System.out.println();

        // Question 5: NOT operator
        int testMark = 45;

        boolean notPassed = !(testMark >= 50);

        System.out.println("QUESTION 5");
        System.out.println("Did not pass: " + notPassed);
        System.out.println();

        // Question 6: De Morgan's Law
        int finalMark = 45;
        int finalAttendance = 90;

        boolean firstExpression =
                !(finalMark >= 50 && finalAttendance >= 80);

        boolean secondExpression =
                finalMark < 50 || finalAttendance < 80;

        System.out.println("QUESTION 6");
        System.out.println("First expression: " + firstExpression);
        System.out.println("Second expression: " + secondExpression);
        System.out.println("Expressions are equivalent: "
                + (firstExpression == secondExpression));
    }
}
