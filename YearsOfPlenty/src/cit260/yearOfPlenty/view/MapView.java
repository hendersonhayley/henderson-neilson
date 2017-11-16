/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.view;

import cit260.yearOfPlenty.Game;
import yearsofplenty.YearsOfPlenty;

/**
 *
 * @author adams
 */
public class MapView {
    
    public static void displayMapView(){
        /*
            game = get the currentGame from the main class
            locations = get the 2-D locations array from the map
            Print the title
            Print the column numbers for each column
            for every row in map
            Print a row divider
            Print the row number on a new line
            for every column in the row
            Print a column divider
            location = locations[row][column]
            if location has been visited
            Get the mapSymbol for the scene in this location
            Print the mapSymbol
            else
            Print " ?? "
            endif
            endFor
            Print the ending column divider
            endFor
            Print the ending row divider
        */
    
        YearsOfPlenty game = new YearsOfPlenty();
        Game currentGame = game.getCurrentGame();
        
    }
    
}
