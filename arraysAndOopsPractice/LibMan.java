package arraysAndOopsPractice;

import java.util.ArrayList;

public class LibMan {
    public static void main(String[] args) {

        Book Histroy = new Book("Hstory", "Monu", "Hard", "Available", 134);
        BookLibrary b1 = new BookLibrary(100);

        b1.addBook(Histroy);

        System.out.println(b1.books.size());

    }

} 

class Book {
    String title;
    String author;
    String type;
    String status;
    int price;

    Book(String title, String author, String type, String status, int price) {
        this.title =  title;
        this.author =  author;
        this.type =  type;
        this.status =  status;
        this.price =  price;
    }

    public int updatePrice(int diff) {
        this.price += diff;
        return price;
    }


    public String updateStatus(String status) {
        this.status = status;
        return this.status;
    }

}

class BookLibrary {

    ArrayList<Book> books = new ArrayList<>();
    int maxCapacity;

    public BookLibrary(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    boolean addBook(Book book) {
        if (this.books.size() >= this.maxCapacity) {
            System.out.println("Capacity Limit Over!");
            return false;
        }

        this.books.add(book);

        return true;
    }

}
