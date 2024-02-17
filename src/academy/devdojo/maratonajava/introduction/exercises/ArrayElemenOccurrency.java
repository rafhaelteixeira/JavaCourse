package academy.devdojo.maratonajava.introduction.exercises;

import java.util.Scanner;

//Count the occurrences of a specific element in the array and print it.
public class ArrayElemenOccurrency {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 2, 3, 3, 4, 6, 2, 5, 8, 3, 2};
        Scanner input = new Scanner(System.in);
        System.out.println("type a number: ");
        int num = input.nextInt();


        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                counter++;
            }
        }
        System.out.println("The element " + num + " occurs " + counter + " times ");
    }
}
