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
public class HelpMenuView {

    static void displayHelpMenu() {
        Scanner keyboard = new Scanner(System.in);
        int option;
        
        System.out.println(
                "\n*************************************************************************"
              + "\n*                                                                       *"
              + "\n*  Help Menu                                                            *"
              + "\n*                                                                       *"
              + "\n*  Start New Game: Starts a brand new game.                             *"
              + "\n*  Get and Start a Saved Game: Loads your previously saved game data.   *"
              + "\n*  Get Help on How to Play: Displays this help menu.                    *"
              + "\n*  Save This Game: Saves your current game progress.                    *"
              + "\n*  Quit: quits the game.                                                *"
              + "\n*                                                                       *"
              + "\n*************************************************************************"
        );
        
        do {
            System.out.println("Enter 5 to Exit to Main Menu: ");
            option = keyboard.nextInt();
        } while (option != 5);
        MainMenuView.displayMainMenu();
    }
    
}
