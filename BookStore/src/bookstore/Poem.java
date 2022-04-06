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
public class Poem extends Published{
    private String Content;

    public Poem(String name, String author, String publisher, int NumOfPage, int Stock, int publicationYear, double pagePrice, String Content) {
        super(name, author, publisher, NumOfPage, Stock, publicationYear, pagePrice);
        this.Content = Content;
    }

    public Poem(){
        this.Content = "no content";
    }
    
    public void getInput(){
        Scanner sc = new Scanner(System.in);
        
        super.getInput();
        System.out.println("Enter the content of the poem: ");
        this.Content = sc.nextLine();
    }

    @Override
    public String toString() {
        return "\n\n---------Poem-------\n" + super.toString() +
                "\nContent of the Poem= " + Content ;
    }
    
}
