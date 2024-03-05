package academy.devdojo.maratonajava.javacore.Hinheritance.exercises.ex001;

public class Rectangle extends Shape {
    private double widht;
    private double height;

    public Rectangle(String color, double widht, double height) {
        super(color);
        this.widht = widht;
        this.height = height;
    }

    public double getArea(){
        super.area = this.widht * this.height;
        return area;
    }
    public double getPerimeter(){
        super.perimeter = 2 * (this.widht + this.height);
        return perimeter;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
