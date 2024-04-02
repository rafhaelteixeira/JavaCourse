package academy.devdojo.maratonajava.javacore.Labstractclasses.exercises.ex002;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Neide", 10);
        System.out.println(dog.getName() + " is a dog");
        dog.eat();
        dog.makeSound();

        System.out.println("--------------------------------");

        Cat cat = new Cat("Shvalteesh", 2);
        System.out.println(cat.getName() + " is a cat");
        cat.eat();
        cat.makeSound();
    }
}
