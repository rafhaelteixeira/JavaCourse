package academy.devdojo.maratonajava.javacore.Labstractclasses.exercises.ex002;

public class Cat extends Animal{

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("Cats eat fish!");
    }

    @Override
    public void makeSound() {
        System.out.println("Cats Meow!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
