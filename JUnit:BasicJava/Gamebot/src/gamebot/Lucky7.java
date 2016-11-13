/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamebot;

import java.util.Scanner;

/**
 *
 * @author lildocta
 */
public class Lucky7 implements Game
    {
    @Override
    public String getName()
        {
         return "Lucky7";
        }
    @Override
    public void run()
        {
        Scanner kb = new Scanner(System.in);
        System.out.println("How much do you want to bet?: ");
        float initBet = kb.nextFloat();

        int totalRolls = 0;
        float maximumWon = initBet;
        int rollsAtMax = 1;

        while (initBet > 0)
        {
            int diceOne = 1 + (int) (Math.random() * 6);
            int diceTwo = 1 + (int) (Math.random() * 6);
            int diceSum = diceOne + diceTwo;
            totalRolls = totalRolls + 1;

            if (diceSum == 7)
            {
                initBet = initBet + 4;
                if (maximumWon < initBet)
                {
                    maximumWon = initBet;
                    rollsAtMax = totalRolls;
                }
            } else
            {
                initBet = initBet - 1;
            }
        }

        System.out.println("You are broke after " + totalRolls + " rolls.");
        System.out.println("You should have quit after " + rollsAtMax + " rolls when you had " + maximumWon + " dollars");
        }
    }
