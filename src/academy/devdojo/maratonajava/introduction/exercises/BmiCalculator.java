package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

/*BMI CalculatorTest: Write a program that calculates Body Mass Index (BMI)
based on user input of weight and height, and categorizes it as underweight, normal, overweight, or obese.*/
public class BmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your body weight in Kg: ");
        double bodyWeight = input.nextDouble();
        System.out.println("Input your height in meters: ");
        double bodyHeight = input.nextDouble();

        double bmi = bodyWeight / Math.pow(bodyHeight, 2);

        if (bmi < 18.5) {
            System.out.println("Bellow ideal weight");
        } else if (bmi >= 18.6 && bmi <= 24.9) {
            System.out.println("Ideal Weight");
        } else if (bmi > 24.9 && bmi <= 29.99) {
            System.out.println("Overweight");
        } else if (bmi >= 30 && bmi <= 34.9) {
            System.out.println("Obesity I");
        } else if (bmi >= 35 && bmi <= 39.9) {
            System.out.println("Obesity II");
        } else {
            System.out.println("Obesity III");
        }
    }
}
//ChatGPT approach to the problem
/*import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi < 25) {
            System.out.println("You have a normal weight.");
        } else if (bmi < 30) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}*/
