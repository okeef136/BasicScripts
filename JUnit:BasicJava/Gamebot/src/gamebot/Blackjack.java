/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamebot;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lildocta
 */
public class Blackjack implements Game
    {
    @Override
    public String getName()
        {
         return "Blackjack";
        }
    @Override
    public void run()
        {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        int playerCard1 = randomCard(1);
        int playerCard2 = randomCard(2);
        int dealerCard1 = randomCard(3);
        int dealerCard2 = randomCard(4);
        int playerCardT = playerCard1 + playerCard2;
        int dealerCardT = dealerCard1 + dealerCard2;

        System.out.println("Your cards");
        cardDisplay(playerCard1);
        System.out.print("and ");
        cardDisplay(playerCard2);
        System.out.println("Your card total is " + playerCardT);
        System.out.println(" ");
        System.out.println("hit or stay?");
        String UI = kb.next();
        if (UI.equals("hit"))
        {
            do
            {
                int addCard = randomCard(5);
                System.out.println("Your new card is " + addCard);
                playerCardT = playerCardT + addCard;
                System.out.println("Your new total is " + playerCardT);
                if (playerCardT < 21)
                {
                    System.out.println("hit or stay?");
                    String UI2 = kb.next();
                    UI = UI2;
                    if (playerCardT > 21)
                    {
                        System.out.println("You busted!");
                    }
                }
            } while (UI.equals("hits") && playerCardT <= 21);
        }

        if (playerCardT <= 21 || UI.equals("stay"))
        {
            System.out.println("Your final card total is " + playerCardT);
        }

        System.out.println("Dealers cards");
        cardDisplay(dealerCard1);
        System.out.print("and ");
        cardDisplay(dealerCard2);
        System.out.println("The dealer has " + dealerCardT);
        do
        {
            int addDealer = randomCard(6);
            dealerCardT = dealerCardT + addDealer;
            System.out.println("The dealer has " + dealerCardT);

            if (dealerCardT < 16)
            {
                System.out.println("The dealer hits");
            } else if (dealerCardT > 21)
            {
                System.out.println("The dealer has busted");
            }
        } while (dealerCardT < 16);

        if (playerCardT <= dealerCardT && dealerCardT <= 21 || playerCardT > 21)
        {
            System.out.println("You lose");
            System.out.println("You had " + playerCardT + " and the dealer had " + dealerCardT);
            if (dealerCardT > 21)
            {
                System.out.println("Even though the dealer busted you still lose because you lost as well");
            }
        } else if (playerCardT > dealerCardT && playerCardT <= 21)
        {
            System.out.println("You win!");
            System.out.println("You had " + playerCardT + " and the dealer had " + dealerCardT);
        }
        }

    public String cardDisplay(int playerCard1)
        {
        String playerCard1S = "";
        if (playerCard1 <= 11)
        {
            playerCard1S = String.valueOf(playerCard1);
            System.out.print(playerCard1S + " ");
        } else if (playerCard1 > 11)
        {
            playerCard1S = "10";
        }
//     else if (playerCard1 == 11)
//        {
//            System.out.println("Jack");
//        } else if (playerCard1 == 12)
//        {
//            System.out.println("Queen");
//        } else if (playerCard1 == 13)
//        {
//            System.out.println("King");
//        } else if (playerCard1 == 11)
//        {
//            System.out.println("Ace");
//        }
        return playerCard1S;
        }

    public int randomCard(int cardT)
        {
        Random r2 = new Random();
        int newCard = 1 + r2.nextInt(14);
        if (newCard > 10)
        {
            newCard = 10;
        }
        return newCard;
        }
        }
    
