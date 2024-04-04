package academy.devdojo.maratonajava.javacore.Minterfaces.exercises.ex002;

public class Circle implements Shape{
    private final double PI = 3.14;
    private double area;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        area = PI * (Math.pow(radius,2));
        System.out.println(area);

    }


}
