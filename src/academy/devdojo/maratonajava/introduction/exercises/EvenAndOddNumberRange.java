package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

/*Even or Odd Number Range: Write a program that prints all
even or odd numbers in a given range specified by the user.*/
public class EvenAndOddNumberRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a Starting Number: ");
        int start = input.nextInt();
        System.out.println("Input an Ending Number: ");
        int end = input.nextInt();
        System.out.println("Input 'e' for even numbers and 'o' for odd numbers: ");
        char choice = input.next().charAt(0);

        if (choice == 'e') {
            System.out.println("Even numbers from " + start + " to " + end);
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " ");
                }
            }
        } else if (choice == 'o') {
            System.out.println("Odd numbers from " + start + " to " + end);
            for (int i = start; i < end; i++) {
                if (i % 2 != 0) {
                    System.out.println(i + " ");
                }
            }
        } else {
            System.out.println("Ivalid Character");
        }
    }
}
