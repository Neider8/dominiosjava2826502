package dominios2826502.ejercicio4;

public class Vehiculo {

    Long codigo;
    Boolean estaDisponible;
    Integer capacidadCarga;

    //constructorn por defecto
    //no tiene parametros
    public Vehiculo() {
        System.out.println("ingreso al constructor" +
                        "por defecto");

    }

    public Vehiculo(Long codigo,
                     Boolean estaDisponible,
                     Integer capacidadCarga) {
        this.codigo = codigo;
        this.estaDisponible = estaDisponible;
        this.capacidadCarga = capacidadCarga;
    }

}
