/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.control;

//import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author adams
 */
public class Population {
   
 /*define variables for random, will be 3-9*/
   // private static final int POP_BASE = 3;

   // private static final int POP_RANGE = 7;  

   // private static final Random random = new Random();
    
  //  public static int calcPopMoveIn(){

  //      int popMoveIn = random.nextInt(POP_RANGE) + POP_BASE;
  //      return popMoveIn;   
    
//}
/** Purpose:  We need to find last years population and add the amount of people 
*that moved in.  Variables will be the currentPop, popMoveIn.   Output will 
    *be Population.  Validations will be, is the popMoveIn a positive number? 
         * @param currentPop 
         * @param popMoveIn */ 

public static int calcPopulation(int currentPop, int popMoveIn){


//If currentPop < 0, return -1 or if currentPop > 10,000, return -1;
if (currentPop < 0 || currentPop > 10000) {
        return -1;
}
//make sure popMoveIn is a positive number

if (popMoveIn < 0) {
    return -1;
            }

//Population = currentPop + popMoveIn
        int population = currentPop + popMoveIn;


//Return Population
        return population;



    }
}
