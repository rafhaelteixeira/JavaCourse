package academy.devdojo.maratonajava.javacore.Minterfaces.exercises.ex001;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        // Simulate starting and stopping vehicles
        car.start();
        car.stop();

        System.out.println("-------------------");

        motorcycle.start();
        motorcycle.stop();
    }
}
