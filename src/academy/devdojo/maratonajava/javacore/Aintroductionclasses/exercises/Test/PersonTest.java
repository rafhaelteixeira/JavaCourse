package academy.devdojo.maratonajava.javacore.Aintroductionclasses.exercises.Test;

import academy.devdojo.maratonajava.javacore.Aintroductionclasses.exercises.Domain.Person;

//Person Class: Create a Person class with attributes such as name, age, and gender. Then create objects of this class to represent different people.
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.name = "Rafhael"; person1.age = 27; person1.gender = 'M';
        person2.name = "Matheus"; person2.age = 29; person2.gender = 'M';
        person3.name = "Lukas"; person3.age = 24; person3.gender = 'M';
        person4.name = "Vania"; person4.age = 51; person4.gender = 'F';
        person5.name = "Juarez"; person5.age = 64; person5.gender = 'M';

        System.out.print(person1.name + " " + person1.age + " " + person1.gender + "\n");
        System.out.print(person2.name + " " + person2.age + " " + person2.gender + "\n");
        System.out.print(person3.name + " " + person3.age + " " + person3.gender + "\n");
        System.out.print(person4.name + " " + person4.age + " " + person4.gender + "\n");
        System.out.print(person5.name + " " + person5.age + " " + person5.gender);
    }

}
