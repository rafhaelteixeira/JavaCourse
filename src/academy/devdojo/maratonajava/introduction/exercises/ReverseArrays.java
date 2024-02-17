package academy.devdojo.maratonajava.introduction.exercises;

//Reverse the elements of the array and print the reversed array.
public class ReverseArrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};


        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        System.out.println("reversedArray: ");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.println(reversedArray[i] + " ");

        }

    }
}
