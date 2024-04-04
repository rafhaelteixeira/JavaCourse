package academy.devdojo.maratonajava.javacore.Minterfaces.exercises.ex004;

public class Main {
    public static void main(String[] args) {
        Flyable[] flyables = {new SpaceCraft(), new Airplane(), new Helicopter()};

        for (Flyable flyable : flyables) {
            flyable.fly_obj();
        }

    }
}
