package lab_7;

import java.io.*;
import java.util.*;

class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Book() {
        this.id = 0;
        this.name = null;
        this.author = null;
        this.publisher = null;
        this.quantity = 0;
    }

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class books {
    public static void main(String[] args) {
        int i, n, flag = 0;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        Book[] b = new Book[n];
        LinkedHashSet<Book> bb = new LinkedHashSet<Book>(n);
        for (i = 0; i < n; i++) {
            b[i] = new Book();
            b[i].setId(Integer.parseInt(sc.nextLine()));
            b[i].setName(sc.nextLine());
            b[i].setAuthor(sc.nextLine());
            b[i].setPublisher(sc.nextLine());
            b[i].setQuantity(Integer.parseInt(sc.nextLine()));
            bb.add(b[i]);
        }
        String searchBook = sc.nextLine();
        for (Book b1 : bb) {
            System.out.println(b1.getId() + " " + b1.getName() + " " + b1.getAuthor() + " " + b1.getPublisher() + " "
                    + b1.getQuantity());
        }
        for (Book b2 : bb) {
            if (b2.getName().contains(searchBook)) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println(searchBook + " is present in the set");
        } else {
            System.out.println(searchBook + " is not present in the set");
        }
    }
}