/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.control;

/**
 *
 * @author Darren
 */
public class wheatInStore {

/** Purpose:  Since we have the number from harvest we need to take the value 
 * from harvest and add it to the previous wheatInStore value.
 * Variables will be the harvest, previousWheatInStore.   Output will 
    *be wheatInStore.  Validations will be, is the wheatInStore a positive number? 
         * @param harvest 
         * @param previousWheatInStore */ 

public static int calcWheatInStore (int harvest, int previousWheatInStore){


//If previousWheatInStore < 0, return -1;
if (previousWheatInStore < 0) {
        return -1;
}
 
//Population = currentPop + popMoveIn
        int wheatInStore = previousWheatInStore + harvest;


//Return Population
        return wheatInStore;


    }
}
