/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Davi Alves
 */
public class ConversorTest {
    private static final Conversor conv = new Conversor();
    
    public ConversorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of convertToMonths method, of class Conversor.
     */
    @Test
    public void testConvertToMonths() {
        System.out.println("Teste Meses");
        assertEquals(12, conv.convertToMonths(), 0.0);
    }

    /**
     * Test of convertToWeeks method, of class Conversor.
     */
    @Test
    public void testConvertToWeeks() {
        System.out.println("Teste Semanas");
        assertEquals(52, conv.convertToWeeks(), 0.0);
    }

    /**
     * Test of convertToDays method, of class Conversor.
     */
    @Test
    public void testConvertToDays() {
        System.out.println("Teste Dias");
        assertEquals(365, conv.convertToDays(), 0.0); 
    }
}
