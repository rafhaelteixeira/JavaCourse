package academy.devdojo.maratonajava.javacore.Hinheritance.exercises.ex002;

public class Student extends Person {
    protected String lectures;
    protected double[] grades;
    protected Teacher teacher;

    public Student(String name, int age, long id, String lectures){
        super(name, age, id);
        this.lectures = lectures;
    }

    public String getLectures() {
        return lectures;
    }

    public void setLectures(String lectures) {
        this.lectures = lectures;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
