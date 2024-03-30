package academy.devdojo.maratonajava.javacore.Npolymorphism.service;

import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.repository.Repository;

public class ArchiveRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving on file");
    }
}
