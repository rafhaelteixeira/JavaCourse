package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

//Given the values of 1 to 7, print wether is a business day or weekend - consider 1 as sunday
public class BusinessDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a day of the week, use 1 as sunday: ");
        byte day = input.nextByte();

        switch (day) {
            case 1:
                System.out.println("Sunday - Weekend");
                break;
            case 2:
                System.out.println("Monday - Business");
                break;
            case 3:
                System.out.println("Tuesday - Business");
                break;
            case 4:
                System.out.println("Wednesday - Business");
                break;
            case 5:
                System.out.println("Thursday - Business");
                break;
            case 6:
                System.out.println("Friday - Business");
                break;
            case 7:
                System.out.println("Saturday - Weekend");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
