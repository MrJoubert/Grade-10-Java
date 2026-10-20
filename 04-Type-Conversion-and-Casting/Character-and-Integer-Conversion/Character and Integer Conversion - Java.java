
/*
 * Topic: Character and Integer Conversion
 * Demonstrates character codes and explicit casting.
 */

public class CharacterAndIntegerConversion {

    public static void main(String[] args) {

        // Convert characters into their numeric codes.
        char firstLetter = 'A';
        char secondLetter = 'B';

        int firstCode = firstLetter;
        int secondCode = secondLetter;

        System.out.println("CHARACTER CODES");
        System.out.println("===============");
        System.out.println("First character: " + firstLetter);
        System.out.println("First character code: " + firstCode);
        System.out.println("Second character: " + secondLetter);
        System.out.println("Second character code: " + secondCode);

        // Convert an integer into a character.
        int characterCode = 67;
        char convertedLetter = (char) characterCode;

        System.out.println();
        System.out.println("INTEGER TO CHARACTER");
        System.out.println("====================");
        System.out.println("Integer value: " + characterCode);
        System.out.println("Converted character: " + convertedLetter);

        // Calculate the next character code.
        int nextCode = firstCode + 1;
        char nextLetter = (char) nextCode;

        System.out.println();
        System.out.println("CHARACTER CALCULATION");
        System.out.println("=====================");
        System.out.println("Original letter: " + firstLetter);
        System.out.println("Next character: " + nextLetter);

        // Convert a digit character into its numeric value.
        char digitCharacter = '7';
        int digitCode = digitCharacter;
        int numericDigit = digitCharacter - '0';

        System.out.println();
        System.out.println("DIGIT CONVERSION");
        System.out.println("================");
        System.out.println("Digit character: " + digitCharacter);
        System.out.println("Character code: " + digitCode);
        System.out.println("Numeric digit: " + numericDigit);

    }

}
