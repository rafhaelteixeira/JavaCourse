package academy.devdojo.maratonajava.javacore.Gassociation.exercise;

public class Seminar {
    private String title;
    private Student[] students;
    private Local local;


    public Seminar(String title, Local local) {
        this.title = title;
        this.local = local;
    }

    public Seminar(String title, Student[] students, Local local) {
        this.title = title;
        this.students = students;
        this.local = local;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
