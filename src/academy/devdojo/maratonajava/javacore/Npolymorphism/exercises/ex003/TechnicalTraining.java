package academy.devdojo.maratonajava.javacore.Npolymorphism.exercises.ex003;

public class TechnicalTraining extends TrainingProgram{

    public TechnicalTraining(String name) {
        super(name);
    }

    @Override
    public void conductTraining(){
        System.out.println("Conducting Technical Training");
    }
}
