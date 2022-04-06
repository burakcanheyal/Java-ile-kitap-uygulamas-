/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import Introduction.IntroInterface;
import Introduction.Introduction;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HeyAl
 */
public class NotPublished extends Books implements IntroInterface{
    private double pagePrice;
    
    private ArrayList<Introduction> arr = new ArrayList();

    public NotPublished(String name, String author, String publisher, int NumOfPage, int Stock, double pagePrice) {
        super(name, author, publisher, NumOfPage, Stock);
        this.pagePrice = pagePrice;
    }

    
    public NotPublished() {
        this.pagePrice = 0;
    }
    
    
    public void calculateprice(){
        super.setPrice((pagePrice * super.getNumOfPage()));
    }

    @Override
    public String toString() {
        return "\n\n--------Not Published----------" + super.toString()+
                "\nPlace and time:" + showintroductions();
    }
    
    public void getInput(){
        Scanner sc = new Scanner(System.in);
        String usr = "";
        
        super.getInput();
        do{
            System.out.println("Do you want to add place and time? (yes/no)");
            usr = sc.nextLine();
            if(usr.equalsIgnoreCase("yes"))
            {
                Introduction temp = new Introduction();
                temp.getInput();
                arr.add(temp);
            }
        }while(!usr.equalsIgnoreCase("no"));
        
        System.out.println("Enter the page price of the book: ");
        this.pagePrice = sc.nextDouble();
        
        calculateprice();
    }
    public String showintroductions(){
        String str = "";
        for(int i = 0; i < arr.size(); i++)
        {
            Introduction get = arr.get(i);
            str += "\nAddres: "+ get.getAddress()+ "\nTime: " + get.getStartTime();
        }
        
        return str;
    }
    public void setIntroduction(String place, Double time){
        Introduction temp = new Introduction(place, time);
        arr.add(temp);
    }
    
}
