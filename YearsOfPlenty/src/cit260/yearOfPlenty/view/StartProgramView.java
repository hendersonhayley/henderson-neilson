/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.view;

import cit260.yearOfPlenty.control.GameControl;
import exceptions.MenuControlException;
import java.util.Scanner;

/**
 *
 * @author Darren
 */
public class StartProgramView extends View{
    
    private String promptMessage;
    
    public StartProgramView() {
        super("");
        this.promptMessage="\nPlease enter your name: ";
        //Display the banner when view created.
        this.displayBanner();
        
    }

    private void displayBanner() {
        this.console.println(
                "\n**********************************************"
              + "\n*                                            *"
              + "\n* This is the game of Year of Plenty         *"
              + "\n* in this game you will feed your people     *"
              + "\n* and keep the pharaoh happy or face the     *"
              + "\n* consequences.                              *"
              + "\n*                                            *"
              + "\n**********************************************"
  
        );
    }

    public void displayStartProgramView() throws MenuControlException {
        /*displayView(): void
        BEGIN
        do
            Prompt for and get the input value
            if (value == “Q”) then
                return

            do requested action and display the next view
        
        while the view is not done
        END */
        
        String playerName = this.getPlayerName();
        GameControl.createPlayer(playerName);
        
        this.console.println("\n\n\n\n");
        this.console.println(playerName + ", you have been appointed overseer for your");
        this.console.println("village. Tread carefully, if your people are not fed well");
        this.console.println("you may lose your head.");
        
        displayNextView();
    }
    public static void displayNextView() throws MenuControlException {
        boolean paramsNotOkay;
        //System.out.println("\n *** displayNextView() called *** \n");
        //MainMenuView mainMenuView = new MainMenuView();
        //mainMenuView.display();
        //mainMenuView.getInput();
        do{
            paramsNotOkay = false;
            try {
                MainMenuView MainMenuView = new MainMenuView();
                MainMenuView.displayMainMenu();
            } catch(MenuControlException e) {
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            }
        } while(paramsNotOkay);
        //control returns to this point when user exits to main menu
    }

    private String getPlayerName() {
        //Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String playerName = ""; //value to be returned
        
        do {
            this.console.println("\n" + this.promptMessage);
            
            playerName = this.getStringInput(); //get next line typed on keyboard
            playerName = playerName.trim(); //trim off leading and trailing blanks
            
            if (playerName.length() < 2) { //must have at least 2 characters
                System.out.println("\nInvalid input: name must be at least 2 characters");
            }
        } while (playerName.length() < 2);
        
        return playerName;
    }
    
}
