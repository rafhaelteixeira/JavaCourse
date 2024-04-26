package academy.devdojo.maratonajava.javacore.Oexceptions.Exception;
//we can also create customized exceptions

public class InvalidLoginException extends Exception{
    //this will be the default constructor with the default message
    public InvalidLoginException() {
        super("Invalid Login");
    }
    //if someone wants to customize the message, they can use this constructor with a parameter
    public InvalidLoginException(String message) {
        super(message);
    }
}
