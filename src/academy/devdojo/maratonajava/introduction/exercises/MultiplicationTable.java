package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

/*Multiplication Table: Write a program that prints 
the multiplication table of a given number using a loop.*/
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number from 1 to 100");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
}
