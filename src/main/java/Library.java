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

    public Book removeBookByTitle(String bookTitle) {
        for (Book book : bookCollection) {
            int index = 0;
            if (book.getTitle().equals(bookTitle)) {
                return bookCollection.remove(index);
            }
            index++;
        }
        return null;
    }
}
