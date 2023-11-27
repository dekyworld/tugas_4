
import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASPIRE Swift 3
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiPenampilGambarButton
     */
    public PilihGambarButton() {
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

        buttonPanel = new javax.swing.JPanel();
        btnGlassfish = new javax.swing.JButton();
        btnJavaEE = new javax.swing.JButton();
        btnPostgre = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        lblJavaEE = new javax.swing.JLabel();
        lblPostgre = new javax.swing.JLabel();
        lblGlassfish = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(418, 367));

        btnGlassfish.setText("Glassfish");
        btnGlassfish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGlassfishActionPerformed(evt);
            }
        });
        buttonPanel.add(btnGlassfish);

        btnJavaEE.setText("JavaEE");
        btnJavaEE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJavaEEActionPerformed(evt);
            }
        });
        buttonPanel.add(btnJavaEE);

        btnPostgre.setText("Postgre SQL");
        btnPostgre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostgreActionPerformed(evt);
            }
        });
        buttonPanel.add(btnPostgre);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        buttonPanel.add(btnExit);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setMinimumSize(new java.awt.Dimension(339, 33));
        imagePanel.setLayout(new java.awt.CardLayout());

        lblJavaEE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJavaEE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaEE.jpeg"))); // NOI18N
        imagePanel.add(lblJavaEE, "1");

        lblPostgre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPostgre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Postgre.jpeg"))); // NOI18N
        imagePanel.add(lblPostgre, "2");

        lblGlassfish.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGlassfish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/glassfish.jpg"))); // NOI18N
        imagePanel.add(lblGlassfish, "0");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGlassfishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGlassfishActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel,"0");
    }//GEN-LAST:event_btnGlassfishActionPerformed

    private void btnJavaEEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJavaEEActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel,"1");        
    }//GEN-LAST:event_btnJavaEEActionPerformed

    private void btnPostgreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostgreActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel,"2");
    }//GEN-LAST:event_btnPostgreActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarButton().setVisible(true);
                
     
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGlassfish;
    private javax.swing.JButton btnJavaEE;
    private javax.swing.JButton btnPostgre;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel lblGlassfish;
    private javax.swing.JLabel lblJavaEE;
    private javax.swing.JLabel lblPostgre;
    // End of variables declaration//GEN-END:variables
}
