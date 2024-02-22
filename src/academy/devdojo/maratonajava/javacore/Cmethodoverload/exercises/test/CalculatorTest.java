package academy.devdojo.maratonajava.javacore.Cmethodoverload.exercises.test;

import academy.devdojo.maratonajava.javacore.Cmethodoverload.exercises.domain.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator operation1 = new Calculator();
        operation1.setOperationName("Addition");
        System.out.println(operation1.getOperationName());
        operation1.calculateResult(operation1.getOperationName(), 10, 20);

        Calculator operation2 = new Calculator();
        operation2.setOperationName("Subtraction");
        System.out.println(operation2.getOperationName());
        operation2.calculateResult(10.0, 5.0);

        Calculator operation3 = new Calculator();
        operation3.setOperationName("Multiplication");
        System.out.println(operation3.getOperationName());
        operation3.calculateResult(operation3.getOperationName(), 10.0, 20.0);

        Calculator operation4 = new Calculator();
        operation4.setOperationName("Division");
        System.out.println(operation4.getOperationName());
        operation4.calculateResult(operation4.getOperationName(), 10.0, 2);

    }
}
