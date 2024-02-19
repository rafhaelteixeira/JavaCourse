package academy.devdojo.maratonajava.javacore.Aintroductionclasses.exercises.Test;

import academy.devdojo.maratonajava.javacore.Aintroductionclasses.exercises.Domain.Birds;
import academy.devdojo.maratonajava.javacore.Aintroductionclasses.exercises.Domain.Mammals;
import academy.devdojo.maratonajava.javacore.Aintroductionclasses.exercises.Domain.Reptiles;

/*Animal Kingdom: Create a hierarchy of classes representing different animals (e.g., Mammal, Bird, Fish).
Each class should have attributes like species, habitat, etc. Instantiate objects of these classes to represent different animals.*/
public class AnimalsTest {
    public static void main(String[] args) {
        Mammals dog = new Mammals();
        Mammals cat = new Mammals();

        Birds bird1 = new Birds();
        Birds bird2 = new Birds();

        Reptiles snake = new Reptiles();
        Reptiles lizard = new Reptiles();

        dog.species = "Labradoodle"; dog.habitat = "Homes"; dog.keyCharacteristic = "Really Friendly";
        cat.species = "Siamese"; cat.habitat = "Homes"; cat.keyCharacteristic = "Lazy";

        bird1.species = "BlueJay"; bird1.habitat = "Central Parks"; bird1.keyCharacteristic = "Blue Feathers";
        bird2.species = "Eagle"; bird2.habitat = "Deserts"; bird2.keyCharacteristic = "Hunters";

        snake.species = "Sucuri"; snake.habitat = "Amazon Rainforest"; snake.keyCharacteristic = "Crushes Large Animals";
        lizard.species = "Komodo Dragon"; lizard.habitat = "Deserts and Forests"; lizard.keyCharacteristic = "Follow Hunts for long distances";

        //got lazy so i didn't print, but i got the gist...

    }
}
