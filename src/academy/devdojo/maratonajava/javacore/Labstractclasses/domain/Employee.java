package academy.devdojo.maratonajava.javacore.Labstractclasses.domain;

public abstract class Employee extends Person{
    //by creating an abstract class we can avoid the instantiation of the Employee class
    //this class is a template on which a child class will get it's attributes and methods from
    //we can't create something concrete out of this class, it's a class created to be a superclass
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculateBonus();
    }

    //abstract classes can have non abstract methods as well
    //A concrete class (Manager and Developer) cannot have abstract methods
    //by Overriding the Person class' print() method, all child classes from Employee will inherit the method
    @Override
    public void print() {
        System.out.println("Printing");
    }
    //we can also abstract methods
    //in this case, we are creating a method to calculate the salary bonus
    //abstract methods have no body
    //all child classes now are obligated to provide the method's implementation
    //see implementation on Manager and Developer classes
    public abstract void calculateBonus();

}
