package academy.devdojo.maratonajava.javacore.Dconstructors.exercises.test;

import academy.devdojo.maratonajava.javacore.Dconstructors.exercises.domain.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Zoro");
        Person person2 = new Person("Luffy", 16);
        Person person3 = new Person("Nami", 16, 'F');

        System.out.println(person1.getName() + " " + person1.getAge() + " " + person1.getGender());
        System.out.println(person2.getName() + " " + person2.getAge() + " " + person2.getGender());
        System.out.println(person3.getName() + " " + person3.getAge() + " " + person3.getGender());

    }
}
