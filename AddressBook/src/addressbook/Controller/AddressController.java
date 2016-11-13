/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook.Controller;
import addressbook.UI.AddressCIO;
import addressbook.DAO.AddressBookDataAccess;
import addressbook.DAO.AddressBookInterface;
import addressbook.DTO.Address;
import java.util.Iterator;
/**
 *
 * @author lildocta
 */
public class AddressController {
    
    private AddressBookDataAccess addresses;
    private AddressCIO console = new AddressCIO();
    public AddressBookInterface adInt;
    
    public AddressController(AddressBookInterface text) {
        adInt = text;
    }

    public void run() throws InterruptedException {
        int choice;
        do {
            console.write("Please choose an option: \n"
                    + "1: List all addresses\n"
                    + "2: Find an address by last name\n"
                    + "3: Add an address\n"
                    + "4: Remove an address\n"
                    + "5: Find total addresses\n"
                    + "6: Edit address\n"
                    + "7: Exit\n"
                    + "> ");
            choice = console.readInteger("", 1, 7);

            switch (choice) {
                case 1:
                    listAddresses();
                    break;
                case 2:
                    findAddress();
                    break;
                case 3:
                    addAddress();
                    break;
                case 4:
                    removeAddress();
                    break;
                case 5:
                    totalAddresses();
                    break;
                case 6:
                    editAddress();
                    break;

            }

        } while (choice != 7);
    }

    private void listAddresses () throws InterruptedException {
        Iterator<Address> iter = addresses.getAddresses().iterator();
        //keeping iterator for the heck of it (and less refactoring)
        console.write("All addresses: \n");
        while(iter.hasNext()) {
            Address s = iter.next();
            console.write(toString(s) + "\n\n");
            Thread.sleep(2000);
        }
        
    }
    
    private void findAddress() throws InterruptedException {
        String lName = console.readString("Enter the last name associated with the address you want to find\n==========\n");
        console.readString(toString(addresses.getAddress(lName)));
    }
    
    private String toString(Address a)
    {
        return a.getFName() + " " + a.getLName() + "\n"
                + a.getStreet() + "\n"
                + a.getCity() + ", " + a.getZip();
    }
    
    private void removeAddress()
    {
        String lName = console.readString("Enter the last name accociated with the address you want to delete\n=========\n");
        console.readString(toString(addresses.getAddress(lName))+ "\nREMOVED");
        addresses.removeAddress(lName);
    }
    
    private void addAddress()
    {
        String fName = console.readString("Enter the persons first name\n=============\n");
                    String lName = console.readString("Enter the persons last name\n=============\n");
                    String street = console.readString("Enter the persons street address\n=============\n");
                    String city = console.readString("Enter the city and state (ex. SaintPaul, MN)\n=============\n");
                    String zip = console.readString("Enter the zipcode\n=============\n");
                    addresses.addAddress(fName,lName,street,city,zip);
                    console.readString(toString(addresses.getAddress(lName)) + "\nADDED");
    }
    
    private void totalAddresses()
    {
        Iterator<Address> iter = addresses.getAddresses().iterator();
        int sum = 0;
        while(iter.hasNext()) 
        {
            sum += 1;
            Address s = iter.next(); 
        }
        console.readString("There are " + sum + " addresses in the database\n");
    }
    
    private void editAddress()
    {
        boolean yes = true;
        do 
        {
        console.readString("What aspect of the address would you like to change?\n"
                + "1) First Name\n"
                + "2) Last Name\n"
                + "3) Street Name\n"
                + "4) City, State\n"
                + "5) Zip Code\n"
                + "> ");
        int choice2 = console.readInteger("", 1, 5);
        String lName2 = console.readString("Enter the last name of the of the persons whos address you want to change\n");
        
        switch (choice2)
        {
            case 1: 
                String updFName = console.readString("New First Name: ");
                String updLName = addresses.getAddress(lName2).getLName();
                String updStreet = addresses.getAddress(lName2).getStreet();
                String updCity = addresses.getAddress(lName2).getCity();
                String updZip = addresses.getAddress(lName2).getZip();
                
                addresses.addAddress(updFName, updLName, updStreet, updCity, updZip);
                addresses.removeAddress(lName2);
            break;
            case 2:
                updFName = addresses.getAddress(lName2).getFName();
                updLName = console.readString("New Last Name: ");
                updStreet = addresses.getAddress(lName2).getStreet();
                updCity = addresses.getAddress(lName2).getCity();
                updZip = addresses.getAddress(lName2).getZip();
                
                addresses.addAddress(updFName, updLName, updStreet, updCity, updZip);
                addresses.removeAddress(lName2);
            break;
            case 3:
                updFName = addresses.getAddress(lName2).getFName();
                updLName = addresses.getAddress(lName2).getLName();
                updStreet = console.readString("New Street Address: ");
                updCity = addresses.getAddress(lName2).getCity();
                updZip = addresses.getAddress(lName2).getZip();
                
                addresses.addAddress(updFName, updLName, updStreet, updCity, updZip);
                addresses.removeAddress(lName2);
            break;
            case 4:
                updFName = addresses.getAddress(lName2).getFName();
                updLName = addresses.getAddress(lName2).getLName();
                updStreet = addresses.getAddress(lName2).getStreet();
                updCity = console.readString("New City and State: ");
                updZip = addresses.getAddress(lName2).getZip();
                
                addresses.addAddress(updFName, updLName, updStreet, updCity, updZip);
                addresses.removeAddress(lName2);
            break;
            case 5:
                updFName = addresses.getAddress(lName2).getFName();
                updLName = addresses.getAddress(lName2).getLName();
                updStreet = addresses.getAddress(lName2).getStreet();
                updCity = addresses.getAddress(lName2).getZip();
                updZip = console.readString("New Zip Code: ");
                
                addresses.addAddress(updFName, updLName, updStreet, updCity, updZip);
                addresses.removeAddress(lName2);
            break;
                
        }
        String answer = console.readString("Would you like to edit another element of the address?\n");
        if (!answer.equals("yes"))
            {
                yes = false;
            }
        } while (yes);
    }
}