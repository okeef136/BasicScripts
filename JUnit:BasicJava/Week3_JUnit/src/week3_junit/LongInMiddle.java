package week3_junit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lildocta
 */
public class LongInMiddle
    {

    public String longInMiddle(String a, String b)
        {
            if (a.length() < b.length())
            {
                String temp = b;
                b = a;
                a = temp;
            }
            String combined = b + a + b;
            return combined;
        }
    }
