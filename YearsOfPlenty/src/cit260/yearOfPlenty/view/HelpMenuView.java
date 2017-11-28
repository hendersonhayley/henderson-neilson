/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.view;

import exceptions.MenuControlException;
import java.util.Scanner;

/**
 *
 * @author Brennan.Neilson
 */
public class HelpMenuView extends View {
    
    boolean paramsNotOkay;
    
    public HelpMenuView() {
        super("\n*******************************************************************************"
              + "\n*                                                                           *"
              + "\n*  Help Menu                                                                *"
              + "\n*                                                                           *"
              + "\n*  1 - Start New Game: Starts a brand new game.                             *"
              + "\n*  2 - Get and Start a Saved Game: Loads your previously saved game data.   *"
              + "\n*  3 - Get Help on How to Play: Displays this help menu.                    *"
              + "\n*  4 - Save This Game: Saves your current game progress.                    *"
              + "\n*  5 - Quit: quits the game.                                                *"
              + "\n*                                                                           *"
              + "\n*****************************************************************************");
    }
    
    int option;

    public void displayHelpMenu() throws MenuControlException {
        
        this.display();
        
        //get input and validate
        do {
           
            option = this.getInput();
            
            if (option <= 0 || option <=4 || option >= 5) {
                if (option == 5) {
                    System.out.println("Exiting to Main Menu.");
                } else {
                   throw new MenuControlException("Invalid entry, Enter 5 to exit to Main Menu: ");
                }
            }
        } while (option != 5 && option <= 0 && option > 5);
        
        //if user input 5, send them back to the main menu
        if (option == 5) {
            do{
                paramsNotOkay = false;
                try {
                    MainMenuView mainMenu = new MainMenuView();
                    mainMenu.displayMainMenu();
                } catch(MenuControlException e) {
                    System.out.println(e.getMessage());
                    paramsNotOkay = true;
                }
            } while(paramsNotOkay);

        }
        
    }
    
}
