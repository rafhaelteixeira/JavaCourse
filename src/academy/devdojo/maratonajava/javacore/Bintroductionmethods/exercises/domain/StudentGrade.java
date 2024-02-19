package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain;

import java.util.Scanner;

/*Student Grade Calculator: Develop a Student class with methods
to calculate the average grade of a student based on their scores in different tests.*/
public class StudentGrade {
    public double scoreTestOne;
    public double scoreTestTwo;
    public double scoreTestThree;
    Scanner input = new Scanner(System.in);

    public void typeGrades(){
        System.out.println("Type Your Grades: ");

        System.out.println("Grade 1: ");
        this.scoreTestOne = input.nextDouble();

        System.out.println("Grade 2: ");
        this.scoreTestTwo = input.nextDouble();

        System.out.println("Grade 3: ");
        this.scoreTestThree = input.nextDouble();


    }

    public double calculateAverage(double test1, double test2, double test3){
        return (test1 + test2 + test3) / 3;
    }
}
