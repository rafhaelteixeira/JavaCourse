package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;

public class StudentPrinter {
    //We can pass reference type variables as a parameter
    public void print(Student student) {
        System.out.println("----------------------------------------");
        //any alteration made in this class, will affect the studentTest01
        //that's the danger of using reference types as parameters
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
        student.name = "gohan";
    }
}
