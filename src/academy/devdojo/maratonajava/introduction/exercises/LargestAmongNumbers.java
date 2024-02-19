package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

/*Largest among Two Numbers: Write a program to find the
largest among two numbers entered by the user.*/
public class LargestAmongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input number 1: ");
        double num1 = input.nextDouble();
        System.out.println("Input number : ");
        double num2 = input.nextDouble();

        if (num1 > num2) {
            System.out.println("Number 1 is the largest");
        } else if (num2 > num1) {
            System.out.println("Number 2 is the largest");
        } else {
            System.out.println("The numbers are equal");
        }
    }
}
