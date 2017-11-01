/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.view;

import cit260.yearOfPlenty.control.GameControl;
import java.util.Scanner;
import yearsofplenty.YearsOfPlenty;

/**
 *
 * @author Brennan.Neilson
 */
public class MainMenuView {
    
    public static final int MAX = 5;
    static void displayMainMenu() {
        Scanner keyboard = new Scanner(System.in);
        int option;
        
        System.out.println(
                "\n*************************************"
              + "\n*                                   *"
              + "\n*  Game Menu                        *"
              + "\n*                                   *"
              + "\n*  1 - Start New Game               *"
              + "\n*  2 - Get and Start a Saved Game   *"
              + "\n*  3 - Get Help on How to Play      *"
              + "\n*  4 - Save This Game               *"
              + "\n*  5 - Quit                         *"
              + "\n*                                   *"
              + "\n*************************************"
        );
        
        do {
            System.out.println("Please enter an option.");
            option = keyboard.nextInt();
            if (option < 1 || option > MAX) { //must be between 1 and 5
                System.out.println("Invalid option: Please choose an option 1 - 5");
            }
            if (option == 1) {
                MainMenuView.startNewGame();
            } else if (option == 2) {
                MainMenuView.loadGame();
            } else if (option == 3) {
                HelpMenuView.displayHelpMenu();
            } else if (option == 4) {
                MainMenuView.saveGame();
            } else if (option == 5) {
                //goodbye message
                System.out.println("Goodbye...Thanks for playing.");
                System.exit(0);
            }
        } while (option != MAX);
    }
    
    static void startNewGame() {
        System.out.println("Start New Game function called!");
        //create a new game
        GameControl.createNewGame(YearsOfPlenty.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        GameMenuView.displayGameMenu();
    }
    
    static void loadGame() {
        System.out.println("Load Saved Game function called!");
    }
    
    static void saveGame() {
        System.out.println("Save This Game function called!");
    }
    
}
