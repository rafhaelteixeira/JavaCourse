package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain;

//Implement a TemperatureConverter class with methods to convert Celsius to Fahrenheit and vice versa.
public class TemperatureConverter {

    public double celsiusToFah(double numC) {
        return numC * 1.8 + 32;
    }

    public double fahToCelsius(double numF) {
        return (numF - 32) / 1.8;

    }
}
