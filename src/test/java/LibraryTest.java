import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    public Library library;
    public Book book;
    public Borrower borrower;


    @Before
    public void before(){
        book = new Book("Rome", "Robert Ludlum", "Historical Fiction");
        library = new Library(2);
        borrower = new Borrower();
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

    @Test
    public void canRemoveBookFromLibrary(){
        library.addBook(book);
        library.addBook(book);

        library.removeBook(book);
        assertEquals(1, library.getCatalog());
    }

    @Test
    public  void canGetSizeOfBorrowersCollection(){
        borrower.addBookToCollection(book);
        borrower.addBookToCollection(book);
        assertEquals(2, borrower.getCollectionSize());
    }

    @Test
    public  void canBorrowBook(){
        borrower.borrowBook(book);
        assertEquals(1, borrower.getCollectionSize());
        assertEquals(1, library.getCatalog());
    }

//    @Test void canBorrowBookFromLibrary(){
//        borrower.addBookToCollection(book);
//        library.removeBook(book);
//        assertEquals(1, borrower.getCollectionSize());
//        assertEquals(1, library.getCatalog());
//    }



}
