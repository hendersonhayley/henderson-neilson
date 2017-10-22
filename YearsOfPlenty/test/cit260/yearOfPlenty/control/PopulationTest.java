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
public class PopulationTest {
    
    public PopulationTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test #1 of calcPopulation method, of class Population.
     */
    @Test
    public void testCalcPopulation() {
        System.out.println("calcPopulation");
        int currentPop = 100;
        int popMoveIn = 6;
        int expResult = 106;
        int result = Population.calcPopulation(currentPop, popMoveIn);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test #2 of calcPopulation method, of class Population.
     */
    @Test
    public void testCalcPopulation2() {
        System.out.println("calcPopulation");
        int currentPop = -5;
        int popMoveIn = 5;
        int expResult = -1;
        int result = Population.calcPopulation(currentPop, popMoveIn);
        assertEquals(expResult, result);
        
    }
    /**
     * Test #1 of calcPopulation method, of class Population.
     */
    @Test
    public void testCalcPopulation3() {
        System.out.println("calcPopulation");
        int currentPop = 10005;
        int popMoveIn = 5;
        int expResult = -1;
        int result = Population.calcPopulation(currentPop, popMoveIn);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test #1 of calcPopulation method, of class Population.
     */
    @Test
    public void testCalcPopulation4() {
        System.out.println("calcPopulation");
        int currentPop = 10005;
        int popMoveIn = 5;
        int expResult = -1;
        int result = Population.calcPopulation(currentPop, popMoveIn);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test #1 of calcPopulation method, of class Population.
     */
    @Test
    public void testCalcPopulation5() {
        System.out.println("calcPopulation");
        int currentPop = 0;
        int popMoveIn = 0;
        int expResult = 0;
        int result = Population.calcPopulation(currentPop, popMoveIn);
        assertEquals(expResult, result);
        
    }
}
