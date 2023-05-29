package Task3;

public class Book implements  IBook{
    static int count = 1;
    private final int ID = count++;
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
@Override
    public boolean isAvailable() {
        return available;
    }
@Override
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String displayInfo() {
        return "Book - " + ID + " {"  +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", available=" + available +
                '}';
    }
}
