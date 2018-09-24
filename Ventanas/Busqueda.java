
package Ventanas;


import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import logic.structure.DoubleLinkedList;
import logic.business.library.Libro;
import logic.structure.DoubleLinkedNode;
import logic.structure.LinkedList;
import logic.business.book.BusquedaFiltros;
import logic.business.book.EnumCategorias;
import logic.business.library.Library;


public class Busqueda extends javax.swing.JFrame {
    
    LinkedList ListaBusqueda = new LinkedList();
    DoubleLinkedList<Libro> Libros;
    DoubleLinkedList<Library> Librerias;
    BusquedaFiltros Filtros = new BusquedaFiltros();
    

  
    public Busqueda() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Busqueda por Filtro");
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo1 = new javax.swing.JLabel();
        FiltroLib = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        FiltroNom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FiltroPrec = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        FiltroTema = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaBusqueda = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        FiltroLibreria = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Titulo1.setText("Busqueda");
        getContentPane().add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 100, 20));

        FiltroLib.setText("Librería:");
        getContentPane().add(FiltroLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, -1));
        getContentPane().add(FiltroNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 150, -1));

        jLabel2.setText("Tema:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel3.setText("Precio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        FiltroPrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroPrecActionPerformed(evt);
            }
        });
        getContentPane().add(FiltroPrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 150, -1));

        Buscar.setBackground(new java.awt.Color(0, 0, 0));
        Buscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        FiltroTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniería", "Administración", "Ciencias Naturales", "Artes", "Historia", "Matemáticas", "Ficción", "Literatura" }));
        getContentPane().add(FiltroTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 150, -1));

        TablaBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Libros"
            }
        ));
        jScrollPane1.setViewportView(TablaBusqueda);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 350, 480));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Historial de Libros"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 220, 190));
        getContentPane().add(FiltroLibreria, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 150, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo4.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FiltroPrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroPrecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltroPrecActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        
        String FiltroLibreria1 =FiltroLibreria.getText();
        String FiltroNombre = FiltroNom.getText();
        Object FiltroTema2 = FiltroTema.getSelectedItem();
        EnumCategorias FiltroTema1= (EnumCategorias) FiltroTema2;
        int FiltroPrecio = Integer.parseInt(FiltroPrec.getText());
        if (FiltroLibreria1.equals("") && FiltroNombre.equals("") &&((FiltroTema1!=EnumCategorias.ADMINISTRACION) || (FiltroTema1!=EnumCategorias.ARTES) || (FiltroTema1!=EnumCategorias.CIENCIASNATURALES)
                ||(FiltroTema1!=EnumCategorias.FICCION) || (FiltroTema1!=EnumCategorias.HISTORIA)||(FiltroTema1!=EnumCategorias.INGENIERIA)
                ||(FiltroTema1!=EnumCategorias.LITERATURA)||(FiltroTema1!=EnumCategorias.MATEMATICAS)) && (FiltroPrecio) == 0) {
            //Ventana de error
        } 
        else if ((FiltroNombre.equals(""))&&((FiltroTema1!=EnumCategorias.ADMINISTRACION) || (FiltroTema1!=EnumCategorias.ARTES) || (FiltroTema1!=EnumCategorias.CIENCIASNATURALES)
                ||(FiltroTema1!=EnumCategorias.FICCION) || (FiltroTema1!=EnumCategorias.HISTORIA)||(FiltroTema1!=EnumCategorias.INGENIERIA)
                ||(FiltroTema1!=EnumCategorias.LITERATURA)||(FiltroTema1!=EnumCategorias.MATEMATICAS))&& (FiltroPrecio==0)){
            
            for (DoubleLinkedNode<Libro> temp = Libros.getHead();temp != Libros.getTail();temp.getNext()){
                Libro Elemento = temp.getElement();
                String LibreriaComp=Elemento.getLibreria();
                if (LibreriaComp.equals(FiltroLibreria1)){
                    meter(Elemento);
                    
                }
            }
        }
        else if (((FiltroTema1!=EnumCategorias.ADMINISTRACION) || (FiltroTema1!=EnumCategorias.ARTES) || (FiltroTema1!=EnumCategorias.CIENCIASNATURALES)
                ||(FiltroTema1!=EnumCategorias.FICCION) || (FiltroTema1!=EnumCategorias.HISTORIA)||(FiltroTema1!=EnumCategorias.INGENIERIA)
                ||(FiltroTema1!=EnumCategorias.LITERATURA)||(FiltroTema1!=EnumCategorias.MATEMATICAS))&& (FiltroPrecio==0)){
            for (DoubleLinkedNode<Libro> temp = Libros.getHead();temp != Libros.getTail();temp.getNext()){
                Libro Elemento = temp.getElement();
                String LibreriaComp=Elemento.getLibreria();
                String NombreComp=Elemento.getnombre();
                if(LibreriaComp.equals(FiltroLibreria1)&& NombreComp.equals(FiltroNombre)){
                    meter(Elemento);
                }
            }
        }
        
        else if ((FiltroNombre.equals(""))&& (FiltroPrecio==0)){
            for (DoubleLinkedNode<Libro> temp = Libros.getHead();temp != Libros.getTail();temp.getNext()){
                Libro Elemento = temp.getElement();
                String LibreriaComp=Elemento.getLibreria();
                EnumCategorias TemaComp= Elemento.gettema();
                if(LibreriaComp.equals(FiltroLibreria1) && TemaComp==FiltroTema1){
                    meter(Elemento);
                }
            }
        }
        //LIBNOMYTEMA
        else if (FiltroPrecio==0){
            for (DoubleLinkedNode<Libro> temp = Libros.getHead();temp != Libros.getTail();temp.getNext()){
                Libro Elemento = temp.getElement();
                String LibreriaComp=Elemento.getLibreria();
                EnumCategorias TemaComp= Elemento.gettema();
                String NombreComp=Elemento.getnombre();
                if(LibreriaComp.equals(FiltroLibreria1) && TemaComp==FiltroTema1 && NombreComp.equals(FiltroNombre)){
                    meter(Elemento);
                }
            }
        }
        //LIBYPrecio
        else if ((FiltroNombre.equals(""))&&((FiltroTema1!=EnumCategorias.ADMINISTRACION) || (FiltroTema1!=EnumCategorias.ARTES) || (FiltroTema1!=EnumCategorias.CIENCIASNATURALES)
                ||(FiltroTema1!=EnumCategorias.FICCION) || (FiltroTema1!=EnumCategorias.HISTORIA)||(FiltroTema1!=EnumCategorias.INGENIERIA)
                ||(FiltroTema1!=EnumCategorias.LITERATURA)||(FiltroTema1!=EnumCategorias.MATEMATICAS))){
            for (DoubleLinkedNode<Libro> temp = Libros.getHead();temp != Libros.getTail();temp.getNext()){
                Libro Elemento = temp.getElement();
                String LibreriaComp=Elemento.getLibreria();
                int PrecioComp= Elemento.getprecio();
                if(LibreriaComp.equals(FiltroLibreria1)&&PrecioComp==FiltroPrecio){
                    meter(Elemento);
                }
            }
        }
        //Nombre
        else if ((FiltroLibreria1.equals(""))&&((FiltroTema1!=EnumCategorias.ADMINISTRACION) || (FiltroTema1!=EnumCategorias.ARTES) || (FiltroTema1!=EnumCategorias.CIENCIASNATURALES)
                ||(FiltroTema1!=EnumCategorias.FICCION) || (FiltroTema1!=EnumCategorias.HISTORIA)||(FiltroTema1!=EnumCategorias.INGENIERIA)
                ||(FiltroTema1!=EnumCategorias.LITERATURA)||(FiltroTema1!=EnumCategorias.MATEMATICAS))&& (FiltroPrecio==0)){
            for (DoubleLinkedNode<Libro> temp = Libros.getHead();temp != Libros.getTail();temp.getNext()){
                Libro Elemento = temp.getElement();
                String NombreComp=Elemento.getnombre();
                if(NombreComp.equals(FiltroNombre)){
                    meter(Elemento);
                }
            }
        }
        //NomyTema    
        else if ((FiltroLibreria1.equals(""))&& (FiltroPrecio==0)){
            for (DoubleLinkedNode<Libro> temp = Libros.getHead();temp != Libros.getTail();temp.getNext()){
                Libro Elemento = temp.getElement();
                String NombreComp=Elemento.getnombre();
                EnumCategorias TemaComp= Elemento.gettema();
                if(TemaComp==FiltroTema1 && NombreComp.equals(FiltroNombre)){
                    meter(Elemento);
                }
            }    
            
        }
        //NomyPrecio
        else if ((FiltroLibreria1.equals(""))&&((FiltroTema1!=EnumCategorias.ADMINISTRACION) || (FiltroTema1!=EnumCategorias.ARTES) || (FiltroTema1!=EnumCategorias.CIENCIASNATURALES)
                ||(FiltroTema1!=EnumCategorias.FICCION) || (FiltroTema1!=EnumCategorias.HISTORIA)||(FiltroTema1!=EnumCategorias.INGENIERIA)
                ||(FiltroTema1!=EnumCategorias.LITERATURA)||(FiltroTema1!=EnumCategorias.MATEMATICAS))){
            for (DoubleLinkedNode<Libro> temp = Libros.getHead();temp != Libros.getTail();temp.getNext()){
                Libro Elemento = temp.getElement();
                String NombreComp=Elemento.getnombre();
                int PrecioComp= Elemento.getprecio();
                if(NombreComp.equals(FiltroNombre)&&PrecioComp==FiltroPrecio){
                    meter(Elemento);
                }
            }
        }
        //NomTemayPrecio
        else if ((FiltroLibreria1.equals(""))){
            for (DoubleLinkedNode<Libro> temp = Libros.getHead();temp != Libros.getTail();temp.getNext()){
                Libro Elemento = temp.getElement();
                String NombreComp=Elemento.getnombre();
                int PrecioComp= Elemento.getprecio();
                EnumCategorias TemaComp= Elemento.gettema();
                if(NombreComp.equals(FiltroNombre)&&TemaComp==FiltroTema1 &&PrecioComp==FiltroPrecio){
                    meter(Elemento);
                }
            }
        }
        //LibNomyPrecio
        else if ((FiltroTema1!=EnumCategorias.ADMINISTRACION) || (FiltroTema1!=EnumCategorias.ARTES) || (FiltroTema1!=EnumCategorias.CIENCIASNATURALES)
                ||(FiltroTema1!=EnumCategorias.FICCION) || (FiltroTema1!=EnumCategorias.HISTORIA)||(FiltroTema1!=EnumCategorias.INGENIERIA)
                ||(FiltroTema1!=EnumCategorias.LITERATURA)||(FiltroTema1!=EnumCategorias.MATEMATICAS)){
            for (DoubleLinkedNode<Libro> temp = Libros.getHead();temp != Libros.getTail();temp.getNext()){
                Libro Elemento = temp.getElement();
                String NombreComp=Elemento.getnombre();
                int PrecioComp= Elemento.getprecio();
                String LibreriaComp=Elemento.getLibreria();
                if(NombreComp.equals(FiltroNombre)&&LibreriaComp.equals(FiltroLibreria1)&&PrecioComp==FiltroPrecio){
                    meter(Elemento);
                }
            }
        }
        //Tema
        else if ((FiltroLibreria1.equals(""))&& (FiltroNombre.equals("")) && (FiltroPrecio==0)){
            for (DoubleLinkedNode<Libro> temp = Libros.getHead();temp != Libros.getTail();temp.getNext()){
                Libro Elemento = temp.getElement();
                EnumCategorias TemaComp= Elemento.gettema();
                if(TemaComp==FiltroTema1){
                    meter(Elemento);
                }
            }
        }
        //TemaLibyPrecio
        else if ((FiltroNombre.equals(""))){
            for (DoubleLinkedNode<Libro> temp = Libros.getHead();temp != Libros.getTail();temp.getNext()){
                Libro Elemento = temp.getElement();
                EnumCategorias TemaComp= Elemento.gettema();
                int PrecioComp= Elemento.getprecio();
                String LibreriaComp=Elemento.getLibreria();
                if(LibreriaComp.equals(FiltroLibreria1)&&TemaComp==FiltroTema1 &&PrecioComp==FiltroPrecio){
                    meter(Elemento);
                }
            }
        }
        //TemaPrecio
        else if ((FiltroLibreria1.equals(""))&& (FiltroNombre.equals(""))){
            for (DoubleLinkedNode<Libro> temp = Libros.getHead();temp != Libros.getTail();temp.getNext()){
                Libro Elemento = temp.getElement();
                EnumCategorias TemaComp= Elemento.gettema();
                int PrecioComp= Elemento.getprecio();
                if(TemaComp==FiltroTema1 &&PrecioComp==FiltroPrecio){
                    meter(Elemento);
                }
            }
        }
        //Precio
        else if ((FiltroLibreria1.equals(""))&& (FiltroNombre.equals("")) && ((FiltroTema1!=EnumCategorias.ADMINISTRACION) || (FiltroTema1!=EnumCategorias.ARTES) || (FiltroTema1!=EnumCategorias.CIENCIASNATURALES)
                ||(FiltroTema1!=EnumCategorias.FICCION) || (FiltroTema1!=EnumCategorias.HISTORIA)||(FiltroTema1!=EnumCategorias.INGENIERIA)
                ||(FiltroTema1!=EnumCategorias.LITERATURA)||(FiltroTema1!=EnumCategorias.MATEMATICAS))){
            for (DoubleLinkedNode<Libro> temp = Libros.getHead();temp != Libros.getTail();temp.getNext()){
                Libro Elemento = temp.getElement();
                int PrecioComp= Elemento.getprecio();
                if(PrecioComp==FiltroPrecio){
                    meter(Elemento);
                }
            }
        }
        
    }//GEN-LAST:event_BuscarActionPerformed
    public void meter(Libro Elemento){
        
        DefaultTableModel model = (DefaultTableModel)TablaBusqueda.getModel();
        model.addRow(new Object[]{Elemento.getnombre(), String.valueOf(Elemento.getIssn()),Elemento.gettema()
                ,String.valueOf(Elemento.getprecio()),String.valueOf(Elemento.getCantidadDisponible()),
                String.valueOf(Elemento.getCantidadVendida()),Elemento.getdescripcion()});

    }
    /*public void IngresarLibs(){
        DoubleLinkedNode<Library> temp= Librerias.getHead();
        Library Elemento=temp.getElement();
        DefaultComboBoxModel model = (DefaultComboBoxModel)FiltroLibreria.getModel();
        while(temp!=Librerias.getTail()){
            model.addElement(Elemento.getName());
            temp.getNext();
            
        }
        
    }*/


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Busqueda().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel FiltroLib;
    private javax.swing.JTextField FiltroLibreria;
    private javax.swing.JTextField FiltroNom;
    private javax.swing.JTextField FiltroPrec;
    private javax.swing.JComboBox<String> FiltroTema;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTable TablaBusqueda;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
