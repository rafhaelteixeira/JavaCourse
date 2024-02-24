package academy.devdojo.maratonajava.javacore.Dconstructors.exercises.domain;
/*Design a class representing a car with attributes such as make, model, year, and color.
Implement constructors to initialize objects with different combinations of these attributes.
 */
public class Car {
    private String make;
    private String model;
    private String year;
    private String color;

    public Car(String make, String model, String year,String color){
        this(make, model, year);
        this.color = color;
    }

    public Car(String make, String model, String year){
        this(make, model);
        this.year = year;
    }
    public Car(String make, String model){
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
}
