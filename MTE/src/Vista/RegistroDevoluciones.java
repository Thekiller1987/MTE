/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Oreki
 */
public class RegistroDevoluciones extends javax.swing.JFrame {

    /**
     * Creates new form Devoluciones
     */
    public RegistroDevoluciones() {
        initComponents();
        textIdDev.setEnabled(false);
        
    }
    
    public void limpiarCampos() {
        textIdDev.setText("");
        textdescri.setText("");
        textfech.setText("");
        TextIdPro.setText("");
    }
    
    public void ObtenerDatos() {
        List<Devolucion> devol = new DAODevoluciones().ObtenerDatos();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String[] columnas = {"ID_devoluciones", "descrip", "fecha", "ID_prod"};
        
        modelo.setColumnIdentifiers(columnas);
        for (Devolucion au : devol) {
            
            String[] renglon = {Integer.toString(au.getID_devoluciones()), au.getDescrip(),
                au.getFecha().toString(), Integer.toString(au.getID_prod())};
            modelo.addRow(renglon);
        }
        tablaDevol.setModel(modelo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textfech = new javax.swing.JTextField();
        jToolBar2 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textIdDev = new javax.swing.JTextField();
        BtngGuard = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        textdescri = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDevol = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextIdPro = new javax.swing.JTextField();
        jBottonActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textfech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfechActionPerformed(evt);
            }
        });

        jToolBar2.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar2.setBorder(null);
        jToolBar2.setForeground(new java.awt.Color(51, 102, 0));
        jToolBar2.setRollover(true);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel7.setText("Devoluciones");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel7)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jToolBar2.add(jPanel2);

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 3, 18)); // NOI18N
        jLabel1.setText("Detalles de Devoluciones");

        textIdDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdDevActionPerformed(evt);
            }
        });

        BtngGuard.setBackground(new java.awt.Color(0, 153, 51));
        BtngGuard.setForeground(new java.awt.Color(255, 255, 255));
        BtngGuard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save white.png"))); // NOI18N
        BtngGuard.setText("Guardar");
        BtngGuard.setToolTipText("");
        BtngGuard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtngGuard.setBorderPainted(false);
        BtngGuard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtngGuardActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel2.setText("ID Devoluciones");

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edit white bold.png"))); // NOI18N
        jButton2.setText(" Editar");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel3.setText("Fecha Devolución");

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Delete white 2.png"))); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        textdescri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textdescriActionPerformed(evt);
            }
        });

        tablaDevol.setBackground(new java.awt.Color(255, 255, 255));
        tablaDevol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Devoluciones", "Descripción", "Fecha Devolución", "ID Producto"
            }
        ));
        jScrollPane1.setViewportView(tablaDevol);

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel4.setText("ID Producto");

        jLabel9.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel9.setText("Descripción");

        TextIdPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIdProActionPerformed(evt);
            }
        });

        jBottonActualizar.setBackground(new java.awt.Color(0, 153, 255));
        jBottonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jBottonActualizar.setText("Actualizar");
        jBottonActualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBottonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBottonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtngGuard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(jBottonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(textfech, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textdescri, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(textIdDev, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(TextIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textIdDev, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textdescri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextIdPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(BtngGuard, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBottonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textfechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfechActionPerformed

    private void textIdDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdDevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdDevActionPerformed

    private void BtngGuardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtngGuardActionPerformed
        //buton guardar
        
        String descrip = textdescri.getText();
        String fecha = textfech.getText();
        String ID_prod = TextIdPro.getText();
        
        if (descrip.contentEquals("") || fecha.contentEquals("") || ID_prod.contentEquals("")) {
            JOptionPane.showMessageDialog(rootPane, "Todos los campos son obligatorio");
        } else {
            try {
                Date fech = Date.valueOf(fecha);
                int Idprod = Integer.parseInt(ID_prod);
                Devolucion d1 = new DAODevoluciones().Insertar(descrip, fech, Idprod);
                JOptionPane.showMessageDialog(rootPane, "Registro agregado");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agrego el registro");
            }
        }
        ObtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_BtngGuardActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int fila = this.tablaDevol.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione un registro de la tabla primero");
        } else {
            try {
                
                int idprov = Integer.parseInt((String) this.tablaDevol.getValueAt(fila, 0).toString());
                String descrrr = (String) this.tablaDevol.getValueAt(fila, 1);
                Date fechhs = Date.valueOf((String) this.tablaDevol.getValueAt(fila, 2).toString());
                int idprodd = Integer.parseInt((String) this.tablaDevol.getValueAt(fila, 3).toString());
                
                textIdDev.setText("" + idprov);
                textdescri.setText("" + descrrr);
                textfech.setText(String.valueOf(fechhs));
                TextIdPro.setText("" + idprodd);
                
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void actualizarProvedor(){
        int idprov = Integer.parseInt(this.TextIdPro.getText());
        String descrrr = this.textdescri.getText();
        Date fechhs = Date.valueOf(this.textfech.getText());
        int idprodd = Integer.parseInt(this.TextIdPro.getText());
        
        
        DAODevoluciones dao = new DAODevoluciones();
        int devoll = dao.Actualizar(idprov, descrrr, fechhs, idprodd);
        if (devoll == 1){
            JOptionPane.showMessageDialog(rootPane, "¡Producto Actualizado!");
        }else{
            JOptionPane.showMessageDialog(rootPane, "¡Ocurrio un ERROR!");
        }
    }
    
    
    private void textdescriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textdescriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textdescriActionPerformed

    private void TextIdProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIdProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIdProActionPerformed

    private void jBottonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBottonActualizarActionPerformed
        actualizarProvedor();
        ObtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_jBottonActualizarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int fila = this.tablaDevol.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione un registro de la tabla primero");
        } else {
            int id = Integer.parseInt((String) this.tablaDevol.getValueAt(fila, 0).toString());
            DAODevoluciones dao = new DAODevoluciones();
            dao.Eliminar(id);
            ObtenerDatos();
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtngGuard;
    private javax.swing.JTextField TextIdPro;
    private javax.swing.JButton jBottonActualizar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTable tablaDevol;
    private javax.swing.JTextField textIdDev;
    private javax.swing.JTextField textdescri;
    private javax.swing.JTextField textfech;
    // End of variables declaration//GEN-END:variables
}
