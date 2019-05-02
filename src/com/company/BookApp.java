package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BookApp {


    public static void main(String[] args) {

        String inputAnother = " ";


        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();
        BookDatabase database = new BookDatabase();

       books.add(new Book("Head First Java", "Kathy Sierra and Bert Bates", "Easy to read Java workbook", 47.50, true, "Java1001"));
       books.add(new Book("Thinking in Java", "Bruce Eckel", "Details about Java under the hood", 20.00, true, "Java1002"));
       books.add(new Book("OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky", "Everything you need to know in one place", 45.00, true, "Orcl1003"));
       books.add(new Book("Automate the Boring Stuff with Python", "Al Sweigart", "Fun with Python", 10.50, false, "Python1004"));
       books.add(new Book("The Maker's Guide to the Zombie Apocalypse", "Simon Monk", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50, true, "Zombie1005"));
       books.add(new Book("Raspberry Pi Projects for the Evil Genius", "Donald Norris", "A dozen fiendishly fun projects for the Raspberry Pi!", 14.75, true, "Rasp1006"));

        for(Book book: books){
            database.addBook(book.getSku(), book);
        }

        while (!inputAnother.equalsIgnoreCase("n")) {

            Book book = new Book();

            System.out.println("Would you like to add a book? (y/n)");
            inputAnother = scanner.next();
            scanner.nextLine();
            if (inputAnother.equalsIgnoreCase("y")){
                System.out.print("Book Title: ");
                book.setTitle(scanner.nextLine());
                System.out.print("Book Author: ");
                book.setAuthor(scanner.nextLine());
                System.out.print("Book Description: ");
                book.setDescription(scanner.nextLine());
                System.out.print("Book Price: $");
                book.setPrice(scanner.nextInt());
                System.out.print("Book in Stock (y/n): ");
                if (scanner.next().equalsIgnoreCase("y")){
                    book.setInStock(true);
                } else {
                    book.setInStock(false);
                }
                System.out.print("Book SKU: ");
                scanner.nextLine();
                String sku = scanner.nextLine();
                book.setSku(sku);
                database.setSku(sku);

                books.add(book);
                database.addBook(book.getSku(), book);

            }
        }
        for(Book book: books){

            book.getDisplayText();

        }
        System.out.println("enter a SKU: ");
        database.getBook(scanner.next()).getDisplayText();




//        Book book1 = new Book();
//        book1.setTitle("Hello World!");
//        book1.setAuthor("Adam");
//        book1.setDescription("This book is about world languages.");
//        book1.setPrice(19.99);
//        book1.setInStock(true);
//
//        Book book2 = new Book("Hello Space", "Neil", "This book is about space.", 19.99, true);
//        Book book3 = new Book("Hello ant", "antony", "This book is about ants.", 19.99, false);
//        Book book4 = new Book("Hello dog", "fido", "This book is about dogs.", 19.99, false);
//
//
//        book1.getDisplayText();
//        book2.getDisplayText();

//        HashMap<Integer, Book> bookList = new HashMap<>();
//        bookList.put(1, book1);
//        bookList.put(2, book2);
//        bookList.put(3, book3);
//        bookList.put(4, book4);

//        System.out.print("The price is $" + book.priceCheck(bookList) + " and the following books are not in stock: ");
//        book.getNoStockText();


    }
}
