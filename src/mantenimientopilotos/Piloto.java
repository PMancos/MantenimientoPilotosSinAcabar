

package mantenimientopilotos;

import java.io.Serializable;
import java.util.Comparator;




public class Piloto implements Serializable,Comparable <Piloto>{
    
   private String escuderia;
   private String nombre;
   private int numPremios;
   private boolean actividad;
    
   

    public Piloto(String escuderia, String nombre, int numPremios, boolean actividad) {
        this.escuderia = escuderia;
        this.nombre = nombre;
        this.numPremios = numPremios;
        this.actividad = actividad;
        
    }
    //GETTER Y SETTERS
    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPremios() {
        return numPremios;
    }

    public void setNumPremios(int numPremios) {
        this.numPremios = numPremios;
    }

    public boolean isActividad() {
        return actividad;
    }

    public void setActividad(boolean actividad) {
        this.actividad = actividad;
    }

    @Override
    public String toString() {
        return "Escuderia: " + escuderia + "\tNombre: " + nombre + "\nNúmero Premios Ganados: " + numPremios + "\tEstá activo? " + actividad;
    }

    @Override
    public int compareTo(Piloto o) {
       return this.getNombre().compareToIgnoreCase(o.getNombre());
    }

    

    

    

    

    

   

   
    
    
    
    
}
