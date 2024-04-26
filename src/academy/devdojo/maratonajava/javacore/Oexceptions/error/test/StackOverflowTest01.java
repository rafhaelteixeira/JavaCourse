package academy.devdojo.maratonajava.javacore.Oexceptions.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
    recursiveMethod();
    }

    //by running this program we'll get an stackOverflow error
    //the method will call itself untill the stack memmory overflows
    //in this case the program will stop executing, since we're not able to recover from this error
    //the developer must solve the problem, and then rerun the code
    public static void recursiveMethod(){
        recursiveMethod();
    }
}
