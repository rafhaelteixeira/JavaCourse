package academy.devdojo.maratonajava.introduction.classes;

public class Class06Loops02 {
    public static void main(String[] args) {
        //Print all the even numbers from 0 to 1000
        int i = 0;
        if (i % 2 == 0) {
            for (i = 0; i <= 1000; i += 2) {
                System.out.println(i);
            }
        }

        for (int j = 0; j <= 50; j++) {
            if (j > 25) {
                break; //The break keyword can be used to stop the loop if needed
            }
            System.out.println(j);


        }
    }

}
