package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

//Check if a given number is prime or not.
public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number, i'll check if it's a prime number: ");
        int number = input.nextInt();

        boolean isPrime = true;

        if (number < 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}
