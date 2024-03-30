package academy.devdojo.maratonajava.javacore.Jfinalmodifier.exercises.ex001;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] initialHobbies = {"Reading", "Gardening"};
        ImmutableClass02 obj = new ImmutableClass02("Alice", 30, initialHobbies);

        // Attempt to modify the state of the object
        // This will throw a compilation error since the fields are final and there are no setter methods
        // obj.setName("Bob"); // Compilation error: setName(String) has private access in ImmutableClass
        // obj.setAge(25);     // Compilation error: setAge(int) has private access in ImmutableClass
        // obj.getHobbies()[0] = "Writing"; // This will not modify the state of the object due to defensive copying

        // Print the object's state to verify immutability
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Hobbies: " + Arrays.toString(obj.getHobbies()));
    }
}

