
/**
 * File: TestCasesAndExpectedResults.java
 * Folder: 11-Testing-and-Debugging/Test-Cases-and-Expected-Results
 *
 * PURPOSE:
 * To demonstrate how test cases are created and used to check
 * whether a Java programme produces the expected results.
 *
 * SCENARIO:
 * A school uses a programme to determine whether a Student has passed
 * based on a mark out of 100.
 *
 * CONCEPTS DEMONSTRATED:
 * 1. Test cases and expected results.
 * 2. Actual results.
 * 3. Pass and fail outcomes for tests.
 * 4. Normal, boundary and abnormal test data.
 * 5. Testing calculations and selection statements.
 * 6. Comparing expected and actual results.
 */

public class TestCasesAndExpectedResults {

    public static void main(String[] args) {

        // Display the purpose of the test programme.

        System.out.println("==========================================");
        System.out.println("       TEST CASES AND EXPECTED RESULTS");
        System.out.println("==========================================");
        System.out.println();

        // =========================================================
        // TEST 1: TESTING A PASS/FAIL METHOD
        // =========================================================

        System.out.println("TEST 1: PASS/FAIL DECISION");
        System.out.println("--------------------------");

        // A Student passes if the mark is at least 50.
        // Test different marks to check whether the method works.

        runPassTest(1, 75, true);
        runPassTest(2, 35, false);
        runPassTest(3, 50, true);
        runPassTest(4, 49, false);
        runPassTest(5, 100, true);
        runPassTest(6, 0, false);

        // =========================================================
        // TEST 2: TESTING A PERCENTAGE CALCULATION
        // =========================================================

        System.out.println();
        System.out.println("TEST 2: PERCENTAGE CALCULATION");
        System.out.println("------------------------------");

        // The percentage is calculated using:
        // (mark / maximumMark) * 100

        runPercentageTest(7, 45, 50, 90.0);
        runPercentageTest(8, 30, 60, 50.0);
        runPercentageTest(9, 0, 100, 0.0);
        runPercentageTest(10, 100, 100, 100.0);

        // =========================================================
        // TEST 3: TESTING A DISTINCTION DECISION
        // =========================================================

        System.out.println();
        System.out.println("TEST 3: DISTINCTION DECISION");
        System.out.println("----------------------------");

        // A distinction is awarded for a mark of 80 or higher.

        runDistinctionTest(11, 90, true);
        runDistinctionTest(12, 79, false);
        runDistinctionTest(13, 80, true);
        runDistinctionTest(14, 0, false);
        runDistinctionTest(15, 100, true);

        // =========================================================
        // TEST 4: TESTING INPUT VALIDATION
        // =========================================================

        System.out.println();
        System.out.println("TEST 4: VALID MARK RANGE");
        System.out.println("------------------------");

        // A valid mark must be between 0 and 100, inclusive.

        runValidationTest(16, 65, true);
        runValidationTest(17, 0, true);
        runValidationTest(18, 100, true);
        runValidationTest(19, -1, false);
        runValidationTest(20, 101, false);

        // =========================================================
        // FINAL SUMMARY
        // =========================================================

        System.out.println();
        System.out.println("==========================================");
        System.out.println("TESTING COMPLETE");
        System.out.println("Review any test marked FAIL.");
        System.out.println("==========================================");
    }

    // =============================================================
    // METHOD 1: DETERMINE WHETHER A STUDENT PASSED
    // =============================================================

    /**
     * Returns true if the Student passed.
     *
     * The pass requirement is 50%.
     */

    public static boolean hasPassed(int mark) {

        if (mark >= 50) {
            return true;
        } else {
            return false;
        }
    }

    // =============================================================
    // METHOD 2: CALCULATE A PERCENTAGE
    // =============================================================

    /**
     * Calculates a mark as a percentage.
     *
     * The maximum mark must be greater than zero.
     */

    public static double calculatePercentage(int mark, int maximumMark) {

        double percentage = (mark / (maximumMark * 1.0)) * 100;

        return percentage;
    }

    // =============================================================
    // METHOD 3: DETERMINE WHETHER A STUDENT ACHIEVED A DISTINCTION
    // =============================================================

    /**
     * Returns true if the mark is at least 80.
     */

    public static boolean hasDistinction(int mark) {

        if (mark >= 80) {
            return true;
        } else {
            return false;
        }
    }

    // =============================================================
    // METHOD 4: VALIDATE A MARK
    // =============================================================

    /**
     * Returns true if the mark is between 0 and 100, inclusive.
     */

    public static boolean isValidMark(int mark) {

        if (mark >= 0 && mark <= 100) {
            return true;
        } else {
            return false;
        }
    }

    // =============================================================
    // METHOD 5: RUN A PASS/FAIL TEST
    // =============================================================

