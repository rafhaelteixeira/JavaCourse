package academy.devdojo.maratonajava.javacore.Hinheritance.exercises.ex001;
/*Create a superclass called Shape with attributes such as color and methods like getArea() and getPerimeter().
 Then create subclasses like Circle, Rectangle, and Triangle that inherit from Shape and implement
 their specific area and perimeter calculations.*/
public class Shape {
    protected String color;
    protected double area;
    protected double perimeter;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
