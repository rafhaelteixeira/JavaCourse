package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;

//coupling, has to do with how much a class knows about the other
//Is preferable to have a low coupling. On this example if the user of the class Test
//inserts a wrong information, the code would break logically;
//a way to ensure low coupling is with access modifiers
public class Person {
    //these attributes can only be accessed by the object
    //the PersonTest01 class lost the access to the attributes
    private String name;
    private int age;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //we also need a method to get and return the attributes
    //these methods must return something, in order to be stored.
    //we take no parameters in the get method
    public String getName() {
        return this.name;
    }

    //we solve this problem using a set method, this method is public, so it can be accessed by other classes
    //the set method will store the atribute value in memory.
    public void setName(String name) {
        //if we have a variable with the same name as the parameter, we mus use the keyword this
        this.name = name;
    }

    public int getAge() {

        return this.age;
    }

    public void setAge(int age) {
        //we can add additional logic to this method, like so:
        if (age < 0) {
            System.out.println("Ivalid Age");
            return;
        }
        this.age = age;
    }
}
