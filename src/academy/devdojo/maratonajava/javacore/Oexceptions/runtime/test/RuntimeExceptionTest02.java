package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

import java.io.IOException;

public class RuntimeExceptionTest02 {
    public static void main(String[] args){
       division(1,1);

        System.out.println("Code Finalized");
    }
    /*
    *
    * @param a
    * @param b cannot be 0
    * @return
    * @throws IllegalArgumentException if b == 0
    */

    private static int division(int a, int b) throws IllegalArgumentException{
        if (b == 0){
            throw new IllegalArgumentException("Can't Divide a number by 0");
        }
        return a/b;
    }
}
