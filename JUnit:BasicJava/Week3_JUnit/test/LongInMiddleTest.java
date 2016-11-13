/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import week3_junit.LongInMiddle;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author lildocta
 */
public class LongInMiddleTest
    {
    
    public LongInMiddleTest()
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
     public void longInMiddleTest() 
         {
            LongInMiddle lm = new LongInMiddle();
            //longInMiddle("Hello", "hi") -> "hiHellohi"
            String result = lm.longInMiddle("Hello", "hi");
            assertEquals(result, "hiHellohi");
            //longInMiddle("hi", "Hello") -> "hiHellohi"
            result = lm.longInMiddle("hi", "Hello");
            assertEquals(result, "hiHellohi");
            //longInMiddle("aaa", "b") -> "baaab"
            result = lm.longInMiddle("aaa", "b");
            assertEquals(result, "baaab"); 
         }
    }
