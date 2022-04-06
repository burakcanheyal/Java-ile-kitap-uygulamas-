/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import java.util.Scanner;

/**
 *
 * @author HeyAl
 */
public abstract class Books {
    protected String name, author, publisher;
    protected int NumOfPage, Stock;
    protected double price;
    protected int bookCount = 0;
    
    public Books(String name, String author, String publisher, int NumOfPage, int Stock) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.NumOfPage = NumOfPage;
        this.Stock = Stock;
        this.price = 0;
    }

    public Books() {
        this.name = "no name";
        this.author = "no author";
        this.publisher = "no publisher";
        this.NumOfPage = 0;
        this.Stock = 0;
        this.price = 0;
    }

    public int getBookCount() {
        return bookCount;
    }
    
    public boolean findName(String name)
    {
        if(this.name.equalsIgnoreCase(name))
            return true;
        
        return false;
    }
    
    public void getInput(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the author name: ");
        this.author = sc.nextLine();
        
        System.out.println("Enter the publisher name: ");
        this.publisher = sc.nextLine();
        
        System.out.println("Enter the number of page: ");
        this.NumOfPage = sc.nextInt();
        
        System.out.println("Enter the number of books in stock: ");
        this.Stock = sc.nextInt();
    }

    public int getNumOfPage() {
        return NumOfPage;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "\nName of the book= " + name + 
                "\nName of the author= " + author +
                "\nName of the publisher= " + publisher +
                "\nNumber Of the Page= " + NumOfPage + 
                "\nStock= " + Stock + 
                "\nPrice= " + price;
    }
    
    public abstract void calculateprice();

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public int getStock() {
        return Stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
