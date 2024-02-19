package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

/*Divisibility Checker: Write a program that checks if a given number is
divisible by both 3 and 5, only by 3, only by 5, or not divisible by either.*/
public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Divisible by 3 and 5");
        } else if (number % 3 == 0 && number % 5 != 0) {
            System.out.println("Divisible only by 3");
        } else if (number % 3 != 0 && number % 5 == 0) {
            System.out.println("Divisible only by 5");
        } else {
            System.out.println("Not divisible by either");
        }
    }
}

/* ChatGPT approach
import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean divisibleBy3 = num % 3 == 0;
        boolean divisibleBy5 = num % 5 == 0;

        if (divisibleBy3 && divisibleBy5) {
            System.out.println(num + " is divisible by both 3 and 5.");
        } else if (divisibleBy3) {
            System.out.println(num + " is divisible by 3 only.");
        } else if (divisibleBy5) {
            System.out.println(num + " is divisible by 5 only.");
        } else {
            System.out.println(num + " is not divisible by either 3 or 5.");
        }
    }
}*/
