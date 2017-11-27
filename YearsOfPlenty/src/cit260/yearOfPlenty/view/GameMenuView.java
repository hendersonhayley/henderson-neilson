/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.view;

import exceptions.CropControlException;
import exceptions.ListControlException;
import java.util.Scanner;

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

    public void displayGameMenu() {
        
        this.display();
        
        do {
            option = this.getInput();     //get the entered input
            
            if(option<1 || option>MAX){
                System.out.println("Invalid entry, Please choose an option of 1-5.");
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
                ListView list = new ListView("");
                list.displayListView();
                 } catch(ListControlException e){
            System.out.println(e.getMessage());
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
            else if (option==5){
                MainMenuView MainMenuView = new MainMenuView();
                MainMenuView.displayMainMenu();
            }
        } while (option!=MAX);
       
    }
    
    public void newLocation(){
        MapView map = new MapView("");
        map.displayMapView();
    }
    
}
