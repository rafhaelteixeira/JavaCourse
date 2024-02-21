package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain;

/*Implement a Car class with attributes brand, model, and year.
Include a method to display the details of the car.*/
public class Car {
    private String model;
    private String year;
    private String brand;

    public void displayInfor() {

        System.out.println(this.brand + " " + this.model + " " + this.year);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
