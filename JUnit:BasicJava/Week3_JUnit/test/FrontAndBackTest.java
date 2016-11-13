/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import week3_junit.FrontAndBack;

/**
 *
 * @author lildocta
 */
public class FrontAndBackTest
    {
    
    
    @BeforeClass
    public static void setUpClass()
        {
        }
    
    @AfterClass
    public static void tearDownClass()
        {
        }
    
    @Before
    public void setUp()
        {
        }
    
    @After
    public void tearDown()
        {
        }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void frontAndBackTest() 
         {
         FrontAndBack fb = new FrontAndBack();
          String result = fb.frontAndBack("Hello", 2);
          assertEquals(result, "Helo");
          //frontAndBack("Hello", 2) -> "Helo"
          result = fb.frontAndBack("Chocolate", 3);
          assertEquals(result, "Choate");
          //frontAndBack("Chocolate", 3) -> "Choate"
          result = fb.frontAndBack("Chocolate", 1);
          assertEquals(result,"Ce");
          //frontAndBack("Chocolate", 1) -> "Ce"
         }
     
    }
