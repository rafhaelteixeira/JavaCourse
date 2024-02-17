package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Random;
import java.util.Scanner;

//Generate Random Numbers: Write a program to generate a sequence of random numbers within a specified range.
public class RandomNumbersGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 1;

        System.out.println("Type the range: ");
        int max = input.nextInt();

        System.out.println("Type the quantity of numbers: ");
        int quantity = input.nextInt();

        Random rand = new Random();

        System.out.println("Generate random numbers: ");

        for (int i = 0; i <= quantity; i++) {
            int randomNumbers = rand.nextInt(max - min + 1) + min;
            System.out.println(randomNumbers);
        }
    }
}
