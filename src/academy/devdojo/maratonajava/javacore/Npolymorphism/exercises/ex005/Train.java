package academy.devdojo.maratonajava.javacore.Npolymorphism.exercises.ex005;

public class Train extends Vehicle{

    public Train(String name, int capacity, int speed) {
        super(name, capacity, speed);
    }

    @Override
    public void travel() {
        System.out.println("Trains travel on railroads");
    }
}
