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
public class Year {


/** Purpose:  We need to start at year one and then next year grab the previous 
 * year number and add 1 there will only be 7 years to prepare for famine.
 * Variables will be the previousYear.   Output will be Year.  
 * Validations will be, is year a positive number and not greater 
    * than 7?  
         * @param previousYear */ 

public static int calcYear(int previousYear){


// if previousYear < 0, return -1 or if previousYear > 7, return -1;
if (previousYear < 0 || previousYear > 7) {
        return -1;
}
 
//Year = previousYear + 1
        int year = previousYear + 1;


//Return Population
        return year;


    }
    
}
