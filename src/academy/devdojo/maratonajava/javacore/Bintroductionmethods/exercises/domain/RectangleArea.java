package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain;

/*Implement a Rectangle class with attributes length and width.
Include a method to calculate and return the area of the rectangle.*/
public class RectangleArea {

    public int lenght;
    public int width;

    public void calculateArea() {
        int area = (lenght * width);
        System.out.println(area);

    }
}
