
public class ConvertingValuesToStrings {

    public static void main(String[] args) {

        // QUESTION 1: Converting an integer
        System.out.println("INTEGER CONVERSION");
        System.out.println("==================");

        int mark = 85;
        String markText = String.valueOf(mark);

        System.out.println("Original mark: " + mark);
        System.out.println("Converted mark: " + markText);

        // QUESTION 2: Converting a decimal number
        System.out.println();
        System.out.println("DECIMAL CONVERSION");
        System.out.println("==================");

        double average = 76.5;
        String averageText = String.valueOf(average);

        System.out.println("Original average: " + average);
        System.out.println("Converted average: " + averageText);

        // QUESTION 3: Converting a boolean
        System.out.println();
        System.out.println("BOOLEAN CONVERSION");
        System.out.println("==================");

        boolean passed = true;
        String passedText = String.valueOf(passed);

        System.out.println("Original result: " + passed);
        System.out.println("Converted result: " + passedText);

        // QUESTION 4: Converting a character
        System.out.println();
        System.out.println("CHARACTER CONVERSION");
        System.out.println("====================");

        char grade = 'A';
        String gradeText = String.valueOf(grade);

        System.out.println("Original grade: " + grade);
        System.out.println("Converted grade: " + gradeText);

        // QUESTION 5: Combining converted values
        System.out.println();
        System.out.println("STUDENT REPORT");
        System.out.println("==============");

        String studentName = "Olivia";
        int studentMark = 91;

        String studentMarkText = String.valueOf(studentMark);

        String report = studentName + " achieved "
                + studentMarkText + "%.";

        System.out.println(report);

        // QUESTION 6: Comparing arithmetic and concatenation
        System.out.println();
        System.out.println("ARITHMETIC AND CONCATENATION");
        System.out.println("============================");

        int number = 12;
        String numberText = String.valueOf(number);

        System.out.println("Integer addition: " + (number + 3));
        System.out.println("String concatenation: " + numberText + 3);
        System.out.println("Combined message: " + numberText + " students");

        // QUESTION 7: Combining several converted values
        System.out.println();
        System.out.println("CLASS SUMMARY");
        System.out.println("=============");

        String classCode = "12A";
        double classAverage = 78.25;
        boolean resultsPublished = true;

        String classAverageText = String.valueOf(classAverage);
        String publishedText = String.valueOf(resultsPublished);

        String summary = "Class " + classCode
                + " has an average of " + classAverageText
                + ". Results published: " + publishedText + ".";

        System.out.println(summary);
    }
}
