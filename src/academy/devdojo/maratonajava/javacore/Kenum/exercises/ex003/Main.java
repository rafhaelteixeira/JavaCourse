package academy.devdojo.maratonajava.javacore.Kenum.exercises.ex003;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960, BookGenre.FICTION));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, BookGenre.FICTION));
        library.addBook(new Book("The Da Vinci Code", "Dan Brown", 2003, BookGenre.MYSTERY));
        library.addBook(new Book("1984", "George Orwell", 1949, BookGenre.SCIENCE_FICTION));
        library.addBook(new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 2011, BookGenre.NON_FICTION));

        List<Book> fictionBooks = library.getBooksByGenre(BookGenre.FICTION);

        System.out.println("Fiction Books");
        for (Book book : fictionBooks) {
            System.out.println(book.getTitle());

        }

    }
}
