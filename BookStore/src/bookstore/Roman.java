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
public class Roman extends Published{
    private String Topic;

    public Roman(String name, String author, String publisher, int NumOfPage, int Stock, int publicationYear, double pagePrice, String Topic) {
        super(name, author, publisher, NumOfPage, Stock, publicationYear, pagePrice);
        this.Topic = Topic;
    }

    public Roman(){
        this.Topic = "no topic";
    }
    
    public void getInput(){
        Scanner sc = new Scanner(System.in);
        
        super.getInput();
        System.out.println("Enter the topic of the roman: ");
        this.Topic = sc.nextLine();
    }

    @Override
    public String toString() {
        return "\n\n---------Roman-------\n" + super.toString() +
                "\nTopic of the Roman= " + Topic ;
    }
    
}
