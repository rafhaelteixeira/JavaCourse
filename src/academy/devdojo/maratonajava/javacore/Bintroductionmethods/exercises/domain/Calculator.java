package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain;

import java.util.Scanner;

/*Design a Calculator class with methods for basic arithmetic operations
(addition, subtraction, multiplication, division).*/
public class Calculator {
    public double number1;
    public double number2;
    public byte operation;
    public double result;
    Scanner input = new Scanner(System.in);

    public void chooseOperation() {
        System.out.println("Choose the Operation: ");
        System.out.println("1 - Addition, 2 - Subtraction, 3 - Multiply, 4 - Divide");
        operation = input.nextByte();

        while (operation >= 5) {
            System.out.println("Invalid Option, try again");
            operation = input.nextByte();

            if (operation <= 4) {
                break;
            }
        }
    }

    public void typeNumbers() {
        System.out.println("Type the numbers: ");
        number1 = input.nextDouble();
        switch (operation) {
            case 1:
                System.out.println(" + ");
                break;
            case 2:
                System.out.println(" - ");
                break;
            case 3:
                System.out.println(" * ");
                break;
            case 4:
                System.out.println(" / ");
                break;
        }
        number2 = input.nextDouble();
    }

    public void addition() {
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
    }

    public void subtraction() {
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
    }

    public void multiplication() {
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
    }

    public void division() {
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
    }
}
