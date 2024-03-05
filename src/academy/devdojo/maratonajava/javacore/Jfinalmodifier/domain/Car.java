package academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain;

public class Car {
    //by using the final keyword in a class, this class cannot be extended anymore.
    private String name;
    //constants have their own naming convention, see example bellow
    //remember to refactor other constants created in previous exercises
    public final Buyer BUYER = new Buyer();
    //by creating a buyer obj with the final keyword, we can make sure that only one object will be instantiated
    //see singleton design pattern
    public static final double SPEED_LIMIT = 250;
    //this value will not be altered, constants often come as static attribute
    //another way to initialize a constant variable, is by using an initializer block
    //we can also initialize inside a constructor

    public final void print(){
        System.out.println(this.name);
        //Using the final keyword in a method, means that this method cannot be overriden anymore

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
