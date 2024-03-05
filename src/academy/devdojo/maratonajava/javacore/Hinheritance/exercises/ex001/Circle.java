package academy.devdojo.maratonajava.javacore.Hinheritance.exercises.ex001;

public class Circle extends Shape {
    private double radius;
    private double diameter;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getPerimeter() {
        super.perimeter = this.diameter * 3.14;
        return perimeter;
    }

    public double getArea() {
        super.area = 3.14 * Math.pow(radius, 2);
        return area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        this.diameter = this.radius * 2;
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
