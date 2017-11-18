/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.view;

import cit260.yearOfPlenty.Game;
import cit260.yearOfPlenty.Location;
import cit260.yearOfPlenty.Map;
import cit260.yearOfPlenty.control.MapControl;
import yearsofplenty.YearsOfPlenty;

/**
 *
 * @author adams
 */
public class MapView extends View{
    
    public MapView(String message) {
        super(message);
    }
    
    public void displayMapView(){
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
        
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        
        System.out.println("\nLocation Map");
        
        //Printing out column numbers
        for (int i = 0; i < locations.length; i++) {
            System.out.print("\t" + (i + 1) + "\t");
        }
        System.out.print("\n---------------------------------");
        
        //Printing out row numbers and locations
        for (int i = 0; i < locations.length; i++) {
            System.out.print("\n" + (i + 1) + "|\t");
            for (int j = 0; j < locations.length; j++) {
                boolean visited = locations[i][j].isVisited();
                //if (visited == false) {
                //    System.out.print("??\t|\t");
                //} else {
                    String mapSymbol = locations[i][j].getSymbol();
                    System.out.print(mapSymbol + "\t|\t");
                //}
            }
            System.out.print("\n---------------------------------");
        }
        
        int option;
        do {
            System.out.println("\nEnter 5 to exit the map...");
            option = this.getInput();
        } while(option != 5);
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
        
        
        //int row;
        //int column;
        
        //Future code to facilitate moving to map locations.
        /*System.out.println("What row would you like to travel to?");
        do {
            row = this.getInput();
            if (row > locations.length || row <= 0) {
                System.out.println("Please choose row 1 or 2.");
            }
        } while (row != 5 || (row <= 0 && row > locations.length));
        
        if (row == 5) {
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayGameMenu();
        }
        
        System.out.println("What column would you like to travel to?");
        do {
            column = this.getInput();
            if (column > locations.length || column <= 0) {
                System.out.println("Please choose column 1 or 2.");
            }
        } while (column != 5);*/
        
        
    }
    
}
