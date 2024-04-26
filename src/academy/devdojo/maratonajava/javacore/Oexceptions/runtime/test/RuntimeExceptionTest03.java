package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        //in certain situations we may need a block of code that will always be executed
        //for example in a DB connection, we open the connection and after the transactions we may need to close it
        //in this case we can use the finally block
        openConnection();
    }

    private static void openConnection() {
        try{
            //the try block will try to execute the operations
            //what if something goes wrong? see catch block
            System.out.println("Opening File");
            System.out.println("Writing Data to File");

        }catch (Exception e){
            //catch block will catch the exception
            e.printStackTrace();
        }finally {
            //finally block will always be executed
            //in this case, if something goes wrong on the Data writing, an exception will be thrown
            //by using the finally block, we can make sure that the File will be closed
            System.out.println("Closing File");
        }
    }

    private static void openConnection2() {
        //Java allows us to use try and finally.
        //the Try block cannot be used by itself
        //By utilizing this approach we wouldn't be able to treat the exception, but we could close the connection in this case
        //it is not a good practice
        try{
            System.out.println("Opening File");
            System.out.println("Writing Data to File");
        }finally {
            System.out.println("Closing File");
        }
    }
}
