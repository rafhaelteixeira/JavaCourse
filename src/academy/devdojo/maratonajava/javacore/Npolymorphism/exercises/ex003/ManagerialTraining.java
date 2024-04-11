package academy.devdojo.maratonajava.javacore.Npolymorphism.exercises.ex003;

public class ManagerialTraining extends TrainingProgram{

    public ManagerialTraining(String name) {
        super(name);
    }

    @Override
    public void conductTraining() {
        System.out.println("Conducting Management Training");
    }
}
