/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.view;

import java.util.Scanner;

/**
 *
 * @author Brennan.Neilson
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        
        System.out.println(this.displayMessage);
        
    }

    @Override
    public int getInput() {
        
        Scanner keyboard = new Scanner(System.in);
        int option;
        
        System.out.println("Please enter a number.");
        option = keyboard.nextInt();
            
        return option;
        
    }

    
}
