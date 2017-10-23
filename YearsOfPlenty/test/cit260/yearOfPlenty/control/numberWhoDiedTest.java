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
 * @author Darren
 */
public class numberWhoDiedTest {
    
    public numberWhoDiedTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcNumberWhoDied method, of class numberWhoDied.
     */
    @Test
    public void testCalcNumberWhoDied() {
        System.out.println("calcNumberWhoDied");
        double currentPop = 100.0;
        double deathRate = 0.1;
        double expResult = 10.0;
        double result = numberWhoDied.calcNumberWhoDied(currentPop, deathRate);
        assertEquals(expResult, result, 0.0);
    }
    
}
