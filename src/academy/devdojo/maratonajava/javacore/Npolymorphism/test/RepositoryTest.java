package academy.devdojo.maratonajava.javacore.Npolymorphism.test;

import academy.devdojo.maratonajava.javacore.Npolymorphism.repository.Repository;
import academy.devdojo.maratonajava.javacore.Npolymorphism.service.MemoryRepository;

public class RepositoryTest {
    public static void main(String[] args) {
        //Repository is an interface that has the save method on it
        //By creating a Repository refference type, we can now use the method to save on
        //any source we choose, using the widening casting
        Repository repository = new MemoryRepository();
        repository.save();
    }
}
