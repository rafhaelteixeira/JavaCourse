package academy.devdojo.maratonajava.javacore.Npolymorphism.exercises.ex003;

public abstract class TrainingProgram {
    private String name;

    public TrainingProgram(String name) {
        this.name = name;
    }

    public abstract void conductTraining();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
