package Day17;

import java.util.TreeSet;

class Book implements Comparable<Book>{
    int id;
    String Name;
    String Author;
    int price;

    public Book(int id, String name, String author, int price) {
        this.id = id;
        Name = name;
        Author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Author='" + Author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.Name.compareTo(o.Name);
    }
}

public class Demo9 {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Title 1", "Author 1", 100);
        Book book2 = new Book(2, "Title 2", "Author 2", 200);
        Book book3 = new Book(3, "Title 1", "Author 3", 300);

        TreeSet<Book> books  = new TreeSet<>();
        books.add(book2);
        books.add(book3);
        books.add(book1);

        for(Book book : books){
            System.out.println(book);
        }



    }
}
