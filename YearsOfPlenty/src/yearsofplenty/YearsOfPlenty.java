/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yearsofplenty;

import cit260.yearOfPlenty.Player;
import cit260.yearOfPlenty.Map;
import cit260.yearOfPlenty.Crops;
import cit260.yearOfPlenty.Game;
import cit260.yearOfPlenty.Location;
import cit260.yearOfPlenty.InventoryItem;
import cit260.yearOfPlenty.view.StartProgramView;
import exceptions.MenuControlException;


/**
 *
 * @author adams
 */
public class YearsOfPlenty {
    
    private static Game currentGame = null;
    private static Player player = null;
    private static Crops crops = null;
    private static InventoryItem[] items = null;
    private static Map map = null;

    public static Map getMap() {
        return map;
    }

    public static void setMap(Map map) {
        YearsOfPlenty.map = map;
    }

    public static InventoryItem[] getItems() {
        return items;
    }

    public static void setItems(InventoryItem[] items) {
        YearsOfPlenty.items = items;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        YearsOfPlenty.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        YearsOfPlenty.player = player;
    }
    /**
     * @param args the command line arguments
     * @throws exceptions.MenuControlException
     */
    public static void main(String[] args) throws MenuControlException {
        StartProgramView startProgramView=new StartProgramView();
        startProgramView.displayStartProgramView();
    }

    public static void setTheCrops(Crops theCrops) {
        YearsOfPlenty.crops = theCrops;
    }
    
    public static Crops getCrops() {
        return crops;
    }
    
    
    
   
}
