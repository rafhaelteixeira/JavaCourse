package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Sasuke";
        student01.age = 17;
        student01.gender = 'M';

        student02.name = "Sakura";
        student02.age = 17;
        student02.gender = 'F';
        //we can easily print the data by calling the print() method, inside the Student Class
        student01.print();
        student02.print();
    }
}
