/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainSys;

import GUI.MainFrame;
import bookstore.Poem;
import bookstore.Roman;
import java.util.Scanner;

/**
 *
 * @author HeyAl
 */
public class BookStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner sc = new Scanner(System.in);
        String temp;
        BookSys.addBook();
        
        System.out.println("Displaying\n----------------\n" + BookSys.displayAllBook());
        
        System.out.println("Enter the name of the book you want to remove: ");
        temp = sc.nextLine();
        
        System.out.println("" + BookSys.removeBook(temp).toString());
        
        System.out.println("Enter the name of the book you want to search: ");
        temp = sc.nextLine();
        System.out.println("" + BookSys.searchBooks(temp));
        
        System.out.println("Enter the name of the book you want to see stock: ");
        temp = sc.nextLine();
        System.out.println("" + BookSys.showStock(temp));*/
        MainFrame m1 = new MainFrame();
        
        m1.setVisible(true);
    }
    
}
