package academy.devdojo.maratonajava.javacore.Fstaticmodifiers.test;

import academy.devdojo.maratonajava.javacore.Fstaticmodifiers.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        //by changing the limit speed, we alter this attribute for all objects instantiated by the Car class
        Car.setLimitSpeed(180);

        Car c1 = new Car("BMW", 280);
        Car c2 = new Car("Mercedes", 275);
        Car c3 = new Car("Audi", 290);

        c1.print();
        c2.print();
        c3.print();
    }
}