    /**
     * Compares the expected pass/fail result with the actual result.
     *
     * Parameters:
     * testNumber - the number identifying the test.
     * mark - the mark being tested.
     * expectedResult - the result that should be produced.
     */

    public static void runPassTest(
            int testNumber, int mark, boolean expectedResult) {

        boolean actualResult = hasPassed(mark);

        displayTestResult(
                testNumber,
                "Pass/fail for mark " + mark,
                expectedResult,
                actualResult
        );
    }

    // =============================================================
    // METHOD 6: RUN A PERCENTAGE TEST
    // =============================================================

    /**
     * Compares the expected percentage with the actual percentage.
     *
     * A small tolerance is used because decimal calculations can
     * sometimes produce tiny rounding differences.
     */

    public static void runPercentageTest(
            int testNumber,
            int mark,
            int maximumMark,
            double expectedResult) {

        double actualResult = calculatePercentage(mark, maximumMark);

        boolean passedTest = Math.abs(actualResult - expectedResult) < 0.0001;

        displayTestResult(
                testNumber,
                "Percentage for " + mark + " out of " + maximumMark,
                expectedResult,
                actualResult,
                passedTest
        );
    }

    // =============================================================
    // METHOD 7: RUN A DISTINCTION TEST
    // =============================================================

    /**
     * Checks whether the distinction decision is correct.
     */

    public static void runDistinctionTest(
            int testNumber, int mark, boolean expectedResult) {

        boolean actualResult = hasDistinction(mark);

        displayTestResult(
                testNumber,
                "Distinction for mark " + mark,
                expectedResult,
                actualResult
        );
    }

    // =============================================================
    // METHOD 8: RUN A VALIDATION TEST
    // =============================================================

    /**
     * Checks whether a mark is accepted or rejected correctly.
     */

    public static void runValidationTest(
            int testNumber, int mark, boolean expectedResult) {

        boolean actualResult = isValidMark(mark);

        displayTestResult(
                testNumber,
                "Validation for mark " + mark,
                expectedResult,
                actualResult
        );
    }

    // =============================================================
    // METHOD 9: DISPLAY A BOOLEAN TEST RESULT
    // =============================================================

    /**
     * Displays the expected result, actual result and test outcome.
     */

    public static void displayTestResult(
            int testNumber,
            String description,
            boolean expectedResult,
            boolean actualResult) {

        boolean testPassed = expectedResult == actualResult;

        System.out.println("Test " + testNumber + ": " + description);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);

        if (testPassed) {
            System.out.println("Test outcome: PASS");
        } else {
            System.out.println("Test outcome: FAIL");
        }

        System.out.println();
    }

    // =============================================================
    // METHOD 10: DISPLAY A NUMERICAL TEST RESULT
    // =============================================================

    /**
     * Displays a numerical test result.
     *
     * The caller supplies the result of the numerical comparison.
     */

    public static void displayTestResult(
            int testNumber,
            String description,
            double expectedResult,
            double actualResult,
            boolean testPassed) {

        System.out.println("Test " + testNumber + ": " + description);
        System.out.printf("Expected result: %.2f%n", expectedResult);
        System.out.printf("Actual result: %.2f%n", actualResult);

        if (testPassed) {
            System.out.println("Test outcome: PASS");
        } else {
            System.out.println("Test outcome: FAIL");
        }

        System.out.println();
    }
}

/*
SAMPLE OUTPUT EXTRACT

==========================================
       TEST CASES AND EXPECTED RESULTS
==========================================

TEST 1: PASS/FAIL DECISION
--------------------------
Test 1: Pass/fail for mark 75
Expected result: true
Actual result: true
Test outcome: PASS

Test 2: Pass/fail for mark 35
Expected result: false
Actual result: false
Test outcome: PASS

Test 3: Pass/fail for mark 50
Expected result: true
Actual result: true
Test outcome: PASS

Test 4: Pass/fail for mark 49
Expected result: false
Actual result: false
Test outcome: PASS

TEST 2: PERCENTAGE CALCULATION
------------------------------
Test 7: Percentage for 45 out of 50
Expected result: 90.00
Actual result: 90.00
Test outcome: PASS

TEST 3: DISTINCTION DECISION
----------------------------
Test 13: Distinction for mark 80
Expected result: true
Actual result: true
Test outcome: PASS

TEST 4: VALID MARK RANGE
------------------------
Test 19: Validation for mark -1
Expected result: false
Actual result: false
Test outcome: PASS

Test 20: Validation for mark 101
Expected result: false
Actual result: false
Test outcome: PASS

==========================================
TESTING COMPLETE
Review any test marked FAIL.
==========================================

Note: The complete programme displays all 20 tests.
The extracts above show selected examples.
*/

