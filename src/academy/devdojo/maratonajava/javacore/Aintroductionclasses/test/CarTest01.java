package academy.devdojo.maratonajava.javacore.Aintroductionclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain.Car;

//Instantiating and printing values
public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Nissan";
        car1.model = "Versa";
        car1.year = 2014;

        car2.name = "Toyota";
        car2.model = "Yaris";
        car2.year = 2022;

        System.out.println(car1.name + " " + car1.model + " " + car1.year);
        System.out.println(car2.name + " " + car2.model + " " + car2.year);
    }
}
