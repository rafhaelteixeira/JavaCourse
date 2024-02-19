package academy.devdojo.maratonajava.javacore.Aintroductionclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain.Car;

//Instantiating and printing values
public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.brand = "Nissan";
        car1.name = "Versa";
        car1.model = "SL - 1.6 - MT";
        car1.year = 2014;

        car2.brand = "Toyota";
        car2.name = "Yaris";
        car2.model = "XLS - 1.5 - CVT";
        car2.year = 2022;

        //car1 = car2;
        //if we write the code above, both objects would have the same value
        //we wouldn't have a way to retrieve car1's data, it would be collected by the garbage collector
        //we can only do that with same type objs. we'll check that again on polymorphism module

        System.out.println(car1.brand + " " + car1.name + " " + car1.model + " " + car1.year);
        System.out.println(car2.brand + " " + car2.name + " " + car2.model + " " + car2.year);
    }
}
