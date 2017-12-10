/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.control;

import cit260.yearOfPlenty.Field;
import cit260.yearOfPlenty.Crops;
import cit260.yearOfPlenty.Game;
import cit260.yearOfPlenty.GameInfo;
import cit260.yearOfPlenty.GameInfoItem;
import cit260.yearOfPlenty.InventoryField;
import cit260.yearOfPlenty.InventoryItem;
import cit260.yearOfPlenty.ItemType;
import cit260.yearOfPlenty.Map;
import cit260.yearOfPlenty.Player;
import cit260.yearOfPlenty.view.ErrorView;
import exceptions.GameControlException;
import exceptions.MapControlException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    public static Crops createCrops() {
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
        
        YearsOfPlenty.setTheCrops(theCrops); //save the crops object
        
        return theCrops;
        
    }
    
    //Author: Team
    //Purpose: to create a new game.
    public static void createNewGame(Player player, Crops theCrops) {
        
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
        
        if (theCrops == null) {
            theCrops = GameControl.createCrops();
        }
        
        Game game = new Game();
        game.setPlayer(player);
        game.setTheCrops(theCrops);
        
        YearsOfPlenty.setCurrentGame(game);
        
        InventoryItem[] items = GameControl.createItems();
        YearsOfPlenty.setItems(items);
        
        //Creating our map
        Map map;
        
            map = MapControl.createMap(2, 2, items);
        
        if (map == null) {
            System.out.println("There was an error loading the map.");
        }
        //Saving our map to the game object - YearsOfPlenty.java
        YearsOfPlenty.setMap(map);
        
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
    
    // Actor Array Darren Kearns Individual Assignment
    public static InventoryField[] createField() {
        InventoryField[] fields = new InventoryField[3];
        
        InventoryField CORN = new InventoryField();
        CORN.setDescription("Corn");
        CORN.setQuantity(3);
        fields[Field.CORN.ordinal()] = CORN;
        
        InventoryField WHEAT = new InventoryField();
        WHEAT.setDescription("Wheat");
        WHEAT.setQuantity(5);
        fields[Field.WHEAT.ordinal()] = WHEAT;
        
        InventoryField BARLEY = new InventoryField();
        BARLEY.setDescription("Barley");
        BARLEY.setQuantity(9);
        fields[Field.BARLEY.ordinal()] = BARLEY;
    
        return fields;
    }
    
    public static GameInfoItem[] createUpdateArray() {
        GameInfoItem[] infoItems = new GameInfoItem[4];
        
        Crops crops = YearsOfPlenty.getTheCrops();
        int numAcres = crops.getAcres();
        int numBushels = crops.getWheatInStore();
        
        GameInfoItem ACRES = new GameInfoItem();
        ACRES.setDescription("This is the amount of acres you currently have.");
        ACRES.setQuantity(numAcres);
        infoItems[GameInfo.ACRES.ordinal()] = ACRES;
        
        GameInfoItem BUSHELS = new GameInfoItem();
        BUSHELS.setDescription("This is the amount of bushels you currently have.");
        BUSHELS.setQuantity(numBushels);
        infoItems[GameInfo.BUSHELS.ordinal()] = BUSHELS;
        
        GameInfoItem ACREPRICE = new GameInfoItem();
        ACREPRICE.setDescription("This is how many bushels one acre of land costs.");
        ACREPRICE.setQuantity(3);
        infoItems[GameInfo.ACREPRICE.ordinal()] = ACREPRICE;
        
        GameInfoItem BUSHELRETURN = new GameInfoItem();
        BUSHELRETURN.setDescription("This is how many bushels you will get for selling an acre of land.");
        BUSHELRETURN.setQuantity(3);
        infoItems[GameInfo.BUSHELRETURN.ordinal()] = BUSHELRETURN;
        
        return infoItems;
    }

    public static void saveGame(Game currentGame, String filePath) throws GameControlException{
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame);
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) throws GameControlException {
        Game game = null;
        
        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); // read the game object from file
            System.out.println(game.getPlayer());
            System.out.println(game.getTheCrops());
            //YearsOfPlenty.setCurrentGame(game);
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        //close the output file
        YearsOfPlenty.setCurrentGame(game);
        YearsOfPlenty.setTheCrops(game.getTheCrops());
        YearsOfPlenty.setPlayer(game.getPlayer());
    }
    
   
            
             public static void getLiveStockReport(Game currentGame, String filePath) throws GameControlException{
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame);
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

}
