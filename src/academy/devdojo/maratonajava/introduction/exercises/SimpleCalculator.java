package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

/*Simple CalculatorTest: Write a program that takes two numbers and an operator
(+, -, *, /) as input and performs the corresponding operation.*/
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input number 1: ");
        int num1 = input.nextInt();
        System.out.println("Input an operator");
        char operator = input.next().charAt(0);
        System.out.println("Input number 2: ");
        int num2 = input.nextInt();

        int result = 0;

        if (operator == '+') {
            result = num1 + num2;
            System.out.println(result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println(result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println(result);
        } else if (operator == '/') {
            result = num1 / num2;
            System.out.println(result);
        } else if (operator == '%') {
            result = num1 % num2;
            System.out.println(result);
        } else {
            System.out.println("Invalid Operation");
        }

    }
}
