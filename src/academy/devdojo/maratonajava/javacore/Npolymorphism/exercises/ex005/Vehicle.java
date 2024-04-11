package academy.devdojo.maratonajava.javacore.Npolymorphism.exercises.ex005;

public abstract class Vehicle {

    protected String name;
    protected int capacity;
    protected int speed;
    protected int number;

    public Vehicle(String name, int capacity, int speed) {
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;

    }

    public abstract void travel();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
