/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import yearsofplenty.YearsOfPlenty;

/**
 *
 * @author Brennan.Neilson
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    protected final BufferedReader keyboard = YearsOfPlenty.getInFile();
    protected final PrintWriter console = YearsOfPlenty.getOutFile();
    
    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        
        this.console.println(this.displayMessage);
        
    }

    @Override
    public int getInput() {
        
        Scanner keyboard = new Scanner(System.in);
        int option;
        
        this.console.println("Please enter a number.");
        option = keyboard.nextInt();
            
        return option;
        
    }

    
}
