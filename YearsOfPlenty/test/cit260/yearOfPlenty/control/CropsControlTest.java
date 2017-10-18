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
public class CropsControlTest {
    
    public CropsControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcBushelsPerAcre method, of class CropsControl.
     */
  
    /**
     * Test of cropYield method, of class CropsControl.
     */
    
    /**
     * Test of calcCropYield method, of class CropsControl.
     */
    @Test
    public void testCalcCropYield() {
        System.out.println("calcCropYield");
        int acres = 10;
        int bushelsPerAcre = 15;
        int expResult = 150;
        int result = CropsControl.calcCropYield(acres, bushelsPerAcre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
