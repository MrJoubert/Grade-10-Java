/*
 * Topic: Integer Division and Remainder
 * Demonstrates whole-number division, remainders and real division.
 */

public class IntegerDivisionAndRemainder {

    public static void main(String[] args) {

        // Calculate how Students can be divided into groups.
        int numberOfStudents = 23;
        int studentsPerGroup = 5;

        int completeGroups = numberOfStudents / studentsPerGroup;
        int remainingStudents = numberOfStudents % studentsPerGroup;

        System.out.println("STUDENT WORKSHOP");
        System.out.println("================");

        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Students per group: " + studentsPerGroup);
        System.out.println("Complete groups: " + completeGroups);
        System.out.println("Students remaining: " + remainingStudents);

        // Compare integer division with real division.
        int testOneMark = 41;
        int testTwoMark = 36;
        int totalMarks = testOneMark + testTwoMark;

        int integerAverage = totalMarks / 2;
        double realAverage = totalMarks / 2.0;

        System.out.println();
        System.out.println("ASSESSMENT AVERAGE");
        System.out.println("==================");

        System.out.println("Test 1 mark: " + testOneMark);
        System.out.println("Test 2 mark: " + testTwoMark);
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average using integer division: " + integerAverage);
        System.out.println("Average using real division: " + realAverage);

    }

}
