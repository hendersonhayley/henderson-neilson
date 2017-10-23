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
public class wheatInStoreTest {
    
    public wheatInStoreTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcWheatInStore method, of class wheatInStore.
     */
    @Test
    public void testCalcWheatInStore() {
        System.out.println("calcWheatInStore");
        int harvest = 1500;
        int previousWheatInStore = 750;
        int expResult = 2250;
        int result = wheatInStore.calcWheatInStore(harvest, previousWheatInStore);
        assertEquals(expResult, result);
        
    }
    
}
