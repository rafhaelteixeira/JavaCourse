package academy.devdojo.maratonajava.javacore.Npolymorphism.service;

import academy.devdojo.maratonajava.javacore.Npolymorphism.repository.Repository;

public class ArchiveRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving on File");
    }
}
