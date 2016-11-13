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
public class RotateLeft2
    {

    public String rotateLeft2(String str)
        {
            int leng = str.length();
            char one = str.charAt(0);
            char two = str.charAt(1);
            for (int i = 0; i <= leng; i++)
            {
               str.charAt(i) = str.charAt(i + 2);
            }
        }

    }
