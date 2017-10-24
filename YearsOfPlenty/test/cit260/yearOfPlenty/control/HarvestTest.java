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
public class HarvestTest {
    
    public HarvestTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test 1 of calcHarvest method, of class HarvestWheat.
     */
    @Test
    public void testCalcHarvest() {
        System.out.println("calcHarvest");
        double cropYield = 100.0;
        double locust = 10.0;
        double pharaohPercent = 0.10;
        double expResult = 80.0;
        double result = HarvestWheat.calcHarvest(cropYield, locust, pharaohPercent);
        assertEquals(expResult, result, 0.0);
        
    }
    
    /**
     * Test 2 of calcHarvest method, of class HarvestWheat.
     */
    @Test
    public void testCalcHarvest2() {
        System.out.println("calcHarvest");
        double cropYield = -5.0;
        double locust = 8.0;
        double pharaohPercent = 0.10;
        double expResult = -1.0;
        double result = HarvestWheat.calcHarvest(cropYield, locust, pharaohPercent);
        assertEquals(expResult, result, 0.0);
        
    }
    
    /**
     * Test 3 of calcHarvest method, of class HarvestWheat.
     */
    @Test
    public void testCalcHarvest3() {
        System.out.println("calcHarvest");
        double cropYield = 12000.0;
        double locust = 5.0;
        double pharaohPercent = 0.10;
        double expResult = -1.0;
        double result = HarvestWheat.calcHarvest(cropYield, locust, pharaohPercent);
        assertEquals(expResult, result, 0.0);
        
    }
    
    /**
     * Test 4 of calcHarvest method, of class HarvestWheat.
     */
    @Test
    public void testCalcHarvest4() {
        System.out.println("calcHarvest");
        double cropYield = 10000.0;
        double locust = 06.0;
        double pharaohPercent = 0.10;
        double expResult = 8994.0;
        double result = HarvestWheat.calcHarvest(cropYield, locust, pharaohPercent);
        assertEquals(expResult, result, 0.0);
        
    }
    
    /**
     * Test 5 of calcHarvest method, of class HarvestWheat.
     */
    @Test
    public void testCalcHarvest5() {
        System.out.println("calcHarvest");
        double cropYield = 0.0;
        double locust = 4.0;
        double pharaohPercent = 0.10;
        double expResult = 0.0;
        double result = HarvestWheat.calcHarvest(cropYield, locust, pharaohPercent);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
