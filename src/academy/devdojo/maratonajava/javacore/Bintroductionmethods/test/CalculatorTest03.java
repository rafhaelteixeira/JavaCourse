package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.divideTwoNumbers(20, 2);
        System.out.println(result);

        System.out.println(calculator.divideTwoNumbers2(20, 2));
        System.out.println("============================================");

        calculator.printDivision(86, 5);
    }
}
