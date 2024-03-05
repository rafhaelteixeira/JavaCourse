package academy.devdojo.maratonajava.javacore.Hinheritance.exercises.ex001;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        System.out.println("Circle -------------------------");
        System.out.println(circle.getColor());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println("-------------------------------------------");

        Rectangle rectangle = new Rectangle("Blue", 10, 10);
        System.out.println("Rectangle ---------------------------------");
        System.out.println(rectangle.getColor());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println("---------------------------------------------------");

        Triangle triangle = new Triangle("Purple", 10,10,90);
        System.out.println("Triangle ----------------------------------");
        System.out.println(triangle.getColor());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
