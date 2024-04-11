package academy.devdojo.maratonajava.javacore.Npolymorphism.exercises.ex001;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.sound(animal);

        Animal animal1 = new Bird();
        animal1.sound(animal1);
    }
}
