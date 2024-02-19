package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

//Calculate and print the factorial of a given number.
public class FatorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number");
        double number = input.nextDouble();

        double factorial = 1;

        for (double i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
