public class Main {
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

        RationalCalc calculator = new RationalCalc(
                (x, y) -> new Number(x.getA() + y.getA(), x.getB() + y.getB()),
                (x, y) -> new Number(x.getA() - y.getA(), x.getB() - y.getB()),
                (x, y) -> new Number(x.getA() * y.getA(), x.getB() * y.getB()),
                (x, y) -> new Number(x.getA() / y.getA(), x.getB() / y.getB())
        );

        Number result = calculator.add(new Number(1, 2), new Number(3, 4));
        System.out.println("result: a = " + result.getA() + ", b = " + result.getB());
    }
}
