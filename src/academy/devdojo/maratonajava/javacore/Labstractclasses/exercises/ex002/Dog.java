package academy.devdojo.maratonajava.javacore.Labstractclasses.exercises.ex002;

public class Dog extends Animal{

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("Dogs eat meat!");
    }

    @Override
    public void makeSound() {
        System.out.println("Dogs bark!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
