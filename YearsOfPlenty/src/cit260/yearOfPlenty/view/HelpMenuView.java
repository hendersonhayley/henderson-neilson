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
public class HelpMenuView extends View {
    
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

    public void displayHelpMenu() {
        
        this.display();
        
        do {
            System.out.println("Enter 5 to Exit to Main Menu: ");
            option = this.getInput();
        } while (option != 5);
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        
    }
    
}
