package academy.devdojo.maratonajava.javacore.Hinheritance.exercises.ex001;

public class Triangle extends Shape {
    private double widht;
    private double height;
    private int angle;

    public Triangle(String color, double widht, double heigh, int angle) {
        super(color);
        this.widht = widht;
        this.height = heigh;
        this.angle = angle;
    }

    public double getArea(){
        super.area = (this.widht * this.height) / 2;
        return area;
    }

    public double getPerimeter(){
    super.perimeter = this.widht + (this.height * 2);
    return perimeter;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getHeigh() {
        return height;
    }

    public void setHeigh(double heigh) {
        this.height = heigh;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }
}
