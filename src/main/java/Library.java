import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> bookCollection;

    public Library(int capacity) {
        this.capacity = capacity;
        this.bookCollection = new ArrayList<>();
    }

    public int getBookCount() {
        return this.bookCollection.size();
    }

    public void addBookToLibrary(Book book) {
        if (getBookCount() < capacity) {
            this.bookCollection.add(book);
        }
    }
}
