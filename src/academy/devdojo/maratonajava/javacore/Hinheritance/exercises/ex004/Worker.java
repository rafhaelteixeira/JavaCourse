package academy.devdojo.maratonajava.javacore.Hinheritance.exercises.ex004;

public class Worker extends Employee{
    private String name;
    private String position;

    public Worker(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void work(){
        System.out.println("Worker " + this.name + " Is performing " + this.position + " Task.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
