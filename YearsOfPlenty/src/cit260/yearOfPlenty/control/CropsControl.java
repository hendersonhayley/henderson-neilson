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
public class CropsControl {

    /*define variables for random
    private static final int CROP_BASE = 3;

    private static final int CROP_RANGE = 3;  

    private static Random random = new Random();
    
    public static int calcBushelsPerAcre(){

        int bushelsPerAcre = random.nextInt(CROP_RANGE) + CROP_BASE;
        return bushelsPerAcre;

    }
    Purpose: 
    Input needed: how many acres, how many bushels per acre
    Output to be returned: crop yield (total number of bushels) >= 0
    Validation rules: acres can’t be negative*/
    public static int calcCropYield(int acres, int bushelsPerAcre) { 

        //If acres < 0, return -1 or if acres > 1,000, return -1
        if (acres < 0 || acres > 1000) { 
            return -1; 
        }
        
        //parameters are valid, so calculate crop yield
        int cropYield = acres * bushelsPerAcre;
        return cropYield;
    }

    
}







