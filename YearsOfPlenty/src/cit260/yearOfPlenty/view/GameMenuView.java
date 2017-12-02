/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.view;

import exceptions.ListControlException;
import exceptions.MenuControlException;

/**
 *
 * @author Brennan.Neilson
 */
public class GameMenuView extends View {
    public static final int MAX = 5;
    boolean paramsNotOkay;
    
    public GameMenuView() {
        super("\n*************************************"
              + "\n*                                   *"
              + "\n*  Game Menu                        *"
              + "\n*                                   *"
              + "\n*  1 - View the map                 *"
              + "\n*  2 - View Lists                   *"
              + "\n*  3 - Move to a new location       *"
              + "\n*  4 - Manage Crops                 *"
              + "\n*  5 - Quit                         *"
              + "\n*                                   *"
              + "\n*************************************");
    }
    
    int option;

    public void displayGameMenu() throws MenuControlException {
        
        this.display();
        
        //get input and validate
        do {
           
            option = this.getInput();
            
            if (option <= 0 || option >= 5) {
                if (option == 5) {
                    this.console.println("Exiting to Main Menu...");
                } else {
                   ErrorView.display(this.getClass().getName(),"Invalid entry, Please choose an option of 1-5.");
                   this.displayGameMenu();
                }
            }
        } while (option != 5 && option <= 0 && option > 5);
        
        //if user input 5, send them to the main menu
        if (option == 5) {
            do{
                paramsNotOkay = false;
                try {
                    MainMenuView mainMenu = new MainMenuView();
                    mainMenu.displayMainMenu();
                } catch(MenuControlException e) {
                   ErrorView.display(this.getClass().getName(),e.getMessage());
                    paramsNotOkay = true;
                }
            } while(paramsNotOkay);
        }
            
            if (option==1){
                MapView map = new MapView("");
                map.displayMapView();
            }
            
           
             else if (option==2){
         //setting up the control exceptions for listview
    
         do{
            paramsNotOkay = false;
            try {
                ListView list = new ListView();
                list.displayListView();
                 } catch(ListControlException e){
            ErrorView.display(this.getClass().getName(),e.getMessage());
            paramsNotOkay = true;
        }
        } while(paramsNotOkay);
            }
             
             
            else if (option==3){
                this.newLocation();
            }
            else if (option==4){
                CropsView CropsView = new CropsView();
                CropsView.displayCropsView();
            }
       
    }
    
    public void newLocation() throws MenuControlException{
        MapView map = new MapView("");
        map.displayMapView();
    }
    
}
