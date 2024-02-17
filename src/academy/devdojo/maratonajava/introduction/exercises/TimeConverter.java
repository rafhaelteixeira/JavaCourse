package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

/*Time Converter: Write a program that converts time from hours and minutes
to total minutes, or vice versa, based on user input.*/
public class TimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose option 1 to convert hours to minutes or 2 to convert minutes to hours");
        byte choice = input.nextByte();
        double hours = 0;
        double minutes = 0;
        double hoursToMinutes;
        double minutesToHours;

        if (choice == 1) {
            System.out.println("Type the hours you wish to convert");
            hours = input.nextDouble();
            hoursToMinutes = hours * 60;
            System.out.println(hoursToMinutes + " Minutes");
        } else if (choice == 2) {
            System.out.println("Type the minutes you wish to convert");
            minutes = input.nextDouble();
            minutesToHours = minutes / 60;
            System.out.println(minutesToHours + " Minutes");
        } else {
            System.out.println("Invalid Option");
        }
    }
}

/*ChatGPT approach
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose conversion:");
        System.out.println("1. Hours and minutes to total minutes");
        System.out.println("2. Total minutes to hours and minutes");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter hours: ");
            int hours = scanner.nextInt();
            System.out.print("Enter minutes: ");
            int minutes = scanner.nextInt();
            int totalMinutes = hours * 60 + minutes;
            System.out.println("Total minutes: " + totalMinutes);
        } else if (choice == 2) {
            System.out.print("Enter total minutes: ");
            int totalMinutes = scanner.nextInt();
            int hours = totalMinutes / 60;
            int remainingMinutes = totalMinutes % 60;
            System.out.println("Hours: " + hours + ", Minutes: " + remainingMinutes);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}*/
