package academy.devdojo.maratonajava.javacore.Minterfaces.domain;
//interfaces are similar to abstract classes
//they provide contracts that can be implemented by other classes
public interface DataLoader {
    //we can add attributes to interfaces, by default they are constants
    public static final int MAX_DATA_SIZE = 10;

    //this method load is public and abstract
    void load();
    //the problem with abstract methods is that the classes are obligated to implement them
    //with interfaces we can also use concrete methods by utilizing the default keyword
    default void checkPermission() {
        System.out.println("Checking permissions");
    }

    //we can also work with static methods
    //they'll never be overriden because they belong to the interface
    public static void retriveMaxDataSize(){
        System.out.println("Inside the retriveMaxDataSize on the interface ");
    }

}
