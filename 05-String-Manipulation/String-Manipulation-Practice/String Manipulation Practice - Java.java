
public class StringManipulationPractice {

    public static void main(String[] args) {

        // QUESTION 1: Extracting information from a student's name
        System.out.println("STUDENT NAME");
        System.out.println("============");

        String fullName = "Olivia Smith";

        System.out.println("Full name: " + fullName);
        System.out.println("Number of characters: " + fullName.length());
        System.out.println("First character: " + fullName.charAt(0));
        System.out.println("First name: " + fullName.substring(0, 6));
        System.out.println("Surname: " + fullName.substring(7));

        // QUESTION 2: Processing a subject name
        System.out.println();
        System.out.println("SUBJECT PROCESSING");
        System.out.println("==================");

        String subject = "Information Technology";

        System.out.println("Uppercase: " + subject.toUpperCase());
        System.out.println("Lowercase: " + subject.toLowerCase());
        System.out.println("Technology starts at: " + subject.indexOf("Technology"));
        System.out.println("Subject matches: "
                + subject.equals("Information Technology"));

        // QUESTION 3: Removing spaces and comparing names
        System.out.println();
        System.out.println("NAME COMPARISON");
        System.out.println("===============");

        String enteredName = "  Liam Jacobs  ";
        String storedName = "Liam Jacobs";

        String cleanedName = enteredName.trim();

        System.out.println("Entered name: [" + enteredName + "]");
        System.out.println("Cleaned name: [" + cleanedName + "]");
        System.out.println("Names match: " + cleanedName.equals(storedName));

        // QUESTION 4: Updating a class code
        System.out.println();
        System.out.println("CLASS CODE");
        System.out.println("==========");

        String classCode = "11A";

        System.out.println("Grade: " + classCode.substring(0, 2));
        System.out.println("Class group: " + classCode.charAt(2));

        String updatedClassCode = classCode.replace('A', 'B');

        System.out.println("Updated class code: " + updatedClassCode);

        // QUESTION 5: Splitting and calculating marks
        System.out.println();
        System.out.println("MARKS");
        System.out.println("=====");

        String marks = "65,78,92";

        String[] markParts = marks.split(",");

        int markOne = Integer.parseInt(markParts[0]);
        int markTwo = Integer.parseInt(markParts[1]);
        int markThree = Integer.parseInt(markParts[2]);

        int total = markOne + markTwo + markThree;
        double average = total / 3.0;

        System.out.println("Mark 1: " + markOne);
        System.out.println("Mark 2: " + markTwo);
        System.out.println("Mark 3: " + markThree);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        // QUESTION 6: Building a student report
        System.out.println();
        System.out.println("STUDENT REPORT");
        System.out.println("==============");

        String studentName = "Ava Brown";
        String reportClass = "12A";
        int studentMark = 87;

        String markText = String.valueOf(studentMark);

        String report = studentName + " is in class " + reportClass
                + " and achieved " + markText + "%.";

        System.out.println(report);

        // QUESTION 7: Finding and replacing text
        System.out.println();
        System.out.println("SUBJECT UPDATE");
        System.out.println("==============");

        String oldSubject = "Computer Studies";

        System.out.println("Position of Studies: "
                + oldSubject.indexOf("Studies"));

        String newSubject = oldSubject.replace(
                "Studies", "Applications Technology");

        System.out.println("Updated subject: " + newSubject);

        // QUESTION 8: Integrated string processing
        System.out.println();
        System.out.println("INTEGRATED CHALLENGE");
        System.out.println("====================");

        String challengeName = "  Noah Williams  ";
        String challengeMarks = "70,85,90";

        String cleanedChallengeName = challengeName.trim();
        String displayedName = cleanedChallengeName.toUpperCase();

        String[] challengeMarkParts = challengeMarks.split(",");

        int challengeMarkOne = Integer.parseInt(challengeMarkParts[0]);
        int challengeMarkTwo = Integer.parseInt(challengeMarkParts[1]);
        int challengeMarkThree = Integer.parseInt(challengeMarkParts[2]);

        int challengeTotal = challengeMarkOne
                + challengeMarkTwo + challengeMarkThree;

        double challengeAverage = challengeTotal / 3.0;

        System.out.println("Student: " + displayedName);
        System.out.println("Total: " + challengeTotal);
        System.out.println("Average: " + challengeAverage);
    }
}
