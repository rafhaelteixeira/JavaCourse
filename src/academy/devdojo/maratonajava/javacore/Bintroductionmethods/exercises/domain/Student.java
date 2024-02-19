package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain;

/*Create a Student class with attributes name, grade, and subject.
 Include a method to display the student's information.*/
public class Student {

    public String name;
    public double grade;
    public String subject;

    public void displayInfo() {
        System.out.println(this.name);
        System.out.println(this.grade);
        System.out.println(this.subject);
    }
}
