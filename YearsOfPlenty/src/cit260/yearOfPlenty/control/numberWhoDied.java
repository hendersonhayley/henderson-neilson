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
public class numberWhoDied {
    
/*define variables for random, will be 0-10*/
   // private static final int DEATH_BASE = 0;

   // private static final int DEATH_RANGE = 11;  

   // private static final Random random = new Random();
    
  //  public static int calcDeathRate(){

  //      int deathRate = random.nextInt(DEATH_RANGE) + DEATH_BASE;
  //      return deathRate;   
    
//}
/** Purpose:  We need to find the current population and then get a random 
 * percent from 0-10% and multiply that towards the population. 
 * We then will return the adjusted value to number who died.  
 * Variables will be the currentPop, deathRate.   Output will 
    *be numberWhoDied.  Validations will be, is the numberWhoDied greater 
    * than 0. 
         * @param currentPop 
         * @param deathRate */ 

public static double calcNumberWhoDied(double currentPop, double deathRate){


//If currentPop < 0, return -1;
if (currentPop < 0) {
        return -1;
}
 
//numberWhoDied = currentPop x deathRate
        double numberWhoDied = currentPop * deathRate;


//Return Population
        return numberWhoDied;



    }
}
