/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook.DAO;
import addressbook.DTO.Address;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author lildocta
 */
public class AddressBookDataAccess implements AddressBookInterface {
        private String file;
    public AddressBookDataAccess(String fileName)
    {
        readAddress(fileName);
        file = fileName;
    }
    HashMap<String, Address> newAdd = new HashMap<>();
    private void writeAddress(Collection<Address> address)  {
        try {
            
            PrintWriter out = new PrintWriter(new FileWriter(file));
            for (Address addr : address) {
                out.println(addr.getFName() + "::" + addr.getLName()
                        + "::" + addr.getStreet()
                        + "::" + addr.getCity() + "::" + addr.getZip());  
                
               
            }
            
            out.flush();
            out.close();
        } catch (IOException e) {
            System.out.println("Write failed.");
        }

    }
    
    private void readAddress(String file)  {
        
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(file)));
            String temp;
            String[] tempStrings;

            while (sc.hasNextLine()) {
                temp = sc.nextLine();
                tempStrings = temp.split("::");
                newAdd.put(tempStrings[0], new Address(tempStrings[0], tempStrings[1], tempStrings[2], tempStrings[3], tempStrings[4]));
            }
            sc.close();
        } catch (FileNotFoundException e) {
            //No relevant action to be performed
        }
        
    }
    
    @Override
    public Collection<Address> getAddresses()
    {
        return newAdd.values();
    }
    
    @Override
    public void removeAddress(String lName)
    {
        newAdd.remove(lName);
    }
    
    @Override
    public void addAddress(String fName, String lName, String street, String city, String zip)
    {
        newAdd.put(lName , new Address(fName, lName, street, city, zip)); 
        writeAddress(newAdd.values());
        
    }
    
    @Override
    public Address getAddress(String lName)
    {
        return newAdd.get(lName);
    }
}
