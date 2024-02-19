package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain.StudentGrade;

public class StudentGradeTest {
    public static void main(String[] args) {
        StudentGrade grade = new StudentGrade();

        grade.typeGrades();

        System.out.println("Your Average is: ");

        System.out.println(grade.calculateAverage(grade.scoreTestOne, grade.scoreTestTwo, grade.scoreTestThree));
    }
}
