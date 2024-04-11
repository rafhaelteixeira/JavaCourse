package academy.devdojo.maratonajava.javacore.Npolymorphism.exercises.ex002;

public class Bike extends Vehicle{
    private final double FINAL_SPEED = 50;
    public Bike(String name, double incialSpeed) {
        super(name, incialSpeed);
    }

    @Override
    public void speedUp(Vehicle vehicle) {
        while(incialSpeed < FINAL_SPEED){
            System.out.println("Bike Speeding up: " + incialSpeed);
            incialSpeed += 10;
        }


    }
}
