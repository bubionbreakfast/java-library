import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> catalog;

    public Library(int capacity){
        this.capacity = capacity;
        this.catalog = new ArrayList<Book>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getCatalog() {
        return this.catalog.size();
    }

    public void addBook(Book book) {
        if(this.catalog.size() < this.capacity){
            this.catalog.add(book);

        }
    }
}
