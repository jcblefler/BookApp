package com.company;

import java.util.HashMap;

public class BookApp {

    public static void main(String[] args) {

        Book book = new Book();

        Book book1 = new Book();
        book1.setTitle("Hello World!");
        book1.setAuthor("Adam");
        book1.setDescription("This book is about world languages.");
        book1.setPrice(19.99);
        book1.setInStock(true);

        Book book2 = new Book("Hello Space", "Neil", "This book is about space.", 19.99, true);
        Book book3 = new Book("Hello ant", "antony", "This book is about ants.", 19.99, false);
        Book book4 = new Book("Hello dog", "fido", "This book is about dogs.", 19.99, false);

        book1.getDisplayText();
        book2.getDisplayText();

        HashMap<Integer, Book> bookList = new HashMap<>();
        bookList.put(1, book1);
        bookList.put(2, book2);
        bookList.put(3, book3);
        bookList.put(4, book4);

        System.out.print("The price is $" + book.priceCheck(bookList) + " and the following books are not in stock: ");
        book.getNoStockText();
    }
}
