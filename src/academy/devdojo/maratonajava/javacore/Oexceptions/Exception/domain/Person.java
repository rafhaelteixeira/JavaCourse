package academy.devdojo.maratonajava.javacore.Oexceptions.Exception.domain;

import academy.devdojo.maratonajava.javacore.Oexceptions.Exception.InvalidLoginException;

import java.io.FileNotFoundException;

public class Person {

    public void save()throws InvalidLoginException, FileNotFoundException {
        System.out.println("salvando Pessoa");
    }
}
