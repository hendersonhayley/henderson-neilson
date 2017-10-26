/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.view;

/**
 *
 * @author Darren
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
        this.promptMessage="\nPlease enter your name: ";
        //Display the banner when view created.
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                "\n**********************************************"
              + "\n*                                            *"
              + "\n* This is the game of Year of Plenty         *"
              + "\n* in this game you will help Nephi build a   *"
              + "\n* ship of curious workmanship to travel to   *"
              + "\n* the promised land.                         *"
              + "\n*        *"
              + "\n*        *"
              + "\n*        *"
              + "\n*        *"
              + "\n*        *"
              + "\n*        *"
              + "\n*        *"
              + "\n*        *"
              + "\n*        *"
              + "\n*        *"
              + "\n*        *"
              + "\n**************************************"
  
        );
    }

    public void displayStartProgramView() {
        /*displayView(): void
        BEGIN
        do
            Prompt for and get the input value
            if (value == “Q”) then
                return

            do requested action and display the next view
        
        while the view is not done
        END */
        
        String playerName=getPlayerName();
        gameControl.createPlayer(playerName);
        System.out.println("\n\n\n\n");
        System.out.println(playerName + ", you have been appointed overseer for your");
        System.out.println("village. Tread carefully, if your people are not fed well");
        System.out.println("you may lose your head.");
        
        displayNextView();
    }
    public static void displayNextView() {
        MainMenuView.displayMainMenu();
        //control returns to this point when user exits to main menu
        //goodbye message
        System.out.println("Goodbye...Thanks for playing.");
    }
    
}
