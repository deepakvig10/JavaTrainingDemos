package Day5;


/*
* there are two type of constructor we can create
* 1. no argument or parameter less constructor
* 2. Paramertize constructor
*
*
* */

class Book {

    private String title;
    private String author;
    private int price;

    public Book(){

    }


    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

}


public class Demo3 {

    public static void main(String[] args){
//        Book b1 = new Book();
//        b1.title = "Java";
//        b1.author = "Author 1";
//        b1.price = 100;
//
//        Book b2 = new Book();
//        b2.title = "Html";
//        b2.author = "Author 2";
//        b2.price = 200;


        Book b1 = new Book("Java", "Author 1", 100);
        Book b2 = new Book("Html", "Author 2", 100);
        Book b3 = new Book();

    }



}
