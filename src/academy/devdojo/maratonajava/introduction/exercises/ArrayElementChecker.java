package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

public class ArrayElementChecker {
    public static void main(String[] args) {
        int[] array = {10, 20, 35, 69, 74, 85, 21, 452};

        Scanner input = new Scanner(System.in);
        System.out.println("Type a number: ");
        int element = input.nextInt();

        boolean exists = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                exists = true;
                break;
            }
        }
        if (exists) {
            System.out.println("The element exists");
        } else {
            System.out.println("The element doesn't exist");
        }
    }
}
