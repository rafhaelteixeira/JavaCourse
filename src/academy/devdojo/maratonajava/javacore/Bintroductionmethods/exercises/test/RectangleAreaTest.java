package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain.RectangleArea;

import java.util.Scanner;

public class RectangleAreaTest {
    public static void main(String[] args) {
        RectangleArea rectangle = new RectangleArea();
        Scanner input = new Scanner(System.in);

        System.out.println("Type the lenght of the rectangle: ");
        double lenght = input.nextDouble();
        rectangle.setLenght(lenght);

        System.out.println("Type the width of the rectangle: ");
        double width = input.nextDouble();
        rectangle.setWidth(width);

        System.out.println("The rectangle area is: ");
        System.out.println(rectangle.calculateArea());


    }
}
