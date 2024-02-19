package academy.devdojo.maratonajava.javacore.Aintroductionclasses.exercises.Test;
/*Shape Class Hierarchy: Design a hierarchy of classes representing different shapes (e.g., Circle, Square, Triangle).
Each class should have attributes such as color, dimensions, etc. Create objects of these classes to represent various shapes.*/
import academy.devdojo.maratonajava.javacore.Aintroductionclasses.exercises.Domain.Circle;
import academy.devdojo.maratonajava.javacore.Aintroductionclasses.exercises.Domain.Square;
import academy.devdojo.maratonajava.javacore.Aintroductionclasses.exercises.Domain.Triangle;

public class ShapesTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        circle.color = "Blue"; circle.radius = 30; circle.diameter = 60;
        square.color = "Red"; square.height = 10; square.widht = 10;
        triangle.color = "Green"; triangle.widht = 50; triangle.height = 30; triangle.angle = 90;

        System.out.printf("The circle is: " + circle.color + " " + circle.radius + "cm " + circle.diameter + "cm\n");
        System.out.printf("The square is: " + square.color + " " + square.height + "cm " + square.widht + "cm\n");
        System.out.printf("The triangle is: " + triangle.color + " " + triangle.widht + "cm " + triangle.height + "cm " + triangle.angle + "º");
    }
}
