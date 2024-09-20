package group1;

import javax.swing.JOptionPane;

public class secondaryCode extends javax.swing.JFrame {
    public secondaryCode() {
        initComponents();
    }

    public void showTotalPrice(double total) {
        lblOverallA.setText("" + total);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblOverallA = new javax.swing.JLabel();
        txtMoney = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnFinish = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        lblExchange = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(420, 450));
        setPreferredSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOverallA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOverallA.setText("0");
        getContentPane().add(lblOverallA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 60, 25));
        getContentPane().add(txtMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 124, 176, 29));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Total Amount:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 80, 25));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Enter your amount:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 124, 120, 30));

        btnFinish.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnFinish.setText("DONE");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinish, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 90, 40));

        btnConfirm.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnConfirm.setText("PAY");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        lblExchange.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(lblExchange, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 190, 50));

        jLabel3.setFont(new java.awt.Font("Georgia Pro Black", 1, 18)); // NOI18N
        jLabel3.setText("Checkout");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/group1/checlout.png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(800, 900));
        jLabel4.setMinimumSize(new java.awt.Dimension(460, 430));
        jLabel4.setPreferredSize(new java.awt.Dimension(460, 470));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 420, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        double bill = Double.parseDouble(lblOverallA.getText());
        double money = Double.parseDouble(txtMoney.getText());

        if (bill > money) {
            JOptionPane.showMessageDialog(null, "<html><b>Payment unsuccessful!</b><br><br>You don't have sufficient funds to proceed with this transaction</html>");
        } else if (money > bill) {
            JOptionPane.showMessageDialog(null, "<html><b>Payment Successful!</b><br>Transaction complete.<br><br>Wait for your change before clicking the <b>'Done'</b> button</html>");
            double change = money - bill;
            lblExchange.setText("Change: " + change);
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed

        this.toBack();
        setVisible(false);
        new mainCode().toFront();
        new mainCode().setState(java.awt.Frame.NORMAL);
        JOptionPane.showMessageDialog(null, "<html><b>Thanks so much for your order!</b><br> I hope you enjoy your meal! :)  </html>");
    }//GEN-LAST:event_btnFinishActionPerformed

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
            java.util.logging.Logger.getLogger(secondaryCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(secondaryCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(secondaryCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(secondaryCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new secondaryCode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnFinish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblExchange;
    private javax.swing.JLabel lblOverallA;
    public static javax.swing.JTextField txtMoney;
    // End of variables declaration//GEN-END:variables
}
