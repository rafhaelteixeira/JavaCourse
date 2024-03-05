package academy.devdojo.maratonajava.javacore.Gassociation.domain;
//relationship many to one
//one school can have N professors, but 1 professor has 1 school
//unidirectional relationship, from school to teacher
public class School {
    private String name;
    //Teacher object array of teachers.
    private Teacher[] teachers;

    public School(String name) {
        this.name = name;
    }
    //overloading the method, allows us to create a school with an array of teachers
    public School(String name, Teacher[] teachers) {
        this.name = name;
        this.teachers = teachers;
    }

    public void print() {
        System.out.println(this.name);
        if (teachers == null) {
            return;
        }
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getName());
        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}
