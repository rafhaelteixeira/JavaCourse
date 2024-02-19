package academy.devdojo.maratonajava.introduction.exercises;

//Calculate the sum of all elements in an array and print it.
public class ArraySum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
