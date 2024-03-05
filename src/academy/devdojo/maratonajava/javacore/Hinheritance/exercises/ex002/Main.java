package academy.devdojo.maratonajava.javacore.Hinheritance.exercises.ex002;

public class Main {
    public static void main(String[] args) {
    Student student = new Student("Rafhael", 27, 12354684, "Coding");
    Teacher teacher = new Teacher("Ivo", 48, 2365489, "Coding");

    student.setGrades(new double[]{8.5,3.2,7.0});
    teacher.calculateStudentAvg(student.getGrades());
    }
}
