/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.control;

import cit260.yearOfPlenty.Crops;
import cit260.yearOfPlenty.Game;
import cit260.yearOfPlenty.InventoryItem;
import cit260.yearOfPlenty.ItemType;
import cit260.yearOfPlenty.Player;
import yearsofplenty.YearsOfPlenty;

/**
 *
 * @author Brennan.Neilson
 */
public class GameControl {

    public static Player createPlayer(String playerName) {
        //System.out.println("\n *** createPlayer() called *** \n");
        Player player = new Player();
        player.setName(playerName);
        
        YearsOfPlenty.setPlayer(player); //save the player
        
        return player;
    }

    public static void createCrops() {
        Crops theCrops = new Crops();
        
        theCrops.setYear(0);
        theCrops.setPopulation(95);
        theCrops.setNewPeople(5);
        theCrops.setCropYield(3);
        theCrops.setNumberWhoDied(0);
        theCrops.setPharaohsShare(200);
        theCrops.setWheatInStore(2800);
        theCrops.setAcres(100);
        theCrops.setHarvest(3);
        theCrops.setPlanted(1000);
        theCrops.setFed(0);
        
        YearsOfPlenty.setTheCrops(theCrops);
    }
    
    //Author: Team
    //Purpose: to create a new game.
    public static void createNewGame(Player player) {
        
        /* Algorithm:
        public static int createNewGame(Player player) {
        if (player == null)
        return -1
        game = create a new Game object
        Save a reference to the Player object in the game
        Save a reference to the game in the main class
        actors = createActors()
        Save the list of actors in the Game object
        Assign an actor to the player
        items = createItems()
        Save the list of items in the game
        map = createMap(noOfRows, noOfColumns)
        IF map == null THEN
         RETURN -1
        ENDIF
        Assign the map to the game
        RETURN 1 // indicates success
        }
        */
        
        if (player == null) {
            
        }
        
        MapControl.createMap(2, 2, GameControl.createItems());
        
    }
    
    public static InventoryItem[] createItems() {
        InventoryItem[] items = new InventoryItem[6];
        
        InventoryItem COWS = new InventoryItem();
        COWS.setDescription("Cows");
        COWS.setQuantity(5);
        items[ItemType.COWS.ordinal()] = COWS;
        
        InventoryItem SHEEP = new InventoryItem();
        SHEEP.setDescription("Sheep");
        SHEEP.setQuantity(5);
        items[ItemType.SHEEP.ordinal()] = SHEEP;
        
        InventoryItem HORSES = new InventoryItem();
        HORSES.setDescription("Horses");
        HORSES.setQuantity(5);
        items[ItemType.HORSES.ordinal()] = HORSES;
        
        InventoryItem PLOW = new InventoryItem();
        PLOW.setDescription("Plows");
        PLOW.setQuantity(5);
        items[ItemType.PLOW.ordinal()] = PLOW;
        
        InventoryItem SHOVEL = new InventoryItem();
        SHOVEL.setDescription("Shovels");
        SHOVEL.setQuantity(5);
        items[ItemType.SHOVEL.ordinal()] = SHOVEL;
        
        InventoryItem PITCHFORK = new InventoryItem();
        PITCHFORK.setDescription("Pitchforks");
        PITCHFORK.setQuantity(5);
        items[ItemType.PITCHFORK.ordinal()] = PITCHFORK;
        
        return items;
    }
    
}
