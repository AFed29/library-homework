import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before() {
        book = new Book("The Count of Monte Cristo");
    }

    @Test
    public void checkBookHasName() {
        assertEquals("The Count of Monte Cristo", book.getTitle());
    }
}
