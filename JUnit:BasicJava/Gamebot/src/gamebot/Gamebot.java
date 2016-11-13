/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamebot;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lildocta
 */
public class Gamebot
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ArrayList<Game> games = new ArrayList();
        games.add(new RPS());
        games.add(new Lucky7());
        games.add(new Blackjack());
        int numGames = games.size();
        int choice = 0;
        int gameTot = 0;
        int exitChoice;
        
        Scanner kb = new Scanner(System.in);
        
        do
        {
            
        System.out.println("What game would you like to play?");
                
        for (int i = 0; i < numGames ; i++)
        {
            int num = i + 1;
            System.out.println(num + ")" + games.get(i).getName());
                if(i == (numGames - 1))
                {
                    System.out.println((i + 2) + ")EXIT");
                    choice = kb.nextInt();
                }
            gameTot += 1;
        }
            exitChoice = gameTot + 1;
            gameTot = 0;
            if (choice != exitChoice)
            {
                games.get(choice - 1).run();
            }
            
        } while (choice != exitChoice);
        System.out.println("Thanks for playing!");
    }
}
