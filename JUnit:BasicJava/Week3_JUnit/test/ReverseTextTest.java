/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import week3_junit.ReverseText;

/**
 *
 * @author lildocta
 */
public class ReverseTextTest
    {
    
    public ReverseTextTest()
        {
        }
    
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
     public void reverseTextTest() 
         {
            ReverseText rt = new ReverseText();
            //1,2,3 = 3,2,1
            int [] numbers = {1,2,3};
            int [] result = rt.reverse(numbers);
            int [] predicted = {3,2,1};
            assertArrayEquals(result, predicted);
            
         }
    }
