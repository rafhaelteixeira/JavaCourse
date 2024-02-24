package academy.devdojo.maratonajava.javacore.Dconstructors.exercises.domain;

/*Create a class representing a person with attributes such as name, age, and gender.
Implement different constructors to initialize objects with different combinations of these attributes.*/
public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public Person(String name, int age, char gender) {
        this(name, age);
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
