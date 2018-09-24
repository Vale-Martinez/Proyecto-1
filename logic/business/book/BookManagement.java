
package logic.business.book;
import java.awt.Image;
import logic.structure.DoubleLinkedList;
import logic.structure.LinkedListNode;
import logic.business.library.Libro;

public class BookManagement {
    //Creamos la lista de libros
    
    private DoubleLinkedList<Libro> Libros;
    /*private LinkedListNode<Book> Libro;
    private Object Libro1;
    private int IDComp;*/
    
    
    //gets y sets de la lista
    
    public DoubleLinkedList<Libro> getLibros(){
        return Libros;
    }
    public void setLibros(DoubleLinkedList<Libro> Libros){
        this.Libros = Libros;
    }
    //Constructor
    public BookManagement(){
        this.Libros = new LinkedList<>();
    }
    public void Crear(int ID, int CantidadVendida, int CantidadDisponible, int precio,String nombre, String tema, String descripcion, Image imagen){
        Book nuevoLibro = new Book(ID, CantidadVendida, CantidadDisponible, precio, nombre, tema, descripcion, imagen);
        this.Libros.insert(nuevoLibro);
        
    }
    public void delete(int entID){
        if (Libros.getSize()==0){
            System.out.println("Lista vacía");
        }
        LinkedListNode<Book> temp = Libros.getHead();
        Book Libro2 = temp.getElement();
        IDComp= Libro2.getID();
        if (IDComp==entID){
            temp.setNextNode(temp);}
        else{
            temp.getNextNode();        
    }
         
    }
    public String Consultar(){
        return Libros.toString();
    }
    public void Modificar(){
       //codigodemodificar
    }
    
}