
package logic.business.library;

import java.awt.Image;
import logic.structure.DoubleLinkedList;
import Servicios.CodeGenerator;
import logic.business.book.EnumCategorias;


public class Libro {
     //Atributos de la clase
   
    private int CantidadVendida, CantidadDisponible, precio;
    private String Issn, nombre, descripcion, libreria;
    private String tema;
    private CodeGenerator generadorCodigos;

   

  
    

    public String  getIssn(){
            return Issn;}

    public void setIssn(String Issn){
            this.Issn =Issn;}

    public int getCantidadVendida(){
            return CantidadVendida;}

    public void setCantidadVendida(int CantidadVendida){
            this.CantidadVendida =CantidadVendida;}

    public int getCantidadDisponible(){
            return CantidadDisponible;}

    public void setCantidadDisponible(int CantidadDisponible){
            this.CantidadDisponible =CantidadDisponible;}

    public int getprecio(){
            return precio;}

    public void setprecio(int precio){
            this.precio =precio;}

    public String getnombre(){
            return nombre;}

    public void setnombre(String nombre){
            this.nombre=nombre;}

    public String gettema(){
            return tema;}

    public void settema(String tema){
            this.tema=tema;}

    public String getdescripcion(){
            return descripcion;}

    public void setdescripcion(String descripcion){
            this.descripcion=descripcion;}
    
    public String getLibreria(){
        return libreria;}
    
    public void setLibreria(String libreria){
        this.libreria = libreria;
    }
   


   
    public Libro(String nombre,String tema,  String descripcion,int CantidadVendida, int CantidadDisponible, int precio ){
            this.generadorCodigos = new CodeGenerator(5);
            this.Issn = generadorCodigos.generateCode();
            this.CantidadVendida = CantidadVendida;
            this.CantidadDisponible = CantidadDisponible;
            this.precio = precio;
            this.nombre = nombre;
            this.tema = tema;
            this.descripcion = descripcion;
            
    }
    
            
          
    @Override
    public String toString(){
        return "Book{"+ "ID:"+Issn+ ", CantidadVendida:" +CantidadVendida+ ", CantidadDisponible:" +CantidadDisponible+ ", Precio:" +precio + ", Nombre:" 
                + nombre + ", Tema:" + tema + ", Decripcion:" + descripcion +"}";
        
                
    }
    
}
