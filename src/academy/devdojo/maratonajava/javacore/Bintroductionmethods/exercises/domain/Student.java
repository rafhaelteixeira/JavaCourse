package academy.devdojo.maratonajava.javacore.Bintroductionmethods.exercises.domain;

/*Create a Student class with attributes name, grade, and subject.
 Include a method to display the student's information.*/
public class Student {

    private String name;
    private double grade;
    private String subject;

    public void displayInfo() {
        System.out.println(this.name);
        System.out.println(this.grade);
        System.out.println(this.subject);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
