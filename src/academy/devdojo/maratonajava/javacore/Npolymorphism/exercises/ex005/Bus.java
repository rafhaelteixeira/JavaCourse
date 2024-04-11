package academy.devdojo.maratonajava.javacore.Npolymorphism.exercises.ex005;

public class Bus extends Vehicle{

    public Bus(String name, int capacity, int speed) {
        super(name, capacity, speed);
    }

    @Override
    public void travel() {
        System.out.println("Busses takes passangers and travel on roads");
    }
}
