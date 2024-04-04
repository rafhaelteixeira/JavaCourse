package academy.devdojo.maratonajava.javacore.Minterfaces.domain;
//classes can implement one or multiple interfaces

public class DatabaseLoader implements DataLoader, DataRemover{
    //since the interface has abstract methods, we are obligated to provide implementation for the methods
    @Override
    public void load() {
        System.out.println("Loading database Data");
    }

    @Override
    public void remove() {
        System.out.println("Deleting Data From Database");
    }

    //we can override concrete methods from the interface
    @Override
    public void checkPermission() {
        System.out.println("Checking Database Permissions");
    }

    //this method belongs to the class DatabaseLoader
    //it's not overriding the interface static method
    public static void retriveMaxDataSize(){
        System.out.println("Inside the retrieveMaxDataSize on the class DatabaseLoader ");
    }
}
