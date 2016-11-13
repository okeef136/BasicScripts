/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VM.Main;

import VM.Controller.VMController;
import VM.DAO.VMDataAccess;
import VM.DAO.VMInterface;



/**
 *
 * @author lildocta
 */
public class VMMain {
    public static void main(String[] args) {
        new VMController(new VMDataAccess("VendingMachineProducts.txt")).run();
    }
}
