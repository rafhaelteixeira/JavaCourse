package academy.devdojo.maratonajava.introduction.exercises;

//Even Numbers: Write a program that prints even numbers from 2 to 20 using a loop.
public class EvenNumbers {
    public static void main(String[] args) {

        for (int i = 2; i < 21; i += 2) {
            if (i % 2 != 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
