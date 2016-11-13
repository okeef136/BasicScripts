/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VM.DTO;

/**
 *
 * @author lildocta
 */
public class ProductDetails {
    private String name;
    private float cost;
    private int stock;

    public ProductDetails(String name, float cost, int stock) {
        this.name = name;
        this.cost = cost;
        this.stock = stock;
    }

    /**
     * @return the itemName
     */
  
    public float getCost() {
        return cost;
    }
    
    public String getName()
    {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void purchase() {
        this.stock -= 1;
    }
    
}
