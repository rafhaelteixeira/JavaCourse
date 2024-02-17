package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

//Palindrome Check: Write a program to check if a given number is a palindrome.
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number");
        int number = input.nextInt();
        int temp;
        int palindrome = 0;

        temp = number;
        while (number > 0) {
            int lasDigit = number % 10;
            palindrome = (palindrome * 10) + lasDigit;
            number = number / 10;
        }
        if (temp == palindrome) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }

    }


}

