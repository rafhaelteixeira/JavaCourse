package academy.devdojo.maratonajava.javacore.Npolymorphism.exercises.ex002;

public class Car extends Vehicle{
    private final double FINAL_SPEED = 120;
    public Car(String name, double incialSpeed) {
        super(name, incialSpeed);
    }

    @Override
    public void speedUp(Vehicle vehicle) {
        while(incialSpeed < FINAL_SPEED){
            System.out.println("Car Speeding up: " + incialSpeed);
            incialSpeed += 20;
        }
}
}
