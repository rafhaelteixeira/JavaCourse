package academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain;

//In order to guarantee the cohesion, each class must have a purpose
//for example, we could add Professor attributes inside the Student class
//but that would break the cohesion and make maintenance more difficult
public class Professor {
    public String name;
    public int age;
    public char gender;
    //by creating a new class we are separating the classes based on their own purposes
    //and separating attributes and methods, so the program become highly cohesive.
    //by adding test classes to contain de main method we are also augmenting cohesion
}
