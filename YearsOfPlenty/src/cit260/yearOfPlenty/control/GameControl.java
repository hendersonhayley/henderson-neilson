/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.control;

import cit260.yearOfPlenty.Crops;
import cit260.yearOfPlenty.Game;
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

    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame() called ***");
    }
    
}
