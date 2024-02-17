package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.chooseOperation();
        calculator.typeNumbers();


        if (calculator.operation == 1) {
            calculator.addition();
        } else if (calculator.operation == 2) {
            calculator.subtraction();
        } else if (calculator.operation == 3) {
            calculator.multiplication();
        } else if (calculator.operation == 4) {
            calculator.division();
        }
    }
}
