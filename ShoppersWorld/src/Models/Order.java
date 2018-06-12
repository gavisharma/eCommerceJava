package Models;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GOVINDA SHARMA
 */
public class Order {
    String ID;
    String dateCreated;
    String cutomerID;
    String shippingID;

    public Order() {
        this.ID = "";
        this.dateCreated = "";
        this.cutomerID = "";
        this.shippingID = "";
    }

    public Order(String ID, String dateCreated, String cutomerID, String shippingID) {
        this.ID = ID;
        this.dateCreated = dateCreated;
        this.cutomerID = cutomerID;
        this.shippingID = shippingID;
    }

    
}