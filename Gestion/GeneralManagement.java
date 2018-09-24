
package Gestion;

import logic.structure.DoubleLinkedList;

public class GeneralManagement<X> {
  
    private DoubleLinkedList <X> ManagedList;

    public DoubleLinkedList<X> getManagedList() {
        return ManagedList;
    }

    public void setManagedList(DoubleLinkedList<X> ManagedList) {
        this.ManagedList = ManagedList;
    }

    @Override
    public String toString() {
        return "GeneralManagement{" + "ManagedList=" + ManagedList + '}';
    }

    public GeneralManagement() {
        this.ManagedList = new DoubleLinkedList<>();
    }
    public void add (X elemento){
        this.ManagedList.insert(elemento);
    }
    public void consult (X elemento){
        this.ManagedList.consult(elemento);
    }
    public void modify (X oldElement,X newElement){
        this.ManagedList.update(oldElement,newElement);
    }
    public void delete (X elemento){
        this.ManagedList.Delete(elemento);
    }
}
    

