package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        //in order to execute the method, we must provide two int arguments
        //in that case, provided the 10 and 20, the method will multiply both
        calculator.multiTwoNumbers(10, 20);

    }
}
