package academy.devdojo.maratonajava.javacore.Jfinalmodifier.exercises.ex002;
/*Create a class called Circle with the following specifications:
Declare private fields radius and pi.
Use the final keyword to make pi immutable. Set its value to 3.14.
Provide a constructor to initialize the radius.
Do not provide any setter methods to modify the state of the object after it is created.
Provide a method named calculateArea() that calculates and returns the area of the circle using the formula: area = pi * radius^2.
Provide a method named calculateCircumference() that calculates and returns the circumference of the circle using the formula: circumference = 2 * pi * radius.
Once you've implemented the Circle class, create instances of Circle and demonstrate that the state of the objects cannot be modified after creation.*/
public class Circle {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return this.PI * (Math.pow(this.radius, 2));
    }

    public double calculateCircumference(){
        return 2 * (this.PI * this.radius);
    }
}
