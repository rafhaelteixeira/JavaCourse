package academy.devdojo.maratonajava.javacore.Npolymorphism.exercises.ex002;

public abstract class Vehicle {

    protected String name;
    protected double incialSpeed;



    public Vehicle(String name, double incialSpeed) {
        this.name = name;
        this.incialSpeed = incialSpeed;

    }

    public abstract void speedUp(Vehicle vehicle);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncialSpeed() {
        return incialSpeed;
    }

    public void setIncialSpeed(double incialSpeed) {
        this.incialSpeed = incialSpeed;
    }

}


