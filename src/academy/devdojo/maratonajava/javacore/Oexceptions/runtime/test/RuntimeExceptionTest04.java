package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        //in some cases, there are methods that can throw multiple exceptions
        //in these cases we can solve this problem by using multiple catch blocks
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside of ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside of IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Inside of IllegalArgumentException");

        } catch (ArithmeticException e) {
            System.out.println("Inside of ArithmeticException");
        }
        //Java will try to find the catch block with the most specific exception
        //If it doesn't find, it'll trhow a most untreated generic exception and stop the program
        //we can solve this by adding a most generic exception with the correct treatment
        catch (RuntimeException e) {
            System.out.println("Inside RuntimeException");
        }//there's a rule to this approach: we cannot write a most generic exception ahead of the others
        //if we do so, Java would always throw the most generic exception. But in practice we'll get a compilation error

        //we can do this to checked exceptions as well
        try {
            maybeThrowException();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //A most generic exception on the front
        try {
            maybeThrowException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //another syntax we can use, to catch multiple exceptions
        //this syntax is good for exceptions that are not in the same line of inheritance
        //also can be used with RuntimeExceptions, following the same rules
        try {
            maybeThrowException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void maybeThrowException() throws SQLException, FileNotFoundException {

    }
}

