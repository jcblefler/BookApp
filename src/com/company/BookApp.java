package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BookApp {


    public static void main(String[] args) {

        String inputTitle;
        String inputAuthor;
        String inputDescription;
        double inputPrice;
        boolean inputInStock;
        String inputAnother = " ";

        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

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
                books.add(book);

            }
        }
        for(Book book: books){

            book.getDisplayText();

        }




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

//        HashMap<Integer, Book> bookList = new HashMap<>();
//        bookList.put(1, book1);
//        bookList.put(2, book2);
//        bookList.put(3, book3);
//        bookList.put(4, book4);

//        System.out.print("The price is $" + book.priceCheck(bookList) + " and the following books are not in stock: ");
//        book.getNoStockText();


    }
}
