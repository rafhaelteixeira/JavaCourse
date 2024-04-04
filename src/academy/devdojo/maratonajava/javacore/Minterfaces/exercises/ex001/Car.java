package academy.devdojo.maratonajava.javacore.Minterfaces.exercises.ex001;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car Started");
    }

    @Override
    public void stop() {
        System.out.println( "Car Stopped");
    }
}
