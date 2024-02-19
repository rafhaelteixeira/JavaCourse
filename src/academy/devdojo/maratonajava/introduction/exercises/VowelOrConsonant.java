package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

/*Vowel or Consonant: Write a program that determines whether a given character is a vowel or a consonant.*/
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a character: ");
        char caractere = input.next().charAt(0);

        caractere = Character.toLowerCase(caractere);

        if (caractere >= 'a' && caractere <= 'z') {
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                System.out.println("It's a vowel");
            } else {
                System.out.println("It's a Consonant");
            }
        } else {
            System.out.println("Invalid output");
        }


    }
}
