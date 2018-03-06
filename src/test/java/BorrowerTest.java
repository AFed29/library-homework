import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BorrowerTest {
    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before() {
        borrower = new Borrower();
        book = new Book("The BFG", Genre.CHILDRENS);
        library = new Library(20);
        library.addBookToLibrary(book);
    }

    @Test
    public void checkBorrowerHasNoBooks() {
        assertEquals(0, borrower.getBookCount());
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBook(library, "The BFG");
        assertEquals(1, borrower.getBookCount());

    }

}
