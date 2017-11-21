/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.view;

import cit260.yearOfPlenty.InventoryActor;
import cit260.yearOfPlenty.InventoryItem;
import cit260.yearOfPlenty.control.GameControl;


/**
 *
 * @author hayley henderson
 *  Purpose: Let the user decide which list to view.  Livestock or Tools? 
 * Once the user has decided which list to view.  The total sum of each list will
 * show.  
 * 
 * prompt user which list to view
 * get input
 * test input for validity
 * if option --1, show user the list of livestock as well as the sum total of livestock
 * if option ==2, show user the list of tools as well as the sum total of tools
 * Or if input 5 for exit game menu
 * 
 * 
 *  
 * 
 * 
 *
 */
public class ListView extends View{

    public ListView(String message) {
        super("");
    }
    
    public void displayListView(){
       
     int option;
     int total=0;  
      
        System.out.println("\nWhat list would you like to view?"
                           + "\n1-Livestock"
                           + "\n2-Tools"
                           + "\n5-Exit to Game Menu");
        
         //get input and validate
        do {
            option = this.getInput();
            
            if (option <= 0 || option >= 3) {
                if (option == 5) {
                    System.out.println("Exiting to Game Menu...");
                } else {
                    System.out.println("Please choose 1 or 2.");
                }
            }
        } while (option != 5 && option <= 0 && option >= 3);
        
//if user input 5, send them to the game menu
        if (option == 5) {
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayGameMenu();
        }

  //if user enters 1, the livestock list will display
       if (option ==1) {
           System.out.println("Livestock List");
          InventoryItem[] items = GameControl.createItems();
  
          //this adds up the total quantity for all the livestock       
          for (int i=0; i<2; i++){
               for (InventoryItem item : items)               {
                     total += item.quantity;
                   System.out.println(item.description);
  }
  
  }
          System.out.println("You have a total of" + total + "livestock.");
  }
       total = 0;
 
       //if user enter 2 the tools list will display     
       if  (option == 2){
  System.out.println("Tools List");
           InventoryItem[] items = GameControl.createItems();
   
//this adds up the total quantity for all the tools        
           for (int i=3; i<5; i++){
               for (InventoryItem item : items) {
                    total += item.quantity;
                    System.out.println(item.description);
  }
  
  }
          System.out.println("You have a total of" + total + "Tools.");
  
 } 
       
        /**
       *Old code from just printing off the items list 
        *System.out.println("Items");
        *InventoryItem[] items = GameControl.createItems();
        *for (InventoryItem item : items) {
        *    System.out.println(item.description);
        *}
        * */
        
        /*
        //Darren Kearns 
        System.out.println("\nActors");
        InventoryActor[] actors = GameControl.createActor();
        for (InventoryActor actor : actors) {
            System.out.println(actor.description);
        }
    */
    
    }
    
}