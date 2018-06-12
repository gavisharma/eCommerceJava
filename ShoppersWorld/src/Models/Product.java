package Models;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GOVINDA SHARMA
 */
public class Product {
    String ID;
    String name;
    String description;
    String category;
    double price;

    public Product() {
        this.ID = "";
        this.name = "";
        this.description = "";
        this.category = "";
        this.price = 0;
    }

    public Product(String ID, String name, String description, String category, double price) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
    }

}
