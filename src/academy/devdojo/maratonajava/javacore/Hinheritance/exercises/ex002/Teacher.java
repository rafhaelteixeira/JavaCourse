package academy.devdojo.maratonajava.javacore.Hinheritance.exercises.ex002;

public class Teacher extends Person{
    protected String lecture;
    protected double gradeAvg;
    protected Student student;

    public Teacher(String name, int age, long id, String lecture){
        super(name, age, id);
        this.lecture = lecture;
        this.student = new Student("",0,0, "");
    }

    public double calculateStudentAvg(double[] grades){
        student.grades = grades;
        double gradeSum = 0;
        if (student.grades == null){
            return 0;
        }
        for (int i = 0; i < student.grades.length; i++) {
            gradeSum = student.grades[i] + student.grades[i];
        }
        gradeAvg = gradeSum / 3;
        System.out.println(gradeSum);
        System.out.println(gradeAvg);
        return gradeAvg;

    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
