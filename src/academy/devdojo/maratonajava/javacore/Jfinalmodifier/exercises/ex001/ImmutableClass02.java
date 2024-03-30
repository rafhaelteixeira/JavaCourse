package academy.devdojo.maratonajava.javacore.Jfinalmodifier.exercises.ex001;

import java.util.Arrays;

public final class ImmutableClass02 {
    private final String name;
    private final int age;
    private final String[] hobbies;

    // Constructor to initialize the final fields
    public ImmutableClass02(String name, int age, String[] hobbies) {
        this.name = name;
        this.age = age;
        // Create a defensive copy of the hobbies array to maintain immutability
        if (hobbies != null) {
            this.hobbies = Arrays.copyOf(hobbies, hobbies.length);
        } else {
            this.hobbies = new String[0];
        }
    }

    // Getter methods to access the fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Return a defensive copy of the hobbies array to maintain immutability
    public String[] getHobbies() {
        return Arrays.copyOf(hobbies, hobbies.length);
    }
}