package Models;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GOVINDA SHARMA
 */
public class Customer extends User{
    String address;
    CreditCard creditCardInfo;
    String shippingAddress;

    public Customer() {
        super("","","","",false);
        this.address = "";
        this.creditCardInfo = new CreditCard();
        this.shippingAddress = "";
    }
    
    public Customer(String address, CreditCard creditCardInfo, String shippingAddress, String ID, String password, String name, String email, String loginStatus, boolean isAdmin) {
        super(ID, password, name, email, isAdmin);
        this.address = address;
        this.creditCardInfo = creditCardInfo;
        this.shippingAddress = shippingAddress;
    }

    
    
    
    
}