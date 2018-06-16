package Models;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GOVINDA SHARMA
 */
public class CreditCard {
    String cardNumber;
    String issueDate;
    String expiryDate;
    String cvv;

    public CreditCard() {
        this.cardNumber = "";
        this.issueDate = "";
        this.expiryDate = "";
        this.cvv = "";
    }

    public CreditCard(String cardNumber, String issueDate, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }
}