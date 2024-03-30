package academy.devdojo.maratonajava.javacore.Kenum.exercises.ex003;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooksByGenre(BookGenre genre){
        List<Book> booksByGenre = new ArrayList<>();
        for (Book book : books){
            if (book.getGenre() == genre){
                booksByGenre.add(book);
            }
        }
        return booksByGenre;
    }
}
