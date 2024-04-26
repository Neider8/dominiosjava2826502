package dominios2826502.ejercicio4;

import java.time.LocalDate;

public class Prueba {

    public static void main(String[] args) {

        //crear una instancia de Vehiculo:
        Vehiculo vehiculo1 = new Vehiculo(53115L, true, 69);


        //crear un objeto viaje
        Viaje v = new Viaje();
        v.fechaInicio = LocalDate.of(2024, 4, 4);
        v.FechaFin = LocalDate.of(2024, 4, 4);
        //invocacion: llama
        v.calcularDuracionViaje(LocalDate.of(2024, 4, 4),
                                LocalDate.of(2024, 4, 6));

        //invacacion de la sobrecarga
        System.out.println("Duracion en dias del viaje:" +
                        v.calcularDuracionViaje());
        
        //instanciar un ejemplar
        // de cada tipo de vehiculo

        Camion c1 = new Camion();
        c1.estaDisponible = true;

        //establecer el viaje
        //del camion:

        CamionRemolque cr1 = 
                new CamionRemolque();
        cr1.capacidadCargaExtra = 9;
        cr1.capacidadCarga = 10;

        //invocar el metodo creado
        Integer totalCarga = cr1.calcularTotalCarga();
        System.out.println("total carga:" + totalCarga);

        System.out.println("El viaje del camion:" + 
                            "tiene fecha de inicio:" + 
                            v.fechaInicio);

        System.out.println("El viaje del camion:" + 
                            "tiene fecha fin:" + 
                            v.FechaFin);
    }

}
