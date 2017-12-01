/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.view;

import cit260.yearOfPlenty.control.GameControl;
import exceptions.MenuControlException;
import yearsofplenty.YearsOfPlenty;

/**
 *
 * @author Brennan.Neilson
 */
public class MainMenuView extends View {
    
    boolean paramsNotOkay;
    
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
    
    public void displayMainMenu() throws MenuControlException {
        this.display();
        
        //get input and validate
        do {
           
            option = this.getInput();
            
            if (option < 1 || option >= 5) {
                //if user input 5, quit the game
                if (option == 5) {
                    //goodbye message
                    this.console.println("Goodbye...Thanks for playing.");
                    System.exit(0);
                } else {
                   ErrorView.display(this.getClass().getName(),"Invalid option: Please choose an option 1 - 5");
                   this.displayMainMenu();
                }
            }
        } while (option != 5 && option < 1 && option > 5);

         MainMenuView mainMenuView= new MainMenuView();
       
         switch (option) {
            case 1:
                mainMenuView.startNewGame();
                break;
            case 2:
                mainMenuView.loadGame();
                break;
            case 3:
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.displayHelpMenu();
                break;
            case 4:
                mainMenuView.saveGame();
                break;
            case 5:
                //goodbye message
                this.console.println("Goodbye...Thanks for playing.");
                System.exit(0);
            default:
                break;
        }

    }
    
    public void startNewGame() throws MenuControlException {
        this.console.println("Start New Game function called!");
        //create a new game
        GameControl.createNewGame(YearsOfPlenty.getPlayer());
        
        //display the game menu
        boolean paramsNotOkay;

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
    
    public void loadGame() throws MenuControlException {
        this.console.println("\nEnter the filepath of your saved game.");
        
        String filePath = this.getStringInput();
        
        try {
            //start saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }
    
    public void saveGame() {
        System.out.println(YearsOfPlenty.getTheCrops());
        this.console.println("\nEnter the file path for file where the game"
                            + " is to be saved.");
        String filePath = this.getStringInput();
        
        try {
            System.out.println(YearsOfPlenty.getCurrentGame());
            //save the game to the specified file
            GameControl.saveGame(YearsOfPlenty.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
}
