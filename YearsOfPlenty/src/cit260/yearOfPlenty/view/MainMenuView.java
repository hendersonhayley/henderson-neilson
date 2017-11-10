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
public class MainMenuView extends View {
    
    public MainMenuView() {
        super("\n*************************************"
              + "\n*                                   *"
              + "\n*  Main Menu                        *"
              + "\n*                                   *"
              + "\n*  1 - Start New Game               *"
              + "\n*  2 - Get and Start a Saved Game   *"
              + "\n*  3 - Get Help on How to Play      *"
              + "\n*  4 - Save This Game               *"
              + "\n*  5 - Quit                         *"
              + "\n*                                   *"
              + "\n*************************************");
    }
    
    int option;
    
    public void displayMainMenu() {
        this.display();
        do {
            option = this.getInput();
            if (option < 1 || option > 5) { //must be between 1 and 5
                System.out.println("Invalid option: Please choose an option 1 - 5");
            }
            switch (option) {
                case 1:
                    MainMenuView.startNewGame();
                    break;
                case 2:
                    MainMenuView.loadGame();
                    break;
                case 3:
                    HelpMenuView helpMenuView = new HelpMenuView();
                    helpMenuView.displayHelpMenu();
                    break;
                case 4:
                    MainMenuView.saveGame();
                    break;
                case 5:
                    //goodbye message
                    System.out.println("Goodbye...Thanks for playing.");
                    System.exit(0);
                default:
                    break;
            }
        } while (option != 5);
    }
    
    static void startNewGame() {
        System.out.println("Start New Game function called!");
        //create a new game
        GameControl.createNewGame(YearsOfPlenty.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }
    
    static void loadGame() {
        System.out.println("Load Saved Game function called!");
    }
    
    static void saveGame() {
        System.out.println("Save This Game function called!");
    }
    
}
