package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Rafhael";
        student.grade = 10;
        student.subject = "Java Programming";

        System.out.println("Displaying Student's info");
        student.displayInfo();

    }
}
