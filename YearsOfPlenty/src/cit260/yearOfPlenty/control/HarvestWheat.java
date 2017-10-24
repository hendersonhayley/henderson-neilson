/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.control;
import java.util.Random;
/**
 *
 * @author adams
 */


public class HarvestWheat {
    
    /*define variables for random, random will fill locust, will be 3-15*/
   // private static final int POP_BASE = 3;

   // private static final int POP_RANGE = 13;  

   // private static final Random random = new Random();
    
  //  public static int calcLocust(){

  //      int locust = random.nextInt(POP_RANGE) + POP_BASE;
  //      return locust;   
    
//}
    
 /** Purpose: We need to get the cropYield, minus the (pharaohCut + locust) 
 * and get the amount we have in harvest.    Locust will be randomly filled.  
 * PharaohCut will be 10%.
*Variables will be the cropYield, pharaohShare. Locust.  Output will be harvest. 
* Validations will be, is the cropYield positive.**/ 
    
    
   public static double calcHarvest(double cropYield, double locust, double pharaohShare){

//If cropYield < 0, return -1 or if harvest > 10,000, return -1;
if (cropYield < 0) {
    return -1;
            }


//pharaohPercent = .10;  this is done in the pharaohshare method
//pharaohPercent = 0.10;

//pharaohCut = (cropYield  * .10);
//(done in pharaohShare)double pharaohCut = (cropYield  * pharaohPercent);

//– (//harvest = cropYield – (pharaohCut + locust);
double harvestCut = pharaohShare + locust;
double harvest = cropYield - harvestCut;


if (harvest < 0.00){
    return 0.00;
}
//Return harvest;
return harvest;
    
    
}
 
    
    
}
