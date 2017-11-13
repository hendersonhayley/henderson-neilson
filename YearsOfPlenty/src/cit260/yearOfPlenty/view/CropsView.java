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
public class CropsView extends View{
    
    //public CropsView(String message) {
    //    super(message);
    //}

    public CropsView() {
        super("");
    }
    
    public void displayCropsView(){
        Crops theCropsObject = YearsOfPlenty.getCrops();
        
        System.out.println("\n*** Current acres available to sell: " + theCropsObject.getAcres());
        this.sellLand(theCropsObject);
        
        System.out.println("\n*** Current bushels available to buy land: " + theCropsObject.getWheatInStore());
        this.buyLand(theCropsObject);
        
        System.out.println("\n*** Current bushels available to feed the people with: " + theCropsObject.getWheatInStore());
        this.feedPeople(theCropsObject);
        
        System.out.println("\n*** Current acres available to plant seeds with: " + theCropsObject.getAcres());
        this.plantCropsView(theCropsObject);
        
        System.out.println("\n*** Current acres available to harvest: " + theCropsObject.getAcres());
        this.harvestWheatView(theCropsObject);
        
        
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

        }
        
    }
    
    public void feedPeople(Crops theCropsObject) {
        
        System.out.println("\nHow many bushels of grain do you want to give to the people?");
        int bushelsOfGrain = this.getInput();
        
        if (bushelsOfGrain < 0) {
            System.out.println("\nPlease enter a positive value.");
            this.feedPeople(theCropsObject);
        } else {
            int currentBushels = theCropsObject.getWheatInStore();
            if (currentBushels < bushelsOfGrain) {
                do {
                
                System.out.println("Sorry, you only have " + currentBushels + " available. Please try again.");
                bushelsOfGrain = this.getInput();
                
                } while (bushelsOfGrain > currentBushels);
            }
            
            int newBushels = currentBushels + bushelsOfGrain;
            theCropsObject.setWheatInStore(newBushels);
            
            System.out.println("\nSuccess. You fed " + bushelsOfGrain + " bushels to the people.");
            
            
        }
        
    }
    
    
    //the PlantCrops Method
    //Purpose:  Get user input.  User inputs how many acres they want to plant in seed.
    //Parameters:  Input is a Positive number and input is <=  the # of acres owned
    //Returns:  Acres and Planted
   
    public void plantCropsView(Crops theCropsObject){
            int toPlant;
            int newAcres;
            int currentAcres = theCropsObject.getAcres();  //get the amount of acres they have
            
            System.out.println("\nHow many acres of land do you want to plant with seed?");
            
            
            
            
        //test for parameters
            do{
                toPlant = this.getInput(); 
                //calls getInput method in view superclass
                if(toPlant < 0){
                    System.out.println("\nI am sorry master, I cannot do this.");
                    System.out.println("\nYou cannot plant a negative amount of land.");
                }
                else if(toPlant > currentAcres){
                    System.out.println("\nI am sorry master, I cannot do this.");
                    System.out.println("\nYou cannot plant more acres than you own.");
                }
            }    
            while(toPlant < 0 || toPlant > currentAcres);    
             
            
        /*Calculate how many acres are left that are not planted.  Set the objects*/
            
            newAcres = (currentAcres - toPlant);
            theCropsObject.setAcres(newAcres);
            theCropsObject.setPlanted(toPlant);
            
            System.out.println("\nYou have chosen to plant " + toPlant + " acres of land.");         
    }
    
    public void harvestWheatView(Crops theCropsObject){
        
        int amount;
        int newAcres;
        int currentAcres = theCropsObject.getAcres();
        System.out.println("\nHow many acres do you want to harvest?");
        
        do{
            amount = this.getInput();
            
            if (amount < 0){
                System.out.println("\nPlease enter a positive number.");
            }
            else if(amount > currentAcres){
                System.out.println("\nI am sorry, you cannot harvest more acres than you own.");
            }
        }
        while(amount < 0 || amount > currentAcres);
        
            newAcres = (currentAcres - amount);
            theCropsObject.setAcres(newAcres);
            theCropsObject.setHarvest(amount);
            
        System.out.println("\nYou have chosen to harvest " + amount + " acres of land.");
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenu();
    }
    
}   
 
    

