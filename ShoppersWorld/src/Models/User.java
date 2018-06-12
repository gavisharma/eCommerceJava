package Models;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GOVINDA SHARMA
 */
public abstract class User {
    String ID;
    String password;
    String name;
    String email;
    boolean isAdmin;

    public User() {
        this.ID = "";
        this.password = "";
        this.name = "";
        this.email = "";
        this.isAdmin = false;
    }

    public User(String ID, String password, String name, String email, boolean isAdmin) {
        this.ID = ID;
        this.password = password;
        this.name = name;
        this.email = email;
        this.isAdmin = isAdmin;
    }
    
    public User getData(){
        return this;
    }
    
}
