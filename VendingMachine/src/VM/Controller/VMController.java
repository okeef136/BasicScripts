/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VM.Controller;
import VM.UI.VMConsolIO;
import VM.DAO.VMDataAccess;
import VM.DAO.VMInterface;
/**
 *
 * @author lildocta
 */
public class VMController {
    
    //Creates access to VMDataAccess and ConsoleIO
    
    private VMConsolIO console = new VMConsolIO();
    public VMInterface product;
    
    public VMController(VMInterface textFile)
    {
        //Allows DAO to access appropriate text file
        product = textFile;
        
    }
        public void run()
        {
           int exit = 1;
           double cost;
           double change = 0;
           double userMoney;
           
           do 
           {
              userMoney = console.readFloat("Please insert cash now: ", 1, 20);
              console.write("Please select which item you would like to purchase\n"
                      + "   Product  |  Cost\n"
                      + "=====================\n");
                      
                      //if statements removes available selections based on stock amount
                      if (product.getStock("doritos") > 0)
                      {console.write("1) Doritos     1.50$\n");}
                      if (product.getStock("cheetos") > 0)
                      {console.write("2) Cheetos     1.50$\n");}
                      if (product.getStock("gum") > 0)
                      {console.write("3) Gum         1.00$\n");}
                      if (product.getStock("bakedLays") > 0)
                      {console.write("4) Baked Lays  1.25$\n");}
                      if (product.getStock("twinkies") > 0)
                      {console.write("5) Twinkies    2.10$\n");}
                      if (product.getStock("cheezits") > 0)
                      {console.write("6) Cheezits    2.95$\n");}
                      int userSelect = console.readInteger("7) Exit\n"
                              + "> ",1,7);
              
              //Takes user selection and determines how much change they recieve
              switch (userSelect)
              {
                  case 1: 
                      cost = product.attemptVend("doritos");
                      if (cost < userMoney)
                      {
                      product.setStock("doritos");
                      change = product.changeRet(userMoney, cost);
                      userMoney = 0;
                      } else 
                      {
                          userMoney += console.readFloat("Insert more money to purchase this product\n", 1, 20);
                      }
                      break;
                  case 2:
                      cost = product.attemptVend("cheetos");
                      if (cost < userMoney)
                      {
                          product.setStock("cheetos");
                          change = product.changeRet(userMoney, cost);
                          userMoney = 0;
                      } else 
                      {
                          userMoney += console.readFloat("Insert more money to purchase this product\n", 1, 20);
                      }
                      break;
                  case 3:
                      cost = product.attemptVend("gum");
                      if (cost < userMoney)
                      {
                          product.setStock("gum");
                          change = product.changeRet(userMoney, cost);
                          userMoney = 0;
                      } else 
                      {
                          userMoney += console.readFloat("Insert more money to purchase this product\n", 1, 20);
                      }
                      break;
                  case 4:
                      cost = product.attemptVend("bakedLays");
                      if (cost < userMoney)
                      {
                          product.setStock("bakedLays");
                          change = product.changeRet(userMoney, cost);
                          userMoney = 0;
                      } else 
                      {
                          userMoney += console.readFloat("Insert more money to purchase this product\n", 1, 20);
                      }
                      break;
                  case 5:
                      cost = product.attemptVend("twinkies");
                      if (cost < userMoney)
                      {
                          product.setStock("twinkies");
                          change = product.changeRet(userMoney, cost);
                          userMoney = 0;
                      } else 
                      {
                          userMoney += console.readFloat("Insert more money to purchase this product\n", 1, 20);
                      }
                      break;
                  case 6:
                      cost = product.attemptVend("cheezits");
                      if (cost < userMoney)
                      {
                          product.setStock("cheezits");
                          change = product.changeRet(userMoney, cost);
                          userMoney = 0;
                      } else 
                      {
                          userMoney += console.readFloat("Insert more money to purchase this product\n", 1, 20);
                      }
                      break;
                  case 7:
                      exit = 2;
                      
                      
                      }
                        if (userSelect != 7)
                        {
                          int[] coins = product.coinConv(change);
                          int quarters = coins[0];
                          int dimes = coins[1];
                          int nickles = coins[2];
                          int pennies = coins[3];
                          
                          console.write("CHANGE \n"
                                  + "=============\n"
                                  + "Quarters: " + quarters + "\n"
                                  + "Dimes: " + dimes + "\n"
                                  + "Nickles: " + nickles + "\n"
                                  + "Pennies: " + pennies + "\n\n");
                        }
           } while (exit == 1);
           
        }
        
        
    
}
