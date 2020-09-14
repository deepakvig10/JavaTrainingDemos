package Day16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

class Book{
    int id;
    String name;
    String author;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}


public class Demo10 {
    public static void main(String[] args) {

        Book b1 = new Book(1, "Book 1", "Author 1");
        Book b2 = new Book(2, "Book 2", "Author 2");
        Book b3 = new Book(3, "Book 3", "Author 3");
        Book b4 = new Book(3, "Book 3", "Author 3");

        HashSet<Book> books = new HashSet<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b3);

        Iterator<Book> i = books.iterator();
        while(i.hasNext()){
            //System.out.println(i.next());
            Book b = i.next();
            System.out.println(b.name);
        }

        for(Book book : books){
            System.out.println(book);
        }

    }
}
