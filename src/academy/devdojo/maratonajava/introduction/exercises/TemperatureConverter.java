package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

/*Temperature Converter: Write a program that converts temperature
from Celsius to Fahrenheit and vice versa, based on user input.*/
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the value to be converted: ");
        double temperature = input.nextDouble();
        System.out.println("Input the temperature system, use 1 for celsius and 2 to fahrenheit: ");
        int temperatureSystem = input.nextInt();

        if (temperatureSystem == 1) {
            temperature = (temperature * 1.8) + 32;
            System.out.println(temperature + "°F");

        } else if (temperatureSystem == 2) {
            temperature = (temperature - 32) / 1.8;
            System.out.println(temperature + "°C");
        }//Code works like it should but the usability is a little off, bellow the chatGPT version
    }   //does a better job on the usability, i'll keep on working
}
/*Chat GPT code
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}*/
