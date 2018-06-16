package Views;

import DatabaseServices.DBConnect;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GOVINDA SHARMA
 */
public class AdminRegistration extends javax.swing.JFrame {

    /**
     * Creates new form CustomerRegistration
     */
    public AdminRegistration() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        loginAdmin = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        registerAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 46, 30));
        setBounds(new java.awt.Rectangle(350, 100, 0, 0));
        setForeground(new java.awt.Color(0, 46, 30));
        setMinimumSize(new java.awt.Dimension(600, 450));
        setPreferredSize(new java.awt.Dimension(600, 530));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 184, 163));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 501));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(600, 145));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 140));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Banner.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel14.setPreferredSize(new java.awt.Dimension(600, 145));
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 144));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 144));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(225, 90, 71));
        jLabel2.setText("Email");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, 20));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(225, 90, 71));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 215, -1, 20));

        jLabel9.setBackground(new java.awt.Color(225, 90, 71));
        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(225, 90, 71));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SIGN UP");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 145, 600, 30));

        jPanel3.setBackground(new java.awt.Color(225, 90, 71));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginAdmin.setForeground(new java.awt.Color(255, 255, 255));
        loginAdmin.setText("Already registered? Procedd to Login...");
        loginAdmin.setContentAreaFilled(false);
        loginAdmin.setPreferredSize(new java.awt.Dimension(120, 40));
        loginAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginAdminActionPerformed(evt);
            }
        });
        jPanel3.add(loginAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 230, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 461, 600, 40));

        txtEmail.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(225, 90, 71));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 150, -1));

        txtID.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        txtID.setForeground(new java.awt.Color(225, 90, 71));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDFocusLost(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 185, 150, -1));

        txtFullName.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        txtFullName.setForeground(new java.awt.Color(225, 90, 71));
        txtFullName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFullNameFocusLost(evt);
            }
        });
        jPanel1.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 150, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(225, 90, 71));
        jLabel3.setText("Full Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, 20));

        jPanel4.setBackground(new java.awt.Color(225, 90, 71));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, 600, 1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(225, 90, 71));
        jLabel5.setText("Admin ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 185, -1, 20));

        txtPassword.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(225, 90, 71));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 215, 150, -1));

        jPanel5.setBackground(new java.awt.Color(225, 90, 71));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 305, 600, 1));

        jLabel16.setBackground(new java.awt.Color(225, 90, 71));
        jLabel16.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(225, 90, 71));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("PERSONAL INFO");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 275, 600, 30));

        txtConfirmPassword.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        txtConfirmPassword.setForeground(new java.awt.Color(225, 90, 71));
        txtConfirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfirmPasswordFocusLost(evt);
            }
        });
        jPanel1.add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 245, 150, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(225, 90, 71));
        jLabel8.setText("Confirm Password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 245, -1, 20));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(225, 90, 71));
        jLabel10.setText("Contact");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, 20));

        txtContact.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        txtContact.setForeground(new java.awt.Color(225, 90, 71));
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        txtContact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContactFocusLost(evt);
            }
        });
        jPanel1.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 150, -1));

        registerAdmin.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        registerAdmin.setForeground(new java.awt.Color(225, 90, 71));
        registerAdmin.setText("SAVE");
        registerAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerAdminActionPerformed(evt);
            }
        });
        jPanel1.add(registerAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 415, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 501));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void loginAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginAdminActionPerformed
        // TODO add your handling code here:
        AdminLogin admLgn = new AdminLogin();
        admLgn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginAdminActionPerformed

    private void registerAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerAdminActionPerformed
        // TODO add your handling code here:
        System.out.println("Register clicked");
        if(txtID.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter Admin ID...");
        } else if(txtPassword.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter Password...");
        } else if(!txtConfirmPassword.getText().equals(txtPassword.getText())){
            JOptionPane.showMessageDialog(this, "Password and Confirm Password do not match...");
        } else if(txtFullName.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter Full Name...");
        } else if(txtEmail.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter Email...");
        } else if(txtEmail.getText().indexOf("@") == -1 || txtEmail.getText().indexOf(".") == -1){
            JOptionPane.showMessageDialog(this,"Entered email is incorrect...");
        } else if(txtContact.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter Contact...");
        } else {
            Statement statement = DBConnect.getStatement();
            String query = "insert into admin(ID, password, name, email, contact) values('"+txtID.getText()+"','"+txtPassword.getText()+"','"+txtFullName.getText()+"','"+txtEmail.getText()+"','"+txtContact.getText()+"')";
            try {
                if (!statement.execute(query)) {
                    JOptionPane.showMessageDialog(this,"ADMIN REGISTERED SUCCESSFULLY...!!!");
                } else {
                    JOptionPane.showMessageDialog(this,"OOPS...!!! SOMETHING WENT WRONG...!!!");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_registerAdminActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtConfirmPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmPasswordFocusLost
        // TODO add your handling code here:
        if(!txtConfirmPassword.getText().equals(txtPassword.getText())){
            JOptionPane.showMessageDialog(this, "Password and Confirm Password do not match...");
            txtConfirmPassword.grabFocus();
        }
    }//GEN-LAST:event_txtConfirmPasswordFocusLost

    private void txtIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusLost
        // TODO add your handling code here:
//        if(txtID.getText().equals("")){
//            JOptionPane.showMessageDialog(this, "Please enter Admin ID...");
//        }
    }//GEN-LAST:event_txtIDFocusLost

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        // TODO add your handling code here:
//        if(txtPassword.getText().equals("")){
//            JOptionPane.showMessageDialog(this, "Please enter Password...");
//        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtFullNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFullNameFocusLost
        // TODO add your handling code here:
//        if(txtFullName.getText().equals("")){
//            JOptionPane.showMessageDialog(this, "Please enter Full Name...");
//        }
    }//GEN-LAST:event_txtFullNameFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
//        if(txtEmail.getText().equals("")){
//            JOptionPane.showMessageDialog(this, "Please enter Email...");
//        } else if(txtEmail.getText().indexOf("@") == -1 || txtEmail.getText().indexOf(".") == -1){
//            JOptionPane.showMessageDialog(this,"Entered email is incorrect...");
//        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtContactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactFocusLost
        // TODO add your handling code here:
//        if(txtContact.getText().equals("")){
//            JOptionPane.showMessageDialog(this, "Please enter Contact...");
//        }
    }//GEN-LAST:event_txtContactFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtContactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactFocusGained

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRegistration().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton loginAdmin;
    private javax.swing.JButton registerAdmin;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
