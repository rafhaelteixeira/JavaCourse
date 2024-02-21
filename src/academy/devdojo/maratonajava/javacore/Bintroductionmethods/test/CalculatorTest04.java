package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 2;
        //even though we initialized two variables at this class, the values initialized inside the method
        //will be the same, and won't change
        calculator.alterTwoNumbers(a, b);

        System.out.println("Inside CalculatorTest04");
        System.out.println("Num1 " + a);
        System.out.println("Num2 " + b);

    }
}
