package academy.devdojo.maratonajava.javacore.Labstractclasses.exercises.ex001;

public class Circle extends Shape {

    private final double PI = 3.14;
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        this.area = this.PI * (Math.pow(this.radius, 2 ));
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }
}
