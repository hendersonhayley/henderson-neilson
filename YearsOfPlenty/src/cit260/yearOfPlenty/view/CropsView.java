/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.view;

import cit260.yearOfPlenty.Crops;
import cit260.yearOfPlenty.Player;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import yearsofplenty.YearsOfPlenty;

/**
 *
 * @author Brennan.Neilson
 */
public class CropsView {
    
    public static void displayCropsView(){
        Crops theCropsObject = YearsOfPlenty.getCrops();
        
        System.out.println("\n*** Current acres available to sell: " + theCropsObject.getAcres());
        CropsView.sellLand(theCropsObject);
        
        System.out.println("\n*** Current bushels available to buy land: " + theCropsObject.getWheatInStore());
        CropsView.buyLand(theCropsObject);
    }
    
    static void sellLand(Crops theCropsObject) {
        Scanner keyboard = new Scanner(System.in);
        int amount;
        int currentLand = theCropsObject.getAcres();
        int wheatPerAcre = theCropsObject.getHarvest();
        int currentWheat = theCropsObject.getWheatInStore();
        System.out.println("\nHow many acres of new land do you want to sell?");
        
        amount = keyboard.nextInt();
        if (amount < 0) {
            System.out.println("\nPlease enter a positive value.");
            CropsView.sellLand(theCropsObject);
        } else if (amount > currentLand) {
            System.out.println("\nYou don't have that much land to sell. Try again.");
            CropsView.sellLand(theCropsObject);
        } else {
            int newLand = currentLand - amount;
            int wheatYield = amount * wheatPerAcre;
            int newWheat = currentWheat + wheatYield;
            
            theCropsObject.setAcres(newLand);
            theCropsObject.setWheatInStore(newWheat);
            System.out.println("\nSuccess. You gained " + wheatYield + " bushels of wheat and you now have " + newLand + " acres available, as well as " + newWheat + " bushels in your stores.");
            
            try {
                Thread.sleep(6000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CropsView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    static void buyLand(Crops theCropsObject) {
        Scanner keyboard = new Scanner(System.in);
        int amount;
        int currentLand = theCropsObject.getAcres();
        int wheatPerAcre = theCropsObject.getHarvest();
        int currentWheat = theCropsObject.getWheatInStore();
        System.out.println("\nHow many acres of new land do you want to buy?");
        
        amount = keyboard.nextInt();
        if (amount < 0) {
            System.out.println("\nPlease enter a positive value.");
            CropsView.buyLand(theCropsObject);
        } else {
            int newLand = currentLand + amount;
            int wheatYield = amount / wheatPerAcre;
            int newWheat = currentWheat - wheatYield;
            
            theCropsObject.setAcres(newLand);
            theCropsObject.setWheatInStore(newWheat);
            System.out.println("\nSuccess. You now have " + newLand + " acres of land. and you lost " + wheatYield + " bushels of wheat. You now have " + newWheat + " bushels in your stores.");
            
            try {
                Thread.sleep(6000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CropsView.class.getName()).log(Level.SEVERE, null, ex);
            }
            GameMenuView.displayGameMenu();
        }
        
    }
     
}
