package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1 = 1;
        int num2 = 2;

        calculator.alterTwoNumbers(num1, num2);

        System.out.println("Inside CalculatorTest04");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);

    }
}
