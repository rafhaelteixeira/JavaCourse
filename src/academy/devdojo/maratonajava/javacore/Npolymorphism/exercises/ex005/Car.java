package academy.devdojo.maratonajava.javacore.Npolymorphism.exercises.ex005;

public class Car extends Vehicle{

    public Car(String name, int capacity, int speed) {
        super(name, capacity, speed);
    }

    @Override
    public void travel() {
        System.out.println("Cars travel on roads");
    }
}
