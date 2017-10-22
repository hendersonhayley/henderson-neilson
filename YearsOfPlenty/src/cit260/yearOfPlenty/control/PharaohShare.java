/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.control;

/**
 *
 * @author adams
 */
public class PharaohShare {
    
    /** We need to get the cropYield from the crop method.  Then we will have 
     * a set amount that the needs to be taken out of cropYield for the 
     * pharahoCut.  We will then need to minus that value from CropYield and 
     * add it to pharahoShare. Variables will be the cropYield, pharaohPercent, 
     * pharaohShare (from past year).   Output will be pharaohShare, pharaohCut.
     * Validations will be, is the cropYield positive
     * @param cropYield.*
     * @param pharaohPercent*/
    

    public static double calcPharaohShare(double cropYield, double pharaohPercent, double pharaohShare){
//If cropYield < 0, return -1
  if (cropYield < 0) {
    return -1;
            }
//pharaohPercent = .10;
   pharaohPercent = 0.10;
    
//pharaohCut = (cropYield * .10);
    double pharaohCut = cropYield * pharaohPercent;
    
//Get the pharaohShare from Crops
//theCrops.getPharaohShare();

//pharaohShare is pharaohShare = pharaohShare + pharaohCut
     pharaohShare += pharaohCut;
     
     if (cropYield > 20000.00){
    return -1;
}
     
  //set the pharaohShare in crops.
  //theCrops = setPharaohShare(phar
  
//Return pharaohCut;
     return pharaohShare;
    
}
    
    
    
}
