package com.company;

public class BookApp {

    public static void main(String[] args) {


        Book book1 = new Book();
        book1.setTitle("Hello World!");
        book1.setAuthor("Adam");
        book1.setDescription("This book is about world languages.");
        book1.setPrice(19.99);
        book1.setInStock(true);

        Book book2 = new Book("Hello Space", "Neil", "This book is about space.", 19.99, true);

        book1.getDisplayText();
        book2.getDisplayText();

    }
}
