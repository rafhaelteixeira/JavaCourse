package academy.devdojo.maratonajava.javacore.Minterfaces.exercises.ex001;

public class Motorcycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle Stopped");

    }
}
