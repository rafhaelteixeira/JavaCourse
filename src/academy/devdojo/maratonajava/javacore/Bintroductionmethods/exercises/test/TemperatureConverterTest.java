package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain.TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the temperature converter!");
        System.out.println("Type 1 to convert Celsius to Fahrenheit or 2 to convert Fahrenheit to Celsius: ");
        byte choice = input.nextByte();

        if (choice == 1) {
            System.out.println("Now Type the value desired: ");
            double value = input.nextDouble();
            System.out.println(value + "°C is: " + converter.celsiusToFah(value) + "°F");
        } else if (choice == 2) {
            System.out.println("Now Type the value desired: ");
            double value = input.nextDouble();
            System.out.println(value + "°F is: " + converter.fahToCelsius(value) + "°C ");
        } else {
            System.out.println("Invalid Option");
        }
    }
}
