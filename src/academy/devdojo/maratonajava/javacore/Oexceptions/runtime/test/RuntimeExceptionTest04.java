package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Inside the ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Inside the IndexOutOfBoundsException");
        }catch (RuntimeException e){
            System.out.println("Inside the RuntimeException");

        }

        try {
            maybeThrowException();
        } catch (SQLException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            maybeThrowException();
        } catch (SQLException | FileNotFoundException e) {
           throw new RuntimeException(e);
        }

        try {
            maybeThrowExceptionTwo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void maybeThrowException() throws SQLException, FileNotFoundException{

    }
    private static void maybeThrowExceptionTwo() throws SQLException, FileNotFoundException{

    }
}

