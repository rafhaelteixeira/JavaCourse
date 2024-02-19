package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

/*Month Name: Write a program that takes a number (1-12) as input and prints out the corresponding month name.
 */
public class MonthName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a month number from 1 to 12: ");
        byte number = input.nextByte();

        switch (number) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
    }
}
