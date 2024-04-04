package academy.devdojo.maratonajava.javacore.Minterfaces.exercises.ex002;

public class Triangle implements Shape {
    private double area;
    private double widht;
    private double height;

    public Triangle(double widht, double height) {
        this.widht = widht;
        this.height = height;
    }

    @Override
    public void getArea() throws IllegalArgumentException {
        try {
            if (widht >0 && height >0) {
                area = (widht * height) / 2;
                System.out.println(area);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Not a triangle");
        }
    }
}
