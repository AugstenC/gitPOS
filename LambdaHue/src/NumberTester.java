import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberTester {

    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    private String fileName;

    public NumberTester(String fileName) {
        this.fileName = fileName;
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            int numberOfTests = Integer.parseInt(br.readLine());

            for (int i = 0; i < numberOfTests; i++) {
                String[] line = br.readLine().split(" ");
                int testType = Integer.parseInt(line[0]);
                int number = Integer.parseInt(line[1]);

                switch (testType) {
                    case 1:
                        if (oddTester.testNumber(number)) {
                            System.out.println("ODD");
                        } else {
                            System.out.println("EVEN");
                        }
                        break;

                    case 2:
                        if (primeTester.testNumber(number)) {
                            System.out.println("PRIME");
                        } else {
                            System.out.println("NO PRIME");
                        }
                        break;

                    case 3:
                        if (palindromeTester.testNumber(number)) {
                            System.out.println("PALINDROME");
                        } else {
                            System.out.println("NO PALINDROME");
                        }
                        break;

                    default:
                        System.out.println("Unavailable test type: " + testType);
                        break;
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        NumberTester tester = new NumberTester("file.txt");

        tester.setOddEvenTester(number -> number % 2 == 0);
        tester.setPrimeTester(number -> {
            if (number <= 1) return false;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) return false;
            }
            return true;
        });
        tester.setPalindromeTester(number -> {
            String str = Integer.toString(number);
            return str.equals(new StringBuilder(str).reverse().toString());
        });

        tester.testFile();
    }
}