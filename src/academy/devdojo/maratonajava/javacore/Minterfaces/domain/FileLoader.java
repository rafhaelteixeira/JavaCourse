package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading Data From File");
    }

    @Override
    public void remove() {
        System.out.println("Deleting Data From File");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking Permissions On File");
    }
}
