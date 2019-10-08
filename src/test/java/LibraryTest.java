import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    public Library library;
    public Book book;


    @Before
    public void before(){
        book = new Book("Rome", "Robert Ludlum", "Historical Fiction");
        library = new Library(2);
    }

    @Test
    public void getCapacityOfLibrary(){
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.getCatalog());
    }

    @Test
    public void getNumberOfBooksInLibrary(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.getCatalog());
    }


}
