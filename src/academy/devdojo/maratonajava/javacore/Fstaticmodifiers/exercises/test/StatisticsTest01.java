package academy.devdojo.maratonajava.javacore.Fstaticmodifiers.exercises.test;

import academy.devdojo.maratonajava.javacore.Fstaticmodifiers.exercises.domain.Statistics;

public class StatisticsTest01 {
    public static void main(String[] args) {
        Statistics.setNumbers(new int[]{1,1,3,6,5,5,1,2});
        Statistics.meanCalculator();


    }
}
