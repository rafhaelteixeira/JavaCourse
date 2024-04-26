package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        division(2, 0);
    }

    //we can but it's not mandatory to write the throws exception in method signature (For unchecked exceptions)
    private static int division(int a, int b) throws RuntimeException {
        //an alternate syntax would be utilizing an if statement
        if (b == 0) {
            throw new RuntimeException("Division by zero");
        }
        //in this case the try catch block would be redundant, so it could be removed
        //and we could: return a/b;

        //we can use the try catch block to treat runtime exceptions
        //remember that even if an exception is thrown the program will not stop running
        try {
            System.out.println(a / b);
            return a / b;
        } catch (RuntimeException e) {

            e.printStackTrace();

        }
        return 0;
    }
}
