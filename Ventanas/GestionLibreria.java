package Ventanas;

import Servicios.CodeGenerator;
import Gestion.GeneralManagement;
import logic.business.library.Horario;
import logic.business.library.Library;
import logic.structure.DoubleLinkedList;

public class GestionLibreria extends javax.swing.JFrame {

    GeneralManagement<Library> Librerias;
    //DoubleLinkedList<Library> Librerias;

    public GestionLibreria() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Gestion de Librerias");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Consultar = new javax.swing.JButton();
        ID = new javax.swing.JLabel();
        Entradapais = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        entradaNombre = new javax.swing.JTextField();
        Ubicacion = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        entradaUbic = new javax.swing.JTextField();
        Horario = new javax.swing.JLabel();
        EntradaTelef = new javax.swing.JTextField();
        EntradaHorario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Consultar.setBackground(new java.awt.Color(0, 0, 0));
        Consultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Consultar.setForeground(new java.awt.Color(255, 255, 255));
        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 110, 30));

        ID.setText("País:");
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        Entradapais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradapaisActionPerformed(evt);
            }
        });
        getContentPane().add(Entradapais, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 200, -1));

        Nombre.setText("Nombre:");
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        entradaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNombreActionPerformed(evt);
            }
        });
        getContentPane().add(entradaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 200, -1));

        Ubicacion.setText("Ubicación:");
        getContentPane().add(Ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        Telefono.setText("Teléfono:");
        getContentPane().add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, 20));
        getContentPane().add(entradaUbic, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 200, 40));

        Horario.setText("Horario:");
        getContentPane().add(Horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        getContentPane().add(EntradaTelef, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 200, 20));

        EntradaHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaHorarioActionPerformed(evt);
            }
        });
        getContentPane().add(EntradaHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 200, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 100, 110, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 150, 110, 30));

        jLabel1.setText("Ingrese los datos necesarios para la acción que desea realizar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 470, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo4.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        // TODO add your handling code here:
        Librerias.consult(elemento);

    }//GEN-LAST:event_ConsultarActionPerformed

    private void EntradaHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaHorarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Librerias.delete(elemento);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EntradapaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradapaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradapaisActionPerformed

    private void entradaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNombreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String NombreLib = entradaNombre.getText();
        String nombrePais = Entradapais.getText();
        String ubicacion = entradaUbic.getText();
        int telefono = Integer.parseInt(EntradaTelef.getText());
        String Horario = EntradaHorario.getText();
        Library NuevaLibreria = new Library(NombreLib, nombrePais, ubicacion, telefono, Horario);
        Librerias.add(NuevaLibreria);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private javax.swing.JTextField EntradaHorario;
    private javax.swing.JTextField EntradaTelef;
    private javax.swing.JTextField Entradapais;
    private javax.swing.JLabel Horario;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel Ubicacion;
    private javax.swing.JTextField entradaNombre;
    private javax.swing.JTextField entradaUbic;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GestionLibreria().setVisible(true);

        });
    }
}
