package academy.devdojo.maratonajava.javacore.Oexceptions.Exception.test;

import academy.devdojo.maratonajava.javacore.Oexceptions.Exception.domain.Reader1;
import academy.devdojo.maratonajava.javacore.Oexceptions.Exception.domain.Reader2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
    readFile3();
    }

    //bellow an example of an ugly code. This code tries to read a file
    public static void readFile() {
        //using Reader class. Initializing with null
        Reader reader = null;
        try {
            //trying to read file
            reader = new BufferedReader(new FileReader("teste.txt"));

        }//catching exception
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }//the finally block will be responsible for closing the file, also utilizing a method from the Reader class
        finally {
            try {//The close() method on this class, also can throw a checked exception, so we mus treat it or throw to the next on the stack
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
                //this is a really verbose code, instead we can use the try with resources approach. see bellow
            }
        }
    }
    public static void readFile2(){
        //this try block will ensure that the connection from the refference variable is closed
        //We can only put inside the try with resources Objects and refference variables, that implements the interfaces
        //Closeable or AutoCloseable
        try(Reader reader = new BufferedReader(new FileReader("test.txt"))){
            //with this approach we don't have to worry about creating a finally block, Java will manage that for us
            //we can also delete the catch block, but we are obligated to state the exception on the method signature

        }catch (IOException e){

        }
    }

    //we can illustrate with this example
    //if we run this, we'll see that Java was responsible for calling the close method
    //and they're closed on the inverse order that they were declared - This can be useful on the DB context
    //we can change the order of declaration based on the context
    public static void readFile3(){
        try(Reader1 reader1 = new Reader1(); Reader2 reader2 = new Reader2()){

        }catch (IOException e){

        }
    }
}
