
package Ventanas;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        setTitle("MenuPrincipal");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GesLibros = new javax.swing.JButton();
        GesLibre = new javax.swing.JButton();
        Busqueda = new javax.swing.JButton();
        Pedidos = new javax.swing.JButton();
        AtencionPed = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GesLibros.setBackground(new java.awt.Color(0, 51, 102));
        GesLibros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GesLibros.setForeground(new java.awt.Color(255, 255, 255));
        GesLibros.setText("Gestión de Libros");
        GesLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GesLibrosActionPerformed(evt);
            }
        });
        getContentPane().add(GesLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 250, 40));

        GesLibre.setBackground(new java.awt.Color(0, 51, 102));
        GesLibre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GesLibre.setForeground(new java.awt.Color(255, 255, 255));
        GesLibre.setText("Gestión de Librerias");
        GesLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GesLibreActionPerformed(evt);
            }
        });
        getContentPane().add(GesLibre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 250, 40));

        Busqueda.setBackground(new java.awt.Color(0, 51, 102));
        Busqueda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Busqueda.setForeground(new java.awt.Color(255, 255, 255));
        Busqueda.setText("Busqueda de Libros Disponibles");
        Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaActionPerformed(evt);
            }
        });
        getContentPane().add(Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 250, 40));

        Pedidos.setBackground(new java.awt.Color(0, 51, 102));
        Pedidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Pedidos.setForeground(new java.awt.Color(255, 255, 255));
        Pedidos.setText("Pedidos de Libros");
        getContentPane().add(Pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 250, 40));

        AtencionPed.setBackground(new java.awt.Color(0, 51, 102));
        AtencionPed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AtencionPed.setForeground(new java.awt.Color(255, 255, 255));
        AtencionPed.setText("Atención de Pedidos");
        getContentPane().add(AtencionPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 250, 40));

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Festividades Próximas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 250, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menú");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 200, 50));

        JLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMenu2.jpg"))); // NOI18N
        getContentPane().add(JLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 474));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GesLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GesLibrosActionPerformed
        GestionLibros obj= new GestionLibros();
        obj.setVisible(true);
    }//GEN-LAST:event_GesLibrosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GesLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GesLibreActionPerformed
        // TODO add your handling code here:
        GestionLibreria obj= new GestionLibreria();
        obj.setVisible(true);
    }//GEN-LAST:event_GesLibreActionPerformed

    private void BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaActionPerformed
        // TODO add your handling code here:
        Busqueda obj= new Busqueda();
        obj.setVisible(true);
    }//GEN-LAST:event_BusquedaActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtencionPed;
    private javax.swing.JButton Busqueda;
    private javax.swing.JButton GesLibre;
    private javax.swing.JButton GesLibros;
    private javax.swing.JLabel JLabelFondo;
    private javax.swing.JButton Pedidos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
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
        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(() -> {
        new Interfaz().setVisible(true);
        });
        }*/
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Interfaz().setVisible(true);
        });
    }

    
    }   


