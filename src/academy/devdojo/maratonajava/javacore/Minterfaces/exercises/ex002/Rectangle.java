package academy.devdojo.maratonajava.javacore.Minterfaces.exercises.ex002;

public class Rectangle implements Shape{
    private double area;
    private double widht;
    private double height;

    public Rectangle(double widht, double height) {
        this.widht = widht;
        this.height = height;
    }

    @Override
    public void getArea() throws IllegalArgumentException{
        try{
            area = widht * height;
            if (widht > height){
                System.out.println(area);

            }
        }catch (IllegalArgumentException e){
            System.out.println("Not a rectangle");
        }

    }
}
