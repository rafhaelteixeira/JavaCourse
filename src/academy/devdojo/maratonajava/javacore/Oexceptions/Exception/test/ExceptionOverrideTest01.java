package academy.devdojo.maratonajava.javacore.Oexceptions.Exception.test;

import academy.devdojo.maratonajava.javacore.Oexceptions.Exception.InvalidLoginException;
import academy.devdojo.maratonajava.javacore.Oexceptions.Exception.domain.Employee;
import academy.devdojo.maratonajava.javacore.Oexceptions.Exception.domain.Person;

import java.io.FileNotFoundException;

public class ExceptionOverrideTest01 {
    public static void main(String[] args) {
        Person  person = new Person();
        Employee employee = new Employee();

        //since we just declared one exception on the methods signature, we only need to treat one
        try {
            employee.save();
        } catch (InvalidLoginException e) {
            throw new RuntimeException(e);
        }

        //if we call the method from the parent class, we'll need to treat all exceptions from the method's signature
        try {
            person.save();
        } catch (InvalidLoginException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
