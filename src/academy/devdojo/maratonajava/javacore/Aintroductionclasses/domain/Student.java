package academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain;

//A class is a blueprint to create objects
//they can contain attributes (Characteristics) and behaviors (Methods)
public class Student {
    //we are creating a class named Student and assigning 3 attributes to it.
//we can utilize the main method in package test to instantiate the object and
//initialize the attributes.
    public String name = "Zoro";
    //bear in mind that if we initialize the variable inside the class
    //this value will be valid for all the objects instantiated by that class
    //unless we initialize a different value in the object itself
    public int age;
    public char gender;
    //we can initialize the attributes inside the class, but
    //all objects instantiated through the class will have the same attributes

}
