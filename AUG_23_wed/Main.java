package AUG_23_wed;
import java.util.Scanner;
class Book {
    public String title;
    public String author;
    public String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

class BookCollection {
    public static final int MAX_BOOKS = 100; 
    public Book[] books;
    public int numBooks;

    public BookCollection() {
        books = new Book[MAX_BOOKS];
        numBooks = 0;
    }

    public void add(Book book) {
        if (numBooks < MAX_BOOKS) {
            books[numBooks] = book;
            numBooks++;
            System.out.println("Book added to the collection.");
        } else {
            System.out.println("Collection is full. Cannot add more books.");
        }
    }

    public void remove(String isbn) {
        for (int i = 0; i < numBooks; i++) {
            String isb = books[i].getISBN();
            if (isb.equals(isbn)) {
                for (int j = i; j < numBooks - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[numBooks - 1] = null;
                numBooks--;
                System.out.println("Book removed from the collection.");
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found in the collection.");
    }

    public void displayBooks() {
        System.out.println("Books in the collection:");
        for (int i = 0; i < numBooks; i++) {
            System.out.println(books[i]);
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookCollection collection = new BookCollection();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    Book newBook = new Book(title, author, isbn);
                    collection.add(newBook);
                    break;
                case 2:
                    System.out.print("Enter ISBN of the book to remove: ");
                    String isbnToRemove = sc.nextLine();
                    collection.remove(isbnToRemove);
                    break;
                case 3:
                    collection.displayBooks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
