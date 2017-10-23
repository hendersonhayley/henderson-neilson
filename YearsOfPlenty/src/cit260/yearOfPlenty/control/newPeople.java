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
public class newPeople {

/*define variables for random, will be 0-15*/
   // private static final int NEW_BASE = 0;

   // private static final int NEW_RANGE = 16;  

   // private static final Random random = new Random();
    
  //  public static int calcNewPeople(){

  //      int newPeopleRate = random.nextInt(NEW_RANGE) + NEW_BASE;
  //      return newPeopleRate;   
    
//}
/** Purpose:  We need to find the current population and then get a random 
 * percent from 0-15% and multiply that towards the population. 
 * We then will return the adjusted value to newPeople.  
 * Variables will be the currentPop, newPeople.   Output will 
    *be newPeople.  Validations will be, is the newPeopleRate greater 
    * than 0? 
         * @param currentPop 
         * @param newPeopleRate */ 

public static double calcNewPeople(double currentPop, double newPeopleRate){


//If currentPop < 0, return -1;
if (currentPop < 0) {
        return -1;
}
 
//newPeople = currentPop * newPeople
        double newPeople = currentPop * newPeopleRate;


//Return Population
        return newPeople;


    }
}
