package dominios2826502.ejPaises;

import java.util.ArrayList;
import java.util.List;


public class Pais {

    String nombre;

    List<Ciudad> listaCiudades = 
                new ArrayList<Ciudad>();

    List<Ruta> listaRutas = 
                new ArrayList<Ruta>();

    public Pais() {
    }

    public Pais(String nombre, List<Ciudad> listaCiudades, List<Ruta> listaRutas) {
        this.nombre = nombre;
        this.listaCiudades = listaCiudades;
        this.listaRutas = listaRutas;
    }

    


}
