package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;

public class StudentPrinter {
    //We can pass reference type variables as a parameter
    public void print(Student student) {
        System.out.println("----------------------------------------");
        //any alteration made on the object, will affect the studentTest01
        //that's the danger of using reference types as parameters, for example:
        //student.name = "gohan";
        //this line will attribute the value above to all objects
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
        //if we place this line bellow, the method will execute and then change the variable
        student.name = "gohan";

    }
}
