package academy.devdojo.maratonajava.javacore.Aintroductionclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        //if we try to print the objects atributes without initializing
        //we'll get the default values
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.gender);
        System.out.println(student.age);
        //this outputs: null,  , 0
        //we can initialize the attributes inside the class, but
        //all objects instantiated through the class will have the same attributes
    }
}
