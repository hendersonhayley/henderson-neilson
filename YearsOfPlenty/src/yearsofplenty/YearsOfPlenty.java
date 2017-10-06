/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yearsofplenty;

import cit260.yearOfPlenty.Player;


/**
 *
 * @author adams
 */
public class YearsOfPlenty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("hayley");
        
        String playerOneName = playerOne.getName();
        
        System.out.println("Name = " + playerOneName);
        
        
    }
    
}
