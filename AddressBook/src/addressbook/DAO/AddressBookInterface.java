/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook.DAO;

import addressbook.DTO.Address;
import java.util.Collection;

/**
 *
 * @author lildocta
 */
public interface AddressBookInterface
    {

    void addAddress(String fName, String lName, String street, String city, String zip);

    Address getAddress(String lName);

    Collection<Address> getAddresses();

    void removeAddress(String lName);
    
    }
