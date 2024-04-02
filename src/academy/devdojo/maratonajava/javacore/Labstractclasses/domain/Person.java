package academy.devdojo.maratonajava.javacore.Labstractclasses.domain;

public abstract class Person {
    //in some cases we can have more than one abstract class
    //this class has a simple method, the next abstract (Employee) class that extends from this class is not
    //obligated to implement the abstract methods
    //but the following concrete classes are (Manager and Developer)
    public abstract void print();
}
