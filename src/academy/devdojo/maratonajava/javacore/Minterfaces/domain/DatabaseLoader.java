package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading database Data");
    }

    @Override
    public void remove() {
        System.out.println("Deleting Data From Database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking Database Permissions");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Inside the retriveMaxDataSize on the class DatabaseLoader ");
    }
}
