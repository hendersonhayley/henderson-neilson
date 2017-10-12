/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yearsofplenty;

import cit260.yearOfPlenty.Player;
import cit260.yearOfPlenty.Map;
import cit260.yearOfPlenty.Crops;
import cit260.yearOfPlenty.Location;
import cit260.yearOfPlenty.InventoryItem;


/**
 *
 * @author adams
 */
public class YearsOfPlenty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     //Testing out player class   
        Player playerOne = new Player();
        
        playerOne.setName("hayley");
        
        String playerOneName = playerOne.getName();
        
        System.out.println("Name = " + playerOneName);
        
    // Testing out map class
        
        Map mapOne = new Map();
        Map mapTwo = new Map();
        
        mapOne.setRowCount(2);
        mapTwo.setColCount(3);
        
        int mapOneRowCount = mapOne.getRowCount();
        int mapTwoColCount = mapTwo.getColCount();
        
        System.out.println("Row = " + mapOneRowCount);
        
        System.out.println("Column = " + mapTwoColCount);
        
    //  Testing the crops class

        Crops yearOne = new Crops();
        Crops popOne = new Crops();
        
        yearOne.setYear (2017);
        popOne.setPopulation (112);
        
        int cropsYearOne = yearOne.getYear();
        int cropsPopOne = popOne.getPopulation();
        
        System.out.println("The Year is = " + cropsYearOne);
        System.out.println("The Population is = " + cropsPopOne);
        
        //  Testing the location class

        Location location = new Location();
        
        location.setRow (3);
        location.setColumn (4);
        location.setDescription ("A beautiful place");
        location.setSymbol ("*");
        
        int currentRow = location.getRow();
        int currentCol = location.getColumn();
        String description = location.getDescription();
        String symbol = location.getSymbol();
        
        System.out.println("You are currently at row " + currentRow + ", column " + currentCol + ". ");
        System.out.println("The description is: " + description + " and the symbol is: " + symbol);
        
        //  Testing the InventoryItem class

        InventoryItem inventory = new InventoryItem();
        
        inventory.setDescription ("You have several useful items in your inventory.");
        inventory.setQuantity (15);
        
        String inventoryDescription = inventory.getDescription();
        int inventoryQuantity = inventory.getQuantity();
        
        System.out.println("Inventory Description: " + inventoryDescription);
        System.out.println("Number of items in inventory: " + inventoryQuantity);
    }
    
}
