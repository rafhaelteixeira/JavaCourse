package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Nissan");
        car.setModel("Versa");
        car.setYear("2014");

        car.displayInfor();
    }
}
