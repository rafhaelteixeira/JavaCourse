package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain;

/*Implement a Car class with attributes brand, model, and year.
Include a method to display the details of the car.*/
public class Car {
    public String model;
    public String year;
    public String brand;

    public void displayInfor() {
        System.out.println(this.brand + " " + this.model + " " + this.year);
    }
}
