/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.view;

import cit260.yearOfPlenty.Crops;
import cit260.yearOfPlenty.GameInfoItem;
import cit260.yearOfPlenty.Player;
import cit260.yearOfPlenty.control.GameControl;
import exceptions.CropControlException;
import exceptions.MenuControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;
import yearsofplenty.YearsOfPlenty;

/**
 *
 * @author Brennan.Neilson
 */
public class CropsView extends View{
    
    boolean paramsNotOkay;
    
    //public CropsView(String message) {
    //    super(message);
    //}

    public CropsView() {
        super("");
    }
    
    public void displayCropsView() throws MenuControlException{
        
        boolean paramsNotOkay;
        
        Crops theCropsObject = YearsOfPlenty.getCrops();
        
        GameInfoItem[] updateItems = GameControl.createUpdateArray();
        
        this.console.println("\nGAME STATUS UPDATE: ");
        
        int i = 0;
        int sum = 0;
        int[] sumArray = new int[2];
        for (GameInfoItem item : updateItems) {
            if (i < 2) {
                sumArray[i] = item.getQuantity();
            }
            i++;
            this.console.println(item.getDescription() + " " + item.getQuantity());
        }
        
        sum = IntStream.of(sumArray).sum();
        this.console.println("Total acres and bushels combined: " + sum);
        
        //setting up error handling for sellLand
        do{
            paramsNotOkay = false;
            try {
            this.sellLand(theCropsObject);
        } catch(CropControlException e){
            ErrorView.display(this.getClass().getName(),e.getMessage());
            paramsNotOkay = true;
        }
        } while(paramsNotOkay);
        
        //setting up error handling for buyLand
        do{
            paramsNotOkay = false;
            try {
            this.buyLand(theCropsObject);
        } catch(CropControlException e){
            ErrorView.display(this.getClass().getName(),e.getMessage());
            paramsNotOkay = true;
        }
        } while(paramsNotOkay);
        
        //setting up error handling for feedPeople
        do{
            paramsNotOkay = false;
            try {
            this.feedPeople(theCropsObject);
        } catch(CropControlException e){
            ErrorView.display(this.getClass().getName(),e.getMessage());
            paramsNotOkay = true;
        }
        } while(paramsNotOkay);
        
        //setting up error handling for plantCropView
        do{
            paramsNotOkay = false;
            try {
            this.plantCropsView(theCropsObject);
        } catch(CropControlException e){
            ErrorView.display(this.getClass().getName(),e.getMessage());
            paramsNotOkay = true;
        }
        } while(paramsNotOkay);
        
        //setting up error handling for harvestWheatView
        do{
            paramsNotOkay = false;
            try {
            this.harvestWheatView(theCropsObject);
        } catch(CropControlException e){
            ErrorView.display(this.getClass().getName(),e.getMessage());
            paramsNotOkay = true;
        }
        } while(paramsNotOkay);
         
        
    }
    
    public void sellLand(Crops theCropsObject) throws CropControlException{
        Scanner keyboard = new Scanner(System.in);
        int amount;
        int currentLand = theCropsObject.getAcres();
        int wheatPerAcre = theCropsObject.getHarvest();
        int currentWheat = theCropsObject.getWheatInStore();
        this.console.println("\nHow many acres of new land do you want to sell?");
        
        amount = keyboard.nextInt();
        if (amount < 0) {
            ErrorView.display(this.getClass().getName(),"\nPlease enter a positive value.");
            
        } else if (amount > currentLand) {
            ErrorView.display(this.getClass().getName(),"\nYou don't have that much land to sell. Try again.");
            
        } else {
            int newLand = currentLand - amount;
            int wheatYield = amount * wheatPerAcre;
            int newWheat = currentWheat + wheatYield;
            
            theCropsObject.setAcres(newLand);
            theCropsObject.setWheatInStore(newWheat);
            this.console.println("\nSuccess. You gained " + wheatYield + " bushels of wheat and you now have " + newLand + " acres available, as well as " + newWheat + " bushels in your stores.");

        }
        
    }
    public void buyLand(Crops theCropsObject) throws CropControlException{
        Scanner keyboard = new Scanner(System.in);
        int amount;
        int currentLand = theCropsObject.getAcres();
        int wheatPerAcre = theCropsObject.getHarvest();
        int currentWheat = theCropsObject.getWheatInStore();
        this.console.println("\nHow many acres of new land do you want to buy?");
        
        amount = keyboard.nextInt();
        if (amount < 0) {
            ErrorView.display(this.getClass().getName(),"\nPlease enter a positive value.");
            //System.out.println("\nPlease enter a positive value.");
            //CropsView.buyLand(theCropsObject);
        } else {
            int newLand = currentLand + amount;
            int wheatYield = amount / wheatPerAcre;
            int newWheat = currentWheat - wheatYield;
            
            theCropsObject.setAcres(newLand);
            theCropsObject.setWheatInStore(newWheat);
            this.console.println("\nSuccess. You now have " + newLand + " acres of land. and you lost " + wheatYield + " bushels of wheat. You now have " + newWheat + " bushels in your stores.");

        }
        
    }
    
