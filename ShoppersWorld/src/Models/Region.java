package Models;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GOVINDA SHARMA
 */
public class Region {
    String ID;
    String country;
    String province;

    public Region() {
        this.ID = "";
        this.country = "";
        this.province = "";
    }

    public Region(String ID, String country, String province) {
        this.ID = ID;
        this.country = country;
        this.province = province;
    }
    
    
}
