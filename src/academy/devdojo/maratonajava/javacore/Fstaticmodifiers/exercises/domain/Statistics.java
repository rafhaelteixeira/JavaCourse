package academy.devdojo.maratonajava.javacore.Fstaticmodifiers.exercises.domain;
/*Calculate Statistics: Create a class with static methods
to calculate statistics such as mean, median, and mode from an array of numbers.*/
public class Statistics {

    private static int[] numbers;
    private static int result;

    public static void meanCalculator(){
        for (int number : Statistics.numbers) {
            Statistics.result += number;
        }
        Statistics.result = Statistics.result / numbers.length;
        System.out.println("Mean: " + Statistics.result);
    }

    public static int modeCalculator(int[] numbers){
        return numbers[0];
    }



    public static int[] getNumbers() {
        return numbers;
    }

    public static void setNumbers(int[] numbers) {
        Statistics.numbers = numbers;
    }
}
