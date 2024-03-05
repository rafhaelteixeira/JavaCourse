package academy.devdojo.maratonajava.javacore.Hinheritance.domain;
//in order to inherit attributes and methods of another class, we utilize the extends keyword
public class Employee extends Person{
    //with inheritance the relationship changes from "Has a " to "Is a". e.g: Employee is a person
    //we have the extension of methods and attributes of another class
    private double salary;
    //the child class can have other attributes and methods of its own, but also contains attributes and methods
    //from the parent class

    static {
        System.out.println("Inside the Employee Static Block");
    }

    {
        System.out.println("Inside the Employee Initializer block1");
    }

    {
        System.out.println("Inside the Employee Initializer block");
    }

    public Employee(String name){
        super(name);
        //we can utilize the super keyword in order to call the constructor of the super class
        System.out.println("Inside Employee Constructor");
    }

    //we can utilize the concept of overriding methods
    public void print(){
    //we create a method with the exact same signature of the parent class' method
        super.print();//the super keyword reffers the imported superclass method, but it refferences the employoee class
        System.out.println(this.salary);
        //this code will get the other attributes in the SC print method
        //when we call employee.print() we'll get all information regarding employee
    }

    //let's say we want to make a payment receipt
    public void paymentReceipt(){
        //if we use this.name, we'll have an error, because we don't have direct access to the private attributes
        //of the parent class
        //we could solve this problem by calling the getName method, but that is not ideal
        //instead we can use the protected keyword in the attributes of the parent class
        System.out.println("I " + this.name + " received the salary of: " + this.salary);

    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
