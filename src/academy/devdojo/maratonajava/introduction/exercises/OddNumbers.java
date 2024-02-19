package academy.devdojo.maratonajava.introduction.exercises;

//Odd Numbers: Write a program that prints odd numbers from 1 to 15 using a loop.
public class OddNumbers {
    public static void main(String[] args) {

        for (int i = 1; i < 16; i += 2) {
            if (i % 2 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
