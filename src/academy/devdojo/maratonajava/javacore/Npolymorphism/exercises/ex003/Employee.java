package academy.devdojo.maratonajava.javacore.Npolymorphism.exercises.ex003;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void attendTraining(TrainingProgram trainingProgram, Employee employee){
        System.out.println("Employee " + employee.getName() + " has attended the " + trainingProgram.getName() + " training");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
