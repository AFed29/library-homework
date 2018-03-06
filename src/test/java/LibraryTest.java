import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library(20);
    }

    @Test
    public void checkLibraryInitiallyEmpty() {
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void checkBookCanBeAddedToLibraryWhenNotFull() {
        library.addBookToLibrary(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void checkBookCannotBeAddedWhenFull() {
        for (int i = 0; i < 22; i++) {
            library.addBookToLibrary(book);
        }
        assertEquals(20, library.getBookCount());
    }
}
