package dominios2826502.ejPaises;



public class PruebaEjPaises {

    public static void main(String[] args) {
        //crear paises

        Pais pais1 = new Pais();
        Pais p1 = new Pais();

        p1.nombre = "Colombia";

        Pais p2 = new Pais();
        p2.nombre = "Venezuela";

        Pais p3 = new Pais();
        p3.nombre = "Peru";

        //crear Ciudad

        Ciudad ciudad1 = new Ciudad();
        ciudad1.nombre = "Bogota";

        Ciudad ciudad2 = new Ciudad();
        ciudad2.nombre = "Caracas";

        Ciudad ciudad3 = new Ciudad();
        ciudad3.nombre = "meta";

        Ciudad ciudad4 = new Ciudad();
        ciudad4.nombre = "metasd";

        Ciudad ciudad5 = new Ciudad();
        ciudad5.nombre = "pero";

        Ciudad ciudad6 = new Ciudad();
        ciudad6.nombre = "metfbf";

        Ciudad ciudad7 = new Ciudad();
        ciudad7.nombre = "metrhhtr";

        Ciudad ciudad8 = new Ciudad();
        ciudad8.nombre = "gurg";

        //crear ruta

        
        Ruta r1 = new Ruta();
        r1.numero = 655345;

        Ruta r2 = new Ruta();
        r2.numero = 6554775;

        Ruta r3 = new Ruta();
        r3.numero = 655345;

        pais1.listaCiudades.add(ciudad1);
        p2.listaCiudades.add(ciudad2);
        p3.listaCiudades.add(ciudad1);
        p1.listaRutas.add(r1);
        p2.listaRutas.add(r2);
        p3.listaRutas.add(r3);

        

    
    
                      
        System.out.println("nombre pais" +
                                p1.nombre);
            
        for( Ciudad ciudadRecorrer : p2.listaCiudades){
             System.out.println("Ciudad recorrida:" + ciudadRecorrer.nombre);
        }

        for( Ruta rutaRecorrer : p1.listaRutas){
            System.out.println("Ruta recorrida:" + rutaRecorrer.numero);
       }

       for( Ruta rutaRecorrer : p2.listaRutas){
        System.out.println("Ruta recorrida:" + rutaRecorrer.numero);
   }

    
   for( Ruta rutaRecorrer : p3.listaRutas){
    System.out.println("Ruta recorrida:" + rutaRecorrer.numero);
}

    

    }

}
