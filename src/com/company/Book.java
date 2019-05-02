package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Book {

    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;
    private String sku;
    private double adder;
    private ArrayList<String> noStock = new ArrayList<>();

    public Book() {
    }

    public Book(String title, String author, String description, double price, boolean isInStock, String sku) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
        this.sku = sku;
    }


    public double priceCheck(HashMap<Integer, Book> booklist){
        for (Book book: booklist.values()){
            if (book.isInStock()){
                setAdder(getAdder() + book.getPrice());
            } else {
                noStock.add(book.getTitle());
            }
        }
        return getAdder();
    }

    public void getDisplayText(){
        System.out.println(getTitle());
        System.out.println(getAuthor());
        System.out.println(getDescription());
        System.out.println(getPrice());
        System.out.println(isInStock());
        System.out.println(getSku());
        System.out.println();
    }

    public void getNoStockText(){
        for(String book : noStock){
            System.out.print(book + ", ");
        }
    }










    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getAdder() {
        return adder;
    }

    public void setAdder(double adder) {
        this.adder = adder;
    }

    public ArrayList<String> getNoStock() {
        return noStock;
    }

    public void setNoStock(ArrayList<String> noStock) {
        this.noStock = noStock;
    }
}
