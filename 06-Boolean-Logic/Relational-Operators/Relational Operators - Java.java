
public class RelationalOperators {

    public static void main(String[] args) {

        // QUESTION 1: Equal to and not equal to
        System.out.println("EQUALITY OPERATORS");
        System.out.println("==================");

        int mark = 75;

        System.out.println("Mark equals 75: " + (mark == 75));
        System.out.println("Mark equals 70: " + (mark == 70));
        System.out.println("Mark is not 75: " + (mark != 75));
        System.out.println("Mark is not 70: " + (mark != 70));

        // QUESTION 2: Greater than and less than
        System.out.println();
        System.out.println("GREATER THAN AND LESS THAN");
        System.out.println("==========================");

        System.out.println("Mark greater than 70: " + (mark > 70));
        System.out.println("Mark greater than 75: " + (mark > 75));
        System.out.println("Mark less than 80: " + (mark < 80));
        System.out.println("Mark less than 75: " + (mark < 75));

        // QUESTION 3: Greater than or equal to and less than or equal to
        System.out.println();
        System.out.println("INCLUSIVE COMPARISONS");
        System.out.println("=====================");

        System.out.println("Mark at least 75: " + (mark >= 75));
        System.out.println("Mark at least 80: " + (mark >= 80));
        System.out.println("Mark at most 75: " + (mark <= 75));
        System.out.println("Mark at most 70: " + (mark <= 70));

        // QUESTION 4: Storing comparison results
        System.out.println();
        System.out.println("BOOLEAN RESULTS");
        System.out.println("===============");

        boolean passed = mark >= 50;
        boolean distinction = mark >= 80;

        System.out.println("Passed: " + passed);
        System.out.println("Distinction: " + distinction);

        // QUESTION 5: Comparing two students' marks
        System.out.println();
        System.out.println("COMPARING STUDENT MARKS");
        System.out.println("=======================");

        int markOne = 82;
        int markTwo = 76;

        System.out.println("First mark: " + markOne);
        System.out.println("Second mark: " + markTwo);
        System.out.println("First mark is higher: " + (markOne > markTwo));
        System.out.println("Marks are equal: " + (markOne == markTwo));
        System.out.println("First mark is lower: " + (markOne < markTwo));

        // QUESTION 6: Using a relational operator in an if statement
        System.out.println();
        System.out.println("ACHIEVEMENT CHECK");
        System.out.println("=================");

        int average = 80;

        if (average >= 80) {
            System.out.println("High achievement.");
        } else {
            System.out.println("Continue working towards the target.");
        }

        // QUESTION 7: Checking attendance
        System.out.println();
        System.out.println("ATTENDANCE CHECK");
        System.out.println("================");

        int absences = 4;

        if (absences <= 5) {
            System.out.println("Attendance requirement met.");
        } else {
            System.out.println("Attendance requirement not met.");
        }
    }
}
