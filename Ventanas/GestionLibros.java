
package Ventanas;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import logic.business.library.Libro;
import logic.business.book.BookManagement;
import logic.business.book.EnumCategorias;
import logic.structure.DoubleLinkedList;
import logic.structure.LinkedList;
import logic.structure.LinkedListNode;
import logic.business.library.Library;
import logic.business.library.LibraryManagement;
import logic.structure.DoubleLinkedNode;
import Gestion.GeneralManagement;
        
public class GestionLibros extends javax.swing.JFrame {
    
    
    DoubleLinkedList<Libro> Libros;
    DoubleLinkedList<Library> Librerias; 
    GeneralManagement Manage= new GeneralManagement();
    
    

    
    public GestionLibros() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Gestión de Libros"); 
        }

    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Consultar = new javax.swing.JButton();
        libreria = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        EntradaID = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        entradaNombre = new javax.swing.JTextField();
        tema = new javax.swing.JLabel();
        Descripcion = new javax.swing.JLabel();
        decripEntrada = new javax.swing.JTextField();
        CantVend = new javax.swing.JLabel();
        VendEntrada = new javax.swing.JTextField();
        CantDisp = new javax.swing.JLabel();
        DispEntrada = new javax.swing.JTextField();
        Precio = new javax.swing.JLabel();
        EntradaPrecio = new javax.swing.JTextField();
        FotoLabel = new javax.swing.JLabel();
        Eliminar = new javax.swing.JButton();
        Crear = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        LibreriaEnt = new javax.swing.JTextField();
        EntTema = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

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
        getContentPane().add(Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 110, 30));

        libreria.setText("Librería:");
        getContentPane().add(libreria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        ID.setText("Issn del Libro:");
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));
        getContentPane().add(EntradaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 90, -1));

        Nombre.setText("Nombre:");
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));
        getContentPane().add(entradaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 90, -1));

        tema.setText("Tema:");
        getContentPane().add(tema, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        Descripcion.setText("Descripción:");
        getContentPane().add(Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 70, 20));
        getContentPane().add(decripEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 150, 20));

        CantVend.setText("Cantidad Vendida:");
        getContentPane().add(CantVend, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        VendEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(VendEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 90, -1));

        CantDisp.setText("Cantidad Disponible:");
        getContentPane().add(CantDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));
        getContentPane().add(DispEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 90, -1));

        Precio.setText("Precio:");
        getContentPane().add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));
        getContentPane().add(EntradaPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 90, -1));
        getContentPane().add(FotoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, 20));

        Eliminar.setBackground(new java.awt.Color(0, 0, 0));
        Eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("Eliminar");
        Eliminar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                EliminarMouseDragged(evt);
            }
        });
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 110, 30));

        Crear.setBackground(new java.awt.Color(0, 0, 0));
        Crear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Crear.setForeground(new java.awt.Color(255, 255, 255));
        Crear.setText("Crear");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });
        getContentPane().add(Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, 30));

        Modificar.setBackground(new java.awt.Color(0, 0, 0));
        Modificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Modificar.setForeground(new java.awt.Color(255, 255, 255));
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, 30));

        jLabel1.setText("Ingrese los datos necesarios para la acción que desea realizar y luego seleccione el botón de  la acción");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(460, 410));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Librería", "ID", "Nombre", "Tema", "Cantidad Vendida", "Cantidad Disponible", "Precio", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 550, 90));
        getContentPane().add(LibreriaEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 90, -1));
        getContentPane().add(EntTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 90, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo4.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        // TODO add your handling code here:
        //Library Libreria = EntradaLibreria.getSelectedItem();
        
        
        
        
        
    }//GEN-LAST:event_ConsultarActionPerformed
    
    private void VendEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VendEntradaActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        int IDent = Integer.parseInt(EntradaID.getText());
        //LinkedListNode<Book> temp = Libros.Delete(IDent);
        //Book Libro2 = temp.getElement()
       
                
        
        
        
        
    }//GEN-LAST:event_EliminarActionPerformed

    private void EliminarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarMouseDragged

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        // TODO add your handling code here:
        String Issn= EntradaID.getText();
        String LibreriaNueva= LibreriaEnt.getText();
        String TemaNuevo= EntTema.getText();
        String NombreNuevo= entradaNombre.getText();
        int VendNuevo= Integer.parseInt(VendEntrada.getText());
        int DispNuevo= Integer.parseInt(DispEntrada.getText());
        int PrecioNuevo= Integer.parseInt(EntradaPrecio.getText());
        String DescNueva= decripEntrada.getText();
        
        Libro NuevoElemento= new Libro(Issn,TemaNuevo, DescNueva,VendNuevo, DispNuevo, PrecioNuevo);
        /*NuevoElemento.setIssn(Issn);
        NuevoElemento.setLibreria(LibreriaNueva);
        NuevoElemento.setnombre(NombreNuevo);
        NuevoElemento.settema(TemaNuevo);
        NuevoElemento.setCantidadVendida(VendNuevo);
        NuevoElemento.setCantidadDisponible(DispNuevo);
        NuevoElemento.setdescripcion(DescNueva);
        NuevoElemento.setprecio(PrecioNuevo);*/
        
        //Libros.insert(NuevoElemento);
        this.setVisible(false);
        VentanaExito obj= new VentanaExito();
        obj.setVisible(true);
    }//GEN-LAST:event_CrearActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        String Issn= EntradaID.getText();
        String LibreriaNueva= LibreriaEnt.getText();
        EnumCategorias TemaNuevo= (EnumCategorias) EntTema.getSelectedItem();
        String NombreNuevo= entradaNombre.getText();
        int VendNuevo= Integer.parseInt(VendEntrada.getText());
        int DispNuevo= Integer.parseInt(DispEntrada.getText());
        int PrecioNuevo= Integer.parseInt(EntradaPrecio.getText());
        String DescNueva= decripEntrada.getText();
        
        Libro NuevoElemento= new Libro(NombreNuevo,TemaNuevo,DescNueva,VendNuevo,DispNuevo,PrecioNuevo);

        
        
        DoubleLinkedNode<Libro> temp = Libros.getHead();
        Libro Elemento = temp.getElement();
        String IssnComp= Elemento.getIssn();
        while (!Issn.equals(IssnComp)){
            temp.getNext();
        }
        Libro Elemento2=temp.getElement();
        
        Libros.Delete(Elemento2);
        Libros.insert(NuevoElemento);
        
        
    }//GEN-LAST:event_ModificarActionPerformed

    /*public void ComboLib() {
        EL2.removeAllItems();
        EL2.addItem("Buscar Libreria");
        //JPanel panel = new JPanel(); 
        //if (Librerias.getSize() == 0) {
           // JOptionPane.showMessageDialog(panel, "Actualmente no hay librerías disponibles.", "Error", JOptionPane.ERROR_MESSAGE);
        //} 
        //else {
        int cont = 0;
        int Tamaño;
        Tamaño = Librerias.getSize();
        while (cont <= Tamaño) {
            Library temp =Librerias.Position(cont);
            EL2.addItem(temp.getName().toUpperCase());
            cont++;
            
        }
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CantDisp;
    private javax.swing.JLabel CantVend;
    private javax.swing.JButton Consultar;
    private javax.swing.JButton Crear;
    private javax.swing.JLabel Descripcion;
    private javax.swing.JTextField DispEntrada;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField EntTema;
    private javax.swing.JTextField EntradaID;
    private javax.swing.JTextField EntradaPrecio;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FotoLabel;
    private javax.swing.JLabel ID;
    private javax.swing.JTextField LibreriaEnt;
    private javax.swing.JButton Modificar;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Precio;
    private javax.swing.JTextField VendEntrada;
    private javax.swing.JTextField decripEntrada;
    private javax.swing.JTextField entradaNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel libreria;
    private javax.swing.JLabel tema;
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
            new GestionLibros().setVisible(true);
        });
    }
}

