/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controlador.ControladorRequerimientos;
import java.util.ArrayList;
import modelo.VO.*;

/**
 *
 * @author Kestoc
 */
public class mainView extends javax.swing.JFrame {

    /**
     * Creates new form ventanaPrincipal
     */
    
    private static final ControladorRequerimientos controlador = new ControladorRequerimientos();
    private viewLeaders viewLeaders;
    private viewMaterials viewMaterials;
    private viewBuildings viewBuildings;
    
    public mainView() {
        initComponents();
        //this.setTitle("Challenge #5 - Main View");
        this.setLocationRelativeTo(null);
        viewLeaders = new viewLeaders();
        viewLeaders.setVisible(false);
        viewMaterials = new viewMaterials();
        viewMaterials.setVisible(false);
        viewBuildings = new viewBuildings();
        viewBuildings.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas = new javax.swing.JPanel();
        iconProgrammer = new javax.swing.JLabel();
        iconUTP = new javax.swing.JLabel();
        iconMision = new javax.swing.JLabel();
        iconDB = new javax.swing.JLabel();
        iconJava = new javax.swing.JLabel();
        query1 = new javax.swing.JButton();
        query2 = new javax.swing.JButton();
        query3 = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        canvas.setMinimumSize(new java.awt.Dimension(626, 417));
        canvas.setPreferredSize(new java.awt.Dimension(626, 417));
        canvas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconProgrammer.setIcon(new javax.swing.ImageIcon("C:\\Users\\57302\\Desktop\\MisionTIC\\Ciclo2\\Reto5\\R5P74\\src\\main\\java\\images\\icon_programmer_pixel.png")); // NOI18N
        canvas.add(iconProgrammer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 215, -1, -1));

        iconUTP.setIcon(new javax.swing.ImageIcon("C:\\Users\\57302\\Desktop\\MisionTIC\\Ciclo2\\Reto5\\R5P74\\src\\main\\java\\images\\logo-utp.png")); // NOI18N
        canvas.add(iconUTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 373, -1, -1));

        iconMision.setIcon(new javax.swing.ImageIcon("C:\\Users\\57302\\Desktop\\MisionTIC\\Ciclo2\\Reto5\\R5P74\\src\\main\\java\\images\\logo_misionTic.png")); // NOI18N
        canvas.add(iconMision, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 356, -1, -1));

        iconDB.setIcon(new javax.swing.ImageIcon("C:\\Users\\57302\\Desktop\\MisionTIC\\Ciclo2\\Reto5\\R5P74\\src\\main\\java\\images\\db_icon.png")); // NOI18N
        canvas.add(iconDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 348, -1, -1));

        iconJava.setIcon(new javax.swing.ImageIcon("C:\\Users\\57302\\Desktop\\MisionTIC\\Ciclo2\\Reto5\\R5P74\\src\\main\\java\\images\\java_icon.png")); // NOI18N
        canvas.add(iconJava, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 347, -1, -1));

        query1.setBackground(new java.awt.Color(0, 51, 102));
        query1.setFont(new java.awt.Font("Verdana", 3, 11)); // NOI18N
        query1.setForeground(new java.awt.Color(102, 204, 255));
        query1.setText("Leaders - Documents");
        query1.setBorder(null);
        query1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        query1.setPreferredSize(new java.awt.Dimension(160, 25));
        query1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                query1MouseClicked(evt);
            }
        });
        query1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                query1ActionPerformed(evt);
            }
        });
        canvas.add(query1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        query2.setBackground(new java.awt.Color(0, 51, 102));
        query2.setFont(new java.awt.Font("Verdana", 3, 11)); // NOI18N
        query2.setForeground(new java.awt.Color(102, 204, 255));
        query2.setText("Materials - Proyects");
        query2.setBorder(null);
        query2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        query2.setPreferredSize(new java.awt.Dimension(160, 25));
        query2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                query2MouseClicked(evt);
            }
        });
        canvas.add(query2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        query3.setBackground(new java.awt.Color(0, 51, 102));
        query3.setFont(new java.awt.Font("Verdana", 3, 11)); // NOI18N
        query3.setForeground(new java.awt.Color(102, 204, 255));
        query3.setText("Buildings - Pereira");
        query3.setBorder(null);
        query3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        query3.setPreferredSize(new java.awt.Dimension(160, 25));
        query3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                query3MouseClicked(evt);
            }
        });
        canvas.add(query3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        title.setFont(new java.awt.Font("Verdana", 3, 48)); // NOI18N
        title.setForeground(new java.awt.Color(102, 204, 255));
        title.setText("QUERIES");
        title.setToolTipText("");
        canvas.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        exit.setBackground(new java.awt.Color(0, 51, 102));
        exit.setFont(new java.awt.Font("Verdana", 3, 11)); // NOI18N
        exit.setForeground(new java.awt.Color(102, 204, 255));
        exit.setText("Exit");
        exit.setBorder(null);
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setPreferredSize(new java.awt.Dimension(50, 25));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        canvas.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\57302\\Desktop\\MisionTIC\\Ciclo2\\Reto5\\R5P74\\src\\main\\java\\images\\background_technology.jpg")); // NOI18N
        canvas.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canvas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void query1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_query1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_query1ActionPerformed

    private void query1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_query1MouseClicked
        // TODO add your handling code here:
        viewLeaders.setVisible(true);
    }//GEN-LAST:event_query1MouseClicked

    private void query2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_query2MouseClicked
        // TODO add your handling code here:
        viewMaterials.setVisible(true);
    }//GEN-LAST:event_query2MouseClicked

    private void query3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_query3MouseClicked
        // TODO add your handling code here:
        viewBuildings.setVisible(true);
    }//GEN-LAST:event_query3MouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseClicked

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JPanel canvas;
    private javax.swing.JButton exit;
    private javax.swing.JLabel iconDB;
    private javax.swing.JLabel iconJava;
    private javax.swing.JLabel iconMision;
    private javax.swing.JLabel iconProgrammer;
    private javax.swing.JLabel iconUTP;
    private javax.swing.JButton query1;
    private javax.swing.JButton query2;
    private javax.swing.JButton query3;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
