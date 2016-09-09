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
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import structures.Cluster;
import structures.Institucion;
import structures.Oficina;
import structures.Proyecto;

enum Usuarios {

    admin, usuario, normal
}

/**
 *
 * @author fangi
 */
public class Start extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    Institucion[] instituciones;
    Oficina[] oficinas;
    Cluster[] clusters;
    Proyecto[] proyectos;
    public static int idCuenta = -1;
    public static Usuarios puesto=Usuarios.normal;

    public void cambiarVentana(JFrame frame) {
        frame.setVisible(true);
        this.dispose();
    }

    public Start() {
        try {
            Connection con = Conexion.getConexion();

            instituciones = Conexion.rstoInstituciones(con, "select * from institucion ", null);
            oficinas = Conexion.rstoOficinas(con, "select * from oficina where idOficina=?", new Object[]{instituciones[0].getId()});
            clusters = Conexion.rstoClusters(con, "select * from cluster where fkOficina=?", new Object[]{oficinas[0].getId()});
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();
        JComponent[] components = {jButton1, RegistroP, eliminar, modificar, jButton2};
        for (JComponent c : components) {
            c.setVisible(false);
        }
        buscar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        RegistroP = new javax.swing.JButton();
        logo = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        usuario = new javax.swing.JTextField();
        buscar = new javax.swing.JTextField();
        institucion = new javax.swing.JComboBox<String>();
        oficina = new javax.swing.JComboBox<String>();
        cluster = new javax.swing.JComboBox<String>();
        ChechBInv = new javax.swing.JCheckBox();
        CheckBOT = new javax.swing.JCheckBox();
        Resultados = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 359, -1, -1));

        RegistroP.setForeground(new java.awt.Color(60, 63, 65));
        RegistroP.setText("Registro Proyecto");
        RegistroP.setBorderPainted(false);
        RegistroP.setEnabled(false);
        RegistroP.setOpaque(false);
        RegistroP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroPActionPerformed(evt);
            }
        });
        getContentPane().add(RegistroP, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Login/logo2.png"))); // NOI18N
        logo.setBorderPainted(false);
        logo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoActionPerformed(evt);
            }
        });
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 359, -1, -1));

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 29, 78, -1));
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 301, 255, -1));

        institucion.setModel(new javax.swing.DefaultComboBoxModel(instituciones!=null?instituciones:new Institucion[]{}));
        institucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institucionActionPerformed(evt);
            }
        });
        getContentPane().add(institucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 170, 190, -1));

        oficina.setModel(new javax.swing.DefaultComboBoxModel(oficinas!=null?oficinas:new Oficina[]{}));
        oficina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oficinaActionPerformed(evt);
            }
        });
        getContentPane().add(oficina, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 214, 190, -1));

        cluster.setModel(new javax.swing.DefaultComboBoxModel(clusters!=null ? clusters : new Cluster[]{} ));
        getContentPane().add(cluster, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 255, 190, -1));

        ChechBInv.setText("Investigadores");
        ChechBInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChechBInvActionPerformed(evt);
            }
        });
        getContentPane().add(ChechBInv, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 301, -1, -1));

        CheckBOT.setText("OT´s");
        CheckBOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBOTActionPerformed(evt);
            }
        });
        getContentPane().add(CheckBOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 301, -1, -1));

        jTable1.setModel(new CustomTableModel("busque proyesctos"));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        Resultados.setViewportView(jTable1);

        getContentPane().add(Resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 409, 525, 230));

        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 33, -1, -1));

        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 33, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Instituciones:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Oficina:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 212, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Clusters");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 254, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Buscar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 299, -1, -1));

        jButton1.setText("Visualizar");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, -1, -1));

        jButton2.setText("cerrar sesion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        try {
            Connection con = Conexion.getConexion();
            String query = "SELECT * From usuario ";
            ResultSet rs = Conexion.consultValues(con, query, null);
            String n = usuario.getText();
            int i = 0;
            while (rs.next()) {

                if (n.equals(rs.getString(5)) && checkPassword(jPasswordField1.getPassword(), rs.getString(6))) {
                    idCuenta = rs.getInt(1);
                    if (rs.getString(3).equals("administrador")) {
                        puesto = Usuarios.admin;
                        JComponent[] components = {RegistroP, eliminar, modificar, jButton2};
                        for (JComponent c : components) {
                            c.setVisible(true);
                            c.setEnabled(true);
                        }
                        JComponent[] components1 = {usuario, jPasswordField1, Login, jLabel1, jLabel2};
                        for (JComponent c : components1) {
                            c.setVisible(false);
                            c.setEnabled(false);
                        }
                    } else {
                        puesto = Usuarios.usuario;
                        JComponent[] components = {RegistroP};
                        for (JComponent c : components) {
                            c.setVisible(true);
                            c.setEnabled(true);
                        }
                    }
                    i = 0;
                    break;
                } else {
                    i = -1;
                }
            }

            if (i == -1) {
                JOptionPane.showMessageDialog(null, "ID o contraseña incorrectos");
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_LoginActionPerformed
    private boolean checkPassword(char[] epswd, String pswd) {
        return Arrays.equals(epswd, pswd.toCharArray());
    }
    private void ChechBInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChechBInvActionPerformed
        if (!ChechBInv.isSelected() && !CheckBOT.isSelected()) {
            buscar.setEnabled(false);

        } else {
            buscar.setEnabled(true);
        }
    }//GEN-LAST:event_ChechBInvActionPerformed

    private void institucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_institucionActionPerformed
        try {
            Connection con = Conexion.getConexion();
            oficinas = Conexion.rstoOficinas(con, "select * from oficina where idOficina=?", new Object[]{((Institucion) institucion.getSelectedItem()).getId()});
            clusters = Conexion.rstoClusters(con, "select * from cluster where fkOficina=?", new Object[]{oficinas[0].getId()});
            updateComboBoxes(2);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_institucionActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // add delete 
        CustomTableModel model = (CustomTableModel) jTable1.getModel();
        Connection con;
        try {
            con = Conexion.getConexion();
             for (int i = 0; i < jTable1.getSelectedRowCount(); i++) {
            Conexion.executeUpdate(con, "Delete from ofertas_Tecnologicas_has_Investigadores where fkIdOT=? ", new Object[]{proyectos[jTable1.getSelectedRow()].getId()});
            Conexion.executeUpdate(con, "Delete from ofertas_Tecnologicas where idOT=? ", new Object[]{proyectos[jTable1.getSelectedRow()].getId()});
        }
        } catch (SQLException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        eliminar.setVisible(false);
        modificar.setVisible(false);
        eliminar.setEnabled(false);
        modificar.setEnabled(false);
    }//GEN-LAST:event_eliminarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

        String sql;
        CustomTableModel mt;
        if (ChechBInv.isSelected() && CheckBOT.isSelected()) {
            sql = "select ot.idOT, ot.fkIdCluster, ot.nombre,ot.descripcion,"
                    + "ot.estatus,ot.ventajas,ot.antecedentes,ot.aplicaciones "
                    + "from ofertas_Tecnologicas ot join cluster c on "
                    + "c.idCluster=ot.fkIdCluster join oficina o on "
                    + "o.idOficina=c.fkOficina join institucion i on "
                    + "i.idInstitucion= o.fkIdInstitucion "
                    + "join ofertas_Tecnologicas_has_Investigadores othi on "
                    + "othi.fkIdOT=ot.idOT join Investigadores inv on "
                    + "inv.idInvestigadores=othi.fkIdInvestigadores "
                    + "where  inv.nombre like ? OR ot.nombre like ? and c.idCluster= ? and o.idOficina=? and i.idInstitucion=? ;";
            try {
                Connection con = Conexion.getConexion();
                proyectos = Conexion.rstoProyectos(con, sql, new Object[]{"%" + buscar.getText() + "%", "%" + buscar.getText() + "%", ((Cluster) cluster.getSelectedItem()).getId(), ((Oficina) oficina.getSelectedItem()).getId(), ((Institucion) institucion.getSelectedItem()).getId()});
                sql = "select ot.nombre as Proyecto "
                        + "from ofertas_Tecnologicas ot join cluster c on "
                        + "c.idCluster=ot.fkIdCluster join oficina o on "
                        + "o.idOficina=c.fkOficina join institucion i on "
                        + "i.idInstitucion= o.fkIdInstitucion "
                        + "join ofertas_Tecnologicas_has_Investigadores othi on "
                        + "othi.fkIdOT=ot.idOT join Investigadores inv on "
                        + "inv.idInvestigadores=othi.fkIdInvestigadores "
                        + "where inv.nombre like ? OR ot.nombre like ? and c.idCluster= ? and o.idOficina=? and i.idInstitucion=? ;";
                mt = Conexion.createTableModel(con, sql,
                        new Object[]{"%" + buscar.getText() + "%", "%" + buscar.getText() + "%", ((Cluster) cluster.getSelectedItem()).getId(), ((Oficina) oficina.getSelectedItem()).getId(), ((Institucion) institucion.getSelectedItem()).getId()}, "ningun proyecto encontrado");
                jTable1.setModel(mt);
                con.close();
                return;
            } catch (SQLException ex) {
                Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (CheckBOT.isSelected()) {
            sql = "select ot.idOT, ot.fkIdCluster, ot.nombre,ot.descripcion,"
                    + "ot.estatus,ot.ventajas,ot.antecedentes,ot.aplicaciones "
                    + "from ofertas_Tecnologicas ot join cluster c on "
                    + "c.idCluster=ot.fkIdCluster join oficina o on "
                    + "o.idOficina=c.fkOficina join institucion i on "
                    + "i.idInstitucion= o.fkIdInstitucion "
                    + "where ot.nombre like ? and c.idCluster= ? and o.idOficina=? and i.idInstitucion=? ;";
            try {
                Connection con = Conexion.getConexion();
                proyectos = Conexion.rstoProyectos(con, sql, new Object[]{"%" + buscar.getText() + "%", ((Cluster) cluster.getSelectedItem()).getId(), ((Oficina) oficina.getSelectedItem()).getId(), ((Institucion) institucion.getSelectedItem()).getId()});
                sql = "select ot.nombre as Poyecto "
                        + "from ofertas_Tecnologicas ot join cluster c on "
                        + "c.idCluster=ot.fkIdCluster join oficina o on "
                        + "o.idOficina=c.fkOficina join institucion i on "
                        + "i.idInstitucion= o.fkIdInstitucion "
                        + "where ot.nombre like ? and c.idCluster= ? and o.idOficina=? and i.idInstitucion=?  ;";
                mt = Conexion.createTableModel(con, sql, new Object[]{"%" + buscar.getText() + "%", ((Cluster) cluster.getSelectedItem()).getId(), ((Oficina) oficina.getSelectedItem()).getId(), ((Institucion) institucion.getSelectedItem()).getId()}, "ningun proyecto encontrado");
                jTable1.setModel(mt);
                con.close();
                return;
            } catch (SQLException ex) {
                Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (ChechBInv.isSelected()) {
            sql = "select ot.idOT, ot.fkIdCluster, ot.nombre,ot.descripcion,"
                    + "ot.estatus,ot.ventajas,ot.antecedentes,ot.aplicaciones "
                    + "from ofertas_Tecnologicas ot join cluster c on "
                    + "c.idCluster=ot.fkIdCluster join oficina o on "
                    + "o.idOficina=c.fkOficina join institucion i on "
                    + "i.idInstitucion= o.fkIdInstitucion "
                    + "join ofertas_Tecnologicas_has_Investigadores othi on "
                    + "othi.fkIdOT=ot.idOT join Investigadores inv on "
                    + "inv.idInvestigadores=othi.fkIdInvestigadores "
                    + "where inv.nombre like ? and c.idCluster= ? and o.idOficina=? and i.idInstitucion=? ;";
            try {
                Connection con = Conexion.getConexion();
                proyectos = Conexion.rstoProyectos(con, sql, new Object[]{"%" + buscar.getText() + "%", ((Cluster) cluster.getSelectedItem()).getId(), ((Oficina) oficina.getSelectedItem()).getId(), ((Institucion) institucion.getSelectedItem()).getId()});
                sql = "select ot.nombre as Proyecto "
                        + "from ofertas_Tecnologicas ot join cluster c on "
                        + "c.idCluster=ot.fkIdCluster join oficina o on "
                        + "o.idOficina=c.fkOficina join institucion i on "
                        + "i.idInstitucion= o.fkIdInstitucion "
                        + "join ofertas_Tecnologicas_has_Investigadores othi on "
                        + "othi.fkIdOT=ot.idOT join Investigadores inv on "
                        + "inv.idInvestigadores=othi.fkIdInvestigadores "
                        + "where inv.nombre like ? and c.idCluster= ? and o.idOficina=? and i.idInstitucion=? ;";
                mt = Conexion.createTableModel(con, sql, new Object[]{"%" + buscar.getText() + "%", ((Cluster) cluster.getSelectedItem()).getId(), ((Oficina) oficina.getSelectedItem()).getId(), ((Institucion) institucion.getSelectedItem()).getId()}, "ningun proyecto encontrado");
                jTable1.setModel(mt);
                con.close();
                return;

            } catch (SQLException ex) {
                Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            sql = "select ot.idOT, ot.fkIdCluster, ot.nombre,ot.descripcion,"
                    + "ot.estatus,ot.ventajas,ot.antecedentes,ot.aplicaciones "
                    + "from ofertas_Tecnologicas ot join cluster c on "
                    + "c.idCluster=ot.fkIdCluster join oficina o on "
                    + "o.idOficina=c.fkOficina join institucion i on "
                    + "i.idInstitucion= o.fkIdInstitucion where c.idCluster= ? and o.idOficina=? and i.idInstitucion=? ;";
            try {
                Connection con = Conexion.getConexion();
                proyectos = Conexion.rstoProyectos(con, sql, new Object[]{((Cluster) cluster.getSelectedItem()).getId(), ((Oficina) oficina.getSelectedItem()).getId(), ((Institucion) institucion.getSelectedItem()).getId()});
                sql = "select ot.nombre as Proyectos "
                        + "from ofertas_Tecnologicas ot join cluster c on "
                        + "c.idCluster=ot.fkIdCluster join oficina o on "
                        + "o.idOficina=c.fkOficina join institucion i on "
                        + "i.idInstitucion= o.fkIdInstitucion where c.idCluster= ? and o.idOficina=? and i.idInstitucion=? ;";
                mt = Conexion.createTableModel(con, sql, new Object[]{((Cluster) cluster.getSelectedItem()).getId(), ((Oficina) oficina.getSelectedItem()).getId(), ((Institucion) institucion.getSelectedItem()).getId()}, "ningun proyecto encontrado");
                jTable1.setModel(mt);
                con.close();

            } catch (SQLException ex) {
                Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_BuscarActionPerformed

    private void oficinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oficinaActionPerformed
        try {
            Connection con = Conexion.getConexion();
            clusters = Conexion.rstoClusters(con, "select * from cluster where fkOficina=?", new Object[]{((Oficina) oficina.getSelectedItem()).getId()});
            updateComboBoxes(3);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_oficinaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        CustomTableModel model = (CustomTableModel) jTable1.getModel();
        int rows = jTable1.getSelectedRowCount();
        if (rows > 0) {
            jButton1.setEnabled(true);
            jButton1.setVisible(true);
            if (puesto == Usuarios.admin) {
                eliminar.setVisible(true);
                modificar.setVisible(true);
                eliminar.setEnabled(true);
                modificar.setEnabled(true);
            }
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void RegistroPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroPActionPerformed
        cambiarVentana(new Registro());
    }//GEN-LAST:event_RegistroPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cambiarVentana(new MostrarOT(proyectos[jTable1.getSelectedRow()]));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CheckBOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBOTActionPerformed
        if (!ChechBInv.isSelected() && !CheckBOT.isSelected()) {
            buscar.setEnabled(false);

        } else {
            buscar.setEnabled(true);
        }
    }//GEN-LAST:event_CheckBOTActionPerformed

    private void logoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoActionPerformed
        if (puesto == Usuarios.admin) {
            cambiarVentana(new OpcionesAdmin());
        }
    }//GEN-LAST:event_logoActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed

        //TODO
        cambiarVentana(new Registro());
    }//GEN-LAST:event_modificarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        puesto=Usuarios.normal;
        cambiarVentana(new Start());
    }//GEN-LAST:event_jButton2ActionPerformed
    void updateComboBoxes(int c) {
        switch (c) {
            case 1:
                if (instituciones != null) {
                    institucion.setModel(new javax.swing.DefaultComboBoxModel(instituciones));
                } else {
                    institucion.setModel(new javax.swing.DefaultComboBoxModel(new Institucion[]{}));
                    institucion.setEnabled(false);
                    oficina.setEnabled(false);
                    cluster.setEnabled(false);
                }

            case 2:
                if (oficinas != null) {
                    oficina.setModel(new javax.swing.DefaultComboBoxModel(oficinas));
                } else {
                    oficina.setModel(new javax.swing.DefaultComboBoxModel(new Oficina[]{}));
                    oficina.setEnabled(false);
                    cluster.setEnabled(false);
                }

            case 3:
                if (clusters != null) {
                    cluster.setModel(new javax.swing.DefaultComboBoxModel(clusters));
                } else {
                    cluster.setModel(new javax.swing.DefaultComboBoxModel(new Cluster[]{}));
                    cluster.setEnabled(false);
                }
        }

    }

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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JCheckBox ChechBInv;
    private javax.swing.JCheckBox CheckBOT;
    private javax.swing.JButton Login;
    private javax.swing.JButton RegistroP;
    private javax.swing.JScrollPane Resultados;
    private javax.swing.JTextField buscar;
    private javax.swing.JComboBox<String> cluster;
    private javax.swing.JButton eliminar;
    private javax.swing.JComboBox<String> institucion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logo;
    private javax.swing.JButton modificar;
    private javax.swing.JComboBox<String> oficina;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
