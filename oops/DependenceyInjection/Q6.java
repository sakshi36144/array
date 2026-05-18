package DependenceyInjection;
/*
Book Information

Create a Book class with:

bookId
title
author
pages
price
publication
language
 */

class Book {
    // attributes / properties / instance variables
   private int bookId;
   private String title;
   private String author;
   private int pages;
   private double price;
   private String publication;
   private String language;

    // method to display book details
    // instance method to display book details
    public void BookDetails() {
        System.out.println("Book Id is : " + bookId);
        System.out.println(" Title is : " + title);
        System.out.println("Author is : " + author);
        System.out.println("Pages are : " + pages);
        System.out.println("Price is : " + price);
        System.out.println("Publication is : " + publication);
        System.out.println("Language is : " + language);
        System.out.println("--------------------------");
    }

    // method for dependency injection
    public void DI(int bookId, String title, String author, int pages, double price, String publication,
            String language) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.publication = publication;
        this.language = language;

    }
}
public class Q6 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.DI(1, "The Great Gatsby", "F. Scott Fitzgerald", 180, 12.99, "Scribner", "English");
        book1.BookDetails();
    }
}
