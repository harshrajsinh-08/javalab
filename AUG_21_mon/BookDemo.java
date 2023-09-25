package AUG_21_mon;
import java.util.Scanner;
class Author {
    private String fname;
    private String lname;

    public Author(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public void setfname(String fname) {
        this.fname = fname;
    }

    public void setlname(String lname) {
        this.lname = lname;
    }

    public String getfname() {
        return fname;
    }

    public String getlname() {
        return lname;
    }

    @Override
    public String toString() {
        return fname + " " + lname;
    }
}

class Book {
    private String title;
    private Author author;
    private double price;

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Title: " + title + " "+ "\nAuthor: " + author + " " + "\nPrice: INR " + price;
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int numBooks = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < numBooks; i++) {
            System.out.println("\nBook num " + (i + 1));

            System.out.print("fname: ");
            String authfname = sc.nextLine();

            System.out.print("lname: ");
            String authlname = sc.nextLine();

            System.out.print("title: ");
            String btitle = sc.nextLine();

            System.out.print("price: ");
            double bprice = sc.nextDouble();
            sc.nextLine();

            Author author = new Author(authfname, authlname);
            Book book = new Book(btitle, author, bprice);

            System.out.println("\nBook Details:");
            System.out.println(book.toString());
        }
    }
}
