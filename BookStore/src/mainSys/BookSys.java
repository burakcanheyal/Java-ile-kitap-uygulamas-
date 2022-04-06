/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainSys;

import bookstore.Books;
import bookstore.NotPublished;
import bookstore.Poem;
import bookstore.Published;
import bookstore.Roman;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HeyAl
 */
public class BookSys {
    public static ArrayList<Books> list= new ArrayList();
    public static int count = 0;
    
    public static boolean checkName (String name){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).findName(name))
                return true;
        }
            return false;
    }
    public static void addBook(){
        Scanner sc = new Scanner(System.in);
        String usr = "",name, pub,type, sto;
        int stock; 
        Books temp = null;
        
        do{
            System.out.println("Do you want to add book? (Y/N)");
            usr = sc.nextLine();
            
            if(usr.equalsIgnoreCase("y"))
            {
                System.out.println("Enter the name of the book: ");
                name = sc.nextLine();
                
                if(checkName(name)){
                    System.out.println("This book is already added.");
                    System.out.println("Do you want to change the number of books in the stock (Y/N)");
                    sto = sc.nextLine();
                    
                    if(sto.equalsIgnoreCase("y"))
                    {
                        System.out.println("Enter the number of added books: ");
                        stock = sc.nextInt();
                        sc.skip("\n");
                        
                        for(int i = 0; i < list.size(); i++){
                            if(list.get(i).findName(name))
                                temp = list.get(i);
                        }
                        temp.setStock(temp.getStock() + stock);
                    }
                }else{
                    do{
                        System.out.println("is book published? (y/n)");
                        pub = sc.nextLine();
                    }while(!pub.equalsIgnoreCase("y") && !pub.equalsIgnoreCase("n"));
                    
                    if(pub.equalsIgnoreCase("y"))
                    {
                        do{
                            System.out.println("Roman or Poem? (P/R)");
                            type = sc.nextLine();
                        }while(!type.equalsIgnoreCase("p") && !type.equalsIgnoreCase("r"));
                        
                        if(type.equalsIgnoreCase("p"))
                            temp = new Poem();
                        else
                            temp = new Roman();
                    }else{
                        temp = new NotPublished();
                    }
                    temp.setName(name);
                    temp.getInput();
                    list.add(temp);
                    count++;
                    System.out.println("Book is added!");
                }
                
            }
            
        }while(usr.equalsIgnoreCase("y"));
    }
    public static boolean addRoman(String name, String author, String publisher, int NumOfPage, int Stock, int publicationYear, double pagePrice, String Topic){
    
        if(checkName(name))
            return false;
        else{
            Roman temp = new Roman(name, author, publisher, NumOfPage, Stock, publicationYear, pagePrice, Topic);
            list.add(temp);
            return true;
        }
    }
    public static boolean addPoem(String name, String author, String publisher, int NumOfPage, int Stock, int publicationYear, double pagePrice, String Content){
    
        if(checkName(name))
            return false;
        else{
            Poem temp = new Poem(name, author, publisher, NumOfPage, Stock, publicationYear, pagePrice, Content);
            list.add(temp);
            return true;
        }
    }
    public static String addNP(String name, String author, String publisher, int NumOfPage, int Stock, double pagePrice, String place, Double time){
    
        if(checkName(name)){
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).findName(name)){
                    NotPublished temp = (NotPublished) list.get(i);
                    temp.setIntroduction(place, time);
                    return "ok";
                }
            }
        }else{
            NotPublished temp = new NotPublished(name, author, publisher, NumOfPage, Stock, pagePrice);
            list.add(temp);
            return "nok";
        }
        
        return "yok";
        
    }
    public static boolean changestock(String name, int stock){
        Books temp;
        
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).findName(name))
            {
                temp = list.get(i);
                
                temp.setStock(temp.getStock() + stock);
                
                return true;
            }
        }
        return false;
    }
    public static String removeBook(String name){
        Books temp;
        
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).findName(name))
            {
                temp = list.get(i);
                list.remove(i);
                count--;
                return "" + temp.toString();
            }
        }
        return "No";
    }
    public static String displayAllBook(){
        String str = "";
        for(int i = 0; i < list.size(); i++)
        {
            str += list.get(i).toString();
        }
        return str;
    }
    public static String searchBooks(String name){
        String str;
        Books temp;
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).findName(name))
            {
                temp = list.get(i);
                
                return temp.toString();
            }
        }
        return "no";
    }
    public static String showStock(String name) {
        String str;
        Books temp;
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).findName(name))
            {
                temp = list.get(i);
                
                return temp.getStock()+ "";
            }
        }
        return "The book is not added!";
    }
    public static String displayPubBooks(){
    String str = "";
    int temp = 0;
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i) instanceof Published)
            {
                temp++;
                str += list.get(i).toString();
            }
        }
        if(temp > 0)
            return str;
        else
            return "There is no published books";
    }
    public static String displayNPubBooks(){
    String str = "";
    int temp=0;
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i) instanceof NotPublished)
            {
                temp++;
                str += list.get(i).toString();
            }
        }
        if(temp > 0)
            return str;
        else
            return "There is no not-published books";
    }
    public static String displayRomanBooks(){
    String str = "";
    int temp=0;
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i) instanceof Roman)
            {
                temp++;
                str += list.get(i).toString();
            }
        }
        if(temp > 0)
            return str;
        else
            return "There is no Roman";
    }
    public static String displayPoemBooks(){
    String str = "";
    int temp=0;
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i) instanceof Poem)
            {
                temp++;
                str += list.get(i).toString();
            }
        }
        if(temp > 0)
            return str;
        else
            return "There is no Poem";
    }}
