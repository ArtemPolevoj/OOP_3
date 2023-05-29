package Task3;

import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> catalog = new ArrayList<>();

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void removeBook(Book book) {
        catalog.remove(book);
    }

    public void displayAvailableBooks() {
        catalog.forEach(book -> {
            if (book.isAvailable())
                System.out.println(book.displayInfo());
        });
    }

    public void searchByAuthor(String author) {
        catalog.forEach(book -> {
            if (book.displayInfo().contains(author))
                System.out.println(book.displayInfo());
        });
    }
}
