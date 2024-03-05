package academy.devdojo.maratonajava.javacore.Hinheritance.exercises.ex004;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Rafhael", "IT");
        manager.work();

        Worker worker = new Worker("Ronald", "Support");
        worker.work();
    }
}
