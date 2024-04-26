package dominios2826502.ejercicio2;

public class PruebaEjercicio2 {

    public static void main(String[] args) {

        
        //Crear 2 instancias de cada Entidad
        //Instanciar 2 veces cada Entidad
        //Crear 2 objetos de cada Entidad
        //1. Nombre de la clase a Instanciar
        //2. nombre del objeto(identificador)
        //3. operador de asignacion
        //4. palabra(referencia) new
        //5. otra vez, el nombre de la clase
        //6. parentesis(Constructor)
        Hospital hospital1 = new Hospital();
        Hospital h1 = new Hospital();

        //acceder a los atributos del objeto:
        // operador .
        //1. Identificador del objeto
        //2. el punto
        //3. el atributo a trabajar
        //4. el operador de asignacion
        //5. el valor a asignar al atributo
        hospital1.direccion = "Caracas con 52";
        h1.nombre = "Neider";
        h1.telefono = 4454555L;

        //crear 3 Medicos

        Medico medico1 = new Medico();
        medico1.nombre="Carlos Rodriguez";
        medico1.cedula=(String) "1112125L";
    


        //añadir medicos al hospital
        hospital1.listaMedicos.add(medico1);
        

        //recorrer lista de medicos
        //
        for( Medico medicoRecorrer : hospital1.listaMedicos){
            System.out.println("Medico:" + medicoRecorrer.cedula);
        }

 

    }

}
