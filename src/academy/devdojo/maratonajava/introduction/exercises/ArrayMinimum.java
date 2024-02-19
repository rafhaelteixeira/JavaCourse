package academy.devdojo.maratonajava.introduction.exercises;

////Find the Minimum element in an array and print it.
public class ArrayMinimum {
    public static void main(String[] args) {
        int[] array = {4, 3, 2, 5, 8, 2, 1};

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The minimum value is: " + min);
    }
}
