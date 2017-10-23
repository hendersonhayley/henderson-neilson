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
public class YearTest {
    
    public YearTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcYear method, of class Year.
     */
    @Test
    public void testCalcYear() {
        System.out.println("calcYear");
        int previousYear = 2;
        int expResult = 3;
        int result = Year.calcYear(previousYear);
        assertEquals(expResult, result);
        
    }
    
}
