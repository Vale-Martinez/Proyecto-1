
package logic.business.book;
import logic.structure.DoubleLinkedList;
import logic.business.library.Libro;
import logic.structure.DoubleLinkedNode;
import logic.structure.LinkedList;
import logic.structure.LinkedListNode;
import logic.structure.Queue;
import logic.structure.Stack;

public class BusquedaFiltros {

    private LinkedList ListaBusqueda = new LinkedList();
    DoubleLinkedList<Libro> Libros;
    public LinkedList getListaBusqueda() {
        return ListaBusqueda;
    }

    
    public void setListaBusqueda(LinkedList ListaBusqueda) {
        this.ListaBusqueda = ListaBusqueda;
    }
    
   

    
    
    public void FiltroLib(String FiltroLibreria1){
        DoubleLinkedNode<Libro> temp = Libros.getHead();
        Libro Elemento = temp.getElement();
        String LibreriaComp=Elemento.getLibreria();
        if (LibreriaComp.equals(FiltroLibreria1)){
            getListaBusqueda().insert(temp);}
        else{
            temp.getNext();
        }
        
        
    }
    public void FiltroNom(String FiltroNombre){
        
        DoubleLinkedNode<Libro> temp = Libros.getHead();
        Libro Elemento = temp.getElement();
        String NombreComp=Elemento.getnombre();
        if (NombreComp.equals(FiltroNombre)){
            getListaBusqueda().insert(temp);}
        else{
            temp.getNext();
        }         
    }
    public void FiltroTema(EnumCategorias FiltroTema1){
        DoubleLinkedNode<Libro> temp = Libros.getHead();
        Libro Elemento = temp.getElement();
        EnumCategorias TemaComp=Elemento.gettema();
        if (TemaComp==FiltroTema1){
            getListaBusqueda().insert(temp);}
        else{
            temp.getNext();
        }         
    }
    public void FiltroPrecio(int FiltroPrecio){
        DoubleLinkedNode<Libro> temp = Libros.getHead();
        Libro Elemento = temp.getElement();
        int PrecioComp= Elemento.getprecio();
        if (PrecioComp==FiltroPrecio){
            getListaBusqueda().insert(temp);}
        else{
            temp.getNext();
        }         
    }
    public void FiltroLibyNom(String FiltroLibreria1, String FiltroNombre){
        DoubleLinkedNode<Libro> temp = Libros.getHead();
        Libro Elemento = temp.getElement();
        String LibreriaComp=Elemento.getLibreria();
        String NombreComp=Elemento.getnombre();
        if (LibreriaComp.equals(FiltroLibreria1)&& NombreComp.equals(FiltroNombre)){
            getListaBusqueda().insert(temp);}
        else{
            temp.getNext();
        }    
    }
    public void FiltroLibyTema(String FiltroLibreria1, EnumCategorias FiltroTema1){
        DoubleLinkedNode<Libro> temp=Libros.getHead();
        Libro Elemento = temp.getElement();
        String LibreriaComp= Elemento.getLibreria();
        EnumCategorias TemaComp= Elemento.gettema();
        if (LibreriaComp.equals(FiltroLibreria1) && TemaComp==FiltroTema1){
             getListaBusqueda().insert(temp);}
        
        else{
            temp.getNext();
        }
    }
    public void FiltroLibNomyTema(String FiltroLibreria1, EnumCategorias FiltroTema1, String FiltroNombre){
        DoubleLinkedNode<Libro> temp=Libros.getHead();
        Libro Elemento = temp.getElement();
        String LibreriaComp= Elemento.getLibreria();
        String NombreComp=Elemento.getnombre();
        EnumCategorias TemaComp= Elemento.gettema();
        if (LibreriaComp.equals(FiltroLibreria1) && TemaComp==FiltroTema1 && NombreComp.equals(FiltroNombre)){
             getListaBusqueda().insert(temp);}
        else{
            temp.getNext();
        }
    }
    public void FiltroLibyPrec(String FiltroLibreria1,int FiltroPrecio ){
        DoubleLinkedNode<Libro> temp=Libros.getHead();
        Libro Elemento = temp.getElement();
        String LibreriaComp= Elemento.getLibreria();
        int PrecioComp= Elemento.getprecio();
        if (LibreriaComp.equals(FiltroLibreria1)&&PrecioComp==FiltroPrecio){
            getListaBusqueda().insert(temp);}
        else{
            temp.getNext();
        }
    }
    public void FiltroNomyTema(String FiltroNombre, EnumCategorias FiltroTema1){
        DoubleLinkedNode<Libro> temp=Libros.getHead();
        Libro Elemento = temp.getElement();
        String NombreComp=Elemento.getnombre();
        EnumCategorias TemaComp= Elemento.gettema();
        if (TemaComp==FiltroTema1 && NombreComp.equals(FiltroNombre)){
             getListaBusqueda().insert(temp);}
        else{
            temp.getNext();
        }
    }
    public void FiltroNomyPrecio(String FiltroNombre,int FiltroPrecio ){
        DoubleLinkedNode<Libro> temp=Libros.getHead();
        Libro Elemento = temp.getElement();
        String NombreComp=Elemento.getnombre();
        int PrecioComp= Elemento.getprecio();
        if (NombreComp.equals(FiltroNombre)&&PrecioComp==FiltroPrecio){
            getListaBusqueda().insert(temp);}
        else{
            temp.getNext();
        }
    }
    public void FiltroNomTemayPrecio(String FiltroNombre,int FiltroPrecio, EnumCategorias FiltroTema1 ){
        DoubleLinkedNode<Libro> temp=Libros.getHead();
        Libro Elemento = temp.getElement();
        String NombreComp=Elemento.getnombre();
        int PrecioComp= Elemento.getprecio();
        EnumCategorias TemaComp= Elemento.gettema();
        if (NombreComp.equals(FiltroNombre)&&TemaComp==FiltroTema1 &&PrecioComp==FiltroPrecio){
            getListaBusqueda().insert(temp);}
        else{
            temp.getNext();
        }
    }
    public void FiltroLibNomyPrecio(String FiltroLibreria1, String FiltroNombre,int FiltroPrecio){
        DoubleLinkedNode<Libro> temp=Libros.getHead();
        Libro Elemento = temp.getElement();
        String LibreriaComp= Elemento.getLibreria();
        String NombreComp=Elemento.getnombre();
        int PrecioComp= Elemento.getprecio();
        if (NombreComp.equals(FiltroNombre)&&LibreriaComp.equals(FiltroLibreria1)&&PrecioComp==FiltroPrecio){
            getListaBusqueda().insert(temp);}
        else{
            temp.getNext();
        }
    }
    public void FiltroTemaLibyPrecio(String FiltroLibreria1,int FiltroPrecio,EnumCategorias FiltroTema1 ){
        DoubleLinkedNode<Libro> temp=Libros.getHead();
        Libro Elemento = temp.getElement();
        String LibreriaComp= Elemento.getLibreria();
        int PrecioComp= Elemento.getprecio();
        EnumCategorias TemaComp= Elemento.gettema();
        if (LibreriaComp.equals(FiltroLibreria1)&&TemaComp==FiltroTema1 &&PrecioComp==FiltroPrecio){
            getListaBusqueda().insert(temp);}
        else{
            temp.getNext();
        }
    }
    public void FiltroTemayPrecio(int FiltroPrecio,EnumCategorias FiltroTema1 ){
        DoubleLinkedNode<Libro> temp=Libros.getHead();
        Libro Elemento = temp.getElement();
        int PrecioComp= Elemento.getprecio();
        EnumCategorias TemaComp= Elemento.gettema();
        if (TemaComp==FiltroTema1 &&PrecioComp==FiltroPrecio){
            getListaBusqueda().insert(temp);}
        else{
            temp.getNext();
        }
    }
    public void Historial() {
        int size = getListaBusqueda().getSize();
        LinkedListNode<Libro> temp = getListaBusqueda().getHead();
        Libro Elemento =temp.getElement();
        Queue<Libro> ColaHistorial= new Queue<>();
        for (int i = 0; i < size; i++) {
            ColaHistorial.enqueue(Elemento);
        }
    }
}
