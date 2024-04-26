package academy.devdojo.maratonajava.javacore.Oexceptions.Exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        createNewFile();
    }

    //with checked exceptions, if we throw the exception on the method signature, the method caller must provide
    //treatment for the exception
    //if we create a private method, chances are that we'll have to treat the exception on the method itself
    private static void createNewFile() throws IOException {
        File file = new File("file\\file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File created: " + isCreated);

        } catch (IOException e) {
            e.printStackTrace();
            //in this line we can rethrow the exception
            throw e;

        }


    }
}
