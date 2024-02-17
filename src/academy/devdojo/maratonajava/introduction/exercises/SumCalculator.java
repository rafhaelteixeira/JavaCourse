package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

//Calculate and print the sum of digits of a given number.
public class SumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number");
        int number = input.nextInt();

        int sum = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;

        }
        System.out.println(sum);
    }
}
