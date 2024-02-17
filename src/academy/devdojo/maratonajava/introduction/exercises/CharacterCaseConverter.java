package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

/*Character Case Converter: Write a program that converts uppercase
letters to lowercase and vice versa for a given character.*/
public class CharacterCaseConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a character: ");
        char character = input.next().charAt(0);
        char convertedChar;

        if (Character.isUpperCase(character)) {
            convertedChar = Character.toLowerCase(character);
            System.out.println(convertedChar);
        } else if (Character.isLowerCase(character)) {
            convertedChar = Character.toUpperCase(character);
            System.out.println(convertedChar);

        } else {
            System.out.println("Not an alphabet number");
        }
    }
}
