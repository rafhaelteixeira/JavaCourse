package academy.devdojo.maratonajava.javacore.Gassociation.exercise;

public class Main {
    public static void main(String[] args) {
        Local local = new Local("Groove Street");
        Student student = new Student("Rafhael", 27);
        Professor professor = new Professor("Ivo", "Computer Architecture");

        Student[] students = {student};
        Seminar seminar = new Seminar("Computer Architecture",students, local);

        Seminar[] seminars = {seminar};
        professor.setSeminars(seminars);
        professor.print();

    }
}
