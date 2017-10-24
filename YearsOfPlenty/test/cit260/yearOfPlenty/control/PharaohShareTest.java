/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.yearOfPlenty.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adams
 */
public class PharaohShareTest {
    
    public PharaohShareTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test 1 of calcPharaohShare method, of class PharaohShare.
     */
    @Test
    public void testCalcPharaohShare() {
        System.out.println("calcPharaohShare");
        double cropYield = 100.0;
        double pharaohPercent = 0.10;
        double pharaohShare = 10.0;
        double expResult = 10.0;
        double result = PharaohShare.calcPharaohShare(cropYield, pharaohPercent, pharaohShare);
        assertEquals(expResult, result, 0.0);
        
    }
    
    /**
     * Test 2 of calcPharaohShare method, of class PharaohShare.
     */
    @Test
    public void testCalcPharaohShare2() {
        System.out.println("calcPharaohShare");
        double cropYield = -5.0;
        double pharaohPercent = 0.10;
        double pharaohShare = 100.0;
        double expResult = -1.0;
        double result = PharaohShare.calcPharaohShare(cropYield, pharaohPercent, pharaohShare);
        assertEquals(expResult, result, 0.0);
        
    }
    
    /**
     * Test 3 of calcPharaohShare method, of class PharaohShare.
     */
    @Test
    public void testCalcPharaohShare3() {
        System.out.println("calcPharaohShare");
        double cropYield = 25000.0;
        double pharaohPercent = 0.10;
        double pharaohShare = 2500.0;
        double expResult = 2500.0;
        double result = PharaohShare.calcPharaohShare(cropYield, pharaohPercent, pharaohShare);
        assertEquals(expResult, result, 0.0);
        
    }
    
   
    
    /**
     * Test 5 of calcPharaohShare method, of class PharaohShare.
     */
    @Test
    public void testCalcPharaohShare5() {
        System.out.println("calcPharaohShare");
        double cropYield = 0.0;
        double pharaohPercent = 0.10;
        double pharaohShare = 0.0;
        double expResult = 0.0;
        double result = PharaohShare.calcPharaohShare(cropYield, pharaohPercent, pharaohShare);
        assertEquals(expResult, result, 0.0);
        
    }
}
