package dominios2826502.ejercicio4;

import java.time.LocalDate;
import java.time.Period;


public class Viaje {

    LocalDate fechaInicio;
    LocalDate FechaFin;
    
    //crear un metodo que imprima
    //la duracion del viaje
    // dada la fecha de inicio y fin
    //ingresadas como inputs

    public void calcularDuracionViaje(
        LocalDate fechaInicio , 
        LocalDate fechaFin

    )
    {
        //aignar las fechas parametros
        //a los atributos del viaje
        this.fechaInicio = fechaInicio;
        this.FechaFin = fechaFin;
        Period diferencia = Period.between(fechaInicio,
                            fechaFin);
        System.out.println("duracion del viaje:" +
                            diferencia.getDays() +
                            "dias");       
    }

    //sobrecarga del metodo calcularDuracion:
    public int calcularDuracionViaje(){
        Period diferencia = Period.between(fechaInicio,
                             FechaFin);
        return diferencia.getDays();
    }

}
