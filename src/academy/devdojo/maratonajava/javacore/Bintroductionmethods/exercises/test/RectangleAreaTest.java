package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain.RectangleArea;

import java.util.Scanner;

public class RectangleAreaTest {
    public static void main(String[] args) {
        RectangleArea rectangle = new RectangleArea();
        Scanner input = new Scanner(System.in);

        System.out.println("Type the lenght of the rectangle: ");
        rectangle.lenght = input.nextInt();
        System.out.println("Type the width of the rectangle: ");
        rectangle.width = input.nextInt();

        System.out.println("The rectangle area is: ");
        rectangle.calculateArea();


    }
}
