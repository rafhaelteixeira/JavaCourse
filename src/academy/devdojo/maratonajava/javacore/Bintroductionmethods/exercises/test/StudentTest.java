package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Rafhael");
        student.setGrade(10.4);
        student.setSubject("Java Programming");

        System.out.println("Displaying Student's info");
        student.displayInfo();

    }
}
