
package logic.business.library;
import logic.structure.DoubleLinkedList;
import Servicios.CodeGenerator;

public class Library {
    
    //crea los atributos de las librerias
    private String dni,name, country, location;
    private int phoneNumber;
    private String Horario;
    private CodeGenerator generadorCodigos;
    

    
    //crea los getters and setters de todos los satributos
    public String getDni(){
        return dni;
    }
    public void SetDni(String dni){
        this.dni = dni;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHorary() {
        return Horario;
    }

    public void setHorary(String Horario) {
        this.Horario = Horario;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

   
    //constructor que crea las librerias de con todos los atributos
    public Library(String name, String country, String location, int phoneNumber, String Horario) {
        this.generadorCodigos = new CodeGenerator(5);
        this.dni= "Li"+ generadorCodigos.toString();
        this.name = name;
        this.country = country;
        this.location = location;
        this.Horario = Horario;
        this.phoneNumber = phoneNumber;
        
    }

    //muestra todos los los atributos de la libreria
    @Override
    public String toString() {
        return "Library{" + "name=" + name + ", country=" + country + ", location=" + location + ", horary=" + Horario + ", phoneNumber=" + phoneNumber  + '}';
    }

}
    

