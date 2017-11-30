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
import exceptions.MenuControlException;


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
    boolean paramsNotOkay;

    public ListView(String message) {
        super("");
    }
    
     public void displayListView()throws ListControlException, MenuControlException{
       
     int option;
     int total=0;  
      
        this.console.println("\nWhat list would you like to view?"
                           + "\n1-Livestock"
                           + "\n2-Tools"
                           + "\n3-Fields"
                           + "\n5-Exit to Game Menu\n");
        
         //get input and validate
        do {
           
            option = this.getInput();
            
            if (option <= 0 || option >= 4) {
                if (option == 5) {
                    this.console.println("Exiting to Game Menu...");
                } else {
                   ErrorView.display(this.getClass().getName(),"Please choose 1 - 3 or 5 To Exit.");
                   this.displayListView();
                }
            }
        } while (option != 5 && option <= 0 && option >= 4);
        
//if user input 5, send them to the game menu
        if (option == 5) {
            do{
                paramsNotOkay = false;
                try {
                    GameMenuView gameMenu = new GameMenuView();
                    gameMenu.displayGameMenu();
                } catch(MenuControlException e) {
                    ErrorView.display(this.getClass().getName(),e.getMessage());
                    paramsNotOkay = true;
                }
            } while(paramsNotOkay);
        }
  //if user enters 1, the livestock list will display
       if (option == 1) {
           this.console.println("Livestock List");
        //  
         InventoryItem[] items = GameControl.createItems();
         
          //this adds up the total quantity for all the livestock    InventoryItem item : items   
          for (int i=0; i<3; i++){
             
              /* for (*/InventoryItem n = items[i]; 
                   
                    total += n.quantity;
                   this.console.println(n.description);
                      
         
  }
          this.console.println("\nYou have a total of " + total + " livestock.");
          
          
  }
       total = 0;
 
       //if user enter 2 the tools list will display     
       if (option == 2){
  this.console.println("Tools List");
           InventoryItem[] items = GameControl.createItems();
   
//this adds up the total quantity for all the tools        
           for (int i=3; i<6; i++){
               
               InventoryItem n = items[i];
               
                    total += n.quantity;
                    this.console.println(n.description);
  
  
  }
          this.console.println("\nYou have a total of " + total + " Tools.");
                  this.console.println("\nExiting to Game Menu...");
  
 } 

          
       // if user enters 3 the fields list will display. Darren Kearns
       if (option == 3){
       this.console.println("Field List");
            InventoryField[] fields = GameControl.createField();
            //Calculate quantity of fields. 
               for (InventoryField field : fields) {
                    total += field.quantity;
                    this.console.println(field.description + " - " + field.quantity);
            }
          
       
            this.console.println("\nYou have a total of " + total + " Fields.");
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