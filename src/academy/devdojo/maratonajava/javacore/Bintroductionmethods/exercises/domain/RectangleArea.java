package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain;

/*Implement a Rectangle class with attributes length and width.
Include a method to calculate and return the area of the rectangle.*/
public class RectangleArea {

    private double lenght;
    private double width;

    public double calculateArea() {
        return (this.lenght * this.width);
    }
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public void setWidth(double width) {
        this.width = width;
    }
}
