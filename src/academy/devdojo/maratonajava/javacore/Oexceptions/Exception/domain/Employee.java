package academy.devdojo.maratonajava.javacore.Oexceptions.Exception.domain;

import academy.devdojo.maratonajava.javacore.Oexceptions.Exception.InvalidLoginException;

import java.io.FileNotFoundException;

public class Employee extends Person{
    //when overriding a method, we're not obligated to declare the exceptions in method signature
    //if we do this, we'll be obligated to treat the exception
    public void save()throws InvalidLoginException{
        System.out.println("Saving employee...");
    }
}
