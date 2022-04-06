/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction;

import java.util.Scanner;

/**
 *
 * @author HeyAl
 */


public class Introduction {
    private String address;
    private double StartTime;

    public Introduction(String address, double StartTime) {
        this.address = address;
        this.StartTime = StartTime;
    }
    public Introduction() {
        this.address = "no address";
        this.StartTime = 0;
    }
    public void getInput()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the introduction address: ");
        this.address = sc.nextLine();
        
        System.out.println("Enter the start time of the inrtoduction: ");
        this.StartTime = sc.nextDouble();
    }

    public String getAddress() {
        return address;
    }

    public double getStartTime() {
        return StartTime;
    }
    
}
