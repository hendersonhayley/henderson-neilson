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
public class newPeopleTest {
    
    public newPeopleTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcNewPeople method, of class newPeople.
     */
    @Test
    public void testCalcNewPeople() {
        System.out.println("calcNewPeople");
        double currentPop = 1000.0;
        double newPeopleRate = 0.15;
        double expResult = 150.0;
        double result = newPeople.calcNewPeople(currentPop, newPeopleRate);
        assertEquals(expResult, result, 0.0);
       
    }
    
}
