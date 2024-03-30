package academy.devdojo.maratonajava.javacore.Kenum.exercises.ex003;

import java.util.Arrays;

public class Book {
    private String title;
    private String author;
    private int yearOfPublication;
    private BookGenre genre;


    public Book(String title, String author, int yearOfPublication, BookGenre genre) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public BookGenre getGenre() {
        return genre;
    }
}


