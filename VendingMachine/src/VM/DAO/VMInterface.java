/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VM.DAO;

/**
 *
 * @author lildocta
 */
public interface VMInterface
    {

    float attemptVend(String name);

    double changeRet(double userMoney, double cost);

    int[] coinConv(double change);

    float getCost(String name);

    int getStock(String name);

    void setStock(String name);
    
    }
