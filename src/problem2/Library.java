package problem2;

import java.util.ArrayList;
import java.util.List;

enum Genre {
    FICTION, NON_FICTION, SCIENCE_FICTION, FANTASY, MYSTERY, BIOGRAPHY
}

public class Library {
    private static int totalBooks;

    private final String libraryName;

    private final List<Book> books;

    {
        books = new ArrayList<>();
    }

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public void addBook(String title, Genre genre) {
        books.add(new Book(title, genre));
        totalBooks++;
    }

    public void addBook(String title) {
        addBook(title, Genre.FICTION);
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public void displayInfo() {
        System.out.println("lab2.Library Name: " + libraryName);
        System.out.println("Total Books: " + totalBooks);
        System.out.println("Books in lab2.Library:");
        for (Book book : books) {
            System.out.println(" - " + book);
        }
    }

    private  class Book {
        private final String title;
        private final Genre genre;

        public Book(String title, Genre genre) {
            this.title = title;
            this.genre = genre;
        }

        @Override
        public String toString() {
            return title + " (" + genre + ")";
        }
    }

    public static void main(String[] args) {
        Library library = new Library("City lab2.Library");
        library.addBook("The Great Gatsby", Genre.FICTION);
        library.addBook("A Brief History of Time", Genre.NON_FICTION);
        library.addBook("The Hobbit"); // Жанр по умолчанию FICTION

        library.displayInfo();

        System.out.println("Total books in library: " + Library.getTotalBooks());
    }
}
