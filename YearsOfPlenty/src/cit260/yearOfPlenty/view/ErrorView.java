/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.view;

import java.io.PrintWriter;
import yearsofplenty.YearsOfPlenty;

/**
 *
 * @author adams
 */
public class ErrorView {
    private static final PrintWriter errorFile = YearsOfPlenty.getOutFile();
    private static final PrintWriter logFile = YearsOfPlenty.getLogFile();
    
    public static void display(String className, String errorMessage){
        errorFile.println("--------------------------------------"
                            + "\n ERROR - " + errorMessage
                            + "\n--------------------------------");
        
        //log error
        logFile.println(className + " - " + errorMessage);
    }
}
