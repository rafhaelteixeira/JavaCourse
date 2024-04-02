package academy.devdojo.maratonajava.javacore.Oexceptions.error.test;

public class StackOverflowTest01 {
    //illustrating the stack overflow error
    //to solve errors we need to stop the program and fix the code
    //the program cannot recover from an error at run time
    public static void main(String[] args) {
        //calling the recursive method
        recursive();
    }

    public static void recursive(){
        //creating a method that calls itself
        //since we're not defining a logic for the method to stop it'll run 'till
        //memmory overflow
        recursive();
    }
}