    public void feedPeople(Crops theCropsObject) throws CropControlException{
        
        System.out.println("\nHow many bushels of grain do you want to give to the people?");
        int bushelsOfGrain = this.getInput();
        
        if (bushelsOfGrain < 0) {
            ErrorView.display(this.getClass().getName(),"\nPlease enter a positive value.");
            
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
            
            this.console.println("\nSuccess. You fed " + bushelsOfGrain + " bushels to the people.");
            
            
        }
        
    }
    
    
    //the PlantCrops Method
    //Purpose:  Get user input.  User inputs how many acres they want to plant in seed.
    //Parameters:  Input is a Positive number and input is <=  the # of acres owned
    //Returns:  Acres and Planted
   
    public void plantCropsView(Crops theCropsObject) throws CropControlException{
            int toPlant;
            int newAcres;
            int currentAcres = theCropsObject.getAcres();  //get the amount of acres they have
            
            this.console.println("\nHow many acres of land do you want to plant with seed?");
            
            
            
            
        //test for parameters
            do{
                toPlant = this.getInput(); 
                //calls getInput method in view superclass
                if(toPlant < 0){
                    System.out.println("\nI am sorry master, I cannot do this.");
                    ErrorView.display(this.getClass().getName(),"\nPlease enter a positive value.");
                }
                else if(toPlant > currentAcres){
                    System.out.println("\nI am sorry master, I cannot do this.");
                   ErrorView.display(this.getClass().getName(),"\nYou cannot plant more acres than you own.");
                }
            }    
            while(toPlant < 0 || toPlant > currentAcres);    
             
            
        /*Calculate how many acres are left that are not planted.  Set the objects*/
            
            newAcres = (currentAcres - toPlant);
            theCropsObject.setAcres(newAcres);
            theCropsObject.setPlanted(toPlant);
            
            this.console.println("\nYou have chosen to plant " + toPlant + " acres of land.");         
    }
    
    public void harvestWheatView(Crops theCropsObject) throws CropControlException, MenuControlException{
        
        int amount;
        int newAcres;
        int currentAcres = theCropsObject.getAcres();
        this.console.println("\nHow many acres do you want to harvest?");
        
        do{
            amount = this.getInput();
            
            if (amount < 0){
                ErrorView.display(this.getClass().getName(),"\nPlease enter a positive value.");
            }
            else if(amount > currentAcres){
                ErrorView.display(this.getClass().getName(),"\nI am sorry, you cannot harvest more acres than you own.");
            }
        }
        while(amount < 0 || amount > currentAcres);
        
            newAcres = (currentAcres - amount);
            theCropsObject.setAcres(newAcres);
            theCropsObject.setHarvest(amount);
            
        this.console.println("\nYou have chosen to harvest " + amount + " acres of land.");
        
        do {
            paramsNotOkay = false;
            try {
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.displayGameMenu();
            } catch(MenuControlException e) {
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            }
        } while(paramsNotOkay);
    }
    
}   
 
    

