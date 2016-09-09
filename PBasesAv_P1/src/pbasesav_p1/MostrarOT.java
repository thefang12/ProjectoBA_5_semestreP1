/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbasesav_p1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import structures.Proyecto;
import pbasesav_p1.Start;

/**
 *
 * @author Soporte
 */
public class MostrarOT extends javax.swing.JFrame {

    public void cambiarVentana(JFrame frame) {
        frame.setVisible(true);
        this.dispose();
    }
    /**
     * Creates new form MostrarOT
     */
    public MostrarOT(Proyecto ProMostrar) {
        initComponents();
        NombreOT.setText(ProMostrar.toString());
        VentajasOT.setText(ProMostrar.getDescripcion());
        VentajasOT.setText(ProMostrar.getEstatus());
        VentajasOT.setText(ProMostrar.getVentajas());
        AplicacionesOT.setText(ProMostrar.getAntecedentes());
        AplicacionesOT.setText(ProMostrar.getAplicaciones());
        Connection con;
        try {
            con = Conexion.getConexion();
            for (int i : ProMostrar.getIdInvestigadores()) {
                ResultSet rs =Conexion.consultValues(con, "select nombre from Investigadores where idInvestigadores = ?", new Object[]{i});
                rs.next();
                ((CustomTableModel) ColaboradoresOT.getModel()).addRow(new Object[]{rs.getString(1)});
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public MostrarOT() {
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

        EstatusM = new javax.swing.JLabel();
        VentajasM = new javax.swing.JLabel();
        ColaboradoresM = new javax.swing.JLabel();
        AplicacionesM = new javax.swing.JLabel();
        logo = new javax.swing.JButton();
        AntecedentesM = new javax.swing.JLabel();
        NombreM = new javax.swing.JLabel();
        DescripcionM = new javax.swing.JLabel();
        AplicacionesOT = new javax.swing.JTextField();
        NombreOT = new javax.swing.JTextField();
        VentajasOT = new javax.swing.JTextField();
        AntecedenetesOT = new javax.swing.JTextField();
        DescripcionOT = new javax.swing.JTextField();
        EstatusOT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ColaboradoresOT = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(627, 484));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EstatusM.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        EstatusM.setText("Estatus");
        getContentPane().add(EstatusM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        VentajasM.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        VentajasM.setText("Ventajas");
        getContentPane().add(VentajasM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        ColaboradoresM.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ColaboradoresM.setText("Colaboradores");
        getContentPane().add(ColaboradoresM, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        AplicacionesM.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        AplicacionesM.setText("Aplicaciones");
        getContentPane().add(AplicacionesM, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Login/logo2.png"))); // NOI18N
        logo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoActionPerformed(evt);
            }
        });
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        AntecedentesM.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        AntecedentesM.setText("Antecedentes");
        getContentPane().add(AntecedentesM, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        NombreM.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NombreM.setText("Nombre");
        getContentPane().add(NombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 183, -1, -1));

        DescripcionM.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DescripcionM.setText("Descripción");
        getContentPane().add(DescripcionM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 249, -1, -1));

        AplicacionesOT.setText("jTextField1");
        AplicacionesOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AplicacionesOTActionPerformed(evt);
            }
        });
        getContentPane().add(AplicacionesOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 190, 69));

        NombreOT.setText("jTextField1");
        NombreOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreOTActionPerformed(evt);
            }
        });
        getContentPane().add(NombreOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 190, 30));

        VentajasOT.setText("jTextField1");
        VentajasOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentajasOTActionPerformed(evt);
            }
        });
        getContentPane().add(VentajasOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 190, 50));

        AntecedenetesOT.setText("jTextField1");
        AntecedenetesOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AntecedenetesOTActionPerformed(evt);
            }
        });
        getContentPane().add(AntecedenetesOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 190, 60));

        DescripcionOT.setText("jTextField1");
        DescripcionOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescripcionOTActionPerformed(evt);
            }
        });
        getContentPane().add(DescripcionOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 190, 73));

        EstatusOT.setText("jTextField1");
        EstatusOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstatusOTActionPerformed(evt);
            }
        });
        getContentPane().add(EstatusOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 190, 50));

        ColaboradoresOT.setModel(new CustomTableModel("Investigadores"));
        jScrollPane1.setViewportView(ColaboradoresOT);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 190, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoActionPerformed
        // TODO add your handling code here:
        cambiarVentana(new Start());                
    }//GEN-LAST:event_logoActionPerformed

    private void AplicacionesOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AplicacionesOTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AplicacionesOTActionPerformed

    private void NombreOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreOTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreOTActionPerformed

    private void VentajasOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentajasOTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VentajasOTActionPerformed

    private void AntecedenetesOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AntecedenetesOTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AntecedenetesOTActionPerformed

    private void DescripcionOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescripcionOTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescripcionOTActionPerformed

    private void EstatusOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstatusOTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstatusOTActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AntecedenetesOT;
    private javax.swing.JLabel AntecedentesM;
    private javax.swing.JLabel AplicacionesM;
    private javax.swing.JTextField AplicacionesOT;
    private javax.swing.JLabel ColaboradoresM;
    private javax.swing.JTable ColaboradoresOT;
    private javax.swing.JLabel DescripcionM;
    private javax.swing.JTextField DescripcionOT;
    private javax.swing.JLabel EstatusM;
    private javax.swing.JTextField EstatusOT;
    private javax.swing.JLabel NombreM;
    private javax.swing.JTextField NombreOT;
    private javax.swing.JLabel VentajasM;
    private javax.swing.JTextField VentajasOT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logo;
    // End of variables declaration//GEN-END:variables
}
