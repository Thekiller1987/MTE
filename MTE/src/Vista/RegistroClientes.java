/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Modelo.*;
import javax.swing.ButtonGroup;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class RegistroClientes extends javax.swing.JInternalFrame {

    
    /**
     * Creates new form Clientes
     */
    public RegistroClientes() {
        initComponents();
    jtextfieldIDclientes.setEditable(false);
    }
 public void limpiarCampos(){
      jtextfieldIDclientes.setText("");
      jtextFieldPrimerNomb.setText("");
      jTextFieldSegunNomb.setText("");
      TextAClientes.setText("");
      jTextFieldsegunapell.setText("");
      TextNu.setText("");
      TextDClientes.setText("");
      
      
      
 }
 public void obtenerDatos(){
        
        List<Clientes> cliente=new DAOCliente().ObtenerDatos();
        
        DefaultTableModel modelo=new DefaultTableModel();
        
       String[] columnas = {"Id de Cliente","Nombre","Seg Nombre","Apellido","Seg Apellido","Telefono","Dirección"};
       
        modelo.setColumnIdentifiers(columnas);
        for (Clientes  clien:cliente){
            
             String[]renglon = {Integer.toString(clien.getCodcli()),clien.getNomb1(),clien.getNomb2(),clien.getApell1(),clien.getApell2(),clien.getNumcelu(),clien.getDirec()};
               
                 modelo.addRow(renglon);

             }
                 
             
        tablacliente.setModel(modelo);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtextFieldPrimerNomb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextAClientes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextDClientes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtextfieldIDclientes = new javax.swing.JTextField();
        BtngC = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        TextNu = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldSegunNomb = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldsegunapell = new javax.swing.JTextField();
        jToolBar2 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacliente = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Id de Cliente");

        jLabel3.setText("Nombre");

        jtextFieldPrimerNomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextFieldPrimerNombActionPerformed(evt);
            }
        });

        jLabel4.setText("Apellido");

        jLabel5.setText("Telefono ");

        jLabel6.setText("Dirección");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Detalles de Clientes  :");

        jtextfieldIDclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextfieldIDclientesActionPerformed(evt);
            }
        });

        BtngC.setBackground(new java.awt.Color(0, 153, 51));
        BtngC.setForeground(new java.awt.Color(255, 255, 255));
        BtngC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save white.png"))); // NOI18N
        BtngC.setText("Guardar");
        BtngC.setToolTipText("");
        BtngC.setBorder(null);
        BtngC.setBorderPainted(false);
        BtngC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtngCActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edit white bold.png"))); // NOI18N
        jButton2.setText(" Editar");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Delete white 2.png"))); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.setBorder(null);

        jLabel9.setText("Segundo Nombre");

        jTextFieldSegunNomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSegunNombActionPerformed(evt);
            }
        });

        jLabel10.setText("Segundo Apellido");

        jToolBar2.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar2.setBorder(null);
        jToolBar2.setRollover(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Lista de Clientes ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(391, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jToolBar2.add(jPanel2);

        tablacliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, "", null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id de Cliente", "Nombre", "Seg Nombre", "Apellido", "Seg Apellido", "Telefono", "Dirección"
            }
        ));
        jScrollPane1.setViewportView(tablacliente);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(BtngC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TextDClientes, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtextfieldIDclientes, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtextFieldPrimerNomb, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldSegunNomb, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TextAClientes, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldsegunapell, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TextNu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2))
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtextfieldIDclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtextFieldPrimerNomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSegunNomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextAClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(2, 2, 2)
                        .addComponent(jTextFieldsegunapell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextDClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtngC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(437, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtextFieldPrimerNombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextFieldPrimerNombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextFieldPrimerNombActionPerformed

    private void BtngCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtngCActionPerformed
//buton guardar       
String cedula = jtextfieldIDclientes.getText();
        String nomb1 = jtextFieldPrimerNomb.getText();
        String nomb2= jTextFieldSegunNomb.getText();
        String  apell1=TextAClientes.getText();
        String  apell2=jTextFieldsegunapell.getText();
        String  numcelu= TextNu.getText();
        String  direc= TextDClientes.getText();
        

        if(nomb1.contentEquals("")||nomb2.contentEquals("")||
            direc.contentEquals("")||numcelu.contentEquals("")||
            apell1.contentEquals("")||apell2.contentEquals("")){
            JOptionPane.showMessageDialog(rootPane, "Todos los campos son obligatorio");
        }else{
            try{

                Clientes cl =new DAOCliente().insertar(WIDTH, nomb1, nomb2, apell1, apell2, numcelu, direc);
                JOptionPane.showMessageDialog(rootPane, "Registro agregado");

            }catch (Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se agrego el registro");
            }
}

        obtenerDatos();
        limpiarCampos();

    }//GEN-LAST:event_BtngCActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtextfieldIDclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextfieldIDclientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextfieldIDclientesActionPerformed

    private void jTextFieldSegunNombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSegunNombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSegunNombActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtngC;
    private javax.swing.JTextField TextAClientes;
    private javax.swing.JTextField TextDClientes;
    private javax.swing.JTextField TextNu;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldSegunNomb;
    private javax.swing.JTextField jTextFieldsegunapell;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTextField jtextFieldPrimerNomb;
    private javax.swing.JTextField jtextfieldIDclientes;
    private javax.swing.JTable tablacliente;
    // End of variables declaration//GEN-END:variables
}
