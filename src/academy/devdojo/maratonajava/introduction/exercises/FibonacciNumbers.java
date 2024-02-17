package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

//Generate and print the Fibonacci sequence up to a given limit.
public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the limit
        System.out.print("Enter the limit for Fibonacci sequence: ");
        int limit = scanner.nextInt();

        // Initialize the first two numbers in the sequence
        int first = 1, second = 1;

        // Print the first two numbers
        System.out.print("Fibonacci sequence up to " + limit + " terms: ");

        // Generate subsequent numbers in the sequence and print them
        for (int i = 0; i < limit; ++i) {
            System.out.println(first);
            int next = first + second;
            first = second;
            second = next;

        }


    }
}
