package academy.devdojo.maratonajava.javacore.Labstractclasses.exercises.ex001;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(20);
        circle.calculateArea();
        System.out.println(circle.getArea());

        Rectangle rectangle = new Rectangle(4,2);
        rectangle.calculateArea();
        System.out.println(rectangle.getArea());
    }
}
