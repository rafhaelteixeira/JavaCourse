package academy.devdojo.maratonajava.introduction.exercises;

//Find the maximum element in an array and print it.
public class ArrayMaximum {
    public static void main(String[] args) {
        int[] array = {10, 2, 5, 3, 6, 12};

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("the maximum element is: " + max);
    }
}
