package Models;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GOVINDA SHARMA
 */
public class ShippingDetail {
    String shippingID;
    String shippingType;
    double shippingCost;
    String regionID;

    public ShippingDetail() {
        this.shippingID = "";
        this.shippingType = "";
        this.shippingCost = 0.0;
        this.regionID = "";
    }

    public ShippingDetail(String shippingID, String shippingType, double shippingCost, String regionID) {
        this.shippingID = shippingID;
        this.shippingType = shippingType;
        this.shippingCost = shippingCost;
        this.regionID = regionID;
    }
    
}
