import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> bookCollection;

    public Borrower() {
        bookCollection = new ArrayList<>();
    }

    public int getBookCount() {
        return bookCollection.size();
    }

    public void borrowBook(Library library, String bookTitle) {
        bookCollection.add(library.removeBookByTitle(bookTitle));
    }
}
