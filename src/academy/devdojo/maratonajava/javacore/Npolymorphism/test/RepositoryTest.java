package academy.devdojo.maratonajava.javacore.Npolymorphism.test;

import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.repository.Repository;
import academy.devdojo.maratonajava.javacore.Npolymorphism.service.ArchiveRepository;
import academy.devdojo.maratonajava.javacore.Npolymorphism.service.DataBaseRepository;
import academy.devdojo.maratonajava.javacore.Npolymorphism.service.MemoryRepository;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new MemoryRepository();
        repository.save();
    }
}
