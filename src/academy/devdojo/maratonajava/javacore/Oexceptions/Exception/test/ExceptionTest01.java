package academy.devdojo.maratonajava.javacore.Oexceptions.Exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
    createNewFile();
    }

    //trying to create a file, we'll have a compilation error, unless we treat the exception
    private static void createNewFile(){
        File file = new File("file\\file.txt");

        //to treat exceptions we utilize a try/catch block

        //the try block will try to run the given commands, if something goes wrong the JVM will enter the catch block
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File created: " + isCreated);

        }
        //The catch block will catch the given exception and treat it accordingly
        //Never leave the catch block blank.
        //Avoid business logic inside the catch block
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
