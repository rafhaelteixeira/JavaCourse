package academy.devdojo.maratonajava.javacore.Aintroductionclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
//we can instatiate a object with the new keyword
        Student student = new Student();
        //initialize the object's attributes defined in the class
        student.name = "Luffy";
        student.age = 21;
        student.gender = 'M';
        //printing the attributes utilizing the student reference variable
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);


    }
}
