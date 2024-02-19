package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        // we instantiate an object to call the method
        Calculator calculator = new Calculator();
        //we call the method and the result is displayed on the console
        //the method is called through an object
        calculator.sumTwoNumbers();
        System.out.println("Finalizing CalculatorTest01");
        calculator.subTwoNumbers();
    }

}
