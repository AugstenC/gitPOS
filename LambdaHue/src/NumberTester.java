public class NumberTester {
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;

    public NumberTester(String fileName) {
    }
    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }
    

    public void setPalindromeTester (NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }
    public void testFile() {

    }


    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }
}
