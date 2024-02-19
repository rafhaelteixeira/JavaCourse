package academy.devdojo.maratonajava.javacore.Aintroductionclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        //if we try to print the objects atributes without initializing
        //we'll get the default values
        //the default values are the same as the primitive types default values.
        Student student = new Student();
        Student student2 = new Student();

        student.name = "Zoro";
        System.out.println(student.name);
        System.out.println(student.gender);
        System.out.println(student.age);
        //this outputs: null,  , 0
        //we can initialize the attributes inside the class, but
        //all objects instantiated through the class will have the same attributes
        System.out.printf("------------------------------------------\n");

        System.out.println(student.name);
        //note that if a mistake is made, we'll end up printing the first students.name's value
        //this can get really messy, really fast
        System.out.println(student2.gender);
        System.out.println(student2.age);



    }
}
