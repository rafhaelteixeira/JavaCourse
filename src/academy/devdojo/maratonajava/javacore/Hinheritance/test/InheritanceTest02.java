package academy.devdojo.maratonajava.javacore.Hinheritance.test;

import academy.devdojo.maratonajava.javacore.Hinheritance.domain.Employee;

public class InheritanceTest02 {
    //0 - Super class' Static Initializer block is executed when the JVM load the parent class
    //1- Child class' Static Initializer block is executed when the JVM load the child class
    //2 - memory space allocated for the object from the parent class
    //3 - each class attribute is created and initialized with default values, or what is passed from parent class
    //4 - Parent class initialization block is executed in the order of appearance
    //5 - Parent class Constructor is executed
    //6 - memory space allocated for the object from the child class
    //7- each class attribute is created and initialized with default values, or what is passed from child class
    //8 - Child class initialization block is executed in the order of appearance
    //9 - Child class Constructor is executed
    public static void main(String[] args) {
        Employee employee = new Employee("Jiraya");
    }
}
