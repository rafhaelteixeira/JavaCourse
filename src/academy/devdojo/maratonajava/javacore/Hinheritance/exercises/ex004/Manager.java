package academy.devdojo.maratonajava.javacore.Hinheritance.exercises.ex004;

public class Manager extends Employee{
    private String name;
    private String department;

    public Manager(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void work(){
        System.out.println("Manager " + this.name + " Is Managing " + this.department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
