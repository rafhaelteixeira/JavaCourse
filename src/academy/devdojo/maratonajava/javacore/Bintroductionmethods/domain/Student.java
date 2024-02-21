package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;

public class Student {
    public String name;
    public int age;
    public char gender;

    //when we have a method inside an object, this method has access to all of the object's data
    public void print() {
        System.out.println("-------------------------");
        //we can use the this keyword to retrieve and print the object's Data
        //see StudentTest02 class
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
        //the this keyword is not mandatory if we do not have another local variable as parameter
        //or declared inside the method
        //but the use of the keyword is a good practice
    }
}
