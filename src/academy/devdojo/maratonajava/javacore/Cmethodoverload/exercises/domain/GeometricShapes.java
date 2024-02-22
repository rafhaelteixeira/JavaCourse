package academy.devdojo.maratonajava.javacore.Cmethodoverload.exercises.domain;
/*Create a class representing geometric shapes (e.g., Circle, Rectangle, Triangle).
 Overload methods for calculating the area of each shape based on different parameters
 (e.g., radius for Circle, width and height for Rectangle).*/
public class GeometricShapes {
    private String name;
    private double area;

    public void calculateArea(String name, double radius, double pi) {
        this.name = name;
        area = pi * (Math.pow(radius, 2.0));
        System.out.println(area);
    }

    public void calculateArea(String name,int width, int height) {
        this.name = name;
        area = width * height;
        System.out.println(area);
    }

    public void calculateArea(String name,double base, int height) {
        this.name = name;
        area = (base * height) / 2;
        System.out.println(area);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
