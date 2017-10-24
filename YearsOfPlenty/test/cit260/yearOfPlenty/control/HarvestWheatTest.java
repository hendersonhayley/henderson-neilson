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
public class HarvestWheatTest {
    
    public HarvestWheatTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcHarvest method, of class HarvestWheat.
     */
    @Test
    public void testCalcHarvest() {
        System.out.println("calcHarvest");
        double cropYield = 1000.0;
        double locust = 5.0;
        double pharaohShare = 100.0;
        double expResult = 895.0;
        double result = HarvestWheat.calcHarvest(cropYield, locust, pharaohShare);
        assertEquals(expResult, result, 0.0);
       
    }
    
}
