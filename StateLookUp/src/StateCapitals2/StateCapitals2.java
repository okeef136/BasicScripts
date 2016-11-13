/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StateCapitals2;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author lildocta
 */
public class StateCapitals2 {
    static class StateCapitals3 
            {
                int population;
                int squareMiles;
                String capital;
                
                public StateCapitals3(String capital, int population, int squareMiles) 
                {
                    this.capital= capital;
                    this.population = population;
                    this.squareMiles = squareMiles;
                }
            }
    
    public static void main(String[] args) {
        HashMap<String, StateCapitals3> state = new HashMap<>();
            
            state.put("Alabama", new StateCapitals3("Montgomery", 4800000, 52000));
            state.put("Arizona", new StateCapitals3("Pheonix", 6800000, 113000));
            state.put("Arkansas", new StateCapitals3("Little Rock", 2900000, 52000));
            state.put("California", new StateCapitals3("Sacramento", 39000000, 155000));
            state.put("Colorado", new StateCapitals3("Denver", 5400000, 103000));
            state.put("Connecticut", new StateCapitals3("Hartford", 3500000, 5500));
            state.put("Delaware", new StateCapitals3("Dover", 945000, 1950));
            state.put("Florida", new StateCapitals3("Tallahassee", 20000000, 53000));
            state.put("Hawaii", new StateCapitals3("Honolulu", 1430000, 6400));
            
            
            System.out.println("Enter a population size to discover all capitals with populations of greater size");
            Scanner sc = new Scanner(System.in);
            int pop = sc.nextInt();
            for(String n: state.keySet())
            {
                if (state.get(n).population > pop)
                {
                    System.out.println(state.get(n).capital + ", " + n + " has a population greater then " + pop);
                }
            }
    }
            
}

