package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;

    void load();

    default void checkPermission() {
        System.out.println("Checking permissions");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Inside the retriveMaxDataSize on the interface ");
    }

}
