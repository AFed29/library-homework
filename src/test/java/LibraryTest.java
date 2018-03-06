import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book1, book2;

    @Before
    public void before() {
        library = new Library(20);
        book1 = new Book("Flying Solo", Genre.AUTOBIOGRAPHY);
        book2 = new Book("1984", Genre.POLITICALFICTION);
    }

    @Test
    public void checkLibraryInitiallyEmpty() {
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void checkBookCanBeAddedToLibraryWhenNotFull() {
        library.addBookToLibrary(book1);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void checkBookCannotBeAddedWhenFull() {
        for (int i = 0; i < 22; i++) {
            library.addBookToLibrary(book1);
        }
        assertEquals(20, library.getBookCount());
    }

    @Test
    public void canRemoveBookByTitle() {
        for (int i = 0; i < 5; i++) {
            library.addBookToLibrary(book1);
        }
        for (int i = 0; i < 5; i++) {
            library.addBookToLibrary(book2);
        }
        assertEquals(10, library.getBookCount());
        library.removeBookByTitle("1984");
        assertEquals(9, library.getBookCount());
    }
}
