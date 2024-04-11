package academy.devdojo.maratonajava.javacore.Npolymorphism.exercises.ex003;

public class Main {
    public static void main(String[] args) {
        TrainingProgram manager = new ManagerialTraining("Managerial");
        TrainingProgram soft = new SoftSkillsTraining("Soft Skills");
        TrainingProgram technical = new TechnicalTraining("Technical");

        Employee john = new Employee("John");
        Employee mary = new Employee("Mary");
        Employee victor = new Employee("Victor");

        manager.conductTraining();
        john.attendTraining(manager, john);

        System.out.println("--------------------------------");

        soft.conductTraining();
        mary.attendTraining(soft, mary);

        System.out.println("--------------------------------");

        technical.conductTraining();
        victor.attendTraining(technical, victor);
    }
}
