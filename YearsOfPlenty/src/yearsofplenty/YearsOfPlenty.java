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
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


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
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        YearsOfPlenty.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        YearsOfPlenty.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        YearsOfPlenty.inFile = inFile;
    }
    

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
    
    public static void setTheCrops(Crops theCrops) {
        YearsOfPlenty.crops = theCrops;
    }
    
    public static Crops getTheCrops() {
        return crops;
    }
    /**
     * @param args the command line arguments
     * @throws exceptions.MenuControlException
     */
    public static void main(String[] args) throws MenuControlException {
        try {
            // Open character stream files for end user input and output
            
            YearsOfPlenty.inFile = new BufferedReader(new InputStreamReader (System.in));
            
            YearsOfPlenty.outFile = new PrintWriter(System.out, true);
       
        
            //Open Log File
            String filePath = "log.txt";
            FileOutputStream log = new FileOutputStream(filePath);
            YearsOfPlenty.logFile = new PrintWriter(log, true);
        
        
        StartProgramView startProgramView=new StartProgramView();
        startProgramView.displayStartProgramView();
        return;
    
        }catch (Throwable e){
            System.out.println("Exception: "+ e.toString()+ "\nCause: " +e.getCause()
                    + "\nMessage: "+e.getMessage());

            e.printStackTrace();

        }
        finally{
                try {
                   if(YearsOfPlenty.inFile != null)
                    YearsOfPlenty.inFile.close();

                   if(YearsOfPlenty.outFile != null)
                    YearsOfPlenty.outFile.close();

                   if(YearsOfPlenty.logFile != null)
                    YearsOfPlenty.logFile.close();

                } catch (IOException ex) {
                    Logger.getLogger(YearsOfPlenty.class.getName()).log(Level.SEVERE, null, ex);
                }

        }
    }     
}
