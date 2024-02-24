package academy.devdojo.maratonajava.javacore.Dconstructors.exercises.test;

import academy.devdojo.maratonajava.javacore.Dconstructors.exercises.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Honda", "Civic");
        Car car1 = new Car("Nissan", "Versa", "2014");
        Car car2 = new Car("Toyota", "Yaris", "2019", "Metalic Blue");

        System.out.println(car.getMake() + " " + car.getModel());
        System.out.println(car1.getMake() + " " + car1.getModel() + " " + car1.getYear());
        System.out.println(car2.getMake() + " " + car2.getModel() + " " + car2.getYear() + " " + car2.getColor());



    }
}
