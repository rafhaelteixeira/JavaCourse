package academy.devdojo.maratonajava.javacore.Minterfaces.exercises.ex002;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.getArea();

        System.out.println("---------------------");

        Rectangle rectangle = new Rectangle(5, 2);
        rectangle.getArea();

        System.out.println("------------------------");

        Triangle triangle = new Triangle(2,2);
        triangle.getArea();
    }
}
