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
    
    //Test 1
    @Test
    public void testCalcCropYield() {
        System.out.println("calcCropYield test 1");
        int acres = 10;
        int bushelsPerAcre = 15;
        int expResult = 150;
        int result = CropsControl.calcCropYield(acres, bushelsPerAcre);
        assertEquals(expResult, result);
    }
    
    //Test 2
    @Test
    public void testCalcCropYield2() {
        System.out.println("calcCropYield test 2");
        int acres = -5;
        int bushelsPerAcre = 15;
        int expResult = -1;
        int result = CropsControl.calcCropYield(acres, bushelsPerAcre);
        assertEquals(expResult, result);
    }
    
    //Test 3
    @Test
    public void testCalcCropYield3() {
        System.out.println("calcCropYield test 3");
        int acres = 10000;
        int bushelsPerAcre = 15;
        int expResult = -1;
        int result = CropsControl.calcCropYield(acres, bushelsPerAcre);
        assertEquals(expResult, result);
    }
    
    //Test 4
    @Test
    public void testCalcCropYield4() {
        System.out.println("calcCropYield test 4");
        int acres = 1000;
        int bushelsPerAcre = 15;
        int expResult = 15000;
        int result = CropsControl.calcCropYield(acres, bushelsPerAcre);
        assertEquals(expResult, result);
    }
    
    //Test 5
    @Test
    public void testCalcCropYield5() {
        System.out.println("calcCropYield test 5");
        int acres = 0;
        int bushelsPerAcre = 15;
        int expResult = 0;
        int result = CropsControl.calcCropYield(acres, bushelsPerAcre);
        assertEquals(expResult, result);
    }
    
}
