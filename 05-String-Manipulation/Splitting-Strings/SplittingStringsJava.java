
public class SplittingStrings {

    public static void main(String[] args) {

        // QUESTION 1: Splitting a student's full name
        System.out.println("STUDENT NAME");
        System.out.println("============");

        String fullName = "Olivia Smith";

        String[] nameParts = fullName.split(" ");

        System.out.println("Full name: " + fullName);
        System.out.println("First name: " + nameParts[0]);
        System.out.println("Surname: " + nameParts[1]);

        // QUESTION 2: Splitting marks
        System.out.println();
        System.out.println("STUDENT MARKS");
        System.out.println("=============");

        String marks = "65,78,92";

        String[] markParts = marks.split(",");

        System.out.println("First mark: " + markParts[0]);
        System.out.println("Second mark: " + markParts[1]);
        System.out.println("Third mark: " + markParts[2]);
        System.out.println("Number of marks: " + markParts.length);

        // QUESTION 3: Splitting a class code
        System.out.println();
        System.out.println("CLASS CODE");
        System.out.println("==========");

        String classCode = "12-A";

        String[] classParts = classCode.split("-");

        System.out.println("Grade: " + classParts[0]);
        System.out.println("Class group: " + classParts[1]);

        // QUESTION 4: Splitting a sentence
        System.out.println();
        System.out.println("SENTENCE");
        System.out.println("========");

        String sentence = "Java makes programming interesting";

        String[] words = sentence.split(" ");

        System.out.println("First word: " + words[0]);
        System.out.println("Last word: " + words[3]);
        System.out.println("Number of words: " + words.length);

        // QUESTION 5: Splitting and calculating marks
        System.out.println();
        System.out.println("TOTAL MARK");
        System.out.println("==========");

        String twoMarks = "35,40";

        String[] twoMarkParts = twoMarks.split(",");

        int firstMark = Integer.parseInt(twoMarkParts[0]);
        int secondMark = Integer.parseInt(twoMarkParts[1]);

        int total = firstMark + secondMark;

        System.out.println("First mark: " + firstMark);
        System.out.println("Second mark: " + secondMark);
        System.out.println("Total: " + total);

        // QUESTION 6: Splitting subject names
        System.out.println();
        System.out.println("SUBJECTS");
        System.out.println("========");

        String subjects = "IT,CAT,Mathematics";

        String[] subjectParts = subjects.split(",");

        System.out.println("Subject 1: " + subjectParts[0]);
        System.out.println("Subject 2: " + subjectParts[1]);
        System.out.println("Subject 3: " + subjectParts[2]);
        System.out.println("Number of subjects: " + subjectParts.length);
    }
}
