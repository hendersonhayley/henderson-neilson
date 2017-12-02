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
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import yearsofplenty.YearsOfPlenty;


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

    public ListView() {//Hayley Henderson entered 12-2 to make it more of a menuview
        super("\n********************************************" 
              + "\n*                                        *"
              + "\n*  Which list would you like to view?    *"
              + "\n*                                        *"
              + "\n*  1 - Livestock                         *" 
              + "\n*  2 - Tools                             *"
              + "\n*  3 - Fields                            *"
              + "\n*  4 - Print lists                       *"
              + "\n*  5 - Quit: quits the game.             *"
              + "\n*                                        *"
              + "\n******************************************");
    }
    
     public void displayListView()throws ListControlException, MenuControlException{
         
         this.display();
       
     int option;
     int total=0;
     int report;
      
       
        
         //get input and validate
        do {
           
            option = this.getInput();
            
            if (option <= 0) {
                if (option == 5) {
                    this.console.println("Exiting to Game Menu...");
                } else {
                   ErrorView.display(this.getClass().getName(),"Please choose 1 - 4 or 5 To Exit.");
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
          this.console.println("\nExiting to Game Menu...");
          
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
            this.console.println("\nExiting to Game Menu...");
 }
 
       //Printing a Report of items in the list
       //Author:  Hayley henderson
       //1-If the user enters 4 ask which list to print.
       //2-Prompt the user for a file path of where the report is to be printed.
      // 3- Get the file path entered by the end user.
      // 4-Call another View Layer function that actually prints the report. This
      //  report must use a character output stream to write to the file, and
      //  use a for statement to go through the list of items to be displayed.
      //  The report must include a title, column headings and at least two
      //  columns of data for each item in the list.
      // 5-Display a success message to the console if the report was printed
      //  successfully to the specified file path.
      // 6-Catch all runtime exceptions thrown during the execution of this end
      //  user story. For each exception, call the ErrorView.display()
      //  function to display the message to the console and print the
      //  message to the log file.
      
 if (option == 4){
         
        //This prompt asks the user which list to print.   
          this.console.println("\nWhich List would you like to print?" 
                                + "\n*  1 - Livestock                         *" 
                                + "\n*  2 - Tools                             *"
                                + "\n*  3 - Fields                            *");
        //this gets the input
          report = this.getInput();
          
       if (report == 1){
           //this prompt asks the user where the file path is for their report
        this.console.println("\nEnter the file path where the report will be printed to.");
        //this gets the path entered
        String filePath = this.getStringInput();
       
           //call the lievstockReport function
           this.livestockReport();
       }
     }
      
  }
   
    //This function will generate the livestockReport Generated by Hayleyhenderson
     public void livestockReport()throws ListControlException, MenuControlException {
         int total=0;
         FileWriter outFile  = null; //this defines a variable for the datastream
         
         String fileLocation = "report.txt"; //specify the location for the file
      
         try{
           
             outFile = new FileWriter(fileLocation);
        
            
           //print title and colum headings        
           outFile.write("\n\n Livestock List ");
           
           
        InventoryItem[] items = GameControl.createItems(); 
        
        //prints off the description of items in list to file
        for (int i=0; i<3; i++){
             
              /* for (*/InventoryItem n = items[i]; 
                   
                    total += n.quantity;
                   
                   outFile.write("\n" + n.getDescription()+ "\n");
              
                   
       } 
        outFile.flush();//closing file
        
        //checking to see if file was filled and saved.  
         }catch (IOException ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        } finally {
             if (outFile !=null){
                 try{
                     outFile.close();
                     this.console.println("\nYour Report was saved to your file");
                 } catch (IOException ex2){
                    this.console.println("Error closing file");
                 }
             }
         }
         
     }
         
     }    
         
          
             
        
        
        
         
        
        
        
      
       
 
