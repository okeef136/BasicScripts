/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author lildocta
 */
public class ConsoleIO {

   public int intInp(String prompt)
   {
       System.out.println(prompt);
       Scanner kb = new Scanner(System.in);
       int number = kb.nextInt();
       return number;
   }
   public int intInp(int min, int max, String prompt)
   {
       System.out.println(prompt);
       Scanner kb = new Scanner(System.in);
       int number = kb.nextInt();
       if (number < min || number > max)
       {
           System.out.println("Please enter a number between " + min + " and " + max);
           int temp = kb.nextInt();
           number = temp;
       }
       return number;
   }
   
   public String scanPrint(String prompt)
   {
       System.out.println(prompt);
       Scanner kb = new Scanner(System.in);
       String response = kb.nextLine();
       return response;
   }
   
   public Float fltInp(String prompt)
   {
       System.out.println(prompt);
       Scanner kb = new Scanner(System.in);
       Float response = kb.nextFloat();
       return response;
   }
    
   public Float fltInp(float min, float max, String prompt)
   {
       Scanner kb = new Scanner(System.in);
       float number = kb.nextInt();
       if (number < min || number > max)
       {
           System.out.println("Please enter a number between " + min + " and " + max);
           float temp = kb.nextInt();
           number = temp;
       }
       return number;
   }
   
   public double doubInp(String prompt)
   {
       System.out.println(prompt);
       Scanner kb = new Scanner(System.in);
       double response = kb.nextDouble();
       return response;
   }
   
   public double doubInp(double min, double max, String prompt)
   {
       Scanner kb = new Scanner(System.in);
       double number = kb.nextDouble();
       if (number < min || number > max)
       {
           System.out.println("Please enter a number between " + min + " and " + max);
           double temp = kb.nextDouble();
           number = temp;
       }
       return number;
   }
   
   public void print(String prompt)
   {
       System.out.println(prompt);
   }
}
