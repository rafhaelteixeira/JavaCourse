package academy.devdojo.maratonajava.javacore.Npolymorphism.exercises.ex002;

public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Bike("Caloi", 20);
        bike.speedUp(bike);

        System.out.println("-------------------------------");

        Vehicle car = new Car("Porsche", 0);
        car.speedUp(car);


    }
}
