package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain.StudentGrade;

import java.util.Scanner;

public class StudentGradeTest {
    public static void main(String[] args) {
        StudentGrade grade = new StudentGrade();
        Scanner input = new Scanner(System.in);

        System.out.println("Type Your Grades: ");

        System.out.println("Grade 1: ");
        double scoreTestOne = input.nextDouble();
        grade.setScoreTestOne();


        System.out.println("Grade 2: ");
        double scoreTestTwo = input.nextDouble();
        grade.setScoreTestTwo();


        System.out.println("Grade 3: ");
        double scoreTestThree = input.nextDouble();
        grade.setScoreTestThree();
        System.out.println("Your Average is: ");
        System.out.println(grade.calculateAverage(scoreTestOne, scoreTestTwo, scoreTestThree));

    }
}
