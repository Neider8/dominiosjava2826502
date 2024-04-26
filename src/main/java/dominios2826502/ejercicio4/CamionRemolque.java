package dominios2826502.ejercicio4;

public class CamionRemolque extends Vehiculo {
    
    Integer capacidadCargaExtra;
    String descripcion;

    //crear un metodo que permite
    //calcular el total de carga maxima
    //soportado en los camiones con remolque
    //declaracion de metodo

    public Integer calcularTotalCarga(){
        Integer totalCarga = capacidadCargaExtra +
                        capacidadCargaExtra;
        return totalCarga;
    }

}
