package Models;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GOVINDA SHARMA
 */
public class Cart {
    String ID;
    String productID;
    int quantity;
    String dateAdded;

    public Cart() {
        this.ID = "";
        this.productID = "";
        this.quantity = 0;
        this.dateAdded = "";
    }
    
    public Cart(String ID, String productID, int quantity, String dateAdded) {
        this.ID = ID;
        this.productID = productID;
        this.quantity = quantity;
        this.dateAdded = dateAdded;
    }
}