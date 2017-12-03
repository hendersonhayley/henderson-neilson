/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.view;

import cit260.yearOfPlenty.Game;
import cit260.yearOfPlenty.InventoryItem;
import cit260.yearOfPlenty.Location;
import cit260.yearOfPlenty.Map;
import cit260.yearOfPlenty.MapLocation;
import cit260.yearOfPlenty.MapLocations;
import cit260.yearOfPlenty.control.GameControl;
import cit260.yearOfPlenty.control.MapControl;
import exceptions.MapControlException;
import exceptions.MenuControlException;
import java.io.FileWriter;
import java.io.IOException;
import yearsofplenty.YearsOfPlenty;

/**
 *
 * @author adams
 */
public class MapView extends View{
    
    boolean paramsNotOkay;
    
    public MapView(String message) {
        super(message);
    }
    
    public void displayMapView() throws MenuControlException {
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
        
        this.console.println("\nLocation Map");
        
        //Printing out column numbers
        for (int i = 0; i < locations.length; i++) {
            this.console.print("\t" + (i + 1) + "\t");
        }
        this.console.print("\n---------------------------------");
        
        //Printing out row numbers and locations
        for (int i = 0; i < locations.length; i++) {
            this.console.print("\n" + (i + 1) + "|\t");
            for (int j = 0; j < locations.length; j++) {
                boolean visited = locations[i][j].isVisited();
                if (visited == false) {
                    this.console.print("??\t|\t");
                } else {
                    String mapSymbol = locations[i][j].getSymbol();
                    this.console.print(mapSymbol + "\t|\t");
                }
            }
            this.console.print("\n---------------------------------");
        }
                
        int row;
        int column;
        
        //Code to facilitate moving to map locations.
        this.console.println("\nEnter 6 to exit the map, or 7 to print a report of Map Locations to a file.");
        this.console.println("\nWhat row would you like to travel to?");
        //Row selection
        do {
            row = this.getInput();
            if (row > locations.length || row <= 0) {
                if (row == 6) {
                    this.console.println("Exiting to Game Menu...");
                } else if (row == 7) {
                    //request for a file path to be entered
                    this.console.println("\nEnter the file path where the report will be printed to.");
                    
                    //user enters path
                    String filePath = this.getStringInput();

                    //call function to create report
                    this.mapLocationReport(filePath);
                } else {
                    this.console.println("Please choose row 1 or 2.");
                }
            }
        } while (row != 5 && row <= 0 && row > locations.length);
        
        if (row == 5) {
            do {
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
        
        this.console.println("What column would you like to travel to?");
        //Column selection
        do {
            column = this.getInput();
            if (column > locations.length || column <= 0) {
                if (column == 5) {
                    this.console.println("Exiting to Game Menu...");
                } else {
                    this.console.println("Please choose column 1 or 2.");
                }
            }
        } while (column != 5 && column <= 0 && column > locations.length);
        
        if (column == 5) {
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayGameMenu();
        } else {
            row = row - 1;
            column = column - 1;
            String description = locations[row][column].getDescription();
            this.console.println(description);
            locations[row][column].setVisited(true);
        }
        
        int option;
        do {
            this.console.println("\n\nEnter 5 to quit the map or enter 1 to view the map again.");
            option = this.getInput();
        } while (option != 5 && option != 1);
        
        if (option == 1) {
            this.displayMapView();
        } else if (option == 5) {
            this.console.println("Exiting to Game Menu...");
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayGameMenu();
        }
        
    }

    private void mapLocationReport(String filePath) throws MenuControlException {
        FileWriter outFile  = null;
        
        try{
           
            outFile = new FileWriter(filePath);
        
            
            //print title and colum headings        
            outFile.write("\nList of Map Locations ");
           
           
            MapLocation[] locations = new MapLocation[4]; 

            MapLocation NILERIVER = new MapLocation();
            NILERIVER.setDescription("\nYou have reached the Nile River."
                                    + "\nYou cannot go further East.");
            NILERIVER.setName("Nile River");
            locations[MapLocations.NILERIVER.ordinal()] = NILERIVER;

            MapLocation BARN = new MapLocation();
            BARN.setDescription("\nYou have reached the Barn."
                                + "\nThe Barn is where all of your"
                                + "\ngrain, hay, and straw is stored"
                                + "\nas well as your livestock.");
            BARN.setName("Barn");
            locations[MapLocations.BARN.ordinal()] = BARN;

            MapLocation JEWELRYSHOP = new MapLocation();
            JEWELRYSHOP.setDescription("\nWhy are you wasting your time buying jewelry?"
                                        + "\nWe have work to do.");
            JEWELRYSHOP.setName("Jewelry Shop");
            locations[MapLocations.JEWELRYSHOP.ordinal()] = JEWELRYSHOP;

            MapLocation PHARAOHSCOURT = new MapLocation();
            PHARAOHSCOURT.setDescription("\nYou have reached the Pharaoh's Court."
                                        + "\nPharaoh asks: 'Have you brought me my portion of grain?'");
            PHARAOHSCOURT.setName("Pharaoh's Court");
            locations[MapLocations.PHARAOHSCOURT.ordinal()] = PHARAOHSCOURT;
            
            for (int i = 0; i < locations.length; i++) {
                MapLocation location = locations[i];
                outFile.write("\n" + location.getName() + " - " + location.getDescription() + "\n");
            }

            outFile.flush();
          
        } catch (IOException ex) {
            ErrorView.display("MapView", ex.getMessage());
        } finally {
             if (outFile !=null){
                 try{
                     outFile.close();
                     this.console.println("\nMap Location report successfully created.");
                 } catch (IOException ex2){
                    this.console.println("Error closing file");
                 }
             }
         }
    }
    
}
