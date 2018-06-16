package Models;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GOVINDA SHARMA
 */
public class Admin extends User {
    String accessLevel;

    public Admin() {
        super("", "", "", "",false);
        this.accessLevel = "";
    }

    public Admin(String accessLevel, String ID, String password, String name, String email, boolean isAdmin) {
        super(ID, password, name, email, isAdmin);
        this.accessLevel = accessLevel;
    }

    
    
    
}
