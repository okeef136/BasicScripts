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
public class RPS implements Game
    {
    @Override
    public String getName()
        {
         return "Rock Paper Scissors";
        }
    
    @Override
    public void run()
        {
        Scanner kb = new Scanner(System.in);
        int decision;

        do
        {
            System.out.println("How many rounds do you want to play? (pick a number from 1 to 10)" + "\n");
            int rounds = kb.nextInt();
            int win = 0;
            int loss = 0;
            int tie = 0;

            //forces user to pick between 1 and 10
            if (rounds < 1)
            {
                System.out.println("Please pick a number between 1 and 10" + "\n");
                int holder = kb.nextInt();
                rounds = holder;
            } else if (rounds > 10)
            {
                System.out.println("Please pick a number between 1 and 10" + "\n");
                int holder = kb.nextInt();
                rounds = holder;
            }

            //user selects rock paper or scissors
            for (int i = 1; i <= rounds; i++)
            {
                System.out.println("Pick the corresponding number for either Rock, Paper, or Scissors");
                System.out.println("Rock = 1");
                System.out.println("Paper = 2");
                System.out.println("Scissors = 3" + "\n");

                int playerSelect = kb.nextInt();
                int compSelect = 1 + (int) (Math.random() * 3);

                //selects winner
                switch (playerSelect)
                {
                    case 1:
                        if (compSelect == 2)
                        {
                            System.out.println("You lose!");
                            loss = loss + 1;
                        } else if (compSelect == 3)
                        {
                            System.out.println("You Win!");
                            win = win + 1;
                        } else
                        {
                            System.out.println("Its a tie!");
                            tie = tie + 1;
                        }
                        break;
                    case 2:
                        if (compSelect == 1)
                        {
                            System.out.println("You win!");
                            win = win + 1;
                        } else if (compSelect == 3)
                        {
                            System.out.println("You lose!");
                            loss = loss + 1;
                        } else
                        {
                            System.out.println("Its a tie!");
                            tie = tie + 1;
                        }
                        break;
                    case 3:
                        if (compSelect == 1)
                        {
                            System.out.println("You lose!");
                            loss = loss + 1;
                        } else if (compSelect == 2)
                        {
                            System.out.println("You win!");
                            win = win + 1;
                        } else
                        {
                            System.out.println("Its a tie!");
                            tie = tie + 1;
                        }
                        break;
                    default:
                        System.out.println("You didnt pick rock, nor paper, nor scissors so you automatically lose");
                        loss = loss + 1;

                }

            }

            //displays final score
            System.out.println(" ");
            System.out.println("You won " + win + " games!");
            System.out.println("You lost " + loss + " games!");
            System.out.println("You tied " + tie + " games!");

            //winner declaration
            if (loss == win)
            {
                System.out.println("A majority of the games were a tie!");//fix
            } else if (win >= tie && win > loss)
            {
                System.out.println("You're the overall winner!");
            } else
            {
                System.out.println("You are the overall loser!");
            }

            //player decision to play again
            System.out.println("Do you want to play again?");
            System.out.println("1 = yes");
            System.out.println("2 = no");
            int decision1 = kb.nextInt();
            decision = decision1;

        } while (decision == 1);

        //player chose not to play again        
        System.out.println("Thanks for Playing!");
        }

        
    }
