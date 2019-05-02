package com.company;

import java.util.HashMap;

public class BookDatabase extends Book{

    private HashMap<String, Book> bookDatabase = new HashMap<>();


    public BookDatabase() {
    }

    public void addBook(String x, Book b){
        bookDatabase.put(x, b);
    }

    public Book getBook(String sku){
            return bookDatabase.get(sku);
    }


    public HashMap<String, Book> getBookDatabase() {
        return bookDatabase;
    }

    public void setBookDatabase(HashMap<String, Book> bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

}
