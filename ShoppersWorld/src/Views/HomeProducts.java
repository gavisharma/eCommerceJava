package Views;

import Controllers.BaseNavigation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GOVINDA SHARMA
 */
public class HomeProducts extends javax.swing.JFrame {

    /**
     * Creates new form CustomerRegistration
     */
    
    public HomeProducts() {
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
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        registerCustomer = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 46, 30));
        setBounds(new java.awt.Rectangle(350, 100, 0, 0));
        setForeground(new java.awt.Color(0, 46, 30));
        setMinimumSize(new java.awt.Dimension(600, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 184, 163));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(600, 145));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 140));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shopping only banner.png"))); // NOI18N
        jLabel14.setText("jLabel14");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel14.setPreferredSize(new java.awt.Dimension(600, 145));
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 138));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 144));

        jPanel4.setBackground(new java.awt.Color(238, 215, 121));
        jPanel4.setForeground(new java.awt.Color(238, 215, 121));

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

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 600, 1));

        jPanel3.setBackground(new java.awt.Color(238, 215, 121));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerCustomer.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        registerCustomer.setText("Not yet registered? Click here...");
        registerCustomer.setContentAreaFilled(false);
        registerCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerCustomerActionPerformed(evt);
            }
        });
        jPanel3.add(registerCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, 40));

        backButton.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        backButton.setText("Back");
        backButton.setContentAreaFilled(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel3.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 600, 40));

        jLabel9.setBackground(new java.awt.Color(225, 90, 71));
        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PRODUCTS");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 600, 30));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

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

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 459, 600, 1));

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(238, 215, 121)));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setContentAreaFilled(false);
        jPanel34.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        jLabel47.setForeground(new java.awt.Color(225, 90, 71));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Computers");
        jPanel34.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 100, -1));

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Computers.png"))); // NOI18N
        jPanel34.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, 60, 64));

        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setText("jLabel1");
        jPanel35.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel50.setText("jLabel2");
        jPanel35.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        jPanel34.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, 100));

        jPanel1.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 100, 100));

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));
        jPanel46.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(238, 215, 121)));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setContentAreaFilled(false);
        jPanel46.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        jLabel71.setForeground(new java.awt.Color(225, 90, 71));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("Electronics");
        jPanel46.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 100, -1));

        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CatElec.jpg"))); // NOI18N
        jPanel46.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel73.setText("jLabel1");
        jPanel47.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel74.setText("jLabel2");
        jPanel47.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        jPanel46.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, 100));

        jPanel1.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 100, 100));

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));
        jPanel48.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(238, 215, 121)));
        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setContentAreaFilled(false);
        jPanel48.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        jLabel75.setForeground(new java.awt.Color(225, 90, 71));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("Mobile");
        jPanel48.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 100, -1));

        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CatMobi.jpg"))); // NOI18N
        jPanel48.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        jPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel77.setText("jLabel1");
        jPanel49.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel78.setText("jLabel2");
        jPanel49.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        jPanel48.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, 100));

        jPanel1.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 100, 100));

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));
        jPanel52.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(238, 215, 121)));
        jPanel52.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel52.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        jLabel83.setForeground(new java.awt.Color(225, 90, 71));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("Sports");
        jPanel52.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 100, -1));

        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sports.jpg"))); // NOI18N
        jPanel52.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        jPanel53.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel85.setText("jLabel1");
        jPanel53.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel86.setText("jLabel2");
        jPanel53.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        jPanel52.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, 100));

        jPanel1.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 100, 100));

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));
        jPanel44.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(238, 215, 121)));
        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setContentAreaFilled(false);
        jPanel44.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        jLabel67.setBackground(new java.awt.Color(225, 90, 71));
        jLabel67.setForeground(new java.awt.Color(225, 90, 71));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Clothing");
        jPanel44.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 100, -1));

        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CatClot.jpg"))); // NOI18N
        jLabel68.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel44.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel69.setText("jLabel1");
        jPanel45.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel70.setText("jLabel2");
        jPanel45.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        jPanel44.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, 100));

        jPanel1.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, 100));

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(238, 215, 121)));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setContentAreaFilled(false);
        jPanel38.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        jLabel55.setForeground(new java.awt.Color(225, 90, 71));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Softwares");
        jPanel38.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 100, -1));

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/software jej.png"))); // NOI18N
        jPanel38.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setText("jLabel1");
        jPanel39.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel58.setText("jLabel2");
        jPanel39.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        jPanel38.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, 100));

        jPanel1.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 100, 100));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jButton7.setText("jButton7");
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        new BaseNavigation().backButtonClicked("");
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void registerCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerCustomerActionPerformed
        // TODO add your handling code here:
        CustomerRegistration cstmrReg = new CustomerRegistration();
        cstmrReg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registerCustomerActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeProducts().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JButton registerCustomer;
    // End of variables declaration//GEN-END:variables
}
