/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3_junit;

/**
 *
 * @author lildocta
 */
public class TakeOne
    {

    public String takeOne(String str, boolean fromFront)
        {
            String one;
            if (fromFront)
            {
                one = str.substring(0, 1);
            } else 
            {
                int leng = str.length();
                one = str.substring((leng - 1), leng);
            }
            return one;
        }

    }
