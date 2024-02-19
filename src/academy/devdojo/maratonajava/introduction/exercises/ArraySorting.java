package academy.devdojo.maratonajava.introduction.exercises;

//Sort the elements of the array in ascending order and print the sorted array.
public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {2, 1, 3, 8, 4, 7, 9, 10, 5, 6};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
