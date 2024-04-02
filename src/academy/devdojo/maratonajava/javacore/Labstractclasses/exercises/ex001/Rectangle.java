package academy.devdojo.maratonajava.javacore.Labstractclasses.exercises.ex001;

public class Rectangle extends Shape{

    private int width;
    private int height;
    private int area;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        if (this.width == this.height){
            System.out.println("Not a rectangle");
        }else{
            this.area = this.width * this.height;
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getArea() {
        return area;
    }
}
