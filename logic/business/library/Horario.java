
package logic.business.library;
import java.sql.Date;
import logic.structure.DoubleLinkedList;

public class Horario {
    
    private int horaEntrada, horaSalida;
    private int minutosEntrada, minutosSalida;
    private DoubleLinkedList<Date> festivos;

    
    public int getHoraEntrada() {
        return horaEntrada;
    }

   
    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

   
    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    
    public int getMinutosEntrada() {
        return minutosEntrada;
    }

   
    public void setMinutosEntrada(int minutosEntrada) {
        this.minutosEntrada = minutosEntrada;
    }

 
    public int getMinutosSalida() {
        return minutosSalida;
    }

    public void setMinutosSalida(int minutosSalida) {
        this.minutosSalida = minutosSalida;
    }

   
    public DoubleLinkedList<Date> getFestivos() {
        return festivos;
    }

    
    public void setFestivos(DoubleLinkedList<Date> festivos) {
        this.festivos = festivos;
    }
    @Override
    public String toString(){
        return "Horario [Hora de Entrada="+ horaEntrada + ",horaSalida="+ horaSalida + ",minutos de Entrada="+ minutosEntrada + "minutos de Salida="+minutosSalida +"]";
        
        
    }
    public String toStringFestivos(){
        return festivos.toString();
    }
    public Horario(int horaEntrada,int minutosEntrada, int HoraSalida, int minutosSalida){
        this.festivos = new DoubleLinkedList<>();
        this.horaEntrada = horaEntrada;
        this.horaSalida = HoraSalida;
        this.minutosEntrada= minutosEntrada;
        this.minutosSalida = minutosSalida;
    }
}
