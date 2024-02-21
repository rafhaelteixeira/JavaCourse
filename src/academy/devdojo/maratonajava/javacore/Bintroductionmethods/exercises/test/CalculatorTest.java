package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain.Calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        double number1;
        double number2;

        System.out.println("Choose the Operation: ");
        System.out.println("1 - Addition, 2 - Subtraction, 3 - Multiply, 4 - Divide");
        byte operation = input.nextByte();

        while (operation >= 5) {
            System.out.println("Invalid Option, try again");
            operation = input.nextByte();
            if (operation <= 4) {
                break;
            }
        }

        System.out.println("Type the numbers: ");
        switch (operation) {
            case 1:
                number1 = input.nextDouble();
                calculator.setNumber1();
                System.out.println(" + ");
                number2 = input.nextDouble();
                calculator.setNumber2();
                calculator.addition(number1, number2);
                break;
            case 2:
                number1 = input.nextDouble();
                calculator.setNumber1();
                System.out.println(" - ");
                number2 = input.nextDouble();
                calculator.setNumber2();
                calculator.subtraction(number1, number2);
                break;
            case 3:
                number1 = input.nextDouble();
                calculator.setNumber1();
                System.out.println(" * ");
                number2 = input.nextDouble();
                calculator.setNumber2();
                calculator.multiplication(number1, number2);
                break;
            case 4:
                number1 = input.nextDouble();
                calculator.setNumber1();
                System.out.println(" / ");
                number2 = input.nextDouble();
                calculator.setNumber2();
                calculator.division(number1, number2);
                break;
        }


    }
}
