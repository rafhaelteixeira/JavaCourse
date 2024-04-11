package academy.devdojo.maratonajava.javacore.Npolymorphism.exercises.ex001;

public class Cat extends Animal{
    @Override
    public void sound(Animal animal) {
        System.out.println("Meow...!");
    }
}
