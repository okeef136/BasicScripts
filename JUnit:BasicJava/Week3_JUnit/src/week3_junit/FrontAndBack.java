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
public class FrontAndBack
    {

    public String frontAndBack(String str, int n)
        {
            int leng = str.length();
            String endString = str.substring((leng - n), leng);
            String begString = str.substring(0,(n));
            String sumString = begString + endString;
            return sumString;
        }

    }
