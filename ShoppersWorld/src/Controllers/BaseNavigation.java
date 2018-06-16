/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.LandingScreen;

/**
 *
 * @author GOVINDA SHARMA
 */
public class BaseNavigation {
    
    public void backButtonClicked(String userName){
        LandingScreen lndngScrn = new LandingScreen();
        lndngScrn.setVisible(true);
        lndngScrn.userName = userName;
    }
    
    public void homeButtonClicked(){
        
    }
}
