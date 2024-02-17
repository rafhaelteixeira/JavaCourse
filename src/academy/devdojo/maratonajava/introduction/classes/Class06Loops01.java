package academy.devdojo.maratonajava.introduction.classes;

public class Class06Loops01 {
    public static void main(String[] args) {
        //while, do while, for
        //these are the basic structures to iterate
        int count = 0;
        while (count < 10) {// the argument must return a boolean value / the value must return True
            System.out.println(count);
            count++;
        }
        count = 0;
        do {//do whatever it's inside here first, the do is always executed at least once
            System.out.println("Inside do-While");
            count++;
        } while (count < 10); //checks the condition and if true, continues to iterate

        for (int i = 0; i < 10; i++) {
            System.out.println("for " + i);

        }
    }
}
