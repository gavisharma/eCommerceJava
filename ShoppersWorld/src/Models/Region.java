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
    String aptNumber;
    String streetName;

    public Region() {
        this.ID = "";
        this.country = "";
        this.province = "";
        this.aptNumber = "";
        this.streetName = "";
    }

    public Region(String ID, String country, String province, String aptNumber, String streetName) {
        this.ID = ID;
        this.country = country;
        this.province = province;
        this.aptNumber = aptNumber;
        this.streetName = streetName;
    }
}