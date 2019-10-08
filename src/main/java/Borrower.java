import com.sun.org.apache.xml.internal.resolver.Catalog;

import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public int getCollectionSize(){
        return this.collection.size();
    }

    public void addBookToCollection(Book book){
        this.collection.add(book);

    }

    public void borrowBook(Library library) {
        Book book = library.removeBook();
        this.collection.add(book);
    }

}
