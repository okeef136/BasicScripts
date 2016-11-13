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
import week3_junit.TakeOne;

/**
 *
 * @author lildocta
 */
public class TakeOneTest
    {
    
    public TakeOneTest()
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
     public void takeOneTest() 
         {
            TakeOne t1 = new TakeOne();
//            takeOne("Hello", true) -> "H"
              String result = t1.takeOne("Hello", true);
              assertEquals(result, "H");
//            takeOne("Hello", false) -> "o"
              result = t1.takeOne("Hello", false);
              assertEquals(result, "o");
//            takeOne("oh", true) -> "o"
              result = t1.takeOne("oh", true);
              assertEquals(result, "o");
                      
            
         }
    }
