/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook.DTO;

/**
 *
 * @author lildocta
 */
public class Address {
    private String fName;
    private String lName;
    private String street;
    private String city;
    private String zip;

    public Address(String fName, String lName, String street, String city, String zip) {
        this.fName = fName;
        this.lName = lName;
        this.street = street;
        this.city = city;
        this.zip = zip;
    }
    
    public String getFName()
    {
        return fName;
    }
    
    public String getLName()
    {
        return lName;
    }
    
    public String getStreet()
    {
        return street;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public String getZip()
    {
        return zip;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @param lName the lName to set
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }
    
    
    
}
