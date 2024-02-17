package academy.devdojo.maratonajava.introduction.exercises;

//Calculate and print the sum of all even numbers between 1 and 100.
public class EvenSum {
    public static void main(String[] args) {
        int range = 100;
        int sum = 0;

        for (int i = 0; i <= range; i++) {
            if (i % 2 != 0) {
                continue;
            }
            sum = sum + i;

        }
        System.out.println(sum);

    }
}

/*public class Sum {
    public static void main(String[] args) {
        int sum = 0;

        // Iterate through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                sum += i; // Add the even number to the sum
            }
        }

        // Print the sum of even numbers
        System.out.println("Sum of even numbers between 1 and 100: " + sum);
    }
}
*/