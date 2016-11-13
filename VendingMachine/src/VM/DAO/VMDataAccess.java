/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VM.DAO;
import VM.DTO.ProductDetails;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author lildocta
 */
public class VMDataAccess implements VMInterface {
    
    private String file;
    public VMDataAccess(String filename)
            
        {
            readProducts(filename);
            file = filename;
        }
        
    //key = product name, value = product details
        HashMap<String, ProductDetails> product = new HashMap<>();
        
        private void writeStock(Collection<ProductDetails> product)  
        {
        try {
            
            PrintWriter out = new PrintWriter(new FileWriter(file));
            for (ProductDetails d : product) {
                out.println(d.getName() + "::" + d.getCost()
                        + "::" + d.getStock());  
            }
            
                out.flush();
                out.close();
                
            } catch (IOException e) {
                System.out.println("Write failed.");
        }
        }
        
        private void readProducts(String file)
        {
            try 
            {
                Scanner sc = new Scanner(new BufferedReader(new FileReader(file)));
                String temp;
                String[] tempStrings;
                float floatTemp;
                int intTemp;
                
                
                while (sc.hasNextLine())
                {
                    temp = sc.nextLine();
                    tempStrings = temp.split("::");
                    floatTemp = Float.valueOf(tempStrings[1]);
                    intTemp = Integer.valueOf(tempStrings[2]);
                    product.put(tempStrings[0], new ProductDetails(tempStrings[0], floatTemp, intTemp));
                }
                sc.close();
            } catch (FileNotFoundException e)
            {
                //
            }
            
        }
        
    @Override
        public float getCost(String name)
        {
            return product.get(name).getCost();
        }
        
    @Override
        public void setStock(String name)
        {
            product.get(name).purchase();
            writeStock(product.values());
        }
        
    @Override
        public int getStock(String name)
        {
            int stock = product.get(name).getStock();
            return stock;
        }
        
       
    @Override
        public float attemptVend(String name)
           {
               return getCost(name);
           }
        
    @Override
        public double changeRet(double userMoney, double cost)
        {
            double change = userMoney - cost;
            return change;
        }
        
    @Override
        public int[] coinConv(double change)
        {
            double remainder = change + 0.001;
            int quarters = 0;
            int dimes = 0;
            int nickles = 0;
            int pennies = 0;
            int[] coins = new int[4];
            
            //While loops run through each denomination of change until the remainder is no longer divisible by that denomination
            while(remainder >= 0.25 && remainder > 0)
            {   
                    quarters += 1;
                    remainder -= 0.25;
            }  
            
            while (remainder >= 0.10 && remainder > 0)
            {
                    dimes += 1;
                    remainder -= 0.10;
            }
            
            while (remainder >= 0.05 && remainder > 0)
            {
                    nickles += 1;
                    remainder -= 0.05;
            }
            
            while (remainder >= 0.01 && remainder > 0)
            {
                    pennies += 1;
                    remainder -= 0.01;
            }
            
            coins[0] = quarters;
            coins[1] = dimes;
            coins[2] = nickles;
            coins[3] = pennies;
            
            return coins;
            
        }
        
        
            
        
}
