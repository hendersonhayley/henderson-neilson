/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.view;

import cit260.yearOfPlenty.InventoryField;
import cit260.yearOfPlenty.InventoryItem;
import cit260.yearOfPlenty.control.GameControl;
import exceptions.CropControlException;
import exceptions.ListControlException;


/**
 *
 * @author hayley henderson  I did the livestock and tools list. 
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
    
     public void displayListView()throws ListControlException{
       
     int option;
     int total=0;  
      
        System.out.println("\nWhat list would you like to view?"
                           + "\n1-Livestock"
                           + "\n2-Tools"
                           + "\n3-Fields"
                           + "\n5-Exit to Game Menu\n");
        
         //get input and validate
        do {
           
            option = this.getInput();
            
            if (option <= 0 || option >= 4) {
                if (option == 5) {
                    System.out.println("Exiting to Game Menu...");
                } else {
                   throw new ListControlException("Please choose 1 - 3 or 5 To Exit.");
                }
            }
        } while (option != 5 && option <= 0 && option >= 4);
        
//if user input 5, send them to the game menu
        if (option == 5) {
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayGameMenu();
        }
  //if user enters 1, the livestock list will display
       if (option == 1) {
           System.out.println("Livestock List");
        //  
         InventoryItem[] items = GameControl.createItems();
         
          //this adds up the total quantity for all the livestock    InventoryItem item : items   
          for (int i=0; i<3; i++){
             
              /* for (*/InventoryItem n = items[i]; 
                   
                    total += n.quantity;
                   System.out.println(n.description);
                      
         
  }
          System.out.println("\nYou have a total of " + total + " livestock.");
          
          
  }
       total = 0;
 
       //if user enter 2 the tools list will display     
       if (option == 2){
  System.out.println("Tools List");
           InventoryItem[] items = GameControl.createItems();
   
//this adds up the total quantity for all the tools        
           for (int i=3; i<6; i++){
               
               InventoryItem n = items[i];
               
                    total += n.quantity;
                    System.out.println(n.description);
  
  
  }
          System.out.println("\nYou have a total of " + total + " Tools.");
                  System.out.println("\nExiting to Game Menu...");
  
 } 

          
       // if user enters 3 the fields list will display. Darren Kearns
       if (option == 3){
       System.out.println("Field List");
            InventoryField[] fields = GameControl.createField();
            //Calculate quantity of fields. 
               for (InventoryField field : fields) {
                    total += field.quantity;
                    System.out.println(field.description + " - " + field.quantity);
            }
          
       
            System.out.println("\nYou have a total of " + total + " Fields.");
 }
 
       
        /**
       *Old code from just printing off the items list 
        *System.out.println("Items");
        *InventoryItem[] items = GameControl.createItems();
        *for (InventoryItem item : items) {
        *    System.out.println(item.description);
        *}
        * */
        
        /* Darren Kearns Test.
        System.out.println("\nActors");
        InventoryActor[] actors = GameControl.createActor();
        for (InventoryActor actor : actors) {
            System.out.println(actor.description);
        }
    */
    
}  
}