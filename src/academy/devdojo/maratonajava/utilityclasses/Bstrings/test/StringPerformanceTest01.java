package academy.devdojo.maratonajava.utilityclasses.Bstrings.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        //a little program to calculate the execution time of a given string
        //this serves to illustrate that we must be careful with the type of String we utilize
        //we must always write the code thinking about the performance
        long startTime = System.currentTimeMillis();
        concatString(30_000);
        long endTime = System.currentTimeMillis();
        System.out.println("Sum of strings in 1000 time: " + (endTime - startTime) + "ms");

        System.out.println("------------------------------------------");

        startTime = System.currentTimeMillis();
        concatStringBuilder(100_000);
        endTime = System.currentTimeMillis();
        System.out.println("Sum of stringsBuilder in 1000 time: " + (endTime - startTime) + "ms");

        System.out.println("-------------------------------------------");

        startTime = System.currentTimeMillis();
        concatStringBuffer(100_000);
        endTime = System.currentTimeMillis();
        System.out.println("Sum of stringsBuffer in 1000 time: " + (endTime - startTime) + "ms");
    }

    private static void concatString(int size) {
        String text = " ";
        for (int i = 0; i < size; i++) {
            text = text + i;
        }
    }

    //In order to solve performance problems we can utilize the StringBuilder class
    private static void concatStringBuilder(int size) {
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }

    //StringBuffer class is widely used to solve data consistency in multithreaded scenarios
    //it's basicaly the same thing as the StringBuilder
    private static void concatStringBuffer(int size) {
        StringBuffer sb = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }
    //when to work with One or another?
    //Most of the time, we can use regular Strings
    //if we need more performance we could use StringBuilder or StringBuffer, but this approach adds more
    //complexity. So it's used on large systems
}
