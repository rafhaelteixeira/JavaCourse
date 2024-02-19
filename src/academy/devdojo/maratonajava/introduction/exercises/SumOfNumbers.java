package academy.devdojo.maratonajava.introduction.exercises;

//Sum of Numbers: Write a program that calculates the sum of numbers from 1 to 100 using a loop.
public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
