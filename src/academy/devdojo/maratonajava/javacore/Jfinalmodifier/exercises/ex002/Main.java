package academy.devdojo.maratonajava.javacore.Jfinalmodifier.exercises.ex002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a radius: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("The Area is: " + circle.calculateArea());
        System.out.println("The Circumference is: " + circle.calculateCircumference());
    }
}
