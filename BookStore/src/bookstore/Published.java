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
public class Published extends Books{
    private int publicationYear;
    private double pagePrice;

    public Published(String name, String author, String publisher, int NumOfPage, int Stock, int publicationYear, double pagePrice) {
        super(name, author, publisher, NumOfPage, Stock);
        this.publicationYear = publicationYear;
        this.pagePrice = pagePrice;
        calculateprice();
        super.bookCount++;
    }

    public Published() {
        this.publicationYear = 0;
        this.pagePrice = 5;
    }
    public void calculateprice(){
        super.setPrice((pagePrice * super.getNumOfPage()));
    }

    @Override
    public String toString() {
        return "" + super.toString()+
                "\nPublication Year= " + publicationYear;
    }
    
    
    public void getInput(){
        Scanner sc = new Scanner(System.in);
        super.getInput();
        System.out.println("Enter the publication year: ");
        this.publicationYear = sc.nextInt();
        
        System.out.println("Enter the page price of the book: ");
        this.pagePrice = sc.nextDouble();
        
        calculateprice();
        super.bookCount++;
    }
    
}
