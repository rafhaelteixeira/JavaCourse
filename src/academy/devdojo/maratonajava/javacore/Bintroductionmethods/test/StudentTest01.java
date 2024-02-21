package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Student;
import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        StudentPrinter studentPrinter = new StudentPrinter();

        student01.name = "Sasuke";
        student01.age = 17;
        student01.gender = 'M';

        student02.name = "Sakura";
        student02.age = 17;
        student02.gender = 'F';
        //In order to print, we must provide a reference type variable as argument
        studentPrinter.print(student01);
        studentPrinter.print(student02);
        System.out.println("=============================");
        //printing the altered value
        studentPrinter.print(student01);
        studentPrinter.print(student02);


    }
}
