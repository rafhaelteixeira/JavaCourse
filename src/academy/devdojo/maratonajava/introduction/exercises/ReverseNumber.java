package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

//Reverse and print a given number.
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number");
        int number = input.nextInt();
        int reverse = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}
